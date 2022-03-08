// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DatasetAccessView {
    /**
     * The ID of the dataset containing this table.
     * 
     */
    private final String datasetId;
    /**
     * The ID of the project containing this table.
     * 
     */
    private final String projectId;
    /**
     * The ID of the table. The ID must contain only letters (a-z,
     * A-Z), numbers (0-9), or underscores (_). The maximum length
     * is 1,024 characters.
     * 
     */
    private final String tableId;

    @OutputCustomType.Constructor({"datasetId","projectId","tableId"})
    private DatasetAccessView(
        String datasetId,
        String projectId,
        String tableId) {
        this.datasetId = datasetId;
        this.projectId = projectId;
        this.tableId = tableId;
    }

    /**
     * The ID of the dataset containing this table.
     * 
    */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * The ID of the project containing this table.
     * 
    */
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * The ID of the table. The ID must contain only letters (a-z,
     * A-Z), numbers (0-9), or underscores (_). The maximum length
     * is 1,024 characters.
     * 
    */
    public String getTableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessView defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String projectId;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessView defaults) {
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
        public DatasetAccessView build() {
            return new DatasetAccessView(datasetId, projectId, tableId);
        }
    }
}
