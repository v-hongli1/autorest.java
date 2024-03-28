// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.mediatypes.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import fixtures.mediatypes.MediaTypesServiceVersion;
import reactor.core.publisher.Mono;

/**
 * Initializes a new instance of the MediaTypesClient type.
 */
public final class MediaTypesClientImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final MediaTypesClientService service;

    /**
     * server parameter.
     */
    private final String host;

    /**
     * Gets server parameter.
     * 
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /**
     * Service version.
     */
    private final MediaTypesServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public MediaTypesServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of MediaTypesClient client.
     * 
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public MediaTypesClientImpl(String host, MediaTypesServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), host, serviceVersion);
    }

    /**
     * Initializes an instance of MediaTypesClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public MediaTypesClientImpl(HttpPipeline httpPipeline, String host, MediaTypesServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host, serviceVersion);
    }

    /**
     * Initializes an instance of MediaTypesClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     * @param serviceVersion Service version.
     */
    public MediaTypesClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host,
        MediaTypesServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.serviceVersion = serviceVersion;
        this.service = RestProxy.create(MediaTypesClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for MediaTypesClient to be used by the proxy service to perform REST
     * calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MediaTypesClient")
    public interface MediaTypesClientService {
        @Post("/mediatypes/analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> analyzeBody(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);

        @Post("/mediatypes/analyze")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> analyzeBodySync(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @HeaderParam("Accept") String accept,
            RequestOptions requestOptions, Context context);

        @Post("/mediatypes/analyzeNoAccept")
        @ExpectedResponses({ 202 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> analyzeBodyNoAcceptHeader(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/analyzeNoAccept")
        @ExpectedResponses({ 202 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> analyzeBodyNoAcceptHeaderSync(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/contentTypeWithEncoding")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> contentTypeWithEncoding(@HostParam("$host") String host,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/contentTypeWithEncoding")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> contentTypeWithEncodingSync(@HostParam("$host") String host,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/binaryBodyTwoContentTypes")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> binaryBodyWithTwoContentTypes(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @BodyParam("application/octet-stream") BinaryData message,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/binaryBodyTwoContentTypes")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> binaryBodyWithTwoContentTypesSync(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @BodyParam("application/octet-stream") BinaryData message,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/binaryBodyThreeContentTypes")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> binaryBodyWithThreeContentTypes(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @BodyParam("application/octet-stream") BinaryData message,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/binaryBodyThreeContentTypes")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> binaryBodyWithThreeContentTypesSync(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @BodyParam("application/octet-stream") BinaryData message,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/bodyThreeTypes")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> bodyThreeTypes(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @BodyParam("application/octet-stream") BinaryData message,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/bodyThreeTypes")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> bodyThreeTypesSync(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @BodyParam("application/octet-stream") BinaryData message,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/textAndJson")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> putTextAndJsonBody(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @BodyParam("text/plain") BinaryData message,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);

        @Post("/mediatypes/textAndJson")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> putTextAndJsonBodySync(@HostParam("$host") String host,
            @HeaderParam("Content-Type") String contentType, @BodyParam("text/plain") BinaryData message,
            @HeaderParam("Accept") String accept, RequestOptions requestOptions, Context context);
    }

    /**
     * Analyze body, that could be different media types.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/pdf", "image/jpeg", "image/png", "image/tiff".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> analyzeBodyWithResponseAsync(String contentType, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.analyzeBody(this.getHost(), contentType, accept, requestOptions, context));
    }

    /**
     * Analyze body, that could be different media types.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/pdf", "image/jpeg", "image/png", "image/tiff".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> analyzeBodyWithResponse(String contentType, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.analyzeBodySync(this.getHost(), contentType, accept, requestOptions, Context.NONE);
    }

    /**
     * Analyze body, that could be different media types. Adds to AnalyzeBody by not having an accept type.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/pdf", "image/jpeg", "image/png", "image/tiff".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> analyzeBodyNoAcceptHeaderWithResponseAsync(String contentType,
        RequestOptions requestOptions) {
        return FluxUtil.withContext(
            context -> service.analyzeBodyNoAcceptHeader(this.getHost(), contentType, requestOptions, context));
    }

    /**
     * Analyze body, that could be different media types. Adds to AnalyzeBody by not having an accept type.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/pdf", "image/jpeg", "image/png", "image/tiff".
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> analyzeBodyNoAcceptHeaderWithResponse(String contentType, RequestOptions requestOptions) {
        return service.analyzeBodyNoAcceptHeaderSync(this.getHost(), contentType, requestOptions, Context.NONE);
    }

    /**
     * Pass in contentType 'text/plain; charset=UTF-8' to pass test. Value for input does not matter.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>Content-Type</td><td>String</td><td>No</td><td>The content type. Allowed values: "text/plain;
     * charset=UTF-8".</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> contentTypeWithEncodingWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        RequestOptions requestOptionsLocal = requestOptions == null ? new RequestOptions() : requestOptions;
        requestOptionsLocal.addRequestCallback(requestLocal -> {
            if (requestLocal.getBody() != null && requestLocal.getHeaders().get(HttpHeaderName.CONTENT_TYPE) == null) {
                requestLocal.getHeaders().set(HttpHeaderName.CONTENT_TYPE, "text/plain; charset=UTF-8");
            }
        });
        return FluxUtil.withContext(
            context -> service.contentTypeWithEncoding(this.getHost(), accept, requestOptionsLocal, context));
    }

    /**
     * Pass in contentType 'text/plain; charset=UTF-8' to pass test. Value for input does not matter.
     * <p><strong>Header Parameters</strong></p>
     * <table border="1">
     * <caption>Header Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>Content-Type</td><td>String</td><td>No</td><td>The content type. Allowed values: "text/plain;
     * charset=UTF-8".</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addHeader}
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> contentTypeWithEncodingWithResponse(RequestOptions requestOptions) {
        final String accept = "application/json";
        RequestOptions requestOptionsLocal = requestOptions == null ? new RequestOptions() : requestOptions;
        requestOptionsLocal.addRequestCallback(requestLocal -> {
            if (requestLocal.getBody() != null && requestLocal.getHeaders().get(HttpHeaderName.CONTENT_TYPE) == null) {
                requestLocal.getHeaders().set(HttpHeaderName.CONTENT_TYPE, "text/plain; charset=UTF-8");
            }
        });
        return service.contentTypeWithEncodingSync(this.getHost(), accept, requestOptionsLocal, Context.NONE);
    }

    /**
     * Binary body with two content types. Pass in of {'hello': 'world'} for the application/json content type, and a
     * byte stream of 'hello, world!' for application/octet-stream.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/json", "application/octet-stream".
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> binaryBodyWithTwoContentTypesWithResponseAsync(String contentType,
        BinaryData message, RequestOptions requestOptions) {
        final String accept = "text/plain";
        return FluxUtil.withContext(context -> service.binaryBodyWithTwoContentTypes(this.getHost(), contentType,
            message, accept, requestOptions, context));
    }

    /**
     * Binary body with two content types. Pass in of {'hello': 'world'} for the application/json content type, and a
     * byte stream of 'hello, world!' for application/octet-stream.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/json", "application/octet-stream".
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> binaryBodyWithTwoContentTypesWithResponse(String contentType, BinaryData message,
        RequestOptions requestOptions) {
        final String accept = "text/plain";
        return service.binaryBodyWithTwoContentTypesSync(this.getHost(), contentType, message, accept, requestOptions,
            Context.NONE);
    }

    /**
     * Binary body with three content types. Pass in string 'hello, world' with content type 'text/plain', {'hello':
     * world'} with content type 'application/json' and a byte string for 'application/octet-stream'.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/json", "application/octet-stream",
     * "text/plain".
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> binaryBodyWithThreeContentTypesWithResponseAsync(String contentType,
        BinaryData message, RequestOptions requestOptions) {
        final String accept = "text/plain";
        return FluxUtil.withContext(context -> service.binaryBodyWithThreeContentTypes(this.getHost(), contentType,
            message, accept, requestOptions, context));
    }

    /**
     * Binary body with three content types. Pass in string 'hello, world' with content type 'text/plain', {'hello':
     * world'} with content type 'application/json' and a byte string for 'application/octet-stream'.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/json", "application/octet-stream",
     * "text/plain".
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> binaryBodyWithThreeContentTypesWithResponse(String contentType, BinaryData message,
        RequestOptions requestOptions) {
        final String accept = "text/plain";
        return service.binaryBodyWithThreeContentTypesSync(this.getHost(), contentType, message, accept, requestOptions,
            Context.NONE);
    }

    /**
     * Body with three types. Can be stream, string, or JSON. Pass in string 'hello, world' with content type
     * 'text/plain', {'hello': world'} with content type 'application/json' and a byte string for
     * 'application/octet-stream'.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType The content type. Allowed values: "application/octet-stream", "text/plain",
     * "application/json".
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> bodyThreeTypesWithResponseAsync(String contentType, BinaryData message,
        RequestOptions requestOptions) {
        final String accept = "text/plain";
        return FluxUtil.withContext(
            context -> service.bodyThreeTypes(this.getHost(), contentType, message, accept, requestOptions, context));
    }

    /**
     * Body with three types. Can be stream, string, or JSON. Pass in string 'hello, world' with content type
     * 'text/plain', {'hello': world'} with content type 'application/json' and a byte string for
     * 'application/octet-stream'.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * BinaryData
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType The content type. Allowed values: "application/octet-stream", "text/plain",
     * "application/json".
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> bodyThreeTypesWithResponse(String contentType, BinaryData message,
        RequestOptions requestOptions) {
        final String accept = "text/plain";
        return service.bodyThreeTypesSync(this.getHost(), contentType, message, accept, requestOptions, Context.NONE);
    }

    /**
     * Body that's either text/plain or application/json.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/json", "text/plain".
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> putTextAndJsonBodyWithResponseAsync(String contentType, BinaryData message,
        RequestOptions requestOptions) {
        final String accept = "text/plain";
        return FluxUtil.withContext(context -> service.putTextAndJsonBody(this.getHost(), contentType, message, accept,
            requestOptions, context));
    }

    /**
     * Body that's either text/plain or application/json.
     * <p><strong>Request Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * String
     * }</pre>
     * 
     * @param contentType Upload file type. Allowed values: "application/json", "text/plain".
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> putTextAndJsonBodyWithResponse(String contentType, BinaryData message,
        RequestOptions requestOptions) {
        final String accept = "text/plain";
        return service.putTextAndJsonBodySync(this.getHost(), contentType, message, accept, requestOptions,
            Context.NONE);
    }
}
