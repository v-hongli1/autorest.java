// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluentnamer;

import com.azure.autorest.extension.base.jsonrpc.Connection;
import com.azure.autorest.extension.base.model.codemodel.CodeModel;
import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.extension.base.plugin.NewPlugin;
import com.azure.autorest.extension.base.plugin.PluginLogger;
import com.azure.autorest.extension.base.util.FileUtils;
import com.azure.autorest.fluent.namer.FluentNamerFactory;
import com.azure.autorest.fluent.transformer.FluentTransformer;
import com.azure.autorest.fluent.util.FluentJavaSettings;
import com.azure.autorest.preprocessor.Preprocessor;
import com.azure.autorest.preprocessor.tranformer.Transformer;
import com.azure.autorest.util.CodeNamer;
import org.slf4j.Logger;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.inspector.TrustedTagInspector;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Representer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class FluentNamer extends Preprocessor {

    private final Logger logger;
    private static FluentNamer instance;

    public FluentNamer(NewPlugin plugin, Connection connection, String pluginName, String sessionId) {
        super(plugin, connection, pluginName, sessionId);
        this.logger = new PluginLogger(this, FluentNamer.class);
        FluentNamer.instance = this;
    }

    public static FluentNamer getPluginInstance() {
        return instance;
    }

    public CodeModel processCodeModel() {
        this.clear();

        try {

            Path codeModelFolder;
            try {
                codeModelFolder = FileUtils.createTempDirectory("code-model" + UUID.randomUUID());
                logger.info("Created temp directory for code model: {}", codeModelFolder);
            } catch (IOException ex) {
                logger.error("Failed to create temp directory for code model.", ex);
                throw new RuntimeException("Failed to create temp directory for code model.", ex);
            }

            CodeModel codeModel = getCodeModelAndWriteToTargetFolder(codeModelFolder);
            // Do necessary transformation
            codeModel = transform(codeModel);
            // Write to local file (for debugging)
            Yaml newYaml = createYaml();
            String output = newYaml.dump(codeModel);

            // Output updated code model
            Files.writeString(codeModelFolder.resolve("code-model-fluentnamer-no-tags.yaml"), output);

            return codeModel;
        } catch (Exception e) {
            logger.error("Failed to successfully run fluentnamer plugin.", e);
            throw new RuntimeException("Failed to successfully run fluentnamer plugin.", e);
        }
    }

    protected CodeModel getCodeModelAndWriteToTargetFolder(Path codeModelFolder) throws IOException {
        List<String> files = listInputs().stream().filter(s -> s.contains("no-tags")).collect(Collectors.toList());
        if (files.size() != 1) {
            throw new RuntimeException(String
                .format("Generator received incorrect number of inputs: %s : %s}", files.size(), String.join(", ", files)));
        }
        // Read input file
        String file = readFile(files.get(0));
        // Write the input code model file to a local code model file to help debugging
        Files.writeString(codeModelFolder.resolve("code-model.yaml"), file);
        // Deserialize the input code model string to CodeModel object
        CodeModel codeModel = loadCodeModel(file);
        return codeModel;
    }

    private CodeModel loadCodeModel(String file) throws com.fasterxml.jackson.core.JsonProcessingException {
        CodeModel codeModel;
        if (!file.startsWith("{")) {
            codeModel = yamlMapper.loadAs(file, CodeModel.class);
        } else {
            codeModel = jsonMapper.readValue(file, CodeModel.class);
        }
        return codeModel;
    }

    private Yaml createYaml() {
        Representer representer = new Representer(new DumperOptions()) {
            @Override
            protected NodeTuple representJavaBeanProperty(Object javaBean, Property property, Object propertyValue,
                                                          Tag customTag) {
                // if value of property is null, ignore it.
                if (propertyValue == null) {
                    return null;
                } else {
                    return super.representJavaBeanProperty(javaBean, property, propertyValue, customTag);
                }
            }
        };
        LoaderOptions loaderOptions = new LoaderOptions();
        loaderOptions.setCodePointLimit(50 * 1024 * 1024);
        loaderOptions.setMaxAliasesForCollections(Integer.MAX_VALUE);
        loaderOptions.setNestingDepthLimit(Integer.MAX_VALUE);
        loaderOptions.setTagInspector(new TrustedTagInspector());
        return new Yaml(new Constructor(loaderOptions), representer, new DumperOptions(), loaderOptions);
    }

    public CodeModel transform(CodeModel codeModel) {
        logger.info("Load fluent settings");
        FluentJavaSettings fluentJavaSettings = new FluentJavaSettings(this);
        CodeNamer.setFactory(new FluentNamerFactory(fluentJavaSettings));

        // Step 2: Transform
        logger.info("Transform code model");
        FluentTransformer transformer = new FluentTransformer(fluentJavaSettings);
        codeModel = transformer.preTransform(codeModel);

        codeModel = new Transformer().transform(codeModel);

        codeModel = transformer.postTransform(codeModel);

        return codeModel;
    }

    private void clear() {
        JavaSettings.clear();
    }
}
