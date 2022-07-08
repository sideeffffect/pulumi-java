// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VmwareVmDetailsResponse {
    /**
     * @return The VM Boot Option.
     * 
     */
    private final String bootOption;
    /**
     * @return The total size of the storage allocated to the VM in MB.
     * 
     */
    private final String committedStorageMb;
    /**
     * @return The number of cpus in the VM.
     * 
     */
    private final Integer cpuCount;
    /**
     * @return The descriptive name of the vCenter&#39;s datacenter this VM is contained in.
     * 
     */
    private final String datacenterDescription;
    /**
     * @return The id of the vCenter&#39;s datacenter this VM is contained in.
     * 
     */
    private final String datacenterId;
    /**
     * @return The number of disks the VM has.
     * 
     */
    private final Integer diskCount;
    /**
     * @return The display name of the VM. Note that this is not necessarily unique.
     * 
     */
    private final String displayName;
    /**
     * @return The VM&#39;s OS. See for example https://vdc-repo.vmware.com/vmwb-repository/dcr-public/da47f910-60ac-438b-8b9b-6122f4d14524/16b7274a-bf8b-4b4c-a05e-746f2aa93c8c/doc/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
     * 
     */
    private final String guestDescription;
    /**
     * @return The size of the memory of the VM in MB.
     * 
     */
    private final Integer memoryMb;
    /**
     * @return The power state of the VM at the moment list was taken.
     * 
     */
    private final String powerState;
    /**
     * @return The unique identifier of the VM in vCenter.
     * 
     */
    private final String uuid;
    /**
     * @return The VM&#39;s id in the source (note that this is not the MigratingVm&#39;s id). This is the moref id of the VM.
     * 
     */
    private final String vmId;

    @CustomType.Constructor
    private VmwareVmDetailsResponse(
        @CustomType.Parameter("bootOption") String bootOption,
        @CustomType.Parameter("committedStorageMb") String committedStorageMb,
        @CustomType.Parameter("cpuCount") Integer cpuCount,
        @CustomType.Parameter("datacenterDescription") String datacenterDescription,
        @CustomType.Parameter("datacenterId") String datacenterId,
        @CustomType.Parameter("diskCount") Integer diskCount,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("guestDescription") String guestDescription,
        @CustomType.Parameter("memoryMb") Integer memoryMb,
        @CustomType.Parameter("powerState") String powerState,
        @CustomType.Parameter("uuid") String uuid,
        @CustomType.Parameter("vmId") String vmId) {
        this.bootOption = bootOption;
        this.committedStorageMb = committedStorageMb;
        this.cpuCount = cpuCount;
        this.datacenterDescription = datacenterDescription;
        this.datacenterId = datacenterId;
        this.diskCount = diskCount;
        this.displayName = displayName;
        this.guestDescription = guestDescription;
        this.memoryMb = memoryMb;
        this.powerState = powerState;
        this.uuid = uuid;
        this.vmId = vmId;
    }

    /**
     * @return The VM Boot Option.
     * 
     */
    public String bootOption() {
        return this.bootOption;
    }
    /**
     * @return The total size of the storage allocated to the VM in MB.
     * 
     */
    public String committedStorageMb() {
        return this.committedStorageMb;
    }
    /**
     * @return The number of cpus in the VM.
     * 
     */
    public Integer cpuCount() {
        return this.cpuCount;
    }
    /**
     * @return The descriptive name of the vCenter&#39;s datacenter this VM is contained in.
     * 
     */
    public String datacenterDescription() {
        return this.datacenterDescription;
    }
    /**
     * @return The id of the vCenter&#39;s datacenter this VM is contained in.
     * 
     */
    public String datacenterId() {
        return this.datacenterId;
    }
    /**
     * @return The number of disks the VM has.
     * 
     */
    public Integer diskCount() {
        return this.diskCount;
    }
    /**
     * @return The display name of the VM. Note that this is not necessarily unique.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The VM&#39;s OS. See for example https://vdc-repo.vmware.com/vmwb-repository/dcr-public/da47f910-60ac-438b-8b9b-6122f4d14524/16b7274a-bf8b-4b4c-a05e-746f2aa93c8c/doc/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
     * 
     */
    public String guestDescription() {
        return this.guestDescription;
    }
    /**
     * @return The size of the memory of the VM in MB.
     * 
     */
    public Integer memoryMb() {
        return this.memoryMb;
    }
    /**
     * @return The power state of the VM at the moment list was taken.
     * 
     */
    public String powerState() {
        return this.powerState;
    }
    /**
     * @return The unique identifier of the VM in vCenter.
     * 
     */
    public String uuid() {
        return this.uuid;
    }
    /**
     * @return The VM&#39;s id in the source (note that this is not the MigratingVm&#39;s id). This is the moref id of the VM.
     * 
     */
    public String vmId() {
        return this.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmwareVmDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootOption;
        private String committedStorageMb;
        private Integer cpuCount;
        private String datacenterDescription;
        private String datacenterId;
        private Integer diskCount;
        private String displayName;
        private String guestDescription;
        private Integer memoryMb;
        private String powerState;
        private String uuid;
        private String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(VmwareVmDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootOption = defaults.bootOption;
    	      this.committedStorageMb = defaults.committedStorageMb;
    	      this.cpuCount = defaults.cpuCount;
    	      this.datacenterDescription = defaults.datacenterDescription;
    	      this.datacenterId = defaults.datacenterId;
    	      this.diskCount = defaults.diskCount;
    	      this.displayName = defaults.displayName;
    	      this.guestDescription = defaults.guestDescription;
    	      this.memoryMb = defaults.memoryMb;
    	      this.powerState = defaults.powerState;
    	      this.uuid = defaults.uuid;
    	      this.vmId = defaults.vmId;
        }

        public Builder bootOption(String bootOption) {
            this.bootOption = Objects.requireNonNull(bootOption);
            return this;
        }
        public Builder committedStorageMb(String committedStorageMb) {
            this.committedStorageMb = Objects.requireNonNull(committedStorageMb);
            return this;
        }
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = Objects.requireNonNull(cpuCount);
            return this;
        }
        public Builder datacenterDescription(String datacenterDescription) {
            this.datacenterDescription = Objects.requireNonNull(datacenterDescription);
            return this;
        }
        public Builder datacenterId(String datacenterId) {
            this.datacenterId = Objects.requireNonNull(datacenterId);
            return this;
        }
        public Builder diskCount(Integer diskCount) {
            this.diskCount = Objects.requireNonNull(diskCount);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder guestDescription(String guestDescription) {
            this.guestDescription = Objects.requireNonNull(guestDescription);
            return this;
        }
        public Builder memoryMb(Integer memoryMb) {
            this.memoryMb = Objects.requireNonNull(memoryMb);
            return this;
        }
        public Builder powerState(String powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }        public VmwareVmDetailsResponse build() {
            return new VmwareVmDetailsResponse(bootOption, committedStorageMb, cpuCount, datacenterDescription, datacenterId, diskCount, displayName, guestDescription, memoryMb, powerState, uuid, vmId);
        }
    }
}
