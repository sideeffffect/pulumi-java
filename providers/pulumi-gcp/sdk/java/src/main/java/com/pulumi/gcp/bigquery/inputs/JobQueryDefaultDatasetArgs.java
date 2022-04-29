// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobQueryDefaultDatasetArgs extends ResourceArgs {

    public static final JobQueryDefaultDatasetArgs Empty = new JobQueryDefaultDatasetArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    /**
     * @return The ID of the dataset containing this model.
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return The ID of the project containing this model.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private JobQueryDefaultDatasetArgs() {}

    private JobQueryDefaultDatasetArgs(JobQueryDefaultDatasetArgs $) {
        this.datasetId = $.datasetId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobQueryDefaultDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobQueryDefaultDatasetArgs $;

        public Builder() {
            $ = new JobQueryDefaultDatasetArgs();
        }

        public Builder(JobQueryDefaultDatasetArgs defaults) {
            $ = new JobQueryDefaultDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datasetId The ID of the dataset containing this model.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The ID of the dataset containing this model.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param projectId The ID of the project containing this model.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The ID of the project containing this model.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public JobQueryDefaultDatasetArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            return $;
        }
    }

}
