// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchArgs> fieldToMatch;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * The area within the portion of a web request that you want AWS WAF to search for `search_string`. Valid values include the following: `EXACTLY`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CONTAINS_WORD`. See the AWS [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchStatement.html) for more information.
     * 
     */
    @Import(name="positionalConstraint", required=true)
    private Output<String> positionalConstraint;

    public Output<String> positionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * A string value that you want AWS WAF to search for. AWS WAF searches only in the part of web requests that you designate for inspection in `field_to_match`. The maximum length of the value is 50 bytes.
     * 
     */
    @Import(name="searchString", required=true)
    private Output<String> searchString;

    public Output<String> searchString() {
        return this.searchString;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection. See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations;

    public Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.positionalConstraint = $.positionalConstraint;
        this.searchString = $.searchString;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder positionalConstraint(Output<String> positionalConstraint) {
            $.positionalConstraint = positionalConstraint;
            return this;
        }

        public Builder positionalConstraint(String positionalConstraint) {
            return positionalConstraint(Output.of(positionalConstraint));
        }

        public Builder searchString(Output<String> searchString) {
            $.searchString = searchString;
            return this;
        }

        public Builder searchString(String searchString) {
            return searchString(Output.of(searchString));
        }

        public Builder textTransformations(Output<List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementArgs build() {
            $.positionalConstraint = Objects.requireNonNull($.positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
            $.searchString = Objects.requireNonNull($.searchString, "expected parameter 'searchString' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
