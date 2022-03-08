// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PortworxVolumeSource {
    /**
     * FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    private final @Nullable String fsType;
    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    private final @Nullable Boolean readOnly;
    /**
     * VolumeID uniquely identifies a Portworx volume
     * 
     */
    private final String volumeID;

    @OutputCustomType.Constructor({"fsType","readOnly","volumeID"})
    private PortworxVolumeSource(
        @Nullable String fsType,
        @Nullable Boolean readOnly,
        String volumeID) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.volumeID = volumeID;
    }

    /**
     * FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
     * 
    */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
    */
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    /**
     * VolumeID uniquely identifies a Portworx volume
     * 
    */
    public String getVolumeID() {
        return this.volumeID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PortworxVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable Boolean readOnly;
        private String volumeID;

        public Builder() {
    	      // Empty
        }

        public Builder(PortworxVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.volumeID = defaults.volumeID;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setVolumeID(String volumeID) {
            this.volumeID = Objects.requireNonNull(volumeID);
            return this;
        }
        public PortworxVolumeSource build() {
            return new PortworxVolumeSource(fsType, readOnly, volumeID);
        }
    }
}
