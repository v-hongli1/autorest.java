// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest;

import com.azure.autorest.extension.base.model.codemodel.CodeModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * test entry for preprocessor
 */
public class PreprocessorTests {

    @Test
    public void processTest() {
        MockPreprocessor preprocessor = new MockPreprocessor();
        // SOURCE SWAGGER URL: https://github.com/Azure/azure-rest-api-specs/blob/main/specification/containerregistry/data-plane/Azure.ContainerRegistry/stable/2021-07-01/containerregistry.json
        // It's a debug file from the output of modelerfour during the generate process where it converts swagger definition into code model.
        // This file can be obtained by calling generate commands from `generate` or `generate.bat` on the swagger json, it will appear under this project by the name 'code-model.yaml'.
        String codeModelFileName = "containerregistry-code-model.yaml";

        //1.
        CodeModel codeModel = preprocessor.loadCodeModel(codeModelFileName);

        Assertions.assertEquals(codeModel.getOperationGroups().size(), 3);
        Assertions.assertTrue(
            codeModel.getOperationGroups().stream().anyMatch(operationGroup -> operationGroup.get$key().equals("ContainerRegistryBlob"))
            && codeModel.getOperationGroups().stream().anyMatch(operationGroup -> operationGroup.get$key().equals("ContainerRegistry"))
            && codeModel.getOperationGroups().stream().anyMatch(operationGroup -> operationGroup.get$key().equals("Authentication"))
        );
        Assertions.assertEquals(codeModel.getOperationGroups().get(0).getOperations().size(), 15);
        Assertions.assertEquals(codeModel.getOperationGroups().get(1).getOperations().size(), 11);
        Assertions.assertEquals(codeModel.getOperationGroups().get(2).getOperations().size(), 3);

        //2.
        codeModel = preprocessor.transform(codeModel);

        // additional 3 pagination operations
        Assertions.assertEquals(codeModel.getOperationGroups().get(0).getOperations().size(), 18);
        Assertions.assertTrue(
            codeModel.getOperationGroups().stream().flatMap(operationGroup -> operationGroup.getOperations().stream()).anyMatch(operation -> "getRepositoriesNext".equals(operation.get$key()))
                && codeModel.getOperationGroups().stream().flatMap(operationGroup -> operationGroup.getOperations().stream()).anyMatch(operation -> "getTagsNext".equals(operation.get$key()))
                && codeModel.getOperationGroups().stream().flatMap(operationGroup -> operationGroup.getOperations().stream()).anyMatch(operation -> "getManifestsNext".equals(operation.get$key()))
        );

        //3.
        String output = preprocessor.dump(codeModel);
    }

}
