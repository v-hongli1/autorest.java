// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.http.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for patch302 operation.
 */
@Fluent
public final class HttpRedirectsPatch302Headers {
    /*
     * The redirect location for this request. Possible values include:
     * '/http/failure/500'
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get the location property: The redirect location for this request.
     * Possible values include: '/http/failure/500'.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The redirect location for this request.
     * Possible values include: '/http/failure/500'.
     *
     * @param location the location value to set.
     * @return the HttpRedirectsPatch302Headers object itself.
     */
    public HttpRedirectsPatch302Headers location(String location) {
        this.location = location;
        return this;
    }
}
