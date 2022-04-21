// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionsForSCCPowershellArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionsForSCCPowershellArgs Empty = new GetPrivateEndpointConnectionsForSCCPowershellArgs();

    /**
     * The name of the private endpoint connection associated with the Azure resource
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private String privateEndpointConnectionName;

    public String privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    private GetPrivateEndpointConnectionsForSCCPowershellArgs() {}

    private GetPrivateEndpointConnectionsForSCCPowershellArgs(GetPrivateEndpointConnectionsForSCCPowershellArgs $) {
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointConnectionsForSCCPowershellArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointConnectionsForSCCPowershellArgs $;

        public Builder() {
            $ = new GetPrivateEndpointConnectionsForSCCPowershellArgs();
        }

        public Builder(GetPrivateEndpointConnectionsForSCCPowershellArgs defaults) {
            $ = new GetPrivateEndpointConnectionsForSCCPowershellArgs(Objects.requireNonNull(defaults));
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetPrivateEndpointConnectionsForSCCPowershellArgs build() {
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
