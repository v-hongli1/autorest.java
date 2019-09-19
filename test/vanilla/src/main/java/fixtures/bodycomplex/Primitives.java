// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.bodycomplex;

import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.VoidResponse;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceMethod;
import fixtures.bodycomplex.models.BooleanWrapper;
import fixtures.bodycomplex.models.ByteWrapper;
import fixtures.bodycomplex.models.Datetimerfc1123Wrapper;
import fixtures.bodycomplex.models.DatetimeWrapper;
import fixtures.bodycomplex.models.DateWrapper;
import fixtures.bodycomplex.models.DoubleWrapper;
import fixtures.bodycomplex.models.DurationWrapper;
import fixtures.bodycomplex.models.FloatWrapper;
import fixtures.bodycomplex.models.IntWrapper;
import fixtures.bodycomplex.models.LongWrapper;
import fixtures.bodycomplex.models.StringWrapper;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Primitives.
 */
public interface Primitives {
    /**
     * Get complex types with integer properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IntWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    IntWrapper getInt();

    /**
     * Get complex types with integer properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<IntWrapper>> getIntWithRestResponseAsync();

    /**
     * Get complex types with integer properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<IntWrapper> getIntAsync();

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putInt(IntWrapper complexBody);

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putIntWithRestResponseAsync(IntWrapper complexBody);

    /**
     * Put complex types with integer properties.
     *
     * @param complexBody Please put -1 and 2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putIntAsync(IntWrapper complexBody);

    /**
     * Get complex types with long properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LongWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LongWrapper getLong();

    /**
     * Get complex types with long properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<LongWrapper>> getLongWithRestResponseAsync();

    /**
     * Get complex types with long properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LongWrapper> getLongAsync();

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putLong(LongWrapper complexBody);

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putLongWithRestResponseAsync(LongWrapper complexBody);

    /**
     * Put complex types with long properties.
     *
     * @param complexBody Please put 1099511627775 and -999511627788.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putLongAsync(LongWrapper complexBody);

    /**
     * Get complex types with float properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the FloatWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FloatWrapper getFloat();

    /**
     * Get complex types with float properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<FloatWrapper>> getFloatWithRestResponseAsync();

    /**
     * Get complex types with float properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<FloatWrapper> getFloatAsync();

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putFloat(FloatWrapper complexBody);

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putFloatWithRestResponseAsync(FloatWrapper complexBody);

    /**
     * Put complex types with float properties.
     *
     * @param complexBody Please put 1.05 and -0.003.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putFloatAsync(FloatWrapper complexBody);

    /**
     * Get complex types with double properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DoubleWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DoubleWrapper getDouble();

    /**
     * Get complex types with double properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<DoubleWrapper>> getDoubleWithRestResponseAsync();

    /**
     * Get complex types with double properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DoubleWrapper> getDoubleAsync();

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putDouble(DoubleWrapper complexBody);

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putDoubleWithRestResponseAsync(DoubleWrapper complexBody);

    /**
     * Put complex types with double properties.
     *
     * @param complexBody Please put 3e-100 and -0.000000000000000000000000000000000000000000000000000000005.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putDoubleAsync(DoubleWrapper complexBody);

    /**
     * Get complex types with bool properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the BooleanWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BooleanWrapper getBool();

    /**
     * Get complex types with bool properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<BooleanWrapper>> getBoolWithRestResponseAsync();

    /**
     * Get complex types with bool properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BooleanWrapper> getBoolAsync();

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putBool(BooleanWrapper complexBody);

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putBoolWithRestResponseAsync(BooleanWrapper complexBody);

    /**
     * Put complex types with bool properties.
     *
     * @param complexBody Please put true and false.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putBoolAsync(BooleanWrapper complexBody);

    /**
     * Get complex types with string properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the StringWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StringWrapper getString();

    /**
     * Get complex types with string properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<StringWrapper>> getStringWithRestResponseAsync();

    /**
     * Get complex types with string properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<StringWrapper> getStringAsync();

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putString(StringWrapper complexBody);

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putStringWithRestResponseAsync(StringWrapper complexBody);

    /**
     * Put complex types with string properties.
     *
     * @param complexBody Please put 'goodrequest', '', and null.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putStringAsync(StringWrapper complexBody);

    /**
     * Get complex types with date properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DateWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DateWrapper getDate();

    /**
     * Get complex types with date properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<DateWrapper>> getDateWithRestResponseAsync();

    /**
     * Get complex types with date properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DateWrapper> getDateAsync();

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putDate(DateWrapper complexBody);

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putDateWithRestResponseAsync(DateWrapper complexBody);

    /**
     * Put complex types with date properties.
     *
     * @param complexBody Please put '0001-01-01' and '2016-02-29'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putDateAsync(DateWrapper complexBody);

    /**
     * Get complex types with datetime properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DatetimeWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DatetimeWrapper getDateTime();

    /**
     * Get complex types with datetime properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<DatetimeWrapper>> getDateTimeWithRestResponseAsync();

    /**
     * Get complex types with datetime properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DatetimeWrapper> getDateTimeAsync();

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putDateTime(DatetimeWrapper complexBody);

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putDateTimeWithRestResponseAsync(DatetimeWrapper complexBody);

    /**
     * Put complex types with datetime properties.
     *
     * @param complexBody Please put '0001-01-01T12:00:00-04:00' and '2015-05-18T11:38:00-08:00'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putDateTimeAsync(DatetimeWrapper complexBody);

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Datetimerfc1123Wrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Datetimerfc1123Wrapper getDateTimeRfc1123();

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<Datetimerfc1123Wrapper>> getDateTimeRfc1123WithRestResponseAsync();

    /**
     * Get complex types with datetimeRfc1123 properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Datetimerfc1123Wrapper> getDateTimeRfc1123Async();

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putDateTimeRfc1123(Datetimerfc1123Wrapper complexBody);

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putDateTimeRfc1123WithRestResponseAsync(Datetimerfc1123Wrapper complexBody);

    /**
     * Put complex types with datetimeRfc1123 properties.
     *
     * @param complexBody Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and 'Mon, 18 May 2015 11:38:00 GMT'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putDateTimeRfc1123Async(Datetimerfc1123Wrapper complexBody);

    /**
     * Get complex types with duration properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the DurationWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DurationWrapper getDuration();

    /**
     * Get complex types with duration properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<DurationWrapper>> getDurationWithRestResponseAsync();

    /**
     * Get complex types with duration properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DurationWrapper> getDurationAsync();

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putDuration(DurationWrapper complexBody);

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putDurationWithRestResponseAsync(DurationWrapper complexBody);

    /**
     * Put complex types with duration properties.
     *
     * @param complexBody Please put 'P123DT22H14M12.011S'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putDurationAsync(DurationWrapper complexBody);

    /**
     * Get complex types with byte properties.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the ByteWrapper object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ByteWrapper getByte();

    /**
     * Get complex types with byte properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SimpleResponse<ByteWrapper>> getByteWithRestResponseAsync();

    /**
     * Get complex types with byte properties.
     *
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ByteWrapper> getByteAsync();

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void putByte(ByteWrapper complexBody);

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VoidResponse> putByteWithRestResponseAsync(ByteWrapper complexBody);

    /**
     * Put complex types with byte properties.
     *
     * @param complexBody Please put non-ascii byte string hex(FF FE FD FC 00 FA F9 F8 F7 F6).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> putByteAsync(ByteWrapper complexBody);
}
