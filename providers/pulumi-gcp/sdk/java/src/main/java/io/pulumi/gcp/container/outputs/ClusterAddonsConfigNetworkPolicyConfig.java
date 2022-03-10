// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ClusterAddonsConfigNetworkPolicyConfig {
    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    private final Boolean disabled;

    @OutputCustomType.Constructor
    private ClusterAddonsConfigNetworkPolicyConfig(@OutputCustomType.Parameter("disabled") Boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigNetworkPolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigNetworkPolicyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        public ClusterAddonsConfigNetworkPolicyConfig build() {
            return new ClusterAddonsConfigNetworkPolicyConfig(disabled);
        }
    }
}
