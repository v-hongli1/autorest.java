// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.testserver.modelcollectionproperties;

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
import com.cadl.testserver.modelcollectionproperties.implementation.ModelCollectionPropertiesImpl;
import com.cadl.testserver.modelcollectionproperties.models.ModelCollectionModel;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous ModelCollectionPropertiesClient type. */
@ServiceClient(builder = ModelCollectionPropertiesClientBuilder.class, isAsync = true)
public final class ModelCollectionPropertiesAsyncClient {
    @Generated private final ModelCollectionPropertiesImpl serviceClient;

    /**
     * Initializes an instance of ModelCollectionPropertiesAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    ModelCollectionPropertiesAsyncClient(ModelCollectionPropertiesImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The sendCollectionModel operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredModelCollection (Required): [
     *          (Required){
     *             requiredString: String (Required)
     *             requiredInt: long (Required)
     *         }
     *     ]
     *     optionalModelCollection (Optional): [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param input Simple model with model collection properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendCollectionModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.sendCollectionModelWithResponseAsync(input, requestOptions);
    }

    /**
     * The getCollectionModel operation.
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredModelCollection (Required): [
     *          (Required){
     *             requiredString: String (Required)
     *             requiredInt: long (Required)
     *         }
     *     ]
     *     optionalModelCollection (Optional): [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return simple model with model collection properties along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getCollectionModelWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.getCollectionModelWithResponseAsync(requestOptions);
    }

    /**
     * The setCollectionModel operation.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredModelCollection (Required): [
     *          (Required){
     *             requiredString: String (Required)
     *             requiredInt: long (Required)
     *         }
     *     ]
     *     optionalModelCollection (Optional): [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     requiredModelCollection (Required): [
     *          (Required){
     *             requiredString: String (Required)
     *             requiredInt: long (Required)
     *         }
     *     ]
     *     optionalModelCollection (Optional): [
     *         (recursive schema, see above)
     *     ]
     * }
     * }</pre>
     *
     * @param input Simple model with model collection properties.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return simple model with model collection properties along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> setCollectionModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.serviceClient.setCollectionModelWithResponseAsync(input, requestOptions);
    }

    /*
     * Generated convenience method for sendCollectionModelWithResponse
     */
    /**
     * The sendCollectionModel operation.
     *
     * @param input Simple model with model collection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> sendCollectionModel(ModelCollectionModel input) {
        RequestOptions requestOptions = new RequestOptions();
        return sendCollectionModelWithResponse(BinaryData.fromObject(input), requestOptions).map(Response::getValue);
    }

    /*
     * Generated convenience method for getCollectionModelWithResponse
     */
    /**
     * The getCollectionModel operation.
     *
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return simple model with model collection properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ModelCollectionModel> getCollectionModel() {
        RequestOptions requestOptions = new RequestOptions();
        return getCollectionModelWithResponse(requestOptions)
                .map(Response::getValue)
                .map(protocolMethodData -> protocolMethodData.toObject(ModelCollectionModel.class));
    }

    /*
     * Generated convenience method for setCollectionModelWithResponse
     */
    /**
     * The setCollectionModel operation.
     *
     * @param input Simple model with model collection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return simple model with model collection properties on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ModelCollectionModel> setCollectionModel(ModelCollectionModel input) {
        RequestOptions requestOptions = new RequestOptions();
        return setCollectionModelWithResponse(BinaryData.fromObject(input), requestOptions)
                .map(Response::getValue)
                .map(protocolMethodData -> protocolMethodData.toObject(ModelCollectionModel.class));
    }
}
