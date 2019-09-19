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

/**
 * Contains all response data for the resumeDeleteAsyncRelativeRetryInvalidHeader operation.
 */
public final class LROSADsResumeDeleteAsyncRelativeRetryInvalidHeaderResponse extends ResponseBase<LROSADsDeleteAsyncRelativeRetryInvalidHeaderHeaders, Void> {
    /**
     * Creates an instance of LROSADsResumeDeleteAsyncRelativeRetryInvalidHeaderResponse.
     *
     * @param request the request which resulted in this LROSADsResumeDeleteAsyncRelativeRetryInvalidHeaderResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public LROSADsResumeDeleteAsyncRelativeRetryInvalidHeaderResponse(HttpRequest request, int statusCode, HttpHeaders rawHeaders, Void value, LROSADsDeleteAsyncRelativeRetryInvalidHeaderHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
