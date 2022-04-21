// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomerGatewayAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomerGatewayAssociationArgs Empty = new CustomerGatewayAssociationArgs();

    /**
     * The Amazon Resource Name (ARN) of the customer gateway.
     * 
     */
    @Import(name="customerGatewayArn", required=true)
    private Output<String> customerGatewayArn;

    public Output<String> customerGatewayArn() {
        return this.customerGatewayArn;
    }

    /**
     * The ID of the device
     * 
     */
    @Import(name="deviceId", required=true)
    private Output<String> deviceId;

    public Output<String> deviceId() {
        return this.deviceId;
    }

    /**
     * The ID of the global network.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private Output<String> globalNetworkId;

    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * The ID of the link
     * 
     */
    @Import(name="linkId")
    private @Nullable Output<String> linkId;

    public Optional<Output<String>> linkId() {
        return Optional.ofNullable(this.linkId);
    }

    private CustomerGatewayAssociationArgs() {}

    private CustomerGatewayAssociationArgs(CustomerGatewayAssociationArgs $) {
        this.customerGatewayArn = $.customerGatewayArn;
        this.deviceId = $.deviceId;
        this.globalNetworkId = $.globalNetworkId;
        this.linkId = $.linkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerGatewayAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerGatewayAssociationArgs $;

        public Builder() {
            $ = new CustomerGatewayAssociationArgs();
        }

        public Builder(CustomerGatewayAssociationArgs defaults) {
            $ = new CustomerGatewayAssociationArgs(Objects.requireNonNull(defaults));
        }

        public Builder customerGatewayArn(Output<String> customerGatewayArn) {
            $.customerGatewayArn = customerGatewayArn;
            return this;
        }

        public Builder customerGatewayArn(String customerGatewayArn) {
            return customerGatewayArn(Output.of(customerGatewayArn));
        }

        public Builder deviceId(Output<String> deviceId) {
            $.deviceId = deviceId;
            return this;
        }

        public Builder deviceId(String deviceId) {
            return deviceId(Output.of(deviceId));
        }

        public Builder globalNetworkId(Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        public Builder linkId(@Nullable Output<String> linkId) {
            $.linkId = linkId;
            return this;
        }

        public Builder linkId(String linkId) {
            return linkId(Output.of(linkId));
        }

        public CustomerGatewayAssociationArgs build() {
            $.customerGatewayArn = Objects.requireNonNull($.customerGatewayArn, "expected parameter 'customerGatewayArn' to be non-null");
            $.deviceId = Objects.requireNonNull($.deviceId, "expected parameter 'deviceId' to be non-null");
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            return $;
        }
    }

}
