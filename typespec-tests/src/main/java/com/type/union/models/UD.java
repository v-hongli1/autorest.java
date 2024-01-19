// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.type.union.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for UD.
 */
public final class UD extends ExpandableStringEnum<UD> {
    /**
     * Static value up for UD.
     */
    @Generated
    public static final UD UP = fromString("up");

    /**
     * Static value down for UD.
     */
    @Generated
    public static final UD DOWN = fromString("down");

    /**
     * Creates a new instance of UD value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public UD() {
    }

    /**
     * Creates or finds a UD from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UD.
     */
    @Generated
    public static UD fromString(String name) {
        return fromString(name, UD.class);
    }

    /**
     * Gets known UD values.
     * 
     * @return known UD values.
     */
    @Generated
    public static Collection<UD> values() {
        return values(UD.class);
    }
}