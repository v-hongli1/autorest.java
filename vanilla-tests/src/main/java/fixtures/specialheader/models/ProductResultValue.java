// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.specialheader.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The ProductResultValue model.
 */
@Fluent
public final class ProductResultValue implements JsonSerializable<ProductResultValue> {
    /*
     * The value property.
     */
    private List<Object> value;

    /*
     * The nextLink property.
     */
    private String nextLink;

    /**
     * Creates an instance of ProductResultValue class.
     */
    public ProductResultValue() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public List<Object> getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the ProductResultValue object itself.
     */
    public ProductResultValue setValue(List<Object> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The nextLink property.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ProductResultValue object itself.
     */
    public ProductResultValue setNextLink(String nextLink) {
        this.nextLink = nextLink;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProductResultValue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProductResultValue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProductResultValue.
     */
    public static ProductResultValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProductResultValue deserializedProductResultValue = new ProductResultValue();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<Object> value = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedProductResultValue.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedProductResultValue.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProductResultValue;
        });
    }
}
