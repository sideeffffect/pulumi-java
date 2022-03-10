// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emrcontainers.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An arbitrary set of tags (key-value pairs) for this virtual cluster.
 * 
 */
public final class VirtualClusterTag extends io.pulumi.resources.InvokeArgs {

    public static final VirtualClusterTag Empty = new VirtualClusterTag();

    /**
     * The key name of the tag. You can specify a value that is 1 to 127 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    @InputImport(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    /**
     * The value for the tag. You can specify a value that is 1 to 255 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    @InputImport(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public VirtualClusterTag(
        String key,
        String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private VirtualClusterTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterTag defaults) {
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
        public VirtualClusterTag build() {
            return new VirtualClusterTag(key, value);
        }
    }
}
