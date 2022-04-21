// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The suggestion chip message that allows the user to jump out to the app or website associated with this agent.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs();

    /**
     * The name of the app or site this chip is linking to.
     * 
     */
    @Import(name="destinationName", required=true)
    private Output<String> destinationName;

    public Output<String> destinationName() {
        return this.destinationName;
    }

    /**
     * The URI of the app or site to open when the user taps the suggestion chip.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs $) {
        this.destinationName = $.destinationName;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationName(Output<String> destinationName) {
            $.destinationName = destinationName;
            return this;
        }

        public Builder destinationName(String destinationName) {
            return destinationName(Output.of(destinationName));
        }

        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs build() {
            $.destinationName = Objects.requireNonNull($.destinationName, "expected parameter 'destinationName' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
