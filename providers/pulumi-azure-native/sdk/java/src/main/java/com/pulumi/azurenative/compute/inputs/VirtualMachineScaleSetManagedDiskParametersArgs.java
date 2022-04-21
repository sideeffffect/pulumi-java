// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.enums.StorageAccountTypes;
import com.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the parameters of a ScaleSet managed disk.
 * 
 */
public final class VirtualMachineScaleSetManagedDiskParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetManagedDiskParametersArgs Empty = new VirtualMachineScaleSetManagedDiskParametersArgs();

    /**
     * Specifies the customer managed disk encryption set resource id for the managed disk.
     * 
     */
    @Import(name="diskEncryptionSet")
    private @Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet;

    public Optional<Output<DiskEncryptionSetParametersArgs>> diskEncryptionSet() {
        return Optional.ofNullable(this.diskEncryptionSet);
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @Import(name="storageAccountType")
    private @Nullable Output<Either<String,StorageAccountTypes>> storageAccountType;

    public Optional<Output<Either<String,StorageAccountTypes>>> storageAccountType() {
        return Optional.ofNullable(this.storageAccountType);
    }

    private VirtualMachineScaleSetManagedDiskParametersArgs() {}

    private VirtualMachineScaleSetManagedDiskParametersArgs(VirtualMachineScaleSetManagedDiskParametersArgs $) {
        this.diskEncryptionSet = $.diskEncryptionSet;
        this.storageAccountType = $.storageAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetManagedDiskParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetManagedDiskParametersArgs $;

        public Builder() {
            $ = new VirtualMachineScaleSetManagedDiskParametersArgs();
        }

        public Builder(VirtualMachineScaleSetManagedDiskParametersArgs defaults) {
            $ = new VirtualMachineScaleSetManagedDiskParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder diskEncryptionSet(@Nullable Output<DiskEncryptionSetParametersArgs> diskEncryptionSet) {
            $.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder diskEncryptionSet(DiskEncryptionSetParametersArgs diskEncryptionSet) {
            return diskEncryptionSet(Output.of(diskEncryptionSet));
        }

        public Builder storageAccountType(@Nullable Output<Either<String,StorageAccountTypes>> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        public Builder storageAccountType(Either<String,StorageAccountTypes> storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        public VirtualMachineScaleSetManagedDiskParametersArgs build() {
            return $;
        }
    }

}
