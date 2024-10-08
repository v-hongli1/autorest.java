// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.typespec.http.client.generator.mgmt.template;

import com.microsoft.typespec.http.client.generator.core.extension.model.codemodel.CodeModel;
import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaClass;
import com.microsoft.typespec.http.client.generator.core.model.javamodel.JavaFile;
import com.microsoft.typespec.http.client.generator.mgmt.FluentGen;
import com.microsoft.typespec.http.client.generator.mgmt.FluentGenAccessor;
import com.microsoft.typespec.http.client.generator.mgmt.TestUtils;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.FluentStatic;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.Client;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.ClientMethod;
import com.microsoft.typespec.http.client.generator.core.template.ClientMethodTemplate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Stream;

public class ClientMethodTemplateTests {

    private static FluentGenAccessor fluentgenAccessor;

    @BeforeAll
    public static void ensurePlugin() {
        FluentGen fluentgen = new TestUtils.MockFluentGen();
        fluentgenAccessor = new FluentGenAccessor(fluentgen);
    }

    @ParameterizedTest
    @MethodSource("clientMethodTemplateSupplier")
    public void testClientMethodTemplate(List<ClientMethod> lockMethodGroupClientMethods, String methodName,
        String includeString) {
        Optional<ClientMethod> clientMethod = lockMethodGroupClientMethods.stream()
            .filter(m -> m.getName().equals(methodName))
            .findFirst();
        Assertions.assertTrue(clientMethod.isPresent());

        if (includeString != null) {
            ClientMethodTemplate template = FluentClientMethodTemplate.getInstance();
            JavaFile javaFile = new JavaFile("dummy");
            template.write(clientMethod.get(), new JavaClass(javaFile.getContents()));
            String content = javaFile.getContents().toString();
            Assertions.assertTrue(content.contains(includeString),
                String.format("Expected content not found: '%s'\nMethod content:\n%s", includeString, content));
        }
    }

    static Stream<Arguments> clientMethodTemplateSupplier() {
        CodeModel codeModel = TestUtils.loadCodeModel(fluentgenAccessor, "code-model-fluentnamer-locks.yaml");
        Client client = FluentStatic.getClient();

        List<ClientMethod> lockMethodGroupClientMethods = client.getServiceClient().getMethodGroupClients()
            .stream()
            .filter(c -> c.getClassBaseName().startsWith("ManagementLocks"))
            .findFirst()
            .orElseThrow(() -> new NoSuchElementException("Unable to find class 'ManagementLocks'."))
            .getClientMethods();

        return Stream.of(
            Arguments.of(lockMethodGroupClientMethods, "listByScopeAsync",
                "private PagedFlux<ManagementLockObjectInner> listByScopeAsync(String scope"),

            Arguments.of(lockMethodGroupClientMethods, "listByScope",
                "public PagedIterable<ManagementLockObjectInner> listByScope(String scope"),

            Arguments.of(lockMethodGroupClientMethods, "listByScopeSinglePageAsync", null),

            Arguments.of(lockMethodGroupClientMethods, "listByScopeNextSinglePageAsync", null),

            Arguments.of(lockMethodGroupClientMethods, "createOrUpdateByScopeWithResponseAsync",
                "private Mono<Response<ManagementLockObjectInner>> createOrUpdateByScopeWithResponseAsync(String scope"),

            Arguments.of(lockMethodGroupClientMethods, "createOrUpdateByScopeWithResponse",
                "public Response<ManagementLockObjectInner> createOrUpdateByScopeWithResponse(String scope"),

            Arguments.of(lockMethodGroupClientMethods, "createOrUpdateByScopeAsync",
                "private Mono<ManagementLockObjectInner> createOrUpdateByScopeAsync(String scope"),

            Arguments.of(lockMethodGroupClientMethods, "createOrUpdateByScope",
                "public ManagementLockObjectInner createOrUpdateByScope(String scope")
        );
    }
}
