// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.InstanceTemplateDiskDiskEncryptionKeyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateDiskArgs Empty = new InstanceTemplateDiskArgs();

    /**
     * Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
     */
    @InputImport(name="autoDelete")
      private final @Nullable Input<Boolean> autoDelete;

    public Input<Boolean> getAutoDelete() {
        return this.autoDelete == null ? Input.empty() : this.autoDelete;
    }

    /**
     * Indicates that this is a boot disk.
     * 
     */
    @InputImport(name="boot")
      private final @Nullable Input<Boolean> boot;

    public Input<Boolean> getBoot() {
        return this.boot == null ? Input.empty() : this.boot;
    }

    /**
     * A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
     */
    @InputImport(name="deviceName")
      private final @Nullable Input<String> deviceName;

    public Input<String> getDeviceName() {
        return this.deviceName == null ? Input.empty() : this.deviceName;
    }

    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     */
    @InputImport(name="diskEncryptionKey")
      private final @Nullable Input<InstanceTemplateDiskDiskEncryptionKeyArgs> diskEncryptionKey;

    public Input<InstanceTemplateDiskDiskEncryptionKeyArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Input.empty() : this.diskEncryptionKey;
    }

    /**
     * Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
     */
    @InputImport(name="diskName")
      private final @Nullable Input<String> diskName;

    public Input<String> getDiskName() {
        return this.diskName == null ? Input.empty() : this.diskName;
    }

    /**
     * The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
     */
    @InputImport(name="diskSizeGb")
      private final @Nullable Input<Integer> diskSizeGb;

    public Input<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Input.empty() : this.diskSizeGb;
    }

    /**
     * The GCE disk type. Can be either `"pd-ssd"`,
     * `"local-ssd"`, `"pd-balanced"` or `"pd-standard"`.
     * 
     */
    @InputImport(name="diskType")
      private final @Nullable Input<String> diskType;

    public Input<String> getDiskType() {
        return this.diskType == null ? Input.empty() : this.diskType;
    }

    /**
     * Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
     */
    @InputImport(name="interface")
      private final @Nullable Input<String> $interface;

    public Input<String> get$interface() {
        return this.$interface == null ? Input.empty() : this.$interface;
    }

    /**
     * A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<String> mode;

    public Input<String> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * -- A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
     * 
     */
    @InputImport(name="resourcePolicies")
      private final @Nullable Input<String> resourcePolicies;

    public Input<String> getResourcePolicies() {
        return this.resourcePolicies == null ? Input.empty() : this.resourcePolicies;
    }

    /**
     * The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<String> source;

    public Input<String> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * The image from which to
     * initialize this disk. This can be one of: the image's `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    @InputImport(name="sourceImage")
      private final @Nullable Input<String> sourceImage;

    public Input<String> getSourceImage() {
        return this.sourceImage == null ? Input.empty() : this.sourceImage;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public InstanceTemplateDiskArgs(
        @Nullable Input<Boolean> autoDelete,
        @Nullable Input<Boolean> boot,
        @Nullable Input<String> deviceName,
        @Nullable Input<InstanceTemplateDiskDiskEncryptionKeyArgs> diskEncryptionKey,
        @Nullable Input<String> diskName,
        @Nullable Input<Integer> diskSizeGb,
        @Nullable Input<String> diskType,
        @Nullable Input<String> $interface,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> mode,
        @Nullable Input<String> resourcePolicies,
        @Nullable Input<String> source,
        @Nullable Input<String> sourceImage,
        @Nullable Input<String> type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.$interface = $interface;
        this.labels = labels;
        this.mode = mode;
        this.resourcePolicies = resourcePolicies;
        this.source = source;
        this.sourceImage = sourceImage;
        this.type = type;
    }

    private InstanceTemplateDiskArgs() {
        this.autoDelete = Input.empty();
        this.boot = Input.empty();
        this.deviceName = Input.empty();
        this.diskEncryptionKey = Input.empty();
        this.diskName = Input.empty();
        this.diskSizeGb = Input.empty();
        this.diskType = Input.empty();
        this.$interface = Input.empty();
        this.labels = Input.empty();
        this.mode = Input.empty();
        this.resourcePolicies = Input.empty();
        this.source = Input.empty();
        this.sourceImage = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoDelete;
        private @Nullable Input<Boolean> boot;
        private @Nullable Input<String> deviceName;
        private @Nullable Input<InstanceTemplateDiskDiskEncryptionKeyArgs> diskEncryptionKey;
        private @Nullable Input<String> diskName;
        private @Nullable Input<Integer> diskSizeGb;
        private @Nullable Input<String> diskType;
        private @Nullable Input<String> $interface;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> mode;
        private @Nullable Input<String> resourcePolicies;
        private @Nullable Input<String> source;
        private @Nullable Input<String> sourceImage;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.$interface = defaults.$interface;
    	      this.labels = defaults.labels;
    	      this.mode = defaults.mode;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.source = defaults.source;
    	      this.sourceImage = defaults.sourceImage;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(@Nullable Input<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }

        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Input.ofNullable(autoDelete);
            return this;
        }

        public Builder boot(@Nullable Input<Boolean> boot) {
            this.boot = boot;
            return this;
        }

        public Builder boot(@Nullable Boolean boot) {
            this.boot = Input.ofNullable(boot);
            return this;
        }

        public Builder deviceName(@Nullable Input<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Input.ofNullable(deviceName);
            return this;
        }

        public Builder diskEncryptionKey(@Nullable Input<InstanceTemplateDiskDiskEncryptionKeyArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }

        public Builder diskEncryptionKey(@Nullable InstanceTemplateDiskDiskEncryptionKeyArgs diskEncryptionKey) {
            this.diskEncryptionKey = Input.ofNullable(diskEncryptionKey);
            return this;
        }

        public Builder diskName(@Nullable Input<String> diskName) {
            this.diskName = diskName;
            return this;
        }

        public Builder diskName(@Nullable String diskName) {
            this.diskName = Input.ofNullable(diskName);
            return this;
        }

        public Builder diskSizeGb(@Nullable Input<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Input.ofNullable(diskSizeGb);
            return this;
        }

        public Builder diskType(@Nullable Input<String> diskType) {
            this.diskType = diskType;
            return this;
        }

        public Builder diskType(@Nullable String diskType) {
            this.diskType = Input.ofNullable(diskType);
            return this;
        }

        public Builder $interface(@Nullable Input<String> $interface) {
            this.$interface = $interface;
            return this;
        }

        public Builder $interface(@Nullable String $interface) {
            this.$interface = Input.ofNullable($interface);
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder mode(@Nullable Input<String> mode) {
            this.mode = mode;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder resourcePolicies(@Nullable Input<String> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }

        public Builder resourcePolicies(@Nullable String resourcePolicies) {
            this.resourcePolicies = Input.ofNullable(resourcePolicies);
            return this;
        }

        public Builder source(@Nullable Input<String> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable String source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder sourceImage(@Nullable Input<String> sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }

        public Builder sourceImage(@Nullable String sourceImage) {
            this.sourceImage = Input.ofNullable(sourceImage);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public InstanceTemplateDiskArgs build() {
            return new InstanceTemplateDiskArgs(autoDelete, boot, deviceName, diskEncryptionKey, diskName, diskSizeGb, diskType, $interface, labels, mode, resourcePolicies, source, sourceImage, type);
        }
    }
}
