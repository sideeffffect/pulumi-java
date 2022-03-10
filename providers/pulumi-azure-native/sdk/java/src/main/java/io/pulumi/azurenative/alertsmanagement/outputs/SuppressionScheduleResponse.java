// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SuppressionScheduleResponse {
    /**
     * End date for suppression
     * 
     */
    private final @Nullable String endDate;
    /**
     * End date for suppression
     * 
     */
    private final @Nullable String endTime;
    /**
     * Specifies the values for recurrence pattern
     * 
     */
    private final @Nullable List<Integer> recurrenceValues;
    /**
     * Start date for suppression
     * 
     */
    private final @Nullable String startDate;
    /**
     * Start time for suppression
     * 
     */
    private final @Nullable String startTime;

    @OutputCustomType.Constructor
    private SuppressionScheduleResponse(
        @OutputCustomType.Parameter("endDate") @Nullable String endDate,
        @OutputCustomType.Parameter("endTime") @Nullable String endTime,
        @OutputCustomType.Parameter("recurrenceValues") @Nullable List<Integer> recurrenceValues,
        @OutputCustomType.Parameter("startDate") @Nullable String startDate,
        @OutputCustomType.Parameter("startTime") @Nullable String startTime) {
        this.endDate = endDate;
        this.endTime = endTime;
        this.recurrenceValues = recurrenceValues;
        this.startDate = startDate;
        this.startTime = startTime;
    }

    /**
     * End date for suppression
     * 
    */
    public Optional<String> getEndDate() {
        return Optional.ofNullable(this.endDate);
    }
    /**
     * End date for suppression
     * 
    */
    public Optional<String> getEndTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * Specifies the values for recurrence pattern
     * 
    */
    public List<Integer> getRecurrenceValues() {
        return this.recurrenceValues == null ? List.of() : this.recurrenceValues;
    }
    /**
     * Start date for suppression
     * 
    */
    public Optional<String> getStartDate() {
        return Optional.ofNullable(this.startDate);
    }
    /**
     * Start time for suppression
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuppressionScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endDate;
        private @Nullable String endTime;
        private @Nullable List<Integer> recurrenceValues;
        private @Nullable String startDate;
        private @Nullable String startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SuppressionScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDate = defaults.endDate;
    	      this.endTime = defaults.endTime;
    	      this.recurrenceValues = defaults.recurrenceValues;
    	      this.startDate = defaults.startDate;
    	      this.startTime = defaults.startTime;
        }

        public Builder endDate(@Nullable String endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder recurrenceValues(@Nullable List<Integer> recurrenceValues) {
            this.recurrenceValues = recurrenceValues;
            return this;
        }

        public Builder startDate(@Nullable String startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        public SuppressionScheduleResponse build() {
            return new SuppressionScheduleResponse(endDate, endTime, recurrenceValues, startDate, startTime);
        }
    }
}
