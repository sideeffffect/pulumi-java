// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement {
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor({"fieldToMatch","textTransformations"})
    private WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement(
        @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch fieldToMatch,
        List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
        private List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder setFieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder setTextTransformations(List<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementStatementXssMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
