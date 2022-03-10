// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs Empty = new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;

    public Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

    public Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs(
        @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch,
        Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs() {
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch;
        private Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder fieldToMatch(@Nullable Input<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder textTransformations(Input<List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs build() {
            return new WebAclRuleStatementOrStatementStatementNotStatementStatementOrStatementStatementXssMatchStatementArgs(fieldToMatch, textTransformations);
        }
    }
}
