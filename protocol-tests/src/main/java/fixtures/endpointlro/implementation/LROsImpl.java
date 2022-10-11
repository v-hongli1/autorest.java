// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.endpointlro.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.core.util.serializer.TypeReference;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LROs. */
public final class LROsImpl {
    /** The proxy service used to perform REST calls. */
    private final LROsService service;

    /** The service client containing this operation class. */
    private final AutoRestLongRunningOperationTestServiceClientImpl client;

    /**
     * Initializes an instance of LROsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LROsImpl(AutoRestLongRunningOperationTestServiceClientImpl client) {
        this.service = RestProxy.create(LROsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AutoRestLongRunningOperationTestServiceLROs to be used by the proxy
     * service to perform REST calls.
     */
    @Host("https://{Endpoint}/resource")
    @ServiceInterface(name = "AutoRestLongRunningO")
    private interface LROsService {
        @Put("/lro/put/200/succeeded")
        @ExpectedResponses({200, 204})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> put200Succeeded(
                @HostParam("Endpoint") String endpoint,
                @HeaderParam("Accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Type</td><td>String</td><td>No</td><td>The content type. Allowed values: "application/json".</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         provisioningState: String (Optional)
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK) (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         provisioningState: String (Optional)
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK) (Optional)
     *     }
     * }
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
    private Mono<Response<BinaryData>> put200SucceededWithResponseAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.put200Succeeded(this.client.getEndpoint(), accept, requestOptions, context));
    }

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Type</td><td>String</td><td>No</td><td>The content type. Allowed values: "application/json".</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         provisioningState: String (Optional)
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK) (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         provisioningState: String (Optional)
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK) (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BinaryData, BinaryData> beginPut200SucceededAsync(RequestOptions requestOptions) {
        return PollerFlux.create(
                Duration.ofSeconds(1),
                () -> this.put200SucceededWithResponseAsync(requestOptions),
                new DefaultPollingStrategy<>(
                        this.client.getHttpPipeline(),
                        "https://{Endpoint}/resource".replace("{Endpoint}", this.client.getEndpoint()),
                        null,
                        requestOptions != null && requestOptions.getContext() != null
                                ? requestOptions.getContext()
                                : Context.NONE),
                TypeReference.createInstance(BinaryData.class),
                TypeReference.createInstance(BinaryData.class));
    }

    /**
     * Long running put request, service returns a 200 to the initial request, with an entity that contains
     * ProvisioningState=’Succeeded’.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>Content-Type</td><td>String</td><td>No</td><td>The content type. Allowed values: "application/json".</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         provisioningState: String (Optional)
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK) (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     properties (Optional): {
     *         provisioningState: String (Optional)
     *         provisioningStateValues: String(Succeeded/Failed/canceled/Accepted/Creating/Created/Updating/Updated/Deleting/Deleted/OK) (Optional)
     *     }
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BinaryData, BinaryData> beginPut200Succeeded(RequestOptions requestOptions) {
        return this.beginPut200SucceededAsync(requestOptions).getSyncPoller();
    }
}