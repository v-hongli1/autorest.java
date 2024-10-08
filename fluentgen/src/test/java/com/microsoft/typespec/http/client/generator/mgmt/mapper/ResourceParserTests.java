// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.typespec.http.client.generator.mgmt.mapper;

import com.microsoft.typespec.http.client.generator.core.extension.model.codemodel.CodeModel;
import com.microsoft.typespec.http.client.generator.mgmt.FluentGen;
import com.microsoft.typespec.http.client.generator.mgmt.FluentGenAccessor;
import com.microsoft.typespec.http.client.generator.mgmt.TestUtils;
import com.microsoft.typespec.http.client.generator.mgmt.model.arm.ModelCategory;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.FluentCollectionMethod;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.FluentResourceCollection;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.FluentResourceModel;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.FluentStatic;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.fluentmodel.create.ResourceCreate;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.fluentmodel.delete.ResourceDelete;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.fluentmodel.get.ResourceRefresh;
import com.microsoft.typespec.http.client.generator.mgmt.model.clientmodel.fluentmodel.update.ResourceUpdate;
import com.microsoft.typespec.http.client.generator.core.model.clientmodel.Client;
import com.azure.core.http.HttpMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ResourceParserTests {

    private static FluentGenAccessor fluentgenAccessor;

    @BeforeAll
    public static void ensurePlugin() {
        FluentGen fluentgen = new TestUtils.MockFluentGen();
        fluentgenAccessor = new FluentGenAccessor(fluentgen);
    }

    @Test
    public void testResourceCreate() {
        CodeModel codeModel = TestUtils.loadCodeModel(fluentgenAccessor, "code-model-fluentnamer-locks.yaml");
        Client client = FluentStatic.getClient();

        List<FluentResourceModel> fluentModels =
                codeModel.getSchemas().getObjects().stream()
                        .map(o -> FluentResourceModelMapper.getInstance().map(o))
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());

        List<FluentResourceCollection> fluentCollections =
                codeModel.getOperationGroups().stream()
                        .map(og -> FluentResourceCollectionMapper.getInstance().map(og))
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());

        FluentResourceModel lockModel = fluentModels.stream()
                .filter(m -> m.getName().equals("ManagementLockObject"))
                .findFirst().get();

        FluentResourceCollection lockCollection = fluentCollections.stream()
                .filter(c -> c.getInnerGroupClient().getClassBaseName().startsWith("ManagementLocks"))
                .findFirst().get();

        // test findResourceCreateForCategory
        {
            Map<String, FluentResourceModel> fluentModelMapByName = fluentModels.stream()
                    .collect(Collectors.toMap(m -> m.getInterfaceType().toString(), Function.identity()));

            // RESOURCE_GROUP_AS_PARENT
            Map<FluentResourceModel, ResourceCreate> resourceCreateMap =
                    ResourceParser.findResourceCreateForCategory(lockCollection, fluentModelMapByName, client.getModels(), Collections.emptySet(), ModelCategory.RESOURCE_GROUP_AS_PARENT);

            Assertions.assertEquals(1, resourceCreateMap.size());
            ResourceCreate resourceCreate = resourceCreateMap.values().iterator().next();

            Assertions.assertEquals("createOrUpdateAtResourceGroupLevel", resourceCreate.getMethodName());
            Assertions.assertTrue(resourceCreate.getUrlPathSegments().hasSubscription());
            Assertions.assertTrue(resourceCreate.getUrlPathSegments().hasResourceGroup());
            Assertions.assertFalse(resourceCreate.getUrlPathSegments().isNested());

            // SCOPE_AS_PARENT
            resourceCreateMap =
                    ResourceParser.findResourceCreateForCategory(lockCollection, fluentModelMapByName, client.getModels(), Collections.emptySet(), ModelCategory.SCOPE_AS_PARENT);

            Assertions.assertEquals(1, resourceCreateMap.size());
            resourceCreate = resourceCreateMap.values().iterator().next();

            Assertions.assertEquals("createOrUpdateByScope", resourceCreate.getMethodName());
            Assertions.assertTrue(resourceCreate.getUrlPathSegments().hasScope());
            Assertions.assertFalse(resourceCreate.getUrlPathSegments().isNested());

            // SUBSCRIPTION_AS_PARENT
            resourceCreateMap =
                    ResourceParser.findResourceCreateForCategory(lockCollection, fluentModelMapByName, client.getModels(), Collections.emptySet(), ModelCategory.SUBSCRIPTION_AS_PARENT);

            Assertions.assertEquals(1, resourceCreateMap.size());
            resourceCreate = resourceCreateMap.values().iterator().next();

            Assertions.assertEquals("createOrUpdateAtSubscriptionLevel", resourceCreate.getMethodName());

            // NESTED_CHILD, not available in locks
            resourceCreateMap =
                    ResourceParser.findResourceCreateForCategory(lockCollection, fluentModelMapByName, client.getModels(), Collections.emptySet(), ModelCategory.NESTED_CHILD);

            Assertions.assertTrue(resourceCreateMap.isEmpty());
        }

        // test resolveResourceCreate
        List<ResourceCreate> resourceCreates = ResourceParser.resolveResourceCreate(lockCollection, fluentModels, client.getModels());
        Assertions.assertEquals(1, resourceCreates.size());

        ResourceCreate lockCreate = resourceCreates.iterator().next();

        Assertions.assertEquals(lockCollection, lockCreate.getResourceCollection());
        Assertions.assertEquals(lockModel, lockCreate.getResourceModel());
        Assertions.assertEquals(ModelCategory.RESOURCE_GROUP_AS_PARENT, lockCreate.getResourceModel().getCategory());

        Assertions.assertEquals(1, lockCollection.getResourceCreates().size());
        Assertions.assertEquals(lockCreate, lockCollection.getResourceCreates().iterator().next());

        Assertions.assertEquals(lockCreate, lockModel.getResourceCreate());

        List<FluentCollectionMethod> methodReferences = lockCreate.getMethodReferences();
        Assertions.assertEquals(2, methodReferences.size());
        Assertions.assertTrue(methodReferences.iterator().next().getMethodName().startsWith("createOrUpdateAtResourceGroupLevel"));
        Assertions.assertEquals(lockCreate.getUrlPathSegments().getPath(), methodReferences.iterator().next().getInnerProxyMethod().getUrlPath());
        Assertions.assertEquals(HttpMethod.PUT, methodReferences.iterator().next().getInnerProxyMethod().getHttpMethod());

        // test resolveResourceUpdate
        ResourceUpdate lockUpdate = ResourceParser.resolveResourceUpdate(lockCollection, lockCreate, client.getModels()).get();
        methodReferences = lockUpdate.getMethodReferences();
        Assertions.assertEquals(2, methodReferences.size());
        Assertions.assertTrue(methodReferences.iterator().next().getMethodName().startsWith("createOrUpdateAtResourceGroupLevel"));
        Assertions.assertEquals(lockCreate.getUrlPathSegments().getPath(), methodReferences.iterator().next().getInnerProxyMethod().getUrlPath());
        Assertions.assertEquals(HttpMethod.PUT, methodReferences.iterator().next().getInnerProxyMethod().getHttpMethod());

        // test resolveResourceRefresh
        ResourceRefresh lockRefresh = ResourceParser.resolveResourceRefresh(lockCollection, lockCreate).get();
        methodReferences = lockRefresh.getMethodReferences();
        Assertions.assertEquals(2, methodReferences.size());
        Assertions.assertTrue(methodReferences.iterator().next().getMethodName().startsWith("getByResourceGroup"));
        Assertions.assertEquals(lockCreate.getUrlPathSegments().getPath(), methodReferences.iterator().next().getInnerProxyMethod().getUrlPath());
        Assertions.assertEquals(HttpMethod.GET, methodReferences.iterator().next().getInnerProxyMethod().getHttpMethod());

        // test resolveResourceRefresh
        ResourceDelete lockDelete = ResourceParser.resolveResourceDelete(lockCollection, lockCreate).get();
        methodReferences = lockDelete.getMethodReferences();
        Assertions.assertEquals(2, methodReferences.size());
        Assertions.assertTrue(methodReferences.iterator().next().getMethodName().startsWith("deleteByResourceGroup"));
        Assertions.assertEquals(lockCreate.getUrlPathSegments().getPath(), methodReferences.iterator().next().getInnerProxyMethod().getUrlPath());
        Assertions.assertEquals(HttpMethod.DELETE, methodReferences.iterator().next().getInnerProxyMethod().getHttpMethod());
    }
}
