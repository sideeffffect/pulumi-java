// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesIpSetGetArgs;
import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesPortSetGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRuleVariablesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRuleVariablesGetArgs Empty = new RuleGroupRuleGroupRuleVariablesGetArgs();

    /**
     * Set of configuration blocks that define IP address information. See IP Sets below for details.
     * 
     */
    @Import(name="ipSets")
    private @Nullable Output<List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs>> ipSets;

    public Optional<Output<List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs>>> ipSets() {
        return Optional.ofNullable(this.ipSets);
    }

    /**
     * Set of configuration blocks that define port range information. See Port Sets below for details.
     * 
     */
    @Import(name="portSets")
    private @Nullable Output<List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs>> portSets;

    public Optional<Output<List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs>>> portSets() {
        return Optional.ofNullable(this.portSets);
    }

    private RuleGroupRuleGroupRuleVariablesGetArgs() {}

    private RuleGroupRuleGroupRuleVariablesGetArgs(RuleGroupRuleGroupRuleVariablesGetArgs $) {
        this.ipSets = $.ipSets;
        this.portSets = $.portSets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupRuleVariablesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRuleVariablesGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupRuleVariablesGetArgs();
        }

        public Builder(RuleGroupRuleGroupRuleVariablesGetArgs defaults) {
            $ = new RuleGroupRuleGroupRuleVariablesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder ipSets(@Nullable Output<List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs>> ipSets) {
            $.ipSets = ipSets;
            return this;
        }

        public Builder ipSets(List<RuleGroupRuleGroupRuleVariablesIpSetGetArgs> ipSets) {
            return ipSets(Output.of(ipSets));
        }

        public Builder ipSets(RuleGroupRuleGroupRuleVariablesIpSetGetArgs... ipSets) {
            return ipSets(List.of(ipSets));
        }

        public Builder portSets(@Nullable Output<List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs>> portSets) {
            $.portSets = portSets;
            return this;
        }

        public Builder portSets(List<RuleGroupRuleGroupRuleVariablesPortSetGetArgs> portSets) {
            return portSets(Output.of(portSets));
        }

        public Builder portSets(RuleGroupRuleGroupRuleVariablesPortSetGetArgs... portSets) {
            return portSets(List.of(portSets));
        }

        public RuleGroupRuleGroupRuleVariablesGetArgs build() {
            return $;
        }
    }

}
