// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigWorkerConfigAccelerator;
import io.pulumi.gcp.dataproc.outputs.ClusterClusterConfigWorkerConfigDiskConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterConfigWorkerConfig {
    /**
     * The Compute Engine accelerator configuration for these instances. Can be specified multiple times.
     * 
     */
    private final @Nullable List<ClusterClusterConfigWorkerConfigAccelerator> accelerators;
    /**
     * Disk Config
     * 
     */
    private final @Nullable ClusterClusterConfigWorkerConfigDiskConfig diskConfig;
    /**
     * The URI for the image to use for this worker.  See [the guide](https://cloud.google.com/dataproc/docs/guides/dataproc-images)
     * for more information.
     * 
     */
    private final @Nullable String imageUri;
    private final @Nullable List<String> instanceNames;
    /**
     * The name of a Google Compute Engine machine type
     * to create for the worker nodes. If not specified, GCP will default to a predetermined
     * computed value (currently `n1-standard-4`).
     * 
     */
    private final @Nullable String machineType;
    /**
     * The name of a minimum generation of CPU family
     * for the master. If not specified, GCP will default to a predetermined computed value
     * for each zone. See [the guide](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for details about which CPU families are available (and defaulted) for each zone.
     * 
     */
    private final @Nullable String minCpuPlatform;
    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
     */
    private final @Nullable Integer numInstances;

    @CustomType.Constructor
    private ClusterClusterConfigWorkerConfig(
        @CustomType.Parameter("accelerators") @Nullable List<ClusterClusterConfigWorkerConfigAccelerator> accelerators,
        @CustomType.Parameter("diskConfig") @Nullable ClusterClusterConfigWorkerConfigDiskConfig diskConfig,
        @CustomType.Parameter("imageUri") @Nullable String imageUri,
        @CustomType.Parameter("instanceNames") @Nullable List<String> instanceNames,
        @CustomType.Parameter("machineType") @Nullable String machineType,
        @CustomType.Parameter("minCpuPlatform") @Nullable String minCpuPlatform,
        @CustomType.Parameter("numInstances") @Nullable Integer numInstances) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.imageUri = imageUri;
        this.instanceNames = instanceNames;
        this.machineType = machineType;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
    }

    /**
     * The Compute Engine accelerator configuration for these instances. Can be specified multiple times.
     * 
    */
    public List<ClusterClusterConfigWorkerConfigAccelerator> accelerators() {
        return this.accelerators == null ? List.of() : this.accelerators;
    }
    /**
     * Disk Config
     * 
    */
    public Optional<ClusterClusterConfigWorkerConfigDiskConfig> diskConfig() {
        return Optional.ofNullable(this.diskConfig);
    }
    /**
     * The URI for the image to use for this worker.  See [the guide](https://cloud.google.com/dataproc/docs/guides/dataproc-images)
     * for more information.
     * 
    */
    public Optional<String> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }
    public List<String> instanceNames() {
        return this.instanceNames == null ? List.of() : this.instanceNames;
    }
    /**
     * The name of a Google Compute Engine machine type
     * to create for the worker nodes. If not specified, GCP will default to a predetermined
     * computed value (currently `n1-standard-4`).
     * 
    */
    public Optional<String> machineType() {
        return Optional.ofNullable(this.machineType);
    }
    /**
     * The name of a minimum generation of CPU family
     * for the master. If not specified, GCP will default to a predetermined computed value
     * for each zone. See [the guide](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for details about which CPU families are available (and defaulted) for each zone.
     * 
    */
    public Optional<String> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }
    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
    */
    public Optional<Integer> numInstances() {
        return Optional.ofNullable(this.numInstances);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigWorkerConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ClusterClusterConfigWorkerConfigAccelerator> accelerators;
        private @Nullable ClusterClusterConfigWorkerConfigDiskConfig diskConfig;
        private @Nullable String imageUri;
        private @Nullable List<String> instanceNames;
        private @Nullable String machineType;
        private @Nullable String minCpuPlatform;
        private @Nullable Integer numInstances;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigWorkerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.instanceNames = defaults.instanceNames;
    	      this.machineType = defaults.machineType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
        }

        public Builder accelerators(@Nullable List<ClusterClusterConfigWorkerConfigAccelerator> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public Builder accelerators(ClusterClusterConfigWorkerConfigAccelerator... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder diskConfig(@Nullable ClusterClusterConfigWorkerConfigDiskConfig diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }
        public Builder imageUri(@Nullable String imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public Builder instanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }
        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder numInstances(@Nullable Integer numInstances) {
            this.numInstances = numInstances;
            return this;
        }        public ClusterClusterConfigWorkerConfig build() {
            return new ClusterClusterConfigWorkerConfig(accelerators, diskConfig, imageUri, instanceNames, machineType, minCpuPlatform, numInstances);
        }
    }
}
