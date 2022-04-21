// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.inputs;

import com.pulumi.azurenative.containerservice.inputs.ResourceReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Desired outbound IP Prefix resources for the cluster load balancer.
 * 
 */
public final class ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes extends com.pulumi.resources.InvokeArgs {

    public static final ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes Empty = new ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes();

    /**
     * A list of public IP prefix resources.
     * 
     */
    @Import(name="publicIPPrefixes")
    private @Nullable List<ResourceReferenceResponse> publicIPPrefixes;

    public Optional<List<ResourceReferenceResponse>> publicIPPrefixes() {
        return Optional.ofNullable(this.publicIPPrefixes);
    }

    private ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes() {}

    private ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes(ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes $) {
        this.publicIPPrefixes = $.publicIPPrefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes $;

        public Builder() {
            $ = new ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes();
        }

        public Builder(ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes defaults) {
            $ = new ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes(Objects.requireNonNull(defaults));
        }

        public Builder publicIPPrefixes(@Nullable List<ResourceReferenceResponse> publicIPPrefixes) {
            $.publicIPPrefixes = publicIPPrefixes;
            return this;
        }

        public Builder publicIPPrefixes(ResourceReferenceResponse... publicIPPrefixes) {
            return publicIPPrefixes(List.of(publicIPPrefixes));
        }

        public ManagedClusterLoadBalancerProfileResponseOutboundIPPrefixes build() {
            return $;
        }
    }

}
