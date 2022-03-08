// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class SslPolicyWarningsItemDataItemResponse {
    /**
     * A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
     * 
     */
    private final String key;
    /**
     * A warning data value corresponding to the key.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"key","value"})
    private SslPolicyWarningsItemDataItemResponse(
        String key,
        String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * A key that provides more detail on the warning being returned. For example, for warnings where there are no results in a list request for a particular zone, this key might be scope and the key value might be the zone name. Other examples might be a key indicating a deprecated resource and a suggested replacement, or a warning about invalid network settings (for example, if an instance attempts to perform IP forwarding but is not enabled for IP forwarding).
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * A warning data value corresponding to the key.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslPolicyWarningsItemDataItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SslPolicyWarningsItemDataItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SslPolicyWarningsItemDataItemResponse build() {
            return new SslPolicyWarningsItemDataItemResponse(key, value);
        }
    }
}
