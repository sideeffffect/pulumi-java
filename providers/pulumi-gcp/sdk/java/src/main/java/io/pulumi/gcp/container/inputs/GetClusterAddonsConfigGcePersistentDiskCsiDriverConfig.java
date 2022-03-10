// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig Empty = new GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig();

    @InputImport(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig(Boolean enabled) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig build() {
            return new GetClusterAddonsConfigGcePersistentDiskCsiDriverConfig(enabled);
        }
    }
}
