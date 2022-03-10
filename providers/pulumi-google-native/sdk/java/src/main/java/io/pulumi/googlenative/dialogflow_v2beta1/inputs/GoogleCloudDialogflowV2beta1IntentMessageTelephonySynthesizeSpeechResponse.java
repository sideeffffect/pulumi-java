// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Synthesizes speech and plays back the synthesized audio to the caller in Telephony Gateway. Telephony Gateway takes the synthesizer settings from `DetectIntentResponse.output_audio_config` which can either be set at request-level or can come from the agent-level synthesizer config.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse Empty = new GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse();

    /**
     * The SSML to be synthesized. For more information, see [SSML](https://developers.google.com/actions/reference/ssml).
     * 
     */
    @InputImport(name="ssml", required=true)
      private final String ssml;

    public String getSsml() {
        return this.ssml;
    }

    /**
     * The raw text to be synthesized.
     * 
     */
    @InputImport(name="text", required=true)
      private final String text;

    public String getText() {
        return this.text;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse(
        String ssml,
        String text) {
        this.ssml = Objects.requireNonNull(ssml, "expected parameter 'ssml' to be non-null");
        this.text = Objects.requireNonNull(text, "expected parameter 'text' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse() {
        this.ssml = null;
        this.text = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ssml;
        private String text;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ssml = defaults.ssml;
    	      this.text = defaults.text;
        }

        public Builder ssml(String ssml) {
            this.ssml = Objects.requireNonNull(ssml);
            return this;
        }

        public Builder text(String text) {
            this.text = Objects.requireNonNull(text);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechResponse(ssml, text);
        }
    }
}
