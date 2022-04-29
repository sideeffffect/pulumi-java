// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.inputs.RuleGroupFieldToMatchArgs;
import com.pulumi.awsnative.wafv2.inputs.RuleGroupTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRegexPatternSetReferenceStatementArgs extends ResourceArgs {

    public static final RuleGroupRegexPatternSetReferenceStatementArgs Empty = new RuleGroupRegexPatternSetReferenceStatementArgs();

    @Import(name="arn", required=true)
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    @Import(name="fieldToMatch", required=true)
    private Output<RuleGroupFieldToMatchArgs> fieldToMatch;

    public Output<RuleGroupFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    @Import(name="textTransformations", required=true)
    private Output<List<RuleGroupTextTransformationArgs>> textTransformations;

    public Output<List<RuleGroupTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private RuleGroupRegexPatternSetReferenceStatementArgs() {}

    private RuleGroupRegexPatternSetReferenceStatementArgs(RuleGroupRegexPatternSetReferenceStatementArgs $) {
        this.arn = $.arn;
        this.fieldToMatch = $.fieldToMatch;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRegexPatternSetReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRegexPatternSetReferenceStatementArgs $;

        public Builder() {
            $ = new RuleGroupRegexPatternSetReferenceStatementArgs();
        }

        public Builder(RuleGroupRegexPatternSetReferenceStatementArgs defaults) {
            $ = new RuleGroupRegexPatternSetReferenceStatementArgs(Objects.requireNonNull(defaults));
        }

        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder fieldToMatch(Output<RuleGroupFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(RuleGroupFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder textTransformations(Output<List<RuleGroupTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        public Builder textTransformations(List<RuleGroupTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        public Builder textTransformations(RuleGroupTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public RuleGroupRegexPatternSetReferenceStatementArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            $.fieldToMatch = Objects.requireNonNull($.fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
