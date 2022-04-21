// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Instructs the speech synthesizer on how to generate the output audio content.
 * 
 */
public final class GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse Empty = new GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse();

    /**
     * Optional. Indicates whether text to speech is enabled. Even when this field is false, other settings in this proto are still retained.
     * 
     */
    @Import(name="enableTextToSpeech", required=true)
    private Boolean enableTextToSpeech;

    public Boolean enableTextToSpeech() {
        return this.enableTextToSpeech;
    }

    /**
     * Audio encoding of the synthesized audio content.
     * 
     */
    @Import(name="outputAudioEncoding", required=true)
    private String outputAudioEncoding;

    public String outputAudioEncoding() {
        return this.outputAudioEncoding;
    }

    /**
     * Optional. The synthesis sample rate (in hertz) for this audio. If not provided, then the synthesizer will use the default sample rate based on the audio encoding. If this is different from the voice&#39;s natural sample rate, then the synthesizer will honor this request by converting to the desired sample rate (which might result in worse audio quality).
     * 
     */
    @Import(name="sampleRateHertz", required=true)
    private Integer sampleRateHertz;

    public Integer sampleRateHertz() {
        return this.sampleRateHertz;
    }

    /**
     * Optional. Configuration of how speech should be synthesized, mapping from language (https://cloud.google.com/dialogflow/docs/reference/language) to SynthesizeSpeechConfig.
     * 
     */
    @Import(name="synthesizeSpeechConfigs", required=true)
    private Map<String,String> synthesizeSpeechConfigs;

    public Map<String,String> synthesizeSpeechConfigs() {
        return this.synthesizeSpeechConfigs;
    }

    private GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse() {}

    private GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse(GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse $) {
        this.enableTextToSpeech = $.enableTextToSpeech;
        this.outputAudioEncoding = $.outputAudioEncoding;
        this.sampleRateHertz = $.sampleRateHertz;
        this.synthesizeSpeechConfigs = $.synthesizeSpeechConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse();
        }

        public Builder(GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse defaults) {
            $ = new GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder enableTextToSpeech(Boolean enableTextToSpeech) {
            $.enableTextToSpeech = enableTextToSpeech;
            return this;
        }

        public Builder outputAudioEncoding(String outputAudioEncoding) {
            $.outputAudioEncoding = outputAudioEncoding;
            return this;
        }

        public Builder sampleRateHertz(Integer sampleRateHertz) {
            $.sampleRateHertz = sampleRateHertz;
            return this;
        }

        public Builder synthesizeSpeechConfigs(Map<String,String> synthesizeSpeechConfigs) {
            $.synthesizeSpeechConfigs = synthesizeSpeechConfigs;
            return this;
        }

        public GoogleCloudDialogflowV2beta1TextToSpeechSettingsResponse build() {
            $.enableTextToSpeech = Objects.requireNonNull($.enableTextToSpeech, "expected parameter 'enableTextToSpeech' to be non-null");
            $.outputAudioEncoding = Objects.requireNonNull($.outputAudioEncoding, "expected parameter 'outputAudioEncoding' to be non-null");
            $.sampleRateHertz = Objects.requireNonNull($.sampleRateHertz, "expected parameter 'sampleRateHertz' to be non-null");
            $.synthesizeSpeechConfigs = Objects.requireNonNull($.synthesizeSpeechConfigs, "expected parameter 'synthesizeSpeechConfigs' to be non-null");
            return $;
        }
    }

}
