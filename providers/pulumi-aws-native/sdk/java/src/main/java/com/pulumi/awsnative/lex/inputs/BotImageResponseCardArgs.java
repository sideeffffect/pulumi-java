// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotButtonArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A message that defines a response card that the client application can show to the user.
 * 
 */
public final class BotImageResponseCardArgs extends ResourceArgs {

    public static final BotImageResponseCardArgs Empty = new BotImageResponseCardArgs();

    /**
     * A list of buttons that should be displayed on the response card.
     * 
     */
    @Import(name="buttons")
    private @Nullable Output<List<BotButtonArgs>> buttons;

    /**
     * @return A list of buttons that should be displayed on the response card.
     * 
     */
    public Optional<Output<List<BotButtonArgs>>> buttons() {
        return Optional.ofNullable(this.buttons);
    }

    /**
     * The URL of an image to display on the response card.
     * 
     */
    @Import(name="imageUrl")
    private @Nullable Output<String> imageUrl;

    /**
     * @return The URL of an image to display on the response card.
     * 
     */
    public Optional<Output<String>> imageUrl() {
        return Optional.ofNullable(this.imageUrl);
    }

    /**
     * The subtitle to display on the response card.
     * 
     */
    @Import(name="subtitle")
    private @Nullable Output<String> subtitle;

    /**
     * @return The subtitle to display on the response card.
     * 
     */
    public Optional<Output<String>> subtitle() {
        return Optional.ofNullable(this.subtitle);
    }

    /**
     * The title to display on the response card.
     * 
     */
    @Import(name="title", required=true)
    private Output<String> title;

    /**
     * @return The title to display on the response card.
     * 
     */
    public Output<String> title() {
        return this.title;
    }

    private BotImageResponseCardArgs() {}

    private BotImageResponseCardArgs(BotImageResponseCardArgs $) {
        this.buttons = $.buttons;
        this.imageUrl = $.imageUrl;
        this.subtitle = $.subtitle;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotImageResponseCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotImageResponseCardArgs $;

        public Builder() {
            $ = new BotImageResponseCardArgs();
        }

        public Builder(BotImageResponseCardArgs defaults) {
            $ = new BotImageResponseCardArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buttons A list of buttons that should be displayed on the response card.
         * 
         * @return builder
         * 
         */
        public Builder buttons(@Nullable Output<List<BotButtonArgs>> buttons) {
            $.buttons = buttons;
            return this;
        }

        /**
         * @param buttons A list of buttons that should be displayed on the response card.
         * 
         * @return builder
         * 
         */
        public Builder buttons(List<BotButtonArgs> buttons) {
            return buttons(Output.of(buttons));
        }

        /**
         * @param buttons A list of buttons that should be displayed on the response card.
         * 
         * @return builder
         * 
         */
        public Builder buttons(BotButtonArgs... buttons) {
            return buttons(List.of(buttons));
        }

        /**
         * @param imageUrl The URL of an image to display on the response card.
         * 
         * @return builder
         * 
         */
        public Builder imageUrl(@Nullable Output<String> imageUrl) {
            $.imageUrl = imageUrl;
            return this;
        }

        /**
         * @param imageUrl The URL of an image to display on the response card.
         * 
         * @return builder
         * 
         */
        public Builder imageUrl(String imageUrl) {
            return imageUrl(Output.of(imageUrl));
        }

        /**
         * @param subtitle The subtitle to display on the response card.
         * 
         * @return builder
         * 
         */
        public Builder subtitle(@Nullable Output<String> subtitle) {
            $.subtitle = subtitle;
            return this;
        }

        /**
         * @param subtitle The subtitle to display on the response card.
         * 
         * @return builder
         * 
         */
        public Builder subtitle(String subtitle) {
            return subtitle(Output.of(subtitle));
        }

        /**
         * @param title The title to display on the response card.
         * 
         * @return builder
         * 
         */
        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title The title to display on the response card.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public BotImageResponseCardArgs build() {
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
