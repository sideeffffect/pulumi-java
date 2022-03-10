// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.inputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.compute_alpha.inputs.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Properties of the SKU instances being reserved. Next ID: 9
 * 
 */
public final class AllocationSpecificSKUAllocationReservedInstancePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final AllocationSpecificSKUAllocationReservedInstancePropertiesResponse Empty = new AllocationSpecificSKUAllocationReservedInstancePropertiesResponse();

    /**
     * Specifies accelerator type and count.
     * 
     */
    @InputImport(name="guestAccelerators", required=true)
      private final List<AcceleratorConfigResponse> guestAccelerators;

    public List<AcceleratorConfigResponse> getGuestAccelerators() {
        return this.guestAccelerators;
    }

    /**
     * Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
     */
    @InputImport(name="localSsds", required=true)
      private final List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds;

    public List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> getLocalSsds() {
        return this.localSsds;
    }

    /**
     * An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @InputImport(name="locationHint", required=true)
      private final String locationHint;

    public String getLocationHint() {
        return this.locationHint;
    }

    /**
     * Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    @InputImport(name="machineType", required=true)
      private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    /**
     * Specifies the number of hours after reservation creation where instances using the reservation won't be scheduled for maintenance.
     * 
     */
    @InputImport(name="maintenanceFreezeDurationHours", required=true)
      private final Integer maintenanceFreezeDurationHours;

    public Integer getMaintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours;
    }

    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    @InputImport(name="maintenanceInterval", required=true)
      private final String maintenanceInterval;

    public String getMaintenanceInterval() {
        return this.maintenanceInterval;
    }

    /**
     * Minimum cpu platform the reservation.
     * 
     */
    @InputImport(name="minCpuPlatform", required=true)
      private final String minCpuPlatform;

    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
    }

    public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse(
        List<AcceleratorConfigResponse> guestAccelerators,
        List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds,
        String locationHint,
        String machineType,
        Integer maintenanceFreezeDurationHours,
        String maintenanceInterval,
        String minCpuPlatform) {
        this.guestAccelerators = Objects.requireNonNull(guestAccelerators, "expected parameter 'guestAccelerators' to be non-null");
        this.localSsds = Objects.requireNonNull(localSsds, "expected parameter 'localSsds' to be non-null");
        this.locationHint = Objects.requireNonNull(locationHint, "expected parameter 'locationHint' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.maintenanceFreezeDurationHours = Objects.requireNonNull(maintenanceFreezeDurationHours, "expected parameter 'maintenanceFreezeDurationHours' to be non-null");
        this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval, "expected parameter 'maintenanceInterval' to be non-null");
        this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform, "expected parameter 'minCpuPlatform' to be non-null");
    }

    private AllocationSpecificSKUAllocationReservedInstancePropertiesResponse() {
        this.guestAccelerators = List.of();
        this.localSsds = List.of();
        this.locationHint = null;
        this.machineType = null;
        this.maintenanceFreezeDurationHours = null;
        this.maintenanceInterval = null;
        this.minCpuPlatform = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> guestAccelerators;
        private List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds;
        private String locationHint;
        private String machineType;
        private Integer maintenanceFreezeDurationHours;
        private String maintenanceInterval;
        private String minCpuPlatform;

        public Builder() {
    	      // Empty
        }

        public Builder(AllocationSpecificSKUAllocationReservedInstancePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.localSsds = defaults.localSsds;
    	      this.locationHint = defaults.locationHint;
    	      this.machineType = defaults.machineType;
    	      this.maintenanceFreezeDurationHours = defaults.maintenanceFreezeDurationHours;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
        }

        public Builder guestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }

        public Builder localSsds(List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds) {
            this.localSsds = Objects.requireNonNull(localSsds);
            return this;
        }

        public Builder locationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }

        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder maintenanceFreezeDurationHours(Integer maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = Objects.requireNonNull(maintenanceFreezeDurationHours);
            return this;
        }

        public Builder maintenanceInterval(String maintenanceInterval) {
            this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval);
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse build() {
            return new AllocationSpecificSKUAllocationReservedInstancePropertiesResponse(guestAccelerators, localSsds, locationHint, machineType, maintenanceFreezeDurationHours, maintenanceInterval, minCpuPlatform);
        }
    }
}
