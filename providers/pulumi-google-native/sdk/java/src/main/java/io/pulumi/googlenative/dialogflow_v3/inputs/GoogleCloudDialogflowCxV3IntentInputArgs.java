// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the intent to trigger programmatically rather than as a result of natural language processing.
 * 
 */
public final class GoogleCloudDialogflowCxV3IntentInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3IntentInputArgs Empty = new GoogleCloudDialogflowCxV3IntentInputArgs();

    /**
     * The unique identifier of the intent. Format: `projects//locations//agents//intents/`.
     * 
     */
    @InputImport(name="intent", required=true)
      private final Input<String> intent;

    public Input<String> getIntent() {
        return this.intent;
    }

    public GoogleCloudDialogflowCxV3IntentInputArgs(Input<String> intent) {
        this.intent = Objects.requireNonNull(intent, "expected parameter 'intent' to be non-null");
    }

    private GoogleCloudDialogflowCxV3IntentInputArgs() {
        this.intent = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> intent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3IntentInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intent = defaults.intent;
        }

        public Builder intent(Input<String> intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }

        public Builder intent(String intent) {
            this.intent = Input.of(Objects.requireNonNull(intent));
            return this;
        }
        public GoogleCloudDialogflowCxV3IntentInputArgs build() {
            return new GoogleCloudDialogflowCxV3IntentInputArgs(intent);
        }
    }
}
