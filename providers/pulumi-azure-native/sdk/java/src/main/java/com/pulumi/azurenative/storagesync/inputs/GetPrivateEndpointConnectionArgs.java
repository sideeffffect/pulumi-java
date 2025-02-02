// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionArgs Empty = new GetPrivateEndpointConnectionArgs();

    /**
     * The name of the private endpoint connection associated with the Azure resource
     * 
     */
    @Import(name="privateEndpointConnectionName", required=true)
    private Output<String> privateEndpointConnectionName;

    /**
     * @return The name of the private endpoint connection associated with the Azure resource
     * 
     */
    public Output<String> privateEndpointConnectionName() {
        return this.privateEndpointConnectionName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the storage sync service name within the specified resource group.
     * 
     */
    @Import(name="storageSyncServiceName", required=true)
    private Output<String> storageSyncServiceName;

    /**
     * @return The name of the storage sync service name within the specified resource group.
     * 
     */
    public Output<String> storageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    private GetPrivateEndpointConnectionArgs() {}

    private GetPrivateEndpointConnectionArgs(GetPrivateEndpointConnectionArgs $) {
        this.privateEndpointConnectionName = $.privateEndpointConnectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.storageSyncServiceName = $.storageSyncServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateEndpointConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateEndpointConnectionArgs $;

        public Builder() {
            $ = new GetPrivateEndpointConnectionArgs();
        }

        public Builder(GetPrivateEndpointConnectionArgs defaults) {
            $ = new GetPrivateEndpointConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure resource
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(Output<String> privateEndpointConnectionName) {
            $.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }

        /**
         * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure resource
         * 
         * @return builder
         * 
         */
        public Builder privateEndpointConnectionName(String privateEndpointConnectionName) {
            return privateEndpointConnectionName(Output.of(privateEndpointConnectionName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param storageSyncServiceName The name of the storage sync service name within the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncServiceName(Output<String> storageSyncServiceName) {
            $.storageSyncServiceName = storageSyncServiceName;
            return this;
        }

        /**
         * @param storageSyncServiceName The name of the storage sync service name within the specified resource group.
         * 
         * @return builder
         * 
         */
        public Builder storageSyncServiceName(String storageSyncServiceName) {
            return storageSyncServiceName(Output.of(storageSyncServiceName));
        }

        public GetPrivateEndpointConnectionArgs build() {
            $.privateEndpointConnectionName = Objects.requireNonNull($.privateEndpointConnectionName, "expected parameter 'privateEndpointConnectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.storageSyncServiceName = Objects.requireNonNull($.storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
            return $;
        }
    }

}
