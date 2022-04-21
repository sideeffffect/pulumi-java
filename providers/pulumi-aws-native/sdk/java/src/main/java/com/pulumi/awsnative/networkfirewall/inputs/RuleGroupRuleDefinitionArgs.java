// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkfirewall.inputs;

import com.pulumi.awsnative.networkfirewall.inputs.RuleGroupMatchAttributesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleDefinitionArgs Empty = new RuleGroupRuleDefinitionArgs();

    @Import(name="actions", required=true)
    private Output<List<String>> actions;

    public Output<List<String>> actions() {
        return this.actions;
    }

    @Import(name="matchAttributes", required=true)
    private Output<RuleGroupMatchAttributesArgs> matchAttributes;

    public Output<RuleGroupMatchAttributesArgs> matchAttributes() {
        return this.matchAttributes;
    }

    private RuleGroupRuleDefinitionArgs() {}

    private RuleGroupRuleDefinitionArgs(RuleGroupRuleDefinitionArgs $) {
        this.actions = $.actions;
        this.matchAttributes = $.matchAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleDefinitionArgs $;

        public Builder() {
            $ = new RuleGroupRuleDefinitionArgs();
        }

        public Builder(RuleGroupRuleDefinitionArgs defaults) {
            $ = new RuleGroupRuleDefinitionArgs(Objects.requireNonNull(defaults));
        }

        public Builder actions(Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        public Builder matchAttributes(Output<RuleGroupMatchAttributesArgs> matchAttributes) {
            $.matchAttributes = matchAttributes;
            return this;
        }

        public Builder matchAttributes(RuleGroupMatchAttributesArgs matchAttributes) {
            return matchAttributes(Output.of(matchAttributes));
        }

        public RuleGroupRuleDefinitionArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.matchAttributes = Objects.requireNonNull($.matchAttributes, "expected parameter 'matchAttributes' to be non-null");
            return $;
        }
    }

}
