// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class TransferJobScheduleStartTimeOfDayGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobScheduleStartTimeOfDayGetArgs Empty = new TransferJobScheduleStartTimeOfDayGetArgs();

    /**
     * Hours of day in 24 hour format. Should be from 0 to 23
     * 
     */
    @InputImport(name="hours", required=true)
      private final Input<Integer> hours;

    public Input<Integer> getHours() {
        return this.hours;
    }

    /**
     * Minutes of hour of day. Must be from 0 to 59.
     * 
     */
    @InputImport(name="minutes", required=true)
      private final Input<Integer> minutes;

    public Input<Integer> getMinutes() {
        return this.minutes;
    }

    /**
     * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
     * 
     */
    @InputImport(name="nanos", required=true)
      private final Input<Integer> nanos;

    public Input<Integer> getNanos() {
        return this.nanos;
    }

    /**
     * Seconds of minutes of the time. Must normally be from 0 to 59.
     * 
     */
    @InputImport(name="seconds", required=true)
      private final Input<Integer> seconds;

    public Input<Integer> getSeconds() {
        return this.seconds;
    }

    public TransferJobScheduleStartTimeOfDayGetArgs(
        Input<Integer> hours,
        Input<Integer> minutes,
        Input<Integer> nanos,
        Input<Integer> seconds) {
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
        this.nanos = Objects.requireNonNull(nanos, "expected parameter 'nanos' to be non-null");
        this.seconds = Objects.requireNonNull(seconds, "expected parameter 'seconds' to be non-null");
    }

    private TransferJobScheduleStartTimeOfDayGetArgs() {
        this.hours = Input.empty();
        this.minutes = Input.empty();
        this.nanos = Input.empty();
        this.seconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobScheduleStartTimeOfDayGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> hours;
        private Input<Integer> minutes;
        private Input<Integer> nanos;
        private Input<Integer> seconds;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobScheduleStartTimeOfDayGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.nanos = defaults.nanos;
    	      this.seconds = defaults.seconds;
        }

        public Builder hours(Input<Integer> hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }

        public Builder hours(Integer hours) {
            this.hours = Input.of(Objects.requireNonNull(hours));
            return this;
        }

        public Builder minutes(Input<Integer> minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }

        public Builder minutes(Integer minutes) {
            this.minutes = Input.of(Objects.requireNonNull(minutes));
            return this;
        }

        public Builder nanos(Input<Integer> nanos) {
            this.nanos = Objects.requireNonNull(nanos);
            return this;
        }

        public Builder nanos(Integer nanos) {
            this.nanos = Input.of(Objects.requireNonNull(nanos));
            return this;
        }

        public Builder seconds(Input<Integer> seconds) {
            this.seconds = Objects.requireNonNull(seconds);
            return this;
        }

        public Builder seconds(Integer seconds) {
            this.seconds = Input.of(Objects.requireNonNull(seconds));
            return this;
        }
        public TransferJobScheduleStartTimeOfDayGetArgs build() {
            return new TransferJobScheduleStartTimeOfDayGetArgs(hours, minutes, nanos, seconds);
        }
    }
}
