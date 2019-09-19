// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.validation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceMethod;
import fixtures.validation.models.Product;
import reactor.core.publisher.Mono;

/**
 * The interface for AutoRestValidationTest class.
 */
public interface AutoRestValidationTest {
    /**
     * Gets Subscription ID.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets Required string following pattern \d{2}-\d{2}-\d{4}.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Product validationOfMethodParameters(String resourceGroupName, int id);

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Product>> validationOfMethodParametersWithRestResponseAsync(String resourceGroupName, int id);

    /**
     * Validates input parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Product> validationOfMethodParametersAsync(String resourceGroupName, int id);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Product validationOfBody(String resourceGroupName, int id);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Product>> validationOfBodyWithRestResponseAsync(String resourceGroupName, int id);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Product> validationOfBodyAsync(String resourceGroupName, int id);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Product validationOfBody(String resourceGroupName, int id, Product body);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Product>> validationOfBodyWithRestResponseAsync(String resourceGroupName, int id, Product body);

    /**
     * Validates body parameters on the method. See swagger for details.
     *
     * @param resourceGroupName Required string between 3 and 10 chars with pattern [a-zA-Z0-9]+.
     * @param id Required int multiple of 10 from 100 to 1000.
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Product> validationOfBodyAsync(String resourceGroupName, int id, Product body);

    /**
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getWithConstantInPath();

    /**
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> getWithConstantInPathWithRestResponseAsync();

    /**
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> getWithConstantInPathAsync();

    /**
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Product postWithConstantInBody();

    /**
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Product>> postWithConstantInBodyWithRestResponseAsync();

    /**
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Product> postWithConstantInBodyAsync();

    /**
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Product object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Product postWithConstantInBody(Product body);

    /**
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Product>> postWithConstantInBodyWithRestResponseAsync(Product body);

    /**
     * @param body the Product value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Product> postWithConstantInBodyAsync(Product body);
}
