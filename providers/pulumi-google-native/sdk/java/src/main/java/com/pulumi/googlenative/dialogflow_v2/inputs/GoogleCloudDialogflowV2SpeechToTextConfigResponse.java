// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configures speech transcription for ConversationProfile.
 * 
 */
public final class GoogleCloudDialogflowV2SpeechToTextConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2SpeechToTextConfigResponse Empty = new GoogleCloudDialogflowV2SpeechToTextConfigResponse();

    /**
     * The speech model used in speech to text. `SPEECH_MODEL_VARIANT_UNSPECIFIED`, `USE_BEST_AVAILABLE` will be treated as `USE_ENHANCED`. It can be overridden in AnalyzeContentRequest and StreamingAnalyzeContentRequest request. If enhanced model variant is specified and an enhanced version of the specified model for the language does not exist, then it would emit an error.
     * 
     */
    @Import(name="speechModelVariant", required=true)
      private final String speechModelVariant;

    public String speechModelVariant() {
        return this.speechModelVariant;
    }

    public GoogleCloudDialogflowV2SpeechToTextConfigResponse(String speechModelVariant) {
        this.speechModelVariant = Objects.requireNonNull(speechModelVariant, "expected parameter 'speechModelVariant' to be non-null");
    }

    private GoogleCloudDialogflowV2SpeechToTextConfigResponse() {
        this.speechModelVariant = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2SpeechToTextConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String speechModelVariant;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2SpeechToTextConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.speechModelVariant = defaults.speechModelVariant;
        }

        public Builder speechModelVariant(String speechModelVariant) {
            this.speechModelVariant = Objects.requireNonNull(speechModelVariant);
            return this;
        }        public GoogleCloudDialogflowV2SpeechToTextConfigResponse build() {
            return new GoogleCloudDialogflowV2SpeechToTextConfigResponse(speechModelVariant);
        }
    }
}
