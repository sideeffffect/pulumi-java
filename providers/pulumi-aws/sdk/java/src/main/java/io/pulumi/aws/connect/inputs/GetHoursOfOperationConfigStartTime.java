// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class GetHoursOfOperationConfigStartTime extends io.pulumi.resources.InvokeArgs {

    public static final GetHoursOfOperationConfigStartTime Empty = new GetHoursOfOperationConfigStartTime();

    /**
     * Specifies the hour of opening.
     * 
     */
    @Import(name="hours", required=true)
      private final Integer hours;

    public Integer hours() {
        return this.hours;
    }

    /**
     * Specifies the minute of opening.
     * 
     */
    @Import(name="minutes", required=true)
      private final Integer minutes;

    public Integer minutes() {
        return this.minutes;
    }

    public GetHoursOfOperationConfigStartTime(
        Integer hours,
        Integer minutes) {
        this.hours = Objects.requireNonNull(hours, "expected parameter 'hours' to be non-null");
        this.minutes = Objects.requireNonNull(minutes, "expected parameter 'minutes' to be non-null");
    }

    private GetHoursOfOperationConfigStartTime() {
        this.hours = null;
        this.minutes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHoursOfOperationConfigStartTime defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer hours;
        private Integer minutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHoursOfOperationConfigStartTime defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hours = defaults.hours;
    	      this.minutes = defaults.minutes;
        }

        public Builder hours(Integer hours) {
            this.hours = Objects.requireNonNull(hours);
            return this;
        }
        public Builder minutes(Integer minutes) {
            this.minutes = Objects.requireNonNull(minutes);
            return this;
        }        public GetHoursOfOperationConfigStartTime build() {
            return new GetHoursOfOperationConfigStartTime(hours, minutes);
        }
    }
}
