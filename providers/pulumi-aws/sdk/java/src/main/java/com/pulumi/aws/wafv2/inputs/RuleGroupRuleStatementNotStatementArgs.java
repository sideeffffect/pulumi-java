// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleStatementNotStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementArgs Empty = new RuleGroupRuleStatementNotStatementArgs();

    /**
     * The statement to negate. You can use any statement that can be nested. See Statement above for details.
     * 
     */
    @Import(name="statements", required=true)
    private Output<List<RuleGroupRuleStatementNotStatementStatementArgs>> statements;

    public Output<List<RuleGroupRuleStatementNotStatementStatementArgs>> statements() {
        return this.statements;
    }

    private RuleGroupRuleStatementNotStatementArgs() {}

    private RuleGroupRuleStatementNotStatementArgs(RuleGroupRuleStatementNotStatementArgs $) {
        this.statements = $.statements;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementNotStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementNotStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementNotStatementArgs();
        }

        public Builder(RuleGroupRuleStatementNotStatementArgs defaults) {
            $ = new RuleGroupRuleStatementNotStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder statements(Output<List<RuleGroupRuleStatementNotStatementStatementArgs>> statements) {
            $.statements = statements;
            return this;
        }

        public Builder statements(List<RuleGroupRuleStatementNotStatementStatementArgs> statements) {
            return statements(Output.of(statements));
        }

        public Builder statements(RuleGroupRuleStatementNotStatementStatementArgs... statements) {
            return statements(List.of(statements));
        }

        public RuleGroupRuleStatementNotStatementArgs build() {
            $.statements = Objects.requireNonNull($.statements, "expected parameter 'statements' to be non-null");
            return $;
        }
    }

}
