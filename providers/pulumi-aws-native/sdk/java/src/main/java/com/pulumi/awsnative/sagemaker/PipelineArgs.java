// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker;

import com.pulumi.awsnative.sagemaker.inputs.ParallelismConfigurationPropertiesArgs;
import com.pulumi.awsnative.sagemaker.inputs.PipelineTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    @Import(name="parallelismConfiguration")
      private final @Nullable Output<ParallelismConfigurationPropertiesArgs> parallelismConfiguration;

    public Output<ParallelismConfigurationPropertiesArgs> parallelismConfiguration() {
        return this.parallelismConfiguration == null ? Codegen.empty() : this.parallelismConfiguration;
    }

    @Import(name="pipelineDefinition", required=true)
      private final Output<Object> pipelineDefinition;

    public Output<Object> pipelineDefinition() {
        return this.pipelineDefinition;
    }

    /**
     * The description of the Pipeline.
     * 
     */
    @Import(name="pipelineDescription")
      private final @Nullable Output<String> pipelineDescription;

    public Output<String> pipelineDescription() {
        return this.pipelineDescription == null ? Codegen.empty() : this.pipelineDescription;
    }

    /**
     * The display name of the Pipeline.
     * 
     */
    @Import(name="pipelineDisplayName")
      private final @Nullable Output<String> pipelineDisplayName;

    public Output<String> pipelineDisplayName() {
        return this.pipelineDisplayName == null ? Codegen.empty() : this.pipelineDisplayName;
    }

    /**
     * The name of the Pipeline.
     * 
     */
    @Import(name="pipelineName")
      private final @Nullable Output<String> pipelineName;

    public Output<String> pipelineName() {
        return this.pipelineName == null ? Codegen.empty() : this.pipelineName;
    }

    /**
     * Role Arn
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="tags")
      private final @Nullable Output<List<PipelineTagArgs>> tags;

    public Output<List<PipelineTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PipelineArgs(
        @Nullable Output<ParallelismConfigurationPropertiesArgs> parallelismConfiguration,
        Output<Object> pipelineDefinition,
        @Nullable Output<String> pipelineDescription,
        @Nullable Output<String> pipelineDisplayName,
        @Nullable Output<String> pipelineName,
        Output<String> roleArn,
        @Nullable Output<List<PipelineTagArgs>> tags) {
        this.parallelismConfiguration = parallelismConfiguration;
        this.pipelineDefinition = Objects.requireNonNull(pipelineDefinition, "expected parameter 'pipelineDefinition' to be non-null");
        this.pipelineDescription = pipelineDescription;
        this.pipelineDisplayName = pipelineDisplayName;
        this.pipelineName = pipelineName;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.tags = tags;
    }

    private PipelineArgs() {
        this.parallelismConfiguration = Codegen.empty();
        this.pipelineDefinition = Codegen.empty();
        this.pipelineDescription = Codegen.empty();
        this.pipelineDisplayName = Codegen.empty();
        this.pipelineName = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ParallelismConfigurationPropertiesArgs> parallelismConfiguration;
        private Output<Object> pipelineDefinition;
        private @Nullable Output<String> pipelineDescription;
        private @Nullable Output<String> pipelineDisplayName;
        private @Nullable Output<String> pipelineName;
        private Output<String> roleArn;
        private @Nullable Output<List<PipelineTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parallelismConfiguration = defaults.parallelismConfiguration;
    	      this.pipelineDefinition = defaults.pipelineDefinition;
    	      this.pipelineDescription = defaults.pipelineDescription;
    	      this.pipelineDisplayName = defaults.pipelineDisplayName;
    	      this.pipelineName = defaults.pipelineName;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
        }

        public Builder parallelismConfiguration(@Nullable Output<ParallelismConfigurationPropertiesArgs> parallelismConfiguration) {
            this.parallelismConfiguration = parallelismConfiguration;
            return this;
        }
        public Builder parallelismConfiguration(@Nullable ParallelismConfigurationPropertiesArgs parallelismConfiguration) {
            this.parallelismConfiguration = Codegen.ofNullable(parallelismConfiguration);
            return this;
        }
        public Builder pipelineDefinition(Output<Object> pipelineDefinition) {
            this.pipelineDefinition = Objects.requireNonNull(pipelineDefinition);
            return this;
        }
        public Builder pipelineDefinition(Object pipelineDefinition) {
            this.pipelineDefinition = Output.of(Objects.requireNonNull(pipelineDefinition));
            return this;
        }
        public Builder pipelineDescription(@Nullable Output<String> pipelineDescription) {
            this.pipelineDescription = pipelineDescription;
            return this;
        }
        public Builder pipelineDescription(@Nullable String pipelineDescription) {
            this.pipelineDescription = Codegen.ofNullable(pipelineDescription);
            return this;
        }
        public Builder pipelineDisplayName(@Nullable Output<String> pipelineDisplayName) {
            this.pipelineDisplayName = pipelineDisplayName;
            return this;
        }
        public Builder pipelineDisplayName(@Nullable String pipelineDisplayName) {
            this.pipelineDisplayName = Codegen.ofNullable(pipelineDisplayName);
            return this;
        }
        public Builder pipelineName(@Nullable Output<String> pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public Builder pipelineName(@Nullable String pipelineName) {
            this.pipelineName = Codegen.ofNullable(pipelineName);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
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
            return new PipelineArgs(parallelismConfiguration, pipelineDefinition, pipelineDescription, pipelineDisplayName, pipelineName, roleArn, tags);
        }
    }
}
