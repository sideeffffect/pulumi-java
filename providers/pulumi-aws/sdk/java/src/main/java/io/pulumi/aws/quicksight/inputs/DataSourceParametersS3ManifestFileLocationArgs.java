// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersS3ManifestFileLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersS3ManifestFileLocationArgs Empty = new DataSourceParametersS3ManifestFileLocationArgs();

    /**
     * The name of the bucket that contains the manifest file.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * The key of the manifest file within the bucket.
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    public DataSourceParametersS3ManifestFileLocationArgs(
        Input<String> bucket,
        Input<String> key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private DataSourceParametersS3ManifestFileLocationArgs() {
        this.bucket = Input.empty();
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersS3ManifestFileLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersS3ManifestFileLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
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

        public Builder key(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }
        public DataSourceParametersS3ManifestFileLocationArgs build() {
            return new DataSourceParametersS3ManifestFileLocationArgs(bucket, key);
        }
    }
}
