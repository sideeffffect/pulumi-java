// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RoutineReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final RoutineReferenceResponse Empty = new RoutineReferenceResponse();

    /**
     * [Required] The ID of the dataset containing this routine.
     * 
     */
    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    /**
     * [Required] The ID of the project containing this routine.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    public String project() {
        return this.project;
    }

    /**
     * [Required] The ID of the routine. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 256 characters.
     * 
     */
    @Import(name="routineId", required=true)
    private String routineId;

    public String routineId() {
        return this.routineId;
    }

    private RoutineReferenceResponse() {}

    private RoutineReferenceResponse(RoutineReferenceResponse $) {
        this.datasetId = $.datasetId;
        this.project = $.project;
        this.routineId = $.routineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoutineReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoutineReferenceResponse $;

        public Builder() {
            $ = new RoutineReferenceResponse();
        }

        public Builder(RoutineReferenceResponse defaults) {
            $ = new RoutineReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public Builder routineId(String routineId) {
            $.routineId = routineId;
            return this;
        }

        public RoutineReferenceResponse build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.routineId = Objects.requireNonNull($.routineId, "expected parameter 'routineId' to be non-null");
            return $;
        }
    }

}
