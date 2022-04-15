// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction {
    /**
     * A configuration block describing the custom action associated with the `action_name`. See Action Definition below for details.
     * 
     */
    private final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition actionDefinition;
    /**
     * A friendly name of the custom action.
     * 
     */
    private final String actionName;

    @CustomType.Constructor
    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction(
        @CustomType.Parameter("actionDefinition") RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition actionDefinition,
        @CustomType.Parameter("actionName") String actionName) {
        this.actionDefinition = actionDefinition;
        this.actionName = actionName;
    }

    /**
     * A configuration block describing the custom action associated with the `action_name`. See Action Definition below for details.
     * 
    */
    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition actionDefinition() {
        return this.actionDefinition;
    }
    /**
     * A friendly name of the custom action.
     * 
    */
    public String actionName() {
        return this.actionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition actionDefinition;
        private String actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        public Builder actionDefinition(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomActionActionDefinition actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }
        public Builder actionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsCustomAction(actionDefinition, actionName);
        }
    }
}
