// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetGetArgs;
import io.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskState extends io.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskState Empty = new MaintenanceWindowTaskState();

    /**
     * The description of the maintenance window task.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The maximum number of targets this task can be run for in parallel.
     * 
     */
    @InputImport(name="maxConcurrency")
      private final @Nullable Input<String> maxConcurrency;

    public Input<String> getMaxConcurrency() {
        return this.maxConcurrency == null ? Input.empty() : this.maxConcurrency;
    }

    /**
     * The maximum number of errors allowed before this task stops being scheduled.
     * 
     */
    @InputImport(name="maxErrors")
      private final @Nullable Input<String> maxErrors;

    public Input<String> getMaxErrors() {
        return this.maxErrors == null ? Input.empty() : this.maxErrors;
    }

    /**
     * The name of the maintenance window task.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The role that should be assumed when executing the task. If a role is not provided, Systems Manager uses your account's service-linked role. If no service-linked role for Systems Manager exists in your account, it is created for you.
     * 
     */
    @InputImport(name="serviceRoleArn")
      private final @Nullable Input<String> serviceRoleArn;

    public Input<String> getServiceRoleArn() {
        return this.serviceRoleArn == null ? Input.empty() : this.serviceRoleArn;
    }

    /**
     * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * 
     */
    @InputImport(name="targets")
      private final @Nullable Input<List<MaintenanceWindowTaskTargetGetArgs>> targets;

    public Input<List<MaintenanceWindowTaskTargetGetArgs>> getTargets() {
        return this.targets == null ? Input.empty() : this.targets;
    }

    /**
     * The ARN of the task to execute.
     * 
     */
    @InputImport(name="taskArn")
      private final @Nullable Input<String> taskArn;

    public Input<String> getTaskArn() {
        return this.taskArn == null ? Input.empty() : this.taskArn;
    }

    /**
     * Configuration block with parameters for task execution.
     * 
     */
    @InputImport(name="taskInvocationParameters")
      private final @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters;

    public Input<MaintenanceWindowTaskTaskInvocationParametersGetArgs> getTaskInvocationParameters() {
        return this.taskInvocationParameters == null ? Input.empty() : this.taskInvocationParameters;
    }

    /**
     * The type of task being registered. Valid values: `AUTOMATION`, `LAMBDA`, `RUN_COMMAND` or `STEP_FUNCTIONS`.
     * 
     */
    @InputImport(name="taskType")
      private final @Nullable Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType == null ? Input.empty() : this.taskType;
    }

    /**
     * The Id of the maintenance window to register the task with.
     * 
     */
    @InputImport(name="windowId")
      private final @Nullable Input<String> windowId;

    public Input<String> getWindowId() {
        return this.windowId == null ? Input.empty() : this.windowId;
    }

    public MaintenanceWindowTaskState(
        @Nullable Input<String> description,
        @Nullable Input<String> maxConcurrency,
        @Nullable Input<String> maxErrors,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        @Nullable Input<String> serviceRoleArn,
        @Nullable Input<List<MaintenanceWindowTaskTargetGetArgs>> targets,
        @Nullable Input<String> taskArn,
        @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters,
        @Nullable Input<String> taskType,
        @Nullable Input<String> windowId) {
        this.description = description;
        this.maxConcurrency = maxConcurrency;
        this.maxErrors = maxErrors;
        this.name = name;
        this.priority = priority;
        this.serviceRoleArn = serviceRoleArn;
        this.targets = targets;
        this.taskArn = taskArn;
        this.taskInvocationParameters = taskInvocationParameters;
        this.taskType = taskType;
        this.windowId = windowId;
    }

    private MaintenanceWindowTaskState() {
        this.description = Input.empty();
        this.maxConcurrency = Input.empty();
        this.maxErrors = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.serviceRoleArn = Input.empty();
        this.targets = Input.empty();
        this.taskArn = Input.empty();
        this.taskInvocationParameters = Input.empty();
        this.taskType = Input.empty();
        this.windowId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> maxConcurrency;
        private @Nullable Input<String> maxErrors;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private @Nullable Input<String> serviceRoleArn;
        private @Nullable Input<List<MaintenanceWindowTaskTargetGetArgs>> targets;
        private @Nullable Input<String> taskArn;
        private @Nullable Input<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters;
        private @Nullable Input<String> taskType;
        private @Nullable Input<String> windowId;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceWindowTaskState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.maxConcurrency = defaults.maxConcurrency;
    	      this.maxErrors = defaults.maxErrors;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
    	      this.targets = defaults.targets;
    	      this.taskArn = defaults.taskArn;
    	      this.taskInvocationParameters = defaults.taskInvocationParameters;
    	      this.taskType = defaults.taskType;
    	      this.windowId = defaults.windowId;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder maxConcurrency(@Nullable Input<String> maxConcurrency) {
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        public Builder maxConcurrency(@Nullable String maxConcurrency) {
            this.maxConcurrency = Input.ofNullable(maxConcurrency);
            return this;
        }

        public Builder maxErrors(@Nullable Input<String> maxErrors) {
            this.maxErrors = maxErrors;
            return this;
        }

        public Builder maxErrors(@Nullable String maxErrors) {
            this.maxErrors = Input.ofNullable(maxErrors);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder priority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder serviceRoleArn(@Nullable Input<String> serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }

        public Builder serviceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = Input.ofNullable(serviceRoleArn);
            return this;
        }

        public Builder targets(@Nullable Input<List<MaintenanceWindowTaskTargetGetArgs>> targets) {
            this.targets = targets;
            return this;
        }

        public Builder targets(@Nullable List<MaintenanceWindowTaskTargetGetArgs> targets) {
            this.targets = Input.ofNullable(targets);
            return this;
        }

        public Builder taskArn(@Nullable Input<String> taskArn) {
            this.taskArn = taskArn;
            return this;
        }

        public Builder taskArn(@Nullable String taskArn) {
            this.taskArn = Input.ofNullable(taskArn);
            return this;
        }

        public Builder taskInvocationParameters(@Nullable Input<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters) {
            this.taskInvocationParameters = taskInvocationParameters;
            return this;
        }

        public Builder taskInvocationParameters(@Nullable MaintenanceWindowTaskTaskInvocationParametersGetArgs taskInvocationParameters) {
            this.taskInvocationParameters = Input.ofNullable(taskInvocationParameters);
            return this;
        }

        public Builder taskType(@Nullable Input<String> taskType) {
            this.taskType = taskType;
            return this;
        }

        public Builder taskType(@Nullable String taskType) {
            this.taskType = Input.ofNullable(taskType);
            return this;
        }

        public Builder windowId(@Nullable Input<String> windowId) {
            this.windowId = windowId;
            return this;
        }

        public Builder windowId(@Nullable String windowId) {
            this.windowId = Input.ofNullable(windowId);
            return this;
        }
        public MaintenanceWindowTaskState build() {
            return new MaintenanceWindowTaskState(description, maxConcurrency, maxErrors, name, priority, serviceRoleArn, targets, taskArn, taskInvocationParameters, taskType, windowId);
        }
    }
}
