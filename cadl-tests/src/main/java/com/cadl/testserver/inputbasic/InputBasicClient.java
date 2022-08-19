// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.testserver.inputbasic;

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
import com.azure.core.util.Context;
import com.cadl.testserver.inputbasic.models.InputModel;

/** Initializes a new instance of the synchronous InputBasicClient type. */
@ServiceClient(builder = InputBasicClientBuilder.class)
public final class InputBasicClient {
    @Generated private final InputBasicAsyncClient client;

    /**
     * Initializes an instance of InputBasicClient class.
     *
     * @param client the async client.
     */
    @Generated
    InputBasicClient(InputBasicAsyncClient client) {
        this.client = client;
    }

    /**
     * The getModel operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredString: String (Required)
     *     requiredInt: long (Required)
     * }
     * }</pre>
     *
     * @param input Input Model.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.client.getModelWithResponse(input, requestOptions).block();
    }

    /*
     * Generated convenience method for getModelWithResponse
     */
    /**
     * The getModel operation.
     *
     * @param input Input Model.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void getModel(InputModel input) {
        RequestOptions requestOptions = new RequestOptions();
        getModelWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /*
     * Generated convenience method for getModelWithResponse
     */
    /**
     * The getModel operation.
     *
     * @param input Input Model.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> getModelWithResponse(InputModel input, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        return getModelWithResponse(BinaryData.fromObject(input), requestOptions);
    }
}
