// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BanditPolicyResponse {
    /**
     * Number of intervals by which to delay the first evaluation.
     * 
     */
    private final @Nullable Integer delayEvaluation;
    /**
     * Interval (number of runs) between policy evaluations.
     * 
     */
    private final @Nullable Integer evaluationInterval;
    /**
     * Expected value is 'Bandit'.
     * 
     */
    private final String policyType;
    /**
     * Absolute distance allowed from the best performing run.
     * 
     */
    private final @Nullable Double slackAmount;
    /**
     * Ratio of the allowed distance from the best performing run.
     * 
     */
    private final @Nullable Double slackFactor;

    @OutputCustomType.Constructor
    private BanditPolicyResponse(
        @OutputCustomType.Parameter("delayEvaluation") @Nullable Integer delayEvaluation,
        @OutputCustomType.Parameter("evaluationInterval") @Nullable Integer evaluationInterval,
        @OutputCustomType.Parameter("policyType") String policyType,
        @OutputCustomType.Parameter("slackAmount") @Nullable Double slackAmount,
        @OutputCustomType.Parameter("slackFactor") @Nullable Double slackFactor) {
        this.delayEvaluation = delayEvaluation;
        this.evaluationInterval = evaluationInterval;
        this.policyType = policyType;
        this.slackAmount = slackAmount;
        this.slackFactor = slackFactor;
    }

    /**
     * Number of intervals by which to delay the first evaluation.
     * 
    */
    public Optional<Integer> getDelayEvaluation() {
        return Optional.ofNullable(this.delayEvaluation);
    }
    /**
     * Interval (number of runs) between policy evaluations.
     * 
    */
    public Optional<Integer> getEvaluationInterval() {
        return Optional.ofNullable(this.evaluationInterval);
    }
    /**
     * Expected value is 'Bandit'.
     * 
    */
    public String getPolicyType() {
        return this.policyType;
    }
    /**
     * Absolute distance allowed from the best performing run.
     * 
    */
    public Optional<Double> getSlackAmount() {
        return Optional.ofNullable(this.slackAmount);
    }
    /**
     * Ratio of the allowed distance from the best performing run.
     * 
    */
    public Optional<Double> getSlackFactor() {
        return Optional.ofNullable(this.slackFactor);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BanditPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer delayEvaluation;
        private @Nullable Integer evaluationInterval;
        private String policyType;
        private @Nullable Double slackAmount;
        private @Nullable Double slackFactor;

        public Builder() {
    	      // Empty
        }

        public Builder(BanditPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayEvaluation = defaults.delayEvaluation;
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.policyType = defaults.policyType;
    	      this.slackAmount = defaults.slackAmount;
    	      this.slackFactor = defaults.slackFactor;
        }

        public Builder delayEvaluation(@Nullable Integer delayEvaluation) {
            this.delayEvaluation = delayEvaluation;
            return this;
        }

        public Builder evaluationInterval(@Nullable Integer evaluationInterval) {
            this.evaluationInterval = evaluationInterval;
            return this;
        }

        public Builder policyType(String policyType) {
            this.policyType = Objects.requireNonNull(policyType);
            return this;
        }

        public Builder slackAmount(@Nullable Double slackAmount) {
            this.slackAmount = slackAmount;
            return this;
        }

        public Builder slackFactor(@Nullable Double slackFactor) {
            this.slackFactor = slackFactor;
            return this;
        }
        public BanditPolicyResponse build() {
            return new BanditPolicyResponse(delayEvaluation, evaluationInterval, policyType, slackAmount, slackFactor);
        }
    }
}
