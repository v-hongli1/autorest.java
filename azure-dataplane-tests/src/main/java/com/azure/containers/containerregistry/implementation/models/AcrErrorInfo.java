// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error information. */
@Fluent
public final class AcrErrorInfo {
    /*
     * Error code
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * Error message
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Error details
     */
    @JsonProperty(value = "detail")
    private Object detail;

    /** Creates an instance of AcrErrorInfo class. */
    public AcrErrorInfo() {}

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error code.
     *
     * @param code the code value to set.
     * @return the AcrErrorInfo object itself.
     */
    public AcrErrorInfo setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     *
     * @param message the message value to set.
     * @return the AcrErrorInfo object itself.
     */
    public AcrErrorInfo setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the detail property: Error details.
     *
     * @return the detail value.
     */
    public Object getDetail() {
        return this.detail;
    }

    /**
     * Set the detail property: Error details.
     *
     * @param detail the detail value to set.
     * @return the AcrErrorInfo object itself.
     */
    public AcrErrorInfo setDetail(Object detail) {
        this.detail = detail;
        return this;
    }
}
