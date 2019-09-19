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
 * Defines headers for deleteProvisioning202Accepted200Succeeded operation.
 */
@Fluent
public final class LRORetrysDeleteProvisioning202Accepted200SucceededHeaders {
    /*
     * Location to poll for result status: will be set to
     * /lro/retryerror/delete/provisioning/202/accepted/200/succeeded
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
     * set to /lro/retryerror/delete/provisioning/202/accepted/200/succeeded.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location to poll for result status: will be
     * set to /lro/retryerror/delete/provisioning/202/accepted/200/succeeded.
     *
     * @param location the location value to set.
     * @return the LRORetrysDeleteProvisioning202Accepted200SucceededHeaders
     * object itself.
     */
    public LRORetrysDeleteProvisioning202Accepted200SucceededHeaders location(String location) {
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
     * @return the LRORetrysDeleteProvisioning202Accepted200SucceededHeaders
     * object itself.
     */
    public LRORetrysDeleteProvisioning202Accepted200SucceededHeaders retryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }
}
