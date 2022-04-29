// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A gating rule verifies that a set of gating controls evaluates as true, based on a rule configuration that you specify. If the gating rule evaluates to true, Amazon Route 53 Application Recovery Controller allows a set of routing control state changes to run and complete against the set of target controls.
 * 
 */
public final class SafetyRuleGatingRuleArgs extends ResourceArgs {

    public static final SafetyRuleGatingRuleArgs Empty = new SafetyRuleGatingRuleArgs();

    /**
     * The gating controls for the gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    @Import(name="gatingControls", required=true)
    private Output<List<String>> gatingControls;

    /**
     * @return The gating controls for the gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    public Output<List<String>> gatingControls() {
        return this.gatingControls;
    }

    /**
     * Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified GatingControls. For example, say you have three gating controls, one for each of three AWS Regions. Now you specify AtLeast 2 as your RuleConfig. With these settings, you can only change (set or unset) the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by the rule that you set for the routing controls in GatingControls.
     * 
     */
    @Import(name="targetControls", required=true)
    private Output<List<String>> targetControls;

    /**
     * @return Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified GatingControls. For example, say you have three gating controls, one for each of three AWS Regions. Now you specify AtLeast 2 as your RuleConfig. With these settings, you can only change (set or unset) the routing controls that you have specified as TargetControls if that rule evaluates to true.
     * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by the rule that you set for the routing controls in GatingControls.
     * 
     */
    public Output<List<String>> targetControls() {
        return this.targetControls;
    }

    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent &#34;flapping&#34; of state. The wait period is 5000 ms by default, but you can choose a custom value.
     * 
     */
    @Import(name="waitPeriodMs", required=true)
    private Output<Integer> waitPeriodMs;

    /**
     * @return An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent &#34;flapping&#34; of state. The wait period is 5000 ms by default, but you can choose a custom value.
     * 
     */
    public Output<Integer> waitPeriodMs() {
        return this.waitPeriodMs;
    }

    private SafetyRuleGatingRuleArgs() {}

    private SafetyRuleGatingRuleArgs(SafetyRuleGatingRuleArgs $) {
        this.gatingControls = $.gatingControls;
        this.targetControls = $.targetControls;
        this.waitPeriodMs = $.waitPeriodMs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SafetyRuleGatingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SafetyRuleGatingRuleArgs $;

        public Builder() {
            $ = new SafetyRuleGatingRuleArgs();
        }

        public Builder(SafetyRuleGatingRuleArgs defaults) {
            $ = new SafetyRuleGatingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gatingControls The gating controls for the gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
         * 
         * @return builder
         * 
         */
        public Builder gatingControls(Output<List<String>> gatingControls) {
            $.gatingControls = gatingControls;
            return this;
        }

        /**
         * @param gatingControls The gating controls for the gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
         * 
         * @return builder
         * 
         */
        public Builder gatingControls(List<String> gatingControls) {
            return gatingControls(Output.of(gatingControls));
        }

        /**
         * @param gatingControls The gating controls for the gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
         * 
         * @return builder
         * 
         */
        public Builder gatingControls(String... gatingControls) {
            return gatingControls(List.of(gatingControls));
        }

        /**
         * @param targetControls Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified GatingControls. For example, say you have three gating controls, one for each of three AWS Regions. Now you specify AtLeast 2 as your RuleConfig. With these settings, you can only change (set or unset) the routing controls that you have specified as TargetControls if that rule evaluates to true.
         * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by the rule that you set for the routing controls in GatingControls.
         * 
         * @return builder
         * 
         */
        public Builder targetControls(Output<List<String>> targetControls) {
            $.targetControls = targetControls;
            return this;
        }

        /**
         * @param targetControls Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified GatingControls. For example, say you have three gating controls, one for each of three AWS Regions. Now you specify AtLeast 2 as your RuleConfig. With these settings, you can only change (set or unset) the routing controls that you have specified as TargetControls if that rule evaluates to true.
         * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by the rule that you set for the routing controls in GatingControls.
         * 
         * @return builder
         * 
         */
        public Builder targetControls(List<String> targetControls) {
            return targetControls(Output.of(targetControls));
        }

        /**
         * @param targetControls Routing controls that can only be set or unset if the specified RuleConfig evaluates to true for the specified GatingControls. For example, say you have three gating controls, one for each of three AWS Regions. Now you specify AtLeast 2 as your RuleConfig. With these settings, you can only change (set or unset) the routing controls that you have specified as TargetControls if that rule evaluates to true.
         * In other words, your ability to change the routing controls that you have specified as TargetControls is gated by the rule that you set for the routing controls in GatingControls.
         * 
         * @return builder
         * 
         */
        public Builder targetControls(String... targetControls) {
            return targetControls(List.of(targetControls));
        }

        /**
         * @param waitPeriodMs An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent &#34;flapping&#34; of state. The wait period is 5000 ms by default, but you can choose a custom value.
         * 
         * @return builder
         * 
         */
        public Builder waitPeriodMs(Output<Integer> waitPeriodMs) {
            $.waitPeriodMs = waitPeriodMs;
            return this;
        }

        /**
         * @param waitPeriodMs An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent &#34;flapping&#34; of state. The wait period is 5000 ms by default, but you can choose a custom value.
         * 
         * @return builder
         * 
         */
        public Builder waitPeriodMs(Integer waitPeriodMs) {
            return waitPeriodMs(Output.of(waitPeriodMs));
        }

        public SafetyRuleGatingRuleArgs build() {
            $.gatingControls = Objects.requireNonNull($.gatingControls, "expected parameter 'gatingControls' to be non-null");
            $.targetControls = Objects.requireNonNull($.targetControls, "expected parameter 'targetControls' to be non-null");
            $.waitPeriodMs = Objects.requireNonNull($.waitPeriodMs, "expected parameter 'waitPeriodMs' to be non-null");
            return $;
        }
    }

}
