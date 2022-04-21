// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleRuleLabelGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleVisibilityConfigGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGetArgs Empty = new RuleGroupRuleGetArgs();

    /**
     * The action that AWS WAF should take on a web request when it matches the rule&#39;s statement. Settings at the `aws.wafv2.WebAcl` level can override the rule action setting. See Action below for details.
     * 
     */
    @Import(name="action", required=true)
    private Output<RuleGroupRuleActionGetArgs> action;

    public Output<RuleGroupRuleActionGetArgs> action() {
        return this.action;
    }

    /**
     * A friendly name of the rule.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * If you define more than one Rule in a WebACL, AWS WAF evaluates each request against the `rules` in order based on the value of `priority`. AWS WAF processes rules with lower priority first.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Labels to apply to web requests that match the rule match statement. See Rule Label below for details.
     * 
     */
    @Import(name="ruleLabels")
    private @Nullable Output<List<RuleGroupRuleRuleLabelGetArgs>> ruleLabels;

    public Optional<Output<List<RuleGroupRuleRuleLabelGetArgs>>> ruleLabels() {
        return Optional.ofNullable(this.ruleLabels);
    }

    /**
     * The AWS WAF processing statement for the rule, for example `byte_match_statement` or `geo_match_statement`. See Statement below for details.
     * 
     */
    @Import(name="statement", required=true)
    private Output<RuleGroupRuleStatementGetArgs> statement;

    public Output<RuleGroupRuleStatementGetArgs> statement() {
        return this.statement;
    }

    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Import(name="visibilityConfig", required=true)
    private Output<RuleGroupRuleVisibilityConfigGetArgs> visibilityConfig;

    public Output<RuleGroupRuleVisibilityConfigGetArgs> visibilityConfig() {
        return this.visibilityConfig;
    }

    private RuleGroupRuleGetArgs() {}

    private RuleGroupRuleGetArgs(RuleGroupRuleGetArgs $) {
        this.action = $.action;
        this.name = $.name;
        this.priority = $.priority;
        this.ruleLabels = $.ruleLabels;
        this.statement = $.statement;
        this.visibilityConfig = $.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleGetArgs();
        }

        public Builder(RuleGroupRuleGetArgs defaults) {
            $ = new RuleGroupRuleGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<RuleGroupRuleActionGetArgs> action) {
            $.action = action;
            return this;
        }

        public Builder action(RuleGroupRuleActionGetArgs action) {
            return action(Output.of(action));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder ruleLabels(@Nullable Output<List<RuleGroupRuleRuleLabelGetArgs>> ruleLabels) {
            $.ruleLabels = ruleLabels;
            return this;
        }

        public Builder ruleLabels(List<RuleGroupRuleRuleLabelGetArgs> ruleLabels) {
            return ruleLabels(Output.of(ruleLabels));
        }

        public Builder ruleLabels(RuleGroupRuleRuleLabelGetArgs... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }

        public Builder statement(Output<RuleGroupRuleStatementGetArgs> statement) {
            $.statement = statement;
            return this;
        }

        public Builder statement(RuleGroupRuleStatementGetArgs statement) {
            return statement(Output.of(statement));
        }

        public Builder visibilityConfig(Output<RuleGroupRuleVisibilityConfigGetArgs> visibilityConfig) {
            $.visibilityConfig = visibilityConfig;
            return this;
        }

        public Builder visibilityConfig(RuleGroupRuleVisibilityConfigGetArgs visibilityConfig) {
            return visibilityConfig(Output.of(visibilityConfig));
        }

        public RuleGroupRuleGetArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.statement = Objects.requireNonNull($.statement, "expected parameter 'statement' to be non-null");
            $.visibilityConfig = Objects.requireNonNull($.visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
            return $;
        }
    }

}
