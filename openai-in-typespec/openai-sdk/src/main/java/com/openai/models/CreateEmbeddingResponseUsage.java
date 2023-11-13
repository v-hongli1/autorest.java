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
 * The CreateEmbeddingResponseUsage model.
 */
@Immutable
public final class CreateEmbeddingResponseUsage implements JsonSerializable<CreateEmbeddingResponseUsage> {
    /*
     * The number of tokens used by the prompt.
     */
    @Generated
    private final long promptTokens;

    /*
     * The total number of tokens used by the request.
     */
    @Generated
    private final long totalTokens;

    /**
     * Creates an instance of CreateEmbeddingResponseUsage class.
     * 
     * @param promptTokens the promptTokens value to set.
     * @param totalTokens the totalTokens value to set.
     */
    @Generated
    private CreateEmbeddingResponseUsage(long promptTokens, long totalTokens) {
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }

    /**
     * Get the promptTokens property: The number of tokens used by the prompt.
     * 
     * @return the promptTokens value.
     */
    @Generated
    public long getPromptTokens() {
        return this.promptTokens;
    }

    /**
     * Get the totalTokens property: The total number of tokens used by the request.
     * 
     * @return the totalTokens value.
     */
    @Generated
    public long getTotalTokens() {
        return this.totalTokens;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeLongField("prompt_tokens", this.promptTokens);
        jsonWriter.writeLongField("total_tokens", this.totalTokens);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CreateEmbeddingResponseUsage from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CreateEmbeddingResponseUsage if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the CreateEmbeddingResponseUsage.
     */
    public static CreateEmbeddingResponseUsage fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean promptTokensFound = false;
            long promptTokens = 0L;
            boolean totalTokensFound = false;
            long totalTokens = 0L;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("prompt_tokens".equals(fieldName)) {
                    promptTokens = reader.getLong();
                    promptTokensFound = true;
                } else if ("total_tokens".equals(fieldName)) {
                    totalTokens = reader.getLong();
                    totalTokensFound = true;
                } else {
                    reader.skipChildren();
                }
            }
            if (promptTokensFound && totalTokensFound) {
                CreateEmbeddingResponseUsage deserializedCreateEmbeddingResponseUsage
                    = new CreateEmbeddingResponseUsage(promptTokens, totalTokens);

                return deserializedCreateEmbeddingResponseUsage;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!promptTokensFound) {
                missingProperties.add("prompt_tokens");
            }
            if (!totalTokensFound) {
                missingProperties.add("total_tokens");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
