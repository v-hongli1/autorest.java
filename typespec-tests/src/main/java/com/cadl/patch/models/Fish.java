// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.cadl.patch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.cadl.patch.implementation.JsonMergePatchHelper;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * This is base model for polymorphic multiple levels inheritance with a discriminator.
 */
@Fluent
public class Fish implements JsonSerializable<Fish> {
    /*
     * Discriminator property for Fish.
     */
    @Generated
    String kind;

    /*
     * The id property.
     */
    @Generated
    private String id;

    /*
     * The name property.
     */
    @Generated
    private String name;

    /*
     * The age property.
     */
    @Generated
    private int age;

    /*
     * The color property.
     */
    @Generated
    private String color;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    private boolean jsonMergePatch;

    @Generated
    private void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setFishAccessor(new JsonMergePatchHelper.FishAccessor() {
            @Override
            public Fish prepareModelForJsonMergePatch(Fish model, boolean jsonMergePatchEnabled) {
                model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
                return model;
            }

            @Override
            public boolean isJsonMergePatch(Fish model) {
                return model.jsonMergePatch;
            }

            @Override
            public void setId(Fish model, String id) {
                model.id = id;
            }

            @Override
            public void setName(Fish model, String name) {
                model.name = name;
            }

            @Override
            public void setAge(Fish model, int age) {
                model.age = age;
            }

            @Override
            public void setColor(Fish model, String color) {
                model.color = color;
            }
        });
    }

    /**
     * Creates an instance of Fish class.
     */
    @Generated
    public Fish() {
        this.kind = "Fish";
    }

    /**
     * Get the kind property: Discriminator property for Fish.
     * 
     * @return the kind value.
     */
    @Generated
    public String getKind() {
        return this.kind;
    }

    /**
     * Get the id property: The id property.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the age property: The age property.
     * 
     * @return the age value.
     */
    @Generated
    public int getAge() {
        return this.age;
    }

    /**
     * Set the age property: The age property.
     * <p>Required when create the resource.</p>
     * 
     * @param age the age value to set.
     * @return the Fish object itself.
     */
    @Generated
    public Fish setAge(int age) {
        this.age = age;
        this.updatedProperties.add("age");
        return this;
    }

    /**
     * Get the color property: The color property.
     * 
     * @return the color value.
     */
    @Generated
    public String getColor() {
        return this.color;
    }

    /**
     * Set the color property: The color property.
     * 
     * @param color the color value to set.
     * @return the Fish object itself.
     */
    @Generated
    public Fish setColor(String color) {
        this.color = color;
        this.updatedProperties.add("color");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind);
            jsonWriter.writeIntField("age", this.age);
            jsonWriter.writeStringField("color", this.color);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind);
        if (updatedProperties.contains("age")) {
            jsonWriter.writeIntField("age", this.age);
        }
        if (updatedProperties.contains("color")) {
            if (this.color == null) {
                jsonWriter.writeNullField("color");
            } else {
                jsonWriter.writeStringField("color", this.color);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Fish from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Fish if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Fish.
     */
    @Generated
    public static Fish fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                readerToUse.nextToken(); // Prepare for reading
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("shark".equals(discriminatorValue)) {
                    return Shark.fromJson(readerToUse.reset());
                } else if ("salmon".equals(discriminatorValue)) {
                    return Salmon.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static Fish fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Fish deserializedFish = new Fish();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedFish.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedFish.name = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    deserializedFish.kind = reader.getString();
                } else if ("age".equals(fieldName)) {
                    deserializedFish.age = reader.getInt();
                } else if ("color".equals(fieldName)) {
                    deserializedFish.color = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFish;
        });
    }
}
