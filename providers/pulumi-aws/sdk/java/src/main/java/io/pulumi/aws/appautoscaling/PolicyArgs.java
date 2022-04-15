// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appautoscaling;

import io.pulumi.aws.appautoscaling.inputs.PolicyStepScalingPolicyConfigurationArgs;
import io.pulumi.aws.appautoscaling.inputs.PolicyTargetTrackingScalingPolicyConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * The name of the policy. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The policy type. Valid values are `StepScaling` and `TargetTrackingScaling`. Defaults to `StepScaling`. Certain services only support only one policy type. For more information see the [Target Tracking Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html) and [Step Scaling Policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html) documentation.
     * 
     */
    @Import(name="policyType")
      private final @Nullable Output<String> policyType;

    public Output<String> policyType() {
        return this.policyType == null ? Codegen.empty() : this.policyType;
    }

    /**
     * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="scalableDimension", required=true)
      private final Output<String> scalableDimension;

    public Output<String> scalableDimension() {
        return this.scalableDimension;
    }

    /**
     * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](http://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
     * 
     */
    @Import(name="serviceNamespace", required=true)
      private final Output<String> serviceNamespace;

    public Output<String> serviceNamespace() {
        return this.serviceNamespace;
    }

    /**
     * Step scaling policy configuration, requires `policy_type = "StepScaling"` (default). See supported fields below.
     * 
     */
    @Import(name="stepScalingPolicyConfiguration")
      private final @Nullable Output<PolicyStepScalingPolicyConfigurationArgs> stepScalingPolicyConfiguration;

    public Output<PolicyStepScalingPolicyConfigurationArgs> stepScalingPolicyConfiguration() {
        return this.stepScalingPolicyConfiguration == null ? Codegen.empty() : this.stepScalingPolicyConfiguration;
    }

    /**
     * A target tracking policy, requires `policy_type = "TargetTrackingScaling"`. See supported fields below.
     * 
     */
    @Import(name="targetTrackingScalingPolicyConfiguration")
      private final @Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationArgs> targetTrackingScalingPolicyConfiguration;

    public Output<PolicyTargetTrackingScalingPolicyConfigurationArgs> targetTrackingScalingPolicyConfiguration() {
        return this.targetTrackingScalingPolicyConfiguration == null ? Codegen.empty() : this.targetTrackingScalingPolicyConfiguration;
    }

    public PolicyArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> policyType,
        Output<String> resourceId,
        Output<String> scalableDimension,
        Output<String> serviceNamespace,
        @Nullable Output<PolicyStepScalingPolicyConfigurationArgs> stepScalingPolicyConfiguration,
        @Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationArgs> targetTrackingScalingPolicyConfiguration) {
        this.name = name;
        this.policyType = policyType;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.scalableDimension = Objects.requireNonNull(scalableDimension, "expected parameter 'scalableDimension' to be non-null");
        this.serviceNamespace = Objects.requireNonNull(serviceNamespace, "expected parameter 'serviceNamespace' to be non-null");
        this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
        this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
    }

    private PolicyArgs() {
        this.name = Codegen.empty();
        this.policyType = Codegen.empty();
        this.resourceId = Codegen.empty();
        this.scalableDimension = Codegen.empty();
        this.serviceNamespace = Codegen.empty();
        this.stepScalingPolicyConfiguration = Codegen.empty();
        this.targetTrackingScalingPolicyConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> policyType;
        private Output<String> resourceId;
        private Output<String> scalableDimension;
        private Output<String> serviceNamespace;
        private @Nullable Output<PolicyStepScalingPolicyConfigurationArgs> stepScalingPolicyConfiguration;
        private @Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationArgs> targetTrackingScalingPolicyConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policyType = defaults.policyType;
    	      this.resourceId = defaults.resourceId;
    	      this.scalableDimension = defaults.scalableDimension;
    	      this.serviceNamespace = defaults.serviceNamespace;
    	      this.stepScalingPolicyConfiguration = defaults.stepScalingPolicyConfiguration;
    	      this.targetTrackingScalingPolicyConfiguration = defaults.targetTrackingScalingPolicyConfiguration;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder policyType(@Nullable Output<String> policyType) {
            this.policyType = policyType;
            return this;
        }
        public Builder policyType(@Nullable String policyType) {
            this.policyType = Codegen.ofNullable(policyType);
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public Builder scalableDimension(Output<String> scalableDimension) {
            this.scalableDimension = Objects.requireNonNull(scalableDimension);
            return this;
        }
        public Builder scalableDimension(String scalableDimension) {
            this.scalableDimension = Output.of(Objects.requireNonNull(scalableDimension));
            return this;
        }
        public Builder serviceNamespace(Output<String> serviceNamespace) {
            this.serviceNamespace = Objects.requireNonNull(serviceNamespace);
            return this;
        }
        public Builder serviceNamespace(String serviceNamespace) {
            this.serviceNamespace = Output.of(Objects.requireNonNull(serviceNamespace));
            return this;
        }
        public Builder stepScalingPolicyConfiguration(@Nullable Output<PolicyStepScalingPolicyConfigurationArgs> stepScalingPolicyConfiguration) {
            this.stepScalingPolicyConfiguration = stepScalingPolicyConfiguration;
            return this;
        }
        public Builder stepScalingPolicyConfiguration(@Nullable PolicyStepScalingPolicyConfigurationArgs stepScalingPolicyConfiguration) {
            this.stepScalingPolicyConfiguration = Codegen.ofNullable(stepScalingPolicyConfiguration);
            return this;
        }
        public Builder targetTrackingScalingPolicyConfiguration(@Nullable Output<PolicyTargetTrackingScalingPolicyConfigurationArgs> targetTrackingScalingPolicyConfiguration) {
            this.targetTrackingScalingPolicyConfiguration = targetTrackingScalingPolicyConfiguration;
            return this;
        }
        public Builder targetTrackingScalingPolicyConfiguration(@Nullable PolicyTargetTrackingScalingPolicyConfigurationArgs targetTrackingScalingPolicyConfiguration) {
            this.targetTrackingScalingPolicyConfiguration = Codegen.ofNullable(targetTrackingScalingPolicyConfiguration);
            return this;
        }        public PolicyArgs build() {
            return new PolicyArgs(name, policyType, resourceId, scalableDimension, serviceNamespace, stepScalingPolicyConfiguration, targetTrackingScalingPolicyConfiguration);
        }
    }
}
