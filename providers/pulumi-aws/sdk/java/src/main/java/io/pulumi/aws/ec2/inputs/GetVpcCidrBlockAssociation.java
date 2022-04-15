// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVpcCidrBlockAssociation extends io.pulumi.resources.InvokeArgs {

    public static final GetVpcCidrBlockAssociation Empty = new GetVpcCidrBlockAssociation();

    /**
     * The association ID for the the IPv4 CIDR block.
     * 
     */
    @Import(name="associationId", required=true)
      private final String associationId;

    public String associationId() {
        return this.associationId;
    }

    /**
     * The cidr block of the desired VPC.
     * 
     */
    @Import(name="cidrBlock", required=true)
      private final String cidrBlock;

    public String cidrBlock() {
        return this.cidrBlock;
    }

    /**
     * The current state of the desired VPC.
     * Can be either `"pending"` or `"available"`.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    public GetVpcCidrBlockAssociation(
        String associationId,
        String cidrBlock,
        String state) {
        this.associationId = Objects.requireNonNull(associationId, "expected parameter 'associationId' to be non-null");
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private GetVpcCidrBlockAssociation() {
        this.associationId = null;
        this.cidrBlock = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcCidrBlockAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String associationId;
        private String cidrBlock;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcCidrBlockAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associationId = defaults.associationId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.state = defaults.state;
        }

        public Builder associationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetVpcCidrBlockAssociation build() {
            return new GetVpcCidrBlockAssociation(associationId, cidrBlock, state);
        }
    }
}
