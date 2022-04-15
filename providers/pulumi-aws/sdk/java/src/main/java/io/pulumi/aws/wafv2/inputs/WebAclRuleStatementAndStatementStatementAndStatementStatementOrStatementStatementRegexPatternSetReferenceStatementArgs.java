// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs;
import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch;

    public Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch == null ? Codegen.empty() : this.fieldToMatch;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
      private final Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs(
        Output<String> arn,
        @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch,
        Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.fieldToMatch = fieldToMatch;
        this.textTransformations = Objects.requireNonNull(textTransformations, "expected parameter 'textTransformations' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs() {
        this.arn = Codegen.empty();
        this.fieldToMatch = Codegen.empty();
        this.textTransformations = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch;
        private Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.textTransformations = defaults.textTransformations;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch) {
            this.fieldToMatch = fieldToMatch;
            return this;
        }
        public Builder fieldToMatch(@Nullable WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs fieldToMatch) {
            this.fieldToMatch = Codegen.ofNullable(fieldToMatch);
            return this;
        }
        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations) {
            this.textTransformations = Objects.requireNonNull(textTransformations);
            return this;
        }
        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs> textTransformations) {
            this.textTransformations = Output.of(Objects.requireNonNull(textTransformations));
            return this;
        }
        public Builder textTransformations(WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }        public WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementArgs(arn, fieldToMatch, textTransformations);
        }
    }
}
