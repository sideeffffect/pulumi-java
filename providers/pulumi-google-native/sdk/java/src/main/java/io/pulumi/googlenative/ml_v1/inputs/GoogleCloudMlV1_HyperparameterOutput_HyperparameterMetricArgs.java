// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An observed value of a metric.
 * 
 */
public final class GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs Empty = new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs();

    /**
     * The objective value at this training step.
     * 
     */
    @InputImport(name="objectiveValue")
      private final @Nullable Input<Double> objectiveValue;

    public Input<Double> getObjectiveValue() {
        return this.objectiveValue == null ? Input.empty() : this.objectiveValue;
    }

    /**
     * The global training step for this metric.
     * 
     */
    @InputImport(name="trainingStep")
      private final @Nullable Input<String> trainingStep;

    public Input<String> getTrainingStep() {
        return this.trainingStep == null ? Input.empty() : this.trainingStep;
    }

    public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs(
        @Nullable Input<Double> objectiveValue,
        @Nullable Input<String> trainingStep) {
        this.objectiveValue = objectiveValue;
        this.trainingStep = trainingStep;
    }

    private GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs() {
        this.objectiveValue = Input.empty();
        this.trainingStep = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> objectiveValue;
        private @Nullable Input<String> trainingStep;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectiveValue = defaults.objectiveValue;
    	      this.trainingStep = defaults.trainingStep;
        }

        public Builder objectiveValue(@Nullable Input<Double> objectiveValue) {
            this.objectiveValue = objectiveValue;
            return this;
        }

        public Builder objectiveValue(@Nullable Double objectiveValue) {
            this.objectiveValue = Input.ofNullable(objectiveValue);
            return this;
        }

        public Builder trainingStep(@Nullable Input<String> trainingStep) {
            this.trainingStep = trainingStep;
            return this;
        }

        public Builder trainingStep(@Nullable String trainingStep) {
            this.trainingStep = Input.ofNullable(trainingStep);
            return this;
        }
        public GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs build() {
            return new GoogleCloudMlV1_HyperparameterOutput_HyperparameterMetricArgs(objectiveValue, trainingStep);
        }
    }
}
