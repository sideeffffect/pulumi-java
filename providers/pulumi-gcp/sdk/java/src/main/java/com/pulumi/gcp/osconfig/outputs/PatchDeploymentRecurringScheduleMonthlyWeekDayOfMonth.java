// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonth {
    /**
     * @return A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    private final String dayOfWeek;
    /**
     * @return Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
     * 
     */
    private final Integer weekOrdinal;

    @CustomType.Constructor
    private PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonth(
        @CustomType.Parameter("dayOfWeek") String dayOfWeek,
        @CustomType.Parameter("weekOrdinal") Integer weekOrdinal) {
        this.dayOfWeek = dayOfWeek;
        this.weekOrdinal = weekOrdinal;
    }

    /**
     * @return A day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    public String dayOfWeek() {
        return this.dayOfWeek;
    }
    /**
     * @return Week number in a month. 1-4 indicates the 1st to 4th week of the month. -1 indicates the last week of the month.
     * 
     */
    public Integer weekOrdinal() {
        return this.weekOrdinal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dayOfWeek;
        private Integer weekOrdinal;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dayOfWeek = defaults.dayOfWeek;
    	      this.weekOrdinal = defaults.weekOrdinal;
        }

        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = Objects.requireNonNull(dayOfWeek);
            return this;
        }
        public Builder weekOrdinal(Integer weekOrdinal) {
            this.weekOrdinal = Objects.requireNonNull(weekOrdinal);
            return this;
        }        public PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonth build() {
            return new PatchDeploymentRecurringScheduleMonthlyWeekDayOfMonth(dayOfWeek, weekOrdinal);
        }
    }
}
