// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobExtractSourceTableGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobExtractSourceTableGetArgs Empty = new JobExtractSourceTableGetArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId")
    private @Nullable Output<String> datasetId;

    public Optional<Output<String>> datasetId() {
        return Optional.ofNullable(this.datasetId);
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The table. Can be specified `{{table_id}}` if `project_id` and `dataset_id` are also set,
     * or of the form `projects/{{project}}/datasets/{{dataset_id}}/tables/{{table_id}}` if not.
     * 
     */
    @Import(name="tableId", required=true)
    private Output<String> tableId;

    public Output<String> tableId() {
        return this.tableId;
    }

    private JobExtractSourceTableGetArgs() {}

    private JobExtractSourceTableGetArgs(JobExtractSourceTableGetArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobExtractSourceTableGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobExtractSourceTableGetArgs $;

        public Builder() {
            $ = new JobExtractSourceTableGetArgs();
        }

        public Builder(JobExtractSourceTableGetArgs defaults) {
            $ = new JobExtractSourceTableGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(@Nullable Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder projectId(@Nullable Output<String> projectId) {
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

        public JobExtractSourceTableGetArgs build() {
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
