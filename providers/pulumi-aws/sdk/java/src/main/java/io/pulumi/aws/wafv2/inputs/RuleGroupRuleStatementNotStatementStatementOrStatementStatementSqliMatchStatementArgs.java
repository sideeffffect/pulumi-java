// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs Empty = new RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    public Input<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    public Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs(
        @Nullable Input<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch,
        Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;
        private Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Input<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder textTransformations(Input<List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs build() {
            return new RuleGroupRuleStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}
