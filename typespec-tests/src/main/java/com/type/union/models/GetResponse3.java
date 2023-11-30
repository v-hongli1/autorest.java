// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The GetResponse3 model.
 */
@Immutable
public final class GetResponse3 implements JsonSerializable<GetResponse3> {
    /*
     * The prop property.
     */
    @Generated
    private final Prop2 prop;

    /**
     * Creates an instance of GetResponse3 class.
     * 
     * @param prop the prop value to set.
     */
    @Generated
    private GetResponse3(Prop2 prop) {
        this.prop = prop;
    }

    /**
     * Get the prop property: The prop property.
     * 
     * @return the prop value.
     */
    @Generated
    public Prop2 getProp() {
        return this.prop;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeLongField("prop", this.prop == null ? null : this.prop.toLong());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetResponse3 from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetResponse3 if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GetResponse3.
     */
    public static GetResponse3 fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Prop2 prop = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("prop".equals(fieldName)) {
                    prop = Prop2.fromLong(reader.getLong());
                } else {
                    reader.skipChildren();
                }
            }
            return new GetResponse3(prop);
        });
    }
}
