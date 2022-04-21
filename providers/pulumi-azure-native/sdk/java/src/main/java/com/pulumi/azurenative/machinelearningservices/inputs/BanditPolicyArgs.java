// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines an early termination policy based on slack criteria, and a frequency and delay interval for evaluation.
 * 
 */
public final class BanditPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final BanditPolicyArgs Empty = new BanditPolicyArgs();

    /**
     * Number of intervals by which to delay the first evaluation.
     * 
     */
    @Import(name="delayEvaluation")
    private @Nullable Output<Integer> delayEvaluation;

    public Optional<Output<Integer>> delayEvaluation() {
        return Optional.ofNullable(this.delayEvaluation);
    }

    /**
     * Interval (number of runs) between policy evaluations.
     * 
     */
    @Import(name="evaluationInterval")
    private @Nullable Output<Integer> evaluationInterval;

    public Optional<Output<Integer>> evaluationInterval() {
        return Optional.ofNullable(this.evaluationInterval);
    }

    /**
     * Expected value is &#39;Bandit&#39;.
     * 
     */
    @Import(name="policyType", required=true)
    private Output<String> policyType;

    public Output<String> policyType() {
        return this.policyType;
    }

    /**
     * Absolute distance allowed from the best performing run.
     * 
     */
    @Import(name="slackAmount")
    private @Nullable Output<Double> slackAmount;

    public Optional<Output<Double>> slackAmount() {
        return Optional.ofNullable(this.slackAmount);
    }

    /**
     * Ratio of the allowed distance from the best performing run.
     * 
     */
    @Import(name="slackFactor")
    private @Nullable Output<Double> slackFactor;

    public Optional<Output<Double>> slackFactor() {
        return Optional.ofNullable(this.slackFactor);
    }

    private BanditPolicyArgs() {}

    private BanditPolicyArgs(BanditPolicyArgs $) {
        this.delayEvaluation = $.delayEvaluation;
        this.evaluationInterval = $.evaluationInterval;
        this.policyType = $.policyType;
        this.slackAmount = $.slackAmount;
        this.slackFactor = $.slackFactor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BanditPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BanditPolicyArgs $;

        public Builder() {
            $ = new BanditPolicyArgs();
        }

        public Builder(BanditPolicyArgs defaults) {
            $ = new BanditPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder delayEvaluation(@Nullable Output<Integer> delayEvaluation) {
            $.delayEvaluation = delayEvaluation;
            return this;
        }

        public Builder delayEvaluation(Integer delayEvaluation) {
            return delayEvaluation(Output.of(delayEvaluation));
        }

        public Builder evaluationInterval(@Nullable Output<Integer> evaluationInterval) {
            $.evaluationInterval = evaluationInterval;
            return this;
        }

        public Builder evaluationInterval(Integer evaluationInterval) {
            return evaluationInterval(Output.of(evaluationInterval));
        }

        public Builder policyType(Output<String> policyType) {
            $.policyType = policyType;
            return this;
        }

        public Builder policyType(String policyType) {
            return policyType(Output.of(policyType));
        }

        public Builder slackAmount(@Nullable Output<Double> slackAmount) {
            $.slackAmount = slackAmount;
            return this;
        }

        public Builder slackAmount(Double slackAmount) {
            return slackAmount(Output.of(slackAmount));
        }

        public Builder slackFactor(@Nullable Output<Double> slackFactor) {
            $.slackFactor = slackFactor;
            return this;
        }

        public Builder slackFactor(Double slackFactor) {
            return slackFactor(Output.of(slackFactor));
        }

        public BanditPolicyArgs build() {
            $.policyType = Codegen.stringProp("policyType").output().arg($.policyType).require();
            return $;
        }
    }

}
