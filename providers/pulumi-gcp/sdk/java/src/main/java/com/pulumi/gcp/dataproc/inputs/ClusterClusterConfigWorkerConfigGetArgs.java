// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigAcceleratorGetArgs;
import com.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigDiskConfigGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterClusterConfigWorkerConfigGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigWorkerConfigGetArgs Empty = new ClusterClusterConfigWorkerConfigGetArgs();

    /**
     * The Compute Engine accelerator configuration for these instances. Can be specified multiple times.
     * 
     */
    @Import(name="accelerators")
    private @Nullable Output<List<ClusterClusterConfigWorkerConfigAcceleratorGetArgs>> accelerators;

    public Optional<Output<List<ClusterClusterConfigWorkerConfigAcceleratorGetArgs>>> accelerators() {
        return Optional.ofNullable(this.accelerators);
    }

    /**
     * Disk Config
     * 
     */
    @Import(name="diskConfig")
    private @Nullable Output<ClusterClusterConfigWorkerConfigDiskConfigGetArgs> diskConfig;

    public Optional<Output<ClusterClusterConfigWorkerConfigDiskConfigGetArgs>> diskConfig() {
        return Optional.ofNullable(this.diskConfig);
    }

    /**
     * The URI for the image to use for this worker.  See [the guide](https://cloud.google.com/dataproc/docs/guides/dataproc-images)
     * for more information.
     * 
     */
    @Import(name="imageUri")
    private @Nullable Output<String> imageUri;

    public Optional<Output<String>> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }

    @Import(name="instanceNames")
    private @Nullable Output<List<String>> instanceNames;

    public Optional<Output<List<String>>> instanceNames() {
        return Optional.ofNullable(this.instanceNames);
    }

    /**
     * The name of a Google Compute Engine machine type
     * to create for the worker nodes. If not specified, GCP will default to a predetermined
     * computed value (currently `n1-standard-4`).
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * The name of a minimum generation of CPU family
     * for the master. If not specified, GCP will default to a predetermined computed value
     * for each zone. See [the guide](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for details about which CPU families are available (and defaulted) for each zone.
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    /**
     * Specifies the number of preemptible nodes to create.
     * Defaults to 0.
     * 
     */
    @Import(name="numInstances")
    private @Nullable Output<Integer> numInstances;

    public Optional<Output<Integer>> numInstances() {
        return Optional.ofNullable(this.numInstances);
    }

    private ClusterClusterConfigWorkerConfigGetArgs() {}

    private ClusterClusterConfigWorkerConfigGetArgs(ClusterClusterConfigWorkerConfigGetArgs $) {
        this.accelerators = $.accelerators;
        this.diskConfig = $.diskConfig;
        this.imageUri = $.imageUri;
        this.instanceNames = $.instanceNames;
        this.machineType = $.machineType;
        this.minCpuPlatform = $.minCpuPlatform;
        this.numInstances = $.numInstances;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterClusterConfigWorkerConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterClusterConfigWorkerConfigGetArgs $;

        public Builder() {
            $ = new ClusterClusterConfigWorkerConfigGetArgs();
        }

        public Builder(ClusterClusterConfigWorkerConfigGetArgs defaults) {
            $ = new ClusterClusterConfigWorkerConfigGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder accelerators(@Nullable Output<List<ClusterClusterConfigWorkerConfigAcceleratorGetArgs>> accelerators) {
            $.accelerators = accelerators;
            return this;
        }

        public Builder accelerators(List<ClusterClusterConfigWorkerConfigAcceleratorGetArgs> accelerators) {
            return accelerators(Output.of(accelerators));
        }

        public Builder accelerators(ClusterClusterConfigWorkerConfigAcceleratorGetArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }

        public Builder diskConfig(@Nullable Output<ClusterClusterConfigWorkerConfigDiskConfigGetArgs> diskConfig) {
            $.diskConfig = diskConfig;
            return this;
        }

        public Builder diskConfig(ClusterClusterConfigWorkerConfigDiskConfigGetArgs diskConfig) {
            return diskConfig(Output.of(diskConfig));
        }

        public Builder imageUri(@Nullable Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        public Builder instanceNames(@Nullable Output<List<String>> instanceNames) {
            $.instanceNames = instanceNames;
            return this;
        }

        public Builder instanceNames(List<String> instanceNames) {
            return instanceNames(Output.of(instanceNames));
        }

        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }

        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        public Builder numInstances(@Nullable Output<Integer> numInstances) {
            $.numInstances = numInstances;
            return this;
        }

        public Builder numInstances(Integer numInstances) {
            return numInstances(Output.of(numInstances));
        }

        public ClusterClusterConfigWorkerConfigGetArgs build() {
            return $;
        }
    }

}
