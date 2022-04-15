// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleGroupRuleVariablesIpSetIpSet {
    /**
     * Set of IP addresses and address ranges, in CIDR notation.
     * 
     */
    private final List<String> definitions;

    @CustomType.Constructor
    private RuleGroupRuleGroupRuleVariablesIpSetIpSet(@CustomType.Parameter("definitions") List<String> definitions) {
        this.definitions = definitions;
    }

    /**
     * Set of IP addresses and address ranges, in CIDR notation.
     * 
    */
    public List<String> definitions() {
        return this.definitions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariablesIpSetIpSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> definitions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariablesIpSetIpSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.definitions = defaults.definitions;
        }

        public Builder definitions(List<String> definitions) {
            this.definitions = Objects.requireNonNull(definitions);
            return this;
        }
        public Builder definitions(String... definitions) {
            return definitions(List.of(definitions));
        }        public RuleGroupRuleGroupRuleVariablesIpSetIpSet build() {
            return new RuleGroupRuleGroupRuleVariablesIpSetIpSet(definitions);
        }
    }
}
