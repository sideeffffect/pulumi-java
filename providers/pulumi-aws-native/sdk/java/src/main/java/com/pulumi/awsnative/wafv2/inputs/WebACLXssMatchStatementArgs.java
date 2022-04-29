// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.WebACLFieldToMatchArgs;
import com.pulumi.awsnative.wafv2.inputs.WebACLTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.List;
import java.util.Objects;


/**
 * Xss Match Statement.
 * 
 */
public final class WebACLXssMatchStatementArgs extends ResourceArgs {

    public static final WebACLXssMatchStatementArgs Empty = new WebACLXssMatchStatementArgs();

    @Import(name="fieldToMatch", required=true)
    private Output<WebACLFieldToMatchArgs> fieldToMatch;

    public Output<WebACLFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="textTransformations", required=true)
    private Output<List<WebACLTextTransformationArgs>> textTransformations;

    public Output<List<WebACLTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private WebACLXssMatchStatementArgs() {}

    private WebACLXssMatchStatementArgs(WebACLXssMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebACLXssMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLXssMatchStatementArgs $;

        public Builder() {
            $ = new WebACLXssMatchStatementArgs();
        }

        public Builder(WebACLXssMatchStatementArgs defaults) {
            $ = new WebACLXssMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(Output<WebACLFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(WebACLFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<WebACLTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<WebACLTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(WebACLTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public WebACLXssMatchStatementArgs build() {
            $.fieldToMatch = Objects.requireNonNull($.fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
