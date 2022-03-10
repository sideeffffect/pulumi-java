// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AudioOverlayResponse {
    /**
     * The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     * 
     */
    private final @Nullable Double audioGainLevel;
    /**
     * The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
     * 
     */
    private final @Nullable String end;
    /**
     * The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     * 
     */
    private final @Nullable String fadeInDuration;
    /**
     * The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     * 
     */
    private final @Nullable String fadeOutDuration;
    /**
     * The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     * 
     */
    private final String inputLabel;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AudioOverlay'.
     * 
     */
    private final String odataType;
    /**
     * The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
     * 
     */
    private final @Nullable String start;

    @OutputCustomType.Constructor
    private AudioOverlayResponse(
        @OutputCustomType.Parameter("audioGainLevel") @Nullable Double audioGainLevel,
        @OutputCustomType.Parameter("end") @Nullable String end,
        @OutputCustomType.Parameter("fadeInDuration") @Nullable String fadeInDuration,
        @OutputCustomType.Parameter("fadeOutDuration") @Nullable String fadeOutDuration,
        @OutputCustomType.Parameter("inputLabel") String inputLabel,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("start") @Nullable String start) {
        this.audioGainLevel = audioGainLevel;
        this.end = end;
        this.fadeInDuration = fadeInDuration;
        this.fadeOutDuration = fadeOutDuration;
        this.inputLabel = inputLabel;
        this.odataType = odataType;
        this.start = start;
    }

    /**
     * The gain level of audio in the overlay. The value should be in the range [0, 1.0]. The default is 1.0.
     * 
    */
    public Optional<Double> getAudioGainLevel() {
        return Optional.ofNullable(this.audioGainLevel);
    }
    /**
     * The end position, with reference to the input video, at which the overlay ends. The value should be in ISO 8601 format. For example, PT30S to end the overlay at 30 seconds into the input video. If not specified or the value is greater than the input video duration, the overlay will be applied until the end of the input video if the overlay media duration is greater than the input video duration, else the overlay will last as long as the overlay media duration.
     * 
    */
    public Optional<String> getEnd() {
        return Optional.ofNullable(this.end);
    }
    /**
     * The duration over which the overlay fades in onto the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade in (same as PT0S).
     * 
    */
    public Optional<String> getFadeInDuration() {
        return Optional.ofNullable(this.fadeInDuration);
    }
    /**
     * The duration over which the overlay fades out of the input video. The value should be in ISO 8601 duration format. If not specified the default behavior is to have no fade out (same as PT0S).
     * 
    */
    public Optional<String> getFadeOutDuration() {
        return Optional.ofNullable(this.fadeOutDuration);
    }
    /**
     * The label of the job input which is to be used as an overlay. The Input must specify exactly one file. You can specify an image file in JPG, PNG, GIF or BMP format, or an audio file (such as a WAV, MP3, WMA or M4A file), or a video file. See https://aka.ms/mesformats for the complete list of supported audio and video file formats.
     * 
    */
    public String getInputLabel() {
        return this.inputLabel;
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.AudioOverlay'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The start position, with reference to the input video, at which the overlay starts. The value should be in ISO 8601 format. For example, PT05S to start the overlay at 5 seconds into the input video. If not specified the overlay starts from the beginning of the input video.
     * 
    */
    public Optional<String> getStart() {
        return Optional.ofNullable(this.start);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AudioOverlayResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double audioGainLevel;
        private @Nullable String end;
        private @Nullable String fadeInDuration;
        private @Nullable String fadeOutDuration;
        private String inputLabel;
        private String odataType;
        private @Nullable String start;

        public Builder() {
    	      // Empty
        }

        public Builder(AudioOverlayResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioGainLevel = defaults.audioGainLevel;
    	      this.end = defaults.end;
    	      this.fadeInDuration = defaults.fadeInDuration;
    	      this.fadeOutDuration = defaults.fadeOutDuration;
    	      this.inputLabel = defaults.inputLabel;
    	      this.odataType = defaults.odataType;
    	      this.start = defaults.start;
        }

        public Builder audioGainLevel(@Nullable Double audioGainLevel) {
            this.audioGainLevel = audioGainLevel;
            return this;
        }

        public Builder end(@Nullable String end) {
            this.end = end;
            return this;
        }

        public Builder fadeInDuration(@Nullable String fadeInDuration) {
            this.fadeInDuration = fadeInDuration;
            return this;
        }

        public Builder fadeOutDuration(@Nullable String fadeOutDuration) {
            this.fadeOutDuration = fadeOutDuration;
            return this;
        }

        public Builder inputLabel(String inputLabel) {
            this.inputLabel = Objects.requireNonNull(inputLabel);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder start(@Nullable String start) {
            this.start = start;
            return this;
        }
        public AudioOverlayResponse build() {
            return new AudioOverlayResponse(audioGainLevel, end, fadeInDuration, fadeOutDuration, inputLabel, odataType, start);
        }
    }
}
