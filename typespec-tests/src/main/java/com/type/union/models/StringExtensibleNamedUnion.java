// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Collection;

/**
 * Defines values for StringExtensibleNamedUnion.
 */
public final class StringExtensibleNamedUnion extends ExpandableStringEnum<StringExtensibleNamedUnion>
    implements JsonSerializable<StringExtensibleNamedUnion> {
    /**
     * Static value b for StringExtensibleNamedUnion.
     */
    @Generated
    public static final StringExtensibleNamedUnion B = fromString("b");

    /**
     * Static value c for StringExtensibleNamedUnion.
     */
    @Generated
    public static final StringExtensibleNamedUnion C = fromString("c");

    /**
     * Creates a new instance of StringExtensibleNamedUnion value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public StringExtensibleNamedUnion() {
    }

    /**
     * Creates or finds a StringExtensibleNamedUnion from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding StringExtensibleNamedUnion.
     */
    @Generated
    public static StringExtensibleNamedUnion fromString(String name) {
        return fromString(name, StringExtensibleNamedUnion.class);
    }

    /**
     * Gets known StringExtensibleNamedUnion values.
     * 
     * @return known StringExtensibleNamedUnion values.
     */
    @Generated
    public static Collection<StringExtensibleNamedUnion> values() {
        return values(StringExtensibleNamedUnion.class);
    }

    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        return jsonWriter.writeString(toString());
    }

    /**
     * Reads a StringExtensibleNamedUnion from the JSON stream.
     * <p>
     * The passed JsonReader must be positioned at a JsonToken.STRING value.
     * 
     * @param jsonReader The JsonReader being read.
     * @return The StringExtensibleNamedUnion that the JSON stream represented, may return null.
     * @throws java.io.IOException If a StringExtensibleNamedUnion fails to be read from the JsonReader.
     */
    @Generated
    public static StringExtensibleNamedUnion fromJson(JsonReader jsonReader) throws IOException {
        return fromString(jsonReader.getString(), StringExtensibleNamedUnion.class);
    }
}
