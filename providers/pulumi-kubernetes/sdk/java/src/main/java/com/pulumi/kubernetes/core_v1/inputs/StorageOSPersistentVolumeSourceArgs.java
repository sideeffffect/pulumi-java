// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.kubernetes.core_v1.inputs.ObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a StorageOS persistent volume resource.
 * 
 */
public final class StorageOSPersistentVolumeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final StorageOSPersistentVolumeSourceArgs Empty = new StorageOSPersistentVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. &#34;ext4&#34;, &#34;xfs&#34;, &#34;ntfs&#34;. Implicitly inferred to be &#34;ext4&#34; if unspecified.
     * 
     */
    @Import(name="fsType")
    private @Nullable Output<String> fsType;

    public Optional<Output<String>> fsType() {
        return Optional.ofNullable(this.fsType);
    }

    /**
     * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * SecretRef specifies the secret to use for obtaining the StorageOS API credentials.  If not specified, default values will be attempted.
     * 
     */
    @Import(name="secretRef")
    private @Nullable Output<ObjectReferenceArgs> secretRef;

    public Optional<Output<ObjectReferenceArgs>> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    /**
     * VolumeName is the human-readable name of the StorageOS volume.  Volume names are only unique within a namespace.
     * 
     */
    @Import(name="volumeName")
    private @Nullable Output<String> volumeName;

    public Optional<Output<String>> volumeName() {
        return Optional.ofNullable(this.volumeName);
    }

    /**
     * VolumeNamespace specifies the scope of the volume within StorageOS.  If no namespace is specified then the Pod&#39;s namespace will be used.  This allows the Kubernetes name scoping to be mirrored within StorageOS for tighter integration. Set VolumeName to any name to override the default behaviour. Set to &#34;default&#34; if you are not using namespaces within StorageOS. Namespaces that do not pre-exist within StorageOS will be created.
     * 
     */
    @Import(name="volumeNamespace")
    private @Nullable Output<String> volumeNamespace;

    public Optional<Output<String>> volumeNamespace() {
        return Optional.ofNullable(this.volumeNamespace);
    }

    private StorageOSPersistentVolumeSourceArgs() {}

    private StorageOSPersistentVolumeSourceArgs(StorageOSPersistentVolumeSourceArgs $) {
        this.fsType = $.fsType;
        this.readOnly = $.readOnly;
        this.secretRef = $.secretRef;
        this.volumeName = $.volumeName;
        this.volumeNamespace = $.volumeNamespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StorageOSPersistentVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StorageOSPersistentVolumeSourceArgs $;

        public Builder() {
            $ = new StorageOSPersistentVolumeSourceArgs();
        }

        public Builder(StorageOSPersistentVolumeSourceArgs defaults) {
            $ = new StorageOSPersistentVolumeSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            $.fsType = fsType;
            return this;
        }

        public Builder fsType(String fsType) {
            return fsType(Output.of(fsType));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public Builder secretRef(@Nullable Output<ObjectReferenceArgs> secretRef) {
            $.secretRef = secretRef;
            return this;
        }

        public Builder secretRef(ObjectReferenceArgs secretRef) {
            return secretRef(Output.of(secretRef));
        }

        public Builder volumeName(@Nullable Output<String> volumeName) {
            $.volumeName = volumeName;
            return this;
        }

        public Builder volumeName(String volumeName) {
            return volumeName(Output.of(volumeName));
        }

        public Builder volumeNamespace(@Nullable Output<String> volumeNamespace) {
            $.volumeNamespace = volumeNamespace;
            return this;
        }

        public Builder volumeNamespace(String volumeNamespace) {
            return volumeNamespace(Output.of(volumeNamespace));
        }

        public StorageOSPersistentVolumeSourceArgs build() {
            return $;
        }
    }

}
