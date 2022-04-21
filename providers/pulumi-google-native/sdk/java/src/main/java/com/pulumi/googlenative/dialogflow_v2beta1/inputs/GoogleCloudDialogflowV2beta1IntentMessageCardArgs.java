// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The card response message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageCardArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageCardArgs();

    /**
     * Optional. The collection of card buttons.
     * 
     */
    @Import(name="buttons")
    private @Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs>> buttons;

    public Optional<Output<List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs>>> buttons() {
        return Optional.ofNullable(this.buttons);
    }

    /**
     * Optional. The public URI to an image file for the card.
     * 
     */
    @Import(name="imageUri")
    private @Nullable Output<String> imageUri;

    public Optional<Output<String>> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }

    /**
     * Optional. The subtitle of the card.
     * 
     */
    @Import(name="subtitle")
    private @Nullable Output<String> subtitle;

    public Optional<Output<String>> subtitle() {
        return Optional.ofNullable(this.subtitle);
    }

    /**
     * Optional. The title of the card.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private GoogleCloudDialogflowV2beta1IntentMessageCardArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageCardArgs(GoogleCloudDialogflowV2beta1IntentMessageCardArgs $) {
        this.buttons = $.buttons;
        this.imageUri = $.imageUri;
        this.subtitle = $.subtitle;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageCardArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageCardArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCardArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageCardArgs(Objects.requireNonNull(defaults));
        }

        public Builder buttons(@Nullable Output<List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs>> buttons) {
            $.buttons = buttons;
            return this;
        }

        public Builder buttons(List<GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs> buttons) {
            return buttons(Output.of(buttons));
        }

        public Builder buttons(GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs... buttons) {
            return buttons(List.of(buttons));
        }

        public Builder imageUri(@Nullable Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        public Builder subtitle(@Nullable Output<String> subtitle) {
            $.subtitle = subtitle;
            return this;
        }

        public Builder subtitle(String subtitle) {
            return subtitle(Output.of(subtitle));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageCardArgs build() {
            return $;
        }
    }

}
