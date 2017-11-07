/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import com.microsoft.rest.v2.RestClient;
import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceClient;
import fixtures.bodystring.AutoRestSwaggerBATService;
import fixtures.bodystring.Enums;
import fixtures.bodystring.Strings;
import io.reactivex.Single;

/**
 * Initializes a new instance of the AutoRestSwaggerBATService class.
 */
public class AutoRestSwaggerBATServiceImpl extends ServiceClient implements AutoRestSwaggerBATService {

    /**
     * The Strings object to access its operations.
     */
    private Strings strings;

    /**
     * Gets the Strings object to access its operations.
     * @return the Strings object.
     */
    public Strings strings() {
        return this.strings;
    }

    /**
     * The Enums object to access its operations.
     */
    private Enums enums;

    /**
     * Gets the Enums object to access its operations.
     * @return the Enums object.
     */
    public Enums enums() {
        return this.enums;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestSwaggerBATServiceImpl(String baseUrl) {
        super(baseUrl);
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     */
    public AutoRestSwaggerBATServiceImpl() {
        this("http://localhost");
        initialize();
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param restClient the REST client containing pre-configured settings
     */
    public AutoRestSwaggerBATServiceImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    private void initialize() {
        this.strings = new StringsImpl(this);
        this.enums = new EnumsImpl(this);
    }
}
