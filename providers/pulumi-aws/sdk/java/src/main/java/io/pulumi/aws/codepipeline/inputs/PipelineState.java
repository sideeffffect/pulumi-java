// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.aws.codepipeline.inputs.PipelineArtifactStoreGetArgs;
import io.pulumi.aws.codepipeline.inputs.PipelineStageGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineState extends io.pulumi.resources.ResourceArgs {

    public static final PipelineState Empty = new PipelineState();

    /**
     * The codepipeline ARN.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * One or more artifact_store blocks. Artifact stores are documented below.
     * 
     */
    @Import(name="artifactStore")
      private final @Nullable Output<PipelineArtifactStoreGetArgs> artifactStore;

    public Output<PipelineArtifactStoreGetArgs> artifactStore() {
        return this.artifactStore == null ? Codegen.empty() : this.artifactStore;
    }

    /**
     * The name of the pipeline.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodePipeline permission to make calls to AWS services on your behalf.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    /**
     * A stage block. Stages are documented below.
     * 
     */
    @Import(name="stages")
      private final @Nullable Output<List<PipelineStageGetArgs>> stages;

    public Output<List<PipelineStageGetArgs>> stages() {
        return this.stages == null ? Codegen.empty() : this.stages;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public PipelineState(
        @Nullable Output<String> arn,
        @Nullable Output<PipelineArtifactStoreGetArgs> artifactStore,
        @Nullable Output<String> name,
        @Nullable Output<String> roleArn,
        @Nullable Output<List<PipelineStageGetArgs>> stages,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.artifactStore = artifactStore;
        this.name = name;
        this.roleArn = roleArn;
        this.stages = stages;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private PipelineState() {
        this.arn = Codegen.empty();
        this.artifactStore = Codegen.empty();
        this.name = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.stages = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<PipelineArtifactStoreGetArgs> artifactStore;
        private @Nullable Output<String> name;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<List<PipelineStageGetArgs>> stages;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.artifactStore = defaults.artifactStore;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.stages = defaults.stages;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder artifactStore(@Nullable Output<PipelineArtifactStoreGetArgs> artifactStore) {
            this.artifactStore = artifactStore;
            return this;
        }
        public Builder artifactStore(@Nullable PipelineArtifactStoreGetArgs artifactStore) {
            this.artifactStore = Codegen.ofNullable(artifactStore);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }
        public Builder stages(@Nullable Output<List<PipelineStageGetArgs>> stages) {
            this.stages = stages;
            return this;
        }
        public Builder stages(@Nullable List<PipelineStageGetArgs> stages) {
            this.stages = Codegen.ofNullable(stages);
            return this;
        }
        public Builder stages(PipelineStageGetArgs... stages) {
            return stages(List.of(stages));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public PipelineState build() {
            return new PipelineState(arn, artifactStore, name, roleArn, stages, tags, tagsAll);
        }
    }
}
