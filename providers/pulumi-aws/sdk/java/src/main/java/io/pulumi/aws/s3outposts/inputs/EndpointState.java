// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3outposts.inputs;

import io.pulumi.aws.s3outposts.inputs.EndpointNetworkInterfaceGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointState extends io.pulumi.resources.ResourceArgs {

    public static final EndpointState Empty = new EndpointState();

    /**
     * Amazon Resource Name (ARN) of the endpoint.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * VPC CIDR block of the endpoint.
     * 
     */
    @InputImport(name="cidrBlock")
      private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    /**
     * UTC creation time in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
     * 
     */
    @InputImport(name="creationTime")
      private final @Nullable Input<String> creationTime;

    public Input<String> getCreationTime() {
        return this.creationTime == null ? Input.empty() : this.creationTime;
    }

    /**
     * Set of nested attributes for associated Elastic Network Interfaces (ENIs).
     * 
     */
    @InputImport(name="networkInterfaces")
      private final @Nullable Input<List<EndpointNetworkInterfaceGetArgs>> networkInterfaces;

    public Input<List<EndpointNetworkInterfaceGetArgs>> getNetworkInterfaces() {
        return this.networkInterfaces == null ? Input.empty() : this.networkInterfaces;
    }

    /**
     * Identifier of the Outpost to contain this endpoint.
     * 
     */
    @InputImport(name="outpostId")
      private final @Nullable Input<String> outpostId;

    public Input<String> getOutpostId() {
        return this.outpostId == null ? Input.empty() : this.outpostId;
    }

    /**
     * Identifier of the EC2 Security Group.
     * 
     */
    @InputImport(name="securityGroupId")
      private final @Nullable Input<String> securityGroupId;

    public Input<String> getSecurityGroupId() {
        return this.securityGroupId == null ? Input.empty() : this.securityGroupId;
    }

    /**
     * Identifier of the EC2 Subnet.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    public EndpointState(
        @Nullable Input<String> arn,
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> creationTime,
        @Nullable Input<List<EndpointNetworkInterfaceGetArgs>> networkInterfaces,
        @Nullable Input<String> outpostId,
        @Nullable Input<String> securityGroupId,
        @Nullable Input<String> subnetId) {
        this.arn = arn;
        this.cidrBlock = cidrBlock;
        this.creationTime = creationTime;
        this.networkInterfaces = networkInterfaces;
        this.outpostId = outpostId;
        this.securityGroupId = securityGroupId;
        this.subnetId = subnetId;
    }

    private EndpointState() {
        this.arn = Input.empty();
        this.cidrBlock = Input.empty();
        this.creationTime = Input.empty();
        this.networkInterfaces = Input.empty();
        this.outpostId = Input.empty();
        this.securityGroupId = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> creationTime;
        private @Nullable Input<List<EndpointNetworkInterfaceGetArgs>> networkInterfaces;
        private @Nullable Input<String> outpostId;
        private @Nullable Input<String> securityGroupId;
        private @Nullable Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.creationTime = defaults.creationTime;
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.outpostId = defaults.outpostId;
    	      this.securityGroupId = defaults.securityGroupId;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
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

        public Builder creationTime(@Nullable Input<String> creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public Builder creationTime(@Nullable String creationTime) {
            this.creationTime = Input.ofNullable(creationTime);
            return this;
        }

        public Builder networkInterfaces(@Nullable Input<List<EndpointNetworkInterfaceGetArgs>> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder networkInterfaces(@Nullable List<EndpointNetworkInterfaceGetArgs> networkInterfaces) {
            this.networkInterfaces = Input.ofNullable(networkInterfaces);
            return this;
        }

        public Builder outpostId(@Nullable Input<String> outpostId) {
            this.outpostId = outpostId;
            return this;
        }

        public Builder outpostId(@Nullable String outpostId) {
            this.outpostId = Input.ofNullable(outpostId);
            return this;
        }

        public Builder securityGroupId(@Nullable Input<String> securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }

        public Builder securityGroupId(@Nullable String securityGroupId) {
            this.securityGroupId = Input.ofNullable(securityGroupId);
            return this;
        }

        public Builder subnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }
        public EndpointState build() {
            return new EndpointState(arn, cidrBlock, creationTime, networkInterfaces, outpostId, securityGroupId, subnetId);
        }
    }
}
