// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package tsptest.versioning;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of VersioningClient.
 */
public enum VersioningServiceVersion implements ServiceVersion {
    /**
     * Enum value 2022-09-01.
     */
    V2022_09_01("2022-09-01");

    private final String version;

    VersioningServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     * 
     * @return The latest {@link VersioningServiceVersion}.
     */
    public static VersioningServiceVersion getLatest() {
        return V2022_09_01;
    }
}