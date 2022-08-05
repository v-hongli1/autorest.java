// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.streamstyleserialization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.time.OffsetDateTime;

/** The Datetimerfc1123Wrapper model. */
@Fluent
public final class Datetimerfc1123Wrapper implements JsonSerializable<Datetimerfc1123Wrapper> {
    /*
     * The field property.
     */
    private DateTimeRfc1123 field;

    /*
     * The now property.
     */
    private DateTimeRfc1123 now;

    /**
     * Get the field property: The field property.
     *
     * @return the field value.
     */
    public OffsetDateTime getField() {
        if (this.field == null) {
            return null;
        }
        return this.field.getDateTime();
    }

    /**
     * Set the field property: The field property.
     *
     * @param field the field value to set.
     * @return the Datetimerfc1123Wrapper object itself.
     */
    public Datetimerfc1123Wrapper setField(OffsetDateTime field) {
        if (field == null) {
            this.field = null;
        } else {
            this.field = new DateTimeRfc1123(field);
        }
        return this;
    }

    /**
     * Get the now property: The now property.
     *
     * @return the now value.
     */
    public OffsetDateTime getNow() {
        if (this.now == null) {
            return null;
        }
        return this.now.getDateTime();
    }

    /**
     * Set the now property: The now property.
     *
     * @param now the now value to set.
     * @return the Datetimerfc1123Wrapper object itself.
     */
    public Datetimerfc1123Wrapper setNow(OffsetDateTime now) {
        if (now == null) {
            this.now = null;
        } else {
            this.now = new DateTimeRfc1123(now);
        }
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("field", this.field == null ? null : this.field.toString(), false);
        jsonWriter.writeStringField("now", this.now == null ? null : this.now.toString(), false);
        return jsonWriter.writeEndObject().flush();
    }

    /**
     * Reads an instance of Datetimerfc1123Wrapper from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Datetimerfc1123Wrapper if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     */
    public static Datetimerfc1123Wrapper fromJson(JsonReader jsonReader) {
        return jsonReader.readObject(
                reader -> {
                    OffsetDateTime field = null;
                    OffsetDateTime now = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("field".equals(fieldName)) {
                            field =
                                    reader.getNullableValue(
                                            r -> new DateTimeRfc1123(reader.getStringValue()).getDateTime());
                        } else if ("now".equals(fieldName)) {
                            now =
                                    reader.getNullableValue(
                                            r -> new DateTimeRfc1123(reader.getStringValue()).getDateTime());
                        } else {
                            reader.skipChildren();
                        }
                    }
                    Datetimerfc1123Wrapper deserializedValue = new Datetimerfc1123Wrapper();
                    deserializedValue.setField(field);
                    deserializedValue.setNow(now);

                    return deserializedValue;
                });
    }
}