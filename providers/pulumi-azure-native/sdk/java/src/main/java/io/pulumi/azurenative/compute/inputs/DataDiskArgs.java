// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.CachingTypes;
import io.pulumi.azurenative.compute.enums.DiskCreateOptionTypes;
import io.pulumi.azurenative.compute.enums.DiskDeleteOptionTypes;
import io.pulumi.azurenative.compute.enums.DiskDetachOptionTypes;
import io.pulumi.azurenative.compute.inputs.ManagedDiskParametersArgs;
import io.pulumi.azurenative.compute.inputs.VirtualHardDiskArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes a data disk.
 * 
 */
public final class DataDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataDiskArgs Empty = new DataDiskArgs();

    /**
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly** <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     * 
     */
    @InputImport(name="caching")
      private final @Nullable Input<CachingTypes> caching;

    public Input<CachingTypes> getCaching() {
        return this.caching == null ? Input.empty() : this.caching;
    }

    /**
     * Specifies how the virtual machine should be created.<br><br> Possible values are:<br><br> **Attach** \u2013 This value is used when you are using a specialized disk to create the virtual machine.<br><br> **FromImage** \u2013 This value is used when you are using an image to create the virtual machine. If you are using a platform image, you also use the imageReference element described above. If you are using a marketplace image, you  also use the plan element previously described.
     * 
     */
    @InputImport(name="createOption", required=true)
      private final Input<Either<String,DiskCreateOptionTypes>> createOption;

    public Input<Either<String,DiskCreateOptionTypes>> getCreateOption() {
        return this.createOption;
    }

    /**
     * Specifies whether data disk should be deleted or detached upon VM deletion.<br><br> Possible values: <br><br> **Delete** If this value is used, the data disk is deleted when VM is deleted.<br><br> **Detach** If this value is used, the data disk is retained after VM is deleted.<br><br> The default value is set to **detach**
     * 
     */
    @InputImport(name="deleteOption")
      private final @Nullable Input<Either<String,DiskDeleteOptionTypes>> deleteOption;

    public Input<Either<String,DiskDeleteOptionTypes>> getDeleteOption() {
        return this.deleteOption == null ? Input.empty() : this.deleteOption;
    }

    /**
     * Specifies the detach behavior to be used while detaching a disk or which is already in the process of detachment from the virtual machine. Supported values: **ForceDetach**. <br><br> detachOption: **ForceDetach** is applicable only for managed data disks. If a previous detachment attempt of the data disk did not complete due to an unexpected failure from the virtual machine and the disk is still not released then use force-detach as a last resort option to detach the disk forcibly from the VM. All writes might not have been flushed when using this detach behavior. <br><br> This feature is still in preview mode and is not supported for VirtualMachineScaleSet. To force-detach a data disk update toBeDetached to 'true' along with setting detachOption: 'ForceDetach'.
     * 
     */
    @InputImport(name="detachOption")
      private final @Nullable Input<Either<String,DiskDetachOptionTypes>> detachOption;

    public Input<Either<String,DiskDetachOptionTypes>> getDetachOption() {
        return this.detachOption == null ? Input.empty() : this.detachOption;
    }

    /**
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Input<Integer> diskSizeGB;

    public Input<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Input.empty() : this.diskSizeGB;
    }

    /**
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     * 
     */
    @InputImport(name="image")
      private final @Nullable Input<VirtualHardDiskArgs> image;

    public Input<VirtualHardDiskArgs> getImage() {
        return this.image == null ? Input.empty() : this.image;
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @InputImport(name="lun", required=true)
      private final Input<Integer> lun;

    public Input<Integer> getLun() {
        return this.lun;
    }

    /**
     * The managed disk parameters.
     * 
     */
    @InputImport(name="managedDisk")
      private final @Nullable Input<ManagedDiskParametersArgs> managedDisk;

    public Input<ManagedDiskParametersArgs> getManagedDisk() {
        return this.managedDisk == null ? Input.empty() : this.managedDisk;
    }

    /**
     * The disk name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Specifies whether the data disk is in process of detachment from the VirtualMachine/VirtualMachineScaleset
     * 
     */
    @InputImport(name="toBeDetached")
      private final @Nullable Input<Boolean> toBeDetached;

    public Input<Boolean> getToBeDetached() {
        return this.toBeDetached == null ? Input.empty() : this.toBeDetached;
    }

    /**
     * The virtual hard disk.
     * 
     */
    @InputImport(name="vhd")
      private final @Nullable Input<VirtualHardDiskArgs> vhd;

    public Input<VirtualHardDiskArgs> getVhd() {
        return this.vhd == null ? Input.empty() : this.vhd;
    }

    /**
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     * 
     */
    @InputImport(name="writeAcceleratorEnabled")
      private final @Nullable Input<Boolean> writeAcceleratorEnabled;

    public Input<Boolean> getWriteAcceleratorEnabled() {
        return this.writeAcceleratorEnabled == null ? Input.empty() : this.writeAcceleratorEnabled;
    }

    public DataDiskArgs(
        @Nullable Input<CachingTypes> caching,
        Input<Either<String,DiskCreateOptionTypes>> createOption,
        @Nullable Input<Either<String,DiskDeleteOptionTypes>> deleteOption,
        @Nullable Input<Either<String,DiskDetachOptionTypes>> detachOption,
        @Nullable Input<Integer> diskSizeGB,
        @Nullable Input<VirtualHardDiskArgs> image,
        Input<Integer> lun,
        @Nullable Input<ManagedDiskParametersArgs> managedDisk,
        @Nullable Input<String> name,
        @Nullable Input<Boolean> toBeDetached,
        @Nullable Input<VirtualHardDiskArgs> vhd,
        @Nullable Input<Boolean> writeAcceleratorEnabled) {
        this.caching = caching;
        this.createOption = Objects.requireNonNull(createOption, "expected parameter 'createOption' to be non-null");
        this.deleteOption = deleteOption;
        this.detachOption = detachOption;
        this.diskSizeGB = diskSizeGB;
        this.image = image;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.managedDisk = managedDisk;
        this.name = name;
        this.toBeDetached = toBeDetached;
        this.vhd = vhd;
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
    }

    private DataDiskArgs() {
        this.caching = Input.empty();
        this.createOption = Input.empty();
        this.deleteOption = Input.empty();
        this.detachOption = Input.empty();
        this.diskSizeGB = Input.empty();
        this.image = Input.empty();
        this.lun = Input.empty();
        this.managedDisk = Input.empty();
        this.name = Input.empty();
        this.toBeDetached = Input.empty();
        this.vhd = Input.empty();
        this.writeAcceleratorEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CachingTypes> caching;
        private Input<Either<String,DiskCreateOptionTypes>> createOption;
        private @Nullable Input<Either<String,DiskDeleteOptionTypes>> deleteOption;
        private @Nullable Input<Either<String,DiskDetachOptionTypes>> detachOption;
        private @Nullable Input<Integer> diskSizeGB;
        private @Nullable Input<VirtualHardDiskArgs> image;
        private Input<Integer> lun;
        private @Nullable Input<ManagedDiskParametersArgs> managedDisk;
        private @Nullable Input<String> name;
        private @Nullable Input<Boolean> toBeDetached;
        private @Nullable Input<VirtualHardDiskArgs> vhd;
        private @Nullable Input<Boolean> writeAcceleratorEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.createOption = defaults.createOption;
    	      this.deleteOption = defaults.deleteOption;
    	      this.detachOption = defaults.detachOption;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.image = defaults.image;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
    	      this.toBeDetached = defaults.toBeDetached;
    	      this.vhd = defaults.vhd;
    	      this.writeAcceleratorEnabled = defaults.writeAcceleratorEnabled;
        }

        public Builder caching(@Nullable Input<CachingTypes> caching) {
            this.caching = caching;
            return this;
        }

        public Builder caching(@Nullable CachingTypes caching) {
            this.caching = Input.ofNullable(caching);
            return this;
        }

        public Builder createOption(Input<Either<String,DiskCreateOptionTypes>> createOption) {
            this.createOption = Objects.requireNonNull(createOption);
            return this;
        }

        public Builder createOption(Either<String,DiskCreateOptionTypes> createOption) {
            this.createOption = Input.of(Objects.requireNonNull(createOption));
            return this;
        }

        public Builder deleteOption(@Nullable Input<Either<String,DiskDeleteOptionTypes>> deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder deleteOption(@Nullable Either<String,DiskDeleteOptionTypes> deleteOption) {
            this.deleteOption = Input.ofNullable(deleteOption);
            return this;
        }

        public Builder detachOption(@Nullable Input<Either<String,DiskDetachOptionTypes>> detachOption) {
            this.detachOption = detachOption;
            return this;
        }

        public Builder detachOption(@Nullable Either<String,DiskDetachOptionTypes> detachOption) {
            this.detachOption = Input.ofNullable(detachOption);
            return this;
        }

        public Builder diskSizeGB(@Nullable Input<Integer> diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = Input.ofNullable(diskSizeGB);
            return this;
        }

        public Builder image(@Nullable Input<VirtualHardDiskArgs> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable VirtualHardDiskArgs image) {
            this.image = Input.ofNullable(image);
            return this;
        }

        public Builder lun(Input<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder lun(Integer lun) {
            this.lun = Input.of(Objects.requireNonNull(lun));
            return this;
        }

        public Builder managedDisk(@Nullable Input<ManagedDiskParametersArgs> managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder managedDisk(@Nullable ManagedDiskParametersArgs managedDisk) {
            this.managedDisk = Input.ofNullable(managedDisk);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder toBeDetached(@Nullable Input<Boolean> toBeDetached) {
            this.toBeDetached = toBeDetached;
            return this;
        }

        public Builder toBeDetached(@Nullable Boolean toBeDetached) {
            this.toBeDetached = Input.ofNullable(toBeDetached);
            return this;
        }

        public Builder vhd(@Nullable Input<VirtualHardDiskArgs> vhd) {
            this.vhd = vhd;
            return this;
        }

        public Builder vhd(@Nullable VirtualHardDiskArgs vhd) {
            this.vhd = Input.ofNullable(vhd);
            return this;
        }

        public Builder writeAcceleratorEnabled(@Nullable Input<Boolean> writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        public Builder writeAcceleratorEnabled(@Nullable Boolean writeAcceleratorEnabled) {
            this.writeAcceleratorEnabled = Input.ofNullable(writeAcceleratorEnabled);
            return this;
        }
        public DataDiskArgs build() {
            return new DataDiskArgs(caching, createOption, deleteOption, detachOption, diskSizeGB, image, lun, managedDisk, name, toBeDetached, vhd, writeAcceleratorEnabled);
        }
    }
}
