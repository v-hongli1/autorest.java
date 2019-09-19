// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.azureresource;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceMethod;
import com.microsoft.azure.v3.Resource;
import fixtures.azureresource.models.FlattenedProduct;
import fixtures.azureresource.models.ResourceCollection;
import java.util.List;
import java.util.Map;
import reactor.core.publisher.Mono;

/**
 * The interface for AutoRestResourceFlatteningTestService class.
 */
public interface AutoRestResourceFlatteningTestService {
    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    String getAcceptLanguage();

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    Integer getLongRunningOperationRetryTimeout();

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    Boolean getGenerateClientRequestId();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Put External Resource as an Array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putArray();

    /**
     * Put External Resource as an Array.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putArrayWithRestResponseAsync();

    /**
     * Put External Resource as an Array.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putArrayAsync();

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putArray(List<Resource> resourceArray);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putArrayWithRestResponseAsync(List<Resource> resourceArray);

    /**
     * Put External Resource as an Array.
     *
     * @param resourceArray External Resource as an Array to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putArrayAsync(List<Resource> resourceArray);

    /**
     * Get External Resource as an Array.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;FlattenedProduct&gt; object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<FlattenedProduct> getArray();

    /**
     * Get External Resource as an Array.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<List<FlattenedProduct>>> getArrayWithRestResponseAsync();

    /**
     * Get External Resource as an Array.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<FlattenedProduct>> getArrayAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putDictionary();

    /**
     * Put External Resource as a Dictionary.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putDictionaryWithRestResponseAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putDictionaryAsync();

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putDictionary(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putDictionaryWithRestResponseAsync(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Put External Resource as a Dictionary.
     *
     * @param resourceDictionary External Resource as a Dictionary to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putDictionaryAsync(Map<String, FlattenedProduct> resourceDictionary);

    /**
     * Get External Resource as a Dictionary.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Map&lt;String, FlattenedProduct&gt; object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Map<String, FlattenedProduct> getDictionary();

    /**
     * Get External Resource as a Dictionary.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Map<String, FlattenedProduct>>> getDictionaryWithRestResponseAsync();

    /**
     * Get External Resource as a Dictionary.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Map<String, FlattenedProduct>> getDictionaryAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putResourceCollection();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putResourceCollectionWithRestResponseAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putResourceCollectionAsync();

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putResourceCollection(ResourceCollection resourceComplexObject);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putResourceCollectionWithRestResponseAsync(ResourceCollection resourceComplexObject);

    /**
     * Put External Resource as a ResourceCollection.
     *
     * @param resourceComplexObject External Resource as a ResourceCollection to put.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putResourceCollectionAsync(ResourceCollection resourceComplexObject);

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ResourceCollection object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ResourceCollection getResourceCollection();

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<ResourceCollection>> getResourceCollectionWithRestResponseAsync();

    /**
     * Get External Resource as a ResourceCollection.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ResourceCollection> getResourceCollectionAsync();
}
