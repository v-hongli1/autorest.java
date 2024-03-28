// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.azureparametergrouping.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Parameter group.
 */
@Fluent
public final class ParameterGroupingPostOptionalParameters
    implements JsonSerializable<ParameterGroupingPostOptionalParameters> {
    /*
     * The customHeader property.
     */
    private String customHeader;

    /*
     * Query parameter with default
     */
    private Integer query;

    /**
     * Creates an instance of ParameterGroupingPostOptionalParameters class.
     */
    public ParameterGroupingPostOptionalParameters() {
    }

    /**
     * Get the customHeader property: The customHeader property.
     * 
     * @return the customHeader value.
     */
    public String getCustomHeader() {
        return this.customHeader;
    }

    /**
     * Set the customHeader property: The customHeader property.
     * 
     * @param customHeader the customHeader value to set.
     * @return the ParameterGroupingPostOptionalParameters object itself.
     */
    public ParameterGroupingPostOptionalParameters setCustomHeader(String customHeader) {
        this.customHeader = customHeader;
        return this;
    }

    /**
     * Get the query property: Query parameter with default.
     * 
     * @return the query value.
     */
    public Integer getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Query parameter with default.
     * 
     * @param query the query value to set.
     * @return the ParameterGroupingPostOptionalParameters object itself.
     */
    public ParameterGroupingPostOptionalParameters setQuery(Integer query) {
        this.query = query;
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
        jsonWriter.writeStringField("customHeader", this.customHeader);
        jsonWriter.writeNumberField("query", this.query);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ParameterGroupingPostOptionalParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ParameterGroupingPostOptionalParameters if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ParameterGroupingPostOptionalParameters.
     */
    public static ParameterGroupingPostOptionalParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ParameterGroupingPostOptionalParameters deserializedParameterGroupingPostOptionalParameters
                = new ParameterGroupingPostOptionalParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("customHeader".equals(fieldName)) {
                    deserializedParameterGroupingPostOptionalParameters.customHeader = reader.getString();
                } else if ("query".equals(fieldName)) {
                    deserializedParameterGroupingPostOptionalParameters.query = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedParameterGroupingPostOptionalParameters;
        });
    }
}
