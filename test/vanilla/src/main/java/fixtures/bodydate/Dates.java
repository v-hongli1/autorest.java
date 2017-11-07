/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydate;

import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import fixtures.bodydate.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;
import org.joda.time.LocalDate;

/**
 * An instance of this class provides access to all the operations defined in
 * Dates.
 */
public interface Dates {
    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    LocalDate getNull();

    /**
     * Get null date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;LocalDate&gt;} object
     */
    ServiceFuture<LocalDate> getNullAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;LocalDate&gt;} object if successful.
     */
    Single<LocalDate> getNullAsync();

    /**
     * Get null date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, LocalDate&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, LocalDate>> getNullWithRestResponseAsync();

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    LocalDate getInvalidDate();

    /**
     * Get invalid date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;LocalDate&gt;} object
     */
    ServiceFuture<LocalDate> getInvalidDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;LocalDate&gt;} object if successful.
     */
    Single<LocalDate> getInvalidDateAsync();

    /**
     * Get invalid date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, LocalDate&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, LocalDate>> getInvalidDateWithRestResponseAsync();

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    LocalDate getOverflowDate();

    /**
     * Get overflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;LocalDate&gt;} object
     */
    ServiceFuture<LocalDate> getOverflowDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;LocalDate&gt;} object if successful.
     */
    Single<LocalDate> getOverflowDateAsync();

    /**
     * Get overflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, LocalDate&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, LocalDate>> getOverflowDateWithRestResponseAsync();

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    LocalDate getUnderflowDate();

    /**
     * Get underflow date value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;LocalDate&gt;} object
     */
    ServiceFuture<LocalDate> getUnderflowDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;LocalDate&gt;} object if successful.
     */
    Single<LocalDate> getUnderflowDateAsync();

    /**
     * Get underflow date value.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, LocalDate&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, LocalDate>> getUnderflowDateWithRestResponseAsync();

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putMaxDate(LocalDate dateBody);

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putMaxDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putMaxDateAsync(LocalDate dateBody);

    /**
     * Put max date value 9999-12-31.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putMaxDateWithRestResponseAsync(LocalDate dateBody);

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    LocalDate getMaxDate();

    /**
     * Get max date value 9999-12-31.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;LocalDate&gt;} object
     */
    ServiceFuture<LocalDate> getMaxDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;LocalDate&gt;} object if successful.
     */
    Single<LocalDate> getMaxDateAsync();

    /**
     * Get max date value 9999-12-31.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, LocalDate&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, LocalDate>> getMaxDateWithRestResponseAsync();

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void putMinDate(LocalDate dateBody);

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;Void&gt;} object
     */
    ServiceFuture<Void> putMinDateAsync(LocalDate dateBody, final ServiceCallback<Void> serviceCallback);

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Completable} object if successful.
     */
    Completable putMinDateAsync(LocalDate dateBody);

    /**
     * Put min date value 0000-01-01.
     *
     * @param dateBody the LocalDate value
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, Void>> putMinDateWithRestResponseAsync(LocalDate dateBody);

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocalDate object if successful.
     */
    LocalDate getMinDate();

    /**
     * Get min date value 0000-01-01.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture&lt;LocalDate&gt;} object
     */
    ServiceFuture<LocalDate> getMinDateAsync(final ServiceCallback<LocalDate> serviceCallback);

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;LocalDate&gt;} object if successful.
     */
    Single<LocalDate> getMinDateAsync();

    /**
     * Get min date value 0000-01-01.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single&lt;RestResponse&lt;Void, LocalDate&gt;&gt;} object if successful.
     */
    Single<RestResponse<Void, LocalDate>> getMinDateWithRestResponseAsync();

}
