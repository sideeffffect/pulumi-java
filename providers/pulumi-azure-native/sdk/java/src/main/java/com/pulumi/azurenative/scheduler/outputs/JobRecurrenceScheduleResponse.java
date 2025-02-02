// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.outputs;

import com.pulumi.azurenative.scheduler.outputs.JobRecurrenceScheduleMonthlyOccurrenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class JobRecurrenceScheduleResponse {
    /**
     * @return Gets or sets the hours of the day that the job should execute at.
     * 
     */
    private final @Nullable List<Integer> hours;
    /**
     * @return Gets or sets the minutes of the hour that the job should execute at.
     * 
     */
    private final @Nullable List<Integer> minutes;
    /**
     * @return Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
     * 
     */
    private final @Nullable List<Integer> monthDays;
    /**
     * @return Gets or sets the occurrences of days within a month.
     * 
     */
    private final @Nullable List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences;
    /**
     * @return Gets or sets the days of the week that the job should execute on.
     * 
     */
    private final @Nullable List<String> weekDays;

    @CustomType.Constructor
    private JobRecurrenceScheduleResponse(
        @CustomType.Parameter("hours") @Nullable List<Integer> hours,
        @CustomType.Parameter("minutes") @Nullable List<Integer> minutes,
        @CustomType.Parameter("monthDays") @Nullable List<Integer> monthDays,
        @CustomType.Parameter("monthlyOccurrences") @Nullable List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences,
        @CustomType.Parameter("weekDays") @Nullable List<String> weekDays) {
        this.hours = hours;
        this.minutes = minutes;
        this.monthDays = monthDays;
        this.monthlyOccurrences = monthlyOccurrences;
        this.weekDays = weekDays;
    }

    /**
     * @return Gets or sets the hours of the day that the job should execute at.
     * 
     */
    public List<Integer> hours() {
        return this.hours == null ? List.of() : this.hours;
    }
    /**
     * @return Gets or sets the minutes of the hour that the job should execute at.
     * 
     */
    public List<Integer> minutes() {
        return this.minutes == null ? List.of() : this.minutes;
    }
    /**
     * @return Gets or sets the days of the month that the job should execute on. Must be between 1 and 31.
     * 
     */
    public List<Integer> monthDays() {
        return this.monthDays == null ? List.of() : this.monthDays;
    }
    /**
     * @return Gets or sets the occurrences of days within a month.
     * 
     */
    public List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences() {
        return this.monthlyOccurrences == null ? List.of() : this.monthlyOccurrences;
    }
    /**
     * @return Gets or sets the days of the week that the job should execute on.
     * 
     */
    public List<String> weekDays() {
        return this.weekDays == null ? List.of() : this.weekDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRecurrenceScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<Integer> hours;
        private @Nullable List<Integer> minutes;
        private @Nullable List<Integer> monthDays;
        private @Nullable List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences;
        private @Nullable List<String> weekDays;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRecurrenceScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
    	      this.monthDays = defaults.monthDays;
    	      this.monthlyOccurrences = defaults.monthlyOccurrences;
    	      this.weekDays = defaults.weekDays;
        }

        public Builder hours(@Nullable List<Integer> hours) {
            this.hours = hours;
            return this;
        }
        public Builder hours(Integer... hours) {
            return hours(List.of(hours));
        }
        public Builder minutes(@Nullable List<Integer> minutes) {
            this.minutes = minutes;
            return this;
        }
        public Builder minutes(Integer... minutes) {
            return minutes(List.of(minutes));
        }
        public Builder monthDays(@Nullable List<Integer> monthDays) {
            this.monthDays = monthDays;
            return this;
        }
        public Builder monthDays(Integer... monthDays) {
            return monthDays(List.of(monthDays));
        }
        public Builder monthlyOccurrences(@Nullable List<JobRecurrenceScheduleMonthlyOccurrenceResponse> monthlyOccurrences) {
            this.monthlyOccurrences = monthlyOccurrences;
            return this;
        }
        public Builder monthlyOccurrences(JobRecurrenceScheduleMonthlyOccurrenceResponse... monthlyOccurrences) {
            return monthlyOccurrences(List.of(monthlyOccurrences));
        }
        public Builder weekDays(@Nullable List<String> weekDays) {
            this.weekDays = weekDays;
            return this;
        }
        public Builder weekDays(String... weekDays) {
            return weekDays(List.of(weekDays));
        }        public JobRecurrenceScheduleResponse build() {
            return new JobRecurrenceScheduleResponse(hours, minutes, monthDays, monthlyOccurrences, weekDays);
        }
    }
}
