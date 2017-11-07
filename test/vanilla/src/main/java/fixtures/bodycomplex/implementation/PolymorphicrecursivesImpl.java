/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodycomplex.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import fixtures.bodycomplex.Polymorphicrecursives;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Headers;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import com.microsoft.rest.v2.http.HttpClient;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import fixtures.bodycomplex.models.ErrorException;
import fixtures.bodycomplex.models.Fish;
import io.reactivex.Completable;
import io.reactivex.functions.Function;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in Polymorphicrecursives.
 */
public class PolymorphicrecursivesImpl implements Polymorphicrecursives {
    /** The RestProxy service to perform REST calls. */
    private PolymorphicrecursivesService service;
    /** The service client containing this operation class. */
    private AutoRestComplexTestServiceImpl client;

    /**
     * Initializes an instance of Polymorphicrecursives.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PolymorphicrecursivesImpl(AutoRestComplexTestServiceImpl client) {
        this.service = RestProxy.create(PolymorphicrecursivesService.class, client.restClient().baseURL(), client.httpClient(), client.serializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for Polymorphicrecursives to be
     * used by RestProxy to perform REST calls.
    */
    @Host("http://localhost")
    interface PolymorphicrecursivesService {
        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Polymorphicrecursives getValid" })
        @GET("complex/polymorphicrecursive/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Fish>> getValid();

        @Headers({ "x-ms-logging-context: fixtures.bodycomplex.Polymorphicrecursives putValid" })
        @PUT("complex/polymorphicrecursive/valid")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> putValid(@BodyParam("application/json; charset=utf-8") Fish complexBody);

    }

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Fish object if successful.
     */
    public Fish getValid() {
        return getValidAsync().blockingGet();
    }

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Fish> getValidAsync(ServiceCallback<Fish> serviceCallback) {
        return ServiceFuture.fromBody(getValidAsync(), serviceCallback);
    }

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Fish> object
     */
    public Single<RestResponse<Void, Fish>> getValidWithRestResponseAsync() {
        return service.getValid();
    }

    /**
     * Get complex types that are polymorphic and have recursive references.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Fish> object
     */
    public Single<Fish> getValidAsync() {
        return getValidWithRestResponseAsync()
            .map(new Function<RestResponse<Void, Fish>, Fish>() { public Fish apply(RestResponse<Void, Fish> restResponse) { return restResponse.body(); } });
        }


    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
    {
        "fishtype": "salmon",
        "species": "king",
        "length": 1,
        "age": 1,
        "location": "alaska",
        "iswild": true,
        "siblings": [
            {
                "fishtype": "shark",
                "species": "predator",
                "length": 20,
                "age": 6,
                "siblings": [
                    {
                        "fishtype": "salmon",
                        "species": "coho",
                        "length": 2,
                        "age": 2,
                        "location": "atlantic",
                        "iswild": true,
                        "siblings": [
                            {
                                "fishtype": "shark",
                                "species": "predator",
                                "length": 20,
                                "age": 6
                            },
                            {
                                "fishtype": "sawshark",
                                "species": "dangerous",
                                "length": 10,
                                "age": 105
                            }
                        ]
                    },
                    {
                        "fishtype": "sawshark",
                        "species": "dangerous",
                        "length": 10,
                        "age": 105
                    }
                ]
            },
            {
                "fishtype": "sawshark",
                "species": "dangerous",
                "length": 10,
                "age": 105
            }
        ]
    }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the void object if successful.
     */
    public void putValid(Fish complexBody) {
        putValidAsync(complexBody).blockingGet();
    }

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
    {
        "fishtype": "salmon",
        "species": "king",
        "length": 1,
        "age": 1,
        "location": "alaska",
        "iswild": true,
        "siblings": [
            {
                "fishtype": "shark",
                "species": "predator",
                "length": 20,
                "age": 6,
                "siblings": [
                    {
                        "fishtype": "salmon",
                        "species": "coho",
                        "length": 2,
                        "age": 2,
                        "location": "atlantic",
                        "iswild": true,
                        "siblings": [
                            {
                                "fishtype": "shark",
                                "species": "predator",
                                "length": 20,
                                "age": 6
                            },
                            {
                                "fishtype": "sawshark",
                                "species": "dangerous",
                                "length": 10,
                                "age": 105
                            }
                        ]
                    },
                    {
                        "fishtype": "sawshark",
                        "species": "dangerous",
                        "length": 10,
                        "age": 105
                    }
                ]
            },
            {
                "fishtype": "sawshark",
                "species": "dangerous",
                "length": 10,
                "age": 105
            }
        ]
    }
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> putValidAsync(Fish complexBody, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(putValidAsync(complexBody), serviceCallback);
    }

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
    {
        "fishtype": "salmon",
        "species": "king",
        "length": 1,
        "age": 1,
        "location": "alaska",
        "iswild": true,
        "siblings": [
            {
                "fishtype": "shark",
                "species": "predator",
                "length": 20,
                "age": 6,
                "siblings": [
                    {
                        "fishtype": "salmon",
                        "species": "coho",
                        "length": 2,
                        "age": 2,
                        "location": "atlantic",
                        "iswild": true,
                        "siblings": [
                            {
                                "fishtype": "shark",
                                "species": "predator",
                                "length": 20,
                                "age": 6
                            },
                            {
                                "fishtype": "sawshark",
                                "species": "dangerous",
                                "length": 10,
                                "age": 105
                            }
                        ]
                    },
                    {
                        "fishtype": "sawshark",
                        "species": "dangerous",
                        "length": 10,
                        "age": 105
                    }
                ]
            },
            {
                "fishtype": "sawshark",
                "species": "dangerous",
                "length": 10,
                "age": 105
            }
        ]
    }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Single<RestResponse<Void, Void>> putValidWithRestResponseAsync(Fish complexBody) {
        if (complexBody == null) {
            throw new IllegalArgumentException("Parameter complexBody is required and cannot be null.");
        }
        Validator.validate(complexBody);
        return service.putValid(complexBody);
    }

    /**
     * Put complex types that are polymorphic and have recursive references.
     *
     * @param complexBody Please put a salmon that looks like this:
    {
        "fishtype": "salmon",
        "species": "king",
        "length": 1,
        "age": 1,
        "location": "alaska",
        "iswild": true,
        "siblings": [
            {
                "fishtype": "shark",
                "species": "predator",
                "length": 20,
                "age": 6,
                "siblings": [
                    {
                        "fishtype": "salmon",
                        "species": "coho",
                        "length": 2,
                        "age": 2,
                        "location": "atlantic",
                        "iswild": true,
                        "siblings": [
                            {
                                "fishtype": "shark",
                                "species": "predator",
                                "length": 20,
                                "age": 6
                            },
                            {
                                "fishtype": "sawshark",
                                "species": "dangerous",
                                "length": 10,
                                "age": 105
                            }
                        ]
                    },
                    {
                        "fishtype": "sawshark",
                        "species": "dangerous",
                        "length": 10,
                        "age": 105
                    }
                ]
            },
            {
                "fishtype": "sawshark",
                "species": "dangerous",
                "length": 10,
                "age": 105
            }
        ]
    }
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return a {@link Single} emitting the RestResponse<Void, Void> object
     */
    public Completable putValidAsync(Fish complexBody) {
        return putValidWithRestResponseAsync(complexBody)
            .toCompletable();
        }


}
