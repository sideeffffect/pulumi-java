// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.transcoder_v1.outputs.AudioResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.ColorResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.CropResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.DeblockResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.DenoiseResponse;
import io.pulumi.googlenative.transcoder_v1.outputs.PadResponse;
import java.util.Objects;

@OutputCustomType
public final class PreprocessingConfigResponse {
    /**
     * Audio preprocessing configuration.
     * 
     */
    private final AudioResponse audio;
    /**
     * Color preprocessing configuration.
     * 
     */
    private final ColorResponse color;
    /**
     * Specify the video cropping configuration.
     * 
     */
    private final CropResponse crop;
    /**
     * Deblock preprocessing configuration.
     * 
     */
    private final DeblockResponse deblock;
    /**
     * Denoise preprocessing configuration.
     * 
     */
    private final DenoiseResponse denoise;
    /**
     * Specify the video pad filter configuration.
     * 
     */
    private final PadResponse pad;

    @OutputCustomType.Constructor
    private PreprocessingConfigResponse(
        @OutputCustomType.Parameter("audio") AudioResponse audio,
        @OutputCustomType.Parameter("color") ColorResponse color,
        @OutputCustomType.Parameter("crop") CropResponse crop,
        @OutputCustomType.Parameter("deblock") DeblockResponse deblock,
        @OutputCustomType.Parameter("denoise") DenoiseResponse denoise,
        @OutputCustomType.Parameter("pad") PadResponse pad) {
        this.audio = audio;
        this.color = color;
        this.crop = crop;
        this.deblock = deblock;
        this.denoise = denoise;
        this.pad = pad;
    }

    /**
     * Audio preprocessing configuration.
     * 
    */
    public AudioResponse getAudio() {
        return this.audio;
    }
    /**
     * Color preprocessing configuration.
     * 
    */
    public ColorResponse getColor() {
        return this.color;
    }
    /**
     * Specify the video cropping configuration.
     * 
    */
    public CropResponse getCrop() {
        return this.crop;
    }
    /**
     * Deblock preprocessing configuration.
     * 
    */
    public DeblockResponse getDeblock() {
        return this.deblock;
    }
    /**
     * Denoise preprocessing configuration.
     * 
    */
    public DenoiseResponse getDenoise() {
        return this.denoise;
    }
    /**
     * Specify the video pad filter configuration.
     * 
    */
    public PadResponse getPad() {
        return this.pad;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreprocessingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AudioResponse audio;
        private ColorResponse color;
        private CropResponse crop;
        private DeblockResponse deblock;
        private DenoiseResponse denoise;
        private PadResponse pad;

        public Builder() {
    	      // Empty
        }

        public Builder(PreprocessingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.color = defaults.color;
    	      this.crop = defaults.crop;
    	      this.deblock = defaults.deblock;
    	      this.denoise = defaults.denoise;
    	      this.pad = defaults.pad;
        }

        public Builder audio(AudioResponse audio) {
            this.audio = Objects.requireNonNull(audio);
            return this;
        }

        public Builder color(ColorResponse color) {
            this.color = Objects.requireNonNull(color);
            return this;
        }

        public Builder crop(CropResponse crop) {
            this.crop = Objects.requireNonNull(crop);
            return this;
        }

        public Builder deblock(DeblockResponse deblock) {
            this.deblock = Objects.requireNonNull(deblock);
            return this;
        }

        public Builder denoise(DenoiseResponse denoise) {
            this.denoise = Objects.requireNonNull(denoise);
            return this;
        }

        public Builder pad(PadResponse pad) {
            this.pad = Objects.requireNonNull(pad);
            return this;
        }
        public PreprocessingConfigResponse build() {
            return new PreprocessingConfigResponse(audio, color, crop, deblock, denoise, pad);
        }
    }
}
