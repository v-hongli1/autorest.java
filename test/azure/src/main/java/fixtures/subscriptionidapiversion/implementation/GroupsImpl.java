// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package fixtures.subscriptionidapiversion.implementation;

import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.implementation.annotation.ExpectedResponses;
import com.azure.core.implementation.annotation.Get;
import com.azure.core.implementation.annotation.HeaderParam;
import com.azure.core.implementation.annotation.Host;
import com.azure.core.implementation.annotation.PathParam;
import com.azure.core.implementation.annotation.QueryParam;
import com.azure.core.implementation.annotation.ReturnType;
import com.azure.core.implementation.annotation.ServiceInterface;
import com.azure.core.implementation.annotation.ServiceMethod;
import com.azure.core.implementation.annotation.UnexpectedResponseExceptionType;
import com.microsoft.azure.v3.AzureProxy;
import fixtures.subscriptionidapiversion.Groups;
import fixtures.subscriptionidapiversion.models.ErrorException;
import fixtures.subscriptionidapiversion.models.SampleResourceGroup;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * Groups.
 */
public final class GroupsImpl implements Groups {
    /**
     * The proxy service used to perform REST calls.
     */
    private GroupsService service;

    /**
     * The service client containing this operation class.
     */
    private MicrosoftAzureTestUrlImpl client;

    /**
     * Initializes an instance of GroupsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public GroupsImpl(MicrosoftAzureTestUrlImpl client) {
        this.service = AzureProxy.create(GroupsService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftAzureTestUrlGroups
     * to be used by the proxy service to perform REST calls.
     */
    @Host("https://management.azure.com")
    @ServiceInterface(name = "MicrosoftAzureTestUrlGroups")
    private interface GroupsService {
        @Get("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<SampleResourceGroup>> getSampleResourceGroup(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SampleResourceGroup object if successful.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SampleResourceGroup getSampleResourceGroup(String resourceGroupName) {
        return getSampleResourceGroupAsync(resourceGroupName).block();
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<SampleResourceGroup>> getSampleResourceGroupWithRestResponseAsync(String resourceGroupName) {
        return service.getSampleResourceGroup(this.client.getSubscriptionId(), resourceGroupName, this.client.getApiVersion(), this.client.getAcceptLanguage());
    }

    /**
     * Provides a resouce group with name 'testgroup101' and location 'West US'.
     *
     * @param resourceGroupName Resource Group name 'testgroup101'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Mono which performs the network request upon subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SampleResourceGroup> getSampleResourceGroupAsync(String resourceGroupName) {
        return getSampleResourceGroupWithRestResponseAsync(resourceGroupName)
            .flatMap((SimpleResponse<SampleResourceGroup> res) -> Mono.just(res.value()));
    }
}
