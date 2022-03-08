// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.outputs;

import io.pulumi.azurenative.managednetwork.outputs.ConnectivityCollectionResponse;
import io.pulumi.azurenative.managednetwork.outputs.ScopeResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagedNetworkResult {
    /**
     * The collection of groups and policies concerned with connectivity
     * 
     */
    private final ConnectivityCollectionResponse connectivity;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
     */
    private final String provisioningState;
    /**
     * The collection of management groups, subscriptions, virtual networks, and subnets by the Managed Network. This is a read-only property that is reflective of all ScopeAssignments for this Managed Network
     * 
     */
    private final @Nullable ScopeResponse scope;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"connectivity","etag","id","location","name","provisioningState","scope","tags","type"})
    private GetManagedNetworkResult(
        ConnectivityCollectionResponse connectivity,
        String etag,
        String id,
        String location,
        String name,
        String provisioningState,
        @Nullable ScopeResponse scope,
        @Nullable Map<String,String> tags,
        String type) {
        this.connectivity = connectivity;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.scope = scope;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The collection of groups and policies concerned with connectivity
     * 
    */
    public ConnectivityCollectionResponse getConnectivity() {
        return this.connectivity;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the ManagedNetwork resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The collection of management groups, subscriptions, virtual networks, and subnets by the Managed Network. This is a read-only property that is reflective of all ScopeAssignments for this Managed Network
     * 
    */
    public Optional<ScopeResponse> getScope() {
        return Optional.ofNullable(this.scope);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectivityCollectionResponse connectivity;
        private String etag;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable ScopeResponse scope;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivity = defaults.connectivity;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setConnectivity(ConnectivityCollectionResponse connectivity) {
            this.connectivity = Objects.requireNonNull(connectivity);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setScope(@Nullable ScopeResponse scope) {
            this.scope = scope;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetManagedNetworkResult build() {
            return new GetManagedNetworkResult(connectivity, etag, id, location, name, provisioningState, scope, tags, type);
        }
    }
}
