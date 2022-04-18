// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies a file available as a Cloud Storage Object.
 * 
 */
public final class OSPolicyResourceFileGcsArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceFileGcsArgs Empty = new OSPolicyResourceFileGcsArgs();

    /**
     * Bucket of the Cloud Storage object.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * Generation number of the Cloud Storage object.
     * 
     */
    @Import(name="generation")
      private final @Nullable Output<String> generation;

    public Output<String> generation() {
        return this.generation == null ? Codegen.empty() : this.generation;
    }

    /**
     * Name of the Cloud Storage object.
     * 
     */
    @Import(name="object", required=true)
      private final Output<String> object;

    public Output<String> object() {
        return this.object;
    }

    public OSPolicyResourceFileGcsArgs(
        Output<String> bucket,
        @Nullable Output<String> generation,
        Output<String> object) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.generation = generation;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
    }

    private OSPolicyResourceFileGcsArgs() {
        this.bucket = Codegen.empty();
        this.generation = Codegen.empty();
        this.object = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileGcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<String> generation;
        private Output<String> object;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileGcsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder generation(@Nullable Output<String> generation) {
            this.generation = generation;
            return this;
        }
        public Builder generation(@Nullable String generation) {
            this.generation = Codegen.ofNullable(generation);
            return this;
        }
        public Builder object(Output<String> object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder object(String object) {
            this.object = Output.of(Objects.requireNonNull(object));
            return this;
        }        public OSPolicyResourceFileGcsArgs build() {
            return new OSPolicyResourceFileGcsArgs(bucket, generation, object);
        }
    }
}
