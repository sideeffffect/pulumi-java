// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics;

import com.pulumi.awsnative.iotanalytics.inputs.PipelineActivityArgs;
import com.pulumi.awsnative.iotanalytics.inputs.PipelineTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    @Import(name="pipelineActivities", required=true)
      private final Output<List<PipelineActivityArgs>> pipelineActivities;

    public Output<List<PipelineActivityArgs>> pipelineActivities() {
        return this.pipelineActivities;
    }

    @Import(name="pipelineName")
      private final @Nullable Output<String> pipelineName;

    public Output<String> pipelineName() {
        return this.pipelineName == null ? Codegen.empty() : this.pipelineName;
    }

    @Import(name="tags")
      private final @Nullable Output<List<PipelineTagArgs>> tags;

    public Output<List<PipelineTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PipelineArgs(
        Output<List<PipelineActivityArgs>> pipelineActivities,
        @Nullable Output<String> pipelineName,
        @Nullable Output<List<PipelineTagArgs>> tags) {
        this.pipelineActivities = Objects.requireNonNull(pipelineActivities, "expected parameter 'pipelineActivities' to be non-null");
        this.pipelineName = pipelineName;
        this.tags = tags;
    }

    private PipelineArgs() {
        this.pipelineActivities = Codegen.empty();
        this.pipelineName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<PipelineActivityArgs>> pipelineActivities;
        private @Nullable Output<String> pipelineName;
        private @Nullable Output<List<PipelineTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineActivities = defaults.pipelineActivities;
    	      this.pipelineName = defaults.pipelineName;
    	      this.tags = defaults.tags;
        }

        public Builder pipelineActivities(Output<List<PipelineActivityArgs>> pipelineActivities) {
            this.pipelineActivities = Objects.requireNonNull(pipelineActivities);
            return this;
        }
        public Builder pipelineActivities(List<PipelineActivityArgs> pipelineActivities) {
            this.pipelineActivities = Output.of(Objects.requireNonNull(pipelineActivities));
            return this;
        }
        public Builder pipelineActivities(PipelineActivityArgs... pipelineActivities) {
            return pipelineActivities(List.of(pipelineActivities));
        }
        public Builder pipelineName(@Nullable Output<String> pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public Builder pipelineName(@Nullable String pipelineName) {
            this.pipelineName = Codegen.ofNullable(pipelineName);
            return this;
        }
        public Builder tags(@Nullable Output<List<PipelineTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<PipelineTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(PipelineTagArgs... tags) {
            return tags(List.of(tags));
        }        public PipelineArgs build() {
            return new PipelineArgs(pipelineActivities, pipelineName, tags);
        }
    }
}
