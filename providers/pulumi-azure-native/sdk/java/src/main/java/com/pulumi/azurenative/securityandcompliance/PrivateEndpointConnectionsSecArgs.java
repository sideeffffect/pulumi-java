// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance;

import com.pulumi.azurenative.securityandcompliance.inputs.PrivateLinkServiceConnectionStateArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateEndpointConnectionsSecArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateEndpointConnectionsSecArgs Empty = new PrivateEndpointConnectionsSecArgs();

    /**
     * The name of the private endpoint connection associated with the Azure resource
     * 
     */
    @Import(name="privateEndpointConnectionName")
      private final @Nullable Output<String> privateEndpointConnectionName;

    public Output<String> privateEndpointConnectionName() {
        return this.privateEndpointConnectionName == null ? Codegen.empty() : this.privateEndpointConnectionName;
    }

    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    @Import(name="privateLinkServiceConnectionState", required=true)
      private final Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    public PrivateEndpointConnectionsSecArgs(
        @Nullable Output<String> privateEndpointConnectionName,
        Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.privateEndpointConnectionName = privateEndpointConnectionName;
        this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState, "expected parameter 'privateLinkServiceConnectionState' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private PrivateEndpointConnectionsSecArgs() {
        this.privateEndpointConnectionName = Codegen.empty();
        this.privateLinkServiceConnectionState = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionsSecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> privateEndpointConnectionName;
        private Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionsSecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateEndpointConnectionName = defaults.privateEndpointConnectionName;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder privateEndpointConnectionName(@Nullable Output<String> privateEndpointConnectionName) {
            this.privateEndpointConnectionName = privateEndpointConnectionName;
            return this;
        }
        public Builder privateEndpointConnectionName(@Nullable String privateEndpointConnectionName) {
            this.privateEndpointConnectionName = Codegen.ofNullable(privateEndpointConnectionName);
            return this;
        }
        public Builder privateLinkServiceConnectionState(Output<PrivateLinkServiceConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Output.of(Objects.requireNonNull(privateLinkServiceConnectionState));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }        public PrivateEndpointConnectionsSecArgs build() {
            return new PrivateEndpointConnectionsSecArgs(privateEndpointConnectionName, privateLinkServiceConnectionState, resourceGroupName, resourceName);
        }
    }
}
