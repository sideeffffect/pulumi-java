// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.outputs;

import io.pulumi.aws.ebs.outputs.SnapshotImportDiskContainerUserBucket;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SnapshotImportDiskContainer {
    /**
     * The description of the disk image being imported.
     * 
     */
    private final @Nullable String description;
    /**
     * The format of the disk image being imported. One of `VHD` or `VMDK`.
     * 
     */
    private final String format;
    /**
     * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
     * 
     */
    private final @Nullable String url;
    /**
     * The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
     * 
     */
    private final @Nullable SnapshotImportDiskContainerUserBucket userBucket;

    @OutputCustomType.Constructor({"description","format","url","userBucket"})
    private SnapshotImportDiskContainer(
        @Nullable String description,
        String format,
        @Nullable String url,
        @Nullable SnapshotImportDiskContainerUserBucket userBucket) {
        this.description = description;
        this.format = format;
        this.url = url;
        this.userBucket = userBucket;
    }

    /**
     * The description of the disk image being imported.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The format of the disk image being imported. One of `VHD` or `VMDK`.
     * 
    */
    public String getFormat() {
        return this.format;
    }
    /**
     * The URL to the Amazon S3-based disk image being imported. It can either be a https URL (https://..) or an Amazon S3 URL (s3://..). One of `url` or `user_bucket` must be set.
     * 
    */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }
    /**
     * The Amazon S3 bucket for the disk image. One of `url` or `user_bucket` must be set. Detailed below.
     * 
    */
    public Optional<SnapshotImportDiskContainerUserBucket> getUserBucket() {
        return Optional.ofNullable(this.userBucket);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotImportDiskContainer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String format;
        private @Nullable String url;
        private @Nullable SnapshotImportDiskContainerUserBucket userBucket;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotImportDiskContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.url = defaults.url;
    	      this.userBucket = defaults.userBucket;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = Objects.requireNonNull(format);
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }

        public Builder setUserBucket(@Nullable SnapshotImportDiskContainerUserBucket userBucket) {
            this.userBucket = userBucket;
            return this;
        }
        public SnapshotImportDiskContainer build() {
            return new SnapshotImportDiskContainer(description, format, url, userBucket);
        }
    }
}
