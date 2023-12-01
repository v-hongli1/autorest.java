// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.type.property.optional;

import com.type.property.optional.models.UnionIntLiteralProperty;
import com.type.property.optional.models.UnionIntLiteralPropertyProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UnionIntLiteralClientTests {
    UnionIntLiteralClient client = new OptionalClientBuilder().buildUnionIntLiteralClient();

    @Test
    void getAll() {
        UnionIntLiteralProperty unionIntLiteralProperty = client.getAll();
        Assertions.assertEquals(UnionIntLiteralPropertyProperty.TWO, unionIntLiteralProperty.getProperty());
    }

    @Test
    void getDefault() {
        UnionIntLiteralProperty unionIntLiteralProperty = client.getDefault();
        Assertions.assertNull(unionIntLiteralProperty.getProperty());
    }

    @Test
    void putAll() {
        UnionIntLiteralProperty unionIntLiteralProperty = new UnionIntLiteralProperty();
        unionIntLiteralProperty.setProperty(UnionIntLiteralPropertyProperty.TWO);
        client.putAll(unionIntLiteralProperty);
    }

    @Test
    @Disabled("NullPointer Cannot invoke \"java.lang.Long.longValue()\"")
    void putDefault() {
        UnionIntLiteralProperty unionIntLiteralProperty = new UnionIntLiteralProperty();
        client.putDefault(unionIntLiteralProperty);
    }
}
