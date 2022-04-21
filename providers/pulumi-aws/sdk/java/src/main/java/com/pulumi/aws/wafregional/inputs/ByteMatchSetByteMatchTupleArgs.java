// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.aws.wafregional.inputs.ByteMatchSetByteMatchTupleFieldToMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ByteMatchSetByteMatchTupleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ByteMatchSetByteMatchTupleArgs Empty = new ByteMatchSetByteMatchTupleArgs();

    /**
     * Settings for the ByteMatchTuple. FieldToMatch documented below.
     * 
     */
    @Import(name="fieldToMatch", required=true)
    private Output<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch;

    public Output<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch() {
        return this.fieldToMatch;
    }

    /**
     * Within the portion of a web request that you want to search.
     * 
     */
    @Import(name="positionalConstraint", required=true)
    private Output<String> positionalConstraint;

    public Output<String> positionalConstraint() {
        return this.positionalConstraint;
    }

    /**
     * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
     * 
     */
    @Import(name="targetString")
    private @Nullable Output<String> targetString;

    public Optional<Output<String>> targetString() {
        return Optional.ofNullable(this.targetString);
    }

    /**
     * The formatting way for web request.
     * 
     */
    @Import(name="textTransformation", required=true)
    private Output<String> textTransformation;

    public Output<String> textTransformation() {
        return this.textTransformation;
    }

    private ByteMatchSetByteMatchTupleArgs() {}

    private ByteMatchSetByteMatchTupleArgs(ByteMatchSetByteMatchTupleArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.positionalConstraint = $.positionalConstraint;
        this.targetString = $.targetString;
        this.textTransformation = $.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ByteMatchSetByteMatchTupleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ByteMatchSetByteMatchTupleArgs $;

        public Builder() {
            $ = new ByteMatchSetByteMatchTupleArgs();
        }

        public Builder(ByteMatchSetByteMatchTupleArgs defaults) {
            $ = new ByteMatchSetByteMatchTupleArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldToMatch(Output<ByteMatchSetByteMatchTupleFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        public Builder fieldToMatch(ByteMatchSetByteMatchTupleFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        public Builder positionalConstraint(Output<String> positionalConstraint) {
            $.positionalConstraint = positionalConstraint;
            return this;
        }

        public Builder positionalConstraint(String positionalConstraint) {
            return positionalConstraint(Output.of(positionalConstraint));
        }

        public Builder targetString(@Nullable Output<String> targetString) {
            $.targetString = targetString;
            return this;
        }

        public Builder targetString(String targetString) {
            return targetString(Output.of(targetString));
        }

        public Builder textTransformation(Output<String> textTransformation) {
            $.textTransformation = textTransformation;
            return this;
        }

        public Builder textTransformation(String textTransformation) {
            return textTransformation(Output.of(textTransformation));
        }

        public ByteMatchSetByteMatchTupleArgs build() {
            $.fieldToMatch = Objects.requireNonNull($.fieldToMatch, "expected parameter 'fieldToMatch' to be non-null");
            $.positionalConstraint = Objects.requireNonNull($.positionalConstraint, "expected parameter 'positionalConstraint' to be non-null");
            $.textTransformation = Objects.requireNonNull($.textTransformation, "expected parameter 'textTransformation' to be non-null");
            return $;
        }
    }

}
