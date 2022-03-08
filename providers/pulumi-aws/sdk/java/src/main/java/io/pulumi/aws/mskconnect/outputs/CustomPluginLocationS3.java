// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mskconnect.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomPluginLocationS3 {
    /**
     * The Amazon Resource Name (ARN) of an S3 bucket.
     * 
     */
    private final String bucketArn;
    /**
     * The file key for an object in an S3 bucket.
     * 
     */
    private final String fileKey;
    /**
     * The version of an object in an S3 bucket.
     * 
     */
    private final @Nullable String objectVersion;

    @OutputCustomType.Constructor({"bucketArn","fileKey","objectVersion"})
    private CustomPluginLocationS3(
        String bucketArn,
        String fileKey,
        @Nullable String objectVersion) {
        this.bucketArn = bucketArn;
        this.fileKey = fileKey;
        this.objectVersion = objectVersion;
    }

    /**
     * The Amazon Resource Name (ARN) of an S3 bucket.
     * 
    */
    public String getBucketArn() {
        return this.bucketArn;
    }
    /**
     * The file key for an object in an S3 bucket.
     * 
    */
    public String getFileKey() {
        return this.fileKey;
    }
    /**
     * The version of an object in an S3 bucket.
     * 
    */
    public Optional<String> getObjectVersion() {
        return Optional.ofNullable(this.objectVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomPluginLocationS3 defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketArn;
        private String fileKey;
        private @Nullable String objectVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomPluginLocationS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketArn = defaults.bucketArn;
    	      this.fileKey = defaults.fileKey;
    	      this.objectVersion = defaults.objectVersion;
        }

        public Builder setBucketArn(String bucketArn) {
            this.bucketArn = Objects.requireNonNull(bucketArn);
            return this;
        }

        public Builder setFileKey(String fileKey) {
            this.fileKey = Objects.requireNonNull(fileKey);
            return this;
        }

        public Builder setObjectVersion(@Nullable String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        public CustomPluginLocationS3 build() {
            return new CustomPluginLocationS3(bucketArn, fileKey, objectVersion);
        }
    }
}
