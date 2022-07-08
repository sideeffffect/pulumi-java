// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The text response message.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageTextArgs Empty = new GoogleCloudDialogflowCxV3ResponseMessageTextArgs();

    /**
     * A collection of text responses.
     * 
     */
    @Import(name="text", required=true)
    private Output<List<String>> text;

    /**
     * @return A collection of text responses.
     * 
     */
    public Output<List<String>> text() {
        return this.text;
    }

    private GoogleCloudDialogflowCxV3ResponseMessageTextArgs() {}

    private GoogleCloudDialogflowCxV3ResponseMessageTextArgs(GoogleCloudDialogflowCxV3ResponseMessageTextArgs $) {
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ResponseMessageTextArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3ResponseMessageTextArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageTextArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3ResponseMessageTextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param text A collection of text responses.
         * 
         * @return builder
         * 
         */
        public Builder text(Output<List<String>> text) {
            $.text = text;
            return this;
        }

        /**
         * @param text A collection of text responses.
         * 
         * @return builder
         * 
         */
        public Builder text(List<String> text) {
            return text(Output.of(text));
        }

        /**
         * @param text A collection of text responses.
         * 
         * @return builder
         * 
         */
        public Builder text(String... text) {
            return text(List.of(text));
        }

        public GoogleCloudDialogflowCxV3ResponseMessageTextArgs build() {
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
