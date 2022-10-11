// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.resiliency.devdriven.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LROProduct model. */
@Immutable
public final class LROProduct extends Product {
    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", required = true)
    private String provisioningState;

    /**
     * Creates an instance of LROProduct class.
     *
     * @param received the received value to set.
     * @param provisioningState the provisioningState value to set.
     */
    @JsonCreator
    private LROProduct(
            @JsonProperty(value = "received", required = true) Mode received,
            @JsonProperty(value = "provisioningState", required = true) String provisioningState) {
        super(received);
        this.provisioningState = provisioningState;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
}