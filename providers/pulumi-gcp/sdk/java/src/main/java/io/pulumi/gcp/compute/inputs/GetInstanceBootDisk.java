// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.GetInstanceBootDiskInitializeParam;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetInstanceBootDisk extends io.pulumi.resources.InvokeArgs {

    public static final GetInstanceBootDisk Empty = new GetInstanceBootDisk();

    /**
     * Whether the disk will be auto-deleted when the instance is deleted.
     * 
     */
    @InputImport(name="autoDelete", required=true)
      private final Boolean autoDelete;

    public Boolean getAutoDelete() {
        return this.autoDelete;
    }

    /**
     * Name with which the attached disk is accessible
     * under `/dev/disk/by-id/`
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    @InputImport(name="diskEncryptionKeyRaw", required=true)
      private final String diskEncryptionKeyRaw;

    public String getDiskEncryptionKeyRaw() {
        return this.diskEncryptionKeyRaw;
    }

    @InputImport(name="diskEncryptionKeySha256", required=true)
      private final String diskEncryptionKeySha256;

    public String getDiskEncryptionKeySha256() {
        return this.diskEncryptionKeySha256;
    }

    /**
     * Parameters with which a disk was created alongside the instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="initializeParams", required=true)
      private final List<GetInstanceBootDiskInitializeParam> initializeParams;

    public List<GetInstanceBootDiskInitializeParam> getInitializeParams() {
        return this.initializeParams;
    }

    @InputImport(name="kmsKeySelfLink", required=true)
      private final String kmsKeySelfLink;

    public String getKmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }

    /**
     * Read/write mode for the disk. One of `"READ_ONLY"` or `"READ_WRITE"`.
     * 
     */
    @InputImport(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * The name or self_link of the disk attached to this instance.
     * 
     */
    @InputImport(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    public GetInstanceBootDisk(
        Boolean autoDelete,
        String deviceName,
        String diskEncryptionKeyRaw,
        String diskEncryptionKeySha256,
        List<GetInstanceBootDiskInitializeParam> initializeParams,
        String kmsKeySelfLink,
        String mode,
        String source) {
        this.autoDelete = Objects.requireNonNull(autoDelete, "expected parameter 'autoDelete' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.diskEncryptionKeyRaw = Objects.requireNonNull(diskEncryptionKeyRaw, "expected parameter 'diskEncryptionKeyRaw' to be non-null");
        this.diskEncryptionKeySha256 = Objects.requireNonNull(diskEncryptionKeySha256, "expected parameter 'diskEncryptionKeySha256' to be non-null");
        this.initializeParams = Objects.requireNonNull(initializeParams, "expected parameter 'initializeParams' to be non-null");
        this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink, "expected parameter 'kmsKeySelfLink' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
    }

    private GetInstanceBootDisk() {
        this.autoDelete = null;
        this.deviceName = null;
        this.diskEncryptionKeyRaw = null;
        this.diskEncryptionKeySha256 = null;
        this.initializeParams = List.of();
        this.kmsKeySelfLink = null;
        this.mode = null;
        this.source = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceBootDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private String deviceName;
        private String diskEncryptionKeyRaw;
        private String diskEncryptionKeySha256;
        private List<GetInstanceBootDiskInitializeParam> initializeParams;
        private String kmsKeySelfLink;
        private String mode;
        private String source;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceBootDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKeyRaw = defaults.diskEncryptionKeyRaw;
    	      this.diskEncryptionKeySha256 = defaults.diskEncryptionKeySha256;
    	      this.initializeParams = defaults.initializeParams;
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }

        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder diskEncryptionKeyRaw(String diskEncryptionKeyRaw) {
            this.diskEncryptionKeyRaw = Objects.requireNonNull(diskEncryptionKeyRaw);
            return this;
        }

        public Builder diskEncryptionKeySha256(String diskEncryptionKeySha256) {
            this.diskEncryptionKeySha256 = Objects.requireNonNull(diskEncryptionKeySha256);
            return this;
        }

        public Builder initializeParams(List<GetInstanceBootDiskInitializeParam> initializeParams) {
            this.initializeParams = Objects.requireNonNull(initializeParams);
            return this;
        }

        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink);
            return this;
        }

        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public GetInstanceBootDisk build() {
            return new GetInstanceBootDisk(autoDelete, deviceName, diskEncryptionKeyRaw, diskEncryptionKeySha256, initializeParams, kmsKeySelfLink, mode, source);
        }
    }
}
