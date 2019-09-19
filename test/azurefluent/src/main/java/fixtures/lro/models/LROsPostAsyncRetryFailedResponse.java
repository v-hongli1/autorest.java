// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.lro.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import fixtures.lro.implementation.LROsPostAsyncRetryFailedHeadersInner;

/**
 * Contains all response data for the postAsyncRetryFailed operation.
 */
public final class LROsPostAsyncRetryFailedResponse extends ResponseBase<LROsPostAsyncRetryFailedHeadersInner, Void> {
    /**
     * Creates an instance of LROsPostAsyncRetryFailedResponse.
     *
     * @param request the request which resulted in this LROsPostAsyncRetryFailedResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public LROsPostAsyncRetryFailedResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, LROsPostAsyncRetryFailedHeadersInner headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
