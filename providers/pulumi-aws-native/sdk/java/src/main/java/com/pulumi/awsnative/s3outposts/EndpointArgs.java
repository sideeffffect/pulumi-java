// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3outposts;

import com.pulumi.awsnative.s3outposts.enums.EndpointAccessType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * The type of access for the on-premise network connectivity for the Outpost endpoint. To access endpoint from an on-premises network, you must specify the access type and provide the customer owned Ipv4 pool.
     * 
     */
    @Import(name="accessType")
    private @Nullable Output<EndpointAccessType> accessType;

    public Optional<Output<EndpointAccessType>> accessType() {
        return Optional.ofNullable(this.accessType);
    }

    /**
     * The ID of the customer-owned IPv4 pool for the Endpoint. IP addresses will be allocated from this pool for the endpoint.
     * 
     */
    @Import(name="customerOwnedIpv4Pool")
    private @Nullable Output<String> customerOwnedIpv4Pool;

    public Optional<Output<String>> customerOwnedIpv4Pool() {
        return Optional.ofNullable(this.customerOwnedIpv4Pool);
    }

    /**
     * The id of the customer outpost on which the bucket resides.
     * 
     */
    @Import(name="outpostId", required=true)
    private Output<String> outpostId;

    public Output<String> outpostId() {
        return this.outpostId;
    }

    /**
     * The ID of the security group to use with the endpoint.
     * 
     */
    @Import(name="securityGroupId", required=true)
    private Output<String> securityGroupId;

    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }

    /**
     * The ID of the subnet in the selected VPC. The subnet must belong to the Outpost.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId;
    }

    private EndpointArgs() {}

    private EndpointArgs(EndpointArgs $) {
        this.accessType = $.accessType;
        this.customerOwnedIpv4Pool = $.customerOwnedIpv4Pool;
        this.outpostId = $.outpostId;
        this.securityGroupId = $.securityGroupId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointArgs $;

        public Builder() {
            $ = new EndpointArgs();
        }

        public Builder(EndpointArgs defaults) {
            $ = new EndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessType(@Nullable Output<EndpointAccessType> accessType) {
            $.accessType = accessType;
            return this;
        }

        public Builder accessType(EndpointAccessType accessType) {
            return accessType(Output.of(accessType));
        }

        public Builder customerOwnedIpv4Pool(@Nullable Output<String> customerOwnedIpv4Pool) {
            $.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }

        public Builder customerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            return customerOwnedIpv4Pool(Output.of(customerOwnedIpv4Pool));
        }

        public Builder outpostId(Output<String> outpostId) {
            $.outpostId = outpostId;
            return this;
        }

        public Builder outpostId(String outpostId) {
            return outpostId(Output.of(outpostId));
        }

        public Builder securityGroupId(Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public EndpointArgs build() {
            $.outpostId = Objects.requireNonNull($.outpostId, "expected parameter 'outpostId' to be non-null");
            $.securityGroupId = Objects.requireNonNull($.securityGroupId, "expected parameter 'securityGroupId' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
