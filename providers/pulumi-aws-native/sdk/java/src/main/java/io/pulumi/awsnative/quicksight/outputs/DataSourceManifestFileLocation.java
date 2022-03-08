// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceManifestFileLocation {
    /**
     * <p>Amazon S3 bucket.</p>
     * 
     */
    private final String bucket;
    /**
     * <p>Amazon S3 key that identifies an object.</p>
     * 
     */
    private final String key;

    @OutputCustomType.Constructor({"bucket","key"})
    private DataSourceManifestFileLocation(
        String bucket,
        String key) {
        this.bucket = bucket;
        this.key = key;
    }

    /**
     * <p>Amazon S3 bucket.</p>
     * 
    */
    public String getBucket() {
        return this.bucket;
    }
    /**
     * <p>Amazon S3 key that identifies an object.</p>
     * 
    */
    public String getKey() {
        return this.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceManifestFileLocation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String key;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceManifestFileLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public DataSourceManifestFileLocation build() {
            return new DataSourceManifestFileLocation(bucket, key);
        }
    }
}
