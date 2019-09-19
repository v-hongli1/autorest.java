// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.lro.models;

import com.azure.core.implementation.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for post202Retry200 operation.
 */
@Fluent
public final class LRORetrysPost202Retry200Headers {
    /*
     * Location to poll for result status: will be set to
     * /lro/retryerror/post/202/retry/200
     */
    @JsonProperty(value = "Location")
    private String location;

    /*
     * Number of milliseconds until the next poll should be sent, will be set
     * to zero
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * Get the location property: Location to poll for result status: will be
     * set to /lro/retryerror/post/202/retry/200.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location to poll for result status: will be
     * set to /lro/retryerror/post/202/retry/200.
     *
     * @param location the location value to set.
     * @return the LRORetrysPost202Retry200Headers object itself.
     */
    public LRORetrysPost202Retry200Headers location(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the retryAfter property: Number of milliseconds until the next poll
     * should be sent, will be set to zero.
     *
     * @return the retryAfter value.
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set the retryAfter property: Number of milliseconds until the next poll
     * should be sent, will be set to zero.
     *
     * @param retryAfter the retryAfter value to set.
     * @return the LRORetrysPost202Retry200Headers object itself.
     */
    public LRORetrysPost202Retry200Headers retryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }
}
