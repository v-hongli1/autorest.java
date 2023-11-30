// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.optional.models;

import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Defines values for BooleanLiteralProperty1.
 */
public enum BooleanLiteralProperty1 implements JsonSerializable<BooleanLiteralProperty1> {
    /**
     * Enum value true.
     */
    TRUE(true);

    /**
     * The actual serialized value for a BooleanLiteralProperty1 instance.
     */
    private final boolean value;

    BooleanLiteralProperty1(boolean value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a BooleanLiteralProperty1 instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed BooleanLiteralProperty1 object, or null if unable to parse.
     */
    public static BooleanLiteralProperty1 fromBoolean(boolean value) {
        BooleanLiteralProperty1[] items = BooleanLiteralProperty1.values();
        for (BooleanLiteralProperty1 item : items) {
            if (item.toBoolean() == value) {
                return item;
            }
        }
        return null;
    }

    /**
     * De-serializes the instance to boolean value.
     * 
     * @return the boolean value.
     */
    public boolean toBoolean() {
        return this.value;
    }

    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeBoolean(value);
    }

    /**
     * Reads a BooleanLiteralProperty1 from the JSON stream.
     * <p>
     * The passed JsonReader must be positioned at a JsonToken.BOOLEAN value.
     * 
     * @param jsonReader The JsonReader being read.
     * @return The BooleanLiteralProperty1 that the JSON stream represented, may return null.
     * @throws java.io.IOException If a BooleanLiteralProperty1 fails to be read from the JsonReader.
     */
    @Generated
    public static BooleanLiteralProperty1 fromJson(JsonReader jsonReader) throws IOException {
        return fromBoolean(jsonReader.getBoolean());
    }
}
