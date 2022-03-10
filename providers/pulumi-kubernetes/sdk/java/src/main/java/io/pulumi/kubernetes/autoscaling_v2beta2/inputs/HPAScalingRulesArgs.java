// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.autoscaling_v2beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.autoscaling_v2beta2.inputs.HPAScalingPolicyArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HPAScalingRules configures the scaling behavior for one direction. These Rules are applied after calculating DesiredReplicas from metrics for the HPA. They can limit the scaling velocity by specifying scaling policies. They can prevent flapping by specifying the stabilization window, so that the number of replicas is not set instantly, instead, the safest value from the stabilization window is chosen.
 * 
 */
public final class HPAScalingRulesArgs extends io.pulumi.resources.ResourceArgs {

    public static final HPAScalingRulesArgs Empty = new HPAScalingRulesArgs();

    /**
     * policies is a list of potential scaling polices which can be used during scaling. At least one policy must be specified, otherwise the HPAScalingRules will be discarded as invalid
     * 
     */
    @InputImport(name="policies")
      private final @Nullable Input<List<HPAScalingPolicyArgs>> policies;

    public Input<List<HPAScalingPolicyArgs>> getPolicies() {
        return this.policies == null ? Input.empty() : this.policies;
    }

    /**
     * selectPolicy is used to specify which policy should be used. If not set, the default value MaxPolicySelect is used.
     * 
     */
    @InputImport(name="selectPolicy")
      private final @Nullable Input<String> selectPolicy;

    public Input<String> getSelectPolicy() {
        return this.selectPolicy == null ? Input.empty() : this.selectPolicy;
    }

    /**
     * StabilizationWindowSeconds is the number of seconds for which past recommendations should be considered while scaling up or scaling down. StabilizationWindowSeconds must be greater than or equal to zero and less than or equal to 3600 (one hour). If not set, use the default values: - For scale up: 0 (i.e. no stabilization is done). - For scale down: 300 (i.e. the stabilization window is 300 seconds long).
     * 
     */
    @InputImport(name="stabilizationWindowSeconds")
      private final @Nullable Input<Integer> stabilizationWindowSeconds;

    public Input<Integer> getStabilizationWindowSeconds() {
        return this.stabilizationWindowSeconds == null ? Input.empty() : this.stabilizationWindowSeconds;
    }

    public HPAScalingRulesArgs(
        @Nullable Input<List<HPAScalingPolicyArgs>> policies,
        @Nullable Input<String> selectPolicy,
        @Nullable Input<Integer> stabilizationWindowSeconds) {
        this.policies = policies;
        this.selectPolicy = selectPolicy;
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    }

    private HPAScalingRulesArgs() {
        this.policies = Input.empty();
        this.selectPolicy = Input.empty();
        this.stabilizationWindowSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HPAScalingRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<HPAScalingPolicyArgs>> policies;
        private @Nullable Input<String> selectPolicy;
        private @Nullable Input<Integer> stabilizationWindowSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(HPAScalingRulesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policies = defaults.policies;
    	      this.selectPolicy = defaults.selectPolicy;
    	      this.stabilizationWindowSeconds = defaults.stabilizationWindowSeconds;
        }

        public Builder policies(@Nullable Input<List<HPAScalingPolicyArgs>> policies) {
            this.policies = policies;
            return this;
        }

        public Builder policies(@Nullable List<HPAScalingPolicyArgs> policies) {
            this.policies = Input.ofNullable(policies);
            return this;
        }

        public Builder selectPolicy(@Nullable Input<String> selectPolicy) {
            this.selectPolicy = selectPolicy;
            return this;
        }

        public Builder selectPolicy(@Nullable String selectPolicy) {
            this.selectPolicy = Input.ofNullable(selectPolicy);
            return this;
        }

        public Builder stabilizationWindowSeconds(@Nullable Input<Integer> stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = stabilizationWindowSeconds;
            return this;
        }

        public Builder stabilizationWindowSeconds(@Nullable Integer stabilizationWindowSeconds) {
            this.stabilizationWindowSeconds = Input.ofNullable(stabilizationWindowSeconds);
            return this;
        }
        public HPAScalingRulesArgs build() {
            return new HPAScalingRulesArgs(policies, selectPolicy, stabilizationWindowSeconds);
        }
    }
}
