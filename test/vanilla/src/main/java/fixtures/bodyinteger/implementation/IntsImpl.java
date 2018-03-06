/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger.implementation;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.UnixTime;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.ReturnValueWireType;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.bodyinteger.Ints;
import fixtures.bodyinteger.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * An instance of this class provides access to all the operations defined in
 * Ints.
 */
public final class IntsImpl implements Ints {
    /**
     * The proxy service used to perform REST calls.
     */
    private IntsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestIntegerTestServiceImpl client;

    /**
     * Initializes an instance of IntsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public IntsImpl(AutoRestIntegerTestServiceImpl client) {
        this.service = RestProxy.create(IntsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Ints to be used by the proxy
     * service to perform REST calls.
     */
    @Host("http://localhost:3000")
    private interface IntsService {
        @GET("int/null")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Integer>> getNull();

        @GET("int/invalid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Integer>> getInvalid();

        @GET("int/overflowint32")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Integer>> getOverflowInt32();

        @GET("int/underflowint32")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Integer>> getUnderflowInt32();

        @GET("int/overflowint64")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Long>> getOverflowInt64();

        @GET("int/underflowint64")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<Long>> getUnderflowInt64();

        @PUT("int/max/32")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putMax32(@BodyParam("application/json; charset=utf-8") int intBody);

        @PUT("int/max/64")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putMax64(@BodyParam("application/json; charset=utf-8") long intBody);

        @PUT("int/min/32")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putMin32(@BodyParam("application/json; charset=utf-8") int intBody);

        @PUT("int/min/64")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putMin64(@BodyParam("application/json; charset=utf-8") long intBody);

        @GET("int/unixtime")
        @ExpectedResponses({200})
        @ReturnValueWireType(UnixTime.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<DateTime>> getUnixTime();

        @PUT("int/unixtime")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<VoidResponse> putUnixTimeDate(@BodyParam("application/json; charset=utf-8") long intBody);

        @GET("int/invalidunixtime")
        @ExpectedResponses({200})
        @ReturnValueWireType(UnixTime.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<DateTime>> getInvalidUnixTime();

        @GET("int/nullunixtime")
        @ExpectedResponses({200})
        @ReturnValueWireType(UnixTime.class)
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<BodyResponse<DateTime>> getNullUnixTime();
    }

    /**
     * Get null Int value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the int object if successful.
     */
    public int getNull() {
        return getNullAsync().blockingGet();
    }

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Integer> getNullAsync(ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromBody(getNullAsync(), serviceCallback);
    }

    /**
     * Get null Int value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Integer>> getNullWithRestResponseAsync() {
        return service.getNull();
    }

    /**
     * Get null Int value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Integer> getNullAsync() {
        return getNullWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Integer> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get invalid Int value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the int object if successful.
     */
    public int getInvalid() {
        return getInvalidAsync().blockingGet();
    }

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Integer> getInvalidAsync(ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidAsync(), serviceCallback);
    }

    /**
     * Get invalid Int value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Integer>> getInvalidWithRestResponseAsync() {
        return service.getInvalid();
    }

    /**
     * Get invalid Int value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Integer> getInvalidAsync() {
        return getInvalidWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Integer> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get overflow Int32 value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the int object if successful.
     */
    public int getOverflowInt32() {
        return getOverflowInt32Async().blockingGet();
    }

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Integer> getOverflowInt32Async(ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowInt32Async(), serviceCallback);
    }

    /**
     * Get overflow Int32 value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Integer>> getOverflowInt32WithRestResponseAsync() {
        return service.getOverflowInt32();
    }

    /**
     * Get overflow Int32 value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Integer> getOverflowInt32Async() {
        return getOverflowInt32WithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Integer> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get underflow Int32 value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the int object if successful.
     */
    public int getUnderflowInt32() {
        return getUnderflowInt32Async().blockingGet();
    }

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Integer> getUnderflowInt32Async(ServiceCallback<Integer> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowInt32Async(), serviceCallback);
    }

    /**
     * Get underflow Int32 value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Integer>> getUnderflowInt32WithRestResponseAsync() {
        return service.getUnderflowInt32();
    }

    /**
     * Get underflow Int32 value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Integer> getUnderflowInt32Async() {
        return getUnderflowInt32WithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Integer> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get overflow Int64 value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the long object if successful.
     */
    public long getOverflowInt64() {
        return getOverflowInt64Async().blockingGet();
    }

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Long> getOverflowInt64Async(ServiceCallback<Long> serviceCallback) {
        return ServiceFuture.fromBody(getOverflowInt64Async(), serviceCallback);
    }

    /**
     * Get overflow Int64 value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Long>> getOverflowInt64WithRestResponseAsync() {
        return service.getOverflowInt64();
    }

    /**
     * Get overflow Int64 value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Long> getOverflowInt64Async() {
        return getOverflowInt64WithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Long> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get underflow Int64 value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the long object if successful.
     */
    public long getUnderflowInt64() {
        return getUnderflowInt64Async().blockingGet();
    }

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Long> getUnderflowInt64Async(ServiceCallback<Long> serviceCallback) {
        return ServiceFuture.fromBody(getUnderflowInt64Async(), serviceCallback);
    }

    /**
     * Get underflow Int64 value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<Long>> getUnderflowInt64WithRestResponseAsync() {
        return service.getUnderflowInt64();
    }

    /**
     * Get underflow Int64 value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<Long> getUnderflowInt64Async() {
        return getUnderflowInt64WithRestResponseAsync()
            .flatMapMaybe((BodyResponse<Long> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putMax32(@NonNull int intBody) {
        putMax32Async(intBody).blockingAwait();
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putMax32Async(@NonNull int intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMax32Async(intBody), serviceCallback);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putMax32WithRestResponseAsync(@NonNull int intBody) {
        return service.putMax32(intBody);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putMax32Async(@NonNull int intBody) {
        return putMax32WithRestResponseAsync(intBody)
            .toCompletable();
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putMax64(@NonNull long intBody) {
        putMax64Async(intBody).blockingAwait();
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putMax64Async(@NonNull long intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMax64Async(intBody), serviceCallback);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putMax64WithRestResponseAsync(@NonNull long intBody) {
        return service.putMax64(intBody);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putMax64Async(@NonNull long intBody) {
        return putMax64WithRestResponseAsync(intBody)
            .toCompletable();
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putMin32(@NonNull int intBody) {
        putMin32Async(intBody).blockingAwait();
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putMin32Async(@NonNull int intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMin32Async(intBody), serviceCallback);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putMin32WithRestResponseAsync(@NonNull int intBody) {
        return service.putMin32(intBody);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putMin32Async(@NonNull int intBody) {
        return putMin32WithRestResponseAsync(intBody)
            .toCompletable();
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putMin64(@NonNull long intBody) {
        putMin64Async(intBody).blockingAwait();
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putMin64Async(@NonNull long intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putMin64Async(intBody), serviceCallback);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putMin64WithRestResponseAsync(@NonNull long intBody) {
        return service.putMin64(intBody);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putMin64Async(@NonNull long intBody) {
        return putMin64WithRestResponseAsync(intBody)
            .toCompletable();
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getUnixTime() {
        return getUnixTimeAsync().blockingGet();
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<DateTime> getUnixTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<DateTime>> getUnixTimeWithRestResponseAsync() {
        return service.getUnixTime();
    }

    /**
     * Get datetime encoded as Unix time value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<DateTime> getUnixTimeAsync() {
        return getUnixTimeWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<DateTime> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void putUnixTimeDate(@NonNull DateTime intBody) {
        putUnixTimeDateAsync(intBody).blockingAwait();
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the DateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> putUnixTimeDateAsync(@NonNull DateTime intBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putUnixTimeDateAsync(intBody), serviceCallback);
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> putUnixTimeDateWithRestResponseAsync(@NonNull DateTime intBody) {
        Long intBodyConverted = intBody.toDateTime(DateTimeZone.UTC).getMillis() / 1000;
        return service.putUnixTimeDate(intBodyConverted);
    }

    /**
     * Put datetime encoded as Unix time.
     *
     * @param intBody the DateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable putUnixTimeDateAsync(@NonNull DateTime intBody) {
        return putUnixTimeDateWithRestResponseAsync(intBody)
            .toCompletable();
    }

    /**
     * Get invalid Unix time value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getInvalidUnixTime() {
        return getInvalidUnixTimeAsync().blockingGet();
    }

    /**
     * Get invalid Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<DateTime> getInvalidUnixTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getInvalidUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get invalid Unix time value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<DateTime>> getInvalidUnixTimeWithRestResponseAsync() {
        return service.getInvalidUnixTime();
    }

    /**
     * Get invalid Unix time value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<DateTime> getInvalidUnixTimeAsync() {
        return getInvalidUnixTimeWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<DateTime> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Get null Unix time value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateTime object if successful.
     */
    public DateTime getNullUnixTime() {
        return getNullUnixTimeAsync().blockingGet();
    }

    /**
     * Get null Unix time value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<DateTime> getNullUnixTimeAsync(ServiceCallback<DateTime> serviceCallback) {
        return ServiceFuture.fromBody(getNullUnixTimeAsync(), serviceCallback);
    }

    /**
     * Get null Unix time value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<DateTime>> getNullUnixTimeWithRestResponseAsync() {
        return service.getNullUnixTime();
    }

    /**
     * Get null Unix time value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<DateTime> getNullUnixTimeAsync() {
        return getNullUnixTimeWithRestResponseAsync()
            .flatMapMaybe((BodyResponse<DateTime> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
