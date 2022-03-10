// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    @InputImport(name="arn", required=true)
      private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @InputImport(name="fieldToMatch")
      private final @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch;

    public Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> getFieldToMatch() {
        return this.fieldToMatch == null ? Input.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @InputImport(name="textTransformations", required=true)
      private final Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations;

    public Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> getTextTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs(
        Input<String> arn,
        @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch,
        Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs() {
        this.arn = Input.empty();
        this.fieldToMatch = Input.empty();
        this.textTransformations = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch;
        private Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder arn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder fieldToMatch(@Nullable Input<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(@Nullable WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Input.ofNullable(fieldToMatch);
            return this;
        }

        public Builder textTransformations(Input<List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Input.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs build() {
            return new WebAclRuleStatementRateBasedStatementScopeDownStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs(arn, fieldToMatch, textTransformations);
        }
    }
}
