// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class AttachedDiskInitializeParamsResponse {
    /**
     * The architecture of the attached disk. Valid values are arm64 or x86_64.
     * 
     */
    private final String architecture;
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
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options. Guest OS features are applied by merging initializeParams.guestOsFeatures and disks.guestOsFeatures
     * 
     */
    private final List<GuestOsFeatureResponse> guestOsFeatures;
    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Integer license codes indicating which licenses are attached to this disk.
     * 
     */
    private final List<String> licenseCodes;
    /**
     * A list of publicly visible licenses. Reserved for Google's use.
     * 
     */
    private final List<String> licenses;
    /**
     * Indicates whether or not the disk can be read/write attached to more than one instance.
     * 
     */
    private final Boolean multiWriter;
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
     * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
     */
    private final List<String> replicaZones;
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
     * The source instant-snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceInstantSnapshot initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: us-central1-a/instantSnapshots/my-backup If the source instant-snapshot is deleted later, this field will not be set.
     * 
     */
    private final String sourceInstantSnapshot;
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

    @OutputCustomType.Constructor
    private AttachedDiskInitializeParamsResponse(
        @OutputCustomType.Parameter("architecture") String architecture,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("diskName") String diskName,
        @OutputCustomType.Parameter("diskSizeGb") String diskSizeGb,
        @OutputCustomType.Parameter("diskType") String diskType,
        @OutputCustomType.Parameter("guestOsFeatures") List<GuestOsFeatureResponse> guestOsFeatures,
        @OutputCustomType.Parameter("labels") Map<String,String> labels,
        @OutputCustomType.Parameter("licenseCodes") List<String> licenseCodes,
        @OutputCustomType.Parameter("licenses") List<String> licenses,
        @OutputCustomType.Parameter("multiWriter") Boolean multiWriter,
        @OutputCustomType.Parameter("onUpdateAction") String onUpdateAction,
        @OutputCustomType.Parameter("provisionedIops") String provisionedIops,
        @OutputCustomType.Parameter("replicaZones") List<String> replicaZones,
        @OutputCustomType.Parameter("resourcePolicies") List<String> resourcePolicies,
        @OutputCustomType.Parameter("sourceImage") String sourceImage,
        @OutputCustomType.Parameter("sourceImageEncryptionKey") CustomerEncryptionKeyResponse sourceImageEncryptionKey,
        @OutputCustomType.Parameter("sourceInstantSnapshot") String sourceInstantSnapshot,
        @OutputCustomType.Parameter("sourceSnapshot") String sourceSnapshot,
        @OutputCustomType.Parameter("sourceSnapshotEncryptionKey") CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
        this.architecture = architecture;
        this.description = description;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.guestOsFeatures = guestOsFeatures;
        this.labels = labels;
        this.licenseCodes = licenseCodes;
        this.licenses = licenses;
        this.multiWriter = multiWriter;
        this.onUpdateAction = onUpdateAction;
        this.provisionedIops = provisionedIops;
        this.replicaZones = replicaZones;
        this.resourcePolicies = resourcePolicies;
        this.sourceImage = sourceImage;
        this.sourceImageEncryptionKey = sourceImageEncryptionKey;
        this.sourceInstantSnapshot = sourceInstantSnapshot;
        this.sourceSnapshot = sourceSnapshot;
        this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
    }

    /**
     * The architecture of the attached disk. Valid values are arm64 or x86_64.
     * 
    */
    public String getArchitecture() {
        return this.architecture;
    }
    /**
     * An optional description. Provide this property when creating the disk.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Specifies the disk name. If not specified, the default is to use the name of the instance. If a disk with the same name already exists in the given region, the existing disk is attached to the new instance and the new disk is not created.
     * 
    */
    public String getDiskName() {
        return this.diskName;
    }
    /**
     * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a sourceImage, which is required for boot disks, the default size is the size of the sourceImage. If you do not specify a sourceImage, the default disk size is 500 GB.
     * 
    */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Specifies the disk type to use to create the instance. If not specified, the default is pd-standard, specified using the full URL. For example: https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a full list of acceptable values, see Persistent disk types. If you define this field, you can provide either the full or partial URL. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType - projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for InstanceTemplate, this is the name of the disk type, not URL.
     * 
    */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options. Guest OS features are applied by merging initializeParams.guestOsFeatures and disks.guestOsFeatures
     * 
    */
    public List<GuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }
    /**
     * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Integer license codes indicating which licenses are attached to this disk.
     * 
    */
    public List<String> getLicenseCodes() {
        return this.licenseCodes;
    }
    /**
     * A list of publicly visible licenses. Reserved for Google's use.
     * 
    */
    public List<String> getLicenses() {
        return this.licenses;
    }
    /**
     * Indicates whether or not the disk can be read/write attached to more than one instance.
     * 
    */
    public Boolean getMultiWriter() {
        return this.multiWriter;
    }
    /**
     * Specifies which action to take on instance update with this disk. Default is to use the existing disk.
     * 
    */
    public String getOnUpdateAction() {
        return this.onUpdateAction;
    }
    /**
     * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per second that the disk can handle. Values must be between 10,000 and 120,000. For more details, see the Extreme persistent disk documentation.
     * 
    */
    public String getProvisionedIops() {
        return this.provisionedIops;
    }
    /**
     * URLs of the zones where the disk should be replicated to. Only applicable for regional resources.
     * 
    */
    public List<String> getReplicaZones() {
        return this.replicaZones;
    }
    /**
     * Resource policies applied to this disk for automatic snapshot creations. Specified using the full or partial URL. For instance template, specify only the resource policy name.
     * 
    */
    public List<String> getResourcePolicies() {
        return this.resourcePolicies;
    }
    /**
     * The source image to create this disk. When creating a new instance, one of initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required except for local SSD. To create a disk with one of the public operating system images, specify the image by its family name. For example, specify family/debian-9 to use the latest Debian 9 image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific version of a public operating system image: projects/debian-cloud/global/images/debian-9-stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image name in the following format: global/images/my-custom-image You can also specify a custom image by its image family, which returns the latest version of the image in that family. Replace the image name with family/family-name: global/images/family/my-image-family If the source image is deleted later, this field will not be set.
     * 
    */
    public String getSourceImage() {
        return this.sourceImage;
    }
    /**
     * The customer-supplied encryption key of the source image. Required if the source image is protected by a customer-supplied encryption key. Instance templates do not store customer-supplied encryption keys, so you cannot create disks for instances in a managed instance group if the source images are encrypted with your own keys.
     * 
    */
    public CustomerEncryptionKeyResponse getSourceImageEncryptionKey() {
        return this.sourceImageEncryptionKey;
    }
    /**
     * The source instant-snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceInstantSnapshot initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: us-central1-a/instantSnapshots/my-backup If the source instant-snapshot is deleted later, this field will not be set.
     * 
    */
    public String getSourceInstantSnapshot() {
        return this.sourceInstantSnapshot;
    }
    /**
     * The source snapshot to create this disk. When creating a new instance, one of initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required except for local SSD. To create a disk with a snapshot that you created, specify the snapshot name in the following format: global/snapshots/my-backup If the source snapshot is deleted later, this field will not be set.
     * 
    */
    public String getSourceSnapshot() {
        return this.sourceSnapshot;
    }
    /**
     * The customer-supplied encryption key of the source snapshot.
     * 
    */
    public CustomerEncryptionKeyResponse getSourceSnapshotEncryptionKey() {
        return this.sourceSnapshotEncryptionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskInitializeParamsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String description;
        private String diskName;
        private String diskSizeGb;
        private String diskType;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private Map<String,String> labels;
        private List<String> licenseCodes;
        private List<String> licenses;
        private Boolean multiWriter;
        private String onUpdateAction;
        private String provisionedIops;
        private List<String> replicaZones;
        private List<String> resourcePolicies;
        private String sourceImage;
        private CustomerEncryptionKeyResponse sourceImageEncryptionKey;
        private String sourceInstantSnapshot;
        private String sourceSnapshot;
        private CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskInitializeParamsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.description = defaults.description;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.labels = defaults.labels;
    	      this.licenseCodes = defaults.licenseCodes;
    	      this.licenses = defaults.licenses;
    	      this.multiWriter = defaults.multiWriter;
    	      this.onUpdateAction = defaults.onUpdateAction;
    	      this.provisionedIops = defaults.provisionedIops;
    	      this.replicaZones = defaults.replicaZones;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.sourceImage = defaults.sourceImage;
    	      this.sourceImageEncryptionKey = defaults.sourceImageEncryptionKey;
    	      this.sourceInstantSnapshot = defaults.sourceInstantSnapshot;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
    	      this.sourceSnapshotEncryptionKey = defaults.sourceSnapshotEncryptionKey;
        }

        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
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

        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder licenseCodes(List<String> licenseCodes) {
            this.licenseCodes = Objects.requireNonNull(licenseCodes);
            return this;
        }

        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }

        public Builder multiWriter(Boolean multiWriter) {
            this.multiWriter = Objects.requireNonNull(multiWriter);
            return this;
        }

        public Builder onUpdateAction(String onUpdateAction) {
            this.onUpdateAction = Objects.requireNonNull(onUpdateAction);
            return this;
        }

        public Builder provisionedIops(String provisionedIops) {
            this.provisionedIops = Objects.requireNonNull(provisionedIops);
            return this;
        }

        public Builder replicaZones(List<String> replicaZones) {
            this.replicaZones = Objects.requireNonNull(replicaZones);
            return this;
        }

        public Builder resourcePolicies(List<String> resourcePolicies) {
            this.resourcePolicies = Objects.requireNonNull(resourcePolicies);
            return this;
        }

        public Builder sourceImage(String sourceImage) {
            this.sourceImage = Objects.requireNonNull(sourceImage);
            return this;
        }

        public Builder sourceImageEncryptionKey(CustomerEncryptionKeyResponse sourceImageEncryptionKey) {
            this.sourceImageEncryptionKey = Objects.requireNonNull(sourceImageEncryptionKey);
            return this;
        }

        public Builder sourceInstantSnapshot(String sourceInstantSnapshot) {
            this.sourceInstantSnapshot = Objects.requireNonNull(sourceInstantSnapshot);
            return this;
        }

        public Builder sourceSnapshot(String sourceSnapshot) {
            this.sourceSnapshot = Objects.requireNonNull(sourceSnapshot);
            return this;
        }

        public Builder sourceSnapshotEncryptionKey(CustomerEncryptionKeyResponse sourceSnapshotEncryptionKey) {
            this.sourceSnapshotEncryptionKey = Objects.requireNonNull(sourceSnapshotEncryptionKey);
            return this;
        }
        public AttachedDiskInitializeParamsResponse build() {
            return new AttachedDiskInitializeParamsResponse(architecture, description, diskName, diskSizeGb, diskType, guestOsFeatures, labels, licenseCodes, licenses, multiWriter, onUpdateAction, provisionedIops, replicaZones, resourcePolicies, sourceImage, sourceImageEncryptionKey, sourceInstantSnapshot, sourceSnapshot, sourceSnapshotEncryptionKey);
        }
    }
}
