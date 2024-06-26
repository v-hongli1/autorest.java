// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armstreamstyleserialization.generated;

import com.azure.core.util.BinaryData;
import com.cadl.armstreamstyleserialization.models.TopLevelArmResourceTagsUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TopLevelArmResourceTagsUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopLevelArmResourceTagsUpdate model = BinaryData.fromString(
            "{\"tags\":{\"ooojywifsqe\":\"jnqglhqgnu\",\"zlhjxrifkwmrvkt\":\"aagdfmg\",\"ajpsquc\":\"izntocipao\",\"gjofjd\":\"poyfdkfogkn\"}}")
            .toObject(TopLevelArmResourceTagsUpdate.class);
        Assertions.assertEquals("jnqglhqgnu", model.tags().get("ooojywifsqe"));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopLevelArmResourceTagsUpdate model = new TopLevelArmResourceTagsUpdate().withTags(mapOf("ooojywifsqe",
            "jnqglhqgnu", "zlhjxrifkwmrvkt", "aagdfmg", "ajpsquc", "izntocipao", "gjofjd", "poyfdkfogkn"));
        model = BinaryData.fromObject(model).toObject(TopLevelArmResourceTagsUpdate.class);
        Assertions.assertEquals("jnqglhqgnu", model.tags().get("ooojywifsqe"));
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
