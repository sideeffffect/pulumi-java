// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.ConnectionStateResponse;
import io.pulumi.azurenative.eventgrid.outputs.PrivateEndpointResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * GroupIds from the private link service resource.
     * 
     */
    private final @Nullable List<String> groupIds;
    /**
     * Fully qualified identifier of the resource.
     * 
     */
    private final String id;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * The Private Endpoint resource for this Connection.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * Details about the state of the connection.
     * 
     */
    private final @Nullable ConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetPrivateEndpointConnectionResult(
        @OutputCustomType.Parameter("groupIds") @Nullable List<String> groupIds,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointResponse privateEndpoint,
        @OutputCustomType.Parameter("privateLinkServiceConnectionState") @Nullable ConnectionStateResponse privateLinkServiceConnectionState,
        @OutputCustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @OutputCustomType.Parameter("type") String type) {
        this.groupIds = groupIds;
        this.id = id;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * GroupIds from the private link service resource.
     * 
    */
    public List<String> getGroupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }
    /**
     * Fully qualified identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The Private Endpoint resource for this Connection.
     * 
    */
    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * Details about the state of the connection.
     * 
    */
    public Optional<ConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * Provisioning state of the Private Endpoint Connection.
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groupIds;
        private String id;
        private String name;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private @Nullable ConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder groupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable ConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(groupIds, id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
