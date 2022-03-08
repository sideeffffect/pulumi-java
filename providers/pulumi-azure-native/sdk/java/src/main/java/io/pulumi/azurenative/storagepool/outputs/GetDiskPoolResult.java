// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.outputs;

import io.pulumi.azurenative.storagepool.outputs.DiskResponse;
import io.pulumi.azurenative.storagepool.outputs.SystemMetadataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDiskPoolResult {
    /**
     * List of additional capabilities for Disk pool.
     * 
     */
    private final @Nullable List<String> additionalCapabilities;
    /**
     * Logical zone for Disk pool resource; example: ["1"].
     * 
     */
    private final List<String> availabilityZones;
    /**
     * List of Azure Managed Disks to attach to a Disk pool. Can attach 8 disks at most.
     * 
     */
    private final @Nullable List<DiskResponse> disks;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives.
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * State of the operation on the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Operational status of the Disk pool.
     * 
     */
    private final String status;
    /**
     * Azure Resource ID of a Subnet for the Disk pool.
     * 
     */
    private final String subnetId;
    /**
     * Resource metadata required by ARM RPC
     * 
     */
    private final SystemMetadataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Determines the SKU of VM deployed for Disk pool
     * 
     */
    private final String tier;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"additionalCapabilities","availabilityZones","disks","id","location","name","provisioningState","status","subnetId","systemData","tags","tier","type"})
    private GetDiskPoolResult(
        @Nullable List<String> additionalCapabilities,
        List<String> availabilityZones,
        @Nullable List<DiskResponse> disks,
        String id,
        String location,
        String name,
        String provisioningState,
        String status,
        String subnetId,
        SystemMetadataResponse systemData,
        @Nullable Map<String,String> tags,
        String tier,
        String type) {
        this.additionalCapabilities = additionalCapabilities;
        this.availabilityZones = availabilityZones;
        this.disks = disks;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.status = status;
        this.subnetId = subnetId;
        this.systemData = systemData;
        this.tags = tags;
        this.tier = tier;
        this.type = type;
    }

    /**
     * List of additional capabilities for Disk pool.
     * 
    */
    public List<String> getAdditionalCapabilities() {
        return this.additionalCapabilities == null ? List.of() : this.additionalCapabilities;
    }
    /**
     * Logical zone for Disk pool resource; example: ["1"].
     * 
    */
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * List of Azure Managed Disks to attach to a Disk pool. Can attach 8 disks at most.
     * 
    */
    public List<DiskResponse> getDisks() {
        return this.disks == null ? List.of() : this.disks;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives.
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
     * State of the operation on the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Operational status of the Disk pool.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Azure Resource ID of a Subnet for the Disk pool.
     * 
    */
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * Resource metadata required by ARM RPC
     * 
    */
    public SystemMetadataResponse getSystemData() {
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
     * Determines the SKU of VM deployed for Disk pool
     * 
    */
    public String getTier() {
        return this.tier;
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

    public static Builder builder(GetDiskPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> additionalCapabilities;
        private List<String> availabilityZones;
        private @Nullable List<DiskResponse> disks;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private String status;
        private String subnetId;
        private SystemMetadataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String tier;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalCapabilities = defaults.additionalCapabilities;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.disks = defaults.disks;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.subnetId = defaults.subnetId;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
        }

        public Builder setAdditionalCapabilities(@Nullable List<String> additionalCapabilities) {
            this.additionalCapabilities = additionalCapabilities;
            return this;
        }

        public Builder setAvailabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }

        public Builder setDisks(@Nullable List<DiskResponse> disks) {
            this.disks = disks;
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

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSubnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder setSystemData(SystemMetadataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDiskPoolResult build() {
            return new GetDiskPoolResult(additionalCapabilities, availabilityZones, disks, id, location, name, provisioningState, status, subnetId, systemData, tags, tier, type);
        }
    }
}
