// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armstreamstyleserialization.implementation;

import com.azure.core.management.SystemData;
import com.cadl.armstreamstyleserialization.fluent.models.TopLevelArmResourceInner;
import com.cadl.armstreamstyleserialization.models.TopLevelArmResource;
import com.cadl.armstreamstyleserialization.models.TopLevelArmResourceProperties;
import java.util.Collections;
import java.util.Map;

public final class TopLevelArmResourceImpl implements TopLevelArmResource {
    private TopLevelArmResourceInner innerObject;

    private final com.cadl.armstreamstyleserialization.ArmStreamStyleSerializationManager serviceManager;

    TopLevelArmResourceImpl(TopLevelArmResourceInner innerObject,
        com.cadl.armstreamstyleserialization.ArmStreamStyleSerializationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public TopLevelArmResourceProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public TopLevelArmResourceInner innerModel() {
        return this.innerObject;
    }

    private com.cadl.armstreamstyleserialization.ArmStreamStyleSerializationManager manager() {
        return this.serviceManager;
    }
}
