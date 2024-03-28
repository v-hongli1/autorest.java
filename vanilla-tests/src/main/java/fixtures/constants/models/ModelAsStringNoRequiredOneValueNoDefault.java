// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.constants.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ModelAsStringNoRequiredOneValueNoDefault model.
 */
@Fluent
public final class ModelAsStringNoRequiredOneValueNoDefault
    implements JsonSerializable<ModelAsStringNoRequiredOneValueNoDefault> {
    /*
     * The parameter property.
     */
    private ModelAsStringNoRequiredOneValueNoDefaultEnum parameter;

    /**
     * Creates an instance of ModelAsStringNoRequiredOneValueNoDefault class.
     */
    public ModelAsStringNoRequiredOneValueNoDefault() {
    }

    /**
     * Get the parameter property: The parameter property.
     * 
     * @return the parameter value.
     */
    public ModelAsStringNoRequiredOneValueNoDefaultEnum getParameter() {
        return this.parameter;
    }

    /**
     * Set the parameter property: The parameter property.
     * 
     * @param parameter the parameter value to set.
     * @return the ModelAsStringNoRequiredOneValueNoDefault object itself.
     */
    public ModelAsStringNoRequiredOneValueNoDefault
        setParameter(ModelAsStringNoRequiredOneValueNoDefaultEnum parameter) {
        this.parameter = parameter;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("parameter", this.parameter == null ? null : this.parameter.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ModelAsStringNoRequiredOneValueNoDefault from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ModelAsStringNoRequiredOneValueNoDefault if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ModelAsStringNoRequiredOneValueNoDefault.
     */
    public static ModelAsStringNoRequiredOneValueNoDefault fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ModelAsStringNoRequiredOneValueNoDefault deserializedModelAsStringNoRequiredOneValueNoDefault
                = new ModelAsStringNoRequiredOneValueNoDefault();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("parameter".equals(fieldName)) {
                    deserializedModelAsStringNoRequiredOneValueNoDefault.parameter
                        = ModelAsStringNoRequiredOneValueNoDefaultEnum.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedModelAsStringNoRequiredOneValueNoDefault;
        });
    }
}
