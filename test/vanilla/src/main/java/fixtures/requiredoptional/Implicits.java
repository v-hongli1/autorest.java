// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.requiredoptional;

import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceMethod;
import fixtures.requiredoptional.models.Error;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Implicits.
 */
public interface Implicits {
    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Error getRequiredPath(String pathParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Error>> getRequiredPathWithRestResponseAsync(String pathParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @param pathParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Error> getRequiredPathAsync(String pathParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putOptionalQuery();

    /**
     * Test implicitly optional query parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putOptionalQueryWithRestResponseAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putOptionalQueryAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putOptionalQuery(String queryParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putOptionalQueryWithRestResponseAsync(String queryParameter);

    /**
     * Test implicitly optional query parameter.
     *
     * @param queryParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putOptionalQueryAsync(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putOptionalHeader();

    /**
     * Test implicitly optional header parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putOptionalHeaderWithRestResponseAsync();

    /**
     * Test implicitly optional header parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putOptionalHeaderAsync();

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putOptionalHeader(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putOptionalHeaderWithRestResponseAsync(String queryParameter);

    /**
     * Test implicitly optional header parameter.
     *
     * @param queryParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putOptionalHeaderAsync(String queryParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putOptionalBody();

    /**
     * Test implicitly optional body parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putOptionalBodyWithRestResponseAsync();

    /**
     * Test implicitly optional body parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putOptionalBodyAsync();

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putOptionalBody(String bodyParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putOptionalBodyWithRestResponseAsync(String bodyParameter);

    /**
     * Test implicitly optional body parameter.
     *
     * @param bodyParameter the String value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putOptionalBodyAsync(String bodyParameter);

    /**
     * Test implicitly required path parameter.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Error getRequiredGlobalPath();

    /**
     * Test implicitly required path parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Error>> getRequiredGlobalPathWithRestResponseAsync();

    /**
     * Test implicitly required path parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Error> getRequiredGlobalPathAsync();

    /**
     * Test implicitly required query parameter.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Error getRequiredGlobalQuery();

    /**
     * Test implicitly required query parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Error>> getRequiredGlobalQueryWithRestResponseAsync();

    /**
     * Test implicitly required query parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Error> getRequiredGlobalQueryAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Error object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Error getOptionalGlobalQuery();

    /**
     * Test implicitly optional query parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Error>> getOptionalGlobalQueryWithRestResponseAsync();

    /**
     * Test implicitly optional query parameter.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Error> getOptionalGlobalQueryAsync();
}
