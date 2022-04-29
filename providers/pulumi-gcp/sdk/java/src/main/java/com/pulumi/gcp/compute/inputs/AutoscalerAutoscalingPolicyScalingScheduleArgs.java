// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyScalingScheduleArgs extends ResourceArgs {

    public static final AutoscalerAutoscalingPolicyScalingScheduleArgs Empty = new AutoscalerAutoscalingPolicyScalingScheduleArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
     */
    @Import(name="durationSec", required=true)
    private Output<Integer> durationSec;

    /**
     * @return The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
     * 
     */
    public Output<Integer> durationSec() {
        return this.durationSec;
    }

    /**
     * Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
     */
    @Import(name="minRequiredReplicas", required=true)
    private Output<Integer> minRequiredReplicas;

    /**
     * @return Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
     * 
     */
    public Output<Integer> minRequiredReplicas() {
        return this.minRequiredReplicas;
    }

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
     */
    @Import(name="schedule", required=true)
    private Output<String> schedule;

    /**
     * @return The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
     * 
     */
    public Output<String> schedule() {
        return this.schedule;
    }

    /**
     * The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    private AutoscalerAutoscalingPolicyScalingScheduleArgs() {}

    private AutoscalerAutoscalingPolicyScalingScheduleArgs(AutoscalerAutoscalingPolicyScalingScheduleArgs $) {
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
    public static Builder builder(AutoscalerAutoscalingPolicyScalingScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscalerAutoscalingPolicyScalingScheduleArgs $;

        public Builder() {
            $ = new AutoscalerAutoscalingPolicyScalingScheduleArgs();
        }

        public Builder(AutoscalerAutoscalingPolicyScalingScheduleArgs defaults) {
            $ = new AutoscalerAutoscalingPolicyScalingScheduleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disabled A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled A boolean value that specifies if a scaling schedule can influence autoscaler recommendations. If set to true, then a scaling schedule has no effect.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param durationSec The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
         * 
         * @return builder
         * 
         */
        public Builder durationSec(Output<Integer> durationSec) {
            $.durationSec = durationSec;
            return this;
        }

        /**
         * @param durationSec The duration of time intervals (in seconds) for which this scaling schedule will be running. The minimum allowed value is 300.
         * 
         * @return builder
         * 
         */
        public Builder durationSec(Integer durationSec) {
            return durationSec(Output.of(durationSec));
        }

        /**
         * @param minRequiredReplicas Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
         * 
         * @return builder
         * 
         */
        public Builder minRequiredReplicas(Output<Integer> minRequiredReplicas) {
            $.minRequiredReplicas = minRequiredReplicas;
            return this;
        }

        /**
         * @param minRequiredReplicas Minimum number of VM instances that autoscaler will recommend in time intervals starting according to schedule.
         * 
         * @return builder
         * 
         */
        public Builder minRequiredReplicas(Integer minRequiredReplicas) {
            return minRequiredReplicas(Output.of(minRequiredReplicas));
        }

        /**
         * @param name The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
         * 
         * @return builder
         * 
         */
        public Builder schedule(Output<String> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The start timestamps of time intervals when this scaling schedule should provide a scaling signal. This field uses the extended cron format (with an optional year field).
         * 
         * @return builder
         * 
         */
        public Builder schedule(String schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param timeZone The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone The time zone to be used when interpreting the schedule. The value of this field must be a time zone name from the tz database: http://en.wikipedia.org/wiki/Tz_database.
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        public AutoscalerAutoscalingPolicyScalingScheduleArgs build() {
            $.durationSec = Objects.requireNonNull($.durationSec, "expected parameter 'durationSec' to be non-null");
            $.minRequiredReplicas = Objects.requireNonNull($.minRequiredReplicas, "expected parameter 'minRequiredReplicas' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.schedule = Objects.requireNonNull($.schedule, "expected parameter 'schedule' to be non-null");
            return $;
        }
    }

}
