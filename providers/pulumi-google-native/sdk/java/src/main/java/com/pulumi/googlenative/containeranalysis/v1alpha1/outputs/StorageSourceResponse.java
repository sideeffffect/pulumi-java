// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StorageSourceResponse {
    /**
     * @return Google Cloud Storage bucket containing source (see [Bucket Name Requirements] (https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    private final String bucket;
    /**
     * @return Google Cloud Storage generation for the object.
     * 
     */
    private final String generation;
    /**
     * @return Google Cloud Storage object containing source.
     * 
     */
    private final String object;

    @CustomType.Constructor
    private StorageSourceResponse(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("generation") String generation,
        @CustomType.Parameter("object") String object) {
        this.bucket = bucket;
        this.generation = generation;
        this.object = object;
    }

    /**
     * @return Google Cloud Storage bucket containing source (see [Bucket Name Requirements] (https://cloud.google.com/storage/docs/bucket-naming#requirements)).
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Google Cloud Storage generation for the object.
     * 
     */
    public String generation() {
        return this.generation;
    }
    /**
     * @return Google Cloud Storage object containing source.
     * 
     */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String generation;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder generation(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }        public StorageSourceResponse build() {
            return new StorageSourceResponse(bucket, generation, object);
        }
    }
}
