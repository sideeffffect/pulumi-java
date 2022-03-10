// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.appengine_v1.inputs.VolumeArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Machine resources for a version.
 * 
 */
public final class ResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcesArgs Empty = new ResourcesArgs();

    /**
     * Number of CPU cores needed.
     * 
     */
    @InputImport(name="cpu")
      private final @Nullable Input<Double> cpu;

    public Input<Double> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    /**
     * Disk size (GB) needed.
     * 
     */
    @InputImport(name="diskGb")
      private final @Nullable Input<Double> diskGb;

    public Input<Double> getDiskGb() {
        return this.diskGb == null ? Input.empty() : this.diskGb;
    }

    /**
     * The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
     * 
     */
    @InputImport(name="kmsKeyReference")
      private final @Nullable Input<String> kmsKeyReference;

    public Input<String> getKmsKeyReference() {
        return this.kmsKeyReference == null ? Input.empty() : this.kmsKeyReference;
    }

    /**
     * Memory (GB) needed.
     * 
     */
    @InputImport(name="memoryGb")
      private final @Nullable Input<Double> memoryGb;

    public Input<Double> getMemoryGb() {
        return this.memoryGb == null ? Input.empty() : this.memoryGb;
    }

    /**
     * User specified volumes.
     * 
     */
    @InputImport(name="volumes")
      private final @Nullable Input<List<VolumeArgs>> volumes;

    public Input<List<VolumeArgs>> getVolumes() {
        return this.volumes == null ? Input.empty() : this.volumes;
    }

    public ResourcesArgs(
        @Nullable Input<Double> cpu,
        @Nullable Input<Double> diskGb,
        @Nullable Input<String> kmsKeyReference,
        @Nullable Input<Double> memoryGb,
        @Nullable Input<List<VolumeArgs>> volumes) {
        this.cpu = cpu;
        this.diskGb = diskGb;
        this.kmsKeyReference = kmsKeyReference;
        this.memoryGb = memoryGb;
        this.volumes = volumes;
    }

    private ResourcesArgs() {
        this.cpu = Input.empty();
        this.diskGb = Input.empty();
        this.kmsKeyReference = Input.empty();
        this.memoryGb = Input.empty();
        this.volumes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> cpu;
        private @Nullable Input<Double> diskGb;
        private @Nullable Input<String> kmsKeyReference;
        private @Nullable Input<Double> memoryGb;
        private @Nullable Input<List<VolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.diskGb = defaults.diskGb;
    	      this.kmsKeyReference = defaults.kmsKeyReference;
    	      this.memoryGb = defaults.memoryGb;
    	      this.volumes = defaults.volumes;
        }

        public Builder cpu(@Nullable Input<Double> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder diskGb(@Nullable Input<Double> diskGb) {
            this.diskGb = diskGb;
            return this;
        }

        public Builder diskGb(@Nullable Double diskGb) {
            this.diskGb = Input.ofNullable(diskGb);
            return this;
        }

        public Builder kmsKeyReference(@Nullable Input<String> kmsKeyReference) {
            this.kmsKeyReference = kmsKeyReference;
            return this;
        }

        public Builder kmsKeyReference(@Nullable String kmsKeyReference) {
            this.kmsKeyReference = Input.ofNullable(kmsKeyReference);
            return this;
        }

        public Builder memoryGb(@Nullable Input<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }

        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Input.ofNullable(memoryGb);
            return this;
        }

        public Builder volumes(@Nullable Input<List<VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder volumes(@Nullable List<VolumeArgs> volumes) {
            this.volumes = Input.ofNullable(volumes);
            return this;
        }
        public ResourcesArgs build() {
            return new ResourcesArgs(cpu, diskGb, kmsKeyReference, memoryGb, volumes);
        }
    }
}
