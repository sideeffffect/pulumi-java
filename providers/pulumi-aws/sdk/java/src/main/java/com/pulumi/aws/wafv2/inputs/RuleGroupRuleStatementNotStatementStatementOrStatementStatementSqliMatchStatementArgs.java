// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs Empty = new RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    public Optional<Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs() {}

    private RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs();
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
            $ = new RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(@Nullable Output<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
