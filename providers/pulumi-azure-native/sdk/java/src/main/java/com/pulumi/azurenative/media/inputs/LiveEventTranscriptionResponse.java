// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.LiveEventInputTrackSelectionResponse;
import com.pulumi.azurenative.media.inputs.LiveEventOutputTranscriptionTrackResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the transcription tracks in the output of a live event, generated using speech-to-text transcription. This property is reserved for future use, any value set on this property will be ignored.
 * 
 */
public final class LiveEventTranscriptionResponse extends com.pulumi.resources.InvokeArgs {

    public static final LiveEventTranscriptionResponse Empty = new LiveEventTranscriptionResponse();

    /**
     * Provides a mechanism to select the audio track in the input live feed, to which speech-to-text transcription is applied. This property is reserved for future use, any value set on this property will be ignored.
     * 
     */
    @Import(name="inputTrackSelection")
      private final @Nullable List<LiveEventInputTrackSelectionResponse> inputTrackSelection;

    public List<LiveEventInputTrackSelectionResponse> inputTrackSelection() {
        return this.inputTrackSelection == null ? List.of() : this.inputTrackSelection;
    }

    /**
     * Specifies the language (locale) to be used for speech-to-text transcription – it should match the spoken language in the audio track. The value should be in BCP-47 format (e.g: 'en-US'). See https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature and the list of supported languages.
     * 
     */
    @Import(name="language")
      private final @Nullable String language;

    public Optional<String> language() {
        return this.language == null ? Optional.empty() : Optional.ofNullable(this.language);
    }

    /**
     * Describes a transcription track in the output of a live event, generated using speech-to-text transcription. This property is reserved for future use, any value set on this property will be ignored.
     * 
     */
    @Import(name="outputTranscriptionTrack")
      private final @Nullable LiveEventOutputTranscriptionTrackResponse outputTranscriptionTrack;

    public Optional<LiveEventOutputTranscriptionTrackResponse> outputTranscriptionTrack() {
        return this.outputTranscriptionTrack == null ? Optional.empty() : Optional.ofNullable(this.outputTranscriptionTrack);
    }

    public LiveEventTranscriptionResponse(
        @Nullable List<LiveEventInputTrackSelectionResponse> inputTrackSelection,
        @Nullable String language,
        @Nullable LiveEventOutputTranscriptionTrackResponse outputTranscriptionTrack) {
        this.inputTrackSelection = inputTrackSelection;
        this.language = language;
        this.outputTranscriptionTrack = outputTranscriptionTrack;
    }

    private LiveEventTranscriptionResponse() {
        this.inputTrackSelection = List.of();
        this.language = null;
        this.outputTranscriptionTrack = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiveEventTranscriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LiveEventInputTrackSelectionResponse> inputTrackSelection;
        private @Nullable String language;
        private @Nullable LiveEventOutputTranscriptionTrackResponse outputTranscriptionTrack;

        public Builder() {
    	      // Empty
        }

        public Builder(LiveEventTranscriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputTrackSelection = defaults.inputTrackSelection;
    	      this.language = defaults.language;
    	      this.outputTranscriptionTrack = defaults.outputTranscriptionTrack;
        }

        public Builder inputTrackSelection(@Nullable List<LiveEventInputTrackSelectionResponse> inputTrackSelection) {
            this.inputTrackSelection = inputTrackSelection;
            return this;
        }
        public Builder inputTrackSelection(LiveEventInputTrackSelectionResponse... inputTrackSelection) {
            return inputTrackSelection(List.of(inputTrackSelection));
        }
        public Builder language(@Nullable String language) {
            this.language = language;
            return this;
        }
        public Builder outputTranscriptionTrack(@Nullable LiveEventOutputTranscriptionTrackResponse outputTranscriptionTrack) {
            this.outputTranscriptionTrack = outputTranscriptionTrack;
            return this;
        }        public LiveEventTranscriptionResponse build() {
            return new LiveEventTranscriptionResponse(inputTrackSelection, language, outputTranscriptionTrack);
        }
    }
}
