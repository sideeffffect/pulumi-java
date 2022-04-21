// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.redshift;

import com.pulumi.awsnative.redshift.inputs.ScheduledActionTypeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduledActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScheduledActionArgs Empty = new ScheduledActionArgs();

    /**
     * If true, the schedule is enabled. If false, the scheduled action does not trigger.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The IAM role to assume to run the target action.
     * 
     */
    @Import(name="iamRole")
    private @Nullable Output<String> iamRole;

    public Optional<Output<String>> iamRole() {
        return Optional.ofNullable(this.iamRole);
    }

    /**
     * The schedule in `at( )` or `cron( )` format.
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<String> schedule;

    public Optional<Output<String>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    /**
     * The description of the scheduled action.
     * 
     */
    @Import(name="scheduledActionDescription")
    private @Nullable Output<String> scheduledActionDescription;

    public Optional<Output<String>> scheduledActionDescription() {
        return Optional.ofNullable(this.scheduledActionDescription);
    }

    /**
     * The name of the scheduled action. The name must be unique within an account.
     * 
     */
    @Import(name="scheduledActionName")
    private @Nullable Output<String> scheduledActionName;

    public Optional<Output<String>> scheduledActionName() {
        return Optional.ofNullable(this.scheduledActionName);
    }

    /**
     * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * A JSON format string of the Amazon Redshift API operation with input parameters.
     * 
     */
    @Import(name="targetAction")
    private @Nullable Output<ScheduledActionTypeArgs> targetAction;

    public Optional<Output<ScheduledActionTypeArgs>> targetAction() {
        return Optional.ofNullable(this.targetAction);
    }

    private ScheduledActionArgs() {}

    private ScheduledActionArgs(ScheduledActionArgs $) {
        this.enable = $.enable;
        this.endTime = $.endTime;
        this.iamRole = $.iamRole;
        this.schedule = $.schedule;
        this.scheduledActionDescription = $.scheduledActionDescription;
        this.scheduledActionName = $.scheduledActionName;
        this.startTime = $.startTime;
        this.targetAction = $.targetAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduledActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduledActionArgs $;

        public Builder() {
            $ = new ScheduledActionArgs();
        }

        public Builder(ScheduledActionArgs defaults) {
            $ = new ScheduledActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder iamRole(@Nullable Output<String> iamRole) {
            $.iamRole = iamRole;
            return this;
        }

        public Builder iamRole(String iamRole) {
            return iamRole(Output.of(iamRole));
        }

        public Builder schedule(@Nullable Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        public Builder scheduledActionDescription(@Nullable Output<String> scheduledActionDescription) {
            $.scheduledActionDescription = scheduledActionDescription;
            return this;
        }

        public Builder scheduledActionDescription(String scheduledActionDescription) {
            return scheduledActionDescription(Output.of(scheduledActionDescription));
        }

        public Builder scheduledActionName(@Nullable Output<String> scheduledActionName) {
            $.scheduledActionName = scheduledActionName;
            return this;
        }

        public Builder scheduledActionName(String scheduledActionName) {
            return scheduledActionName(Output.of(scheduledActionName));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder targetAction(@Nullable Output<ScheduledActionTypeArgs> targetAction) {
            $.targetAction = targetAction;
            return this;
        }

        public Builder targetAction(ScheduledActionTypeArgs targetAction) {
            return targetAction(Output.of(targetAction));
        }

        public ScheduledActionArgs build() {
            return $;
        }
    }

}
