// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elastictranscoder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineContentConfig {
    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
     * 
     */
    private final @Nullable String bucket;
    /**
     * The Amazon S3 storage class, `Standard` or `ReducedRedundancy`, that you want Elastic Transcoder to assign to the files and playlists that it stores in your Amazon S3 bucket.
     * 
     */
    private final @Nullable String storageClass;

    @CustomType.Constructor
    private PipelineContentConfig(
        @CustomType.Parameter("bucket") @Nullable String bucket,
        @CustomType.Parameter("storageClass") @Nullable String storageClass) {
        this.bucket = bucket;
        this.storageClass = storageClass;
    }

    /**
     * The Amazon S3 bucket in which you want Elastic Transcoder to save transcoded files and playlists.
     * 
    */
    public Optional<String> bucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * The Amazon S3 storage class, `Standard` or `ReducedRedundancy`, that you want Elastic Transcoder to assign to the files and playlists that it stores in your Amazon S3 bucket.
     * 
    */
    public Optional<String> storageClass() {
        return Optional.ofNullable(this.storageClass);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineContentConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucket;
        private @Nullable String storageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineContentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.storageClass = defaults.storageClass;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }
        public Builder storageClass(@Nullable String storageClass) {
            this.storageClass = storageClass;
            return this;
        }        public PipelineContentConfig build() {
            return new PipelineContentConfig(bucket, storageClass);
        }
    }
}
