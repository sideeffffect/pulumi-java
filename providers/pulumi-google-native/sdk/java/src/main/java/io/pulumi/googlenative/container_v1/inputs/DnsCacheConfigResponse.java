// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for NodeLocal DNSCache
 * 
 */
public final class DnsCacheConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final DnsCacheConfigResponse Empty = new DnsCacheConfigResponse();

    /**
     * Whether NodeLocal DNSCache is enabled for this cluster.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public DnsCacheConfigResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private DnsCacheConfigResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsCacheConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsCacheConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public DnsCacheConfigResponse build() {
            return new DnsCacheConfigResponse(enabled);
        }
    }
}
