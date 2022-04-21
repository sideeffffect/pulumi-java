// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualNetworkGatewayNatRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVirtualNetworkGatewayNatRuleArgs Empty = new GetVirtualNetworkGatewayNatRuleArgs();

    /**
     * The name of the nat rule.
     * 
     */
    @Import(name="natRuleName", required=true)
    private String natRuleName;

    public String natRuleName() {
        return this.natRuleName;
    }

    /**
     * The resource group name of the Virtual Network Gateway.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the gateway.
     * 
     */
    @Import(name="virtualNetworkGatewayName", required=true)
    private String virtualNetworkGatewayName;

    public String virtualNetworkGatewayName() {
        return this.virtualNetworkGatewayName;
    }

    private GetVirtualNetworkGatewayNatRuleArgs() {}

    private GetVirtualNetworkGatewayNatRuleArgs(GetVirtualNetworkGatewayNatRuleArgs $) {
        this.natRuleName = $.natRuleName;
        this.resourceGroupName = $.resourceGroupName;
        this.virtualNetworkGatewayName = $.virtualNetworkGatewayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVirtualNetworkGatewayNatRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVirtualNetworkGatewayNatRuleArgs $;

        public Builder() {
            $ = new GetVirtualNetworkGatewayNatRuleArgs();
        }

        public Builder(GetVirtualNetworkGatewayNatRuleArgs defaults) {
            $ = new GetVirtualNetworkGatewayNatRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder natRuleName(String natRuleName) {
            $.natRuleName = natRuleName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder virtualNetworkGatewayName(String virtualNetworkGatewayName) {
            $.virtualNetworkGatewayName = virtualNetworkGatewayName;
            return this;
        }

        public GetVirtualNetworkGatewayNatRuleArgs build() {
            $.natRuleName = Objects.requireNonNull($.natRuleName, "expected parameter 'natRuleName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.virtualNetworkGatewayName = Objects.requireNonNull($.virtualNetworkGatewayName, "expected parameter 'virtualNetworkGatewayName' to be non-null");
            return $;
        }
    }

}
