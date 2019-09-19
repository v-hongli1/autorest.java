// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.bodybyte;

import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceMethod;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Bytes.
 */
public interface Bytes {
    /**
     * Get null byte value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    byte[] getNull();

    /**
     * Get null byte value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<byte[]>> getNullWithRestResponseAsync();

    /**
     * Get null byte value.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<byte[]> getNullAsync();

    /**
     * Get empty byte value ''.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    byte[] getEmpty();

    /**
     * Get empty byte value ''.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<byte[]>> getEmptyWithRestResponseAsync();

    /**
     * Get empty byte value ''.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<byte[]> getEmptyAsync();

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    byte[] getNonAscii();

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<byte[]>> getNonAsciiWithRestResponseAsync();

    /**
     * Get non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<byte[]> getNonAsciiAsync();

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putNonAscii(byte[] byteBody);

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putNonAsciiWithRestResponseAsync(byte[] byteBody);

    /**
     * Put non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     *
     * @param byteBody Base64-encoded non-ascii byte string hex(FF FE FD FC FB FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putNonAsciiAsync(byte[] byteBody);

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the byte[] object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    byte[] getInvalid();

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<byte[]>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid byte value ':::SWAGGER::::'.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<byte[]> getInvalidAsync();
}
