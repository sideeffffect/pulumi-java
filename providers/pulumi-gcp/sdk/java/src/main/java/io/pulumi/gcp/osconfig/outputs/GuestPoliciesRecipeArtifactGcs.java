// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GuestPoliciesRecipeArtifactGcs {
    /**
     * Bucket of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
     * this value would be my-bucket.
     * 
     */
    private final @Nullable String bucket;
    /**
     * Must be provided if allowInsecure is false. Generation number of the Google Cloud Storage object.
     * https://storage.googleapis.com/my-bucket/foo/bar#1234567 this value would be 1234567.
     * 
     */
    private final @Nullable Integer generation;
    /**
     * Name of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
     * this value would be foo/bar.
     * 
     */
    private final @Nullable String object;

    @OutputCustomType.Constructor
    private GuestPoliciesRecipeArtifactGcs(
        @OutputCustomType.Parameter("bucket") @Nullable String bucket,
        @OutputCustomType.Parameter("generation") @Nullable Integer generation,
        @OutputCustomType.Parameter("object") @Nullable String object) {
        this.bucket = bucket;
        this.generation = generation;
        this.object = object;
    }

    /**
     * Bucket of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
     * this value would be my-bucket.
     * 
    */
    public Optional<String> getBucket() {
        return Optional.ofNullable(this.bucket);
    }
    /**
     * Must be provided if allowInsecure is false. Generation number of the Google Cloud Storage object.
     * https://storage.googleapis.com/my-bucket/foo/bar#1234567 this value would be 1234567.
     * 
    */
    public Optional<Integer> getGeneration() {
        return Optional.ofNullable(this.generation);
    }
    /**
     * Name of the Google Cloud Storage object. Given an example URL: https://storage.googleapis.com/my-bucket/foo/bar#1234567
     * this value would be foo/bar.
     * 
    */
    public Optional<String> getObject() {
        return Optional.ofNullable(this.object);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeArtifactGcs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bucket;
        private @Nullable Integer generation;
        private @Nullable String object;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestPoliciesRecipeArtifactGcs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder generation(@Nullable Integer generation) {
            this.generation = generation;
            return this;
        }

        public Builder object(@Nullable String object) {
            this.object = object;
            return this;
        }
        public GuestPoliciesRecipeArtifactGcs build() {
            return new GuestPoliciesRecipeArtifactGcs(bucket, generation, object);
        }
    }
}
