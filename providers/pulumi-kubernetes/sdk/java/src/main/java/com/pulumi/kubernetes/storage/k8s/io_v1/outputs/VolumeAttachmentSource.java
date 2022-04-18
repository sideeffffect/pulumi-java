// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.storage.k8s.io_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.core_v1.outputs.PersistentVolumeSpec;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VolumeAttachmentSource {
    /**
     * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the CSIMigration feature.
     * 
     */
    private final @Nullable PersistentVolumeSpec inlineVolumeSpec;
    /**
     * Name of the persistent volume to attach.
     * 
     */
    private final @Nullable String persistentVolumeName;

    @CustomType.Constructor
    private VolumeAttachmentSource(
        @CustomType.Parameter("inlineVolumeSpec") @Nullable PersistentVolumeSpec inlineVolumeSpec,
        @CustomType.Parameter("persistentVolumeName") @Nullable String persistentVolumeName) {
        this.inlineVolumeSpec = inlineVolumeSpec;
        this.persistentVolumeName = persistentVolumeName;
    }

    /**
     * inlineVolumeSpec contains all the information necessary to attach a persistent volume defined by a pod's inline VolumeSource. This field is populated only for the CSIMigration feature. It contains translated fields from a pod's inline VolumeSource to a PersistentVolumeSpec. This field is beta-level and is only honored by servers that enabled the CSIMigration feature.
     * 
    */
    public Optional<PersistentVolumeSpec> inlineVolumeSpec() {
        return Optional.ofNullable(this.inlineVolumeSpec);
    }
    /**
     * Name of the persistent volume to attach.
     * 
    */
    public Optional<String> persistentVolumeName() {
        return Optional.ofNullable(this.persistentVolumeName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PersistentVolumeSpec inlineVolumeSpec;
        private @Nullable String persistentVolumeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineVolumeSpec = defaults.inlineVolumeSpec;
    	      this.persistentVolumeName = defaults.persistentVolumeName;
        }

        public Builder inlineVolumeSpec(@Nullable PersistentVolumeSpec inlineVolumeSpec) {
            this.inlineVolumeSpec = inlineVolumeSpec;
            return this;
        }
        public Builder persistentVolumeName(@Nullable String persistentVolumeName) {
            this.persistentVolumeName = persistentVolumeName;
            return this;
        }        public VolumeAttachmentSource build() {
            return new VolumeAttachmentSource(inlineVolumeSpec, persistentVolumeName);
        }
    }
}
