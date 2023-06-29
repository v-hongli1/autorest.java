// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.internal;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.cadl.internal.implementation.InternalClientImpl;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous InternalClient type. */
@ServiceClient(builder = InternalClientBuilder.class, isAsync = true)
public final class InternalAsyncClient {
    @Generated private final InternalClientImpl serviceClient;

    /**
     * Initializes an instance of InternalAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    InternalAsyncClient(InternalClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The getInternal operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     property (Required): {
     *         name: String (Required)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     property (Required): {
     *         name: String (Required)
     *     }
     * }
     * }</pre>
     *
     * @param request The request parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BinaryData>> getInternalWithResponse(BinaryData request, RequestOptions requestOptions) {
        return this.serviceClient.getInternalWithResponseAsync(request, requestOptions);
    }
}
