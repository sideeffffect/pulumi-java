// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VideoStreamArgs extends io.pulumi.resources.ResourceArgs {

    public static final VideoStreamArgs Empty = new VideoStreamArgs();

    /**
     * The number of hours that you want to retain the data in the stream. Kinesis Video Streams retains the data in a data store that is associated with the stream. The default value is `0`, indicating that the stream does not persist data.
     * 
     */
    @Import(name="dataRetentionInHours")
      private final @Nullable Output<Integer> dataRetentionInHours;

    public Output<Integer> dataRetentionInHours() {
        return this.dataRetentionInHours == null ? Codegen.empty() : this.dataRetentionInHours;
    }

    /**
     * The name of the device that is writing to the stream. **In the current implementation, Kinesis Video Streams does not use this name.**
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    /**
     * The ID of the AWS Key Management Service (AWS KMS) key that you want Kinesis Video Streams to use to encrypt stream data. If no key ID is specified, the default, Kinesis Video-managed key (`aws/kinesisvideo`) is used.
     * 
     */
    @Import(name="kmsKeyId")
      private final @Nullable Output<String> kmsKeyId;

    public Output<String> kmsKeyId() {
        return this.kmsKeyId == null ? Codegen.empty() : this.kmsKeyId;
    }

    /**
     * The media type of the stream. Consumers of the stream can use this information when processing the stream. For more information about media types, see [Media Types](http://www.iana.org/assignments/media-types/media-types.xhtml). If you choose to specify the MediaType, see [Naming Requirements](https://tools.ietf.org/html/rfc6838#section-4.2) for guidelines.
     * 
     */
    @Import(name="mediaType")
      private final @Nullable Output<String> mediaType;

    public Output<String> mediaType() {
        return this.mediaType == null ? Codegen.empty() : this.mediaType;
    }

    /**
     * A name to identify the stream. This is unique to the
     * AWS account and region the Stream is created in.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public VideoStreamArgs(
        @Nullable Output<Integer> dataRetentionInHours,
        @Nullable Output<String> deviceName,
        @Nullable Output<String> kmsKeyId,
        @Nullable Output<String> mediaType,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.dataRetentionInHours = dataRetentionInHours;
        this.deviceName = deviceName;
        this.kmsKeyId = kmsKeyId;
        this.mediaType = mediaType;
        this.name = name;
        this.tags = tags;
    }

    private VideoStreamArgs() {
        this.dataRetentionInHours = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.kmsKeyId = Codegen.empty();
        this.mediaType = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VideoStreamArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> dataRetentionInHours;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<String> kmsKeyId;
        private @Nullable Output<String> mediaType;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VideoStreamArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataRetentionInHours = defaults.dataRetentionInHours;
    	      this.deviceName = defaults.deviceName;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.mediaType = defaults.mediaType;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder dataRetentionInHours(@Nullable Output<Integer> dataRetentionInHours) {
            this.dataRetentionInHours = dataRetentionInHours;
            return this;
        }
        public Builder dataRetentionInHours(@Nullable Integer dataRetentionInHours) {
            this.dataRetentionInHours = Codegen.ofNullable(dataRetentionInHours);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }
        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = Codegen.ofNullable(kmsKeyId);
            return this;
        }
        public Builder mediaType(@Nullable Output<String> mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public Builder mediaType(@Nullable String mediaType) {
            this.mediaType = Codegen.ofNullable(mediaType);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public VideoStreamArgs build() {
            return new VideoStreamArgs(dataRetentionInHours, deviceName, kmsKeyId, mediaType, name, tags);
        }
    }
}
