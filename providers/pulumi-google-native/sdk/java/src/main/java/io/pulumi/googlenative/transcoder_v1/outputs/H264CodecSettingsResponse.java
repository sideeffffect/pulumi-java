// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.transcoder_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class H264CodecSettingsResponse {
    /**
     * Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The default is `false`.
     * 
     */
    private final Boolean allowOpenGop;
    /**
     * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother image. The default is 0.
     * 
     */
    private final Double aqStrength;
    /**
     * The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than `VideoStream.gop_frame_count` if set. The default is 0.
     * 
     */
    private final Integer bFrameCount;
    /**
     * Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The default is `false`.
     * 
     */
    private final Boolean bPyramid;
    /**
     * The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 800,000,000.
     * 
     */
    private final Integer bitrateBps;
    /**
     * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21.
     * 
     */
    private final Integer crfLevel;
    /**
     * Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode` must be `vbr`. The default is `false`.
     * 
     */
    private final Boolean enableTwoPass;
    /**
     * The entropy coder to use. The default is `cabac`. Supported entropy coders: - `cavlc` - `cabac`
     * 
     */
    private final String entropyCoder;
    /**
     * The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
     */
    private final Double frameRate;
    /**
     * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
     */
    private final String gopDuration;
    /**
     * Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
     */
    private final Integer gopFrameCount;
    /**
     * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
     */
    private final Integer heightPixels;
    /**
     * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
     */
    private final String pixelFormat;
    /**
     * Enforces the specified codec preset. The default is `veryfast`. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Preset). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
     */
    private final String preset;
    /**
     * Enforces the specified codec profile. The following profiles are supported: * `baseline` * `main` * `high` (default) The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Tune). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
     */
    private final String profile;
    /**
     * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate - `crf` - constant rate factor
     * 
     */
    private final String rateControlMode;
    /**
     * Enforces the specified codec tune. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Tune). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
     */
    private final String tune;
    /**
     * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.
     * 
     */
    private final Integer vbvFullnessBits;
    /**
     * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to `VideoStream.bitrate_bps`.
     * 
     */
    private final Integer vbvSizeBits;
    /**
     * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
     */
    private final Integer widthPixels;

    @OutputCustomType.Constructor
    private H264CodecSettingsResponse(
        @OutputCustomType.Parameter("allowOpenGop") Boolean allowOpenGop,
        @OutputCustomType.Parameter("aqStrength") Double aqStrength,
        @OutputCustomType.Parameter("bFrameCount") Integer bFrameCount,
        @OutputCustomType.Parameter("bPyramid") Boolean bPyramid,
        @OutputCustomType.Parameter("bitrateBps") Integer bitrateBps,
        @OutputCustomType.Parameter("crfLevel") Integer crfLevel,
        @OutputCustomType.Parameter("enableTwoPass") Boolean enableTwoPass,
        @OutputCustomType.Parameter("entropyCoder") String entropyCoder,
        @OutputCustomType.Parameter("frameRate") Double frameRate,
        @OutputCustomType.Parameter("gopDuration") String gopDuration,
        @OutputCustomType.Parameter("gopFrameCount") Integer gopFrameCount,
        @OutputCustomType.Parameter("heightPixels") Integer heightPixels,
        @OutputCustomType.Parameter("pixelFormat") String pixelFormat,
        @OutputCustomType.Parameter("preset") String preset,
        @OutputCustomType.Parameter("profile") String profile,
        @OutputCustomType.Parameter("rateControlMode") String rateControlMode,
        @OutputCustomType.Parameter("tune") String tune,
        @OutputCustomType.Parameter("vbvFullnessBits") Integer vbvFullnessBits,
        @OutputCustomType.Parameter("vbvSizeBits") Integer vbvSizeBits,
        @OutputCustomType.Parameter("widthPixels") Integer widthPixels) {
        this.allowOpenGop = allowOpenGop;
        this.aqStrength = aqStrength;
        this.bFrameCount = bFrameCount;
        this.bPyramid = bPyramid;
        this.bitrateBps = bitrateBps;
        this.crfLevel = crfLevel;
        this.enableTwoPass = enableTwoPass;
        this.entropyCoder = entropyCoder;
        this.frameRate = frameRate;
        this.gopDuration = gopDuration;
        this.gopFrameCount = gopFrameCount;
        this.heightPixels = heightPixels;
        this.pixelFormat = pixelFormat;
        this.preset = preset;
        this.profile = profile;
        this.rateControlMode = rateControlMode;
        this.tune = tune;
        this.vbvFullnessBits = vbvFullnessBits;
        this.vbvSizeBits = vbvSizeBits;
        this.widthPixels = widthPixels;
    }

    /**
     * Specifies whether an open Group of Pictures (GOP) structure should be allowed or not. The default is `false`.
     * 
    */
    public Boolean getAllowOpenGop() {
        return this.allowOpenGop;
    }
    /**
     * Specify the intensity of the adaptive quantizer (AQ). Must be between 0 and 1, where 0 disables the quantizer and 1 maximizes the quantizer. A higher value equals a lower bitrate but smoother image. The default is 0.
     * 
    */
    public Double getAqStrength() {
        return this.aqStrength;
    }
    /**
     * The number of consecutive B-frames. Must be greater than or equal to zero. Must be less than `VideoStream.gop_frame_count` if set. The default is 0.
     * 
    */
    public Integer getBFrameCount() {
        return this.bFrameCount;
    }
    /**
     * Allow B-pyramid for reference frame selection. This may not be supported on all decoders. The default is `false`.
     * 
    */
    public Boolean getBPyramid() {
        return this.bPyramid;
    }
    /**
     * The video bitrate in bits per second. The minimum value is 1,000. The maximum value is 800,000,000.
     * 
    */
    public Integer getBitrateBps() {
        return this.bitrateBps;
    }
    /**
     * Target CRF level. Must be between 10 and 36, where 10 is the highest quality and 36 is the most efficient compression. The default is 21.
     * 
    */
    public Integer getCrfLevel() {
        return this.crfLevel;
    }
    /**
     * Use two-pass encoding strategy to achieve better video quality. `VideoStream.rate_control_mode` must be `vbr`. The default is `false`.
     * 
    */
    public Boolean getEnableTwoPass() {
        return this.enableTwoPass;
    }
    /**
     * The entropy coder to use. The default is `cabac`. Supported entropy coders: - `cavlc` - `cabac`
     * 
    */
    public String getEntropyCoder() {
        return this.entropyCoder;
    }
    /**
     * The target video frame rate in frames per second (FPS). Must be less than or equal to 120. Will default to the input frame rate if larger than the input frame rate. The API will generate an output FPS that is divisible by the input FPS, and smaller or equal to the target FPS. See [Calculating frame rate](https://cloud.google.com/transcoder/docs/concepts/frame-rate) for more information.
     * 
    */
    public Double getFrameRate() {
        return this.frameRate;
    }
    /**
     * Select the GOP size based on the specified duration. The default is `3s`. Note that `gopDuration` must be less than or equal to [`segmentDuration`](#SegmentSettings), and [`segmentDuration`](#SegmentSettings) must be divisible by `gopDuration`.
     * 
    */
    public String getGopDuration() {
        return this.gopDuration;
    }
    /**
     * Select the GOP size based on the specified frame count. Must be greater than zero.
     * 
    */
    public Integer getGopFrameCount() {
        return this.gopFrameCount;
    }
    /**
     * The height of the video in pixels. Must be an even integer. When not specified, the height is adjusted to match the specified width and input aspect ratio. If both are omitted, the input height is used.
     * 
    */
    public Integer getHeightPixels() {
        return this.heightPixels;
    }
    /**
     * Pixel format to use. The default is `yuv420p`. Supported pixel formats: - `yuv420p` pixel format - `yuv422p` pixel format - `yuv444p` pixel format - `yuv420p10` 10-bit HDR pixel format - `yuv422p10` 10-bit HDR pixel format - `yuv444p10` 10-bit HDR pixel format - `yuv420p12` 12-bit HDR pixel format - `yuv422p12` 12-bit HDR pixel format - `yuv444p12` 12-bit HDR pixel format
     * 
    */
    public String getPixelFormat() {
        return this.pixelFormat;
    }
    /**
     * Enforces the specified codec preset. The default is `veryfast`. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Preset). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
    */
    public String getPreset() {
        return this.preset;
    }
    /**
     * Enforces the specified codec profile. The following profiles are supported: * `baseline` * `main` * `high` (default) The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Tune). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
    */
    public String getProfile() {
        return this.profile;
    }
    /**
     * Specify the `rate_control_mode`. The default is `vbr`. Supported rate control modes: - `vbr` - variable bitrate - `crf` - constant rate factor
     * 
    */
    public String getRateControlMode() {
        return this.rateControlMode;
    }
    /**
     * Enforces the specified codec tune. The available options are [FFmpeg-compatible](https://trac.ffmpeg.org/wiki/Encode/H.264#Tune). Note that certain values for this field may cause the transcoder to override other fields you set in the `H264CodecSettings` message.
     * 
    */
    public String getTune() {
        return this.tune;
    }
    /**
     * Initial fullness of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to 90% of `VideoStream.vbv_size_bits`.
     * 
    */
    public Integer getVbvFullnessBits() {
        return this.vbvFullnessBits;
    }
    /**
     * Size of the Video Buffering Verifier (VBV) buffer in bits. Must be greater than zero. The default is equal to `VideoStream.bitrate_bps`.
     * 
    */
    public Integer getVbvSizeBits() {
        return this.vbvSizeBits;
    }
    /**
     * The width of the video in pixels. Must be an even integer. When not specified, the width is adjusted to match the specified height and input aspect ratio. If both are omitted, the input width is used.
     * 
    */
    public Integer getWidthPixels() {
        return this.widthPixels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(H264CodecSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowOpenGop;
        private Double aqStrength;
        private Integer bFrameCount;
        private Boolean bPyramid;
        private Integer bitrateBps;
        private Integer crfLevel;
        private Boolean enableTwoPass;
        private String entropyCoder;
        private Double frameRate;
        private String gopDuration;
        private Integer gopFrameCount;
        private Integer heightPixels;
        private String pixelFormat;
        private String preset;
        private String profile;
        private String rateControlMode;
        private String tune;
        private Integer vbvFullnessBits;
        private Integer vbvSizeBits;
        private Integer widthPixels;

        public Builder() {
    	      // Empty
        }

        public Builder(H264CodecSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOpenGop = defaults.allowOpenGop;
    	      this.aqStrength = defaults.aqStrength;
    	      this.bFrameCount = defaults.bFrameCount;
    	      this.bPyramid = defaults.bPyramid;
    	      this.bitrateBps = defaults.bitrateBps;
    	      this.crfLevel = defaults.crfLevel;
    	      this.enableTwoPass = defaults.enableTwoPass;
    	      this.entropyCoder = defaults.entropyCoder;
    	      this.frameRate = defaults.frameRate;
    	      this.gopDuration = defaults.gopDuration;
    	      this.gopFrameCount = defaults.gopFrameCount;
    	      this.heightPixels = defaults.heightPixels;
    	      this.pixelFormat = defaults.pixelFormat;
    	      this.preset = defaults.preset;
    	      this.profile = defaults.profile;
    	      this.rateControlMode = defaults.rateControlMode;
    	      this.tune = defaults.tune;
    	      this.vbvFullnessBits = defaults.vbvFullnessBits;
    	      this.vbvSizeBits = defaults.vbvSizeBits;
    	      this.widthPixels = defaults.widthPixels;
        }

        public Builder allowOpenGop(Boolean allowOpenGop) {
            this.allowOpenGop = Objects.requireNonNull(allowOpenGop);
            return this;
        }

        public Builder aqStrength(Double aqStrength) {
            this.aqStrength = Objects.requireNonNull(aqStrength);
            return this;
        }

        public Builder bFrameCount(Integer bFrameCount) {
            this.bFrameCount = Objects.requireNonNull(bFrameCount);
            return this;
        }

        public Builder bPyramid(Boolean bPyramid) {
            this.bPyramid = Objects.requireNonNull(bPyramid);
            return this;
        }

        public Builder bitrateBps(Integer bitrateBps) {
            this.bitrateBps = Objects.requireNonNull(bitrateBps);
            return this;
        }

        public Builder crfLevel(Integer crfLevel) {
            this.crfLevel = Objects.requireNonNull(crfLevel);
            return this;
        }

        public Builder enableTwoPass(Boolean enableTwoPass) {
            this.enableTwoPass = Objects.requireNonNull(enableTwoPass);
            return this;
        }

        public Builder entropyCoder(String entropyCoder) {
            this.entropyCoder = Objects.requireNonNull(entropyCoder);
            return this;
        }

        public Builder frameRate(Double frameRate) {
            this.frameRate = Objects.requireNonNull(frameRate);
            return this;
        }

        public Builder gopDuration(String gopDuration) {
            this.gopDuration = Objects.requireNonNull(gopDuration);
            return this;
        }

        public Builder gopFrameCount(Integer gopFrameCount) {
            this.gopFrameCount = Objects.requireNonNull(gopFrameCount);
            return this;
        }

        public Builder heightPixels(Integer heightPixels) {
            this.heightPixels = Objects.requireNonNull(heightPixels);
            return this;
        }

        public Builder pixelFormat(String pixelFormat) {
            this.pixelFormat = Objects.requireNonNull(pixelFormat);
            return this;
        }

        public Builder preset(String preset) {
            this.preset = Objects.requireNonNull(preset);
            return this;
        }

        public Builder profile(String profile) {
            this.profile = Objects.requireNonNull(profile);
            return this;
        }

        public Builder rateControlMode(String rateControlMode) {
            this.rateControlMode = Objects.requireNonNull(rateControlMode);
            return this;
        }

        public Builder tune(String tune) {
            this.tune = Objects.requireNonNull(tune);
            return this;
        }

        public Builder vbvFullnessBits(Integer vbvFullnessBits) {
            this.vbvFullnessBits = Objects.requireNonNull(vbvFullnessBits);
            return this;
        }

        public Builder vbvSizeBits(Integer vbvSizeBits) {
            this.vbvSizeBits = Objects.requireNonNull(vbvSizeBits);
            return this;
        }

        public Builder widthPixels(Integer widthPixels) {
            this.widthPixels = Objects.requireNonNull(widthPixels);
            return this;
        }
        public H264CodecSettingsResponse build() {
            return new H264CodecSettingsResponse(allowOpenGop, aqStrength, bFrameCount, bPyramid, bitrateBps, crfLevel, enableTwoPass, entropyCoder, frameRate, gopDuration, gopFrameCount, heightPixels, pixelFormat, preset, profile, rateControlMode, tune, vbvFullnessBits, vbvSizeBits, widthPixels);
        }
    }
}
