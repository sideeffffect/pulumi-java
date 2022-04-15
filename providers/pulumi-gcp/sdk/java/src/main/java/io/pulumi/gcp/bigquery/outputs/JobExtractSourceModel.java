// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobExtractSourceModel {
    /**
     * The ID of the dataset containing this model.
     * 
     */
    private final String datasetId;
    /**
     * The ID of the model.
     * 
     */
    private final String modelId;
    /**
     * The ID of the project containing this model.
     * 
     */
    private final String projectId;

    @CustomType.Constructor
    private JobExtractSourceModel(
        @CustomType.Parameter("datasetId") String datasetId,
        @CustomType.Parameter("modelId") String modelId,
        @CustomType.Parameter("projectId") String projectId) {
        this.datasetId = datasetId;
        this.modelId = modelId;
        this.projectId = projectId;
    }

    /**
     * The ID of the dataset containing this model.
     * 
    */
    public String datasetId() {
        return this.datasetId;
    }
    /**
     * The ID of the model.
     * 
    */
    public String modelId() {
        return this.modelId;
    }
    /**
     * The ID of the project containing this model.
     * 
    */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobExtractSourceModel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String modelId;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobExtractSourceModel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.modelId = defaults.modelId;
    	      this.projectId = defaults.projectId;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder modelId(String modelId) {
            this.modelId = Objects.requireNonNull(modelId);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }        public JobExtractSourceModel build() {
            return new JobExtractSourceModel(datasetId, modelId, projectId);
        }
    }
}
