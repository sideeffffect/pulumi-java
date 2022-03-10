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
public final class ClusterAddonsConfigCloudrunConfig {
    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
     */
    private final Boolean disabled;
    /**
     * The load balancer type of CloudRun ingress service. It is external load balancer by default.
     * Set `load_balancer_type=LOAD_BALANCER_TYPE_INTERNAL` to configure it as internal load balancer.
     * 
     */
    private final @Nullable String loadBalancerType;

    @OutputCustomType.Constructor
    private ClusterAddonsConfigCloudrunConfig(
        @OutputCustomType.Parameter("disabled") Boolean disabled,
        @OutputCustomType.Parameter("loadBalancerType") @Nullable String loadBalancerType) {
        this.disabled = disabled;
        this.loadBalancerType = loadBalancerType;
    }

    /**
     * The status of the Istio addon, which makes it easy to set up Istio for services in a
     * cluster. It is disabled by default. Set `disabled = false` to enable.
     * 
    */
    public Boolean getDisabled() {
        return this.disabled;
    }
    /**
     * The load balancer type of CloudRun ingress service. It is external load balancer by default.
     * Set `load_balancer_type=LOAD_BALANCER_TYPE_INTERNAL` to configure it as internal load balancer.
     * 
    */
    public Optional<String> getLoadBalancerType() {
        return Optional.ofNullable(this.loadBalancerType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfigCloudrunConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean disabled;
        private @Nullable String loadBalancerType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAddonsConfigCloudrunConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.loadBalancerType = defaults.loadBalancerType;
        }

        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }

        public Builder loadBalancerType(@Nullable String loadBalancerType) {
            this.loadBalancerType = loadBalancerType;
            return this;
        }
        public ClusterAddonsConfigCloudrunConfig build() {
            return new ClusterAddonsConfigCloudrunConfig(disabled, loadBalancerType);
        }
    }
}
