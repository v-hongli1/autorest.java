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
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.cadl.testserver.modelcollectionproperties.models.ModelCollectionModel;

/** Initializes a new instance of the synchronous ModelCollectionPropertiesClient type. */
@ServiceClient(builder = ModelCollectionPropertiesClientBuilder.class)
public final class ModelCollectionPropertiesClient {
    @Generated private final ModelCollectionPropertiesAsyncClient client;

    /**
     * Initializes an instance of ModelCollectionPropertiesClient class.
     *
     * @param client the async client.
     */
    @Generated
    ModelCollectionPropertiesClient(ModelCollectionPropertiesAsyncClient client) {
        this.client = client;
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
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> sendCollectionModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.client.sendCollectionModelWithResponse(input, requestOptions).block();
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
     * @return simple model with model collection properties along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCollectionModelWithResponse(RequestOptions requestOptions) {
        return this.client.getCollectionModelWithResponse(requestOptions).block();
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
     * @return simple model with model collection properties along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> setCollectionModelWithResponse(BinaryData input, RequestOptions requestOptions) {
        return this.client.setCollectionModelWithResponse(input, requestOptions).block();
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
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void sendCollectionModel(ModelCollectionModel input) {
        RequestOptions requestOptions = new RequestOptions();
        sendCollectionModelWithResponse(BinaryData.fromObject(input), requestOptions).getValue();
    }

    /*
     * Generated convenience method for sendCollectionModelWithResponse
     */
    /**
     * The sendCollectionModel operation.
     *
     * @param input Simple model with model collection properties.
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
    public Response<Void> sendCollectionModelWithResponse(ModelCollectionModel input, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        return sendCollectionModelWithResponse(BinaryData.fromObject(input), requestOptions);
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
     * @return simple model with model collection properties.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ModelCollectionModel getCollectionModel() {
        RequestOptions requestOptions = new RequestOptions();
        return getCollectionModelWithResponse(requestOptions).getValue().toObject(ModelCollectionModel.class);
    }

    /*
     * Generated convenience method for getCollectionModelWithResponse
     */
    /**
     * The getCollectionModel operation.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return simple model with model collection properties along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ModelCollectionModel> getCollectionModelWithResponse(Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse = getCollectionModelWithResponse(requestOptions);
        return new SimpleResponse<>(
                protocolMethodResponse, protocolMethodResponse.getValue().toObject(ModelCollectionModel.class));
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
     * @return simple model with model collection properties.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ModelCollectionModel setCollectionModel(ModelCollectionModel input) {
        RequestOptions requestOptions = new RequestOptions();
        return setCollectionModelWithResponse(BinaryData.fromObject(input), requestOptions)
                .getValue()
                .toObject(ModelCollectionModel.class);
    }

    /*
     * Generated convenience method for setCollectionModelWithResponse
     */
    /**
     * The setCollectionModel operation.
     *
     * @param input Simple model with model collection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return simple model with model collection properties along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ModelCollectionModel> setCollectionModelWithResponse(ModelCollectionModel input, Context context) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.setContext(context);
        Response<BinaryData> protocolMethodResponse =
                setCollectionModelWithResponse(BinaryData.fromObject(input), requestOptions);
        return new SimpleResponse<>(
                protocolMethodResponse, protocolMethodResponse.getValue().toObject(ModelCollectionModel.class));
    }
}
