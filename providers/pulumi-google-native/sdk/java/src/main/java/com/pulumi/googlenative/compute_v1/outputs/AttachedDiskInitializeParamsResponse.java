// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_v1.outputs.CustomerEncryptionKeyResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class AttachedDiskInitializeParamsResponse {
    /**
     * An optional description. Provide this property when creating the disk.
     * 
     */
    private final String description;
    /**
     * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
     * 
     */
    private final String diskName;
    /**
     * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
     * 
     */
    private final String diskType;
    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    private final Map<String,String> labels;
    /**
     * A list of publicly visible licenses. Reserved for Google's use.
     * 
     */
    private final List<String> licenses;
    /**
     * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
     * 
     */
    private final String onUpdateAction;
    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
     */
    private final String provisionedIops;
    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
     * 
     */
    private final List<String> resourcePolicies;
    /**
     * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
     * 
     */
    private final String sourceImage;
    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
     * 
     */
    private final CustomerEncryptionKeyResponse sourceImageEncryptionKey;
    /**
     * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
     * 
     */
    private final String sourceSnapshot;
    /**
     * The customer-supplied encryption key of the source snapshot.
     * 
     */
    private final CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;

    @CustomType.Constructor
    private AttachedDiskInitializeParamsResponse(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("diskName") String diskName,
        @CustomType.Parameter("diskSizeGb") String diskSizeGb,
        @CustomType.Parameter("diskType") String diskType,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("licenses") List<String> licenses,
        @CustomType.Parameter("onUpdateAction") String onUpdateAction,
        @CustomType.Parameter("provisionedIops") String provisionedIops,
        @CustomType.Parameter("resourcePolicies") List<String> resourcePolicies,
        @CustomType.Parameter("sourceImage") String sourceImage,
        @CustomType.Parameter("sourceImageEncryptionKey") CustomerEncryptionKeyResponse sourceImageEncryptionKey,
        @CustomType.Parameter("sourceSnapshot") String sourceSnapshot,
        @CustomType.Parameter("sourceSnapshotEncryptionKey") CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
        this.description = description;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.labels = labels;
        this.licenses = licenses;
        this.onUpdateAction = onUpdateAction;
        this.provisionedIops = provisionedIops;
        this.resourcePolicies = resourcePolicies;
        this.sourceImage = sourceImage;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceSnapshot = sourceSnapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
    }

    /**
     * An optional description. Provide this property when creating the disk.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
     * 
    */
    public String diskName() {
        return this.diskName;
    }
    /**
     * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     * 
    */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
     * 
    */
    public String diskType() {
        return this.diskType;
    }
    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * A list of publicly visible licenses. Reserved for Google's use.
     * 
    */
    public List<String> licenses() {
        return this.licenses;
    }
    /**
     * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
     * 
    */
    public String onUpdateAction() {
        return this.onUpdateAction;
    }
    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
    */
    public String provisionedIops() {
        return this.provisionedIops;
    }
    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
     * 
    */
    public List<String> resourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
     * 
    */
    public String sourceImage() {
        return this.sourceImage;
    }
    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
     * 
    */
    public CustomerEncryptionKeyResponse sourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    /**
     * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
     * 
    */
    public String sourceSnapshot() {
        return this.sourceSnapshot;
    }
    /**
     * The customer-supplied encryption key of the source snapshot.
     * 
    */
    public CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskInitializeParamsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String diskName;
        private String diskSizeGb;
        private String diskType;
        private Map<String,String> labels;
        private List<String> licenses;
        private String onUpdateAction;
        private String provisionedIops;
        private List<String> resourcePolicies;
        private String sourceImage;
        private CustomerEncryptionKeyResponse sourceImageEncryptionKey;
        private String sourceSnapshot;
        private CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskInitializeParamsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
    	      this.licenses = defaults.licenses;
    	      this.onUpdateAction = defaults.onUpdateAction;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder diskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
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
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder onUpdateAction(String onUpdateAction) {
            this.onUpdateAction = Objects.requireNonNull(onUpdateAction);
            return this;
        }
        public Builder provisionedIops(String provisionedIops) {
            this.provisionedIops = Objects.requireNonNull(provisionedIops);
            return this;
        }
        public Builder resourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }
        public Builder resourcePolicies(String... resourcePolicies) {
            return resourcePolicies(List.of(resourcePolicies));
        }
        public Builder sourceImage(String sourceImage) {
            this.sourceImage = Objects.requireNonNull(sourceImage);
            return this;
        }
        public Builder sourceImageEncryptionKey(CustomerEncryptionKeyResponse sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Objects.requireNonNull(sourceImageEncryptionKey);
            return this;
        }
        public Builder sourceSnapshot(String sourceSnapshot) {
            this.sourceSnapshot = Objects.requireNonNull(sourceSnapshot);
            return this;
        }
        public Builder sourceSnapshotEncryptionKey(CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Objects.requireNonNull(sourceSnapshotEncryptionKey);
            return this;
        }        public AttachedDiskInitializeParamsResponse build() {
            return new AttachedDiskInitializeParamsResponse(description, diskName, diskSizeGb, diskType, labels, licenses, onUpdateAction, provisionedIops, resourcePolicies, sourceImage, sourceImageEncryptionKey, sourceSnapshot, sourceSnapshotEncryptionKey);
        }
    }
}
