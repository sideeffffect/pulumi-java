// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.inputs;

import com.pulumi.azurenative.deviceupdate.inputs.GroupConnectivityInformationResponse;
import com.pulumi.azurenative.deviceupdate.inputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.azurenative.deviceupdate.inputs.PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private link service proxy details.
 * 
 */
public final class PrivateLinkServiceProxyResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceProxyResponse Empty = new PrivateLinkServiceProxyResponse();

    /**
     * Group connectivity information.
     * 
     */
    @Import(name="groupConnectivityInformation")
      private final @Nullable List<GroupConnectivityInformationResponse> groupConnectivityInformation;

    public List<GroupConnectivityInformationResponse> groupConnectivityInformation() {
        return this.groupConnectivityInformation == null ? List.of() : this.groupConnectivityInformation;
    }

    /**
     * NRP resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Remote private endpoint connection details.
     * 
     */
    @Import(name="remotePrivateEndpointConnection")
      private final @Nullable PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection remotePrivateEndpointConnection;

    public Optional<PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection> remotePrivateEndpointConnection() {
        return this.remotePrivateEndpointConnection == null ? Optional.empty() : Optional.ofNullable(this.remotePrivateEndpointConnection);
    }

    /**
     * Remote private link service connection state
     * 
     */
    @Import(name="remotePrivateLinkServiceConnectionState")
      private final @Nullable PrivateLinkServiceConnectionStateResponse remotePrivateLinkServiceConnectionState;

    public Optional<PrivateLinkServiceConnectionStateResponse> remotePrivateLinkServiceConnectionState() {
        return this.remotePrivateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.remotePrivateLinkServiceConnectionState);
    }

    public PrivateLinkServiceProxyResponse(
        @Nullable List<GroupConnectivityInformationResponse> groupConnectivityInformation,
        @Nullable String id,
        @Nullable PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection remotePrivateEndpointConnection,
        @Nullable PrivateLinkServiceConnectionStateResponse remotePrivateLinkServiceConnectionState) {
        this.groupConnectivityInformation = groupConnectivityInformation;
        this.id = id;
        this.remotePrivateEndpointConnection = remotePrivateEndpointConnection;
        this.remotePrivateLinkServiceConnectionState = remotePrivateLinkServiceConnectionState;
    }

    private PrivateLinkServiceProxyResponse() {
        this.groupConnectivityInformation = List.of();
        this.id = null;
        this.remotePrivateEndpointConnection = null;
        this.remotePrivateLinkServiceConnectionState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceProxyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GroupConnectivityInformationResponse> groupConnectivityInformation;
        private @Nullable String id;
        private @Nullable PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection remotePrivateEndpointConnection;
        private @Nullable PrivateLinkServiceConnectionStateResponse remotePrivateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceProxyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupConnectivityInformation = defaults.groupConnectivityInformation;
    	      this.id = defaults.id;
    	      this.remotePrivateEndpointConnection = defaults.remotePrivateEndpointConnection;
    	      this.remotePrivateLinkServiceConnectionState = defaults.remotePrivateLinkServiceConnectionState;
        }

        public Builder groupConnectivityInformation(@Nullable List<GroupConnectivityInformationResponse> groupConnectivityInformation) {
            this.groupConnectivityInformation = groupConnectivityInformation;
            return this;
        }
        public Builder groupConnectivityInformation(GroupConnectivityInformationResponse... groupConnectivityInformation) {
            return groupConnectivityInformation(List.of(groupConnectivityInformation));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder remotePrivateEndpointConnection(@Nullable PrivateLinkServiceProxyResponseRemotePrivateEndpointConnection remotePrivateEndpointConnection) {
            this.remotePrivateEndpointConnection = remotePrivateEndpointConnection;
            return this;
        }
        public Builder remotePrivateLinkServiceConnectionState(@Nullable PrivateLinkServiceConnectionStateResponse remotePrivateLinkServiceConnectionState) {
            this.remotePrivateLinkServiceConnectionState = remotePrivateLinkServiceConnectionState;
            return this;
        }        public PrivateLinkServiceProxyResponse build() {
            return new PrivateLinkServiceProxyResponse(groupConnectivityInformation, id, remotePrivateEndpointConnection, remotePrivateLinkServiceConnectionState);
        }
    }
}
