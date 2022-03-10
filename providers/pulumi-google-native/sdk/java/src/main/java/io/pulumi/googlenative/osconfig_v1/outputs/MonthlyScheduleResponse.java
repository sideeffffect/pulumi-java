// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1.outputs.WeekDayOfMonthResponse;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class MonthlyScheduleResponse {
    /**
     * One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month. Months without the target day will be skipped. For example, a schedule to run "every month on the 31st" will not run in February, April, June, etc.
     * 
     */
    private final Integer monthDay;
    /**
     * Week day in a month.
     * 
     */
    private final WeekDayOfMonthResponse weekDayOfMonth;

    @OutputCustomType.Constructor
    private MonthlyScheduleResponse(
        @OutputCustomType.Parameter("monthDay") Integer monthDay,
        @OutputCustomType.Parameter("weekDayOfMonth") WeekDayOfMonthResponse weekDayOfMonth) {
        this.monthDay = monthDay;
        this.weekDayOfMonth = weekDayOfMonth;
    }

    /**
     * One day of the month. 1-31 indicates the 1st to the 31st day. -1 indicates the last day of the month. Months without the target day will be skipped. For example, a schedule to run "every month on the 31st" will not run in February, April, June, etc.
     * 
    */
    public Integer getMonthDay() {
        return this.monthDay;
    }
    /**
     * Week day in a month.
     * 
    */
    public WeekDayOfMonthResponse getWeekDayOfMonth() {
        return this.weekDayOfMonth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonthlyScheduleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer monthDay;
        private WeekDayOfMonthResponse weekDayOfMonth;

        public Builder() {
    	      // Empty
        }

        public Builder(MonthlyScheduleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monthDay = defaults.monthDay;
    	      this.weekDayOfMonth = defaults.weekDayOfMonth;
        }

        public Builder monthDay(Integer monthDay) {
            this.monthDay = Objects.requireNonNull(monthDay);
            return this;
        }

        public Builder weekDayOfMonth(WeekDayOfMonthResponse weekDayOfMonth) {
            this.weekDayOfMonth = Objects.requireNonNull(weekDayOfMonth);
            return this;
        }
        public MonthlyScheduleResponse build() {
            return new MonthlyScheduleResponse(monthDay, weekDayOfMonth);
        }
    }
}
