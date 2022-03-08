// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScheduleRecurrenceResponse {
    /**
     * The recurrence type.
     * 
     */
    private final String recurrenceType;
    /**
     * The recurrence value.
     * 
     */
    private final Integer recurrenceValue;
    /**
     * The week days list. Applicable only for schedules of recurrence type 'weekly'.
     * 
     */
    private final @Nullable List<String> weeklyDaysList;

    @OutputCustomType.Constructor({"recurrenceType","recurrenceValue","weeklyDaysList"})
    private ScheduleRecurrenceResponse(
        String recurrenceType,
        Integer recurrenceValue,
        @Nullable List<String> weeklyDaysList) {
        this.recurrenceType = recurrenceType;
        this.recurrenceValue = recurrenceValue;
        this.weeklyDaysList = weeklyDaysList;
    }

    /**
     * The recurrence type.
     * 
    */
    public String getRecurrenceType() {
        return this.recurrenceType;
    }
    /**
     * The recurrence value.
     * 
    */
    public Integer getRecurrenceValue() {
        return this.recurrenceValue;
    }
    /**
     * The week days list. Applicable only for schedules of recurrence type 'weekly'.
     * 
    */
    public List<String> getWeeklyDaysList() {
        return this.weeklyDaysList == null ? List.of() : this.weeklyDaysList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleRecurrenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recurrenceType;
        private Integer recurrenceValue;
        private @Nullable List<String> weeklyDaysList;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleRecurrenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recurrenceType = defaults.recurrenceType;
    	      this.recurrenceValue = defaults.recurrenceValue;
    	      this.weeklyDaysList = defaults.weeklyDaysList;
        }

        public Builder setRecurrenceType(String recurrenceType) {
            this.recurrenceType = Objects.requireNonNull(recurrenceType);
            return this;
        }

        public Builder setRecurrenceValue(Integer recurrenceValue) {
            this.recurrenceValue = Objects.requireNonNull(recurrenceValue);
            return this;
        }

        public Builder setWeeklyDaysList(@Nullable List<String> weeklyDaysList) {
            this.weeklyDaysList = weeklyDaysList;
            return this;
        }
        public ScheduleRecurrenceResponse build() {
            return new ScheduleRecurrenceResponse(recurrenceType, recurrenceValue, weeklyDaysList);
        }
    }
}
