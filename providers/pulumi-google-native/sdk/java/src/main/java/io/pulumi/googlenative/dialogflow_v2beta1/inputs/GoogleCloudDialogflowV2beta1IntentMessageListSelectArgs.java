// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The card for presenting a list of options to select from.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs();

    /**
     * List items.
     * 
     */
    @InputImport(name="items", required=true)
      private final Input<List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs>> items;

    public Input<List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs>> getItems() {
        return this.items;
    }

    /**
     * Optional. Subtitle of the list.
     * 
     */
    @InputImport(name="subtitle")
      private final @Nullable Input<String> subtitle;

    public Input<String> getSubtitle() {
        return this.subtitle == null ? Input.empty() : this.subtitle;
    }

    /**
     * Optional. The overall title of the list.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs(
        Input<List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs>> items,
        @Nullable Input<String> subtitle,
        @Nullable Input<String> title) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.subtitle = subtitle;
        this.title = title;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs() {
        this.items = Input.empty();
        this.subtitle = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs>> items;
        private @Nullable Input<String> subtitle;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder items(Input<List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<GoogleCloudDialogflowV2beta1IntentMessageListSelectItemArgs> items) {
            this.items = Input.of(Objects.requireNonNull(items));
            return this;
        }

        public Builder subtitle(@Nullable Input<String> subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder subtitle(@Nullable String subtitle) {
            this.subtitle = Input.ofNullable(subtitle);
            return this;
        }

        public Builder title(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageListSelectArgs(items, subtitle, title);
        }
    }
}
