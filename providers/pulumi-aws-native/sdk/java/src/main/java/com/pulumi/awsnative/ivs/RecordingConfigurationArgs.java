// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs;

import com.pulumi.awsnative.ivs.inputs.RecordingConfigurationDestinationConfigurationArgs;
import com.pulumi.awsnative.ivs.inputs.RecordingConfigurationTagArgs;
import com.pulumi.awsnative.ivs.inputs.RecordingConfigurationThumbnailConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordingConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordingConfigurationArgs Empty = new RecordingConfigurationArgs();

    @Import(name="destinationConfiguration", required=true)
    private Output<RecordingConfigurationDestinationConfigurationArgs> destinationConfiguration;

    public Output<RecordingConfigurationDestinationConfigurationArgs> destinationConfiguration() {
        return this.destinationConfiguration;
    }

    /**
     * Recording Configuration Name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<RecordingConfigurationTagArgs>> tags;

    public Optional<Output<List<RecordingConfigurationTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="thumbnailConfiguration")
    private @Nullable Output<RecordingConfigurationThumbnailConfigurationArgs> thumbnailConfiguration;

    public Optional<Output<RecordingConfigurationThumbnailConfigurationArgs>> thumbnailConfiguration() {
        return Optional.ofNullable(this.thumbnailConfiguration);
    }

    private RecordingConfigurationArgs() {}

    private RecordingConfigurationArgs(RecordingConfigurationArgs $) {
        this.destinationConfiguration = $.destinationConfiguration;
        this.name = $.name;
        this.tags = $.tags;
        this.thumbnailConfiguration = $.thumbnailConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordingConfigurationArgs $;

        public Builder() {
            $ = new RecordingConfigurationArgs();
        }

        public Builder(RecordingConfigurationArgs defaults) {
            $ = new RecordingConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinationConfiguration(Output<RecordingConfigurationDestinationConfigurationArgs> destinationConfiguration) {
            $.destinationConfiguration = destinationConfiguration;
            return this;
        }

        public Builder destinationConfiguration(RecordingConfigurationDestinationConfigurationArgs destinationConfiguration) {
            return destinationConfiguration(Output.of(destinationConfiguration));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<List<RecordingConfigurationTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<RecordingConfigurationTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(RecordingConfigurationTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder thumbnailConfiguration(@Nullable Output<RecordingConfigurationThumbnailConfigurationArgs> thumbnailConfiguration) {
            $.thumbnailConfiguration = thumbnailConfiguration;
            return this;
        }

        public Builder thumbnailConfiguration(RecordingConfigurationThumbnailConfigurationArgs thumbnailConfiguration) {
            return thumbnailConfiguration(Output.of(thumbnailConfiguration));
        }

        public RecordingConfigurationArgs build() {
            $.destinationConfiguration = Objects.requireNonNull($.destinationConfiguration, "expected parameter 'destinationConfiguration' to be non-null");
            return $;
        }
    }

}
