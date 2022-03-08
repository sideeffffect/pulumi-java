// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageImageResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse {
    /**
     * Optional. The collection of card buttons.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;
    /**
     * Required, unless image is present. The body text of the card.
     * 
     */
    private final String formattedText;
    /**
     * Optional. The image for the card.
     * 
     */
    private final GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
    /**
     * Optional. The subtitle of the card.
     * 
     */
    private final String subtitle;
    /**
     * Optional. The title of the card.
     * 
     */
    private final String title;

    @OutputCustomType.Constructor({"buttons","formattedText","image","subtitle","title"})
    private GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse(
        List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons,
        String formattedText,
        GoogleCloudDialogflowV2beta1IntentMessageImageResponse image,
        String subtitle,
        String title) {
        this.buttons = buttons;
        this.formattedText = formattedText;
        this.image = image;
        this.subtitle = subtitle;
        this.title = title;
    }

    /**
     * Optional. The collection of card buttons.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> getButtons() {
        return this.buttons;
    }
    /**
     * Required, unless image is present. The body text of the card.
     * 
    */
    public String getFormattedText() {
        return this.formattedText;
    }
    /**
     * Optional. The image for the card.
     * 
    */
    public GoogleCloudDialogflowV2beta1IntentMessageImageResponse getImage() {
        return this.image;
    }
    /**
     * Optional. The subtitle of the card.
     * 
    */
    public String getSubtitle() {
        return this.subtitle;
    }
    /**
     * Optional. The title of the card.
     * 
    */
    public String getTitle() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons;
        private String formattedText;
        private GoogleCloudDialogflowV2beta1IntentMessageImageResponse image;
        private String subtitle;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.formattedText = defaults.formattedText;
    	      this.image = defaults.image;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder setButtons(List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonResponse> buttons) {
            this.buttons = Objects.requireNonNull(buttons);
            return this;
        }

        public Builder setFormattedText(String formattedText) {
            this.formattedText = Objects.requireNonNull(formattedText);
            return this;
        }

        public Builder setImage(GoogleCloudDialogflowV2beta1IntentMessageImageResponse image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setSubtitle(String subtitle) {
            this.subtitle = Objects.requireNonNull(subtitle);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageBasicCardResponse(buttons, formattedText, image, subtitle, title);
        }
    }
}
