// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow.v3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowCxV3IntentInputResponse {
    /**
     * @return The unique identifier of the intent. Format: `projects//locations//agents//intents/`.
     * 
     */
    private final String intent;

    @CustomType.Constructor
    private GoogleCloudDialogflowCxV3IntentInputResponse(@CustomType.Parameter("intent") String intent) {
        this.intent = intent;
    }

    /**
     * @return The unique identifier of the intent. Format: `projects//locations//agents//intents/`.
     * 
     */
    public String intent() {
        return this.intent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3IntentInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String intent;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3IntentInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intent = defaults.intent;
        }

        public Builder intent(String intent) {
            this.intent = Objects.requireNonNull(intent);
            return this;
        }        public GoogleCloudDialogflowCxV3IntentInputResponse build() {
            return new GoogleCloudDialogflowCxV3IntentInputResponse(intent);
        }
    }
}
