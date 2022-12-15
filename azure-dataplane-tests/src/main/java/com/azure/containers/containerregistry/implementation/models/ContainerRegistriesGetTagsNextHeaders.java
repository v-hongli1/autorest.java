// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ContainerRegistriesGetTagsNextHeaders model. */
@Fluent
public final class ContainerRegistriesGetTagsNextHeaders {
    /*
     * The Link property.
     */
    @JsonProperty(value = "Link")
    private String link;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of ContainerRegistriesGetTagsNextHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public ContainerRegistriesGetTagsNextHeaders(HttpHeaders rawHeaders) {
        this.link = rawHeaders.getValue(HttpHeaderName.LINK);
    }

    /**
     * Get the link property: The Link property.
     *
     * @return the link value.
     */
    public String getLink() {
        return this.link;
    }

    /**
     * Set the link property: The Link property.
     *
     * @param link the link value to set.
     * @return the ContainerRegistriesGetTagsNextHeaders object itself.
     */
    public ContainerRegistriesGetTagsNextHeaders setLink(String link) {
        this.link = link;
        return this;
    }
}
