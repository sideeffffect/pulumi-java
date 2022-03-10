// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageImageArgs;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Table card for Actions on Google.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs();

    /**
     * Optional. List of buttons for the card.
     * 
     */
    @InputImport(name="buttons")
      private final @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons;

    public Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> getButtons() {
        return this.buttons == null ? Input.empty() : this.buttons;
    }

    /**
     * Optional. Display properties for the columns in this table.
     * 
     */
    @InputImport(name="columnProperties")
      private final @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> columnProperties;

    public Input<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> getColumnProperties() {
        return this.columnProperties == null ? Input.empty() : this.columnProperties;
    }

    /**
     * Optional. Image which should be displayed on the card.
     * 
     */
    @InputImport(name="image")
      private final @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;

    public Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Optional. Rows in this table of data.
     * 
     */
    @InputImport(name="rows")
      private final @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> rows;

    public Input<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> getRows() {
        return this.rows == null ? Input.empty() : this.rows;
    }

    /**
     * Optional. Subtitle to the title.
     * 
     */
    @InputImport(name="subtitle")
      private final @Nullable Input<String> subtitle;

    public Input<String> getSubtitle() {
        return this.subtitle == null ? Input.empty() : this.subtitle;
    }

    /**
     * Title of the card.
     * 
     */
    @InputImport(name="title", required=true)
      private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs(
        @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons,
        @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> columnProperties,
        @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image,
        @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> rows,
        @Nullable Input<String> subtitle,
        Input<String> title) {
        this.buttons = buttons;
        this.columnProperties = columnProperties;
        this.image = image;
        this.rows = rows;
        this.subtitle = subtitle;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs() {
        this.buttons = Input.empty();
        this.columnProperties = Input.empty();
        this.image = Input.empty();
        this.rows = Input.empty();
        this.subtitle = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons;
        private @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> columnProperties;
        private @Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image;
        private @Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> rows;
        private @Nullable Input<String> subtitle;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttons = defaults.buttons;
    	      this.columnProperties = defaults.columnProperties;
    	      this.image = defaults.image;
    	      this.rows = defaults.rows;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder buttons(@Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs>> buttons) {
            this.buttons = buttons;
            return this;
        }

        public Builder buttons(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonArgs> buttons) {
            this.buttons = Input.ofNullable(buttons);
            return this;
        }

        public Builder columnProperties(@Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs>> columnProperties) {
            this.columnProperties = columnProperties;
            return this;
        }

        public Builder columnProperties(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageColumnPropertiesArgs> columnProperties) {
            this.columnProperties = Input.ofNullable(columnProperties);
            return this;
        }

        public Builder image(@Nullable Input<GoogleCloudDialogflowV2beta1IntentMessageImageArgs> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable GoogleCloudDialogflowV2beta1IntentMessageImageArgs image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder rows(@Nullable Input<List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs>> rows) {
            this.rows = rows;
            return this;
        }

        public Builder rows(@Nullable List<GoogleCloudDialogflowV2beta1IntentMessageTableCardRowArgs> rows) {
            this.rows = Input.ofNullable(rows);
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

        public Builder title(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder title(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTableCardArgs(buttons, columnProperties, image, rows, subtitle, title);
        }
    }
}
