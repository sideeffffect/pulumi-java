// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch;
import io.pulumi.aws.wafv2.outputs.RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement {
    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    private final @Nullable RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    private final List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations;

    @OutputCustomType.Constructor
    private RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement(
        @OutputCustomType.Parameter("fieldToMatch") @Nullable RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch,
        @OutputCustomType.Parameter("textTransformations") List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = textTransformations;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
    */
    public Optional<RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch> getFieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }
    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
    */
    public List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> getTextTransformations() {
        return this.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch;
        private List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementFieldToMatch fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder textTransformations(List<RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatementTextTransformation> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement build() {
            return new RuleGroupRuleStatementAndStatementStatementAndStatementStatementXssMatchStatement(fieldToMatch, textTransformations);
        }
    }
}
