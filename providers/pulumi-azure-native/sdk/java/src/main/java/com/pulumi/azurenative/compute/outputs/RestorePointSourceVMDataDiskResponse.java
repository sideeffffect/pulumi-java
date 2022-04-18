// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.ApiEntityReferenceResponse;
import com.pulumi.azurenative.compute.outputs.ManagedDiskParametersResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RestorePointSourceVMDataDiskResponse {
    /**
     * Gets the caching type.
     * 
     */
    private final @Nullable String caching;
    /**
     * Gets the disk restore point Id.
     * 
     */
    private final @Nullable ApiEntityReferenceResponse diskRestorePoint;
    /**
     * Gets the initial disk size in GB for blank data disks, and the new desired size for existing OS and Data disks.
     * 
     */
    private final @Nullable Integer diskSizeGB;
    /**
     * Gets the logical unit number.
     * 
     */
    private final @Nullable Integer lun;
    /**
     * Gets the managed disk details
     * 
     */
    private final @Nullable ManagedDiskParametersResponse managedDisk;
    /**
     * Gets the disk name.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private RestorePointSourceVMDataDiskResponse(
        @CustomType.Parameter("caching") @Nullable String caching,
        @CustomType.Parameter("diskRestorePoint") @Nullable ApiEntityReferenceResponse diskRestorePoint,
        @CustomType.Parameter("diskSizeGB") @Nullable Integer diskSizeGB,
        @CustomType.Parameter("lun") @Nullable Integer lun,
        @CustomType.Parameter("managedDisk") @Nullable ManagedDiskParametersResponse managedDisk,
        @CustomType.Parameter("name") @Nullable String name) {
        this.caching = caching;
        this.diskRestorePoint = diskRestorePoint;
        this.diskSizeGB = diskSizeGB;
        this.lun = lun;
        this.managedDisk = managedDisk;
        this.name = name;
    }

    /**
     * Gets the caching type.
     * 
    */
    public Optional<String> caching() {
        return Optional.ofNullable(this.caching);
    }
    /**
     * Gets the disk restore point Id.
     * 
    */
    public Optional<ApiEntityReferenceResponse> diskRestorePoint() {
        return Optional.ofNullable(this.diskRestorePoint);
    }
    /**
     * Gets the initial disk size in GB for blank data disks, and the new desired size for existing OS and Data disks.
     * 
    */
    public Optional<Integer> diskSizeGB() {
        return Optional.ofNullable(this.diskSizeGB);
    }
    /**
     * Gets the logical unit number.
     * 
    */
    public Optional<Integer> lun() {
        return Optional.ofNullable(this.lun);
    }
    /**
     * Gets the managed disk details
     * 
    */
    public Optional<ManagedDiskParametersResponse> managedDisk() {
        return Optional.ofNullable(this.managedDisk);
    }
    /**
     * Gets the disk name.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceVMDataDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caching;
        private @Nullable ApiEntityReferenceResponse diskRestorePoint;
        private @Nullable Integer diskSizeGB;
        private @Nullable Integer lun;
        private @Nullable ManagedDiskParametersResponse managedDisk;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceVMDataDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caching = defaults.caching;
    	      this.diskRestorePoint = defaults.diskRestorePoint;
    	      this.diskSizeGB = defaults.diskSizeGB;
    	      this.lun = defaults.lun;
    	      this.managedDisk = defaults.managedDisk;
    	      this.name = defaults.name;
        }

        public Builder caching(@Nullable String caching) {
            this.caching = caching;
            return this;
        }
        public Builder diskRestorePoint(@Nullable ApiEntityReferenceResponse diskRestorePoint) {
            this.diskRestorePoint = diskRestorePoint;
            return this;
        }
        public Builder diskSizeGB(@Nullable Integer diskSizeGB) {
            this.diskSizeGB = diskSizeGB;
            return this;
        }
        public Builder lun(@Nullable Integer lun) {
            this.lun = lun;
            return this;
        }
        public Builder managedDisk(@Nullable ManagedDiskParametersResponse managedDisk) {
            this.managedDisk = managedDisk;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public RestorePointSourceVMDataDiskResponse build() {
            return new RestorePointSourceVMDataDiskResponse(caching, diskRestorePoint, diskSizeGB, lun, managedDisk, name);
        }
    }
}
