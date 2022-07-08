// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import com.pulumi.googlenative.dialogflow.v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse {
    /**
     * @return Optional. The body text of the card.
     * 
     */
    private final String description;
    /**
     * @return Optional. The image to display.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
    /**
     * @return Additional info about the option item.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info;
    /**
     * @return Title of the carousel item.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("image") GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        @CustomType.Parameter("info") GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info,
        @CustomType.Parameter("title") String title) {
        this.description = description;
        this.image = image;
        this.info = info;
        this.title = title;
    }

    /**
     * @return Optional. The body text of the card.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Optional. The image to display.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse image() {
        return this.image;
    }
    /**
     * @return Additional info about the option item.
     * 
     */
    public GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info() {
        return this.info;
    }
    /**
     * @return Title of the carousel item.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.image = defaults.image;
    	      this.info = defaults.info;
    	      this.title = defaults.title;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder image(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder info(GoogleCloudDialogflowV2beta1IntentMessageSelectItemInfoResponse info) {
            this.info = Objects.requireNonNull(info);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse(description, image, info, title);
        }
    }
}
