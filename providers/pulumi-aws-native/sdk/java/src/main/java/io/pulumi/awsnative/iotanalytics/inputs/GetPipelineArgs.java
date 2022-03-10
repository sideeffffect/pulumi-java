// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPipelineArgs Empty = new GetPipelineArgs();

    @InputImport(name="pipelineName", required=true)
      private final String pipelineName;

    public String getPipelineName() {
        return this.pipelineName;
    }

    public GetPipelineArgs(String pipelineName) {
        this.pipelineName = Objects.requireNonNull(pipelineName, "expected parameter 'pipelineName' to be non-null");
    }

    private GetPipelineArgs() {
        this.pipelineName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pipelineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineName = defaults.pipelineName;
        }

        public Builder pipelineName(String pipelineName) {
            this.pipelineName = Objects.requireNonNull(pipelineName);
            return this;
        }
        public GetPipelineArgs build() {
            return new GetPipelineArgs(pipelineName);
        }
    }
}
