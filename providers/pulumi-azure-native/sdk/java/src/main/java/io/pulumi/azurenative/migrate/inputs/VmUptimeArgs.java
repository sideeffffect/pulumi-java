// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VmUptimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmUptimeArgs Empty = new VmUptimeArgs();

    /**
     * Number of days in a month for VM uptime.
     * 
     */
    @InputImport(name="daysPerMonth")
      private final @Nullable Input<Double> daysPerMonth;

    public Input<Double> getDaysPerMonth() {
        return this.daysPerMonth == null ? Input.empty() : this.daysPerMonth;
    }

    /**
     * Number of hours per day for VM uptime.
     * 
     */
    @InputImport(name="hoursPerDay")
      private final @Nullable Input<Double> hoursPerDay;

    public Input<Double> getHoursPerDay() {
        return this.hoursPerDay == null ? Input.empty() : this.hoursPerDay;
    }

    public VmUptimeArgs(
        @Nullable Input<Double> daysPerMonth,
        @Nullable Input<Double> hoursPerDay) {
        this.daysPerMonth = daysPerMonth;
        this.hoursPerDay = hoursPerDay;
    }

    private VmUptimeArgs() {
        this.daysPerMonth = Input.empty();
        this.hoursPerDay = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUptimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> daysPerMonth;
        private @Nullable Input<Double> hoursPerDay;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUptimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.daysPerMonth = defaults.daysPerMonth;
    	      this.hoursPerDay = defaults.hoursPerDay;
        }

        public Builder daysPerMonth(@Nullable Input<Double> daysPerMonth) {
            this.daysPerMonth = daysPerMonth;
            return this;
        }

        public Builder daysPerMonth(@Nullable Double daysPerMonth) {
            this.daysPerMonth = Input.ofNullable(daysPerMonth);
            return this;
        }

        public Builder hoursPerDay(@Nullable Input<Double> hoursPerDay) {
            this.hoursPerDay = hoursPerDay;
            return this;
        }

        public Builder hoursPerDay(@Nullable Double hoursPerDay) {
            this.hoursPerDay = Input.ofNullable(hoursPerDay);
            return this;
        }
        public VmUptimeArgs build() {
            return new VmUptimeArgs(daysPerMonth, hoursPerDay);
        }
    }
}
