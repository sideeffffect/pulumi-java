// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRuleVariablesPortSetPortSet;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleGroupRuleVariablesPortSet {
    /**
     * An unique alphanumeric string to identify the `port_set`.
     * 
     */
    private final String key;
    /**
     * A configuration block that defines a set of port ranges. See Port Set below for details.
     * 
     */
    private final RuleGroupRuleGroupRuleVariablesPortSetPortSet portSet;

    @CustomType.Constructor
    private RuleGroupRuleGroupRuleVariablesPortSet(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("portSet") RuleGroupRuleGroupRuleVariablesPortSetPortSet portSet) {
        this.key = key;
        this.portSet = portSet;
    }

    /**
     * An unique alphanumeric string to identify the `port_set`.
     * 
    */
    public String key() {
        return this.key;
    }
    /**
     * A configuration block that defines a set of port ranges. See Port Set below for details.
     * 
    */
    public RuleGroupRuleGroupRuleVariablesPortSetPortSet portSet() {
        return this.portSet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariablesPortSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private RuleGroupRuleGroupRuleVariablesPortSetPortSet portSet;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariablesPortSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.portSet = defaults.portSet;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder portSet(RuleGroupRuleGroupRuleVariablesPortSetPortSet portSet) {
            this.portSet = Objects.requireNonNull(portSet);
            return this;
        }        public RuleGroupRuleGroupRuleVariablesPortSet build() {
            return new RuleGroupRuleGroupRuleVariablesPortSet(key, portSet);
        }
    }
}
