// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Sort options for ordering manifests in a collection. */
public final class ArtifactManifestOrder extends ExpandableStringEnum<ArtifactManifestOrder> {
    /** Static value none for ArtifactManifestOrder. */
    public static final ArtifactManifestOrder NONE = fromString("none");

    /** Static value timedesc for ArtifactManifestOrder. */
    public static final ArtifactManifestOrder LAST_UPDATED_ON_DESCENDING = fromString("timedesc");

    /** Static value timeasc for ArtifactManifestOrder. */
    public static final ArtifactManifestOrder LAST_UPDATED_ON_ASCENDING = fromString("timeasc");

    /**
     * Creates or finds a ArtifactManifestOrder from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArtifactManifestOrder.
     */
    @JsonCreator
    public static ArtifactManifestOrder fromString(String name) {
        return fromString(name, ArtifactManifestOrder.class);
    }

    /**
     * Gets known ArtifactManifestOrder values.
     *
     * @return known ArtifactManifestOrder values.
     */
    public static Collection<ArtifactManifestOrder> values() {
        return values(ArtifactManifestOrder.class);
    }
}