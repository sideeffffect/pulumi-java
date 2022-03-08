// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AwsClusterNetworking {
    /**
     * Required. All pods in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    private final List<String> podAddressCidrBlocks;
    /**
     * Required. All services in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
     */
    private final List<String> serviceAddressCidrBlocks;
    /**
     * Required. The VPC associated with the cluster. All component clusters (i.e. control plane and node pools) run on a single VPC. This field cannot be changed after creation.
     * 
     */
    private final String vpcId;

    @OutputCustomType.Constructor({"podAddressCidrBlocks","serviceAddressCidrBlocks","vpcId"})
    private AwsClusterNetworking(
        List<String> podAddressCidrBlocks,
        List<String> serviceAddressCidrBlocks,
        String vpcId) {
        this.podAddressCidrBlocks = podAddressCidrBlocks;
        this.serviceAddressCidrBlocks = serviceAddressCidrBlocks;
        this.vpcId = vpcId;
    }

    /**
     * Required. All pods in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
    */
    public List<String> getPodAddressCidrBlocks() {
        return this.podAddressCidrBlocks;
    }
    /**
     * Required. All services in the cluster are assigned an RFC1918 IPv4 address from these ranges. Only a single range is supported. This field cannot be changed after creation.
     * 
    */
    public List<String> getServiceAddressCidrBlocks() {
        return this.serviceAddressCidrBlocks;
    }
    /**
     * Required. The VPC associated with the cluster. All component clusters (i.e. control plane and node pools) run on a single VPC. This field cannot be changed after creation.
     * 
    */
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterNetworking defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> podAddressCidrBlocks;
        private List<String> serviceAddressCidrBlocks;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsClusterNetworking defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podAddressCidrBlocks = defaults.podAddressCidrBlocks;
    	      this.serviceAddressCidrBlocks = defaults.serviceAddressCidrBlocks;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setPodAddressCidrBlocks(List<String> podAddressCidrBlocks) {
            this.podAddressCidrBlocks = Objects.requireNonNull(podAddressCidrBlocks);
            return this;
        }

        public Builder setServiceAddressCidrBlocks(List<String> serviceAddressCidrBlocks) {
            this.serviceAddressCidrBlocks = Objects.requireNonNull(serviceAddressCidrBlocks);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public AwsClusterNetworking build() {
            return new AwsClusterNetworking(podAddressCidrBlocks, serviceAddressCidrBlocks, vpcId);
        }
    }
}
