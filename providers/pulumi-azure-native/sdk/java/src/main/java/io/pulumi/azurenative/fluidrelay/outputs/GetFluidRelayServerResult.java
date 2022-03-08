// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.fluidrelay.outputs;

import io.pulumi.azurenative.fluidrelay.outputs.FluidRelayEndpointsResponse;
import io.pulumi.azurenative.fluidrelay.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFluidRelayServerResult {
    /**
     * The Fluid Relay Service endpoints for this server.
     * 
     */
    private final FluidRelayEndpointsResponse fluidRelayEndpoints;
    /**
     * The Fluid tenantId for this server
     * 
     */
    private final String frsTenantId;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
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
     * Provision states for FluidRelay RP
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * System meta data for this resource, including creation and modification information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"fluidRelayEndpoints","frsTenantId","id","location","name","provisioningState","systemData","tags","type"})
    private GetFluidRelayServerResult(
        FluidRelayEndpointsResponse fluidRelayEndpoints,
        String frsTenantId,
        String id,
        String location,
        String name,
        @Nullable String provisioningState,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.fluidRelayEndpoints = fluidRelayEndpoints;
        this.frsTenantId = frsTenantId;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The Fluid Relay Service endpoints for this server.
     * 
    */
    public FluidRelayEndpointsResponse getFluidRelayEndpoints() {
        return this.fluidRelayEndpoints;
    }
    /**
     * The Fluid tenantId for this server
     * 
    */
    public String getFrsTenantId() {
        return this.frsTenantId;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
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
     * Provision states for FluidRelay RP
     * 
    */
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * System meta data for this resource, including creation and modification information.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
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

    public static Builder builder(GetFluidRelayServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FluidRelayEndpointsResponse fluidRelayEndpoints;
        private String frsTenantId;
        private String id;
        private String location;
        private String name;
        private @Nullable String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluidRelayServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fluidRelayEndpoints = defaults.fluidRelayEndpoints;
    	      this.frsTenantId = defaults.frsTenantId;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setFluidRelayEndpoints(FluidRelayEndpointsResponse fluidRelayEndpoints) {
            this.fluidRelayEndpoints = Objects.requireNonNull(fluidRelayEndpoints);
            return this;
        }

        public Builder setFrsTenantId(String frsTenantId) {
            this.frsTenantId = Objects.requireNonNull(frsTenantId);
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

        public Builder setProvisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
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
        public GetFluidRelayServerResult build() {
            return new GetFluidRelayServerResult(fluidRelayEndpoints, frsTenantId, id, location, name, provisioningState, systemData, tags, type);
        }
    }
}
