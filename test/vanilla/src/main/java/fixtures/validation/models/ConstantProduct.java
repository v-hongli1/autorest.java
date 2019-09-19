// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.validation.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The product documentation.
 */
@Fluent
public final class ConstantProduct {
    /*
     * Constant string
     */
    @JsonProperty(value = "constProperty", required = true)
    private String constProperty;

    /*
     * Constant string2
     */
    @JsonProperty(value = "constProperty2", required = true)
    private String constProperty2;

    /**
     * Creates an instance of ConstantProduct class.
     */
    public ConstantProduct() {
        constProperty = "constant";
        constProperty2 = "constant2";
    }

    /**
     * Get the constProperty property: Constant string.
     *
     * @return the constProperty value.
     */
    public String constProperty() {
        return this.constProperty;
    }

    /**
     * Set the constProperty property: Constant string.
     *
     * @param constProperty the constProperty value to set.
     * @return the ConstantProduct object itself.
     */
    public ConstantProduct constProperty(String constProperty) {
        this.constProperty = constProperty;
        return this;
    }

    /**
     * Get the constProperty2 property: Constant string2.
     *
     * @return the constProperty2 value.
     */
    public String constProperty2() {
        return this.constProperty2;
    }

    /**
     * Set the constProperty2 property: Constant string2.
     *
     * @param constProperty2 the constProperty2 value to set.
     * @return the ConstantProduct object itself.
     */
    public ConstantProduct constProperty2(String constProperty2) {
        this.constProperty2 = constProperty2;
        return this;
    }
}
