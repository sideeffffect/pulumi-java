// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights.outputs;

import io.pulumi.azurenative.timeseriesinsights.outputs.PrivateEndpointResponse;
import io.pulumi.azurenative.timeseriesinsights.outputs.PrivateLinkServiceConnectionStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * The provisioning state of the private endpoint connection resource.
     * 
     */
    private final @Nullable List<String> groupIds;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The resource of private end point.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    private final PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * Provisioning state of the private endpoint connection.
     * 
     */
    private final String provisioningState;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"groupIds","id","name","privateEndpoint","privateLinkServiceConnectionState","provisioningState","type"})
    private GetPrivateEndpointConnectionResult(
        @Nullable List<String> groupIds,
        String id,
        String name,
        @Nullable PrivateEndpointResponse privateEndpoint,
        PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        String provisioningState,
        String type) {
        this.groupIds = groupIds;
        this.id = id;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * The provisioning state of the private endpoint connection resource.
     * 
    */
    public List<String> getGroupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The resource of private end point.
     * 
    */
    public Optional<PrivateEndpointResponse> getPrivateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * A collection of information about the state of the connection between service consumer and provider.
     * 
    */
    public PrivateLinkServiceConnectionStateResponse getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * Provisioning state of the private endpoint connection.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
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
        private PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
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

        public Builder setGroupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(groupIds, id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
