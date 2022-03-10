// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.LocalObjectReferenceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ScaleIOVolumeSource represents a persistent ScaleIO volume
 * 
 */
public final class ScaleIOVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScaleIOVolumeSourceArgs Empty = new ScaleIOVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Default is "xfs".
     * 
     */
    @InputImport(name="fsType")
      private final @Nullable Input<String> fsType;

    public Input<String> getFsType() {
        return this.fsType == null ? Input.empty() : this.fsType;
    }

    /**
     * The host address of the ScaleIO API Gateway.
     * 
     */
    @InputImport(name="gateway", required=true)
      private final Input<String> gateway;

    public Input<String> getGateway() {
        return this.gateway;
    }

    /**
     * The name of the ScaleIO Protection Domain for the configured storage.
     * 
     */
    @InputImport(name="protectionDomain")
      private final @Nullable Input<String> protectionDomain;

    public Input<String> getProtectionDomain() {
        return this.protectionDomain == null ? Input.empty() : this.protectionDomain;
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
     * SecretRef references to the secret for ScaleIO user and other sensitive information. If this is not provided, Login operation will fail.
     * 
     */
    @InputImport(name="secretRef", required=true)
      private final Input<LocalObjectReferenceArgs> secretRef;

    public Input<LocalObjectReferenceArgs> getSecretRef() {
        return this.secretRef;
    }

    /**
     * Flag to enable/disable SSL communication with Gateway, default false
     * 
     */
    @InputImport(name="sslEnabled")
      private final @Nullable Input<Boolean> sslEnabled;

    public Input<Boolean> getSslEnabled() {
        return this.sslEnabled == null ? Input.empty() : this.sslEnabled;
    }

    /**
     * Indicates whether the storage for a volume should be ThickProvisioned or ThinProvisioned. Default is ThinProvisioned.
     * 
     */
    @InputImport(name="storageMode")
      private final @Nullable Input<String> storageMode;

    public Input<String> getStorageMode() {
        return this.storageMode == null ? Input.empty() : this.storageMode;
    }

    /**
     * The ScaleIO Storage Pool associated with the protection domain.
     * 
     */
    @InputImport(name="storagePool")
      private final @Nullable Input<String> storagePool;

    public Input<String> getStoragePool() {
        return this.storagePool == null ? Input.empty() : this.storagePool;
    }

    /**
     * The name of the storage system as configured in ScaleIO.
     * 
     */
    @InputImport(name="system", required=true)
      private final Input<String> system;

    public Input<String> getSystem() {
        return this.system;
    }

    /**
     * The name of a volume already created in the ScaleIO system that is associated with this volume source.
     * 
     */
    @InputImport(name="volumeName")
      private final @Nullable Input<String> volumeName;

    public Input<String> getVolumeName() {
        return this.volumeName == null ? Input.empty() : this.volumeName;
    }

    public ScaleIOVolumeSourceArgs(
        @Nullable Input<String> fsType,
        Input<String> gateway,
        @Nullable Input<String> protectionDomain,
        @Nullable Input<Boolean> readOnly,
        Input<LocalObjectReferenceArgs> secretRef,
        @Nullable Input<Boolean> sslEnabled,
        @Nullable Input<String> storageMode,
        @Nullable Input<String> storagePool,
        Input<String> system,
        @Nullable Input<String> volumeName) {
        this.fsType = fsType;
        this.gateway = Objects.requireNonNull(gateway, "expected parameter 'gateway' to be non-null");
        this.protectionDomain = protectionDomain;
        this.readOnly = readOnly;
        this.secretRef = Objects.requireNonNull(secretRef, "expected parameter 'secretRef' to be non-null");
        this.sslEnabled = sslEnabled;
        this.storageMode = storageMode;
        this.storagePool = storagePool;
        this.system = Objects.requireNonNull(system, "expected parameter 'system' to be non-null");
        this.volumeName = volumeName;
    }

    private ScaleIOVolumeSourceArgs() {
        this.fsType = Input.empty();
        this.gateway = Input.empty();
        this.protectionDomain = Input.empty();
        this.readOnly = Input.empty();
        this.secretRef = Input.empty();
        this.sslEnabled = Input.empty();
        this.storageMode = Input.empty();
        this.storagePool = Input.empty();
        this.system = Input.empty();
        this.volumeName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleIOVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fsType;
        private Input<String> gateway;
        private @Nullable Input<String> protectionDomain;
        private @Nullable Input<Boolean> readOnly;
        private Input<LocalObjectReferenceArgs> secretRef;
        private @Nullable Input<Boolean> sslEnabled;
        private @Nullable Input<String> storageMode;
        private @Nullable Input<String> storagePool;
        private Input<String> system;
        private @Nullable Input<String> volumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleIOVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.gateway = defaults.gateway;
    	      this.protectionDomain = defaults.protectionDomain;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
    	      this.sslEnabled = defaults.sslEnabled;
    	      this.storageMode = defaults.storageMode;
    	      this.storagePool = defaults.storagePool;
    	      this.system = defaults.system;
    	      this.volumeName = defaults.volumeName;
        }

        public Builder fsType(@Nullable Input<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder fsType(@Nullable String fsType) {
            this.fsType = Input.ofNullable(fsType);
            return this;
        }

        public Builder gateway(Input<String> gateway) {
            this.gateway = Objects.requireNonNull(gateway);
            return this;
        }

        public Builder gateway(String gateway) {
            this.gateway = Input.of(Objects.requireNonNull(gateway));
            return this;
        }

        public Builder protectionDomain(@Nullable Input<String> protectionDomain) {
            this.protectionDomain = protectionDomain;
            return this;
        }

        public Builder protectionDomain(@Nullable String protectionDomain) {
            this.protectionDomain = Input.ofNullable(protectionDomain);
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

        public Builder secretRef(Input<LocalObjectReferenceArgs> secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }

        public Builder secretRef(LocalObjectReferenceArgs secretRef) {
            this.secretRef = Input.of(Objects.requireNonNull(secretRef));
            return this;
        }

        public Builder sslEnabled(@Nullable Input<Boolean> sslEnabled) {
            this.sslEnabled = sslEnabled;
            return this;
        }

        public Builder sslEnabled(@Nullable Boolean sslEnabled) {
            this.sslEnabled = Input.ofNullable(sslEnabled);
            return this;
        }

        public Builder storageMode(@Nullable Input<String> storageMode) {
            this.storageMode = storageMode;
            return this;
        }

        public Builder storageMode(@Nullable String storageMode) {
            this.storageMode = Input.ofNullable(storageMode);
            return this;
        }

        public Builder storagePool(@Nullable Input<String> storagePool) {
            this.storagePool = storagePool;
            return this;
        }

        public Builder storagePool(@Nullable String storagePool) {
            this.storagePool = Input.ofNullable(storagePool);
            return this;
        }

        public Builder system(Input<String> system) {
            this.system = Objects.requireNonNull(system);
            return this;
        }

        public Builder system(String system) {
            this.system = Input.of(Objects.requireNonNull(system));
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
        public ScaleIOVolumeSourceArgs build() {
            return new ScaleIOVolumeSourceArgs(fsType, gateway, protectionDomain, readOnly, secretRef, sslEnabled, storageMode, storagePool, system, volumeName);
        }
    }
}
