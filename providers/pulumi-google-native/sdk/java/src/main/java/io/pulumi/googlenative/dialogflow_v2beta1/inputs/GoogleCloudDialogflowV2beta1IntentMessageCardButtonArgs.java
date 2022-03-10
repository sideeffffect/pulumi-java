// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Optional. Contains information about a button.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs();

    /**
     * Optional. The text to send back to the Dialogflow API or a URI to open.
     * 
     */
    @InputImport(name="postback")
      private final @Nullable Input<String> postback;

    public Input<String> getPostback() {
        return this.postback == null ? Input.empty() : this.postback;
    }

    /**
     * Optional. The text to show on the button.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Input<String> text;

    public Input<String> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs(
        @Nullable Input<String> postback,
        @Nullable Input<String> text) {
        this.postback = postback;
        this.text = text;
    }

    private GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs() {
        this.postback = Input.empty();
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> postback;
        private @Nullable Input<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postback = defaults.postback;
    	      this.text = defaults.text;
        }

        public Builder postback(@Nullable Input<String> postback) {
            this.postback = postback;
            return this;
        }

        public Builder postback(@Nullable String postback) {
            this.postback = Input.ofNullable(postback);
            return this;
        }

        public Builder text(@Nullable Input<String> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable String text) {
            this.text = Input.ofNullable(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageCardButtonArgs(postback, text);
        }
    }
}
