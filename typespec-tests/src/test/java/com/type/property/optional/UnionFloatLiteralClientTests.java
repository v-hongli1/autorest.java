// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.type.property.optional;

import com.type.property.optional.models.UnionFloatLiteralProperty;
import com.type.property.optional.models.UnionFloatLiteralPropertyProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnionFloatLiteralClientTests {
    UnionFloatLiteralClient client = new OptionalClientBuilder().buildUnionFloatLiteralClient();

    @Test
    void getAll() {
        UnionFloatLiteralProperty unionFloatLiteralProperty = client.getAll();
        Assertions.assertEquals(UnionFloatLiteralPropertyProperty.TWO3, unionFloatLiteralProperty.getProperty());
    }

    @Test
    void getDefault() {
        UnionFloatLiteralProperty unionFloatLiteralProperty = client.getDefault();
        Assertions.assertNull(unionFloatLiteralProperty.getProperty());
    }

    @Test
    void putAll() {
        UnionFloatLiteralProperty unionFloatLiteralProperty = new UnionFloatLiteralProperty();
        unionFloatLiteralProperty.setProperty(UnionFloatLiteralPropertyProperty.TWO3);
        client.putAll(unionFloatLiteralProperty);
    }

    @Test
    void putDefault() {
        UnionFloatLiteralProperty unionFloatLiteralProperty = new UnionFloatLiteralProperty();
        client.putDefault(unionFloatLiteralProperty);
    }
}
