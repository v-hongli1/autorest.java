// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com._specs_.azure.clientgenerator.core.access.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com._specs_.azure.clientgenerator.core.access.AccessClientBuilder;
import com._specs_.azure.clientgenerator.core.access.InternalOperationClient;
import com._specs_.azure.clientgenerator.core.access.PublicOperationClient;
import com._specs_.azure.clientgenerator.core.access.RelativeModelInOperationClient;
import com._specs_.azure.clientgenerator.core.access.SharedModelInOperationClient;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;

class AccessClientTestBase extends TestProxyTestBase {
    protected PublicOperationClient publicOperationClient;

    protected InternalOperationClient internalOperationClient;

    protected SharedModelInOperationClient sharedModelInOperationClient;

    protected RelativeModelInOperationClient relativeModelInOperationClient;

    @Override
    protected void beforeTest() {
        AccessClientBuilder publicOperationClientbuilder =
                new AccessClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            publicOperationClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            publicOperationClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        publicOperationClient = publicOperationClientbuilder.buildPublicOperationClient();

        AccessClientBuilder internalOperationClientbuilder =
                new AccessClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            internalOperationClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            internalOperationClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        internalOperationClient = internalOperationClientbuilder.buildInternalOperationClient();

        AccessClientBuilder sharedModelInOperationClientbuilder =
                new AccessClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            sharedModelInOperationClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            sharedModelInOperationClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        sharedModelInOperationClient = sharedModelInOperationClientbuilder.buildSharedModelInOperationClient();

        AccessClientBuilder relativeModelInOperationClientbuilder =
                new AccessClientBuilder()
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            relativeModelInOperationClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            relativeModelInOperationClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        relativeModelInOperationClient = relativeModelInOperationClientbuilder.buildRelativeModelInOperationClient();
    }
}