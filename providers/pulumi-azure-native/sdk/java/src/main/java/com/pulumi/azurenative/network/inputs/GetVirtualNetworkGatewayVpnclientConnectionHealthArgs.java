// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkGatewayVpnclientConnectionHealthArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkGatewayVpnclientConnectionHealthArgs Empty = new GetVirtualNetworkGatewayVpnclientConnectionHealthArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual network gateway.
     * 
     */
    @Import(name="virtualNetworkGatewayName", required=true)
    private String virtualNetworkGatewayName;

    public String virtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    private GetVirtualNetworkGatewayVpnclientConnectionHealthArgs() {}

    private GetVirtualNetworkGatewayVpnclientConnectionHealthArgs(GetVirtualNetworkGatewayVpnclientConnectionHealthArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkGatewayName = $.virtualNetworkGatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkGatewayVpnclientConnectionHealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkGatewayVpnclientConnectionHealthArgs $;

        public Builder() {
            $ = new GetVirtualNetworkGatewayVpnclientConnectionHealthArgs();
        }

        public Builder(GetVirtualNetworkGatewayVpnclientConnectionHealthArgs defaults) {
            $ = new GetVirtualNetworkGatewayVpnclientConnectionHealthArgs(Objects.requireNonNull(defaults));
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder virtualNetworkGatewayName(String virtualNetworkGatewayName) {
            $.virtualNetworkGatewayName = virtualNetworkGatewayName;
            return this;
        }

        public GetVirtualNetworkGatewayVpnclientConnectionHealthArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkGatewayName = Objects.requireNonNull($.virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
            return $;
        }
    }

}
