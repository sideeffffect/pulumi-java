// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPrivateEndpointConnectionProxyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPrivateEndpointConnectionProxyArgs Empty = new GetPrivateEndpointConnectionProxyArgs();

    /**
     * Account name.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The ID of the private endpoint connection proxy object.
     * 
     */
    @InputImport(name="privateEndpointConnectionProxyId", required=true)
      private final String privateEndpointConnectionProxyId;

    public String getPrivateEndpointConnectionProxyId() {
        return this.privateEndpointConnectionProxyId;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPrivateEndpointConnectionProxyArgs(
        String accountName,
        String privateEndpointConnectionProxyId,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.privateEndpointConnectionProxyId = Objects.requireNonNull(privateEndpointConnectionProxyId, "expected parameter 'privateEndpointConnectionProxyId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPrivateEndpointConnectionProxyArgs() {
        this.accountName = null;
        this.privateEndpointConnectionProxyId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String privateEndpointConnectionProxyId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.privateEndpointConnectionProxyId = defaults.privateEndpointConnectionProxyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder privateEndpointConnectionProxyId(String privateEndpointConnectionProxyId) {
            this.privateEndpointConnectionProxyId = Objects.requireNonNull(privateEndpointConnectionProxyId);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetPrivateEndpointConnectionProxyArgs build() {
            return new GetPrivateEndpointConnectionProxyArgs(accountName, privateEndpointConnectionProxyId, resourceGroupName);
        }
    }
}
