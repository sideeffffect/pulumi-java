// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs();

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    @Import(name="accelerators")
    private @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs>> accelerators;

    public Optional<Output<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs>>> accelerators() {
        return Optional.ofNullable(this.accelerators);
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @Import(name="diskConfig")
    private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs> diskConfig;

    public Optional<Output<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs>> diskConfig() {
        return Optional.ofNullable(this.diskConfig);
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * - 
     * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
     * 
     */
    @Import(name="instanceNames")
    private @Nullable Output<List<String>> instanceNames;

    public Optional<Output<List<String>>> instanceNames() {
        return Optional.ofNullable(this.instanceNames);
    }

    /**
     * - 
     * Output only. Specifies that this instance group contains preemptible instances.
     * 
     */
    @Import(name="isPreemptible")
    private @Nullable Output<Boolean> isPreemptible;

    public Optional<Output<Boolean>> isPreemptible() {
        return Optional.ofNullable(this.isPreemptible);
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * - 
     * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    @Import(name="managedGroupConfigs")
    private @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs>> managedGroupConfigs;

    public Optional<Output<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs>>> managedGroupConfigs() {
        return Optional.ofNullable(this.managedGroupConfigs);
    }

    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    /**
     * Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
     * 
     */
    @Import(name="numInstances")
    private @Nullable Output<Integer> numInstances;

    public Optional<Output<Integer>> numInstances() {
        return Optional.ofNullable(this.numInstances);
    }

    /**
     * Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
     * 
     */
    @Import(name="preemptibility")
    private @Nullable Output<String> preemptibility;

    public Optional<Output<String>> preemptibility() {
        return Optional.ofNullable(this.preemptibility);
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs $) {
        this.accelerators = $.accelerators;
        this.diskConfig = $.diskConfig;
        this.image = $.image;
        this.instanceNames = $.instanceNames;
        this.isPreemptible = $.isPreemptible;
        this.machineType = $.machineType;
        this.managedGroupConfigs = $.managedGroupConfigs;
        this.minCpuPlatform = $.minCpuPlatform;
        this.numInstances = $.numInstances;
        this.preemptibility = $.preemptibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder accelerators(@Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs>> accelerators) {
            $.accelerators = accelerators;
            return this;
        }

        public Builder accelerators(List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs> accelerators) {
            return accelerators(Output.of(accelerators));
        }

        public Builder accelerators(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }

        public Builder diskConfig(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs> diskConfig) {
            $.diskConfig = diskConfig;
            return this;
        }

        public Builder diskConfig(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigDiskConfigArgs diskConfig) {
            return diskConfig(Output.of(diskConfig));
        }

        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
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

        public Builder isPreemptible(@Nullable Output<Boolean> isPreemptible) {
            $.isPreemptible = isPreemptible;
            return this;
        }

        public Builder isPreemptible(Boolean isPreemptible) {
            return isPreemptible(Output.of(isPreemptible));
        }

        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        public Builder managedGroupConfigs(@Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs>> managedGroupConfigs) {
            $.managedGroupConfigs = managedGroupConfigs;
            return this;
        }

        public Builder managedGroupConfigs(List<WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs> managedGroupConfigs) {
            return managedGroupConfigs(Output.of(managedGroupConfigs));
        }

        public Builder managedGroupConfigs(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigManagedGroupConfigArgs... managedGroupConfigs) {
            return managedGroupConfigs(List.of(managedGroupConfigs));
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

        public Builder preemptibility(@Nullable Output<String> preemptibility) {
            $.preemptibility = preemptibility;
            return this;
        }

        public Builder preemptibility(String preemptibility) {
            return preemptibility(Output.of(preemptibility));
        }

        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigArgs build() {
            return $;
        }
    }

}
