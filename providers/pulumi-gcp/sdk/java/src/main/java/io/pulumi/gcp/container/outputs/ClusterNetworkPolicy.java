// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterNetworkPolicy {
    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
     */
    private final Boolean enabled;
    /**
     * The selected network policy provider. Defaults to PROVIDER_UNSPECIFIED.
     * 
     */
    private final @Nullable String provider;

    @OutputCustomType.Constructor({"enabled","provider"})
    private ClusterNetworkPolicy(
        Boolean enabled,
        @Nullable String provider) {
        this.enabled = enabled;
        this.provider = provider;
    }

    /**
     * Enable the PodSecurityPolicy controller for this cluster.
     * If enabled, pods must be valid under a PodSecurityPolicy to be created.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * The selected network policy provider. Defaults to PROVIDER_UNSPECIFIED.
     * 
    */
    public Optional<String> getProvider() {
        return Optional.ofNullable(this.provider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNetworkPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private @Nullable String provider;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNetworkPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.provider = defaults.provider;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setProvider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }
        public ClusterNetworkPolicy build() {
            return new ClusterNetworkPolicy(enabled, provider);
        }
    }
}
