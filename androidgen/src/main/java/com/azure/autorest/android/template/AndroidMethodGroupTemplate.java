package com.azure.autorest.android.template;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.model.clientmodel.*;
import com.azure.autorest.model.javamodel.JavaFile;
import com.azure.autorest.model.javamodel.JavaVisibility;
import com.azure.autorest.template.MethodGroupTemplate;
import com.azure.autorest.template.Templates;
import com.azure.autorest.util.ClientModelUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AndroidMethodGroupTemplate extends MethodGroupTemplate {
    private static AndroidMethodGroupTemplate _instance = new AndroidMethodGroupTemplate();

    protected AndroidMethodGroupTemplate() {
    }

    public static AndroidMethodGroupTemplate getInstance() {
        return _instance;
    }

    @Override
    public void write(MethodGroupClient methodGroupClient, JavaFile javaFile) {
        JavaSettings settings = JavaSettings.getInstance();
        Set<String> imports = new HashSet<String>();
        if (settings.shouldClientLogger()) {
            ClassType.ClientLogger.addImportsTo(imports, false);
        }

        methodGroupClient.addImportsTo(imports, true, settings);

        String serviceClientPackageName =
                ClientModelUtil.getServiceClientPackageName(methodGroupClient.getServiceClientName());
        imports.add(String.format("%1$s.%2$s", serviceClientPackageName, methodGroupClient.getServiceClientName()));
        imports.add("com.azure.android.core.internal.util.serializer.SerializerFormat");

        javaFile.declareImport(imports);

        List<String> interfaces = methodGroupClient.getSupportedInterfaces().stream()
                .map(IType::toString).collect(Collectors.toList());
        interfaces.addAll(methodGroupClient.getImplementedInterfaces());
        String parentDeclaration = !interfaces.isEmpty() ? String.format(" implements %1$s", String.join(", ", interfaces)) : "";

        final JavaVisibility visibility = methodGroupClient.getPackage().equals(serviceClientPackageName)
                ? JavaVisibility.PackagePrivate
                : JavaVisibility.Public;

        javaFile.javadocComment(settings.getMaximumJavadocCommentWidth(), comment ->
        {
            comment.description(String.format("An instance of this class provides access to all the operations defined in %1$s.", methodGroupClient.getInterfaceName()));
        });
        javaFile.publicFinalClass(String.format("%1$s%2$s", methodGroupClient.getClassName(), parentDeclaration), classBlock ->
        {
            if (settings.shouldClientLogger()) {
                classBlock.privateFinalMemberVariable(ClassType.ClientLogger.toString(), String.format("logger = new ClientLogger(%1$s.class)", methodGroupClient.getClassName()));
            }

            classBlock.javadocComment(String.format("The proxy service used to perform REST calls."));
            classBlock.privateFinalMemberVariable(methodGroupClient.getProxy().getName(), "service");

            classBlock.javadocComment("The service client containing this operation class.");
            classBlock.privateFinalMemberVariable(methodGroupClient.getServiceClientName(), "client");

            classBlock.javadocComment(comment ->
            {
                comment.description(String.format("Initializes an instance of %1$s.", methodGroupClient.getClassName()));
                comment.param("client", "the instance of the service client containing this operation class.");
            });
            classBlock.constructor(visibility, String.format("%1$s(%2$s client)", methodGroupClient.getClassName(), methodGroupClient.getServiceClientName()), constructor ->
            {
                constructor.line("this.client = client;");
                if (methodGroupClient.getProxy() != null) {
                    constructor.line(String.format("this.service = this.client.getServiceClient().getRetrofit().create(%s.class);",
                            methodGroupClient.getProxy().getName()));
                }
            });

            Templates.getProxyTemplate().write(methodGroupClient.getProxy(), classBlock);

            for (ClientMethod clientMethod : methodGroupClient.getClientMethods()) {
                Templates.getClientMethodTemplate().write(clientMethod, classBlock);

                ClientMethodType clientMethodType = clientMethod.getType();
                if (clientMethodType == ClientMethodType.PagingAsync
                        && clientMethod.getMethodPageDetails().getNextMethod() != null
                        && !clientMethod.getOnlyRequiredParameters()) {
                    AsyncPageRetrieverTemplate asyncPageRetrieverTemplate = new AsyncPageRetrieverTemplate(clientMethod,
                            clientMethod.getMethodPageDetails().getNextMethod(), methodGroupClient.getClassName());
                    asyncPageRetrieverTemplate.write(classBlock);

                    if (settings.getSyncMethods() == JavaSettings.SyncMethodsGeneration.ALL) {
                        PageResponseRetrieverTemplate pageResponseRetrieverTemplate = new PageResponseRetrieverTemplate(clientMethod,
                                clientMethod.getMethodPageDetails().getNextMethod(), methodGroupClient.getClassName());
                        pageResponseRetrieverTemplate.write(classBlock);

                        PageRetrieverTemplate pageRetrieverTemplate = new PageRetrieverTemplate(clientMethod,
                                clientMethod.getMethodPageDetails().getNextMethod(), methodGroupClient.getClassName());
                        pageRetrieverTemplate.write(classBlock);
                    }
                }
            }
        });
    }
}
