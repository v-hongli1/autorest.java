/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.AzureServiceClient;
import com.microsoft.rest.v2.RestClient;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.credentials.ServiceClientCredentials;
import fixtures.paging.AutoRestPagingTestService;
import fixtures.paging.Pagings;
import io.reactivex.Single;

/**
 * Initializes a new instance of the AutoRestPagingTestService class.
 */
public class AutoRestPagingTestServiceImpl extends ServiceClient implements AutoRestPagingTestService {

    /** Credentials needed for the client to connect to Azure. */
    private ServiceClientCredentials credentials;

    /**
     * Gets Credentials needed for the client to connect to Azure.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials credentials() {
        return this.credentials;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public AutoRestPagingTestServiceImpl withacceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public AutoRestPagingTestServiceImpl withlongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public AutoRestPagingTestServiceImpl withgenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The Pagings object to access its operations.
     */
    private Pagings pagings;

    /**
     * Gets the Pagings object to access its operations.
     * @return the Pagings object.
     */
    public Pagings pagings() {
        return this.pagings;
    }

    /**
     * Initializes an instance of AutoRestPagingTestService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestPagingTestServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestPagingTestService client.
     */
    public AutoRestPagingTestServiceImpl() {
        this("http://localhost");
        initialize();
    }

    /**
     * Initializes an instance of AutoRestPagingTestService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestPagingTestServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.pagings = new PagingsImpl(this);
    }
}
