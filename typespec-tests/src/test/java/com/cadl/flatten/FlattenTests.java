// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.cadl.flatten;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.UrlBuilder;
import com.cadl.flatten.implementation.FlattenClientImpl;
import com.cadl.flatten.models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicReference;

public class FlattenTests {

    @Test
    public void testFlatten() {
        AtomicReference<String> idCaptor = new AtomicReference<>();
        AtomicReference<BinaryData> payloadCaptor = new AtomicReference<>();

        HttpPipeline pipeline = new HttpPipelineBuilder()
            .httpClient(request -> {
                payloadCaptor.set(request.getBodyAsBinaryData());
                idCaptor.set(UrlBuilder.parse(request.getUrl()).getQuery().get("id"));
                return Mono.just(new MockHttpResponse(request, 200));
            })
            .build();
        FlattenClientImpl impl = new FlattenClientImpl(pipeline, "https://localhost",
            FlattenServiceVersion.V2022_06_01_PREVIEW);
        FlattenAsyncClient client = new FlattenAsyncClient(impl);

        client.send("id1", "input1", new User("user1")).block();

        Assertions.assertEquals("id1", idCaptor.get());
        Assertions.assertEquals("{\"input\":\"input1\",\"constant\":\"constant\",\"user\":{\"user\":\"user1\"}}",
            payloadCaptor.get().toString());

        client.send("id2", "input2").block();

        Assertions.assertEquals("id2", idCaptor.get());
        Assertions.assertEquals("{\"input\":\"input2\",\"constant\":\"constant\"}", payloadCaptor.get().toString());
    }
}
