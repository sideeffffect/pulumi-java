// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appstream.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationS3Location {
    private final String s3Bucket;
    private final String s3Key;

    @CustomType.Constructor
    private ApplicationS3Location(
        @CustomType.Parameter("s3Bucket") String s3Bucket,
        @CustomType.Parameter("s3Key") String s3Key) {
        this.s3Bucket = s3Bucket;
        this.s3Key = s3Key;
    }

    public String s3Bucket() {
        return this.s3Bucket;
    }
    public String s3Key() {
        return this.s3Key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationS3Location defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String s3Bucket;
        private String s3Key;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationS3Location defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Bucket = defaults.s3Bucket;
    	      this.s3Key = defaults.s3Key;
        }

        public Builder s3Bucket(String s3Bucket) {
            this.s3Bucket = Objects.requireNonNull(s3Bucket);
            return this;
        }
        public Builder s3Key(String s3Key) {
            this.s3Key = Objects.requireNonNull(s3Key);
            return this;
        }        public ApplicationS3Location build() {
            return new ApplicationS3Location(s3Bucket, s3Key);
        }
    }
}
