// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ml_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse {
    /**
     * The objective value at this training step.
     * 
     */
    private final Double objectiveValue;
    /**
     * The global training step for this metric.
     * 
     */
    private final String trainingStep;

    @CustomType.Constructor
    private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse(
        @CustomType.Parameter("objectiveValue") Double objectiveValue,
        @CustomType.Parameter("trainingStep") String trainingStep) {
        this.objectiveValue = objectiveValue;
        this.trainingStep = trainingStep;
    }

    /**
     * The objective value at this training step.
     * 
    */
    public Double objectiveValue() {
        return this.objectiveValue;
    }
    /**
     * The global training step for this metric.
     * 
    */
    public String trainingStep() {
        return this.trainingStep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double objectiveValue;
        private String trainingStep;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectiveValue = defaults.objectiveValue;
    	      this.trainingStep = defaults.trainingStep;
        }

        public Builder objectiveValue(Double objectiveValue) {
            this.objectiveValue = Objects.requireNonNull(objectiveValue);
            return this;
        }
        public Builder trainingStep(String trainingStep) {
            this.trainingStep = Objects.requireNonNull(trainingStep);
            return this;
        }        public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse build() {
            return new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricResponse(objectiveValue, trainingStep);
        }
    }
}
