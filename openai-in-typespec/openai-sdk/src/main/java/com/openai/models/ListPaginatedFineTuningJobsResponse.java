// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.openai.models;

import com.generic.core.annotation.Generated;
import com.generic.core.annotation.Immutable;
import com.generic.json.JsonReader;
import com.generic.json.JsonSerializable;
import com.generic.json.JsonToken;
import com.generic.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The ListPaginatedFineTuningJobsResponse model.
 */
@Immutable
public final class ListPaginatedFineTuningJobsResponse
    implements JsonSerializable<ListPaginatedFineTuningJobsResponse> {
    /*
     * The object property.
     */
    @Generated
    private final String object;

    /*
     * The data property.
     */
    @Generated
    private final List<FineTuningJob> data;

    /*
     * The has_more property.
     */
    @Generated
    private final boolean hasMore;

    /**
     * Creates an instance of ListPaginatedFineTuningJobsResponse class.
     * 
     * @param object the object value to set.
     * @param data the data value to set.
     * @param hasMore the hasMore value to set.
     */
    @Generated
    private ListPaginatedFineTuningJobsResponse(String object, List<FineTuningJob> data, boolean hasMore) {
        this.object = object;
        this.data = data;
        this.hasMore = hasMore;
    }

    /**
     * Get the object property: The object property.
     * 
     * @return the object value.
     */
    @Generated
    public String getObject() {
        return this.object;
    }

    /**
     * Get the data property: The data property.
     * 
     * @return the data value.
     */
    @Generated
    public List<FineTuningJob> getData() {
        return this.data;
    }

    /**
     * Get the hasMore property: The has_more property.
     * 
     * @return the hasMore value.
     */
    @Generated
    public boolean isHasMore() {
        return this.hasMore;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("object", this.object);
        jsonWriter.writeArrayField("data", this.data, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeBooleanField("has_more", this.hasMore);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ListPaginatedFineTuningJobsResponse from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ListPaginatedFineTuningJobsResponse if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ListPaginatedFineTuningJobsResponse.
     */
    public static ListPaginatedFineTuningJobsResponse fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean objectFound = false;
            String object = null;
            boolean dataFound = false;
            List<FineTuningJob> data = null;
            boolean hasMoreFound = false;
            boolean hasMore = false;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("object".equals(fieldName)) {
                    object = reader.getString();
                    objectFound = true;
                } else if ("data".equals(fieldName)) {
                    data = reader.readArray(reader1 -> FineTuningJob.fromJson(reader1));
                    dataFound = true;
                } else if ("has_more".equals(fieldName)) {
                    hasMore = reader.getBoolean();
                    hasMoreFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (objectFound && dataFound && hasMoreFound) {
                ListPaginatedFineTuningJobsResponse deserializedListPaginatedFineTuningJobsResponse
                    = new ListPaginatedFineTuningJobsResponse(object, data, hasMore);

                return deserializedListPaginatedFineTuningJobsResponse;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!objectFound) {
                missingProperties.add("object");
            }
            if (!dataFound) {
                missingProperties.add("data");
            }
            if (!hasMoreFound) {
                missingProperties.add("has_more");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
