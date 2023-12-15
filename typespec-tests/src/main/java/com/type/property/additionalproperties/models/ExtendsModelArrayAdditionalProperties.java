// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.property.additionalproperties.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * The model extends from Record&lt;ModelForRecord[]&gt; type.
 */
@Fluent
public final class ExtendsModelArrayAdditionalProperties
    implements JsonSerializable<ExtendsModelArrayAdditionalProperties> {
    /*
     * Dictionary of RecordArrayModelForRecord
     */
    @Generated
    private Map<String, List<ModelForRecord>> additionalProperties;

    /**
     * Creates an instance of ExtendsModelArrayAdditionalProperties class.
     */
    @Generated
    public ExtendsModelArrayAdditionalProperties() {
    }

    /**
     * Get the additionalProperties property: Dictionary of RecordArrayModelForRecord.
     * 
     * @return the additionalProperties value.
     */
    @Generated
    public Map<String, List<ModelForRecord>> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of RecordArrayModelForRecord.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the ExtendsModelArrayAdditionalProperties object itself.
     */
    @Generated
    public ExtendsModelArrayAdditionalProperties
        setAdditionalProperties(Map<String, List<ModelForRecord>> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (additionalProperties != null) {
            for (Map.Entry<String, List<ModelForRecord>> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExtendsModelArrayAdditionalProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExtendsModelArrayAdditionalProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExtendsModelArrayAdditionalProperties.
     */
    public static ExtendsModelArrayAdditionalProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExtendsModelArrayAdditionalProperties deserializedExtendsModelArrayAdditionalProperties
                = new ExtendsModelArrayAdditionalProperties();
            Map<String, List<ModelForRecord>> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if (additionalProperties == null) {
                    additionalProperties = new LinkedHashMap<>();
                }

                additionalProperties.put(fieldName, reader.readArray(ModelForRecord::fromJson));

            }
            deserializedExtendsModelArrayAdditionalProperties.additionalProperties = additionalProperties;
            return deserializedExtendsModelArrayAdditionalProperties;
        });
    }
}
