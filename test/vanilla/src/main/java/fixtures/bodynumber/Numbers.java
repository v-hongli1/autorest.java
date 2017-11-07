/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodynumber;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodynumber.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * An instance of this class provides access to all the operations defined in
 * Numbers.
 */
public interface Numbers {
    /**
     * Get null Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getNull();

    /**
     * Get null Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getNullAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get null Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getNullAsync();

    /**
     * Get null Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getNullWithRestResponseAsync();

    /**
     * Get invalid float Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getInvalidFloat();

    /**
     * Get invalid float Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getInvalidFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid float Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getInvalidFloatAsync();

    /**
     * Get invalid float Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getInvalidFloatWithRestResponseAsync();

    /**
     * Get invalid double Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getInvalidDouble();

    /**
     * Get invalid double Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getInvalidDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get invalid double Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getInvalidDoubleAsync();

    /**
     * Get invalid double Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getInvalidDoubleWithRestResponseAsync();

    /**
     * Get invalid decimal Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BigDecimal object if successful.
     */
    BigDecimal getInvalidDecimal();

    /**
     * Get invalid decimal Number value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;BigDecimal&gt;} object
     */
    ServiceFuture<BigDecimal> getInvalidDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get invalid decimal Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;BigDecimal&gt;} object if successful.
     */
    Single<BigDecimal> getInvalidDecimalAsync();

    /**
     * Get invalid decimal Number value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, BigDecimal&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, BigDecimal>> getInvalidDecimalWithRestResponseAsync();

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putBigFloat(double numberBody);

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putBigFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putBigFloatAsync(double numberBody);

    /**
     * Put big float value 3.402823e+20.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putBigFloatWithRestResponseAsync(double numberBody);

    /**
     * Get big float value 3.402823e+20.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getBigFloat();

    /**
     * Get big float value 3.402823e+20.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getBigFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big float value 3.402823e+20.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getBigFloatAsync();

    /**
     * Get big float value 3.402823e+20.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getBigFloatWithRestResponseAsync();

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putBigDouble(double numberBody);

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putBigDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putBigDoubleAsync(double numberBody);

    /**
     * Put big double value 2.5976931e+101.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putBigDoubleWithRestResponseAsync(double numberBody);

    /**
     * Get big double value 2.5976931e+101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getBigDouble();

    /**
     * Get big double value 2.5976931e+101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getBigDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value 2.5976931e+101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getBigDoubleAsync();

    /**
     * Get big double value 2.5976931e+101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getBigDoubleWithRestResponseAsync();

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putBigDoublePositiveDecimal(double numberBody);

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putBigDoublePositiveDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putBigDoublePositiveDecimalAsync(double numberBody);

    /**
     * Put big double value 99999999.99.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putBigDoublePositiveDecimalWithRestResponseAsync(double numberBody);

    /**
     * Get big double value 99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getBigDoublePositiveDecimal();

    /**
     * Get big double value 99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getBigDoublePositiveDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value 99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getBigDoublePositiveDecimalAsync();

    /**
     * Get big double value 99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getBigDoublePositiveDecimalWithRestResponseAsync();

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putBigDoubleNegativeDecimal(double numberBody);

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putBigDoubleNegativeDecimalAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putBigDoubleNegativeDecimalAsync(double numberBody);

    /**
     * Put big double value -99999999.99.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putBigDoubleNegativeDecimalWithRestResponseAsync(double numberBody);

    /**
     * Get big double value -99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getBigDoubleNegativeDecimal();

    /**
     * Get big double value -99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getBigDoubleNegativeDecimalAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value -99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getBigDoubleNegativeDecimalAsync();

    /**
     * Get big double value -99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getBigDoubleNegativeDecimalWithRestResponseAsync();

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putBigDecimal(BigDecimal numberBody);

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putBigDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putBigDecimalAsync(BigDecimal numberBody);

    /**
     * Put big decimal value 2.5976931e+101.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putBigDecimalWithRestResponseAsync(BigDecimal numberBody);

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BigDecimal object if successful.
     */
    BigDecimal getBigDecimal();

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;BigDecimal&gt;} object
     */
    ServiceFuture<BigDecimal> getBigDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;BigDecimal&gt;} object if successful.
     */
    Single<BigDecimal> getBigDecimalAsync();

    /**
     * Get big decimal value 2.5976931e+101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, BigDecimal&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, BigDecimal>> getBigDecimalWithRestResponseAsync();

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putBigDecimalPositiveDecimal(BigDecimal numberBody);

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putBigDecimalPositiveDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putBigDecimalPositiveDecimalAsync(BigDecimal numberBody);

    /**
     * Put big decimal value 99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putBigDecimalPositiveDecimalWithRestResponseAsync(BigDecimal numberBody);

    /**
     * Get big decimal value 99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BigDecimal object if successful.
     */
    BigDecimal getBigDecimalPositiveDecimal();

    /**
     * Get big decimal value 99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;BigDecimal&gt;} object
     */
    ServiceFuture<BigDecimal> getBigDecimalPositiveDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get big decimal value 99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;BigDecimal&gt;} object if successful.
     */
    Single<BigDecimal> getBigDecimalPositiveDecimalAsync();

    /**
     * Get big decimal value 99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, BigDecimal&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, BigDecimal>> getBigDecimalPositiveDecimalWithRestResponseAsync();

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putBigDecimalNegativeDecimal(BigDecimal numberBody);

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putBigDecimalNegativeDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putBigDecimalNegativeDecimalAsync(BigDecimal numberBody);

    /**
     * Put big decimal value -99999999.99.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putBigDecimalNegativeDecimalWithRestResponseAsync(BigDecimal numberBody);

    /**
     * Get big decimal value -99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BigDecimal object if successful.
     */
    BigDecimal getBigDecimalNegativeDecimal();

    /**
     * Get big decimal value -99999999.99.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;BigDecimal&gt;} object
     */
    ServiceFuture<BigDecimal> getBigDecimalNegativeDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get big decimal value -99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;BigDecimal&gt;} object if successful.
     */
    Single<BigDecimal> getBigDecimalNegativeDecimalAsync();

    /**
     * Get big decimal value -99999999.99.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, BigDecimal&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, BigDecimal>> getBigDecimalNegativeDecimalWithRestResponseAsync();

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putSmallFloat(double numberBody);

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putSmallFloatAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putSmallFloatAsync(double numberBody);

    /**
     * Put small float value 3.402823e-20.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putSmallFloatWithRestResponseAsync(double numberBody);

    /**
     * Get big double value 3.402823e-20.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getSmallFloat();

    /**
     * Get big double value 3.402823e-20.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getSmallFloatAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value 3.402823e-20.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getSmallFloatAsync();

    /**
     * Get big double value 3.402823e-20.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getSmallFloatWithRestResponseAsync();

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putSmallDouble(double numberBody);

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putSmallDoubleAsync(double numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putSmallDoubleAsync(double numberBody);

    /**
     * Put small double value 2.5976931e-101.
     *
     * @param numberBody the double value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putSmallDoubleWithRestResponseAsync(double numberBody);

    /**
     * Get big double value 2.5976931e-101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the double object if successful.
     */
    double getSmallDouble();

    /**
     * Get big double value 2.5976931e-101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Double&gt;} object
     */
    ServiceFuture<Double> getSmallDoubleAsync(final ServiceCallback<Double> serviceCallback);

    /**
     * Get big double value 2.5976931e-101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;Double&gt;} object if successful.
     */
    Single<Double> getSmallDoubleAsync();

    /**
     * Get big double value 2.5976931e-101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Double&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Double>> getSmallDoubleWithRestResponseAsync();

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putSmallDecimal(BigDecimal numberBody);

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putSmallDecimalAsync(BigDecimal numberBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putSmallDecimalAsync(BigDecimal numberBody);

    /**
     * Put small decimal value 2.5976931e-101.
     *
     * @param numberBody the BigDecimal value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putSmallDecimalWithRestResponseAsync(BigDecimal numberBody);

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BigDecimal object if successful.
     */
    BigDecimal getSmallDecimal();

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;BigDecimal&gt;} object
     */
    ServiceFuture<BigDecimal> getSmallDecimalAsync(final ServiceCallback<BigDecimal> serviceCallback);

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;BigDecimal&gt;} object if successful.
     */
    Single<BigDecimal> getSmallDecimalAsync();

    /**
     * Get small decimal value 2.5976931e-101.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, BigDecimal&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, BigDecimal>> getSmallDecimalWithRestResponseAsync();

}
