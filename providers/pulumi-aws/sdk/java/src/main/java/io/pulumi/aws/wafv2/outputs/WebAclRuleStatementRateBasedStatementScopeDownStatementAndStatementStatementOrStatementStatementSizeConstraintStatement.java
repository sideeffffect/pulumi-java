// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatement {
    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
     */
    private final String comparisonOperator;
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
     */
    private final Integer size;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor
    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatement(
        @OutputCustomType.Parameter("comparisonOperator") String comparisonOperator,
        @OutputCustomType.Parameter("fieldToMatch") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch,
        @OutputCustomType.Parameter("size") Integer size,
        @OutputCustomType.Parameter("textTransformations") List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
        this.comparisonOperator = comparisonOperator;
        this.fieldToMatch = fieldToMatch;
        this.size = size;
        this.textTransformations = textTransformations;
    }

    /**
     * The operator to use to compare the request part to the size setting. Valid values include: `EQ`, `NE`, `LE`, `LT`, `GE`, or `GT`.
     * 
    */
    public String getComparisonOperator() {
        return this.comparisonOperator;
    }
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * The size, in bytes, to compare to the request part, after any transformations. Valid values are integers between 0 and 21474836480, inclusive.
     * 
    */
    public Integer getSize() {
        return this.size;
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparisonOperator;
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch;
        private Integer size;
        private List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparisonOperator = defaults.comparisonOperator;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.size = defaults.size;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder comparisonOperator(String comparisonOperator) {
            this.comparisonOperator = Objects.requireNonNull(comparisonOperator);
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatement build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSizeConstraintStatement(comparisonOperator, fieldToMatch, size, textTransformations);
        }
    }
}
