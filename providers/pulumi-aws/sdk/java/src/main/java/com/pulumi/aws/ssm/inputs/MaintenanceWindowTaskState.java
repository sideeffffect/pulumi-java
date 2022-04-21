// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.inputs;

import com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTargetGetArgs;
import com.pulumi.aws.ssm.inputs.MaintenanceWindowTaskTaskInvocationParametersGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceWindowTaskState extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceWindowTaskState Empty = new MaintenanceWindowTaskState();

    /**
     * The description of the maintenance window task.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The maximum number of targets this task can be run for in parallel.
     * 
     */
    @Import(name="maxConcurrency")
    private @Nullable Output<String> maxConcurrency;

    public Optional<Output<String>> maxConcurrency() {
        return Optional.ofNullable(this.maxConcurrency);
    }

    /**
     * The maximum number of errors allowed before this task stops being scheduled.
     * 
     */
    @Import(name="maxErrors")
    private @Nullable Output<String> maxErrors;

    public Optional<Output<String>> maxErrors() {
        return Optional.ofNullable(this.maxErrors);
    }

    /**
     * The name of the maintenance window task.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The role that should be assumed when executing the task. If a role is not provided, Systems Manager uses your account&#39;s service-linked role. If no service-linked role for Systems Manager exists in your account, it is created for you.
     * 
     */
    @Import(name="serviceRoleArn")
    private @Nullable Output<String> serviceRoleArn;

    public Optional<Output<String>> serviceRoleArn() {
        return Optional.ofNullable(this.serviceRoleArn);
    }

    /**
     * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
     * 
     */
    @Import(name="targets")
    private @Nullable Output<List<MaintenanceWindowTaskTargetGetArgs>> targets;

    public Optional<Output<List<MaintenanceWindowTaskTargetGetArgs>>> targets() {
        return Optional.ofNullable(this.targets);
    }

    /**
     * The ARN of the task to execute.
     * 
     */
    @Import(name="taskArn")
    private @Nullable Output<String> taskArn;

    public Optional<Output<String>> taskArn() {
        return Optional.ofNullable(this.taskArn);
    }

    /**
     * Configuration block with parameters for task execution.
     * 
     */
    @Import(name="taskInvocationParameters")
    private @Nullable Output<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters;

    public Optional<Output<MaintenanceWindowTaskTaskInvocationParametersGetArgs>> taskInvocationParameters() {
        return Optional.ofNullable(this.taskInvocationParameters);
    }

    /**
     * The type of task being registered. Valid values: `AUTOMATION`, `LAMBDA`, `RUN_COMMAND` or `STEP_FUNCTIONS`.
     * 
     */
    @Import(name="taskType")
    private @Nullable Output<String> taskType;

    public Optional<Output<String>> taskType() {
        return Optional.ofNullable(this.taskType);
    }

    /**
     * The Id of the maintenance window to register the task with.
     * 
     */
    @Import(name="windowId")
    private @Nullable Output<String> windowId;

    public Optional<Output<String>> windowId() {
        return Optional.ofNullable(this.windowId);
    }

    private MaintenanceWindowTaskState() {}

    private MaintenanceWindowTaskState(MaintenanceWindowTaskState $) {
        this.description = $.description;
        this.maxConcurrency = $.maxConcurrency;
        this.maxErrors = $.maxErrors;
        this.name = $.name;
        this.priority = $.priority;
        this.serviceRoleArn = $.serviceRoleArn;
        this.targets = $.targets;
        this.taskArn = $.taskArn;
        this.taskInvocationParameters = $.taskInvocationParameters;
        this.taskType = $.taskType;
        this.windowId = $.windowId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceWindowTaskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceWindowTaskState $;

        public Builder() {
            $ = new MaintenanceWindowTaskState();
        }

        public Builder(MaintenanceWindowTaskState defaults) {
            $ = new MaintenanceWindowTaskState(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder maxConcurrency(@Nullable Output<String> maxConcurrency) {
            $.maxConcurrency = maxConcurrency;
            return this;
        }

        public Builder maxConcurrency(String maxConcurrency) {
            return maxConcurrency(Output.of(maxConcurrency));
        }

        public Builder maxErrors(@Nullable Output<String> maxErrors) {
            $.maxErrors = maxErrors;
            return this;
        }

        public Builder maxErrors(String maxErrors) {
            return maxErrors(Output.of(maxErrors));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder serviceRoleArn(@Nullable Output<String> serviceRoleArn) {
            $.serviceRoleArn = serviceRoleArn;
            return this;
        }

        public Builder serviceRoleArn(String serviceRoleArn) {
            return serviceRoleArn(Output.of(serviceRoleArn));
        }

        public Builder targets(@Nullable Output<List<MaintenanceWindowTaskTargetGetArgs>> targets) {
            $.targets = targets;
            return this;
        }

        public Builder targets(List<MaintenanceWindowTaskTargetGetArgs> targets) {
            return targets(Output.of(targets));
        }

        public Builder targets(MaintenanceWindowTaskTargetGetArgs... targets) {
            return targets(List.of(targets));
        }

        public Builder taskArn(@Nullable Output<String> taskArn) {
            $.taskArn = taskArn;
            return this;
        }

        public Builder taskArn(String taskArn) {
            return taskArn(Output.of(taskArn));
        }

        public Builder taskInvocationParameters(@Nullable Output<MaintenanceWindowTaskTaskInvocationParametersGetArgs> taskInvocationParameters) {
            $.taskInvocationParameters = taskInvocationParameters;
            return this;
        }

        public Builder taskInvocationParameters(MaintenanceWindowTaskTaskInvocationParametersGetArgs taskInvocationParameters) {
            return taskInvocationParameters(Output.of(taskInvocationParameters));
        }

        public Builder taskType(@Nullable Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public Builder windowId(@Nullable Output<String> windowId) {
            $.windowId = windowId;
            return this;
        }

        public Builder windowId(String windowId) {
            return windowId(Output.of(windowId));
        }

        public MaintenanceWindowTaskState build() {
            return $;
        }
    }

}
