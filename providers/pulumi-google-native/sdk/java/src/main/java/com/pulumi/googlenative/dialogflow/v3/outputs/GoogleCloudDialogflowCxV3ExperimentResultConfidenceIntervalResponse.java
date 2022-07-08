// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse {
    /**
     * @return The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval.
     * 
     */
    private final Double confidenceLevel;
    /**
     * @return Lower bound of the interval.
     * 
     */
    private final Double lowerBound;
    /**
     * @return The percent change between an experiment metric&#39;s value and the value for its control.
     * 
     */
    private final Double ratio;
    /**
     * @return Upper bound of the interval.
     * 
     */
    private final Double upperBound;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse(
        @CustomType.Parameter("confidenceLevel") Double confidenceLevel,
        @CustomType.Parameter("lowerBound") Double lowerBound,
        @CustomType.Parameter("ratio") Double ratio,
        @CustomType.Parameter("upperBound") Double upperBound) {
        this.confidenceLevel = confidenceLevel;
        this.lowerBound = lowerBound;
        this.ratio = ratio;
        this.upperBound = upperBound;
    }

    /**
     * @return The confidence level used to construct the interval, i.e. there is X% chance that the true value is within this interval.
     * 
     */
    public Double confidenceLevel() {
        return this.confidenceLevel;
    }
    /**
     * @return Lower bound of the interval.
     * 
     */
    public Double lowerBound() {
        return this.lowerBound;
    }
    /**
     * @return The percent change between an experiment metric&#39;s value and the value for its control.
     * 
     */
    public Double ratio() {
        return this.ratio;
    }
    /**
     * @return Upper bound of the interval.
     * 
     */
    public Double upperBound() {
        return this.upperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double confidenceLevel;
        private Double lowerBound;
        private Double ratio;
        private Double upperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceLevel = defaults.confidenceLevel;
    	      this.lowerBound = defaults.lowerBound;
    	      this.ratio = defaults.ratio;
    	      this.upperBound = defaults.upperBound;
        }

        public Builder confidenceLevel(Double confidenceLevel) {
            this.confidenceLevel = Objects.requireNonNull(confidenceLevel);
            return this;
        }
        public Builder lowerBound(Double lowerBound) {
            this.lowerBound = Objects.requireNonNull(lowerBound);
            return this;
        }
        public Builder ratio(Double ratio) {
            this.ratio = Objects.requireNonNull(ratio);
            return this;
        }
        public Builder upperBound(Double upperBound) {
            this.upperBound = Objects.requireNonNull(upperBound);
            return this;
        }        public GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse build() {
            return new GoogleCloudDialogflowCxV3ExperimentResultConfidenceIntervalResponse(confidenceLevel, lowerBound, ratio, upperBound);
        }
    }
}
