// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.aws.wafregional.inputs.WebAclRuleActionArgs;
import com.pulumi.aws.wafregional.inputs.WebAclRuleOverrideActionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleArgs Empty = new WebAclRuleArgs();

    /**
     * Configuration block of the action that CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Not used if `type` is `GROUP`. Detailed below.
     * 
     */
    @Import(name="action")
    private @Nullable Output<WebAclRuleActionArgs> action;

    public Optional<Output<WebAclRuleActionArgs>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Configuration block of the override the action that a group requests CloudFront or AWS WAF takes when a web request matches the conditions in the rule.  Only used if `type` is `GROUP`. Detailed below.
     * 
     */
    @Import(name="overrideAction")
    private @Nullable Output<WebAclRuleOverrideActionArgs> overrideAction;

    public Optional<Output<WebAclRuleOverrideActionArgs>> overrideAction() {
        return Optional.ofNullable(this.overrideAction);
    }

    /**
     * Specifies the order in which the rules in a WebACL are evaluated.
     * Rules with a lower value are evaluated before rules with a higher value.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * ID of the associated WAF (Regional) rule (e.g. `aws.wafregional.Rule`). WAF (Global) rules cannot be used.
     * 
     */
    @Import(name="ruleId", required=true)
    private Output<String> ruleId;

    public Output<String> ruleId() {
        return this.ruleId;
    }

    /**
     * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. Valid values for `action` are `ALLOW`, `BLOCK` or `COUNT`. Valid values for `override_action` are `COUNT` and `NONE`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private WebAclRuleArgs() {}

    private WebAclRuleArgs(WebAclRuleArgs $) {
        this.action = $.action;
        this.overrideAction = $.overrideAction;
        this.priority = $.priority;
        this.ruleId = $.ruleId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleArgs $;

        public Builder() {
            $ = new WebAclRuleArgs();
        }

        public Builder(WebAclRuleArgs defaults) {
            $ = new WebAclRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<WebAclRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        public Builder action(WebAclRuleActionArgs action) {
            return action(Output.of(action));
        }

        public Builder overrideAction(@Nullable Output<WebAclRuleOverrideActionArgs> overrideAction) {
            $.overrideAction = overrideAction;
            return this;
        }

        public Builder overrideAction(WebAclRuleOverrideActionArgs overrideAction) {
            return overrideAction(Output.of(overrideAction));
        }

        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder ruleId(Output<String> ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        public Builder ruleId(String ruleId) {
            return ruleId(Output.of(ruleId));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebAclRuleArgs build() {
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.ruleId = Objects.requireNonNull($.ruleId, "expected parameter 'ruleId' to be non-null");
            return $;
        }
    }

}
