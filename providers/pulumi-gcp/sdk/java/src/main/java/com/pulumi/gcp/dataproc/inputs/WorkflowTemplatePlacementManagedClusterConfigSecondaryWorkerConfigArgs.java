// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs;
import com.pulumi.gcp.dataproc.inputs.WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfigArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs extends ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs();

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    @Import(name="accelerators")
    private @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorArgs>> accelerators;

    /**
     * @return Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    public Optional<Output<List<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorArgs>>> accelerators() {
        return Optional.ofNullable(this.accelerators);
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @Import(name="diskConfig")
    private @Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs> diskConfig;

    /**
     * @return Optional. Disk option config settings.
     * 
     */
    public Optional<Output<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs>> diskConfig() {
        return Optional.ofNullable(this.diskConfig);
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
     * 
     */
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

    /**
     * @return -
     * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
     * 
     */
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

    /**
     * @return -
     * Output only. Specifies that this instance group contains preemptible instances.
     * 
     */
    public Optional<Output<Boolean>> isPreemptible() {
        return Optional.ofNullable(this.isPreemptible);
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
     * 
     */
    @Import(name="machineType")
    private @Nullable Output<String> machineType;

    /**
     * @return Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
     * 
     */
    public Optional<Output<String>> machineType() {
        return Optional.ofNullable(this.machineType);
    }

    /**
     * - 
     * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    @Import(name="managedGroupConfigs")
    private @Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfigArgs>> managedGroupConfigs;

    /**
     * @return -
     * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    public Optional<Output<List<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfigArgs>>> managedGroupConfigs() {
        return Optional.ofNullable(this.managedGroupConfigs);
    }

    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    /**
     * @return Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    /**
     * Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
     * 
     */
    @Import(name="numInstances")
    private @Nullable Output<Integer> numInstances;

    /**
     * @return Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
     * 
     */
    public Optional<Output<Integer>> numInstances() {
        return Optional.ofNullable(this.numInstances);
    }

    /**
     * Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
     * 
     */
    @Import(name="preemptibility")
    private @Nullable Output<String> preemptibility;

    /**
     * @return Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
     * 
     */
    public Optional<Output<String>> preemptibility() {
        return Optional.ofNullable(this.preemptibility);
    }

    private WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs $) {
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
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accelerators Optional. The Compute Engine accelerator configuration for these instances.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(@Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorArgs>> accelerators) {
            $.accelerators = accelerators;
            return this;
        }

        /**
         * @param accelerators Optional. The Compute Engine accelerator configuration for these instances.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(List<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorArgs> accelerators) {
            return accelerators(Output.of(accelerators));
        }

        /**
         * @param accelerators Optional. The Compute Engine accelerator configuration for these instances.
         * 
         * @return builder
         * 
         */
        public Builder accelerators(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigAcceleratorArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }

        /**
         * @param diskConfig Optional. Disk option config settings.
         * 
         * @return builder
         * 
         */
        public Builder diskConfig(@Nullable Output<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs> diskConfig) {
            $.diskConfig = diskConfig;
            return this;
        }

        /**
         * @param diskConfig Optional. Disk option config settings.
         * 
         * @return builder
         * 
         */
        public Builder diskConfig(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigDiskConfigArgs diskConfig) {
            return diskConfig(Output.of(diskConfig));
        }

        /**
         * @param image Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param instanceNames -
         * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
         * 
         * @return builder
         * 
         */
        public Builder instanceNames(@Nullable Output<List<String>> instanceNames) {
            $.instanceNames = instanceNames;
            return this;
        }

        /**
         * @param instanceNames -
         * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
         * 
         * @return builder
         * 
         */
        public Builder instanceNames(List<String> instanceNames) {
            return instanceNames(Output.of(instanceNames));
        }

        /**
         * @param instanceNames -
         * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
         * 
         * @return builder
         * 
         */
        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }

        /**
         * @param isPreemptible -
         * Output only. Specifies that this instance group contains preemptible instances.
         * 
         * @return builder
         * 
         */
        public Builder isPreemptible(@Nullable Output<Boolean> isPreemptible) {
            $.isPreemptible = isPreemptible;
            return this;
        }

        /**
         * @param isPreemptible -
         * Output only. Specifies that this instance group contains preemptible instances.
         * 
         * @return builder
         * 
         */
        public Builder isPreemptible(Boolean isPreemptible) {
            return isPreemptible(Output.of(isPreemptible));
        }

        /**
         * @param machineType Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
         * 
         * @return builder
         * 
         */
        public Builder machineType(@Nullable Output<String> machineType) {
            $.machineType = machineType;
            return this;
        }

        /**
         * @param machineType Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
         * 
         * @return builder
         * 
         */
        public Builder machineType(String machineType) {
            return machineType(Output.of(machineType));
        }

        /**
         * @param managedGroupConfigs -
         * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
         * 
         * @return builder
         * 
         */
        public Builder managedGroupConfigs(@Nullable Output<List<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfigArgs>> managedGroupConfigs) {
            $.managedGroupConfigs = managedGroupConfigs;
            return this;
        }

        /**
         * @param managedGroupConfigs -
         * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
         * 
         * @return builder
         * 
         */
        public Builder managedGroupConfigs(List<WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfigArgs> managedGroupConfigs) {
            return managedGroupConfigs(Output.of(managedGroupConfigs));
        }

        /**
         * @param managedGroupConfigs -
         * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
         * 
         * @return builder
         * 
         */
        public Builder managedGroupConfigs(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfigArgs... managedGroupConfigs) {
            return managedGroupConfigs(List.of(managedGroupConfigs));
        }

        /**
         * @param minCpuPlatform Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
         * 
         * @return builder
         * 
         */
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        /**
         * @param minCpuPlatform Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
         * 
         * @return builder
         * 
         */
        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        /**
         * @param numInstances Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
         * 
         * @return builder
         * 
         */
        public Builder numInstances(@Nullable Output<Integer> numInstances) {
            $.numInstances = numInstances;
            return this;
        }

        /**
         * @param numInstances Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
         * 
         * @return builder
         * 
         */
        public Builder numInstances(Integer numInstances) {
            return numInstances(Output.of(numInstances));
        }

        /**
         * @param preemptibility Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
         * 
         * @return builder
         * 
         */
        public Builder preemptibility(@Nullable Output<String> preemptibility) {
            $.preemptibility = preemptibility;
            return this;
        }

        /**
         * @param preemptibility Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
         * 
         * @return builder
         * 
         */
        public Builder preemptibility(String preemptibility) {
            return preemptibility(Output.of(preemptibility));
        }

        public WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigArgs build() {
            return $;
        }
    }

}
