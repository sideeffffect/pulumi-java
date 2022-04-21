// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupRuleVariablesIpSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesIpSetArgs Empty = new RuleGroupRuleGroupRuleVariablesIpSetArgs();

    /**
     * A configuration block that defines a set of IP addresses. See IP Set below for details.
     * 
     */
    @Import(name="ipSet", required=true)
    private Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs> ipSet;

    public Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs> ipSet() {
        return this.ipSet;
    }

    /**
     * A unique alphanumeric string to identify the `ip_set`.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    private RuleGroupRuleGroupRuleVariablesIpSetArgs() {}

    private RuleGroupRuleGroupRuleVariablesIpSetArgs(RuleGroupRuleGroupRuleVariablesIpSetArgs $) {
        this.ipSet = $.ipSet;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRuleVariablesIpSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRuleVariablesIpSetArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRuleVariablesIpSetArgs();
        }

        public Builder(RuleGroupRuleGroupRuleVariablesIpSetArgs defaults) {
            $ = new RuleGroupRuleGroupRuleVariablesIpSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipSet(Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs> ipSet) {
            $.ipSet = ipSet;
            return this;
        }

        public Builder ipSet(RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs ipSet) {
            return ipSet(Output.of(ipSet));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public RuleGroupRuleGroupRuleVariablesIpSetArgs build() {
            $.ipSet = Objects.requireNonNull($.ipSet, "expected parameter 'ipSet' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
