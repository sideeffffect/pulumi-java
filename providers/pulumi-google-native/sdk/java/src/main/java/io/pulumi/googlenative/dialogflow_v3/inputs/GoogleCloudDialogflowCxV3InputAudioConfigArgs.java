// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.enums.GoogleCloudDialogflowCxV3InputAudioConfigAudioEncoding;
import io.pulumi.googlenative.dialogflow_v3.enums.GoogleCloudDialogflowCxV3InputAudioConfigModelVariant;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Instructs the speech recognizer on how to process the audio content.
 * 
 */
public final class GoogleCloudDialogflowCxV3InputAudioConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3InputAudioConfigArgs Empty = new GoogleCloudDialogflowCxV3InputAudioConfigArgs();

    /**
     * Audio encoding of the audio content to process.
     * 
     */
    @InputImport(name="audioEncoding", required=true)
      private final Input<GoogleCloudDialogflowCxV3InputAudioConfigAudioEncoding> audioEncoding;

    public Input<GoogleCloudDialogflowCxV3InputAudioConfigAudioEncoding> getAudioEncoding() {
        return this.audioEncoding;
    }

    /**
     * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or unspecified, Speech doesn't return any word-level information.
     * 
     */
    @InputImport(name="enableWordInfo")
      private final @Nullable Input<Boolean> enableWordInfo;

    public Input<Boolean> getEnableWordInfo() {
        return this.enableWordInfo == null ? Input.empty() : this.enableWordInfo;
    }

    /**
     * Optional. Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we auto-select a model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the language does not exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
     * 
     */
    @InputImport(name="model")
      private final @Nullable Input<String> model;

    public Input<String> getModel() {
        return this.model == null ? Input.empty() : this.model;
    }

    /**
     * Optional. Which variant of the Speech model to use.
     * 
     */
    @InputImport(name="modelVariant")
      private final @Nullable Input<GoogleCloudDialogflowCxV3InputAudioConfigModelVariant> modelVariant;

    public Input<GoogleCloudDialogflowCxV3InputAudioConfigModelVariant> getModelVariant() {
        return this.modelVariant == null ? Input.empty() : this.modelVariant;
    }

    /**
     * Optional. A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details.
     * 
     */
    @InputImport(name="phraseHints")
      private final @Nullable Input<List<String>> phraseHints;

    public Input<List<String>> getPhraseHints() {
        return this.phraseHints == null ? Input.empty() : this.phraseHints;
    }

    /**
     * Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details.
     * 
     */
    @InputImport(name="sampleRateHertz")
      private final @Nullable Input<Integer> sampleRateHertz;

    public Input<Integer> getSampleRateHertz() {
        return this.sampleRateHertz == null ? Input.empty() : this.sampleRateHertz;
    }

    /**
     * Optional. If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio. Recognition ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new request with a new stream as needed. Note: This setting is relevant only for streaming methods.
     * 
     */
    @InputImport(name="singleUtterance")
      private final @Nullable Input<Boolean> singleUtterance;

    public Input<Boolean> getSingleUtterance() {
        return this.singleUtterance == null ? Input.empty() : this.singleUtterance;
    }

    public GoogleCloudDialogflowCxV3InputAudioConfigArgs(
        Input<GoogleCloudDialogflowCxV3InputAudioConfigAudioEncoding> audioEncoding,
        @Nullable Input<Boolean> enableWordInfo,
        @Nullable Input<String> model,
        @Nullable Input<GoogleCloudDialogflowCxV3InputAudioConfigModelVariant> modelVariant,
        @Nullable Input<List<String>> phraseHints,
        @Nullable Input<Integer> sampleRateHertz,
        @Nullable Input<Boolean> singleUtterance) {
        this.audioEncoding = Objects.requireNonNull(audioEncoding, "expected parameter 'audioEncoding' to be non-null");
        this.enableWordInfo = enableWordInfo;
        this.model = model;
        this.modelVariant = modelVariant;
        this.phraseHints = phraseHints;
        this.sampleRateHertz = sampleRateHertz;
        this.singleUtterance = singleUtterance;
    }

    private GoogleCloudDialogflowCxV3InputAudioConfigArgs() {
        this.audioEncoding = Input.empty();
        this.enableWordInfo = Input.empty();
        this.model = Input.empty();
        this.modelVariant = Input.empty();
        this.phraseHints = Input.empty();
        this.sampleRateHertz = Input.empty();
        this.singleUtterance = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3InputAudioConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<GoogleCloudDialogflowCxV3InputAudioConfigAudioEncoding> audioEncoding;
        private @Nullable Input<Boolean> enableWordInfo;
        private @Nullable Input<String> model;
        private @Nullable Input<GoogleCloudDialogflowCxV3InputAudioConfigModelVariant> modelVariant;
        private @Nullable Input<List<String>> phraseHints;
        private @Nullable Input<Integer> sampleRateHertz;
        private @Nullable Input<Boolean> singleUtterance;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3InputAudioConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioEncoding = defaults.audioEncoding;
    	      this.enableWordInfo = defaults.enableWordInfo;
    	      this.model = defaults.model;
    	      this.modelVariant = defaults.modelVariant;
    	      this.phraseHints = defaults.phraseHints;
    	      this.sampleRateHertz = defaults.sampleRateHertz;
    	      this.singleUtterance = defaults.singleUtterance;
        }

        public Builder audioEncoding(Input<GoogleCloudDialogflowCxV3InputAudioConfigAudioEncoding> audioEncoding) {
            this.audioEncoding = Objects.requireNonNull(audioEncoding);
            return this;
        }

        public Builder audioEncoding(GoogleCloudDialogflowCxV3InputAudioConfigAudioEncoding audioEncoding) {
            this.audioEncoding = Input.of(Objects.requireNonNull(audioEncoding));
            return this;
        }

        public Builder enableWordInfo(@Nullable Input<Boolean> enableWordInfo) {
            this.enableWordInfo = enableWordInfo;
            return this;
        }

        public Builder enableWordInfo(@Nullable Boolean enableWordInfo) {
            this.enableWordInfo = Input.ofNullable(enableWordInfo);
            return this;
        }

        public Builder model(@Nullable Input<String> model) {
            this.model = model;
            return this;
        }

        public Builder model(@Nullable String model) {
            this.model = Input.ofNullable(model);
            return this;
        }

        public Builder modelVariant(@Nullable Input<GoogleCloudDialogflowCxV3InputAudioConfigModelVariant> modelVariant) {
            this.modelVariant = modelVariant;
            return this;
        }

        public Builder modelVariant(@Nullable GoogleCloudDialogflowCxV3InputAudioConfigModelVariant modelVariant) {
            this.modelVariant = Input.ofNullable(modelVariant);
            return this;
        }

        public Builder phraseHints(@Nullable Input<List<String>> phraseHints) {
            this.phraseHints = phraseHints;
            return this;
        }

        public Builder phraseHints(@Nullable List<String> phraseHints) {
            this.phraseHints = Input.ofNullable(phraseHints);
            return this;
        }

        public Builder sampleRateHertz(@Nullable Input<Integer> sampleRateHertz) {
            this.sampleRateHertz = sampleRateHertz;
            return this;
        }

        public Builder sampleRateHertz(@Nullable Integer sampleRateHertz) {
            this.sampleRateHertz = Input.ofNullable(sampleRateHertz);
            return this;
        }

        public Builder singleUtterance(@Nullable Input<Boolean> singleUtterance) {
            this.singleUtterance = singleUtterance;
            return this;
        }

        public Builder singleUtterance(@Nullable Boolean singleUtterance) {
            this.singleUtterance = Input.ofNullable(singleUtterance);
            return this;
        }
        public GoogleCloudDialogflowCxV3InputAudioConfigArgs build() {
            return new GoogleCloudDialogflowCxV3InputAudioConfigArgs(audioEncoding, enableWordInfo, model, modelVariant, phraseHints, sampleRateHertz, singleUtterance);
        }
    }
}
