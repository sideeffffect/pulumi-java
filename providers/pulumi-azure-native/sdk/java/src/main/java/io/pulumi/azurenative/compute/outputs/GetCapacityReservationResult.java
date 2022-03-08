// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.CapacityReservationInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.SkuResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceReadOnlyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCapacityReservationResult {
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The Capacity reservation instance view.
     * 
     */
    private final CapacityReservationInstanceViewResponse instanceView;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * The date time when the capacity reservation was last updated.
     * 
     */
    private final String provisioningTime;
    /**
     * A unique id generated and assigned to the capacity reservation by the platform which does not change throughout the lifetime of the resource.
     * 
     */
    private final String reservationId;
    /**
     * SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are supported. Refer to List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
     */
    private final SkuResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * A list of all virtual machine resource ids that are associated with the capacity reservation.
     * 
     */
    private final List<SubResourceReadOnlyResponse> virtualMachinesAssociated;
    /**
     * Availability Zone to use for this capacity reservation. The zone has to be single value and also should be part for the list of zones specified during the capacity reservation group creation. The zone can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     * 
     */
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"id","instanceView","location","name","provisioningState","provisioningTime","reservationId","sku","tags","type","virtualMachinesAssociated","zones"})
    private GetCapacityReservationResult(
        String id,
        CapacityReservationInstanceViewResponse instanceView,
        String location,
        String name,
        String provisioningState,
        String provisioningTime,
        String reservationId,
        SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        List<SubResourceReadOnlyResponse> virtualMachinesAssociated,
        @Nullable List<String> zones) {
        this.id = id;
        this.instanceView = instanceView;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.provisioningTime = provisioningTime;
        this.reservationId = reservationId;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.virtualMachinesAssociated = virtualMachinesAssociated;
        this.zones = zones;
    }

    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Capacity reservation instance view.
     * 
    */
    public CapacityReservationInstanceViewResponse getInstanceView() {
        return this.instanceView;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The date time when the capacity reservation was last updated.
     * 
    */
    public String getProvisioningTime() {
        return this.provisioningTime;
    }
    /**
     * A unique id generated and assigned to the capacity reservation by the platform which does not change throughout the lifetime of the resource.
     * 
    */
    public String getReservationId() {
        return this.reservationId;
    }
    /**
     * SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are supported. Refer to List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * A list of all virtual machine resource ids that are associated with the capacity reservation.
     * 
    */
    public List<SubResourceReadOnlyResponse> getVirtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }
    /**
     * Availability Zone to use for this capacity reservation. The zone has to be single value and also should be part for the list of zones specified during the capacity reservation group creation. The zone can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     * 
    */
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityReservationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private CapacityReservationInstanceViewResponse instanceView;
        private String location;
        private String name;
        private String provisioningState;
        private String provisioningTime;
        private String reservationId;
        private SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private List<SubResourceReadOnlyResponse> virtualMachinesAssociated;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityReservationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.instanceView = defaults.instanceView;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.provisioningTime = defaults.provisioningTime;
    	      this.reservationId = defaults.reservationId;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualMachinesAssociated = defaults.virtualMachinesAssociated;
    	      this.zones = defaults.zones;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInstanceView(CapacityReservationInstanceViewResponse instanceView) {
            this.instanceView = Objects.requireNonNull(instanceView);
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

        public Builder setProvisioningTime(String provisioningTime) {
            this.provisioningTime = Objects.requireNonNull(provisioningTime);
            return this;
        }

        public Builder setReservationId(String reservationId) {
            this.reservationId = Objects.requireNonNull(reservationId);
            return this;
        }

        public Builder setSku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
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

        public Builder setVirtualMachinesAssociated(List<SubResourceReadOnlyResponse> virtualMachinesAssociated) {
            this.virtualMachinesAssociated = Objects.requireNonNull(virtualMachinesAssociated);
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public GetCapacityReservationResult build() {
            return new GetCapacityReservationResult(id, instanceView, location, name, provisioningState, provisioningTime, reservationId, sku, tags, type, virtualMachinesAssociated, zones);
        }
    }
}
