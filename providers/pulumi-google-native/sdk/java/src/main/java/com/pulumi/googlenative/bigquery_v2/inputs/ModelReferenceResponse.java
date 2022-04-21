// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ModelReferenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final ModelReferenceResponse Empty = new ModelReferenceResponse();

    /**
     * [Required] The ID of the dataset containing this model.
     * 
     */
    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    /**
     * [Required] The ID of the model. The ID must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_). The maximum length is 1,024 characters.
     * 
     */
    @Import(name="modelId", required=true)
    private String modelId;

    public String modelId() {
        return this.modelId;
    }

    /**
     * [Required] The ID of the project containing this model.
     * 
     */
    @Import(name="project", required=true)
    private String project;

    public String project() {
        return this.project;
    }

    private ModelReferenceResponse() {}

    private ModelReferenceResponse(ModelReferenceResponse $) {
        this.datasetId = $.datasetId;
        this.modelId = $.modelId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ModelReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelReferenceResponse $;

        public Builder() {
            $ = new ModelReferenceResponse();
        }

        public Builder(ModelReferenceResponse defaults) {
            $ = new ModelReferenceResponse(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder modelId(String modelId) {
            $.modelId = modelId;
            return this;
        }

        public Builder project(String project) {
            $.project = project;
            return this;
        }

        public ModelReferenceResponse build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.modelId = Objects.requireNonNull($.modelId, "expected parameter 'modelId' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
