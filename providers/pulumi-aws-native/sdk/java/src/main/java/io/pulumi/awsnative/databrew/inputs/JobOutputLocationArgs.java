// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Output location
 * 
 */
public final class JobOutputLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobOutputLocationArgs Empty = new JobOutputLocationArgs();

    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    @InputImport(name="bucketOwner")
      private final @Nullable Input<String> bucketOwner;

    public Input<String> getBucketOwner() {
        return this.bucketOwner == null ? Input.empty() : this.bucketOwner;
    }

    @InputImport(name="key")
      private final @Nullable Input<String> key;

    public Input<String> getKey() {
        return this.key == null ? Input.empty() : this.key;
    }

    public JobOutputLocationArgs(
        Input<String> bucket,
        @Nullable Input<String> bucketOwner,
        @Nullable Input<String> key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.bucketOwner = bucketOwner;
        this.key = key;
    }

    private JobOutputLocationArgs() {
        this.bucket = Input.empty();
        this.bucketOwner = Input.empty();
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<String> bucketOwner;
        private @Nullable Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.bucketOwner = defaults.bucketOwner;
    	      this.key = defaults.key;
        }

        public Builder bucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder bucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder bucketOwner(@Nullable Input<String> bucketOwner) {
            this.bucketOwner = bucketOwner;
            return this;
        }

        public Builder bucketOwner(@Nullable String bucketOwner) {
            this.bucketOwner = Input.ofNullable(bucketOwner);
            return this;
        }

        public Builder key(@Nullable Input<String> key) {
            this.key = key;
            return this;
        }

        public Builder key(@Nullable String key) {
            this.key = Input.ofNullable(key);
            return this;
        }
        public JobOutputLocationArgs build() {
            return new JobOutputLocationArgs(bucket, bucketOwner, key);
        }
    }
}
