// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VP9 codec settings.
 * 
 */
public final class Vp9CodecSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final Vp9CodecSettingsArgs Empty = new Vp9CodecSettingsArgs();

    /**
     * The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 480,000,000.
     * 
     */
    @InputImport(name="bitrateBps", required=true)
      private final Input<Integer> bitrateBps;

    public Input<Integer> getBitrateBps() {
        return this.bitrateBps;
    }

    /**
     * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21. *Note*: This field is not supported.
     * 
     */
    @InputImport(name="crfLevel")
      private final @Nullable Input<Integer> crfLevel;

    public Input<Integer> getCrfLevel() {
        return this.crfLevel == null ? Input.empty() : this.crfLevel;
    }

    /**
     * The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
     */
    @InputImport(name="frameRate", required=true)
      private final Input<Double> frameRate;

    public Input<Double> getFrameRate() {
        return this.frameRate;
    }

    /**
     * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
     */
    @InputImport(name="gopDuration")
      private final @Nullable Input<String> gopDuration;

    public Input<String> getGopDuration() {
        return this.gopDuration == null ? Input.empty() : this.gopDuration;
    }

    /**
     * Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
     */
    @InputImport(name="gopFrameCount")
      private final @Nullable Input<Integer> gopFrameCount;

    public Input<Integer> getGopFrameCount() {
        return this.gopFrameCount == null ? Input.empty() : this.gopFrameCount;
    }

    /**
     * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
     */
    @InputImport(name="heightPixels")
      private final @Nullable Input<Integer> heightPixels;

    public Input<Integer> getHeightPixels() {
        return this.heightPixels == null ? Input.empty() : this.heightPixels;
    }

    /**
     * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
     */
    @InputImport(name="pixelFormat")
      private final @Nullable Input<String> pixelFormat;

    public Input<String> getPixelFormat() {
        return this.pixelFormat == null ? Input.empty() : this.pixelFormat;
    }

    /**
     * Enforces the specified codec profile. The following profiles are supported: * `profile0` (default) * `profile1` * `profile2` * `profile3` The available options are [WebM-compatible](https://www.webmproject.org/vp9/profiles/). Note that certain values for this field may cause the transcoder to override other fields you set in the `Vp9CodecSettings` message.
     * 
     */
    @InputImport(name="profile")
      private final @Nullable Input<String> profile;

    public Input<String> getProfile() {
        return this.profile == null ? Input.empty() : this.profile;
    }

    /**
     * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate
     * 
     */
    @InputImport(name="rateControlMode")
      private final @Nullable Input<String> rateControlMode;

    public Input<String> getRateControlMode() {
        return this.rateControlMode == null ? Input.empty() : this.rateControlMode;
    }

    /**
     * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
     */
    @InputImport(name="widthPixels")
      private final @Nullable Input<Integer> widthPixels;

    public Input<Integer> getWidthPixels() {
        return this.widthPixels == null ? Input.empty() : this.widthPixels;
    }

    public Vp9CodecSettingsArgs(
        Input<Integer> bitrateBps,
        @Nullable Input<Integer> crfLevel,
        Input<Double> frameRate,
        @Nullable Input<String> gopDuration,
        @Nullable Input<Integer> gopFrameCount,
        @Nullable Input<Integer> heightPixels,
        @Nullable Input<String> pixelFormat,
        @Nullable Input<String> profile,
        @Nullable Input<String> rateControlMode,
        @Nullable Input<Integer> widthPixels) {
        this.bitrateBps = Objects.requireNonNull(bitrateBps, "expected parameter 'bitrateBps' to be non-null");
        this.crfLevel = crfLevel;
        this.frameRate = Objects.requireNonNull(frameRate, "expected parameter 'frameRate' to be non-null");
        this.gopDuration = gopDuration;
        this.gopFrameCount = gopFrameCount;
        this.heightPixels = heightPixels;
        this.pixelFormat = pixelFormat;
        this.profile = profile;
        this.rateControlMode = rateControlMode;
        this.widthPixels = widthPixels;
    }

    private Vp9CodecSettingsArgs() {
        this.bitrateBps = Input.empty();
        this.crfLevel = Input.empty();
        this.frameRate = Input.empty();
        this.gopDuration = Input.empty();
        this.gopFrameCount = Input.empty();
        this.heightPixels = Input.empty();
        this.pixelFormat = Input.empty();
        this.profile = Input.empty();
        this.rateControlMode = Input.empty();
        this.widthPixels = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Vp9CodecSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> bitrateBps;
        private @Nullable Input<Integer> crfLevel;
        private Input<Double> frameRate;
        private @Nullable Input<String> gopDuration;
        private @Nullable Input<Integer> gopFrameCount;
        private @Nullable Input<Integer> heightPixels;
        private @Nullable Input<String> pixelFormat;
        private @Nullable Input<String> profile;
        private @Nullable Input<String> rateControlMode;
        private @Nullable Input<Integer> widthPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(Vp9CodecSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.crfLevel = defaults.crfLevel;
    	      this.frameRate = defaults.frameRate;
    	      this.gopDuration = defaults.gopDuration;
    	      this.gopFrameCount = defaults.gopFrameCount;
    	      this.heightPixels = defaults.heightPixels;
    	      this.pixelFormat = defaults.pixelFormat;
    	      this.profile = defaults.profile;
    	      this.rateControlMode = defaults.rateControlMode;
    	      this.widthPixels = defaults.widthPixels;
        }

        public Builder bitrateBps(Input<Integer> bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }

        public Builder bitrateBps(Integer bitrateBps) {
            this.bitrateBps = Input.of(Objects.requireNonNull(bitrateBps));
            return this;
        }

        public Builder crfLevel(@Nullable Input<Integer> crfLevel) {
            this.crfLevel = crfLevel;
            return this;
        }

        public Builder crfLevel(@Nullable Integer crfLevel) {
            this.crfLevel = Input.ofNullable(crfLevel);
            return this;
        }

        public Builder frameRate(Input<Double> frameRate) {
            this.frameRate = Objects.requireNonNull(frameRate);
            return this;
        }

        public Builder frameRate(Double frameRate) {
            this.frameRate = Input.of(Objects.requireNonNull(frameRate));
            return this;
        }

        public Builder gopDuration(@Nullable Input<String> gopDuration) {
            this.gopDuration = gopDuration;
            return this;
        }

        public Builder gopDuration(@Nullable String gopDuration) {
            this.gopDuration = Input.ofNullable(gopDuration);
            return this;
        }

        public Builder gopFrameCount(@Nullable Input<Integer> gopFrameCount) {
            this.gopFrameCount = gopFrameCount;
            return this;
        }

        public Builder gopFrameCount(@Nullable Integer gopFrameCount) {
            this.gopFrameCount = Input.ofNullable(gopFrameCount);
            return this;
        }

        public Builder heightPixels(@Nullable Input<Integer> heightPixels) {
            this.heightPixels = heightPixels;
            return this;
        }

        public Builder heightPixels(@Nullable Integer heightPixels) {
            this.heightPixels = Input.ofNullable(heightPixels);
            return this;
        }

        public Builder pixelFormat(@Nullable Input<String> pixelFormat) {
            this.pixelFormat = pixelFormat;
            return this;
        }

        public Builder pixelFormat(@Nullable String pixelFormat) {
            this.pixelFormat = Input.ofNullable(pixelFormat);
            return this;
        }

        public Builder profile(@Nullable Input<String> profile) {
            this.profile = profile;
            return this;
        }

        public Builder profile(@Nullable String profile) {
            this.profile = Input.ofNullable(profile);
            return this;
        }

        public Builder rateControlMode(@Nullable Input<String> rateControlMode) {
            this.rateControlMode = rateControlMode;
            return this;
        }

        public Builder rateControlMode(@Nullable String rateControlMode) {
            this.rateControlMode = Input.ofNullable(rateControlMode);
            return this;
        }

        public Builder widthPixels(@Nullable Input<Integer> widthPixels) {
            this.widthPixels = widthPixels;
            return this;
        }

        public Builder widthPixels(@Nullable Integer widthPixels) {
            this.widthPixels = Input.ofNullable(widthPixels);
            return this;
        }
        public Vp9CodecSettingsArgs build() {
            return new Vp9CodecSettingsArgs(bitrateBps, crfLevel, frameRate, gopDuration, gopFrameCount, heightPixels, pixelFormat, profile, rateControlMode, widthPixels);
        }
    }
}
