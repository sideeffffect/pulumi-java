// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DiskEncryptionSetParametersResponse;
import io.pulumi.azurenative.compute.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a data disk.
 * 
 */
public final class ImageDataDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageDataDiskResponse Empty = new ImageDataDiskResponse();

    /**
     * The Virtual Hard Disk.
     * 
     */
    @InputImport(name="blobUri")
      private final @Nullable String blobUri;

    public Optional<String> getBlobUri() {
        return this.blobUri == null ? Optional.empty() : Optional.ofNullable(this.blobUri);
    }

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
     * Specifies the customer managed disk encryption set resource id for the managed image disk.
     * 
     */
    @InputImport(name="diskEncryptionSet")
      private final @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;

    public Optional<DiskEncryptionSetParametersResponse> getDiskEncryptionSet() {
        return this.diskEncryptionSet == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionSet);
    }

    /**
     * Specifies the size of empty data disks in gigabytes. This element can be used to overwrite the name of the disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     * 
     */
    @InputImport(name="diskSizeGB")
      private final @Nullable Integer diskSizeGB;

    public Optional<Integer> getDiskSizeGB() {
        return this.diskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.diskSizeGB);
    }

    /**
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and therefore must be unique for each data disk attached to a VM.
     * 
     */
    @InputImport(name="lun", required=true)
      private final Integer lun;

    public Integer getLun() {
        return this.lun;
    }

    /**
     * The managedDisk.
     * 
     */
    @InputImport(name="managedDisk")
      private final @Nullable SubResourceResponse managedDisk;

    public Optional<SubResourceResponse> getManagedDisk() {
        return this.managedDisk == null ? Optional.empty() : Optional.ofNullable(this.managedDisk);
    }

    /**
     * The snapshot.
     * 
     */
    @InputImport(name="snapshot")
      private final @Nullable SubResourceResponse snapshot;

    public Optional<SubResourceResponse> getSnapshot() {
        return this.snapshot == null ? Optional.empty() : Optional.ofNullable(this.snapshot);
    }

    /**
     * Specifies the storage account type for the managed disk. NOTE: UltraSSD_LRS can only be used with data disks, it cannot be used with OS Disk.
     * 
     */
    @InputImport(name="storageAccountType")
      private final @Nullable String storageAccountType;

    public Optional<String> getStorageAccountType() {
        return this.storageAccountType == null ? Optional.empty() : Optional.ofNullable(this.storageAccountType);
    }

    public ImageDataDiskResponse(
        @Nullable String blobUri,
        @Nullable String caching,
        @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet,
        @Nullable Integer diskSizeGB,
        Integer lun,
        @Nullable SubResourceResponse managedDisk,
        @Nullable SubResourceResponse snapshot,
        @Nullable String storageAccountType) {
        this.blobUri = blobUri;
        this.caching = caching;
        this.diskEncryptionSet = diskEncryptionSet;
        this.diskSizeGB = diskSizeGB;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
        this.managedDisk = managedDisk;
        this.snapshot = snapshot;
        this.storageAccountType = storageAccountType;
    }

    private ImageDataDiskResponse() {
        this.blobUri = null;
        this.caching = null;
        this.diskEncryptionSet = null;
        this.diskSizeGB = null;
        this.lun = null;
        this.managedDisk = null;
        this.snapshot = null;
        this.storageAccountType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageDataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String blobUri;
        private @Nullable String caching;
        private @Nullable DiskEncryptionSetParametersResponse diskEncryptionSet;
        private @Nullable Integer diskSizeGB;
        private Integer lun;
        private @Nullable SubResourceResponse managedDisk;
        private @Nullable SubResourceResponse snapshot;
        private @Nullable String storageAccountType;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageDataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blobUri = defaults.blobUri;
    	      this.caching = defaults.caching;
    	      this.diskEncryptionSet = defaults.diskEncryptionSet;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.snapshot = defaults.snapshot;
    	      this.storageAccountType = defaults.storageAccountType;
        }

        public Builder blobUri(@Nullable String blobUri) {
            this.blobUri = blobUri;
            return this;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }

        public Builder diskEncryptionSet(@Nullable DiskEncryptionSetParametersResponse diskEncryptionSet) {
            this.diskEncryptionSet = diskEncryptionSet;
            return this;
        }

        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }

        public Builder lun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder managedDisk(@Nullable SubResourceResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }

        public Builder snapshot(@Nullable SubResourceResponse snapshot) {
            this.snapshot = snapshot;
            return this;
        }

        public Builder storageAccountType(@Nullable String storageAccountType) {
            this.storageAccountType = storageAccountType;
            return this;
        }
        public ImageDataDiskResponse build() {
            return new ImageDataDiskResponse(blobUri, caching, diskEncryptionSet, diskSizeGB, lun, managedDisk, snapshot, storageAccountType);
        }
    }
}
