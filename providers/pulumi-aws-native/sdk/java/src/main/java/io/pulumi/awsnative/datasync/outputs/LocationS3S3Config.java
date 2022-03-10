// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LocationS3S3Config {
    /**
     * The ARN of the IAM role of the Amazon S3 bucket.
     * 
     */
    private final String bucketAccessRoleArn;

    @OutputCustomType.Constructor
    private LocationS3S3Config(@OutputCustomType.Parameter("bucketAccessRoleArn") String bucketAccessRoleArn) {
        this.bucketAccessRoleArn = bucketAccessRoleArn;
    }

    /**
     * The ARN of the IAM role of the Amazon S3 bucket.
     * 
    */
    public String getBucketAccessRoleArn() {
        return this.bucketAccessRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationS3S3Config defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucketAccessRoleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationS3S3Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucketAccessRoleArn = defaults.bucketAccessRoleArn;
        }

        public Builder bucketAccessRoleArn(String bucketAccessRoleArn) {
            this.bucketAccessRoleArn = Objects.requireNonNull(bucketAccessRoleArn);
            return this;
        }
        public LocationS3S3Config build() {
            return new LocationS3S3Config(bucketAccessRoleArn);
        }
    }
}
