// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SavedDiskResponse {
    /**
     * @return The architecture of the attached disk.
     * 
     */
    private final String architecture;
    /**
     * @return Type of the resource. Always compute#savedDisk for attached disks.
     * 
     */
    private final String kind;
    /**
     * @return Specifies a URL of the disk attached to the source instance.
     * 
     */
    private final String sourceDisk;
    /**
     * @return Size of the individual disk snapshot used by this machine image.
     * 
     */
    private final String storageBytes;
    /**
     * @return An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    private final String storageBytesStatus;

    @CustomType.Constructor
    private SavedDiskResponse(
        @CustomType.Parameter("architecture") String architecture,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("sourceDisk") String sourceDisk,
        @CustomType.Parameter("storageBytes") String storageBytes,
        @CustomType.Parameter("storageBytesStatus") String storageBytesStatus) {
        this.architecture = architecture;
        this.kind = kind;
        this.sourceDisk = sourceDisk;
        this.storageBytes = storageBytes;
        this.storageBytesStatus = storageBytesStatus;
    }

    /**
     * @return The architecture of the attached disk.
     * 
     */
    public String architecture() {
        return this.architecture;
    }
    /**
     * @return Type of the resource. Always compute#savedDisk for attached disks.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Specifies a URL of the disk attached to the source instance.
     * 
     */
    public String sourceDisk() {
        return this.sourceDisk;
    }
    /**
     * @return Size of the individual disk snapshot used by this machine image.
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String kind;
        private String sourceDisk;
        private String storageBytes;
        private String storageBytesStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.kind = defaults.kind;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageBytesStatus = defaults.storageBytesStatus;
        }

        public Builder architecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder sourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public Builder storageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }
        public Builder storageBytesStatus(String storageBytesStatus) {
            this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
            return this;
        }        public SavedDiskResponse build() {
            return new SavedDiskResponse(architecture, kind, sourceDisk, storageBytes, storageBytesStatus);
        }
    }
}
