// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder;

import io.pulumi.aws.elastictranscoder.inputs.PresetAudioArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetAudioCodecOptionsArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetThumbnailsArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetVideoArgs;
import io.pulumi.aws.elastictranscoder.inputs.PresetVideoWatermarkArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PresetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PresetArgs Empty = new PresetArgs();

    /**
     * Audio parameters object (documented below).
     * 
     */
    @InputImport(name="audio")
      private final @Nullable Input<PresetAudioArgs> audio;

    public Input<PresetAudioArgs> getAudio() {
        return this.audio == null ? Input.empty() : this.audio;
    }

    /**
     * Codec options for the audio parameters (documented below)
     * 
     */
    @InputImport(name="audioCodecOptions")
      private final @Nullable Input<PresetAudioCodecOptionsArgs> audioCodecOptions;

    public Input<PresetAudioCodecOptionsArgs> getAudioCodecOptions() {
        return this.audioCodecOptions == null ? Input.empty() : this.audioCodecOptions;
    }

    /**
     * The container type for the output file. Valid values are `flac`, `flv`, `fmp4`, `gif`, `mp3`, `mp4`, `mpg`, `mxf`, `oga`, `ogg`, `ts`, and `webm`.
     * 
     */
    @InputImport(name="container", required=true)
      private final Input<String> container;

    public Input<String> getContainer() {
        return this.container;
    }

    /**
     * A description of the preset (maximum 255 characters)
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the preset. (maximum 40 characters)
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Thumbnail parameters object (documented below)
     * 
     */
    @InputImport(name="thumbnails")
      private final @Nullable Input<PresetThumbnailsArgs> thumbnails;

    public Input<PresetThumbnailsArgs> getThumbnails() {
        return this.thumbnails == null ? Input.empty() : this.thumbnails;
    }

    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Video parameters object (documented below)
     * 
     */
    @InputImport(name="video")
      private final @Nullable Input<PresetVideoArgs> video;

    public Input<PresetVideoArgs> getVideo() {
        return this.video == null ? Input.empty() : this.video;
    }

    /**
     * Codec options for the video parameters
     * 
     */
    @InputImport(name="videoCodecOptions")
      private final @Nullable Input<Map<String,String>> videoCodecOptions;

    public Input<Map<String,String>> getVideoCodecOptions() {
        return this.videoCodecOptions == null ? Input.empty() : this.videoCodecOptions;
    }

    /**
     * Watermark parameters for the video parameters (documented below)
     * 
     */
    @InputImport(name="videoWatermarks")
      private final @Nullable Input<List<PresetVideoWatermarkArgs>> videoWatermarks;

    public Input<List<PresetVideoWatermarkArgs>> getVideoWatermarks() {
        return this.videoWatermarks == null ? Input.empty() : this.videoWatermarks;
    }

    public PresetArgs(
        @Nullable Input<PresetAudioArgs> audio,
        @Nullable Input<PresetAudioCodecOptionsArgs> audioCodecOptions,
        Input<String> container,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<PresetThumbnailsArgs> thumbnails,
        @Nullable Input<String> type,
        @Nullable Input<PresetVideoArgs> video,
        @Nullable Input<Map<String,String>> videoCodecOptions,
        @Nullable Input<List<PresetVideoWatermarkArgs>> videoWatermarks) {
        this.audio = audio;
        this.audioCodecOptions = audioCodecOptions;
        this.container = Objects.requireNonNull(container, "expected parameter 'container' to be non-null");
        this.description = description;
        this.name = name;
        this.thumbnails = thumbnails;
        this.type = type;
        this.video = video;
        this.videoCodecOptions = videoCodecOptions;
        this.videoWatermarks = videoWatermarks;
    }

    private PresetArgs() {
        this.audio = Input.empty();
        this.audioCodecOptions = Input.empty();
        this.container = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.thumbnails = Input.empty();
        this.type = Input.empty();
        this.video = Input.empty();
        this.videoCodecOptions = Input.empty();
        this.videoWatermarks = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PresetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PresetAudioArgs> audio;
        private @Nullable Input<PresetAudioCodecOptionsArgs> audioCodecOptions;
        private Input<String> container;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<PresetThumbnailsArgs> thumbnails;
        private @Nullable Input<String> type;
        private @Nullable Input<PresetVideoArgs> video;
        private @Nullable Input<Map<String,String>> videoCodecOptions;
        private @Nullable Input<List<PresetVideoWatermarkArgs>> videoWatermarks;

        public Builder() {
    	      // Empty
        }

        public Builder(PresetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audio = defaults.audio;
    	      this.audioCodecOptions = defaults.audioCodecOptions;
    	      this.container = defaults.container;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.thumbnails = defaults.thumbnails;
    	      this.type = defaults.type;
    	      this.video = defaults.video;
    	      this.videoCodecOptions = defaults.videoCodecOptions;
    	      this.videoWatermarks = defaults.videoWatermarks;
        }

        public Builder audio(@Nullable Input<PresetAudioArgs> audio) {
            this.audio = audio;
            return this;
        }

        public Builder audio(@Nullable PresetAudioArgs audio) {
            this.audio = Input.ofNullable(audio);
            return this;
        }

        public Builder audioCodecOptions(@Nullable Input<PresetAudioCodecOptionsArgs> audioCodecOptions) {
            this.audioCodecOptions = audioCodecOptions;
            return this;
        }

        public Builder audioCodecOptions(@Nullable PresetAudioCodecOptionsArgs audioCodecOptions) {
            this.audioCodecOptions = Input.ofNullable(audioCodecOptions);
            return this;
        }

        public Builder container(Input<String> container) {
            this.container = Objects.requireNonNull(container);
            return this;
        }

        public Builder container(String container) {
            this.container = Input.of(Objects.requireNonNull(container));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder thumbnails(@Nullable Input<PresetThumbnailsArgs> thumbnails) {
            this.thumbnails = thumbnails;
            return this;
        }

        public Builder thumbnails(@Nullable PresetThumbnailsArgs thumbnails) {
            this.thumbnails = Input.ofNullable(thumbnails);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder video(@Nullable Input<PresetVideoArgs> video) {
            this.video = video;
            return this;
        }

        public Builder video(@Nullable PresetVideoArgs video) {
            this.video = Input.ofNullable(video);
            return this;
        }

        public Builder videoCodecOptions(@Nullable Input<Map<String,String>> videoCodecOptions) {
            this.videoCodecOptions = videoCodecOptions;
            return this;
        }

        public Builder videoCodecOptions(@Nullable Map<String,String> videoCodecOptions) {
            this.videoCodecOptions = Input.ofNullable(videoCodecOptions);
            return this;
        }

        public Builder videoWatermarks(@Nullable Input<List<PresetVideoWatermarkArgs>> videoWatermarks) {
            this.videoWatermarks = videoWatermarks;
            return this;
        }

        public Builder videoWatermarks(@Nullable List<PresetVideoWatermarkArgs> videoWatermarks) {
            this.videoWatermarks = Input.ofNullable(videoWatermarks);
            return this;
        }
        public PresetArgs build() {
            return new PresetArgs(audio, audioCodecOptions, container, description, name, thumbnails, type, video, videoCodecOptions, videoWatermarks);
        }
    }
}
