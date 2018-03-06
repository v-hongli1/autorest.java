/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.head.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.HEAD;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.head.HttpSuccess;
import io.reactivex.Maybe;
import io.reactivex.Single;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpSuccess.
 */
public final class HttpSuccessImpl implements HttpSuccess {
    /**
     * The proxy service used to perform REST calls.
     */
    private HttpSuccessService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestHeadTestServiceImpl client;

    /**
     * Initializes an instance of HttpSuccessImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public HttpSuccessImpl(AutoRestHeadTestServiceImpl client) {
        this.service = AzureProxy.create(HttpSuccessService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for HttpSuccess to be used by
     * the proxy service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface HttpSuccessService {
        @HEAD("http/success/200")
        @ExpectedResponses({200, 404})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<Boolean>> head200(@HeaderParam("accept-language") String acceptLanguage);

        @HEAD("http/success/204")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<Boolean>> head204(@HeaderParam("accept-language") String acceptLanguage);

        @HEAD("http/success/404")
        @ExpectedResponses({204, 404})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<Boolean>> head404(@HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Return 200 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean head200() {
        return head200Async().blockingGet();
    }

    /**
     * Return 200 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> head200Async(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head200Async(), serviceCallback);
    }

    /**
     * Return 200 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> head200WithRestResponseAsync() {
        return service.head200(this.client.acceptLanguage());
    }

    /**
     * Return 200 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> head200Async() {
        return head200WithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Boolean> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Return 204 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean head204() {
        return head204Async().blockingGet();
    }

    /**
     * Return 204 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> head204Async(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head204Async(), serviceCallback);
    }

    /**
     * Return 204 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> head204WithRestResponseAsync() {
        return service.head204(this.client.acceptLanguage());
    }

    /**
     * Return 204 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> head204Async() {
        return head204WithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Boolean> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Return 404 status code if successful.
     *
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    public boolean head404() {
        return head404Async().blockingGet();
    }

    /**
     * Return 404 status code if successful.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Boolean> head404Async(ServiceCallback<Boolean> serviceCallback) {
        return ServiceFuture.fromBody(head404Async(), serviceCallback);
    }

    /**
     * Return 404 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Boolean>> head404WithRestResponseAsync() {
        return service.head404(this.client.acceptLanguage());
    }

    /**
     * Return 404 status code if successful.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Boolean> head404Async() {
        return head404WithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Boolean> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
