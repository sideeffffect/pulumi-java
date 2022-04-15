// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.outputs;

import io.pulumi.aws.connect.outputs.HoursOfOperationConfigEndTime;
import io.pulumi.aws.connect.outputs.HoursOfOperationConfigStartTime;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HoursOfOperationConfig {
    /**
     * Specifies the day that the hours of operation applies to.
     * 
     */
    private final String day;
    /**
     * A end time block specifies the time that your contact center closes. The `end_time` is documented below.
     * 
     */
    private final HoursOfOperationConfigEndTime endTime;
    /**
     * A start time block specifies the time that your contact center opens. The `start_time` is documented below.
     * 
     */
    private final HoursOfOperationConfigStartTime startTime;

    @CustomType.Constructor
    private HoursOfOperationConfig(
        @CustomType.Parameter("day") String day,
        @CustomType.Parameter("endTime") HoursOfOperationConfigEndTime endTime,
        @CustomType.Parameter("startTime") HoursOfOperationConfigStartTime startTime) {
        this.day = day;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /**
     * Specifies the day that the hours of operation applies to.
     * 
    */
    public String day() {
        return this.day;
    }
    /**
     * A end time block specifies the time that your contact center closes. The `end_time` is documented below.
     * 
    */
    public HoursOfOperationConfigEndTime endTime() {
        return this.endTime;
    }
    /**
     * A start time block specifies the time that your contact center opens. The `start_time` is documented below.
     * 
    */
    public HoursOfOperationConfigStartTime startTime() {
        return this.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String day;
        private HoursOfOperationConfigEndTime endTime;
        private HoursOfOperationConfigStartTime startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder endTime(HoursOfOperationConfigEndTime endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder startTime(HoursOfOperationConfigStartTime startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }        public HoursOfOperationConfig build() {
            return new HoursOfOperationConfig(day, endTime, startTime);
        }
    }
}
