// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies a file available as a Cloud Storage Object.
 * 
 */
public final class OSPolicyResourceFileGcsResponse extends io.pulumi.resources.InvokeArgs {

    public static final OSPolicyResourceFileGcsResponse Empty = new OSPolicyResourceFileGcsResponse();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    @InputImport(name="generation", required=true)
      private final String generation;

    public String getGeneration() {
        return this.generation;
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @InputImport(name="object", required=true)
      private final String object;

    public String getObject() {
        return this.object;
    }

    public OSPolicyResourceFileGcsResponse(
        String bucket,
        String generation,
        String object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = Objects.requireNonNull(generation, "expected parameter 'generation' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private OSPolicyResourceFileGcsResponse() {
        this.bucket = null;
        this.generation = null;
        this.object = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileGcsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String generation;
        private String object;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileGcsResponse defaults) {
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
        }
        public OSPolicyResourceFileGcsResponse build() {
            return new OSPolicyResourceFileGcsResponse(bucket, generation, object);
        }
    }
}
