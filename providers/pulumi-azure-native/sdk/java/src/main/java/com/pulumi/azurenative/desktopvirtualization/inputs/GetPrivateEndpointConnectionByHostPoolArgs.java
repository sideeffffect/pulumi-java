// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.desktopvirtualization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionByHostPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionByHostPoolArgs Empty = new GetPrivateEndpointConnectionByHostPoolArgs();

    /**
     * The name of the host pool within the specified resource group
     * 
     */
    @Import(name="hostPoolName", required=true)
    private String hostPoolName;

    public String hostPoolName() {
        return this.hostPoolName;
    }

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
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPrivateEndpointConnectionByHostPoolArgs() {}

    private GetPrivateEndpointConnectionByHostPoolArgs(GetPrivateEndpointConnectionByHostPoolArgs $) {
        this.hostPoolName = $.hostPoolName;
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointConnectionByHostPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointConnectionByHostPoolArgs $;

        public Builder() {
            $ = new GetPrivateEndpointConnectionByHostPoolArgs();
        }

        public Builder(GetPrivateEndpointConnectionByHostPoolArgs defaults) {
            $ = new GetPrivateEndpointConnectionByHostPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder hostPoolName(String hostPoolName) {
            $.hostPoolName = hostPoolName;
            return this;
        }

        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPrivateEndpointConnectionByHostPoolArgs build() {
            $.hostPoolName = Objects.requireNonNull($.hostPoolName, "expected parameter 'hostPoolName' to be non-null");
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
