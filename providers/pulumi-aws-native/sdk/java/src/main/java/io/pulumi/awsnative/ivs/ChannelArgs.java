// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ivs;

import io.pulumi.awsnative.ivs.enums.ChannelLatencyMode;
import io.pulumi.awsnative.ivs.enums.ChannelType;
import io.pulumi.awsnative.ivs.inputs.ChannelTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ChannelArgs Empty = new ChannelArgs();

    /**
     * Whether the channel is authorized.
     * 
     */
    @InputImport(name="authorized")
      private final @Nullable Input<Boolean> authorized;

    public Input<Boolean> getAuthorized() {
        return this.authorized == null ? Input.empty() : this.authorized;
    }

    /**
     * Channel latency mode.
     * 
     */
    @InputImport(name="latencyMode")
      private final @Nullable Input<ChannelLatencyMode> latencyMode;

    public Input<ChannelLatencyMode> getLatencyMode() {
        return this.latencyMode == null ? Input.empty() : this.latencyMode;
    }

    /**
     * Channel
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Recording Configuration ARN. A value other than an empty string indicates that recording is enabled. Default: “” (recording is disabled).
     * 
     */
    @InputImport(name="recordingConfigurationArn")
      private final @Nullable Input<String> recordingConfigurationArn;

    public Input<String> getRecordingConfigurationArn() {
        return this.recordingConfigurationArn == null ? Input.empty() : this.recordingConfigurationArn;
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<ChannelTagArgs>> tags;

    public Input<List<ChannelTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<ChannelType> type;

    public Input<ChannelType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ChannelArgs(
        @Nullable Input<Boolean> authorized,
        @Nullable Input<ChannelLatencyMode> latencyMode,
        @Nullable Input<String> name,
        @Nullable Input<String> recordingConfigurationArn,
        @Nullable Input<List<ChannelTagArgs>> tags,
        @Nullable Input<ChannelType> type) {
        this.authorized = authorized;
        this.latencyMode = latencyMode;
        this.name = name;
        this.recordingConfigurationArn = recordingConfigurationArn;
        this.tags = tags;
        this.type = type;
    }

    private ChannelArgs() {
        this.authorized = Input.empty();
        this.latencyMode = Input.empty();
        this.name = Input.empty();
        this.recordingConfigurationArn = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> authorized;
        private @Nullable Input<ChannelLatencyMode> latencyMode;
        private @Nullable Input<String> name;
        private @Nullable Input<String> recordingConfigurationArn;
        private @Nullable Input<List<ChannelTagArgs>> tags;
        private @Nullable Input<ChannelType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorized = defaults.authorized;
    	      this.latencyMode = defaults.latencyMode;
    	      this.name = defaults.name;
    	      this.recordingConfigurationArn = defaults.recordingConfigurationArn;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder authorized(@Nullable Input<Boolean> authorized) {
            this.authorized = authorized;
            return this;
        }

        public Builder authorized(@Nullable Boolean authorized) {
            this.authorized = Input.ofNullable(authorized);
            return this;
        }

        public Builder latencyMode(@Nullable Input<ChannelLatencyMode> latencyMode) {
            this.latencyMode = latencyMode;
            return this;
        }

        public Builder latencyMode(@Nullable ChannelLatencyMode latencyMode) {
            this.latencyMode = Input.ofNullable(latencyMode);
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

        public Builder recordingConfigurationArn(@Nullable Input<String> recordingConfigurationArn) {
            this.recordingConfigurationArn = recordingConfigurationArn;
            return this;
        }

        public Builder recordingConfigurationArn(@Nullable String recordingConfigurationArn) {
            this.recordingConfigurationArn = Input.ofNullable(recordingConfigurationArn);
            return this;
        }

        public Builder tags(@Nullable Input<List<ChannelTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<ChannelTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(@Nullable Input<ChannelType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable ChannelType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ChannelArgs build() {
            return new ChannelArgs(authorized, latencyMode, name, recordingConfigurationArn, tags, type);
        }
    }
}
