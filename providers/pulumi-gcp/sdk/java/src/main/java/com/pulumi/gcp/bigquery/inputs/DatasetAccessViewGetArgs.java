// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetAccessViewGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetAccessViewGetArgs Empty = new DatasetAccessViewGetArgs();

    /**
     * The ID of the dataset containing this table.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the project containing this table.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * The ID of the table. The ID must contain only letters (a-z,
     * A-Z), numbers (0-9), or underscores (_). The maximum length
     * is 1,024 characters.
     * 
     */
    @Import(name="tableId", required=true)
    private Output<String> tableId;

    public Output<String> tableId() {
        return this.tableId;
    }

    private DatasetAccessViewGetArgs() {}

    private DatasetAccessViewGetArgs(DatasetAccessViewGetArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetAccessViewGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetAccessViewGetArgs $;

        public Builder() {
            $ = new DatasetAccessViewGetArgs();
        }

        public Builder(DatasetAccessViewGetArgs defaults) {
            $ = new DatasetAccessViewGetArgs(Objects.requireNonNull(defaults));
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

        public DatasetAccessViewGetArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
