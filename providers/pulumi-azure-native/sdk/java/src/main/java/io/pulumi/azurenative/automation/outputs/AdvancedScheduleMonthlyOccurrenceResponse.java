// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AdvancedScheduleMonthlyOccurrenceResponse {
    /**
     * Day of the occurrence. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
     */
    private final @Nullable String day;
    /**
     * Occurrence of the week within the month. Must be between 1 and 5
     * 
     */
    private final @Nullable Integer occurrence;

    @OutputCustomType.Constructor
    private AdvancedScheduleMonthlyOccurrenceResponse(
        @OutputCustomType.Parameter("day") @Nullable String day,
        @OutputCustomType.Parameter("occurrence") @Nullable Integer occurrence) {
        this.day = day;
        this.occurrence = occurrence;
    }

    /**
     * Day of the occurrence. Must be one of monday, tuesday, wednesday, thursday, friday, saturday, sunday.
     * 
    */
    public Optional<String> getDay() {
        return Optional.ofNullable(this.day);
    }
    /**
     * Occurrence of the week within the month. Must be between 1 and 5
     * 
    */
    public Optional<Integer> getOccurrence() {
        return Optional.ofNullable(this.occurrence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdvancedScheduleMonthlyOccurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String day;
        private @Nullable Integer occurrence;

        public Builder() {
    	      // Empty
        }

        public Builder(AdvancedScheduleMonthlyOccurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.occurrence = defaults.occurrence;
        }

        public Builder day(@Nullable String day) {
            this.day = day;
            return this;
        }

        public Builder occurrence(@Nullable Integer occurrence) {
            this.occurrence = occurrence;
            return this;
        }
        public AdvancedScheduleMonthlyOccurrenceResponse build() {
            return new AdvancedScheduleMonthlyOccurrenceResponse(day, occurrence);
        }
    }
}
