// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com._specs_.azure.core.lro.rpc.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the job. */
@Immutable
public final class JobResult {
    /*
     * A processing job identifier.
     */
    @JsonProperty(value = "jobId", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String jobId;

    /*
     * Comment.
     */
    @JsonProperty(value = "comment", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String comment;

    /*
     * The status of the processing job.
     */
    @JsonProperty(value = "status", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OperationState status;

    /*
     * Error objects that describes the error when status is "Failed".
     */
    @JsonProperty(value = "errors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ErrorResponse> errors;

    /*
     * The results.
     */
    @JsonProperty(value = "results", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private List<String> results;

    /** Creates an instance of JobResult class. */
    private JobResult() {}

    /**
     * Get the jobId property: A processing job identifier.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the comment property: Comment.
     *
     * @return the comment value.
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * Get the status property: The status of the processing job.
     *
     * @return the status value.
     */
    public OperationState getStatus() {
        return this.status;
    }

    /**
     * Get the errors property: Error objects that describes the error when status is "Failed".
     *
     * @return the errors value.
     */
    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Get the results property: The results.
     *
     * @return the results value.
     */
    public List<String> getResults() {
        return this.results;
    }
}