// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.armstreamstyleserialization.generated;

import com.azure.core.util.BinaryData;
import com.cadl.armstreamstyleserialization.fluent.models.TopLevelArmResourceInner;
import org.junit.jupiter.api.Assertions;

public final class TopLevelArmResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopLevelArmResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"description\":\"s\"},\"location\":\"eupewnwreitjz\",\"tags\":{\"hs\":\"usarhmofc\",\"xukcdmpar\":\"yurkdtmlxhekuksj\"},\"id\":\"ryuanzwuxzdxtay\",\"name\":\"lhmwhfpmrqobm\",\"type\":\"u\"}")
            .toObject(TopLevelArmResourceInner.class);
        Assertions.assertEquals("eupewnwreitjz", model.location());
        Assertions.assertEquals("usarhmofc", model.tags().get("hs"));
        Assertions.assertEquals("s", model.properties().description());
    }
}
