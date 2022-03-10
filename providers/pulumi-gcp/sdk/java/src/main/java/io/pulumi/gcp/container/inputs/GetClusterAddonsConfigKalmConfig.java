// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetClusterAddonsConfigKalmConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterAddonsConfigKalmConfig Empty = new GetClusterAddonsConfigKalmConfig();

    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetClusterAddonsConfigKalmConfig(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GetClusterAddonsConfigKalmConfig() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAddonsConfigKalmConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAddonsConfigKalmConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetClusterAddonsConfigKalmConfig build() {
            return new GetClusterAddonsConfigKalmConfig(enabled);
        }
    }
}
