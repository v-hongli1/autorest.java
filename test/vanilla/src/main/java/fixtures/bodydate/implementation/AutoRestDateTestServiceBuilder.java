// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.bodydate.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.implementation.RestProxy;
import com.azure.core.implementation.annotation.ServiceClientBuilder;
import fixtures.bodydate.AutoRestDateTestService;
import fixtures.bodydate.Dates;

/**
 * A builder for creating a new instance of the AutoRestDateTestService type.
 */
@ServiceClientBuilder(serviceClients = AutoRestDateTestService.class)
public final class AutoRestDateTestServiceBuilder {
    /*
     * The HTTP pipeline to send requests through
     */
    private HttpPipeline pipeline;

    /**
     * Sets The HTTP pipeline to send requests through.
     *
     * @param pipeline the pipeline value.
     * @return the AutoRestDateTestServiceBuilder.
     */
    public AutoRestDateTestServiceBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Builds an instance of AutoRestDateTestService with the provided parameters.
     *
     * @return an instance of AutoRestDateTestService.
     */
    public AutoRestDateTestService build() {
        if (pipeline == null) {
            this.pipeline = RestProxy.createDefaultPipeline();
        }
        AutoRestDateTestServiceImpl client = new AutoRestDateTestServiceImpl(pipeline);
        return client;
    }
}
