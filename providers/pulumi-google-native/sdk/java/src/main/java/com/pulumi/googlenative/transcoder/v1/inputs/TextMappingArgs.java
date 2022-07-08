// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`.
 * 
 */
public final class TextMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TextMappingArgs Empty = new TextMappingArgs();

    /**
     * The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
     * 
     */
    @Import(name="atomKey", required=true)
    private Output<String> atomKey;

    /**
     * @return The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
     * 
     */
    public Output<String> atomKey() {
        return this.atomKey;
    }

    /**
     * The `Input.key` that identifies the input file.
     * 
     */
    @Import(name="inputKey", required=true)
    private Output<String> inputKey;

    /**
     * @return The `Input.key` that identifies the input file.
     * 
     */
    public Output<String> inputKey() {
        return this.inputKey;
    }

    /**
     * The zero-based index of the track in the input file.
     * 
     */
    @Import(name="inputTrack", required=true)
    private Output<Integer> inputTrack;

    /**
     * @return The zero-based index of the track in the input file.
     * 
     */
    public Output<Integer> inputTrack() {
        return this.inputTrack;
    }

    private TextMappingArgs() {}

    private TextMappingArgs(TextMappingArgs $) {
        this.atomKey = $.atomKey;
        this.inputKey = $.inputKey;
        this.inputTrack = $.inputTrack;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TextMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TextMappingArgs $;

        public Builder() {
            $ = new TextMappingArgs();
        }

        public Builder(TextMappingArgs defaults) {
            $ = new TextMappingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param atomKey The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
         * 
         * @return builder
         * 
         */
        public Builder atomKey(Output<String> atomKey) {
            $.atomKey = atomKey;
            return this;
        }

        /**
         * @param atomKey The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`.
         * 
         * @return builder
         * 
         */
        public Builder atomKey(String atomKey) {
            return atomKey(Output.of(atomKey));
        }

        /**
         * @param inputKey The `Input.key` that identifies the input file.
         * 
         * @return builder
         * 
         */
        public Builder inputKey(Output<String> inputKey) {
            $.inputKey = inputKey;
            return this;
        }

        /**
         * @param inputKey The `Input.key` that identifies the input file.
         * 
         * @return builder
         * 
         */
        public Builder inputKey(String inputKey) {
            return inputKey(Output.of(inputKey));
        }

        /**
         * @param inputTrack The zero-based index of the track in the input file.
         * 
         * @return builder
         * 
         */
        public Builder inputTrack(Output<Integer> inputTrack) {
            $.inputTrack = inputTrack;
            return this;
        }

        /**
         * @param inputTrack The zero-based index of the track in the input file.
         * 
         * @return builder
         * 
         */
        public Builder inputTrack(Integer inputTrack) {
            return inputTrack(Output.of(inputTrack));
        }

        public TextMappingArgs build() {
            $.atomKey = Objects.requireNonNull($.atomKey, "expected parameter 'atomKey' to be non-null");
            $.inputKey = Objects.requireNonNull($.inputKey, "expected parameter 'inputKey' to be non-null");
            $.inputTrack = Objects.requireNonNull($.inputTrack, "expected parameter 'inputTrack' to be non-null");
            return $;
        }
    }

}
