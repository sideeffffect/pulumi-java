// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.outputs;

import io.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification;
import io.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification;
import io.pulumi.aws.autoscaling.outputs.PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyPredictiveScalingConfigurationMetricSpecification {
    /**
     * The load metric specification.
     * 
     */
    private final @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
    /**
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
     * 
     */
    private final @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification;
    /**
     * The scaling metric specification.
     * 
     */
    private final @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification;
    /**
     * The target value for the metric.
     * 
     */
    private final Integer targetValue;

    @CustomType.Constructor
    private PolicyPredictiveScalingConfigurationMetricSpecification(
        @CustomType.Parameter("predefinedLoadMetricSpecification") @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification,
        @CustomType.Parameter("predefinedMetricPairSpecification") @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification,
        @CustomType.Parameter("predefinedScalingMetricSpecification") @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification,
        @CustomType.Parameter("targetValue") Integer targetValue) {
        this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
        this.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
        this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
        this.targetValue = targetValue;
    }

    /**
     * The load metric specification.
     * 
    */
    public Optional<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification> predefinedLoadMetricSpecification() {
        return Optional.ofNullable(this.predefinedLoadMetricSpecification);
    }
    /**
     * The metric pair specification from which Amazon EC2 Auto Scaling determines the appropriate scaling metric and load metric to use.
     * 
    */
    public Optional<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification> predefinedMetricPairSpecification() {
        return Optional.ofNullable(this.predefinedMetricPairSpecification);
    }
    /**
     * The scaling metric specification.
     * 
    */
    public Optional<PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification> predefinedScalingMetricSpecification() {
        return Optional.ofNullable(this.predefinedScalingMetricSpecification);
    }
    /**
     * The target value for the metric.
     * 
    */
    public Integer targetValue() {
        return this.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPredictiveScalingConfigurationMetricSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification;
        private @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification;
        private @Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification;
        private Integer targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyPredictiveScalingConfigurationMetricSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.predefinedLoadMetricSpecification = defaults.predefinedLoadMetricSpecification;
    	      this.predefinedMetricPairSpecification = defaults.predefinedMetricPairSpecification;
    	      this.predefinedScalingMetricSpecification = defaults.predefinedScalingMetricSpecification;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder predefinedLoadMetricSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedLoadMetricSpecification predefinedLoadMetricSpecification) {
            this.predefinedLoadMetricSpecification = predefinedLoadMetricSpecification;
            return this;
        }
        public Builder predefinedMetricPairSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedMetricPairSpecification predefinedMetricPairSpecification) {
            this.predefinedMetricPairSpecification = predefinedMetricPairSpecification;
            return this;
        }
        public Builder predefinedScalingMetricSpecification(@Nullable PolicyPredictiveScalingConfigurationMetricSpecificationPredefinedScalingMetricSpecification predefinedScalingMetricSpecification) {
            this.predefinedScalingMetricSpecification = predefinedScalingMetricSpecification;
            return this;
        }
        public Builder targetValue(Integer targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }        public PolicyPredictiveScalingConfigurationMetricSpecification build() {
            return new PolicyPredictiveScalingConfigurationMetricSpecification(predefinedLoadMetricSpecification, predefinedMetricPairSpecification, predefinedScalingMetricSpecification, targetValue);
        }
    }
}
