/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.fluent.gencode.child_in_parent_opgroup.implementation;

import com.fluent.gencode.child_in_parent_opgroup.ColorTypes;
import com.fluent.gencode.child_in_parent_opgroup.CreationData;
import com.fluent.gencode.child_in_parent_opgroup.Dog;
import com.fluent.gencode.child_in_parent_opgroup.Dogs;
import com.fluent.gencode.child_in_parent_opgroup.Puppy;
import com.fluent.gencode.child_in_parent_opgroup.PuppySku;
import com.fluent.gencode.child_in_parent_opgroup.SkuNames;
import com.microsoft.azure.arm.core.TestBase;
import com.microsoft.rest.RestClient;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

public class ChildInParentOpGroupTest extends TestBase {
    protected static Child_In_Parent_OpGroupManager petsManager;

    @Override
    protected void initializeClients(RestClient restClient, String defaultSubscription, String domain) {
        petsManager = Child_In_Parent_OpGroupManager
                .authenticate(restClient, defaultSubscription);
    }

    @Override
    protected void cleanUpResources() {
    }

    @Test
    public void ensureGroupableResourceInheritance() {
        //
        HashSet<String> expectedExtends = new HashSet<>();
        expectedExtends.add("com.microsoft.azure.arm.model.HasInner");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.Resource");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.GroupableResourceCore");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.HasResourceGroup");
        expectedExtends.add("com.microsoft.azure.arm.model.Refreshable");
        expectedExtends.add("com.microsoft.azure.arm.model.Updatable");
        expectedExtends.add("com.microsoft.azure.arm.resources.models.HasManager");
        //
        Class cls = Dog.class;
        Class[] eInterfaces = cls.getInterfaces();
        HashSet<String> currentExtends = new HashSet<>();
        for (Class eInterface : eInterfaces) {
            currentExtends.add(eInterface.getName());
        }
        //
        Assert.assertEquals(expectedExtends.size(), currentExtends.size());
        //
        for (String expectedExtend : expectedExtends) {
            if (!currentExtends.contains(expectedExtend)) {
                Assert.assertTrue("Expected interface '" + expectedExtend + "' is not implemented", false);
            }
        }

        for (String currentExtend : currentExtends) {
            if (!expectedExtends.contains(currentExtend)) {
                Assert.assertTrue("Groupable interface 'Dog' implements unexpected interface '" + currentExtend + "'", false);
            }
        }
    }

    @Test
    public void ensureGroupableResourcesInheritance() {
        //
        HashSet<String> expectedExtends = new HashSet<>();
        expectedExtends.add("com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup");
        expectedExtends.add("com.microsoft.azure.arm.model.HasInner");
        expectedExtends.add("com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup");
        expectedExtends.add("com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup");
        expectedExtends.add("com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion");
        expectedExtends.add("com.microsoft.azure.arm.collection.SupportsCreating");
        expectedExtends.add("com.microsoft.azure.arm.collection.SupportsListing");
        //
        Class cls = Dogs.class;
        Class[] eInterfaces = cls.getInterfaces();
        HashSet<String> currentExtends = new HashSet<>();
        for (Class eInterface : eInterfaces) {
            currentExtends.add(eInterface.getName());
        }
        //
        Assert.assertEquals(expectedExtends.size(), currentExtends.size());
        //
        for (String expectedExtend : expectedExtends) {
            if (!currentExtends.contains(expectedExtend)) {
                Assert.assertTrue("Expected interface '" + expectedExtend + "' is not implemented", false);
            }
        }
    }

    @Test
    public void ensureGroupableResourcesStandardMethods() {
        Method[] declMethods = DogsImpl.class.getMethods();
        HashSet<String> methodSignatures = new HashSet<>();
        methodSignatures.add("class com.fluent.gencode.child_in_parent_opgroup.implementation.DogImpl:define");
        //
        methodSignatures.add("rx.Observable<com.fluent.gencode.child_in_parent_opgroup.Dog>:listAsync");
        methodSignatures.add("com.microsoft.azure.PagedList<com.fluent.gencode.child_in_parent_opgroup.Dog>:list");
        //
        methodSignatures.add("rx.Observable<com.fluent.gencode.child_in_parent_opgroup.Dog>:listByResourceGroupAsync");
        methodSignatures.add("com.microsoft.azure.PagedList<com.fluent.gencode.child_in_parent_opgroup.Dog>:listByResourceGroup");
        //
        methodSignatures.add("rx.Observable<java.lang.String>:deleteByIdsAsync");
        methodSignatures.add("void:deleteByIds");

        for (String methodSignature : methodSignatures) {
            boolean found = false;
            for (Method method : declMethods) {
                String mSign = method.getGenericReturnType() + ":" + method.getName();
                if (methodSignature.equals(mSign)) {
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("Standard Method '" + methodSignature + "' not found", found);
        }
    }

    @Test
    public void ensureGeneralizedNestedMethodsInParent() {
        Method[] declMethods = Dogs.class.getMethods();
        HashSet<String> methodSignatures = new HashSet<>();
        methodSignatures.add("rx.Observable<com.fluent.gencode.child_in_parent_opgroup.Puppy>:getPuppyAsync");
        methodSignatures.add("interface com.fluent.gencode.child_in_parent_opgroup.Puppy$DefinitionStages$Blank:definePuppy");
        methodSignatures.add("class rx.Completable:deletePuppyAsync");
        methodSignatures.add("class rx.Completable:revokeAccessToPuppyAsync");
        methodSignatures.add("rx.Observable<com.fluent.gencode.child_in_parent_opgroup.Puppy>:listPuppiesByDogAsync");
        methodSignatures.add("rx.Observable<com.fluent.gencode.child_in_parent_opgroup.AccessUri>:grantAccessToPuppyAsync");
        //
        for (String methodSignature : methodSignatures) {
            boolean found = false;
            for (Method method : declMethods) {
                String mSign = method.getGenericReturnType() + ":" + method.getName();
                if (methodSignature.equals(mSign)) {
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("Standard Method '" + methodSignature + "' not found", found);
        }
    }

    @Test
    public void ensureNoNestedResourcesType() {
        boolean cnfExceptionThrown = false;
        try {
            Class.forName("com.fluent.gencode.child_in_parent_opgroup.Puppies");
        } catch (ClassNotFoundException e) {
            cnfExceptionThrown = true;
        }
        Assert.assertTrue("Puppies nested resource collection should not exists", cnfExceptionThrown);
    }

    @Test
    public void ensureNestedResourceWrapModelGetInnerInParentImpl() {
        try {
            Class<?>[] parameters = new Class[]{String.class};
            DogsImpl.class.getDeclaredMethod("wrapPuppyModel", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized wrapModel 'wrapPuppyModel(String)' not found", false);
        }
        //
        try {
            Class<?>[] parameters = new Class[]{PuppyInner.class};
            DogsImpl.class.getDeclaredMethod("wrapPuppyModel", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized wrapModel 'wrapPuppyModel(PuppyInner)' not found", false);
        }
        //
        try {
            Class<?>[] parameters = new Class[]{String.class};
            DogsImpl.class.getDeclaredMethod("getPuppyInnerUsingDogsInnerAsync", parameters);
        } catch (NoSuchMethodException ex) {
            Assert.assertTrue( "Expected generalized getInner 'getPuppyInnerUsingDogsInnerAsync(String)' not found", false);
        }
    }

    @Test
    public void ensureNestedResourceDefineFlow() {
        Puppy.DefinitionStages.Blank blankStage = this.petsManager.dogs().definePuppy("puppyname");
        Puppy.DefinitionStages.WithCreationData afterDog = blankStage.withExistingDog("rgName", "dogName");
        Puppy.DefinitionStages.WithLocation afterCreationDate = afterDog.withCreationData(new CreationData());
        Puppy.DefinitionStages.WithCreate withCreate = afterCreationDate.withLocation("westus");
        withCreate = withCreate.withAnimalSizeGB(33);
        withCreate = withCreate.withOsType(ColorTypes.BLACK);
        withCreate = withCreate.withSku(new PuppySku().withName(SkuNames.LARGE));
        withCreate.withTags(new HashMap<String, String>());
    }

    @Test
    public void ensureNestedResourceUpdateFlow() {
        Puppy puppy = new PuppyImpl(new PuppyInner(), this.petsManager);
        Puppy.Update withUpdate = puppy.update();
        withUpdate.withAnimalSizeGB(22);
        withUpdate.withOsType(ColorTypes.BLACK);
        withUpdate.withSku(new PuppySku().withName(SkuNames.LARGE));
        withUpdate.withTags(new HashMap<String, String>());
    }
}
