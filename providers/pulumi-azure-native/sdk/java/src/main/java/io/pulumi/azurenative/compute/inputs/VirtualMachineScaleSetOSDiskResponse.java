// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DiffDiskSettingsResponse;
import io.pulumi.azurenative.compute.inputs.VirtualHardDiskResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetManagedDiskParametersResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set operating system disk.
 * 
 */
public final class VirtualMachineScaleSetOSDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetOSDiskResponse Empty = new VirtualMachineScaleSetOSDiskResponse();

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @InputImport(name="caching")
      private final @Nullable String caching;

    public Optional<String> getCaching() {
        return this.caching == null ? Optional.empty() : Optional.ofNullable(this.caching);
    }

    /**
     * Specifies how the virtual machines in the scale set should be created.<br><br> The only allowed value is: **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    @InputImport(name="createOption", required=true)
      private final String createOption;

    public String getCreateOption() {
        return this.createOption;
    }

    /**
     * Specifies the ephemeral disk Settings for the operating system disk used by the virtual machine scale set.
     * 
     */
    @InputImport(name="diffDiskSettings")
      private final @Nullable DiffDiskSettingsResponse diffDiskSettings;

    public Optional<DiffDiskSettingsResponse> getDiffDiskSettings() {
        return this.diffDiskSettings == null ? Optional.empty() : Optional.ofNullable(this.diffDiskSettings);
    }

    /**
     * Specifies the size of the operating system disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Integer diskSizeGB;

    public Optional<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * Specifies information about the unmanaged user image to base the scale set on.
     * 
     */
    @InputImport(name="image")
      private final @Nullable VirtualHardDiskResponse image;

    public Optional<VirtualHardDiskResponse> getImage() {
        return this.image == null ? Optional.empty() : Optional.ofNullable(this.image);
    }

    /**
     * The managed disk parameters.
     * 
     */
    @InputImport(name="managedDisk")
      private final @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;

    public Optional<VirtualMachineScaleSetManagedDiskParametersResponse> getManagedDisk() {
        return this.managedDisk == null ? Optional.empty() : Optional.ofNullable(this.managedDisk);
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * This property allows you to specify the type of the OS that is included in the disk if creating a VM from user-image or a specialized VHD. <br><br> Possible values are: <br><br> **Windows** <br><br> **Linux**
     * 
     */
    @InputImport(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * Specifies the container urls that are used to store operating system disks for the scale set.
     * 
     */
    @InputImport(name="vhdContainers")
      private final @Nullable List<String> vhdContainers;

    public List<String> getVhdContainers() {
        return this.vhdContainers == null ? List.of() : this.vhdContainers;
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @InputImport(name="writeAcceleratorEnabled")
      private final @Nullable Boolean writeAcceleratorEnabled;

    public Optional<Boolean> getWriteAcceleratorEnabled() {
        return this.writeAcceleratorEnabled == null ? Optional.empty() : Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    public VirtualMachineScaleSetOSDiskResponse(
        @Nullable String caching,
        String createOption,
        @Nullable DiffDiskSettingsResponse diffDiskSettings,
        @Nullable Integer diskSizeGB,
        @Nullable VirtualHardDiskResponse image,
        @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk,
        @Nullable String name,
        @Nullable String osType,
        @Nullable List<String> vhdContainers,
        @Nullable Boolean writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.diffDiskSettings = diffDiskSettings;
        this.diskSizeGB = diskSizeGB;
        this.image = image;
        this.managedDisk = managedDisk;
        this.name = name;
        this.osType = osType;
        this.vhdContainers = vhdContainers;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    private VirtualMachineScaleSetOSDiskResponse() {
        this.caching = null;
        this.createOption = null;
        this.diffDiskSettings = null;
        this.diskSizeGB = null;
        this.image = null;
        this.managedDisk = null;
        this.name = null;
        this.osType = null;
        this.vhdContainers = List.of();
        this.writeAcceleratorEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetOSDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private String createOption;
        private @Nullable DiffDiskSettingsResponse diffDiskSettings;
        private @Nullable Integer diskSizeGB;
        private @Nullable VirtualHardDiskResponse image;
        private @Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk;
        private @Nullable String name;
        private @Nullable String osType;
        private @Nullable List<String> vhdContainers;
        private @Nullable Boolean writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetOSDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.diffDiskSettings = defaults.diffDiskSettings;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.image = defaults.image;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.osType = defaults.osType;
    	      this.vhdContainers = defaults.vhdContainers;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder createOption(String createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder diffDiskSettings(@Nullable DiffDiskSettingsResponse diffDiskSettings) {
            this.diffDiskSettings = diffDiskSettings;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder image(@Nullable VirtualHardDiskResponse image) {
            this.image = image;
            return this;
        }

        public Builder managedDisk(@Nullable VirtualMachineScaleSetManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder vhdContainers(@Nullable List<String> vhdContainers) {
            this.vhdContainers = vhdContainers;
            return this;
        }

        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }
        public VirtualMachineScaleSetOSDiskResponse build() {
            return new VirtualMachineScaleSetOSDiskResponse(caching, createOption, diffDiskSettings, diskSizeGB, image, managedDisk, name, osType, vhdContainers, writeAcceleratorEnabled);
        }
    }
}
