// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Weekly Schedule properties, make a snapshot every week at a specific day or days
 * 
 */
public final class WeeklyScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final WeeklyScheduleArgs Empty = new WeeklyScheduleArgs();

    /**
     * Indicates which weekdays snapshot should be taken, accepts a comma separated list of week day names in english
     * 
     */
    @InputImport(name="day")
      private final @Nullable Input<String> day;

    public Input<String> getDay() {
        return this.day == null ? Input.empty() : this.day;
    }

    /**
     * Indicates which hour in UTC timezone a snapshot should be taken
     * 
     */
    @InputImport(name="hour")
      private final @Nullable Input<Integer> hour;

    public Input<Integer> getHour() {
        return this.hour == null ? Input.empty() : this.hour;
    }

    /**
     * Indicates which minute snapshot should be taken
     * 
     */
    @InputImport(name="minute")
      private final @Nullable Input<Integer> minute;

    public Input<Integer> getMinute() {
        return this.minute == null ? Input.empty() : this.minute;
    }

    /**
     * Weekly snapshot count to keep
     * 
     */
    @InputImport(name="snapshotsToKeep")
      private final @Nullable Input<Integer> snapshotsToKeep;

    public Input<Integer> getSnapshotsToKeep() {
        return this.snapshotsToKeep == null ? Input.empty() : this.snapshotsToKeep;
    }

    /**
     * Resource size in bytes, current storage usage for the volume in bytes
     * 
     */
    @InputImport(name="usedBytes")
      private final @Nullable Input<Double> usedBytes;

    public Input<Double> getUsedBytes() {
        return this.usedBytes == null ? Input.empty() : this.usedBytes;
    }

    public WeeklyScheduleArgs(
        @Nullable Input<String> day,
        @Nullable Input<Integer> hour,
        @Nullable Input<Integer> minute,
        @Nullable Input<Integer> snapshotsToKeep,
        @Nullable Input<Double> usedBytes) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.snapshotsToKeep = snapshotsToKeep;
        this.usedBytes = usedBytes;
    }

    private WeeklyScheduleArgs() {
        this.day = Input.empty();
        this.hour = Input.empty();
        this.minute = Input.empty();
        this.snapshotsToKeep = Input.empty();
        this.usedBytes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WeeklyScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> day;
        private @Nullable Input<Integer> hour;
        private @Nullable Input<Integer> minute;
        private @Nullable Input<Integer> snapshotsToKeep;
        private @Nullable Input<Double> usedBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(WeeklyScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
    	      this.minute = defaults.minute;
    	      this.snapshotsToKeep = defaults.snapshotsToKeep;
    	      this.usedBytes = defaults.usedBytes;
        }

        public Builder day(@Nullable Input<String> day) {
            this.day = day;
            return this;
        }

        public Builder day(@Nullable String day) {
            this.day = Input.ofNullable(day);
            return this;
        }

        public Builder hour(@Nullable Input<Integer> hour) {
            this.hour = hour;
            return this;
        }

        public Builder hour(@Nullable Integer hour) {
            this.hour = Input.ofNullable(hour);
            return this;
        }

        public Builder minute(@Nullable Input<Integer> minute) {
            this.minute = minute;
            return this;
        }

        public Builder minute(@Nullable Integer minute) {
            this.minute = Input.ofNullable(minute);
            return this;
        }

        public Builder snapshotsToKeep(@Nullable Input<Integer> snapshotsToKeep) {
            this.snapshotsToKeep = snapshotsToKeep;
            return this;
        }

        public Builder snapshotsToKeep(@Nullable Integer snapshotsToKeep) {
            this.snapshotsToKeep = Input.ofNullable(snapshotsToKeep);
            return this;
        }

        public Builder usedBytes(@Nullable Input<Double> usedBytes) {
            this.usedBytes = usedBytes;
            return this;
        }

        public Builder usedBytes(@Nullable Double usedBytes) {
            this.usedBytes = Input.ofNullable(usedBytes);
            return this;
        }
        public WeeklyScheduleArgs build() {
            return new WeeklyScheduleArgs(day, hour, minute, snapshotsToKeep, usedBytes);
        }
    }
}
