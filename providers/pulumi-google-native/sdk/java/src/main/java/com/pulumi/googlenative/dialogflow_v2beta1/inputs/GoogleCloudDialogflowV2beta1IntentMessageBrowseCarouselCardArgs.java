// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardImageDisplayOptions;
import com.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Browse Carousel Card for Actions on Google. https://developers.google.com/actions/assistant/responses#browsing_carousel
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs();

    /**
     * Optional. Settings for displaying the image. Applies to every image in items.
     * 
     */
    @Import(name="imageDisplayOptions")
    private @Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardImageDisplayOptions> imageDisplayOptions;

    public Optional<Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardImageDisplayOptions>> imageDisplayOptions() {
        return Optional.ofNullable(this.imageDisplayOptions);
    }

    /**
     * List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
     * 
     */
    @Import(name="items", required=true)
    private Output<List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs>> items;

    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs>> items() {
        return this.items;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs() {}

    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs $) {
        this.imageDisplayOptions = $.imageDisplayOptions;
        this.items = $.items;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs();
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs defaults) {
            $ = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs(Objects.requireNonNull(defaults));
        }

        public Builder imageDisplayOptions(@Nullable Output<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardImageDisplayOptions> imageDisplayOptions) {
            $.imageDisplayOptions = imageDisplayOptions;
            return this;
        }

        public Builder imageDisplayOptions(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardImageDisplayOptions imageDisplayOptions) {
            return imageDisplayOptions(Output.of(imageDisplayOptions));
        }

        public Builder items(Output<List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs>> items) {
            $.items = items;
            return this;
        }

        public Builder items(List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs> items) {
            return items(Output.of(items));
        }

        public Builder items(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemArgs... items) {
            return items(List.of(items));
        }

        public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardArgs build() {
            $.items = Objects.requireNonNull($.items, "expected parameter 'items' to be non-null");
            return $;
        }
    }

}
