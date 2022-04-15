// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs;

import io.pulumi.aws.ecs.inputs.TaskDefinitionEphemeralStorageArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionInferenceAcceleratorArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionPlacementConstraintArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionProxyConfigurationArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionRuntimePlatformArgs;
import io.pulumi.aws.ecs.inputs.TaskDefinitionVolumeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionArgs Empty = new TaskDefinitionArgs();

    /**
     * A list of valid [container definitions](http://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_ContainerDefinition.html) provided as a single valid JSON document. Please note that you should only provide values that are part of the container definition document. For a detailed description of what parameters are available, see the [Task Definition Parameters](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html) section from the official [Developer Guide](https://docs.aws.amazon.com/AmazonECS/latest/developerguide).
     * 
     */
    @Import(name="containerDefinitions", required=true)
      private final Output<String> containerDefinitions;

    public Output<String> containerDefinitions() {
        return this.containerDefinitions;
    }

    /**
     * Number of cpu units used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<String> cpu;

    public Output<String> cpu() {
        return this.cpu == null ? Codegen.empty() : this.cpu;
    }

    /**
     * The amount of ephemeral storage to allocate for the task. This parameter is used to expand the total amount of ephemeral storage available, beyond the default amount, for tasks hosted on AWS Fargate. See Ephemeral Storage.
     * 
     */
    @Import(name="ephemeralStorage")
      private final @Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage;

    public Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage() {
        return this.ephemeralStorage == null ? Codegen.empty() : this.ephemeralStorage;
    }

    /**
     * ARN of the task execution role that the Amazon ECS container agent and the Docker daemon can assume.
     * 
     */
    @Import(name="executionRoleArn")
      private final @Nullable Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn == null ? Codegen.empty() : this.executionRoleArn;
    }

    /**
     * A unique name for your task definition.
     * 
     */
    @Import(name="family", required=true)
      private final Output<String> family;

    public Output<String> family() {
        return this.family;
    }

    /**
     * Configuration block(s) with Inference Accelerators settings. Detailed below.
     * 
     */
    @Import(name="inferenceAccelerators")
      private final @Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators;

    public Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators() {
        return this.inferenceAccelerators == null ? Codegen.empty() : this.inferenceAccelerators;
    }

    /**
     * IPC resource namespace to be used for the containers in the task The valid values are `host`, `task`, and `none`.
     * 
     */
    @Import(name="ipcMode")
      private final @Nullable Output<String> ipcMode;

    public Output<String> ipcMode() {
        return this.ipcMode == null ? Codegen.empty() : this.ipcMode;
    }

    /**
     * Amount (in MiB) of memory used by the task. If the `requires_compatibilities` is `FARGATE` this field is required.
     * 
     */
    @Import(name="memory")
      private final @Nullable Output<String> memory;

    public Output<String> memory() {
        return this.memory == null ? Codegen.empty() : this.memory;
    }

    /**
     * Docker networking mode to use for the containers in the task. Valid values are `none`, `bridge`, `awsvpc`, and `host`.
     * 
     */
    @Import(name="networkMode")
      private final @Nullable Output<String> networkMode;

    public Output<String> networkMode() {
        return this.networkMode == null ? Codegen.empty() : this.networkMode;
    }

    /**
     * Process namespace to use for the containers in the task. The valid values are `host` and `task`.
     * 
     */
    @Import(name="pidMode")
      private final @Nullable Output<String> pidMode;

    public Output<String> pidMode() {
        return this.pidMode == null ? Codegen.empty() : this.pidMode;
    }

    /**
     * Configuration block for rules that are taken into consideration during task placement. Maximum number of `placement_constraints` is `10`. Detailed below.
     * 
     */
    @Import(name="placementConstraints")
      private final @Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints;

    public Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints() {
        return this.placementConstraints == null ? Codegen.empty() : this.placementConstraints;
    }

    /**
     * Configuration block for the App Mesh proxy. Detailed below.
     * 
     */
    @Import(name="proxyConfiguration")
      private final @Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration;

    public Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration() {
        return this.proxyConfiguration == null ? Codegen.empty() : this.proxyConfiguration;
    }

    /**
     * Set of launch types required by the task. The valid values are `EC2` and `FARGATE`.
     * 
     */
    @Import(name="requiresCompatibilities")
      private final @Nullable Output<List<String>> requiresCompatibilities;

    public Output<List<String>> requiresCompatibilities() {
        return this.requiresCompatibilities == null ? Codegen.empty() : this.requiresCompatibilities;
    }

    /**
     * Configuration block for runtime_platform that containers in your task may use.
     * 
     */
    @Import(name="runtimePlatform")
      private final @Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform;

    public Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform() {
        return this.runtimePlatform == null ? Codegen.empty() : this.runtimePlatform;
    }

    @Import(name="skipDestroy")
      private final @Nullable Output<Boolean> skipDestroy;

    public Output<Boolean> skipDestroy() {
        return this.skipDestroy == null ? Codegen.empty() : this.skipDestroy;
    }

    /**
     * Key-value map of resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * ARN of IAM role that allows your Amazon ECS container task to make calls to other AWS services.
     * 
     */
    @Import(name="taskRoleArn")
      private final @Nullable Output<String> taskRoleArn;

    public Output<String> taskRoleArn() {
        return this.taskRoleArn == null ? Codegen.empty() : this.taskRoleArn;
    }

    /**
     * Configuration block for volumes that containers in your task may use. Detailed below.
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<TaskDefinitionVolumeArgs>> volumes;

    public Output<List<TaskDefinitionVolumeArgs>> volumes() {
        return this.volumes == null ? Codegen.empty() : this.volumes;
    }

    public TaskDefinitionArgs(
        Output<String> containerDefinitions,
        @Nullable Output<String> cpu,
        @Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage,
        @Nullable Output<String> executionRoleArn,
        Output<String> family,
        @Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators,
        @Nullable Output<String> ipcMode,
        @Nullable Output<String> memory,
        @Nullable Output<String> networkMode,
        @Nullable Output<String> pidMode,
        @Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints,
        @Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration,
        @Nullable Output<List<String>> requiresCompatibilities,
        @Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform,
        @Nullable Output<Boolean> skipDestroy,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> taskRoleArn,
        @Nullable Output<List<TaskDefinitionVolumeArgs>> volumes) {
        this.containerDefinitions = Objects.requireNonNull(containerDefinitions, "expected parameter 'containerDefinitions' to be non-null");
        this.cpu = cpu;
        this.ephemeralStorage = ephemeralStorage;
        this.executionRoleArn = executionRoleArn;
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.inferenceAccelerators = inferenceAccelerators;
        this.ipcMode = ipcMode;
        this.memory = memory;
        this.networkMode = networkMode;
        this.pidMode = pidMode;
        this.placementConstraints = placementConstraints;
        this.proxyConfiguration = proxyConfiguration;
        this.requiresCompatibilities = requiresCompatibilities;
        this.runtimePlatform = runtimePlatform;
        this.skipDestroy = skipDestroy;
        this.tags = tags;
        this.taskRoleArn = taskRoleArn;
        this.volumes = volumes;
    }

    private TaskDefinitionArgs() {
        this.containerDefinitions = Codegen.empty();
        this.cpu = Codegen.empty();
        this.ephemeralStorage = Codegen.empty();
        this.executionRoleArn = Codegen.empty();
        this.family = Codegen.empty();
        this.inferenceAccelerators = Codegen.empty();
        this.ipcMode = Codegen.empty();
        this.memory = Codegen.empty();
        this.networkMode = Codegen.empty();
        this.pidMode = Codegen.empty();
        this.placementConstraints = Codegen.empty();
        this.proxyConfiguration = Codegen.empty();
        this.requiresCompatibilities = Codegen.empty();
        this.runtimePlatform = Codegen.empty();
        this.skipDestroy = Codegen.empty();
        this.tags = Codegen.empty();
        this.taskRoleArn = Codegen.empty();
        this.volumes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> containerDefinitions;
        private @Nullable Output<String> cpu;
        private @Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage;
        private @Nullable Output<String> executionRoleArn;
        private Output<String> family;
        private @Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators;
        private @Nullable Output<String> ipcMode;
        private @Nullable Output<String> memory;
        private @Nullable Output<String> networkMode;
        private @Nullable Output<String> pidMode;
        private @Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints;
        private @Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration;
        private @Nullable Output<List<String>> requiresCompatibilities;
        private @Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform;
        private @Nullable Output<Boolean> skipDestroy;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> taskRoleArn;
        private @Nullable Output<List<TaskDefinitionVolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerDefinitions = defaults.containerDefinitions;
    	      this.cpu = defaults.cpu;
    	      this.ephemeralStorage = defaults.ephemeralStorage;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.family = defaults.family;
    	      this.inferenceAccelerators = defaults.inferenceAccelerators;
    	      this.ipcMode = defaults.ipcMode;
    	      this.memory = defaults.memory;
    	      this.networkMode = defaults.networkMode;
    	      this.pidMode = defaults.pidMode;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.proxyConfiguration = defaults.proxyConfiguration;
    	      this.requiresCompatibilities = defaults.requiresCompatibilities;
    	      this.runtimePlatform = defaults.runtimePlatform;
    	      this.skipDestroy = defaults.skipDestroy;
    	      this.tags = defaults.tags;
    	      this.taskRoleArn = defaults.taskRoleArn;
    	      this.volumes = defaults.volumes;
        }

        public Builder containerDefinitions(Output<String> containerDefinitions) {
            this.containerDefinitions = Objects.requireNonNull(containerDefinitions);
            return this;
        }
        public Builder containerDefinitions(String containerDefinitions) {
            this.containerDefinitions = Output.of(Objects.requireNonNull(containerDefinitions));
            return this;
        }
        public Builder cpu(@Nullable Output<String> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable String cpu) {
            this.cpu = Codegen.ofNullable(cpu);
            return this;
        }
        public Builder ephemeralStorage(@Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }
        public Builder ephemeralStorage(@Nullable TaskDefinitionEphemeralStorageArgs ephemeralStorage) {
            this.ephemeralStorage = Codegen.ofNullable(ephemeralStorage);
            return this;
        }
        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public Builder executionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Codegen.ofNullable(executionRoleArn);
            return this;
        }
        public Builder family(Output<String> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder family(String family) {
            this.family = Output.of(Objects.requireNonNull(family));
            return this;
        }
        public Builder inferenceAccelerators(@Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators) {
            this.inferenceAccelerators = inferenceAccelerators;
            return this;
        }
        public Builder inferenceAccelerators(@Nullable List<TaskDefinitionInferenceAcceleratorArgs> inferenceAccelerators) {
            this.inferenceAccelerators = Codegen.ofNullable(inferenceAccelerators);
            return this;
        }
        public Builder inferenceAccelerators(TaskDefinitionInferenceAcceleratorArgs... inferenceAccelerators) {
            return inferenceAccelerators(List.of(inferenceAccelerators));
        }
        public Builder ipcMode(@Nullable Output<String> ipcMode) {
            this.ipcMode = ipcMode;
            return this;
        }
        public Builder ipcMode(@Nullable String ipcMode) {
            this.ipcMode = Codegen.ofNullable(ipcMode);
            return this;
        }
        public Builder memory(@Nullable Output<String> memory) {
            this.memory = memory;
            return this;
        }
        public Builder memory(@Nullable String memory) {
            this.memory = Codegen.ofNullable(memory);
            return this;
        }
        public Builder networkMode(@Nullable Output<String> networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public Builder networkMode(@Nullable String networkMode) {
            this.networkMode = Codegen.ofNullable(networkMode);
            return this;
        }
        public Builder pidMode(@Nullable Output<String> pidMode) {
            this.pidMode = pidMode;
            return this;
        }
        public Builder pidMode(@Nullable String pidMode) {
            this.pidMode = Codegen.ofNullable(pidMode);
            return this;
        }
        public Builder placementConstraints(@Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }
        public Builder placementConstraints(@Nullable List<TaskDefinitionPlacementConstraintArgs> placementConstraints) {
            this.placementConstraints = Codegen.ofNullable(placementConstraints);
            return this;
        }
        public Builder placementConstraints(TaskDefinitionPlacementConstraintArgs... placementConstraints) {
            return placementConstraints(List.of(placementConstraints));
        }
        public Builder proxyConfiguration(@Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public Builder proxyConfiguration(@Nullable TaskDefinitionProxyConfigurationArgs proxyConfiguration) {
            this.proxyConfiguration = Codegen.ofNullable(proxyConfiguration);
            return this;
        }
        public Builder requiresCompatibilities(@Nullable Output<List<String>> requiresCompatibilities) {
            this.requiresCompatibilities = requiresCompatibilities;
            return this;
        }
        public Builder requiresCompatibilities(@Nullable List<String> requiresCompatibilities) {
            this.requiresCompatibilities = Codegen.ofNullable(requiresCompatibilities);
            return this;
        }
        public Builder requiresCompatibilities(String... requiresCompatibilities) {
            return requiresCompatibilities(List.of(requiresCompatibilities));
        }
        public Builder runtimePlatform(@Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform) {
            this.runtimePlatform = runtimePlatform;
            return this;
        }
        public Builder runtimePlatform(@Nullable TaskDefinitionRuntimePlatformArgs runtimePlatform) {
            this.runtimePlatform = Codegen.ofNullable(runtimePlatform);
            return this;
        }
        public Builder skipDestroy(@Nullable Output<Boolean> skipDestroy) {
            this.skipDestroy = skipDestroy;
            return this;
        }
        public Builder skipDestroy(@Nullable Boolean skipDestroy) {
            this.skipDestroy = Codegen.ofNullable(skipDestroy);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder taskRoleArn(@Nullable Output<String> taskRoleArn) {
            this.taskRoleArn = taskRoleArn;
            return this;
        }
        public Builder taskRoleArn(@Nullable String taskRoleArn) {
            this.taskRoleArn = Codegen.ofNullable(taskRoleArn);
            return this;
        }
        public Builder volumes(@Nullable Output<List<TaskDefinitionVolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(@Nullable List<TaskDefinitionVolumeArgs> volumes) {
            this.volumes = Codegen.ofNullable(volumes);
            return this;
        }
        public Builder volumes(TaskDefinitionVolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }        public TaskDefinitionArgs build() {
            return new TaskDefinitionArgs(containerDefinitions, cpu, ephemeralStorage, executionRoleArn, family, inferenceAccelerators, ipcMode, memory, networkMode, pidMode, placementConstraints, proxyConfiguration, requiresCompatibilities, runtimePlatform, skipDestroy, tags, taskRoleArn, volumes);
        }
    }
}
