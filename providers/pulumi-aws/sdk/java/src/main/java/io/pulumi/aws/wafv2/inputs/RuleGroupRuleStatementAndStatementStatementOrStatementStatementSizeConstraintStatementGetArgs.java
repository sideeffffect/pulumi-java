// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs Empty = new RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs();

    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    @InputImport(name="comparisonOperator", required=true)
      private final Input<String> comparisonOperator;

    public Input<String> getComparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch;

    public Input<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    @InputImport(name="size", required=true)
      private final Input<Integer> size;

    public Input<Integer> getSize() {
        return this.size;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations;

    public Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs(
        Input<String> comparisonOperator,
        @Nullable Input<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch,
        Input<Integer> size,
        Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations) {
        this.comparisonOperator = Objects.requireNonNull(comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs() {
        this.comparisonOperator = Input.empty();
        this.fieldToMatch = Input.empty();
        this.size = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> comparisonOperator;
        private @Nullable Input<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch;
        private Input<Integer> size;
        private Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder comparisonOperator(Input<String> comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Input.of(Objects.requireNonNull(comparisonOperator));
            return this;
        }

        public Builder fieldToMatch(@Nullable Input<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder size(Input<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder size(Integer size) {
            this.size = Input.of(Objects.requireNonNull(size));
            return this;
        }

        public Builder textTransformations(Input<List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs build() {
            return new RuleGroupRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
