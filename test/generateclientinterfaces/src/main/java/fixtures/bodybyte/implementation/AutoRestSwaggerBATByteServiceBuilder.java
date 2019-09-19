// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.bodybyte.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.annotation.ServiceClientBuilder;

/**
 * A builder for creating a new instance of the AutoRestSwaggerBATByteService type.
 */
@ServiceClientBuilder(serviceClients = AutoRestSwaggerBATByteServiceImpl.class)
public final class AutoRestSwaggerBATByteServiceBuilder {
    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AutoRestSwaggerBATByteServiceBuilder.
     */
    public AutoRestSwaggerBATByteServiceBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AutoRestSwaggerBATByteServiceImpl with the provided parameters.
     *
     * @return an instance of AutoRestSwaggerBATByteServiceImpl.
     */
    public AutoRestSwaggerBATByteServiceImpl build() {
        if (pipeline == null) {
            this.pipeline = RestProxy.createDefaultPipeline();
        }
        AutoRestSwaggerBATByteServiceImpl client = new AutoRestSwaggerBATByteServiceImpl(pipeline);
        return client;
    }
}
