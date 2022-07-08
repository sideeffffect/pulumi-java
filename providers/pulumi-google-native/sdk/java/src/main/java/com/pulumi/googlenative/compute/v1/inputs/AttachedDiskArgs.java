// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.enums.AttachedDiskInterface;
import com.pulumi.googlenative.compute.v1.enums.AttachedDiskMode;
import com.pulumi.googlenative.compute.v1.enums.AttachedDiskType;
import com.pulumi.googlenative.compute.v1.inputs.AttachedDiskInitializeParamsArgs;
import com.pulumi.googlenative.compute.v1.inputs.CustomerEncryptionKeyArgs;
import com.pulumi.googlenative.compute.v1.inputs.GuestOsFeatureArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An instance-attached disk resource.
 * 
 */
public final class AttachedDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachedDiskArgs Empty = new AttachedDiskArgs();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    @Import(name="autoDelete")
    private @Nullable Output<Boolean> autoDelete;

    /**
     * @return Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    public Optional<Output<Boolean>> autoDelete() {
        return Optional.ofNullable(this.autoDelete);
    }

    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    @Import(name="boot")
    private @Nullable Output<Boolean> boot;

    /**
     * @return Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    public Optional<Output<Boolean>> boot() {
        return Optional.ofNullable(this.boot);
    }

    /**
     * Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    @Import(name="deviceName")
    private @Nullable Output<String> deviceName;

    /**
     * @return Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
     * 
     */
    public Optional<Output<String>> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }

    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
     */
    @Import(name="diskEncryptionKey")
    private @Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey;

    /**
     * @return Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
     * 
     */
    public Optional<Output<CustomerEncryptionKeyArgs>> diskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }

    /**
     * The size of the disk in GB.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<String> diskSizeGb;

    /**
     * @return The size of the disk in GB.
     * 
     */
    public Optional<Output<String>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @Import(name="guestOsFeatures")
    private @Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures;

    /**
     * @return A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    public Optional<Output<List<GuestOsFeatureArgs>>> guestOsFeatures() {
        return Optional.ofNullable(this.guestOsFeatures);
    }

    /**
     * [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    @Import(name="initializeParams")
    private @Nullable Output<AttachedDiskInitializeParamsArgs> initializeParams;

    /**
     * @return [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
     * 
     */
    public Optional<Output<AttachedDiskInitializeParamsArgs>> initializeParams() {
        return Optional.ofNullable(this.initializeParams);
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    @Import(name="interface")
    private @Nullable Output<AttachedDiskInterface> interface_;

    /**
     * @return Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
     * 
     */
    public Optional<Output<AttachedDiskInterface>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<AttachedDiskMode> mode;

    /**
     * @return The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
     * 
     */
    public Optional<Output<AttachedDiskMode>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
     */
    @Import(name="type")
    private @Nullable Output<AttachedDiskType> type;

    /**
     * @return Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
     * 
     */
    public Optional<Output<AttachedDiskType>> type() {
        return Optional.ofNullable(this.type);
    }

    private AttachedDiskArgs() {}

    private AttachedDiskArgs(AttachedDiskArgs $) {
        this.autoDelete = $.autoDelete;
        this.boot = $.boot;
        this.deviceName = $.deviceName;
        this.diskEncryptionKey = $.diskEncryptionKey;
        this.diskSizeGb = $.diskSizeGb;
        this.guestOsFeatures = $.guestOsFeatures;
        this.initializeParams = $.initializeParams;
        this.interface_ = $.interface_;
        this.mode = $.mode;
        this.source = $.source;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachedDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachedDiskArgs $;

        public Builder() {
            $ = new AttachedDiskArgs();
        }

        public Builder(AttachedDiskArgs defaults) {
            $ = new AttachedDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoDelete Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            $.autoDelete = autoDelete;
            return this;
        }

        /**
         * @param autoDelete Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
         * 
         * @return builder
         * 
         */
        public Builder autoDelete(Boolean autoDelete) {
            return autoDelete(Output.of(autoDelete));
        }

        /**
         * @param boot Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
         * 
         * @return builder
         * 
         */
        public Builder boot(@Nullable Output<Boolean> boot) {
            $.boot = boot;
            return this;
        }

        /**
         * @param boot Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
         * 
         * @return builder
         * 
         */
        public Builder boot(Boolean boot) {
            return boot(Output.of(boot));
        }

        /**
         * @param deviceName Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(@Nullable Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        /**
         * @param deviceName Specifies a unique device name of your choice that is reflected into the /dev/disk/by-id/google-* tree of a Linux operating system running within the instance. This name can be used to reference the device for mounting, resizing, and so on, from within the instance. If not specified, the server chooses a default device name to apply to this disk, in the form persistent-disk-x, where x is a number assigned by Google Compute Engine. This field is only applicable for persistent disks.
         * 
         * @return builder
         * 
         */
        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        /**
         * @param diskEncryptionKey Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(@Nullable Output<CustomerEncryptionKeyArgs> diskEncryptionKey) {
            $.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        /**
         * @param diskEncryptionKey Encrypts or decrypts a disk using a customer-supplied encryption key. If you are creating a new disk, this field encrypts the new disk using an encryption key that you provide. If you are attaching an existing disk that is already encrypted, this field decrypts the disk using the customer-supplied encryption key. If you encrypt a disk using a customer-supplied key, you must provide the same key again when you attempt to use this resource at a later time. For example, you must provide the key when you create a snapshot or an image from the disk or when you attach the disk to a virtual machine instance. If you do not provide an encryption key, then the disk will be encrypted using an automatically generated key and you do not need to provide a key to use the disk later. Instance templates do not store customer-supplied encryption keys, so you cannot use your own keys to encrypt disks in a managed instance group.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionKey(CustomerEncryptionKeyArgs diskEncryptionKey) {
            return diskEncryptionKey(Output.of(diskEncryptionKey));
        }

        /**
         * @param diskSizeGb The size of the disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb The size of the disk in GB.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(String diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param guestOsFeatures A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
         * 
         * @return builder
         * 
         */
        public Builder guestOsFeatures(@Nullable Output<List<GuestOsFeatureArgs>> guestOsFeatures) {
            $.guestOsFeatures = guestOsFeatures;
            return this;
        }

        /**
         * @param guestOsFeatures A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
         * 
         * @return builder
         * 
         */
        public Builder guestOsFeatures(List<GuestOsFeatureArgs> guestOsFeatures) {
            return guestOsFeatures(Output.of(guestOsFeatures));
        }

        /**
         * @param guestOsFeatures A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
         * 
         * @return builder
         * 
         */
        public Builder guestOsFeatures(GuestOsFeatureArgs... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }

        /**
         * @param initializeParams [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
         * 
         * @return builder
         * 
         */
        public Builder initializeParams(@Nullable Output<AttachedDiskInitializeParamsArgs> initializeParams) {
            $.initializeParams = initializeParams;
            return this;
        }

        /**
         * @param initializeParams [Input Only] Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new instance. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
         * 
         * @return builder
         * 
         */
        public Builder initializeParams(AttachedDiskInitializeParamsArgs initializeParams) {
            return initializeParams(Output.of(initializeParams));
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
         * 
         * @return builder
         * 
         */
        public Builder interface_(@Nullable Output<AttachedDiskInterface> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI and the request will fail if you attempt to attach a persistent disk in any other format than SCSI. Local SSDs can use either NVME or SCSI. For performance characteristics of SCSI over NVMe, see Local SSD performance.
         * 
         * @return builder
         * 
         */
        public Builder interface_(AttachedDiskInterface interface_) {
            return interface_(Output.of(interface_));
        }

        /**
         * @param mode The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<AttachedDiskMode> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If not specified, the default is to attach the disk in READ_WRITE mode.
         * 
         * @return builder
         * 
         */
        public Builder mode(AttachedDiskMode mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param source Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Specifies a valid partial or full URL to an existing Persistent Disk resource. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. If desired, you can also attach existing non-root persistent disks using this property. This field is only applicable for persistent disks. Note that for InstanceTemplate, specify the disk name for zonal disk, and the URL for regional disk.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param type Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<AttachedDiskType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of the disk, either SCRATCH or PERSISTENT. If not specified, the default is PERSISTENT.
         * 
         * @return builder
         * 
         */
        public Builder type(AttachedDiskType type) {
            return type(Output.of(type));
        }

        public AttachedDiskArgs build() {
            return $;
        }
    }

}
