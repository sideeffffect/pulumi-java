// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement {
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor
    private WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement(
        @OutputCustomType.Parameter("fieldToMatch") @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch,
        @OutputCustomType.Parameter("textTransformations") List<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
