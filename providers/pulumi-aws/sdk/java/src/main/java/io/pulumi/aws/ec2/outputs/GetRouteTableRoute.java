// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRouteTableRoute {
    /**
     * ID of the Carrier Gateway.
     * 
     */
    private final String carrierGatewayId;
    /**
     * CIDR block of the route.
     * 
     */
    private final String cidrBlock;
    /**
     * The ID of a managed prefix list destination of the route.
     * 
     */
    private final String destinationPrefixListId;
    /**
     * ID of the Egress Only Internet Gateway.
     * 
     */
    private final String egressOnlyGatewayId;
    /**
     * ID of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
     * 
     */
    private final String gatewayId;
    /**
     * EC2 instance ID.
     * 
     */
    private final String instanceId;
    /**
     * IPv6 CIDR block of the route.
     * 
     */
    private final String ipv6CidrBlock;
    /**
     * Local Gateway ID.
     * 
     */
    private final String localGatewayId;
    /**
     * NAT Gateway ID.
     * 
     */
    private final String natGatewayId;
    /**
     * ID of the elastic network interface (eni) to use.
     * 
     */
    private final String networkInterfaceId;
    /**
     * EC2 Transit Gateway ID.
     * 
     */
    private final String transitGatewayId;
    /**
     * VPC Endpoint ID.
     * 
     */
    private final String vpcEndpointId;
    /**
     * VPC Peering ID.
     * 
     */
    private final String vpcPeeringConnectionId;

    @CustomType.Constructor
    private GetRouteTableRoute(
        @CustomType.Parameter("carrierGatewayId") String carrierGatewayId,
        @CustomType.Parameter("cidrBlock") String cidrBlock,
        @CustomType.Parameter("destinationPrefixListId") String destinationPrefixListId,
        @CustomType.Parameter("egressOnlyGatewayId") String egressOnlyGatewayId,
        @CustomType.Parameter("gatewayId") String gatewayId,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("ipv6CidrBlock") String ipv6CidrBlock,
        @CustomType.Parameter("localGatewayId") String localGatewayId,
        @CustomType.Parameter("natGatewayId") String natGatewayId,
        @CustomType.Parameter("networkInterfaceId") String networkInterfaceId,
        @CustomType.Parameter("transitGatewayId") String transitGatewayId,
        @CustomType.Parameter("vpcEndpointId") String vpcEndpointId,
        @CustomType.Parameter("vpcPeeringConnectionId") String vpcPeeringConnectionId) {
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

    /**
     * ID of the Carrier Gateway.
     * 
    */
    public String carrierGatewayId() {
        return this.carrierGatewayId;
    }
    /**
     * CIDR block of the route.
     * 
    */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * The ID of a managed prefix list destination of the route.
     * 
    */
    public String destinationPrefixListId() {
        return this.destinationPrefixListId;
    }
    /**
     * ID of the Egress Only Internet Gateway.
     * 
    */
    public String egressOnlyGatewayId() {
        return this.egressOnlyGatewayId;
    }
    /**
     * ID of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
     * 
    */
    public String gatewayId() {
        return this.gatewayId;
    }
    /**
     * EC2 instance ID.
     * 
    */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * IPv6 CIDR block of the route.
     * 
    */
    public String ipv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * Local Gateway ID.
     * 
    */
    public String localGatewayId() {
        return this.localGatewayId;
    }
    /**
     * NAT Gateway ID.
     * 
    */
    public String natGatewayId() {
        return this.natGatewayId;
    }
    /**
     * ID of the elastic network interface (eni) to use.
     * 
    */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * EC2 Transit Gateway ID.
     * 
    */
    public String transitGatewayId() {
        return this.transitGatewayId;
    }
    /**
     * VPC Endpoint ID.
     * 
    */
    public String vpcEndpointId() {
        return this.vpcEndpointId;
    }
    /**
     * VPC Peering ID.
     * 
    */
    public String vpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouteTableRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String carrierGatewayId;
        private String cidrBlock;
        private String destinationPrefixListId;
        private String egressOnlyGatewayId;
        private String gatewayId;
        private String instanceId;
        private String ipv6CidrBlock;
        private String localGatewayId;
        private String natGatewayId;
        private String networkInterfaceId;
        private String transitGatewayId;
        private String vpcEndpointId;
        private String vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouteTableRoute defaults) {
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

        public Builder carrierGatewayId(String carrierGatewayId) {
            this.carrierGatewayId = Objects.requireNonNull(carrierGatewayId);
            return this;
        }
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder destinationPrefixListId(String destinationPrefixListId) {
            this.destinationPrefixListId = Objects.requireNonNull(destinationPrefixListId);
            return this;
        }
        public Builder egressOnlyGatewayId(String egressOnlyGatewayId) {
            this.egressOnlyGatewayId = Objects.requireNonNull(egressOnlyGatewayId);
            return this;
        }
        public Builder gatewayId(String gatewayId) {
            this.gatewayId = Objects.requireNonNull(gatewayId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = Objects.requireNonNull(ipv6CidrBlock);
            return this;
        }
        public Builder localGatewayId(String localGatewayId) {
            this.localGatewayId = Objects.requireNonNull(localGatewayId);
            return this;
        }
        public Builder natGatewayId(String natGatewayId) {
            this.natGatewayId = Objects.requireNonNull(natGatewayId);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder transitGatewayId(String transitGatewayId) {
            this.transitGatewayId = Objects.requireNonNull(transitGatewayId);
            return this;
        }
        public Builder vpcEndpointId(String vpcEndpointId) {
            this.vpcEndpointId = Objects.requireNonNull(vpcEndpointId);
            return this;
        }
        public Builder vpcPeeringConnectionId(String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Objects.requireNonNull(vpcPeeringConnectionId);
            return this;
        }        public GetRouteTableRoute build() {
            return new GetRouteTableRoute(carrierGatewayId, cidrBlock, destinationPrefixListId, egressOnlyGatewayId, gatewayId, instanceId, ipv6CidrBlock, localGatewayId, natGatewayId, networkInterfaceId, transitGatewayId, vpcEndpointId, vpcPeeringConnectionId);
        }
    }
}
