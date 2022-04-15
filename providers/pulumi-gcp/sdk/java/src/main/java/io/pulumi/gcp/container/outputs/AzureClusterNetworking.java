// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AzureClusterNetworking {
    /**
     * Required. The IP address range of the pods in this cluster, in CIDR notation (e.g. `10.96.0.0/14`). All pods in the cluster get assigned a unique RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    private final List<String> podAddressCidrBlocks;
    /**
     * Required. The IP address range for services in this cluster, in CIDR notation (e.g. `10.96.0.0/14`). All services in the cluster get assigned a unique RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creating a cluster.
     * 
     */
    private final List<String> serviceAddressCidrBlocks;
    /**
     * Required. The Azure Resource Manager (ARM) ID of the VNet associated with your cluster. All components in the cluster (i.e. control plane and node pools) run on a single VNet. Example: `/subscriptions/*{@literal /}resourceGroups/*{@literal /}providers/Microsoft.Network/virtualNetworks/*` This field cannot be changed after creation.
     * 
     */
    private final String virtualNetworkId;

    @CustomType.Constructor
    private AzureClusterNetworking(
        @CustomType.Parameter("podAddressCidrBlocks") List<String> podAddressCidrBlocks,
        @CustomType.Parameter("serviceAddressCidrBlocks") List<String> serviceAddressCidrBlocks,
        @CustomType.Parameter("virtualNetworkId") String virtualNetworkId) {
        this.podAddressCidrBlocks = podAddressCidrBlocks;
        this.serviceAddressCidrBlocks = serviceAddressCidrBlocks;
        this.virtualNetworkId = virtualNetworkId;
    }

    /**
     * Required. The IP address range of the pods in this cluster, in CIDR notation (e.g. `10.96.0.0/14`). All pods in the cluster get assigned a unique RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
    */
    public List<String> podAddressCidrBlocks() {
        return this.podAddressCidrBlocks;
    }
    /**
     * Required. The IP address range for services in this cluster, in CIDR notation (e.g. `10.96.0.0/14`). All services in the cluster get assigned a unique RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creating a cluster.
     * 
    */
    public List<String> serviceAddressCidrBlocks() {
        return this.serviceAddressCidrBlocks;
    }
    /**
     * Required. The Azure Resource Manager (ARM) ID of the VNet associated with your cluster. All components in the cluster (i.e. control plane and node pools) run on a single VNet. Example: `/subscriptions/*{@literal /}resourceGroups/*{@literal /}providers/Microsoft.Network/virtualNetworks/*` This field cannot be changed after creation.
     * 
    */
    public String virtualNetworkId() {
        return this.virtualNetworkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterNetworking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> podAddressCidrBlocks;
        private List<String> serviceAddressCidrBlocks;
        private String virtualNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterNetworking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podAddressCidrBlocks = defaults.podAddressCidrBlocks;
    	      this.serviceAddressCidrBlocks = defaults.serviceAddressCidrBlocks;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
        }

        public Builder podAddressCidrBlocks(List<String> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks);
            return this;
        }
        public Builder podAddressCidrBlocks(String... podAddressCidrBlocks) {
            return podAddressCidrBlocks(List.of(podAddressCidrBlocks));
        }
        public Builder serviceAddressCidrBlocks(List<String> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks);
            return this;
        }
        public Builder serviceAddressCidrBlocks(String... serviceAddressCidrBlocks) {
            return serviceAddressCidrBlocks(List.of(serviceAddressCidrBlocks));
        }
        public Builder virtualNetworkId(String virtualNetworkId) {
            this.virtualNetworkId = Objects.requireNonNull(virtualNetworkId);
            return this;
        }        public AzureClusterNetworking build() {
            return new AzureClusterNetworking(podAddressCidrBlocks, serviceAddressCidrBlocks, virtualNetworkId);
        }
    }
}
