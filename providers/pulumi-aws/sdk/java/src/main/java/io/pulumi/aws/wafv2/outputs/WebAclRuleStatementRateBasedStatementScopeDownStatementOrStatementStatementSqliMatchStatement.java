// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatement {
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor({"fieldToMatch","textTransformations"})
    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatement(
        @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch,
        List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatement build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementSqliMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
