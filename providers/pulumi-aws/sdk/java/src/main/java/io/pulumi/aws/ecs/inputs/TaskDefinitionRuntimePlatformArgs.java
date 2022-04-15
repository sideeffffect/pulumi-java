// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionRuntimePlatformArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionRuntimePlatformArgs Empty = new TaskDefinitionRuntimePlatformArgs();

    /**
     * Must be set to either `X86_64` or `ARM64`; see [cpu architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform)
     * 
     */
    @Import(name="cpuArchitecture")
      private final @Nullable Output<String> cpuArchitecture;

    public Output<String> cpuArchitecture() {
        return this.cpuArchitecture == null ? Codegen.empty() : this.cpuArchitecture;
    }

    /**
     * If the `requires_compatibilities` is `FARGATE` this field is required; must be set to a valid option from the [operating system family in the runtime platform](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform) setting
     * 
     */
    @Import(name="operatingSystemFamily")
      private final @Nullable Output<String> operatingSystemFamily;

    public Output<String> operatingSystemFamily() {
        return this.operatingSystemFamily == null ? Codegen.empty() : this.operatingSystemFamily;
    }

    public TaskDefinitionRuntimePlatformArgs(
        @Nullable Output<String> cpuArchitecture,
        @Nullable Output<String> operatingSystemFamily) {
        this.cpuArchitecture = cpuArchitecture;
        this.operatingSystemFamily = operatingSystemFamily;
    }

    private TaskDefinitionRuntimePlatformArgs() {
        this.cpuArchitecture = Codegen.empty();
        this.operatingSystemFamily = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionRuntimePlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cpuArchitecture;
        private @Nullable Output<String> operatingSystemFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionRuntimePlatformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuArchitecture = defaults.cpuArchitecture;
    	      this.operatingSystemFamily = defaults.operatingSystemFamily;
        }

        public Builder cpuArchitecture(@Nullable Output<String> cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }
        public Builder cpuArchitecture(@Nullable String cpuArchitecture) {
            this.cpuArchitecture = Codegen.ofNullable(cpuArchitecture);
            return this;
        }
        public Builder operatingSystemFamily(@Nullable Output<String> operatingSystemFamily) {
            this.operatingSystemFamily = operatingSystemFamily;
            return this;
        }
        public Builder operatingSystemFamily(@Nullable String operatingSystemFamily) {
            this.operatingSystemFamily = Codegen.ofNullable(operatingSystemFamily);
            return this;
        }        public TaskDefinitionRuntimePlatformArgs build() {
            return new TaskDefinitionRuntimePlatformArgs(cpuArchitecture, operatingSystemFamily);
        }
    }
}
