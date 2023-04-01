// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.lro.core;

import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.SyncPoller;

import com.azure.lro.core.models.OperationState;
import com.azure.lro.core.models.ResourceOperationStatusUserError;
import com.azure.lro.core.models.ResourceOperationStatusUserExportedUserError;
import com.azure.lro.core.models.User;
import com.azure.lro.rpc.RpcClient;
import com.azure.lro.rpc.RpcClientBuilder;
import com.azure.lro.rpc.models.JobData;
import com.azure.lro.rpc.models.JobPollResult;
import com.azure.lro.rpc.models.JobResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LroCoreTests {

    private CoreClient client = new CoreClientBuilder()
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .buildClient();

    @Disabled("PR https://github.com/Azure/azure-sdk-for-java/pull/34174")
    @Test
    public void testPut() {
        SyncPoller<ResourceOperationStatusUserError, User> poller = client.beginCreateOrReplace(
                "madge", new User("contributor"));

        PollResponse<ResourceOperationStatusUserError> response = poller.waitForCompletion();
        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.getStatus());

        User user = poller.getFinalResult();
        Assertions.assertEquals("madge", user.getName());
    }

    @Test
    public void testPutProtocol() {
        SyncPoller<BinaryData, BinaryData> poller = client.beginCreateOrReplace(
                "madge", BinaryData.fromObject(new User("contributor")), null);

        PollResponse<BinaryData> response = poller.waitForCompletion();
        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.getStatus());

        BinaryData finalResult = poller.getFinalResult();
        User user = finalResult.toObject(User.class);
        Assertions.assertEquals("madge", user.getName());
    }

    @Test
    public void testDelete() {
        SyncPoller<ResourceOperationStatusUserError, Void> poller = client.beginDelete("madge");

        PollResponse<ResourceOperationStatusUserError> response = poller.waitForCompletion();
        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.getStatus());
        Assertions.assertEquals(OperationState.SUCCEEDED, response.getValue().getStatus());
    }

    @Test
    public void testPost() {
        SyncPoller<ResourceOperationStatusUserExportedUserError, ResourceOperationStatusUserExportedUserError> poller = client.beginExport(
                "madge", "json");

        PollResponse<ResourceOperationStatusUserExportedUserError> response = poller.waitForCompletion();
        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.getStatus());
        Assertions.assertEquals(OperationState.SUCCEEDED, response.getValue().getStatus());
        Assertions.assertNotNull(response.getValue().getResult());

        ResourceOperationStatusUserExportedUserError finalResult = poller.getFinalResult();
        Assertions.assertEquals(OperationState.SUCCEEDED, finalResult.getStatus());
        Assertions.assertNotNull(finalResult.getResult());
    }

    @Test
    public void testRpc() {
        RpcClient client = new RpcClientBuilder()
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .buildClient();

        SyncPoller<JobResult, JobResult> poller = client.beginCreateJob(new JobData("async job"));

        PollResponse<JobResult> response = poller.waitForCompletion();

        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.getStatus());
        Assertions.assertEquals(com.azure.lro.rpc.models.OperationState.SUCCEEDED, response.getValue().getStatus());
        Assertions.assertNotNull(response.getValue().getResults());

        JobResult finalResult = poller.getFinalResult();
        Assertions.assertEquals(com.azure.lro.rpc.models.OperationState.SUCCEEDED, finalResult.getStatus());
        Assertions.assertNotNull(finalResult.getResults());
    }

    @Test
    public void testRpcFinalOnLocation() {
        RpcClient client = new RpcClientBuilder()
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
                .buildClient();

        SyncPoller<JobPollResult, JobResult> poller = client.beginCreateJobFinalOnLocation(new JobData("async job"));

        PollResponse<JobPollResult> response = poller.waitForCompletion();

        Assertions.assertEquals(LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.getStatus());
        Assertions.assertEquals(com.azure.lro.rpc.models.OperationState.SUCCEEDED, response.getValue().getStatus());

        JobResult finalResult = poller.getFinalResult();
        Assertions.assertEquals(com.azure.lro.rpc.models.OperationState.SUCCEEDED, finalResult.getStatus());
        Assertions.assertNotNull(finalResult.getResults());
    }
}