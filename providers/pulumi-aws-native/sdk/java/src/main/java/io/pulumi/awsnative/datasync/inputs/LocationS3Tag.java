// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class LocationS3Tag extends io.pulumi.resources.InvokeArgs {

    public static final LocationS3Tag Empty = new LocationS3Tag();

    /**
     * The key for an AWS resource tag.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * The value for an AWS resource tag.
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public LocationS3Tag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private LocationS3Tag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationS3Tag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationS3Tag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public LocationS3Tag build() {
            return new LocationS3Tag(key, value);
        }
    }
}
