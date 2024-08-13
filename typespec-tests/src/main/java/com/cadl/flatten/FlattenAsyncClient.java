// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.flatten;

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
import com.azure.core.util.FluxUtil;
import com.cadl.flatten.implementation.FlattenClientImpl;
import com.cadl.flatten.implementation.JsonMergePatchHelper;
import com.cadl.flatten.implementation.MultipartFormDataHelper;
import com.cadl.flatten.implementation.models.SendLongRequest;
import com.cadl.flatten.implementation.models.SendProjectedNameRequest;
import com.cadl.flatten.implementation.models.SendRequest;
import com.cadl.flatten.implementation.models.UploadFileRequest;
import com.cadl.flatten.implementation.models.UploadTodoRequest;
import com.cadl.flatten.models.FileDataFileDetails;
import com.cadl.flatten.models.SendLongOptions;
import com.cadl.flatten.models.TodoItem;
import com.cadl.flatten.models.UpdatePatchRequest;
import com.cadl.flatten.models.UploadTodoOptions;
import com.cadl.flatten.models.User;
import java.util.Objects;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the asynchronous FlattenClient type.
 */
@ServiceClient(builder = FlattenClientBuilder.class, isAsync = true)
public final class FlattenAsyncClient {
    @Generated
    private final FlattenClientImpl serviceClient;

    /**
     * Initializes an instance of FlattenAsyncClient class.
     * 
     * @param serviceClient the service client implementation.
     */
    @Generated
    FlattenAsyncClient(FlattenClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * The send operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     endpoint: String (Required)
     *     user (Optional): {
     *         user: String (Required)
     *     }
     *     input: String (Required)
     *     constant: String (Required)
     * }
     * }</pre>
     * 
     * @param id The id parameter.
     * @param sendRequest The sendRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendWithResponse(String id, BinaryData sendRequest, RequestOptions requestOptions) {
        return this.serviceClient.sendWithResponseAsync(id, sendRequest, requestOptions);
    }

    /**
     * The sendProjectedName operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     file_id: String (Required)
     * }
     * }</pre>
     * 
     * @param id The id parameter.
     * @param sendProjectedNameRequest The sendProjectedNameRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendProjectedNameWithResponse(String id, BinaryData sendProjectedNameRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.sendProjectedNameWithResponseAsync(id, sendProjectedNameRequest, requestOptions);
    }

    /**
     * The sendLong operation.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>filter</td><td>String</td><td>No</td><td>The filter parameter</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     user (Optional): {
     *         user: String (Required)
     *     }
     *     input: String (Required)
     *     dataInt: int (Required)
     *     dataIntOptional: Integer (Optional)
     *     dataLong: Long (Optional)
     *     data_float: Double (Optional)
     *     title: String (Required)
     *     description: String (Optional)
     *     status: String(NotStarted/InProgress/Completed) (Required)
     *     _dummy: String (Optional)
     *     constant: String (Required)
     * }
     * }</pre>
     * 
     * @param name The name parameter.
     * @param sendLongRequest The sendLongRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendLongWithResponse(String name, BinaryData sendLongRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.sendLongWithResponseAsync(name, sendLongRequest, requestOptions);
    }

    /**
     * The update operation.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     patch (Optional, Required on create): {
     *         title: String (Optional)
     *         description: String (Optional)
     *         status: String(NotStarted/InProgress/Completed) (Optional)
     *     }
     * }
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     id: long (Required)
     *     title: String (Required)
     *     description: String (Optional)
     *     status: String(NotStarted/InProgress/Completed) (Required)
     *     createdAt: OffsetDateTime (Required)
     *     updatedAt: OffsetDateTime (Required)
     *     completedAt: OffsetDateTime (Optional)
     *     _dummy: String (Optional)
     * }
     * }</pre>
     * 
     * @param id The id parameter.
     * @param updateRequest The updateRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> updateWithResponse(long id, BinaryData updateRequest,
        RequestOptions requestOptions) {
        return this.serviceClient.updateWithResponseAsync(id, updateRequest, requestOptions);
    }

    /**
     * The uploadFile operation.
     * 
     * @param name The name parameter.
     * @param uploadFileRequest The uploadFileRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> uploadFileWithResponse(String name, BinaryData uploadFileRequest,
        RequestOptions requestOptions) {
        // Protocol API requires serialization of parts with content-disposition and data, as operation 'uploadFile' is
        // 'multipart/form-data'
        return this.serviceClient.uploadFileWithResponseAsync(name, uploadFileRequest, requestOptions);
    }

    /**
     * The uploadTodo operation.
     * 
     * @param uploadTodoRequest The uploadTodoRequest parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> uploadTodoWithResponse(BinaryData uploadTodoRequest, RequestOptions requestOptions) {
        // Protocol API requires serialization of parts with content-disposition and data, as operation 'uploadTodo' is
        // 'multipart/form-data'
        return this.serviceClient.uploadTodoWithResponseAsync(uploadTodoRequest, requestOptions);
    }

    /**
     * The send operation.
     * 
     * @param id The id parameter.
     * @param endpoint The endpoint parameter.
     * @param input The input parameter.
     * @param user The user parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> send(String id, String endpoint, String input, User user) {
        // Generated convenience method for sendWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SendRequest sendRequestObj = new SendRequest(endpoint, input).setUser(user);
        BinaryData sendRequest = BinaryData.fromObject(sendRequestObj);
        return sendWithResponse(id, sendRequest, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The send operation.
     * 
     * @param id The id parameter.
     * @param endpoint The endpoint parameter.
     * @param input The input parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> send(String id, String endpoint, String input) {
        // Generated convenience method for sendWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SendRequest sendRequestObj = new SendRequest(endpoint, input);
        BinaryData sendRequest = BinaryData.fromObject(sendRequestObj);
        return sendWithResponse(id, sendRequest, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The sendProjectedName operation.
     * 
     * @param id The id parameter.
     * @param fileIdentifier The fileIdentifier parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> sendProjectedName(String id, String fileIdentifier) {
        // Generated convenience method for sendProjectedNameWithResponse
        RequestOptions requestOptions = new RequestOptions();
        SendProjectedNameRequest sendProjectedNameRequestObj = new SendProjectedNameRequest(fileIdentifier);
        BinaryData sendProjectedNameRequest = BinaryData.fromObject(sendProjectedNameRequestObj);
        return sendProjectedNameWithResponse(id, sendProjectedNameRequest, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The sendLong operation.
     * 
     * @param options Options for sendLong API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> sendLong(SendLongOptions options) {
        // Generated convenience method for sendLongWithResponse
        RequestOptions requestOptions = new RequestOptions();
        String name = options.getName();
        String filter = options.getFilter();
        SendLongRequest sendLongRequestObj
            = new SendLongRequest(options.getInput(), options.getDataInt(), options.getTitle(), options.getStatus())
                .setUser(options.getUser())
                .setDataIntOptional(options.getDataIntOptional())
                .setDataLong(options.getDataLong())
                .setDataFloat(options.getDataFloat())
                .setDescription(options.getDescription())
                .setDummy(options.getDummy());
        BinaryData sendLongRequest = BinaryData.fromObject(sendLongRequestObj);
        if (filter != null) {
            requestOptions.addQueryParam("filter", filter, false);
        }
        return sendLongWithResponse(name, sendLongRequest, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The update operation.
     * 
     * @param id The id parameter.
     * @param updateRequest The updateRequest parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<TodoItem> update(long id, UpdatePatchRequest updateRequest) {
        // Generated convenience method for updateWithResponse
        RequestOptions requestOptions = new RequestOptions();
        JsonMergePatchHelper.getUpdatePatchRequestAccessor().prepareModelForJsonMergePatch(updateRequest, true);
        BinaryData updateRequestInBinaryData = BinaryData.fromObject(updateRequest);
        // BinaryData.fromObject() will not fire serialization, use getLength() to fire serialization.
        updateRequestInBinaryData.getLength();
        JsonMergePatchHelper.getUpdatePatchRequestAccessor().prepareModelForJsonMergePatch(updateRequest, false);
        return updateWithResponse(id, updateRequestInBinaryData, requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(TodoItem.class));
    }

    /**
     * The uploadFile operation.
     * 
     * @param name The name parameter.
     * @param fileData The fileData parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> uploadFile(String name, FileDataFileDetails fileData) {
        // Generated convenience method for uploadFileWithResponse
        RequestOptions requestOptions = new RequestOptions();
        UploadFileRequest uploadFileRequestObj = new UploadFileRequest(fileData);
        BinaryData uploadFileRequest = new MultipartFormDataHelper(requestOptions)
            .serializeFileField("file_data", uploadFileRequestObj.getFileData().getContent(),
                uploadFileRequestObj.getFileData().getContentType(), uploadFileRequestObj.getFileData().getFilename())
            .serializeTextField("constant", uploadFileRequestObj.getConstant())
            .end()
            .getRequestBody();
        return uploadFileWithResponse(name, uploadFileRequest, requestOptions).flatMap(FluxUtil::toMono);
    }

    /**
     * The uploadTodo operation.
     * 
     * @param options Options for uploadTodo API.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> uploadTodo(UploadTodoOptions options) {
        // Generated convenience method for uploadTodoWithResponse
        RequestOptions requestOptions = new RequestOptions();
        UploadTodoRequest uploadTodoRequestObj
            = new UploadTodoRequest(options.getTitle(), options.getStatus()).setDescription(options.getDescription())
                .setDummy(options.getDummy())
                .setProp1(options.getProp1())
                .setProp2(options.getProp2())
                .setProp3(options.getProp3());
        BinaryData uploadTodoRequest
            = new MultipartFormDataHelper(requestOptions).serializeTextField("title", uploadTodoRequestObj.getTitle())
                .serializeTextField("description", uploadTodoRequestObj.getDescription())
                .serializeTextField("status", Objects.toString(uploadTodoRequestObj.getStatus()))
                .serializeTextField("_dummy", uploadTodoRequestObj.getDummy())
                .serializeTextField("prop1", uploadTodoRequestObj.getProp1())
                .serializeTextField("prop2", uploadTodoRequestObj.getProp2())
                .serializeTextField("prop3", uploadTodoRequestObj.getProp3())
                .end()
                .getRequestBody();
        return uploadTodoWithResponse(uploadTodoRequest, requestOptions).flatMap(FluxUtil::toMono);
    }
}
