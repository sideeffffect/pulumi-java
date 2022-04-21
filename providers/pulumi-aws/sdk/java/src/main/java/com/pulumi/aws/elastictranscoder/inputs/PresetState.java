// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder.inputs;

import com.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsGetArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetAudioGetArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsGetArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetVideoGetArgs;
import com.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PresetState extends com.pulumi.resources.ResourceArgs {

    public static final PresetState Empty = new PresetState();

    /**
     * Amazon Resource Name (ARN) of the Elastic Transcoder Preset.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Audio parameters object (documented below).
     * 
     */
    @Import(name="audio")
    private @Nullable Output<PresetAudioGetArgs> audio;

    public Optional<Output<PresetAudioGetArgs>> audio() {
        return Optional.ofNullable(this.audio);
    }

    /**
     * Codec options for the audio parameters (documented below)
     * 
     */
    @Import(name="audioCodecOptions")
    private @Nullable Output<PresetAudioCodecOptionsGetArgs> audioCodecOptions;

    public Optional<Output<PresetAudioCodecOptionsGetArgs>> audioCodecOptions() {
        return Optional.ofNullable(this.audioCodecOptions);
    }

    /**
     * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    @Import(name="container")
    private @Nullable Output<String> container;

    public Optional<Output<String>> container() {
        return Optional.ofNullable(this.container);
    }

    /**
     * A description of the preset (maximum 255 characters)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the preset. (maximum 40 characters)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Thumbnail parameters object (documented below)
     * 
     */
    @Import(name="thumbnails")
    private @Nullable Output<PresetThumbnailsGetArgs> thumbnails;

    public Optional<Output<PresetThumbnailsGetArgs>> thumbnails() {
        return Optional.ofNullable(this.thumbnails);
    }

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Video parameters object (documented below)
     * 
     */
    @Import(name="video")
    private @Nullable Output<PresetVideoGetArgs> video;

    public Optional<Output<PresetVideoGetArgs>> video() {
        return Optional.ofNullable(this.video);
    }

    /**
     * Codec options for the video parameters
     * 
     */
    @Import(name="videoCodecOptions")
    private @Nullable Output<Map<String,String>> videoCodecOptions;

    public Optional<Output<Map<String,String>>> videoCodecOptions() {
        return Optional.ofNullable(this.videoCodecOptions);
    }

    /**
     * Watermark parameters for the video parameters (documented below)
     * 
     */
    @Import(name="videoWatermarks")
    private @Nullable Output<List<PresetVideoWatermarkGetArgs>> videoWatermarks;

    public Optional<Output<List<PresetVideoWatermarkGetArgs>>> videoWatermarks() {
        return Optional.ofNullable(this.videoWatermarks);
    }

    private PresetState() {}

    private PresetState(PresetState $) {
        this.arn = $.arn;
        this.audio = $.audio;
        this.audioCodecOptions = $.audioCodecOptions;
        this.container = $.container;
        this.description = $.description;
        this.name = $.name;
        this.thumbnails = $.thumbnails;
        this.type = $.type;
        this.video = $.video;
        this.videoCodecOptions = $.videoCodecOptions;
        this.videoWatermarks = $.videoWatermarks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PresetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PresetState $;

        public Builder() {
            $ = new PresetState();
        }

        public Builder(PresetState defaults) {
            $ = new PresetState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder audio(@Nullable Output<PresetAudioGetArgs> audio) {
            $.audio = audio;
            return this;
        }

        public Builder audio(PresetAudioGetArgs audio) {
            return audio(Output.of(audio));
        }

        public Builder audioCodecOptions(@Nullable Output<PresetAudioCodecOptionsGetArgs> audioCodecOptions) {
            $.audioCodecOptions = audioCodecOptions;
            return this;
        }

        public Builder audioCodecOptions(PresetAudioCodecOptionsGetArgs audioCodecOptions) {
            return audioCodecOptions(Output.of(audioCodecOptions));
        }

        public Builder container(@Nullable Output<String> container) {
            $.container = container;
            return this;
        }

        public Builder container(String container) {
            return container(Output.of(container));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder thumbnails(@Nullable Output<PresetThumbnailsGetArgs> thumbnails) {
            $.thumbnails = thumbnails;
            return this;
        }

        public Builder thumbnails(PresetThumbnailsGetArgs thumbnails) {
            return thumbnails(Output.of(thumbnails));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder video(@Nullable Output<PresetVideoGetArgs> video) {
            $.video = video;
            return this;
        }

        public Builder video(PresetVideoGetArgs video) {
            return video(Output.of(video));
        }

        public Builder videoCodecOptions(@Nullable Output<Map<String,String>> videoCodecOptions) {
            $.videoCodecOptions = videoCodecOptions;
            return this;
        }

        public Builder videoCodecOptions(Map<String,String> videoCodecOptions) {
            return videoCodecOptions(Output.of(videoCodecOptions));
        }

        public Builder videoWatermarks(@Nullable Output<List<PresetVideoWatermarkGetArgs>> videoWatermarks) {
            $.videoWatermarks = videoWatermarks;
            return this;
        }

        public Builder videoWatermarks(List<PresetVideoWatermarkGetArgs> videoWatermarks) {
            return videoWatermarks(Output.of(videoWatermarks));
        }

        public Builder videoWatermarks(PresetVideoWatermarkGetArgs... videoWatermarks) {
            return videoWatermarks(List.of(videoWatermarks));
        }

        public PresetState build() {
            return $;
        }
    }

}
