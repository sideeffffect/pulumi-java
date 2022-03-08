// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SnapshotImportDiskContainerUserBucket {
    /**
     * The name of the Amazon S3 bucket where the disk image is located.
     * 
     */
    private final String s3Bucket;
    /**
     * The file name of the disk image.
     * 
     */
    private final String s3Key;

    @OutputCustomType.Constructor({"s3Bucket","s3Key"})
    private SnapshotImportDiskContainerUserBucket(
        String s3Bucket,
        String s3Key) {
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
    }

    /**
     * The name of the Amazon S3 bucket where the disk image is located.
     * 
    */
    public String getS3Bucket() {
        return this.s3Bucket;
    }
    /**
     * The file name of the disk image.
     * 
    */
    public String getS3Key() {
        return this.s3Key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotImportDiskContainerUserBucket defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String s3Bucket;
        private String s3Key;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotImportDiskContainerUserBucket defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
        }

        public Builder setS3Bucket(String s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }

        public Builder setS3Key(String s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }
        public SnapshotImportDiskContainerUserBucket build() {
            return new SnapshotImportDiskContainerUserBucket(s3Bucket, s3Key);
        }
    }
}
