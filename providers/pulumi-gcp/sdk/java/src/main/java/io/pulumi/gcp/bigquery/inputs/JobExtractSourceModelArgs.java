// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class JobExtractSourceModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobExtractSourceModelArgs Empty = new JobExtractSourceModelArgs();

    /**
     * The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the model.
     * 
     */
    @Import(name="modelId", required=true)
      private final Output<String> modelId;

    public Output<String> modelId() {
        return this.modelId;
    }

    /**
     * The ID of the project containing this model.
     * 
     */
    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId;
    }

    public JobExtractSourceModelArgs(
        Output<String> datasetId,
        Output<String> modelId,
        Output<String> projectId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.modelId = Objects.requireNonNull(modelId, "expected parameter 'modelId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
    }

    private JobExtractSourceModelArgs() {
        this.datasetId = Codegen.empty();
        this.modelId = Codegen.empty();
        this.projectId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtractSourceModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetId;
        private Output<String> modelId;
        private Output<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExtractSourceModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.modelId = defaults.modelId;
    	      this.projectId = defaults.projectId;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }
        public Builder modelId(Output<String> modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }
        public Builder modelId(String modelId) {
            this.modelId = Output.of(Objects.requireNonNull(modelId));
            return this;
        }
        public Builder projectId(Output<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Output.of(Objects.requireNonNull(projectId));
            return this;
        }        public JobExtractSourceModelArgs build() {
            return new JobExtractSourceModelArgs(datasetId, modelId, projectId);
        }
    }
}
