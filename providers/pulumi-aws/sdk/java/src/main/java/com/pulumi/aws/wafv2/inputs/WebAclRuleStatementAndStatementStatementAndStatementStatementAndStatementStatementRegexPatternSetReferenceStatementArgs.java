// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the Regex Pattern Set that this statement references.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch;

    public Optional<Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs $) {
        this.arn = $.arn;
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementRegexPatternSetReferenceStatementArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
