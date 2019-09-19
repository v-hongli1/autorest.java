// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.http;

import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceMethod;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * HttpSuccess.
 */
public interface HttpSuccess {
    /**
     * Return 200 status code if successful.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void head200();

    /**
     * Return 200 status code if successful.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> head200WithRestResponseAsync();

    /**
     * Return 200 status code if successful.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> head200Async();

    /**
     * Get 200 success.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the boolean object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    boolean get200();

    /**
     * Get 200 success.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Boolean>> get200WithRestResponseAsync();

    /**
     * Get 200 success.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Boolean> get200Async();

    /**
     * Put boolean value true returning 200 success.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void put200();

    /**
     * Put boolean value true returning 200 success.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> put200WithRestResponseAsync();

    /**
     * Put boolean value true returning 200 success.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> put200Async();

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void put200(Boolean booleanValue);

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> put200WithRestResponseAsync(Boolean booleanValue);

    /**
     * Put boolean value true returning 200 success.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> put200Async(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void patch200();

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> patch200WithRestResponseAsync();

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> patch200Async();

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void patch200(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> patch200WithRestResponseAsync(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returning 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> patch200Async(Boolean booleanValue);

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post200();

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> post200WithRestResponseAsync();

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> post200Async();

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post200(Boolean booleanValue);

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> post200WithRestResponseAsync(Boolean booleanValue);

    /**
     * Post bollean value true in request that returns a 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> post200Async(Boolean booleanValue);

    /**
     * Delete simple boolean value true returns 200.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete200();

    /**
     * Delete simple boolean value true returns 200.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> delete200WithRestResponseAsync();

    /**
     * Delete simple boolean value true returns 200.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> delete200Async();

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete200(Boolean booleanValue);

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> delete200WithRestResponseAsync(Boolean booleanValue);

    /**
     * Delete simple boolean value true returns 200.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> delete200Async(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 201.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void put201();

    /**
     * Put true Boolean value in request returns 201.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> put201WithRestResponseAsync();

    /**
     * Put true Boolean value in request returns 201.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> put201Async();

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void put201(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> put201WithRestResponseAsync(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 201.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> put201Async(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post201();

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> post201WithRestResponseAsync();

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> post201Async();

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post201(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> post201WithRestResponseAsync(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 201 (Created).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> post201Async(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void put202();

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> put202WithRestResponseAsync();

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> put202Async();

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void put202(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> put202WithRestResponseAsync(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> put202Async(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void patch202();

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> patch202WithRestResponseAsync();

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> patch202Async();

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void patch202(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> patch202WithRestResponseAsync(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 202.
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> patch202Async(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post202();

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> post202WithRestResponseAsync();

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> post202Async();

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post202(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> post202WithRestResponseAsync(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 202 (Accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> post202Async(Boolean booleanValue);

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete202();

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> delete202WithRestResponseAsync();

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> delete202Async();

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete202(Boolean booleanValue);

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> delete202WithRestResponseAsync(Boolean booleanValue);

    /**
     * Delete true Boolean value in request returns 202 (accepted).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> delete202Async(Boolean booleanValue);

    /**
     * Return 204 status code if successful.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void head204();

    /**
     * Return 204 status code if successful.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> head204WithRestResponseAsync();

    /**
     * Return 204 status code if successful.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> head204Async();

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void put204();

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> put204WithRestResponseAsync();

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> put204Async();

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void put204(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> put204WithRestResponseAsync(Boolean booleanValue);

    /**
     * Put true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> put204Async(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void patch204();

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> patch204WithRestResponseAsync();

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> patch204Async();

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void patch204(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> patch204WithRestResponseAsync(Boolean booleanValue);

    /**
     * Patch true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> patch204Async(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post204();

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> post204WithRestResponseAsync();

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> post204Async();

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void post204(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> post204WithRestResponseAsync(Boolean booleanValue);

    /**
     * Post true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> post204Async(Boolean booleanValue);

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete204();

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> delete204WithRestResponseAsync();

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> delete204Async();

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete204(Boolean booleanValue);

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> delete204WithRestResponseAsync(Boolean booleanValue);

    /**
     * Delete true Boolean value in request returns 204 (no content).
     *
     * @param booleanValue Simple boolean value true.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> delete204Async(Boolean booleanValue);

    /**
     * Return 404 status code.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void head404();

    /**
     * Return 404 status code.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> head404WithRestResponseAsync();

    /**
     * Return 404 status code.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> head404Async();
}
