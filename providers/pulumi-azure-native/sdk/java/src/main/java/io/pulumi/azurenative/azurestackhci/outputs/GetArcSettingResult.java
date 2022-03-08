// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.outputs;

import io.pulumi.azurenative.azurestackhci.outputs.PerNodeStateResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetArcSettingResult {
    /**
     * Aggregate state of Arc agent across the nodes in this HCI cluster.
     * 
     */
    private final String aggregateState;
    /**
     * The resource group that hosts the Arc agents, ie. Hybrid Compute Machine resources.
     * 
     */
    private final String arcInstanceResourceGroup;
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    private final @Nullable String createdAt;
    /**
     * The identity that created the resource.
     * 
     */
    private final @Nullable String createdBy;
    /**
     * The type of identity that created the resource.
     * 
     */
    private final @Nullable String createdByType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    private final @Nullable String lastModifiedAt;
    /**
     * The identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * The type of identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedByType;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * State of Arc agent in each of the nodes.
     * 
     */
    private final List<PerNodeStateResponse> perNodeDetails;
    /**
     * Provisioning state of the ArcSetting proxy resource.
     * 
     */
    private final String provisioningState;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"aggregateState","arcInstanceResourceGroup","createdAt","createdBy","createdByType","id","lastModifiedAt","lastModifiedBy","lastModifiedByType","name","perNodeDetails","provisioningState","type"})
    private GetArcSettingResult(
        String aggregateState,
        String arcInstanceResourceGroup,
        @Nullable String createdAt,
        @Nullable String createdBy,
        @Nullable String createdByType,
        String id,
        @Nullable String lastModifiedAt,
        @Nullable String lastModifiedBy,
        @Nullable String lastModifiedByType,
        String name,
        List<PerNodeStateResponse> perNodeDetails,
        String provisioningState,
        String type) {
        this.aggregateState = aggregateState;
        this.arcInstanceResourceGroup = arcInstanceResourceGroup;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.id = id;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.name = name;
        this.perNodeDetails = perNodeDetails;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * Aggregate state of Arc agent across the nodes in this HCI cluster.
     * 
    */
    public String getAggregateState() {
        return this.aggregateState;
    }
    /**
     * The resource group that hosts the Arc agents, ie. Hybrid Compute Machine resources.
     * 
    */
    public String getArcInstanceResourceGroup() {
        return this.arcInstanceResourceGroup;
    }
    /**
     * The timestamp of resource creation (UTC).
     * 
    */
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * The identity that created the resource.
     * 
    */
    public Optional<String> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * The type of identity that created the resource.
     * 
    */
    public Optional<String> getCreatedByType() {
        return Optional.ofNullable(this.createdByType);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
    */
    public Optional<String> getLastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    /**
     * The identity that last modified the resource.
     * 
    */
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * The type of identity that last modified the resource.
     * 
    */
    public Optional<String> getLastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of Arc agent in each of the nodes.
     * 
    */
    public List<PerNodeStateResponse> getPerNodeDetails() {
        return this.perNodeDetails;
    }
    /**
     * Provisioning state of the ArcSetting proxy resource.
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

    public static Builder builder(GetArcSettingResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aggregateState;
        private String arcInstanceResourceGroup;
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private String id;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        private String name;
        private List<PerNodeStateResponse> perNodeDetails;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArcSettingResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregateState = defaults.aggregateState;
    	      this.arcInstanceResourceGroup = defaults.arcInstanceResourceGroup;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.id = defaults.id;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.name = defaults.name;
    	      this.perNodeDetails = defaults.perNodeDetails;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAggregateState(String aggregateState) {
            this.aggregateState = Objects.requireNonNull(aggregateState);
            return this;
        }

        public Builder setArcInstanceResourceGroup(String arcInstanceResourceGroup) {
            this.arcInstanceResourceGroup = Objects.requireNonNull(arcInstanceResourceGroup);
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder setLastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPerNodeDetails(List<PerNodeStateResponse> perNodeDetails) {
            this.perNodeDetails = Objects.requireNonNull(perNodeDetails);
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
        public GetArcSettingResult build() {
            return new GetArcSettingResult(aggregateState, arcInstanceResourceGroup, createdAt, createdBy, createdByType, id, lastModifiedAt, lastModifiedBy, lastModifiedByType, name, perNodeDetails, provisioningState, type);
        }
    }
}
