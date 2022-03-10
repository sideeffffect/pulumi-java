// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.azurenative.labservices.enums.RecurrenceFrequency;
import io.pulumi.azurenative.labservices.enums.WeekDay;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Recurrence pattern of a lab schedule.
 * 
 */
public final class RecurrencePatternArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecurrencePatternArgs Empty = new RecurrencePatternArgs();

    /**
     * When the recurrence will expire. This date is inclusive.
     * 
     */
    @InputImport(name="expirationDate", required=true)
      private final Input<String> expirationDate;

    public Input<String> getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * The frequency of the recurrence.
     * 
     */
    @InputImport(name="frequency", required=true)
      private final Input<RecurrenceFrequency> frequency;

    public Input<RecurrenceFrequency> getFrequency() {
        return this.frequency;
    }

    /**
     * The interval to invoke the schedule on. For example, interval = 2 and RecurrenceFrequency.Daily will run every 2 days. When no interval is supplied, an interval of 1 is used.
     * 
     */
    @InputImport(name="interval")
      private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    /**
     * The week days the schedule runs. Used for when the Frequency is set to Weekly.
     * 
     */
    @InputImport(name="weekDays")
      private final @Nullable Input<List<WeekDay>> weekDays;

    public Input<List<WeekDay>> getWeekDays() {
        return this.weekDays == null ? Input.empty() : this.weekDays;
    }

    public RecurrencePatternArgs(
        Input<String> expirationDate,
        Input<RecurrenceFrequency> frequency,
        @Nullable Input<Integer> interval,
        @Nullable Input<List<WeekDay>> weekDays) {
        this.expirationDate = Objects.requireNonNull(expirationDate, "expected parameter 'expirationDate' to be non-null");
        this.frequency = Objects.requireNonNull(frequency, "expected parameter 'frequency' to be non-null");
        this.interval = interval;
        this.weekDays = weekDays;
    }

    private RecurrencePatternArgs() {
        this.expirationDate = Input.empty();
        this.frequency = Input.empty();
        this.interval = Input.empty();
        this.weekDays = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecurrencePatternArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> expirationDate;
        private Input<RecurrenceFrequency> frequency;
        private @Nullable Input<Integer> interval;
        private @Nullable Input<List<WeekDay>> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(RecurrencePatternArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder expirationDate(Input<String> expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }

        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Input.of(Objects.requireNonNull(expirationDate));
            return this;
        }

        public Builder frequency(Input<RecurrenceFrequency> frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }

        public Builder frequency(RecurrenceFrequency frequency) {
            this.frequency = Input.of(Objects.requireNonNull(frequency));
            return this;
        }

        public Builder interval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder weekDays(@Nullable Input<List<WeekDay>> weekDays) {
            this.weekDays = weekDays;
            return this;
        }

        public Builder weekDays(@Nullable List<WeekDay> weekDays) {
            this.weekDays = Input.ofNullable(weekDays);
            return this;
        }
        public RecurrencePatternArgs build() {
            return new RecurrencePatternArgs(expirationDate, frequency, interval, weekDays);
        }
    }
}
