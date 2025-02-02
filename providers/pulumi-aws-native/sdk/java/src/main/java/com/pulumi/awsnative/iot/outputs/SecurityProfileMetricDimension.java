// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.enums.SecurityProfileMetricDimensionOperator;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityProfileMetricDimension {
    /**
     * @return A unique identifier for the dimension.
     * 
     */
    private final String dimensionName;
    /**
     * @return Defines how the dimensionValues of a dimension are interpreted.
     * 
     */
    private final @Nullable SecurityProfileMetricDimensionOperator operator;

    @CustomType.Constructor
    private SecurityProfileMetricDimension(
        @CustomType.Parameter("dimensionName") String dimensionName,
        @CustomType.Parameter("operator") @Nullable SecurityProfileMetricDimensionOperator operator) {
        this.dimensionName = dimensionName;
        this.operator = operator;
    }

    /**
     * @return A unique identifier for the dimension.
     * 
     */
    public String dimensionName() {
        return this.dimensionName;
    }
    /**
     * @return Defines how the dimensionValues of a dimension are interpreted.
     * 
     */
    public Optional<SecurityProfileMetricDimensionOperator> operator() {
        return Optional.ofNullable(this.operator);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMetricDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dimensionName;
        private @Nullable SecurityProfileMetricDimensionOperator operator;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMetricDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensionName = defaults.dimensionName;
    	      this.operator = defaults.operator;
        }

        public Builder dimensionName(String dimensionName) {
            this.dimensionName = Objects.requireNonNull(dimensionName);
            return this;
        }
        public Builder operator(@Nullable SecurityProfileMetricDimensionOperator operator) {
            this.operator = operator;
            return this;
        }        public SecurityProfileMetricDimension build() {
            return new SecurityProfileMetricDimension(dimensionName, operator);
        }
    }
}
