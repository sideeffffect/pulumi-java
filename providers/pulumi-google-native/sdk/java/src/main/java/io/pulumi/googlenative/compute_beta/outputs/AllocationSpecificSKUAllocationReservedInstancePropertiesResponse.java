// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_beta.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.compute_beta.outputs.AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class AllocationSpecificSKUAllocationReservedInstancePropertiesResponse {
    /**
     * Specifies accelerator type and count.
     * 
     */
    private final List<AcceleratorConfigResponse> guestAccelerators;
    /**
     * Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
     */
    private final List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds;
    /**
     * An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    private final String locationHint;
    /**
     * Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
     */
    private final String machineType;
    /**
     * Specifies the number of hours after reservation creation where instances using the reservation won't be scheduled for maintenance.
     * 
     */
    private final Integer maintenanceFreezeDurationHours;
    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    private final String maintenanceInterval;
    /**
     * Minimum cpu platform the reservation.
     * 
     */
    private final String minCpuPlatform;

    @OutputCustomType.Constructor({"guestAccelerators","localSsds","locationHint","machineType","maintenanceFreezeDurationHours","maintenanceInterval","minCpuPlatform"})
    private AllocationSpecificSKUAllocationReservedInstancePropertiesResponse(
        List<AcceleratorConfigResponse> guestAccelerators,
        List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds,
        String locationHint,
        String machineType,
        Integer maintenanceFreezeDurationHours,
        String maintenanceInterval,
        String minCpuPlatform) {
        this.guestAccelerators = guestAccelerators;
        this.localSsds = localSsds;
        this.locationHint = locationHint;
        this.machineType = machineType;
        this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
        this.maintenanceInterval = maintenanceInterval;
        this.minCpuPlatform = minCpuPlatform;
    }

    /**
     * Specifies accelerator type and count.
     * 
    */
    public List<AcceleratorConfigResponse> getGuestAccelerators() {
        return this.guestAccelerators;
    }
    /**
     * Specifies amount of local ssd to reserve with each instance. The type of disk is local-ssd.
     * 
    */
    public List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> getLocalSsds() {
        return this.localSsds;
    }
    /**
     * An opaque location hint used to place the allocation close to other resources. This field is for use by internal tools that use the public API.
     * 
    */
    public String getLocationHint() {
        return this.locationHint;
    }
    /**
     * Specifies type of machine (name only) which has fixed number of vCPUs and fixed amount of memory. This also includes specifying custom machine type following custom-NUMBER_OF_CPUS-AMOUNT_OF_MEMORY pattern.
     * 
    */
    public String getMachineType() {
        return this.machineType;
    }
    /**
     * Specifies the number of hours after reservation creation where instances using the reservation won't be scheduled for maintenance.
     * 
    */
    public Integer getMaintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours;
    }
    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
    */
    public String getMaintenanceInterval() {
        return this.maintenanceInterval;
    }
    /**
     * Minimum cpu platform the reservation.
     * 
    */
    public String getMinCpuPlatform() {
        return this.minCpuPlatform;
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

        public Builder setGuestAccelerators(List<AcceleratorConfigResponse> guestAccelerators) {
            this.guestAccelerators = Objects.requireNonNull(guestAccelerators);
            return this;
        }

        public Builder setLocalSsds(List<AllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskResponse> localSsds) {
            this.localSsds = Objects.requireNonNull(localSsds);
            return this;
        }

        public Builder setLocationHint(String locationHint) {
            this.locationHint = Objects.requireNonNull(locationHint);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMaintenanceFreezeDurationHours(Integer maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = Objects.requireNonNull(maintenanceFreezeDurationHours);
            return this;
        }

        public Builder setMaintenanceInterval(String maintenanceInterval) {
            this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval);
            return this;
        }

        public Builder setMinCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public AllocationSpecificSKUAllocationReservedInstancePropertiesResponse build() {
            return new AllocationSpecificSKUAllocationReservedInstancePropertiesResponse(guestAccelerators, localSsds, locationHint, machineType, maintenanceFreezeDurationHours, maintenanceInterval, minCpuPlatform);
        }
    }
}
