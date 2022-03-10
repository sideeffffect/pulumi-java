// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Browse Carousel Card for Actions on Google. https://developers.google.com/actions/assistant/responses#browsing_carousel
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse();

    /**
     * Optional. Settings for displaying the image. Applies to every image in items.
     * 
     */
    @InputImport(name="imageDisplayOptions", required=true)
      private final String imageDisplayOptions;

    public String getImageDisplayOptions() {
        return this.imageDisplayOptions;
    }

    /**
     * List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
     * 
     */
    @InputImport(name="items", required=true)
      private final List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items;

    public List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> getItems() {
        return this.items;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse(
        String imageDisplayOptions,
        List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items) {
        this.imageDisplayOptions = Objects.requireNonNull(imageDisplayOptions, "expected parameter 'imageDisplayOptions' to be non-null");
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse() {
        this.imageDisplayOptions = null;
        this.items = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageDisplayOptions;
        private List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageDisplayOptions = defaults.imageDisplayOptions;
    	      this.items = defaults.items;
        }

        public Builder imageDisplayOptions(String imageDisplayOptions) {
            this.imageDisplayOptions = Objects.requireNonNull(imageDisplayOptions);
            return this;
        }

        public Builder items(List<GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardBrowseCarouselCardItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBrowseCarouselCardResponse(imageDisplayOptions, items);
        }
    }
}
