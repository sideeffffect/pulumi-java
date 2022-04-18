// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.azurenative.videoanalyzer.outputs.AudioEncoderAacResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.VideoEncoderH264Response;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncoderCustomPresetResponse {
    /**
     * Describes a custom preset for encoding audio.
     * 
     */
    private final @Nullable AudioEncoderAacResponse audioEncoder;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderCustomPreset'.
     * 
     */
    private final String type;
    /**
     * Describes a custom preset for encoding video.
     * 
     */
    private final @Nullable VideoEncoderH264Response videoEncoder;

    @CustomType.Constructor
    private EncoderCustomPresetResponse(
        @CustomType.Parameter("audioEncoder") @Nullable AudioEncoderAacResponse audioEncoder,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("videoEncoder") @Nullable VideoEncoderH264Response videoEncoder) {
        this.audioEncoder = audioEncoder;
        this.type = type;
        this.videoEncoder = videoEncoder;
    }

    /**
     * Describes a custom preset for encoding audio.
     * 
    */
    public Optional<AudioEncoderAacResponse> audioEncoder() {
        return Optional.ofNullable(this.audioEncoder);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.VideoAnalyzer.EncoderCustomPreset'.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Describes a custom preset for encoding video.
     * 
    */
    public Optional<VideoEncoderH264Response> videoEncoder() {
        return Optional.ofNullable(this.videoEncoder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncoderCustomPresetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AudioEncoderAacResponse audioEncoder;
        private String type;
        private @Nullable VideoEncoderH264Response videoEncoder;

        public Builder() {
    	      // Empty
        }

        public Builder(EncoderCustomPresetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioEncoder = defaults.audioEncoder;
    	      this.type = defaults.type;
    	      this.videoEncoder = defaults.videoEncoder;
        }

        public Builder audioEncoder(@Nullable AudioEncoderAacResponse audioEncoder) {
            this.audioEncoder = audioEncoder;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder videoEncoder(@Nullable VideoEncoderH264Response videoEncoder) {
            this.videoEncoder = videoEncoder;
            return this;
        }        public EncoderCustomPresetResponse build() {
            return new EncoderCustomPresetResponse(audioEncoder, type, videoEncoder);
        }
    }
}
