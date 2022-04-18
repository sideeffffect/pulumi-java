// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class KpiThresholdsResponse {
    /**
     * Whether or not the KPI is an increasing KPI.
     * 
     */
    private final Boolean increasingKpi;
    /**
     * The lower threshold limit.
     * 
     */
    private final Double lowerLimit;
    /**
     * The upper threshold limit.
     * 
     */
    private final Double upperLimit;

    @CustomType.Constructor
    private KpiThresholdsResponse(
        @CustomType.Parameter("increasingKpi") Boolean increasingKpi,
        @CustomType.Parameter("lowerLimit") Double lowerLimit,
        @CustomType.Parameter("upperLimit") Double upperLimit) {
        this.increasingKpi = increasingKpi;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    /**
     * Whether or not the KPI is an increasing KPI.
     * 
    */
    public Boolean increasingKpi() {
        return this.increasingKpi;
    }
    /**
     * The lower threshold limit.
     * 
    */
    public Double lowerLimit() {
        return this.lowerLimit;
    }
    /**
     * The upper threshold limit.
     * 
    */
    public Double upperLimit() {
        return this.upperLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiThresholdsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean increasingKpi;
        private Double lowerLimit;
        private Double upperLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiThresholdsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.increasingKpi = defaults.increasingKpi;
    	      this.lowerLimit = defaults.lowerLimit;
    	      this.upperLimit = defaults.upperLimit;
        }

        public Builder increasingKpi(Boolean increasingKpi) {
            this.increasingKpi = Objects.requireNonNull(increasingKpi);
            return this;
        }
        public Builder lowerLimit(Double lowerLimit) {
            this.lowerLimit = Objects.requireNonNull(lowerLimit);
            return this;
        }
        public Builder upperLimit(Double upperLimit) {
            this.upperLimit = Objects.requireNonNull(upperLimit);
            return this;
        }        public KpiThresholdsResponse build() {
            return new KpiThresholdsResponse(increasingKpi, lowerLimit, upperLimit);
        }
    }
}
