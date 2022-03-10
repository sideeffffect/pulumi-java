// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics;

import io.pulumi.awsnative.iotanalytics.inputs.PipelineActivityArgs;
import io.pulumi.awsnative.iotanalytics.inputs.PipelineTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    @InputImport(name="pipelineActivities", required=true)
      private final Input<List<PipelineActivityArgs>> pipelineActivities;

    public Input<List<PipelineActivityArgs>> getPipelineActivities() {
        return this.pipelineActivities;
    }

    @InputImport(name="pipelineName")
      private final @Nullable Input<String> pipelineName;

    public Input<String> getPipelineName() {
        return this.pipelineName == null ? Input.empty() : this.pipelineName;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<PipelineTagArgs>> tags;

    public Input<List<PipelineTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PipelineArgs(
        Input<List<PipelineActivityArgs>> pipelineActivities,
        @Nullable Input<String> pipelineName,
        @Nullable Input<List<PipelineTagArgs>> tags) {
        this.pipelineActivities = Objects.requireNonNull(pipelineActivities, "expected parameter 'pipelineActivities' to be non-null");
        this.pipelineName = pipelineName;
        this.tags = tags;
    }

    private PipelineArgs() {
        this.pipelineActivities = Input.empty();
        this.pipelineName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<PipelineActivityArgs>> pipelineActivities;
        private @Nullable Input<String> pipelineName;
        private @Nullable Input<List<PipelineTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineActivities = defaults.pipelineActivities;
    	      this.pipelineName = defaults.pipelineName;
    	      this.tags = defaults.tags;
        }

        public Builder pipelineActivities(Input<List<PipelineActivityArgs>> pipelineActivities) {
            this.pipelineActivities = Objects.requireNonNull(pipelineActivities);
            return this;
        }

        public Builder pipelineActivities(List<PipelineActivityArgs> pipelineActivities) {
            this.pipelineActivities = Input.of(Objects.requireNonNull(pipelineActivities));
            return this;
        }

        public Builder pipelineName(@Nullable Input<String> pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }

        public Builder pipelineName(@Nullable String pipelineName) {
            this.pipelineName = Input.ofNullable(pipelineName);
            return this;
        }

        public Builder tags(@Nullable Input<List<PipelineTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<PipelineTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public PipelineArgs build() {
            return new PipelineArgs(pipelineActivities, pipelineName, tags);
        }
    }
}
