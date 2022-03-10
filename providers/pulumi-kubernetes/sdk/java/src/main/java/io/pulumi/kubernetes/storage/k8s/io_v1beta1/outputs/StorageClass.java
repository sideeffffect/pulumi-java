// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.storage.k8s.io_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.TopologySelectorTerm;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageClass {
    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * 
     */
    private final @Nullable Boolean allowVolumeExpansion;
    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    private final @Nullable List<TopologySelectorTerm> allowedTopologies;
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    private final @Nullable String apiVersion;
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    private final @Nullable String kind;
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    private final @Nullable ObjectMeta metadata;
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
     */
    private final @Nullable List<String> mountOptions;
    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * Provisioner indicates the type of the provisioner.
     * 
     */
    private final String provisioner;
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
     */
    private final @Nullable String reclaimPolicy;
    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
     */
    private final @Nullable String volumeBindingMode;

    @OutputCustomType.Constructor
    private StorageClass(
        @OutputCustomType.Parameter("allowVolumeExpansion") @Nullable Boolean allowVolumeExpansion,
        @OutputCustomType.Parameter("allowedTopologies") @Nullable List<TopologySelectorTerm> allowedTopologies,
        @OutputCustomType.Parameter("apiVersion") @Nullable String apiVersion,
        @OutputCustomType.Parameter("kind") @Nullable String kind,
        @OutputCustomType.Parameter("metadata") @Nullable ObjectMeta metadata,
        @OutputCustomType.Parameter("mountOptions") @Nullable List<String> mountOptions,
        @OutputCustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @OutputCustomType.Parameter("provisioner") String provisioner,
        @OutputCustomType.Parameter("reclaimPolicy") @Nullable String reclaimPolicy,
        @OutputCustomType.Parameter("volumeBindingMode") @Nullable String volumeBindingMode) {
        this.allowVolumeExpansion = allowVolumeExpansion;
        this.allowedTopologies = allowedTopologies;
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.mountOptions = mountOptions;
        this.parameters = parameters;
        this.provisioner = provisioner;
        this.reclaimPolicy = reclaimPolicy;
        this.volumeBindingMode = volumeBindingMode;
    }

    /**
     * AllowVolumeExpansion shows whether the storage class allow volume expand
     * 
    */
    public Optional<Boolean> getAllowVolumeExpansion() {
        return Optional.ofNullable(this.allowVolumeExpansion);
    }
    /**
     * Restrict the node topologies where volumes can be dynamically provisioned. Each volume plugin defines its own supported topology specifications. An empty TopologySelectorTerm list means there is no topology restriction. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
    */
    public List<TopologySelectorTerm> getAllowedTopologies() {
        return this.allowedTopologies == null ? List.of() : this.allowedTopologies;
    }
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
    */
    public Optional<String> getApiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
    */
    public Optional<ObjectMeta> getMetadata() {
        return Optional.ofNullable(this.metadata);
    }
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with these mountOptions, e.g. ["ro", "soft"]. Not validated - mount of the PVs will simply fail if one is invalid.
     * 
    */
    public List<String> getMountOptions() {
        return this.mountOptions == null ? List.of() : this.mountOptions;
    }
    /**
     * Parameters holds the parameters for the provisioner that should create volumes of this storage class.
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Provisioner indicates the type of the provisioner.
     * 
    */
    public String getProvisioner() {
        return this.provisioner;
    }
    /**
     * Dynamically provisioned PersistentVolumes of this storage class are created with this reclaimPolicy. Defaults to Delete.
     * 
    */
    public Optional<String> getReclaimPolicy() {
        return Optional.ofNullable(this.reclaimPolicy);
    }
    /**
     * VolumeBindingMode indicates how PersistentVolumeClaims should be provisioned and bound.  When unset, VolumeBindingImmediate is used. This field is only honored by servers that enable the VolumeScheduling feature.
     * 
    */
    public Optional<String> getVolumeBindingMode() {
        return Optional.ofNullable(this.volumeBindingMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageClass defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowVolumeExpansion;
        private @Nullable List<TopologySelectorTerm> allowedTopologies;
        private @Nullable String apiVersion;
        private @Nullable String kind;
        private @Nullable ObjectMeta metadata;
        private @Nullable List<String> mountOptions;
        private @Nullable Map<String,String> parameters;
        private String provisioner;
        private @Nullable String reclaimPolicy;
        private @Nullable String volumeBindingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowVolumeExpansion = defaults.allowVolumeExpansion;
    	      this.allowedTopologies = defaults.allowedTopologies;
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.mountOptions = defaults.mountOptions;
    	      this.parameters = defaults.parameters;
    	      this.provisioner = defaults.provisioner;
    	      this.reclaimPolicy = defaults.reclaimPolicy;
    	      this.volumeBindingMode = defaults.volumeBindingMode;
        }

        public Builder allowVolumeExpansion(@Nullable Boolean allowVolumeExpansion) {
            this.allowVolumeExpansion = allowVolumeExpansion;
            return this;
        }

        public Builder allowedTopologies(@Nullable List<TopologySelectorTerm> allowedTopologies) {
            this.allowedTopologies = allowedTopologies;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder metadata(@Nullable ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder mountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder provisioner(String provisioner) {
            this.provisioner = Objects.requireNonNull(provisioner);
            return this;
        }

        public Builder reclaimPolicy(@Nullable String reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }

        public Builder volumeBindingMode(@Nullable String volumeBindingMode) {
            this.volumeBindingMode = volumeBindingMode;
            return this;
        }
        public StorageClass build() {
            return new StorageClass(allowVolumeExpansion, allowedTopologies, apiVersion, kind, metadata, mountOptions, parameters, provisioner, reclaimPolicy, volumeBindingMode);
        }
    }
}
