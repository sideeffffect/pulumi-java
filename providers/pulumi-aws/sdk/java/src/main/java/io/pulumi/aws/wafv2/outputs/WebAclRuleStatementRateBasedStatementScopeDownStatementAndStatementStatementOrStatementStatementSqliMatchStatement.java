// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatement {
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations;

    @CustomType.Constructor
    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatement(
        @CustomType.Parameter("fieldToMatch") @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch,
        @CustomType.Parameter("textTransformations") List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatementTextTransformation... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatement build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementOrStatementStatementSqliMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
