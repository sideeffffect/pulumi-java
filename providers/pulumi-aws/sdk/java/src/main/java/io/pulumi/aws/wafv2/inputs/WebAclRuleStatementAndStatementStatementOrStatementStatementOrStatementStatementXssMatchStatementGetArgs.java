// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;

    public Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

    public Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs(
        @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch,
        Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch;
        private Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Input<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementFieldToMatchGetArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder textTransformations(Input<List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementTextTransformationGetArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs(fieldToMatch, textTransformations);
        }
    }
}
