// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for controlling master global access settings.
 * 
 */
public final class PrivateClusterMasterGlobalAccessConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateClusterMasterGlobalAccessConfigResponse Empty = new PrivateClusterMasterGlobalAccessConfigResponse();

    /**
     * Whenever master is accessible globally or not.
     * 
     */
    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public PrivateClusterMasterGlobalAccessConfigResponse(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private PrivateClusterMasterGlobalAccessConfigResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateClusterMasterGlobalAccessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateClusterMasterGlobalAccessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public PrivateClusterMasterGlobalAccessConfigResponse build() {
            return new PrivateClusterMasterGlobalAccessConfigResponse(enabled);
        }
    }
}
