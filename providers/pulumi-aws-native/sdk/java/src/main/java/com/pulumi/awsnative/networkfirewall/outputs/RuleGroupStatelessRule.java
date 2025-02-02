// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.outputs;

import com.pulumi.awsnative.networkfirewall.outputs.RuleGroupRuleDefinition;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RuleGroupStatelessRule {
    private final Integer priority;
    private final RuleGroupRuleDefinition ruleDefinition;

    @CustomType.Constructor
    private RuleGroupStatelessRule(
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("ruleDefinition") RuleGroupRuleDefinition ruleDefinition) {
        this.priority = priority;
        this.ruleDefinition = ruleDefinition;
    }

    public Integer priority() {
        return this.priority;
    }
    public RuleGroupRuleDefinition ruleDefinition() {
        return this.ruleDefinition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupStatelessRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private RuleGroupRuleDefinition ruleDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupStatelessRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.ruleDefinition = defaults.ruleDefinition;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder ruleDefinition(RuleGroupRuleDefinition ruleDefinition) {
            this.ruleDefinition = Objects.requireNonNull(ruleDefinition);
            return this;
        }        public RuleGroupStatelessRule build() {
            return new RuleGroupStatelessRule(priority, ruleDefinition);
        }
    }
}
