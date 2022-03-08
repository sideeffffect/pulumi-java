// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference {
    /**
     * Dataset ID of the table.
     * 
     */
    private final String datasetId;
    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    private final String projectId;
    /**
     * Name of the table. If is not set a new one will be generated for you with the following format:
     * `dlp_googleapis_yyyy_mm_dd_[dlp_job_id]`. Pacific timezone will be used for generating the date details.
     * 
     */
    private final String tableId;

    @OutputCustomType.Constructor({"datasetId","projectId","tableId"})
    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference(
        String datasetId,
        String projectId,
        String tableId) {
        this.datasetId = datasetId;
        this.projectId = projectId;
        this.tableId = tableId;
    }

    /**
     * Dataset ID of the table.
     * 
    */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
    */
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * Name of the table. If is not set a new one will be generated for you with the following format:
     * `dlp_googleapis_yyyy_mm_dd_[dlp_job_id]`. Pacific timezone will be used for generating the date details.
     * 
    */
    public String getTableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String projectId;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference build() {
            return new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReference(datasetId, projectId, tableId);
        }
    }
}
