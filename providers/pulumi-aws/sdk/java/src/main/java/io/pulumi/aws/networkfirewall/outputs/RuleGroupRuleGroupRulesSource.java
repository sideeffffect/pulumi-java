// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceRulesSourceList;
import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatefulRule;
import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleGroupRuleGroupRulesSource {
    /**
     * A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * 
     */
    private final @Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList;
    /**
     * The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
     * 
     */
    private final @Nullable String rulesString;
    /**
     * Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * 
     */
    private final @Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules;
    /**
     * A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * 
     */
    private final @Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions;

    @CustomType.Constructor
    private RuleGroupRuleGroupRulesSource(
        @CustomType.Parameter("rulesSourceList") @Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList,
        @CustomType.Parameter("rulesString") @Nullable String rulesString,
        @CustomType.Parameter("statefulRules") @Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules,
        @CustomType.Parameter("statelessRulesAndCustomActions") @Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions) {
        this.rulesSourceList = rulesSourceList;
        this.rulesString = rulesString;
        this.statefulRules = statefulRules;
        this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
    }

    /**
     * A configuration block containing **stateful** inspection criteria for a domain list rule group. See Rules Source List below for details.
     * 
    */
    public Optional<RuleGroupRuleGroupRulesSourceRulesSourceList> rulesSourceList() {
        return Optional.ofNullable(this.rulesSourceList);
    }
    /**
     * The fully qualified name of a file in an S3 bucket that contains Suricata compatible intrusion preventions system (IPS) rules or the Suricata rules as a string. These rules contain **stateful** inspection criteria and the action to take for traffic that matches the criteria.
     * 
    */
    public Optional<String> rulesString() {
        return Optional.ofNullable(this.rulesString);
    }
    /**
     * Set of configuration blocks containing **stateful** inspection criteria for 5-tuple rules to be used together in a rule group. See Stateful Rule below for details.
     * 
    */
    public List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules() {
        return this.statefulRules == null ? List.of() : this.statefulRules;
    }
    /**
     * A configuration block containing **stateless** inspection criteria for a stateless rule group. See Stateless Rules and Custom Actions below for details.
     * 
    */
    public Optional<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions> statelessRulesAndCustomActions() {
        return Optional.ofNullable(this.statelessRulesAndCustomActions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList;
        private @Nullable String rulesString;
        private @Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules;
        private @Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesSourceList = defaults.rulesSourceList;
    	      this.rulesString = defaults.rulesString;
    	      this.statefulRules = defaults.statefulRules;
    	      this.statelessRulesAndCustomActions = defaults.statelessRulesAndCustomActions;
        }

        public Builder rulesSourceList(@Nullable RuleGroupRuleGroupRulesSourceRulesSourceList rulesSourceList) {
            this.rulesSourceList = rulesSourceList;
            return this;
        }
        public Builder rulesString(@Nullable String rulesString) {
            this.rulesString = rulesString;
            return this;
        }
        public Builder statefulRules(@Nullable List<RuleGroupRuleGroupRulesSourceStatefulRule> statefulRules) {
            this.statefulRules = statefulRules;
            return this;
        }
        public Builder statefulRules(RuleGroupRuleGroupRulesSourceStatefulRule... statefulRules) {
            return statefulRules(List.of(statefulRules));
        }
        public Builder statelessRulesAndCustomActions(@Nullable RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActions statelessRulesAndCustomActions) {
            this.statelessRulesAndCustomActions = statelessRulesAndCustomActions;
            return this;
        }        public RuleGroupRuleGroupRulesSource build() {
            return new RuleGroupRuleGroupRulesSource(rulesSourceList, rulesString, statefulRules, statelessRulesAndCustomActions);
        }
    }
}
