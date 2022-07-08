// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.alpha.outputs.CustomerEncryptionKeyResponse;
import com.pulumi.googlenative.compute.alpha.outputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class SavedAttachedDiskResponse {
    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    private final Boolean autoDelete;
    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    private final Boolean boot;
    /**
     * @return Specifies the name of the disk attached to the source instance.
     * 
     */
    private final String deviceName;
    /**
     * @return The encryption key for the disk.
     * 
     */
    private final CustomerEncryptionKeyResponse diskEncryptionKey;
    /**
     * @return The size of the disk in base-2 GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * @return URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
     * 
     */
    private final String diskType;
    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    /**
     * @return Specifies zero-based index of the disk that is attached to the source instance.
     * 
     */
    private final Integer index;
    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
     */
    private final String interface_;
    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    private final String kind;
    /**
     * @return Any valid publicly visible licenses.
     * 
     */
    private final List<String> licenses;
    /**
     * @return The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
     * 
     */
    private final String mode;
    /**
     * @return Specifies a URL of the disk attached to the source instance.
     * 
     */
    private final String source;
    /**
     * @return A size of the storage used by the disk&#39;s snapshot by this machine image.
     * 
     */
    private final String storageBytes;
    /**
     * @return An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    private final String storageBytesStatus;
    /**
     * @return Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private SavedAttachedDiskResponse(
        @CustomType.Parameter("autoDelete") Boolean autoDelete,
        @CustomType.Parameter("boot") Boolean boot,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("diskEncryptionKey") CustomerEncryptionKeyResponse diskEncryptionKey,
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("diskType") String diskType,
        @CustomType.Parameter("guestOsFeatures") List<GuestOsFeatureResponse> guestOsFeatures,
        @CustomType.Parameter("index") Integer index,
        @CustomType.Parameter("interface") String interface_,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("storageBytes") String storageBytes,
        @CustomType.Parameter("storageBytesStatus") String storageBytesStatus,
        @CustomType.Parameter("type") String type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.interface_ = interface_;
        this.kind = kind;
        this.licenses = licenses;
        this.mode = mode;
        this.source = source;
        this.storageBytes = storageBytes;
        this.storageBytesStatus = storageBytesStatus;
        this.type = type;
    }

    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    public Boolean autoDelete() {
        return this.autoDelete;
    }
    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    public Boolean boot() {
        return this.boot;
    }
    /**
     * @return Specifies the name of the disk attached to the source instance.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return The encryption key for the disk.
     * 
     */
    public CustomerEncryptionKeyResponse diskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * @return The size of the disk in base-2 GB.
     * 
     */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * @return URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
     * 
     */
    public String diskType() {
        return this.diskType;
    }
    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    public List<GuestOsFeatureResponse> guestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * @return Specifies zero-based index of the disk that is attached to the source instance.
     * 
     */
    public Integer index() {
        return this.index;
    }
    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
     */
    public String interface_() {
        return this.interface_;
    }
    /**
     * @return Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Any valid publicly visible licenses.
     * 
     */
    public List<String> licenses() {
        return this.licenses;
    }
    /**
     * @return The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
     * 
     */
    public String mode() {
        return this.mode;
    }
    /**
     * @return Specifies a URL of the disk attached to the source instance.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return A size of the storage used by the disk&#39;s snapshot by this machine image.
     * 
     */
    public String storageBytes() {
        return this.storageBytes;
    }
    /**
     * @return An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    public String storageBytesStatus() {
        return this.storageBytesStatus;
    }
    /**
     * @return Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedAttachedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private String diskSizeGb;
        private String diskType;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private Integer index;
        private String interface_;
        private String kind;
        private List<String> licenses;
        private String mode;
        private String source;
        private String storageBytes;
        private String storageBytesStatus;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedAttachedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.interface_ = defaults.interface_;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageBytesStatus = defaults.storageBytesStatus;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        public Builder boot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder diskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }
        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(GuestOsFeatureResponse... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder storageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }
        public Builder storageBytesStatus(String storageBytesStatus) {
            this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SavedAttachedDiskResponse build() {
            return new SavedAttachedDiskResponse(autoDelete, boot, deviceName, diskEncryptionKey, diskSizeGb, diskType, guestOsFeatures, index, interface_, kind, licenses, mode, source, storageBytes, storageBytesStatus, type);
        }
    }
}
