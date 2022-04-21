// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs;
import java.lang.String;
import java.util.Objects;


/**
 * The button object that appears at the bottom of a card.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs Empty = new GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs();

    /**
     * Action to take when a user taps on the button.
     * 
     */
    @Import(name="openUriAction", required=true)
    private Output<GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs> openUriAction;

    public Output<GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs> openUriAction() {
        return this.openUriAction;
    }

    /**
     * The title of the button.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    public Output<String> title() {
        return this.title;
    }

    private GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs() {}

    private GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs(GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs $) {
        this.openUriAction = $.openUriAction;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs(Objects.requireNonNull(defaults));
        }

        public Builder openUriAction(Output<GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs> openUriAction) {
            $.openUriAction = openUriAction;
            return this;
        }

        public Builder openUriAction(GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriActionArgs openUriAction) {
            return openUriAction(Output.of(openUriAction));
        }

        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public GoogleCloudDialogflowV2IntentMessageBasicCardButtonArgs build() {
            $.openUriAction = Objects.requireNonNull($.openUriAction, "expected parameter 'openUriAction' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
