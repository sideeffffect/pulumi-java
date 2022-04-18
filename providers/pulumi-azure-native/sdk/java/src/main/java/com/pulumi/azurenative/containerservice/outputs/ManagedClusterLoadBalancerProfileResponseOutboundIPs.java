// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.azurenative.containerservice.outputs.ResourceReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterLoadBalancerProfileResponseOutboundIPs {
    /**
     * A list of public IP resources.
     * 
     */
    private final @Nullable List<ResourceReferenceResponse> publicIPs;

    @CustomType.Constructor
    private ManagedClusterLoadBalancerProfileResponseOutboundIPs(@CustomType.Parameter("publicIPs") @Nullable List<ResourceReferenceResponse> publicIPs) {
        this.publicIPs = publicIPs;
    }

    /**
     * A list of public IP resources.
     * 
    */
    public List<ResourceReferenceResponse> publicIPs() {
        return this.publicIPs == null ? List.of() : this.publicIPs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterLoadBalancerProfileResponseOutboundIPs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceReferenceResponse> publicIPs;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterLoadBalancerProfileResponseOutboundIPs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicIPs = defaults.publicIPs;
        }

        public Builder publicIPs(@Nullable List<ResourceReferenceResponse> publicIPs) {
            this.publicIPs = publicIPs;
            return this;
        }
        public Builder publicIPs(ResourceReferenceResponse... publicIPs) {
            return publicIPs(List.of(publicIPs));
        }        public ManagedClusterLoadBalancerProfileResponseOutboundIPs build() {
            return new ManagedClusterLoadBalancerProfileResponseOutboundIPs(publicIPs);
        }
    }
}
