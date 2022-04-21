// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch;

    public Optional<Output<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs() {}

    private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementAndStatementStatementNotStatementStatementOrStatementStatementSqliMatchStatementArgs build() {
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
