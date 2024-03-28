// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.discriminatorflattening.noflatten.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a virtual machine scale set network profile's network configurations.
 */
@Fluent
public final class VirtualMachineScaleSetNetworkConfiguration
    implements JsonSerializable<VirtualMachineScaleSetNetworkConfiguration> {
    /*
     * The network configuration name.
     */
    private String name;

    /*
     * Describes a virtual machine scale set network profile's IP configuration.
     */
    private VirtualMachineScaleSetNetworkConfigurationProperties properties;

    /**
     * Creates an instance of VirtualMachineScaleSetNetworkConfiguration class.
     */
    public VirtualMachineScaleSetNetworkConfiguration() {
    }

    /**
     * Get the name property: The network configuration name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The network configuration name.
     * 
     * @param name the name value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: Describes a virtual machine scale set network profile's IP configuration.
     * 
     * @return the properties value.
     */
    public VirtualMachineScaleSetNetworkConfigurationProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Describes a virtual machine scale set network profile's IP configuration.
     * 
     * @param properties the properties value to set.
     * @return the VirtualMachineScaleSetNetworkConfiguration object itself.
     */
    public VirtualMachineScaleSetNetworkConfiguration
        setProperties(VirtualMachineScaleSetNetworkConfigurationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getProperties() != null) {
            getProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualMachineScaleSetNetworkConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualMachineScaleSetNetworkConfiguration if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualMachineScaleSetNetworkConfiguration.
     */
    public static VirtualMachineScaleSetNetworkConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualMachineScaleSetNetworkConfiguration deserializedVirtualMachineScaleSetNetworkConfiguration
                = new VirtualMachineScaleSetNetworkConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetNetworkConfiguration.name = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedVirtualMachineScaleSetNetworkConfiguration.properties
                        = VirtualMachineScaleSetNetworkConfigurationProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualMachineScaleSetNetworkConfiguration;
        });
    }
}
