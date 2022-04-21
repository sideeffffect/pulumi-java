// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs Empty = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs();

    /**
     * Dataset ID of the table.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Name of the table. If is not set a new one will be generated for you with the following format:
     * `dlp_googleapis_yyyy_mm_dd_[dlp_job_id]`. Pacific timezone will be used for generating the date details.
     * 
     */
    @Import(name="tableId", required=true)
    private Output<String> tableId;

    public Output<String> tableId() {
        return this.tableId;
    }

    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs() {}

    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs $;

        public Builder() {
            $ = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs();
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs defaults) {
            $ = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder tableId(Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
