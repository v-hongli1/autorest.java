// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The ReadonlyObj model. */
@Fluent
public final class ReadonlyObj {
    /*
     * The id property.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The size property.
     */
    @JsonProperty(value = "size")
    private Integer size;

    /**
     * Get the ID of the object.
     *
     * @return the id value.
     */
    public UUID getId() {
        String returnValue = this.id;
        return UUID.fromString(returnValue);
    }

    /**
     * Get the size property: The size property.
     *
     * @return the size value.
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * Set the size property: The size property.
     *
     * @param size the size value to set.
     * @return the ReadonlyObj object itself.
     */
    public ReadonlyObj setSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Set the ID of the object.
     *
     * @param id The ID value
     * @return The current ReadonlyObj instance
     */
    ReadonlyObj setId(String id) {
        this.id = id;
        return this;
    }
}