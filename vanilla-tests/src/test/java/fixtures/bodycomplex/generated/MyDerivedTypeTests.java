// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.MyDerivedType;
import org.junit.jupiter.api.Assertions;

public final class MyDerivedTypeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MyDerivedType model = BinaryData
            .fromString(
                "{\"kind\":\"Kind1\",\"propD1\":\"xo\",\"propB1\":\"jionpimexgstxgc\",\"helper\":{\"propBH1\":\"dg\"}}")
            .toObject(MyDerivedType.class);
        Assertions.assertEquals("jionpimexgstxgc", model.getPropB1());
        Assertions.assertEquals("xo", model.getPropD1());
    }
}
