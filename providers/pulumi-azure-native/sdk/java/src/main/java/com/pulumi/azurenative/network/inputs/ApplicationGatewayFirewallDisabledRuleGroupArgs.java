// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Allows to disable rules within a rule group or an entire rule group.
 * 
 */
public final class ApplicationGatewayFirewallDisabledRuleGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayFirewallDisabledRuleGroupArgs Empty = new ApplicationGatewayFirewallDisabledRuleGroupArgs();

    /**
     * The name of the rule group that will be disabled.
     * 
     */
    @Import(name="ruleGroupName", required=true)
    private Output<String> ruleGroupName;

    public Output<String> ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * The list of rules that will be disabled. If null, all rules of the rule group will be disabled.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<Integer>> rules;

    public Optional<Output<List<Integer>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private ApplicationGatewayFirewallDisabledRuleGroupArgs() {}

    private ApplicationGatewayFirewallDisabledRuleGroupArgs(ApplicationGatewayFirewallDisabledRuleGroupArgs $) {
        this.ruleGroupName = $.ruleGroupName;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayFirewallDisabledRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayFirewallDisabledRuleGroupArgs $;

        public Builder() {
            $ = new ApplicationGatewayFirewallDisabledRuleGroupArgs();
        }

        public Builder(ApplicationGatewayFirewallDisabledRuleGroupArgs defaults) {
            $ = new ApplicationGatewayFirewallDisabledRuleGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder ruleGroupName(Output<String> ruleGroupName) {
            $.ruleGroupName = ruleGroupName;
            return this;
        }

        public Builder ruleGroupName(String ruleGroupName) {
            return ruleGroupName(Output.of(ruleGroupName));
        }

        public Builder rules(@Nullable Output<List<Integer>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<Integer> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(Integer... rules) {
            return rules(List.of(rules));
        }

        public ApplicationGatewayFirewallDisabledRuleGroupArgs build() {
            $.ruleGroupName = Objects.requireNonNull($.ruleGroupName, "expected parameter 'ruleGroupName' to be non-null");
            return $;
        }
    }

}
