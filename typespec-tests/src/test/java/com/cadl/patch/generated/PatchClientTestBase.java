// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.cadl.patch.generated;

import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.cadl.patch.PatchClient;
import com.cadl.patch.PatchClientBuilder;

class PatchClientTestBase extends TestBase {
    protected PatchClient patchClient;

    @Override
    protected void beforeTest() {
        PatchClientBuilder patchClientbuilder =
                new PatchClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            patchClientbuilder.httpClient(interceptorManager.getPlaybackClient());
        } else if (getTestMode() == TestMode.RECORD) {
            patchClientbuilder.addPolicy(interceptorManager.getRecordPolicy());
        }
        patchClient = patchClientbuilder.buildClient();
    }
}