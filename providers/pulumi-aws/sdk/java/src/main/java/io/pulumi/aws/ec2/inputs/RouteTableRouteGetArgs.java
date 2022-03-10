// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteTableRouteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteTableRouteGetArgs Empty = new RouteTableRouteGetArgs();

    /**
     * Identifier of a carrier gateway. This attribute can only be used when the VPC contains a subnet which is associated with a Wavelength Zone.
     * 
     */
    @InputImport(name="carrierGatewayId")
      private final @Nullable Input<String> carrierGatewayId;

    public Input<String> getCarrierGatewayId() {
        return this.carrierGatewayId == null ? Input.empty() : this.carrierGatewayId;
    }

    /**
     * The CIDR block of the route.
     * 
     */
    @InputImport(name="cidrBlock")
      private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * The ID of a managed prefix list destination of the route.
     * 
     */
    @InputImport(name="destinationPrefixListId")
      private final @Nullable Input<String> destinationPrefixListId;

    public Input<String> getDestinationPrefixListId() {
        return this.destinationPrefixListId == null ? Input.empty() : this.destinationPrefixListId;
    }

    /**
     * Identifier of a VPC Egress Only Internet Gateway.
     * 
     */
    @InputImport(name="egressOnlyGatewayId")
      private final @Nullable Input<String> egressOnlyGatewayId;

    public Input<String> getEgressOnlyGatewayId() {
        return this.egressOnlyGatewayId == null ? Input.empty() : this.egressOnlyGatewayId;
    }

    /**
     * Identifier of a VPC internet gateway or a virtual private gateway.
     * 
     */
    @InputImport(name="gatewayId")
      private final @Nullable Input<String> gatewayId;

    public Input<String> getGatewayId() {
        return this.gatewayId == null ? Input.empty() : this.gatewayId;
    }

    /**
     * Identifier of an EC2 instance.
     * 
     */
    @InputImport(name="instanceId")
      private final @Nullable Input<String> instanceId;

    public Input<String> getInstanceId() {
        return this.instanceId == null ? Input.empty() : this.instanceId;
    }

    /**
     * The Ipv6 CIDR block of the route.
     * 
     */
    @InputImport(name="ipv6CidrBlock")
      private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

    /**
     * Identifier of a Outpost local gateway.
     * 
     */
    @InputImport(name="localGatewayId")
      private final @Nullable Input<String> localGatewayId;

    public Input<String> getLocalGatewayId() {
        return this.localGatewayId == null ? Input.empty() : this.localGatewayId;
    }

    /**
     * Identifier of a VPC NAT gateway.
     * 
     */
    @InputImport(name="natGatewayId")
      private final @Nullable Input<String> natGatewayId;

    public Input<String> getNatGatewayId() {
        return this.natGatewayId == null ? Input.empty() : this.natGatewayId;
    }

    /**
     * Identifier of an EC2 network interface.
     * 
     */
    @InputImport(name="networkInterfaceId")
      private final @Nullable Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Input.empty() : this.networkInterfaceId;
    }

    /**
     * Identifier of an EC2 Transit Gateway.
     * 
     */
    @InputImport(name="transitGatewayId")
      private final @Nullable Input<String> transitGatewayId;

    public Input<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Input.empty() : this.transitGatewayId;
    }

    /**
     * Identifier of a VPC Endpoint.
     * 
     */
    @InputImport(name="vpcEndpointId")
      private final @Nullable Input<String> vpcEndpointId;

    public Input<String> getVpcEndpointId() {
        return this.vpcEndpointId == null ? Input.empty() : this.vpcEndpointId;
    }

    /**
     * Identifier of a VPC peering connection.
     * 
     */
    @InputImport(name="vpcPeeringConnectionId")
      private final @Nullable Input<String> vpcPeeringConnectionId;

    public Input<String> getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId == null ? Input.empty() : this.vpcPeeringConnectionId;
    }

    public RouteTableRouteGetArgs(
        @Nullable Input<String> carrierGatewayId,
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> destinationPrefixListId,
        @Nullable Input<String> egressOnlyGatewayId,
        @Nullable Input<String> gatewayId,
        @Nullable Input<String> instanceId,
        @Nullable Input<String> ipv6CidrBlock,
        @Nullable Input<String> localGatewayId,
        @Nullable Input<String> natGatewayId,
        @Nullable Input<String> networkInterfaceId,
        @Nullable Input<String> transitGatewayId,
        @Nullable Input<String> vpcEndpointId,
        @Nullable Input<String> vpcPeeringConnectionId) {
        this.carrierGatewayId = carrierGatewayId;
        this.cidrBlock = cidrBlock;
        this.destinationPrefixListId = destinationPrefixListId;
        this.egressOnlyGatewayId = egressOnlyGatewayId;
        this.gatewayId = gatewayId;
        this.instanceId = instanceId;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.localGatewayId = localGatewayId;
        this.natGatewayId = natGatewayId;
        this.networkInterfaceId = networkInterfaceId;
        this.transitGatewayId = transitGatewayId;
        this.vpcEndpointId = vpcEndpointId;
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    private RouteTableRouteGetArgs() {
        this.carrierGatewayId = Input.empty();
        this.cidrBlock = Input.empty();
        this.destinationPrefixListId = Input.empty();
        this.egressOnlyGatewayId = Input.empty();
        this.gatewayId = Input.empty();
        this.instanceId = Input.empty();
        this.ipv6CidrBlock = Input.empty();
        this.localGatewayId = Input.empty();
        this.natGatewayId = Input.empty();
        this.networkInterfaceId = Input.empty();
        this.transitGatewayId = Input.empty();
        this.vpcEndpointId = Input.empty();
        this.vpcPeeringConnectionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableRouteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> carrierGatewayId;
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> destinationPrefixListId;
        private @Nullable Input<String> egressOnlyGatewayId;
        private @Nullable Input<String> gatewayId;
        private @Nullable Input<String> instanceId;
        private @Nullable Input<String> ipv6CidrBlock;
        private @Nullable Input<String> localGatewayId;
        private @Nullable Input<String> natGatewayId;
        private @Nullable Input<String> networkInterfaceId;
        private @Nullable Input<String> transitGatewayId;
        private @Nullable Input<String> vpcEndpointId;
        private @Nullable Input<String> vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableRouteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.carrierGatewayId = defaults.carrierGatewayId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.destinationPrefixListId = defaults.destinationPrefixListId;
    	      this.egressOnlyGatewayId = defaults.egressOnlyGatewayId;
    	      this.gatewayId = defaults.gatewayId;
    	      this.instanceId = defaults.instanceId;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.natGatewayId = defaults.natGatewayId;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.transitGatewayId = defaults.transitGatewayId;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder carrierGatewayId(@Nullable Input<String> carrierGatewayId) {
            this.carrierGatewayId = carrierGatewayId;
            return this;
        }

        public Builder carrierGatewayId(@Nullable String carrierGatewayId) {
            this.carrierGatewayId = Input.ofNullable(carrierGatewayId);
            return this;
        }

        public Builder cidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder destinationPrefixListId(@Nullable Input<String> destinationPrefixListId) {
            this.destinationPrefixListId = destinationPrefixListId;
            return this;
        }

        public Builder destinationPrefixListId(@Nullable String destinationPrefixListId) {
            this.destinationPrefixListId = Input.ofNullable(destinationPrefixListId);
            return this;
        }

        public Builder egressOnlyGatewayId(@Nullable Input<String> egressOnlyGatewayId) {
            this.egressOnlyGatewayId = egressOnlyGatewayId;
            return this;
        }

        public Builder egressOnlyGatewayId(@Nullable String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = Input.ofNullable(egressOnlyGatewayId);
            return this;
        }

        public Builder gatewayId(@Nullable Input<String> gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        public Builder gatewayId(@Nullable String gatewayId) {
            this.gatewayId = Input.ofNullable(gatewayId);
            return this;
        }

        public Builder instanceId(@Nullable Input<String> instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public Builder instanceId(@Nullable String instanceId) {
            this.instanceId = Input.ofNullable(instanceId);
            return this;
        }

        public Builder ipv6CidrBlock(@Nullable Input<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Input.ofNullable(ipv6CidrBlock);
            return this;
        }

        public Builder localGatewayId(@Nullable Input<String> localGatewayId) {
            this.localGatewayId = localGatewayId;
            return this;
        }

        public Builder localGatewayId(@Nullable String localGatewayId) {
            this.localGatewayId = Input.ofNullable(localGatewayId);
            return this;
        }

        public Builder natGatewayId(@Nullable Input<String> natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }

        public Builder natGatewayId(@Nullable String natGatewayId) {
            this.natGatewayId = Input.ofNullable(natGatewayId);
            return this;
        }

        public Builder networkInterfaceId(@Nullable Input<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Input.ofNullable(networkInterfaceId);
            return this;
        }

        public Builder transitGatewayId(@Nullable Input<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Input.ofNullable(transitGatewayId);
            return this;
        }

        public Builder vpcEndpointId(@Nullable Input<String> vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = Input.ofNullable(vpcEndpointId);
            return this;
        }

        public Builder vpcPeeringConnectionId(@Nullable Input<String> vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return this;
        }

        public Builder vpcPeeringConnectionId(@Nullable String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Input.ofNullable(vpcPeeringConnectionId);
            return this;
        }
        public RouteTableRouteGetArgs build() {
            return new RouteTableRouteGetArgs(carrierGatewayId, cidrBlock, destinationPrefixListId, egressOnlyGatewayId, gatewayId, instanceId, ipv6CidrBlock, localGatewayId, natGatewayId, networkInterfaceId, transitGatewayId, vpcEndpointId, vpcPeeringConnectionId);
        }
    }
}
