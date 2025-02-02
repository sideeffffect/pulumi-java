// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An excluded entity phrase that should not be matched.
 * 
 */
public final class GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs Empty = new GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs();

    /**
     * The word or phrase to be excluded.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The word or phrase to be excluded.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs() {}

    private GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The word or phrase to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The word or phrase to be excluded.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public GoogleCloudDialogflowCxV3EntityTypeExcludedPhraseArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
