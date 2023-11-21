// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.response.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.models.ResponseError;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OperationDetails2 model.
 */
@Immutable
public final class OperationDetails2 {
    /*
     * Operation ID
     */
    @Generated
    @JsonProperty(value = "id")
    private String id;

    /*
     * The status property.
     */
    @Generated
    @JsonProperty(value = "status")
    private OperationState status;

    /*
     * The error property.
     */
    @Generated
    @JsonProperty(value = "error")
    private ResponseError error;

    /*
     * The lroResult property.
     */
    @Generated
    @JsonProperty(value = "lroResult")
    private Resource lroResult;

    /**
     * Creates an instance of OperationDetails2 class.
     * 
     * @param id the id value to set.
     * @param status the status value to set.
     */
    @Generated
    @JsonCreator
    private OperationDetails2(@JsonProperty(value = "id") String id,
        @JsonProperty(value = "status") OperationState status) {
        this.id = id;
        this.status = status;
    }

    /**
     * Get the id property: Operation ID.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the status property: The status property.
     * 
     * @return the status value.
     */
    @Generated
    public OperationState getStatus() {
        return this.status;
    }

    /**
     * Get the error property: The error property.
     * 
     * @return the error value.
     */
    @Generated
    public ResponseError getError() {
        return this.error;
    }

    /**
     * Get the lroResult property: The lroResult property.
     * 
     * @return the lroResult value.
     */
    @Generated
    public Resource getLroResult() {
        return this.lroResult;
    }
}