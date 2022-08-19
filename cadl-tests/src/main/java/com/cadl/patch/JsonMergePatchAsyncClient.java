// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.patch;

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
import com.cadl.patch.implementation.PatchesImpl;
import com.cadl.patch.models.Resource;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous JsonMergePatchClient type. */
@ServiceClient(builder = JsonMergePatchClientBuilder.class, isAsync = true)
public final class JsonMergePatchAsyncClient {
    @Generated private final PatchesImpl serviceClient;

    /**
     * Initializes an instance of JsonMergePatchAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    JsonMergePatchAsyncClient(PatchesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The create operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> createWithResponse(String name, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.createWithResponseAsync(name, body, requestOptions);
    }

    /**
     * The update operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param name The name parameter.
     * @param body The body parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponse(String name, BinaryData body, RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(name, body, requestOptions);
    }

    /*
     * Generated convenience method for createWithResponse
     */
    /**
     * The create operation.
     *
     * @param name The name parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Resource> create(String name, Resource body) {
        RequestOptions requestOptions = new RequestOptions();
        return createWithResponse(name, BinaryData.fromObject(body), requestOptions)
                .map(Response::getValue)
                .map(protocolMethodData -> protocolMethodData.toObject(Resource.class));
    }

    /*
     * Generated convenience method for updateWithResponse
     */
    /**
     * The update operation.
     *
     * @param name The name parameter.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Resource> update(String name, Resource body) {
        RequestOptions requestOptions = new RequestOptions();
        return updateWithResponse(name, BinaryData.fromObject(body), requestOptions)
                .map(Response::getValue)
                .map(protocolMethodData -> protocolMethodData.toObject(Resource.class));
    }
}
