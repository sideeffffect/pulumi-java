// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupCaptchaConfigArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupLabelArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupRuleActionArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupStatementArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupVisibilityConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule of RuleGroup that contains condition and action.
 * 
 */
public final class RuleGroupRuleArgs extends ResourceArgs {

    public static final RuleGroupRuleArgs Empty = new RuleGroupRuleArgs();

    @Import(name="action")
    private @Nullable Output<RuleGroupRuleActionArgs> action;

    public Optional<Output<RuleGroupRuleActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    @Import(name="captchaConfig")
    private @Nullable Output<RuleGroupCaptchaConfigArgs> captchaConfig;

    public Optional<Output<RuleGroupCaptchaConfigArgs>> captchaConfig() {
        return Optional.ofNullable(this.captchaConfig);
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="priority", required=true)
    private Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Collection of Rule Labels.
     * 
     */
    @Import(name="ruleLabels")
    private @Nullable Output<List<RuleGroupLabelArgs>> ruleLabels;

    /**
     * @return Collection of Rule Labels.
     * 
     */
    public Optional<Output<List<RuleGroupLabelArgs>>> ruleLabels() {
        return Optional.ofNullable(this.ruleLabels);
    }

    @Import(name="statement", required=true)
    private Output<RuleGroupStatementArgs> statement;

    public Output<RuleGroupStatementArgs> statement() {
        return this.statement;
    }

    @Import(name="visibilityConfig", required=true)
    private Output<RuleGroupVisibilityConfigArgs> visibilityConfig;

    public Output<RuleGroupVisibilityConfigArgs> visibilityConfig() {
        return this.visibilityConfig;
    }

    private RuleGroupRuleArgs() {}

    private RuleGroupRuleArgs(RuleGroupRuleArgs $) {
        this.action = $.action;
        this.captchaConfig = $.captchaConfig;
        this.name = $.name;
        this.priority = $.priority;
        this.ruleLabels = $.ruleLabels;
        this.statement = $.statement;
        this.visibilityConfig = $.visibilityConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleArgs $;

        public Builder() {
            $ = new RuleGroupRuleArgs();
        }

        public Builder(RuleGroupRuleArgs defaults) {
            $ = new RuleGroupRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<RuleGroupRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        public Builder action(RuleGroupRuleActionArgs action) {
            return action(Output.of(action));
        }

        public Builder captchaConfig(@Nullable Output<RuleGroupCaptchaConfigArgs> captchaConfig) {
            $.captchaConfig = captchaConfig;
            return this;
        }

        public Builder captchaConfig(RuleGroupCaptchaConfigArgs captchaConfig) {
            return captchaConfig(Output.of(captchaConfig));
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

        /**
         * @param ruleLabels Collection of Rule Labels.
         * 
         * @return builder
         * 
         */
        public Builder ruleLabels(@Nullable Output<List<RuleGroupLabelArgs>> ruleLabels) {
            $.ruleLabels = ruleLabels;
            return this;
        }

        /**
         * @param ruleLabels Collection of Rule Labels.
         * 
         * @return builder
         * 
         */
        public Builder ruleLabels(List<RuleGroupLabelArgs> ruleLabels) {
            return ruleLabels(Output.of(ruleLabels));
        }

        /**
         * @param ruleLabels Collection of Rule Labels.
         * 
         * @return builder
         * 
         */
        public Builder ruleLabels(RuleGroupLabelArgs... ruleLabels) {
            return ruleLabels(List.of(ruleLabels));
        }

        public Builder statement(Output<RuleGroupStatementArgs> statement) {
            $.statement = statement;
            return this;
        }

        public Builder statement(RuleGroupStatementArgs statement) {
            return statement(Output.of(statement));
        }

        public Builder visibilityConfig(Output<RuleGroupVisibilityConfigArgs> visibilityConfig) {
            $.visibilityConfig = visibilityConfig;
            return this;
        }

        public Builder visibilityConfig(RuleGroupVisibilityConfigArgs visibilityConfig) {
            return visibilityConfig(Output.of(visibilityConfig));
        }

        public RuleGroupRuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.statement = Objects.requireNonNull($.statement, "expected parameter 'statement' to be non-null");
            $.visibilityConfig = Objects.requireNonNull($.visibilityConfig, "expected parameter 'visibilityConfig' to be non-null");
            return $;
        }
    }

}
