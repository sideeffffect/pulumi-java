// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scheduler.inputs;

import com.pulumi.azurenative.scheduler.inputs.JobRecurrenceScheduleResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobRecurrenceResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobRecurrenceResponse Empty = new JobRecurrenceResponse();

    /**
     * Gets or sets the maximum number of times that the job should run.
     * 
     */
    @Import(name="count")
      private final @Nullable Integer count;

    public Optional<Integer> count() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * Gets or sets the time at which the job will complete.
     * 
     */
    @Import(name="endTime")
      private final @Nullable String endTime;

    public Optional<String> endTime() {
        return this.endTime == null ? Optional.empty() : Optional.ofNullable(this.endTime);
    }

    /**
     * Gets or sets the frequency of recurrence (second, minute, hour, day, week, month).
     * 
     */
    @Import(name="frequency")
      private final @Nullable String frequency;

    public Optional<String> frequency() {
        return this.frequency == null ? Optional.empty() : Optional.ofNullable(this.frequency);
    }

    /**
     * Gets or sets the interval between retries.
     * 
     */
    @Import(name="interval")
      private final @Nullable Integer interval;

    public Optional<Integer> interval() {
        return this.interval == null ? Optional.empty() : Optional.ofNullable(this.interval);
    }

    @Import(name="schedule")
      private final @Nullable JobRecurrenceScheduleResponse schedule;

    public Optional<JobRecurrenceScheduleResponse> schedule() {
        return this.schedule == null ? Optional.empty() : Optional.ofNullable(this.schedule);
    }

    public JobRecurrenceResponse(
        @Nullable Integer count,
        @Nullable String endTime,
        @Nullable String frequency,
        @Nullable Integer interval,
        @Nullable JobRecurrenceScheduleResponse schedule) {
        this.count = count;
        this.endTime = endTime;
        this.frequency = frequency;
        this.interval = interval;
        this.schedule = schedule;
    }

    private JobRecurrenceResponse() {
        this.count = null;
        this.endTime = null;
        this.frequency = null;
        this.interval = null;
        this.schedule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer count;
        private @Nullable String endTime;
        private @Nullable String frequency;
        private @Nullable Integer interval;
        private @Nullable JobRecurrenceScheduleResponse schedule;

        public Builder() {
    	      // Empty
        }

        public Builder(JobRecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.endTime = defaults.endTime;
    	      this.frequency = defaults.frequency;
    	      this.interval = defaults.interval;
    	      this.schedule = defaults.schedule;
        }

        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        public Builder frequency(@Nullable String frequency) {
            this.frequency = frequency;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }
        public Builder schedule(@Nullable JobRecurrenceScheduleResponse schedule) {
            this.schedule = schedule;
            return this;
        }        public JobRecurrenceResponse build() {
            return new JobRecurrenceResponse(count, endTime, frequency, interval, schedule);
        }
    }
}
