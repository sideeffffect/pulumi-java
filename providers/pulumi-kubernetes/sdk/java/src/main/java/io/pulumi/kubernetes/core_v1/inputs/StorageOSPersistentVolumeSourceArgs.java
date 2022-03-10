// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a StorageOS persistent volume resource.
 * 
 */
public final class StorageOSPersistentVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageOSPersistentVolumeSourceArgs Empty = new StorageOSPersistentVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @InputImport(name="fsType")
      private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Input<Boolean> readOnly;

    public Input<Boolean> getReadOnly() {
        return this.readOnly == null ? Input.empty() : this.readOnly;
    }

    /**
     * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
     * 
     */
    @InputImport(name="secretRef")
      private final @Nullable Input<ObjectReferenceArgs> secretRef;

    public Input<ObjectReferenceArgs> getSecretRef() {
        return this.secretRef == null ? Input.empty() : this.secretRef;
    }

    /**
     * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    @InputImport(name="volumeName")
      private final @Nullable Input<String> volumeName;

    public Input<String> getVolumeName() {
        return this.volumeName == null ? Input.empty() : this.volumeName;
    }

    /**
     * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod's namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to "default" if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    @InputImport(name="volumeNamespace")
      private final @Nullable Input<String> volumeNamespace;

    public Input<String> getVolumeNamespace() {
        return this.volumeNamespace == null ? Input.empty() : this.volumeNamespace;
    }

    public StorageOSPersistentVolumeSourceArgs(
        @Nullable Input<String> fsType,
        @Nullable Input<Boolean> readOnly,
        @Nullable Input<ObjectReferenceArgs> secretRef,
        @Nullable Input<String> volumeName,
        @Nullable Input<String> volumeNamespace) {
        this.fsType = fsType;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
        this.volumeName = volumeName;
        this.volumeNamespace = volumeNamespace;
    }

    private StorageOSPersistentVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.readOnly = Input.empty();
        this.secretRef = Input.empty();
        this.volumeName = Input.empty();
        this.volumeNamespace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageOSPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private @Nullable Input<Boolean> readOnly;
        private @Nullable Input<ObjectReferenceArgs> secretRef;
        private @Nullable Input<String> volumeName;
        private @Nullable Input<String> volumeNamespace;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageOSPersistentVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.volumeName = defaults.volumeName;
    	      this.volumeNamespace = defaults.volumeNamespace;
        }

        public Builder fsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder fsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder readOnly(@Nullable Input<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Input.ofNullable(readOnly);
            return this;
        }

        public Builder secretRef(@Nullable Input<ObjectReferenceArgs> secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public Builder secretRef(@Nullable ObjectReferenceArgs secretRef) {
            this.secretRef = Input.ofNullable(secretRef);
            return this;
        }

        public Builder volumeName(@Nullable Input<String> volumeName) {
            this.volumeName = volumeName;
            return this;
        }

        public Builder volumeName(@Nullable String volumeName) {
            this.volumeName = Input.ofNullable(volumeName);
            return this;
        }

        public Builder volumeNamespace(@Nullable Input<String> volumeNamespace) {
            this.volumeNamespace = volumeNamespace;
            return this;
        }

        public Builder volumeNamespace(@Nullable String volumeNamespace) {
            this.volumeNamespace = Input.ofNullable(volumeNamespace);
            return this;
        }
        public StorageOSPersistentVolumeSourceArgs build() {
            return new StorageOSPersistentVolumeSourceArgs(fsType, readOnly, secretRef, volumeName, volumeNamespace);
        }
    }
}
