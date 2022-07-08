// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow.v2.inputs.GoogleCloudDialogflowV2IntentMessageImageArgs;
import com.pulumi.googlenative.dialogflow.v2.inputs.GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An item in the carousel.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs Empty = new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs();

    /**
     * Optional. The body text of the card.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. The body text of the card.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. The image to display.
     * 
     */
    @Import(name="image")
    private @Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image;

    /**
     * @return Optional. The image to display.
     * 
     */
    public Optional<Output<GoogleCloudDialogflowV2IntentMessageImageArgs>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * Additional info about the option item.
     * 
     */
    @Import(name="info", required=true)
    private Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info;

    /**
     * @return Additional info about the option item.
     * 
     */
    public Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info() {
        return this.info;
    }

    /**
     * Title of the carousel item.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return Title of the carousel item.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs() {}

    private GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs $) {
        this.description = $.description;
        this.image = $.image;
        this.info = $.info;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs();
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs defaults) {
            $ = new GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. The body text of the card.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. The body text of the card.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param image Optional. The image to display.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<GoogleCloudDialogflowV2IntentMessageImageArgs> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Optional. The image to display.
         * 
         * @return builder
         * 
         */
        public Builder image(GoogleCloudDialogflowV2IntentMessageImageArgs image) {
            return image(Output.of(image));
        }

        /**
         * @param info Additional info about the option item.
         * 
         * @return builder
         * 
         */
        public Builder info(Output<GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs> info) {
            $.info = info;
            return this;
        }

        /**
         * @param info Additional info about the option item.
         * 
         * @return builder
         * 
         */
        public Builder info(GoogleCloudDialogflowV2IntentMessageSelectItemInfoArgs info) {
            return info(Output.of(info));
        }

        /**
         * @param title Title of the carousel item.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Title of the carousel item.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public GoogleCloudDialogflowV2IntentMessageCarouselSelectItemArgs build() {
            $.info = Objects.requireNonNull($.info, "expected parameter 'info' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
