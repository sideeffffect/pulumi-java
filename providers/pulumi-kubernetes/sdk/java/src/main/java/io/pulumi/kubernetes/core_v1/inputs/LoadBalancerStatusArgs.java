// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.LoadBalancerIngressArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * LoadBalancerStatus represents the status of a load-balancer.
 * 
 */
public final class LoadBalancerStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoadBalancerStatusArgs Empty = new LoadBalancerStatusArgs();

    /**
     * Ingress is a list containing ingress points for the load-balancer. Traffic intended for the service should be sent to these ingress points.
     * 
     */
    @InputImport(name="ingress")
      private final @Nullable Input<List<LoadBalancerIngressArgs>> ingress;

    public Input<List<LoadBalancerIngressArgs>> getIngress() {
        return this.ingress == null ? Input.empty() : this.ingress;
    }

    public LoadBalancerStatusArgs(@Nullable Input<List<LoadBalancerIngressArgs>> ingress) {
        this.ingress = ingress;
    }

    private LoadBalancerStatusArgs() {
        this.ingress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<LoadBalancerIngressArgs>> ingress;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingress = defaults.ingress;
        }

        public Builder ingress(@Nullable Input<List<LoadBalancerIngressArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }

        public Builder ingress(@Nullable List<LoadBalancerIngressArgs> ingress) {
            this.ingress = Input.ofNullable(ingress);
            return this;
        }
        public LoadBalancerStatusArgs build() {
            return new LoadBalancerStatusArgs(ingress);
        }
    }
}
