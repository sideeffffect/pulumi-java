// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EC2FleetTotalLocalStorageGBRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final EC2FleetTotalLocalStorageGBRequestArgs Empty = new EC2FleetTotalLocalStorageGBRequestArgs();

    @InputImport(name="max")
      private final @Nullable Input<Double> max;

    public Input<Double> getMax() {
        return this.max == null ? Input.empty() : this.max;
    }

    @InputImport(name="min")
      private final @Nullable Input<Double> min;

    public Input<Double> getMin() {
        return this.min == null ? Input.empty() : this.min;
    }

    public EC2FleetTotalLocalStorageGBRequestArgs(
        @Nullable Input<Double> max,
        @Nullable Input<Double> min) {
        this.max = max;
        this.min = min;
    }

    private EC2FleetTotalLocalStorageGBRequestArgs() {
        this.max = Input.empty();
        this.min = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetTotalLocalStorageGBRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> max;
        private @Nullable Input<Double> min;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetTotalLocalStorageGBRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Input<Double> max) {
            this.max = max;
            return this;
        }

        public Builder max(@Nullable Double max) {
            this.max = Input.ofNullable(max);
            return this;
        }

        public Builder min(@Nullable Input<Double> min) {
            this.min = min;
            return this;
        }

        public Builder min(@Nullable Double min) {
            this.min = Input.ofNullable(min);
            return this;
        }
        public EC2FleetTotalLocalStorageGBRequestArgs build() {
            return new EC2FleetTotalLocalStorageGBRequestArgs(max, min);
        }
    }
}
