// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupStatefulRuleOptionsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupArgs Empty = new RuleGroupRuleGroupArgs();

    /**
     * A configuration block that defines additional settings available to use in the rules defined in the rule group. Can only be specified for **stateful** rule groups. See Rule Variables below for details.
     * 
     */
    @InputImport(name="ruleVariables")
      private final @Nullable Input<RuleGroupRuleGroupRuleVariablesArgs> ruleVariables;

    public Input<RuleGroupRuleGroupRuleVariablesArgs> getRuleVariables() {
        return this.ruleVariables == null ? Input.empty() : this.ruleVariables;
    }

    /**
     * A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
     * 
     */
    @InputImport(name="rulesSource", required=true)
      private final Input<RuleGroupRuleGroupRulesSourceArgs> rulesSource;

    public Input<RuleGroupRuleGroupRulesSourceArgs> getRulesSource() {
        return this.rulesSource;
    }

    /**
     * A configuration block that defines stateful rule options for the rule group. See Stateful Rule Options below for details.
     * 
     */
    @InputImport(name="statefulRuleOptions")
      private final @Nullable Input<RuleGroupRuleGroupStatefulRuleOptionsArgs> statefulRuleOptions;

    public Input<RuleGroupRuleGroupStatefulRuleOptionsArgs> getStatefulRuleOptions() {
        return this.statefulRuleOptions == null ? Input.empty() : this.statefulRuleOptions;
    }

    public RuleGroupRuleGroupArgs(
        @Nullable Input<RuleGroupRuleGroupRuleVariablesArgs> ruleVariables,
        Input<RuleGroupRuleGroupRulesSourceArgs> rulesSource,
        @Nullable Input<RuleGroupRuleGroupStatefulRuleOptionsArgs> statefulRuleOptions) {
        this.ruleVariables = ruleVariables;
        this.rulesSource = Objects.requireNonNull(rulesSource, "expected parameter 'rulesSource' to be non-null");
        this.statefulRuleOptions = statefulRuleOptions;
    }

    private RuleGroupRuleGroupArgs() {
        this.ruleVariables = Input.empty();
        this.rulesSource = Input.empty();
        this.statefulRuleOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleGroupRuleVariablesArgs> ruleVariables;
        private Input<RuleGroupRuleGroupRulesSourceArgs> rulesSource;
        private @Nullable Input<RuleGroupRuleGroupStatefulRuleOptionsArgs> statefulRuleOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleVariables = defaults.ruleVariables;
    	      this.rulesSource = defaults.rulesSource;
    	      this.statefulRuleOptions = defaults.statefulRuleOptions;
        }

        public Builder ruleVariables(@Nullable Input<RuleGroupRuleGroupRuleVariablesArgs> ruleVariables) {
            this.ruleVariables = ruleVariables;
            return this;
        }

        public Builder ruleVariables(@Nullable RuleGroupRuleGroupRuleVariablesArgs ruleVariables) {
            this.ruleVariables = Input.ofNullable(ruleVariables);
            return this;
        }

        public Builder rulesSource(Input<RuleGroupRuleGroupRulesSourceArgs> rulesSource) {
            this.rulesSource = Objects.requireNonNull(rulesSource);
            return this;
        }

        public Builder rulesSource(RuleGroupRuleGroupRulesSourceArgs rulesSource) {
            this.rulesSource = Input.of(Objects.requireNonNull(rulesSource));
            return this;
        }

        public Builder statefulRuleOptions(@Nullable Input<RuleGroupRuleGroupStatefulRuleOptionsArgs> statefulRuleOptions) {
            this.statefulRuleOptions = statefulRuleOptions;
            return this;
        }

        public Builder statefulRuleOptions(@Nullable RuleGroupRuleGroupStatefulRuleOptionsArgs statefulRuleOptions) {
            this.statefulRuleOptions = Input.ofNullable(statefulRuleOptions);
            return this;
        }
        public RuleGroupRuleGroupArgs build() {
            return new RuleGroupRuleGroupArgs(ruleVariables, rulesSource, statefulRuleOptions);
        }
    }
}
