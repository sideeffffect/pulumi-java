// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetP2sVpnGatewayP2sVpnConnectionHealthArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetP2sVpnGatewayP2sVpnConnectionHealthArgs Empty = new GetP2sVpnGatewayP2sVpnConnectionHealthArgs();

    /**
     * The name of the P2SVpnGateway.
     * 
     */
    @InputImport(name="gatewayName", required=true)
      private final String gatewayName;

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetP2sVpnGatewayP2sVpnConnectionHealthArgs(
        String gatewayName,
        String resourceGroupName) {
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetP2sVpnGatewayP2sVpnConnectionHealthArgs() {
        this.gatewayName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetP2sVpnGatewayP2sVpnConnectionHealthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetP2sVpnGatewayP2sVpnConnectionHealthArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayName = defaults.gatewayName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder gatewayName(String gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetP2sVpnGatewayP2sVpnConnectionHealthArgs build() {
            return new GetP2sVpnGatewayP2sVpnConnectionHealthArgs(gatewayName, resourceGroupName);
        }
    }
}
