// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyScalingScheduleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyScalingScheduleArgs Empty = new AutoscalarAutoscalingPolicyScalingScheduleArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
     */
    @Import(name="durationSec", required=true)
    private Output<Integer> durationSec;

    public Output<Integer> durationSec() {
        return this.durationSec;
    }

    /**
     * Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
     */
    @Import(name="minRequiredReplicas", required=true)
    private Output<Integer> minRequiredReplicas;

    public Output<Integer> minRequiredReplicas() {
        return this.minRequiredReplicas;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
     */
    @Import(name="schedule", required=true)
    private Output<String> schedule;

    public Output<String> schedule() {
        return this.schedule;
    }

    /**
     * The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private AutoscalarAutoscalingPolicyScalingScheduleArgs() {}

    private AutoscalarAutoscalingPolicyScalingScheduleArgs(AutoscalarAutoscalingPolicyScalingScheduleArgs $) {
        this.description = $.description;
        this.disabled = $.disabled;
        this.durationSec = $.durationSec;
        this.minRequiredReplicas = $.minRequiredReplicas;
        this.name = $.name;
        this.schedule = $.schedule;
        this.timeZone = $.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscalarAutoscalingPolicyScalingScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalarAutoscalingPolicyScalingScheduleArgs $;

        public Builder() {
            $ = new AutoscalarAutoscalingPolicyScalingScheduleArgs();
        }

        public Builder(AutoscalarAutoscalingPolicyScalingScheduleArgs defaults) {
            $ = new AutoscalarAutoscalingPolicyScalingScheduleArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder durationSec(Output<Integer> durationSec) {
            $.durationSec = durationSec;
            return this;
        }

        public Builder durationSec(Integer durationSec) {
            return durationSec(Output.of(durationSec));
        }

        public Builder minRequiredReplicas(Output<Integer> minRequiredReplicas) {
            $.minRequiredReplicas = minRequiredReplicas;
            return this;
        }

        public Builder minRequiredReplicas(Integer minRequiredReplicas) {
            return minRequiredReplicas(Output.of(minRequiredReplicas));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder schedule(Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public AutoscalarAutoscalingPolicyScalingScheduleArgs build() {
            $.durationSec = Objects.requireNonNull($.durationSec, "expected parameter 'durationSec' to be non-null");
            $.minRequiredReplicas = Objects.requireNonNull($.minRequiredReplicas, "expected parameter 'minRequiredReplicas' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            return $;
        }
    }

}
