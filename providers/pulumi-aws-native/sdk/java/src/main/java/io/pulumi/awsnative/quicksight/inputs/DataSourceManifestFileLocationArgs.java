// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * <p>Amazon S3 manifest file location.</p>
 * 
 */
public final class DataSourceManifestFileLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceManifestFileLocationArgs Empty = new DataSourceManifestFileLocationArgs();

    /**
     * <p>Amazon S3 bucket.</p>
     * 
     */
    @InputImport(name="bucket", required=true)
      private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * <p>Amazon S3 key that identifies an object.</p>
     * 
     */
    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    public DataSourceManifestFileLocationArgs(
        Input<String> bucket,
        Input<String> key) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private DataSourceManifestFileLocationArgs() {
        this.bucket = Input.empty();
        this.key = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceManifestFileLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> key;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceManifestFileLocationArgs defaults) {
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
        public DataSourceManifestFileLocationArgs build() {
            return new DataSourceManifestFileLocationArgs(bucket, key);
        }
    }
}
