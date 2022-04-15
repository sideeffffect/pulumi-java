// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling.outputs;

import io.pulumi.aws.appautoscaling.outputs.PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification;
import io.pulumi.aws.appautoscaling.outputs.PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyTargetTrackingScalingPolicyConfiguration {
    /**
     * A custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
     * 
     */
    private final @Nullable PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification customizedMetricSpecification;
    /**
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is `false`.
     * 
     */
    private final @Nullable Boolean disableScaleIn;
    /**
     * A predefined metric. See supported fields below.
     * 
     */
    private final @Nullable PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification predefinedMetricSpecification;
    /**
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * 
     */
    private final @Nullable Integer scaleInCooldown;
    /**
     * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
     * 
     */
    private final @Nullable Integer scaleOutCooldown;
    /**
     * The target value for the metric.
     * 
     */
    private final Double targetValue;

    @CustomType.Constructor
    private PolicyTargetTrackingScalingPolicyConfiguration(
        @CustomType.Parameter("customizedMetricSpecification") @Nullable PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification customizedMetricSpecification,
        @CustomType.Parameter("disableScaleIn") @Nullable Boolean disableScaleIn,
        @CustomType.Parameter("predefinedMetricSpecification") @Nullable PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification predefinedMetricSpecification,
        @CustomType.Parameter("scaleInCooldown") @Nullable Integer scaleInCooldown,
        @CustomType.Parameter("scaleOutCooldown") @Nullable Integer scaleOutCooldown,
        @CustomType.Parameter("targetValue") Double targetValue) {
        this.customizedMetricSpecification = customizedMetricSpecification;
        this.disableScaleIn = disableScaleIn;
        this.predefinedMetricSpecification = predefinedMetricSpecification;
        this.scaleInCooldown = scaleInCooldown;
        this.scaleOutCooldown = scaleOutCooldown;
        this.targetValue = targetValue;
    }

    /**
     * A custom CloudWatch metric. Documentation can be found  at: [AWS Customized Metric Specification](https://docs.aws.amazon.com/autoscaling/ec2/APIReference/API_CustomizedMetricSpecification.html). See supported fields below.
     * 
    */
    public Optional<PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification> customizedMetricSpecification() {
        return Optional.ofNullable(this.customizedMetricSpecification);
    }
    /**
     * Indicates whether scale in by the target tracking policy is disabled. If the value is true, scale in is disabled and the target tracking policy won't remove capacity from the scalable resource. Otherwise, scale in is enabled and the target tracking policy can remove capacity from the scalable resource. The default value is `false`.
     * 
    */
    public Optional<Boolean> disableScaleIn() {
        return Optional.ofNullable(this.disableScaleIn);
    }
    /**
     * A predefined metric. See supported fields below.
     * 
    */
    public Optional<PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification> predefinedMetricSpecification() {
        return Optional.ofNullable(this.predefinedMetricSpecification);
    }
    /**
     * The amount of time, in seconds, after a scale in activity completes before another scale in activity can start.
     * 
    */
    public Optional<Integer> scaleInCooldown() {
        return Optional.ofNullable(this.scaleInCooldown);
    }
    /**
     * The amount of time, in seconds, after a scale out activity completes before another scale out activity can start.
     * 
    */
    public Optional<Integer> scaleOutCooldown() {
        return Optional.ofNullable(this.scaleOutCooldown);
    }
    /**
     * The target value for the metric.
     * 
    */
    public Double targetValue() {
        return this.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyTargetTrackingScalingPolicyConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification customizedMetricSpecification;
        private @Nullable Boolean disableScaleIn;
        private @Nullable PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification predefinedMetricSpecification;
        private @Nullable Integer scaleInCooldown;
        private @Nullable Integer scaleOutCooldown;
        private Double targetValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyTargetTrackingScalingPolicyConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customizedMetricSpecification = defaults.customizedMetricSpecification;
    	      this.disableScaleIn = defaults.disableScaleIn;
    	      this.predefinedMetricSpecification = defaults.predefinedMetricSpecification;
    	      this.scaleInCooldown = defaults.scaleInCooldown;
    	      this.scaleOutCooldown = defaults.scaleOutCooldown;
    	      this.targetValue = defaults.targetValue;
        }

        public Builder customizedMetricSpecification(@Nullable PolicyTargetTrackingScalingPolicyConfigurationCustomizedMetricSpecification customizedMetricSpecification) {
            this.customizedMetricSpecification = customizedMetricSpecification;
            return this;
        }
        public Builder disableScaleIn(@Nullable Boolean disableScaleIn) {
            this.disableScaleIn = disableScaleIn;
            return this;
        }
        public Builder predefinedMetricSpecification(@Nullable PolicyTargetTrackingScalingPolicyConfigurationPredefinedMetricSpecification predefinedMetricSpecification) {
            this.predefinedMetricSpecification = predefinedMetricSpecification;
            return this;
        }
        public Builder scaleInCooldown(@Nullable Integer scaleInCooldown) {
            this.scaleInCooldown = scaleInCooldown;
            return this;
        }
        public Builder scaleOutCooldown(@Nullable Integer scaleOutCooldown) {
            this.scaleOutCooldown = scaleOutCooldown;
            return this;
        }
        public Builder targetValue(Double targetValue) {
            this.targetValue = Objects.requireNonNull(targetValue);
            return this;
        }        public PolicyTargetTrackingScalingPolicyConfiguration build() {
            return new PolicyTargetTrackingScalingPolicyConfiguration(customizedMetricSpecification, disableScaleIn, predefinedMetricSpecification, scaleInCooldown, scaleOutCooldown, targetValue);
        }
    }
}
