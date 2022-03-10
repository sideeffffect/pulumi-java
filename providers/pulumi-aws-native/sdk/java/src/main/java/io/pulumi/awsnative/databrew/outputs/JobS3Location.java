// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobS3Location {
    private final String bucket;
    private final @Nullable String bucketOwner;
    private final @Nullable String key;

    @OutputCustomType.Constructor
    private JobS3Location(
        @OutputCustomType.Parameter("bucket") String bucket,
        @OutputCustomType.Parameter("bucketOwner") @Nullable String bucketOwner,
        @OutputCustomType.Parameter("key") @Nullable String key) {
        this.bucket = bucket;
        this.bucketOwner = bucketOwner;
        this.key = key;
    }

    public String getBucket() {
        return this.bucket;
    }
    public Optional<String> getBucketOwner() {
        return Optional.ofNullable(this.bucketOwner);
    }
    public Optional<String> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobS3Location defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private @Nullable String bucketOwner;
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(JobS3Location defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketOwner = defaults.bucketOwner;
    	      this.key = defaults.key;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucketOwner(@Nullable String bucketOwner) {
            this.bucketOwner = bucketOwner;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public JobS3Location build() {
            return new JobS3Location(bucket, bucketOwner, key);
        }
    }
}
