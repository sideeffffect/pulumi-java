// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InfrastructureConfigurationS3Logs {
    /**
     * S3BucketName
     * 
     */
    private final @Nullable String s3BucketName;
    /**
     * S3KeyPrefix
     * 
     */
    private final @Nullable String s3KeyPrefix;

    @OutputCustomType.Constructor
    private InfrastructureConfigurationS3Logs(
        @OutputCustomType.Parameter("s3BucketName") @Nullable String s3BucketName,
        @OutputCustomType.Parameter("s3KeyPrefix") @Nullable String s3KeyPrefix) {
        this.s3BucketName = s3BucketName;
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * S3BucketName
     * 
    */
    public Optional<String> getS3BucketName() {
        return Optional.ofNullable(this.s3BucketName);
    }
    /**
     * S3KeyPrefix
     * 
    */
    public Optional<String> getS3KeyPrefix() {
        return Optional.ofNullable(this.s3KeyPrefix);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationS3Logs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String s3BucketName;
        private @Nullable String s3KeyPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationS3Logs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3KeyPrefix = defaults.s3KeyPrefix;
        }

        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder s3KeyPrefix(@Nullable String s3KeyPrefix) {
            this.s3KeyPrefix = s3KeyPrefix;
            return this;
        }
        public InfrastructureConfigurationS3Logs build() {
            return new InfrastructureConfigurationS3Logs(s3BucketName, s3KeyPrefix);
        }
    }
}
