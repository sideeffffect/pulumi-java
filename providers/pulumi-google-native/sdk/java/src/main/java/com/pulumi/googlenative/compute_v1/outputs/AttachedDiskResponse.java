// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.AttachedDiskInitializeParamsResponse;
import com.pulumi.googlenative.compute_v1.outputs.CustomerEncryptionKeyResponse;
import com.pulumi.googlenative.compute_v1.outputs.GuestOsFeatureResponse;
import com.pulumi.googlenative.compute_v1.outputs.InitialStateConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AttachedDiskResponse {
    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    private final Boolean autoDelete;
    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    private final Boolean boot;
    /**
     * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    private final String deviceName;
    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
     */
    private final CustomerEncryptionKeyResponse diskEncryptionKey;
    /**
     * The size of the disk in GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    /**
     * A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
     */
    private final Integer index;
    /**
     * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    private final AttachedDiskInitializeParamsResponse initializeParams;
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    private final String interface_;
    /**
     * Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    private final String kind;
    /**
     * Any valid publicly visible licenses.
     * 
     */
    private final List<String> licenses;
    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    private final String mode;
    /**
     * shielded vm initial state stored on disk
     * 
     */
    private final InitialStateConfigResponse shieldedInstanceInitialState;
    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
     */
    private final String source;
    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private AttachedDiskResponse(
        @CustomType.Parameter("autoDelete") Boolean autoDelete,
        @CustomType.Parameter("boot") Boolean boot,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("diskEncryptionKey") CustomerEncryptionKeyResponse diskEncryptionKey,
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("guestOsFeatures") List<GuestOsFeatureResponse> guestOsFeatures,
        @CustomType.Parameter("index") Integer index,
        @CustomType.Parameter("initializeParams") AttachedDiskInitializeParamsResponse initializeParams,
        @CustomType.Parameter("interface") String interface_,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("mode") String mode,
        @CustomType.Parameter("shieldedInstanceInitialState") InitialStateConfigResponse shieldedInstanceInitialState,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("type") String type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskSizeGb = diskSizeGb;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.initializeParams = initializeParams;
        this.interface_ = interface_;
        this.kind = kind;
        this.licenses = licenses;
        this.mode = mode;
        this.shieldedInstanceInitialState = shieldedInstanceInitialState;
        this.source = source;
        this.type = type;
    }

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
    */
    public Boolean autoDelete() {
        return this.autoDelete;
    }
    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
    */
    public Boolean boot() {
        return this.boot;
    }
    /**
     * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
    */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
    */
    public CustomerEncryptionKeyResponse diskEncryptionKey() {
        return this.diskEncryptionKey;
    }
    /**
     * The size of the disk in GB.
     * 
    */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
    */
    public List<GuestOsFeatureResponse> guestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * A zero-based index to this disk, where 0 is reserved for the boot disk. If you have many disks attached to an instance, each disk would have a unique index number.
     * 
    */
    public Integer index() {
        return this.index;
    }
    /**
     * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
    */
    public AttachedDiskInitializeParamsResponse initializeParams() {
        return this.initializeParams;
    }
    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
    */
    public String interface_() {
        return this.interface_;
    }
    /**
     * Type of the resource. Always compute#attachedDisk for attached disks.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Any valid publicly visible licenses.
     * 
    */
    public List<String> licenses() {
        return this.licenses;
    }
    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
    */
    public String mode() {
        return this.mode;
    }
    /**
     * shielded vm initial state stored on disk
     * 
    */
    public InitialStateConfigResponse shieldedInstanceInitialState() {
        return this.shieldedInstanceInitialState;
    }
    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
    */
    public String source() {
        return this.source;
    }
    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private String diskSizeGb;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private Integer index;
        private AttachedDiskInitializeParamsResponse initializeParams;
        private String interface_;
        private String kind;
        private List<String> licenses;
        private String mode;
        private InitialStateConfigResponse shieldedInstanceInitialState;
        private String source;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.initializeParams = defaults.initializeParams;
    	      this.interface_ = defaults.interface_;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.shieldedInstanceInitialState = defaults.shieldedInstanceInitialState;
    	      this.source = defaults.source;
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
        public Builder initializeParams(AttachedDiskInitializeParamsResponse initializeParams) {
            this.initializeParams = Objects.requireNonNull(initializeParams);
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
        public Builder shieldedInstanceInitialState(InitialStateConfigResponse shieldedInstanceInitialState) {
            this.shieldedInstanceInitialState = Objects.requireNonNull(shieldedInstanceInitialState);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AttachedDiskResponse build() {
            return new AttachedDiskResponse(autoDelete, boot, deviceName, diskEncryptionKey, diskSizeGb, guestOsFeatures, index, initializeParams, interface_, kind, licenses, mode, shieldedInstanceInitialState, source, type);
        }
    }
}
