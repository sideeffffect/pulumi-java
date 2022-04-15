// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVpcPeeringConnectionPeerCidrBlockSet extends io.pulumi.resources.InvokeArgs {

    public static final GetVpcPeeringConnectionPeerCidrBlockSet Empty = new GetVpcPeeringConnectionPeerCidrBlockSet();

    /**
     * The primary CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
     * 
     */
    @Import(name="cidrBlock", required=true)
      private final String cidrBlock;

    public String cidrBlock() {
        return this.cidrBlock;
    }

    public GetVpcPeeringConnectionPeerCidrBlockSet(String cidrBlock) {
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
    }

    private GetVpcPeeringConnectionPeerCidrBlockSet() {
        this.cidrBlock = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcPeeringConnectionPeerCidrBlockSet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cidrBlock;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcPeeringConnectionPeerCidrBlockSet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
        }

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }        public GetVpcPeeringConnectionPeerCidrBlockSet build() {
            return new GetVpcPeeringConnectionPeerCidrBlockSet(cidrBlock);
        }
    }
}
