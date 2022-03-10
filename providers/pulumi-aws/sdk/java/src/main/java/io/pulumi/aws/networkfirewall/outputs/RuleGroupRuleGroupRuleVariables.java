// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRuleVariablesIpSet;
import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRuleVariablesPortSet;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleGroupRuleVariables {
    /**
     * Set of configuration blocks that define IP address information. See IP Sets below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRuleVariablesIpSet> ipSets;
    /**
     * Set of configuration blocks that define port range information. See Port Sets below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRuleVariablesPortSet> portSets;

    @OutputCustomType.Constructor
    private RuleGroupRuleGroupRuleVariables(
        @OutputCustomType.Parameter("ipSets") @Nullable List<RuleGroupRuleGroupRuleVariablesIpSet> ipSets,
        @OutputCustomType.Parameter("portSets") @Nullable List<RuleGroupRuleGroupRuleVariablesPortSet> portSets) {
        this.ipSets = ipSets;
        this.portSets = portSets;
    }

    /**
     * Set of configuration blocks that define IP address information. See IP Sets below for details.
     * 
    */
    public List<RuleGroupRuleGroupRuleVariablesIpSet> getIpSets() {
        return this.ipSets == null ? List.of() : this.ipSets;
    }
    /**
     * Set of configuration blocks that define port range information. See Port Sets below for details.
     * 
    */
    public List<RuleGroupRuleGroupRuleVariablesPortSet> getPortSets() {
        return this.portSets == null ? List.of() : this.portSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRuleVariables defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RuleGroupRuleGroupRuleVariablesIpSet> ipSets;
        private @Nullable List<RuleGroupRuleGroupRuleVariablesPortSet> portSets;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRuleVariables defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipSets = defaults.ipSets;
    	      this.portSets = defaults.portSets;
        }

        public Builder ipSets(@Nullable List<RuleGroupRuleGroupRuleVariablesIpSet> ipSets) {
            this.ipSets = ipSets;
            return this;
        }

        public Builder portSets(@Nullable List<RuleGroupRuleGroupRuleVariablesPortSet> portSets) {
            this.portSets = portSets;
            return this;
        }
        public RuleGroupRuleGroupRuleVariables build() {
            return new RuleGroupRuleGroupRuleVariables(ipSets, portSets);
        }
    }
}
