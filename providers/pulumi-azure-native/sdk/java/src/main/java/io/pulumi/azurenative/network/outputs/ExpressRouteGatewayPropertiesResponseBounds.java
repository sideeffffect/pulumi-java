// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExpressRouteGatewayPropertiesResponseBounds {
    /**
     * Maximum number of scale units deployed for ExpressRoute gateway.
     * 
     */
    private final @Nullable Integer max;
    /**
     * Minimum number of scale units deployed for ExpressRoute gateway.
     * 
     */
    private final @Nullable Integer min;

    @OutputCustomType.Constructor
    private ExpressRouteGatewayPropertiesResponseBounds(
        @OutputCustomType.Parameter("max") @Nullable Integer max,
        @OutputCustomType.Parameter("min") @Nullable Integer min) {
        this.max = max;
        this.min = min;
    }

    /**
     * Maximum number of scale units deployed for ExpressRoute gateway.
     * 
    */
    public Optional<Integer> getMax() {
        return Optional.ofNullable(this.max);
    }
    /**
     * Minimum number of scale units deployed for ExpressRoute gateway.
     * 
    */
    public Optional<Integer> getMin() {
        return Optional.ofNullable(this.min);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteGatewayPropertiesResponseBounds defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer max;
        private @Nullable Integer min;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteGatewayPropertiesResponseBounds defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Integer max) {
            this.max = max;
            return this;
        }

        public Builder min(@Nullable Integer min) {
            this.min = min;
            return this;
        }
        public ExpressRouteGatewayPropertiesResponseBounds build() {
            return new ExpressRouteGatewayPropertiesResponseBounds(max, min);
        }
    }
}
