// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs();

    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    @Import(name="comparisonOperator", required=true)
    private Output<String> comparisonOperator;

    public Output<String> comparisonOperator() {
        return this.comparisonOperator;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch;

    public Optional<Output<WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    @Import(name="size", required=true)
    private Output<Integer> size;

    public Output<Integer> size() {
        return this.size;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations;

    public Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs() {}

    private WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs(WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs $) {
        this.comparisonOperator = $.comparisonOperator;
        this.fieldToMatch = $.fieldToMatch;
        this.size = $.size;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs();
        }

        public Builder(WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs defaults) {
            $ = new WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder comparisonOperator(Output<String> comparisonOperator) {
            $.comparisonOperator = comparisonOperator;
            return this;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            return comparisonOperator(Output.of(comparisonOperator));
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchGetArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder size(Output<Integer> size) {
            $.size = size;
            return this;
        }

        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformationGetArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformationGetArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementTextTransformationGetArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementOrStatementStatementAndStatementStatementSizeConstraintStatementGetArgs build() {
            $.comparisonOperator = Objects.requireNonNull($.comparisonOperator, "expected parameter 'comparisonOperator' to be non-null");
            $.size = Objects.requireNonNull($.size, "expected parameter 'size' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
