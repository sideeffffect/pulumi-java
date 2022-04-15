// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupRuleGroupRuleVariablesIpSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesIpSetArgs Empty = new RuleGroupRuleGroupRuleVariablesIpSetArgs();

    /**
     * A configuration block that defines a set of IP addresses. See IP Set below for details.
     * 
     */
    @Import(name="ipSet", required=true)
      private final Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs> ipSet;

    public Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs> ipSet() {
        return this.ipSet;
    }

    /**
     * A unique alphanumeric string to identify the `ip_set`.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    public RuleGroupRuleGroupRuleVariablesIpSetArgs(
        Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs> ipSet,
        Output<String> key) {
        this.ipSet = Objects.requireNonNull(ipSet, "expected parameter 'ipSet' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private RuleGroupRuleGroupRuleVariablesIpSetArgs() {
        this.ipSet = Codegen.empty();
        this.key = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariablesIpSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs> ipSet;
        private Output<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariablesIpSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSet = defaults.ipSet;
    	      this.key = defaults.key;
        }

        public Builder ipSet(Output<RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs> ipSet) {
            this.ipSet = Objects.requireNonNull(ipSet);
            return this;
        }
        public Builder ipSet(RuleGroupRuleGroupRuleVariablesIpSetIpSetArgs ipSet) {
            this.ipSet = Output.of(Objects.requireNonNull(ipSet));
            return this;
        }
        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }        public RuleGroupRuleGroupRuleVariablesIpSetArgs build() {
            return new RuleGroupRuleGroupRuleVariablesIpSetArgs(ipSet, key);
        }
    }
}
