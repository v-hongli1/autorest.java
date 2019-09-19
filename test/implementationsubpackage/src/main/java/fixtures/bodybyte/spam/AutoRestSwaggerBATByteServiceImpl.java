// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.bodybyte.spam;

import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;
import fixtures.bodybyte.AutoRestSwaggerBATByteService;
import fixtures.bodybyte.Bytes;

/**
 * Initializes a new instance of the AutoRestSwaggerBATByteService type.
 */
public final class AutoRestSwaggerBATByteServiceImpl implements AutoRestSwaggerBATByteService {
    /**
     * The HTTP pipeline to send requests through.
     */
    private HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The Bytes object to access its operations.
     */
    private Bytes bytes;

    /**
     * Gets the Bytes object to access its operations.
     *
     * @return the Bytes object.
     */
    public Bytes bytes() {
        return this.bytes;
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATByteService client.
     */
    public AutoRestSwaggerBATByteServiceImpl() {
        this(RestProxy.createDefaultPipeline());
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATByteService client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     */
    public AutoRestSwaggerBATByteServiceImpl(HttpPipeline httpPipeline) {
        this.httpPipeline = httpPipeline;
        this.bytes = new BytesImpl(this);
    }
}
