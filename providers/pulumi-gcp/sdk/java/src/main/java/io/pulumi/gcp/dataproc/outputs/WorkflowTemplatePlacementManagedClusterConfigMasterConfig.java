// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigAccelerator;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfig;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigMasterConfig {
    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    private final @Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAccelerator> accelerators;
    /**
     * Optional. Disk option config settings.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig diskConfig;
    /**
     * Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
     * 
     */
    private final @Nullable String image;
    /**
     * - 
     * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
     * 
     */
    private final @Nullable List<String> instanceNames;
    /**
     * - 
     * Output only. Specifies that this instance group contains preemptible instances.
     * 
     */
    private final @Nullable Boolean isPreemptible;
    /**
     * Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
     * 
     */
    private final @Nullable String machineType;
    /**
     * - 
     * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    private final @Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfig> managedGroupConfigs;
    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    private final @Nullable String minCpuPlatform;
    /**
     * Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
     * 
     */
    private final @Nullable Integer numInstances;
    /**
     * Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
     * 
     */
    private final @Nullable String preemptibility;

    @OutputCustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigMasterConfig(
        @OutputCustomType.Parameter("accelerators") @Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAccelerator> accelerators,
        @OutputCustomType.Parameter("diskConfig") @Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig diskConfig,
        @OutputCustomType.Parameter("image") @Nullable String image,
        @OutputCustomType.Parameter("instanceNames") @Nullable List<String> instanceNames,
        @OutputCustomType.Parameter("isPreemptible") @Nullable Boolean isPreemptible,
        @OutputCustomType.Parameter("machineType") @Nullable String machineType,
        @OutputCustomType.Parameter("managedGroupConfigs") @Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfig> managedGroupConfigs,
        @OutputCustomType.Parameter("minCpuPlatform") @Nullable String minCpuPlatform,
        @OutputCustomType.Parameter("numInstances") @Nullable Integer numInstances,
        @OutputCustomType.Parameter("preemptibility") @Nullable String preemptibility) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.image = image;
        this.instanceNames = instanceNames;
        this.isPreemptible = isPreemptible;
        this.machineType = machineType;
        this.managedGroupConfigs = managedGroupConfigs;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
        this.preemptibility = preemptibility;
    }

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
    */
    public List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAccelerator> getAccelerators() {
        return this.accelerators == null ? List.of() : this.accelerators;
    }
    /**
     * Optional. Disk option config settings.
     * 
    */
    public Optional<WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig> getDiskConfig() {
        return Optional.ofNullable(this.diskConfig);
    }
    /**
     * Optional. The Compute Engine image resource used for cluster instances. The URI can represent an image or image family. Image examples: * `https://www.googleapis.com/compute/beta/projects/` If the URI is unspecified, it will be inferred from `SoftwareConfig.image_version` or the system default.
     * 
    */
    public Optional<String> getImage() {
        return Optional.ofNullable(this.image);
    }
    /**
     * - 
     * Output only. The list of instance names. Dataproc derives the names from `cluster_name`, `num_instances`, and the instance group.
     * 
    */
    public List<String> getInstanceNames() {
        return this.instanceNames == null ? List.of() : this.instanceNames;
    }
    /**
     * - 
     * Output only. Specifies that this instance group contains preemptible instances.
     * 
    */
    public Optional<Boolean> getIsPreemptible() {
        return Optional.ofNullable(this.isPreemptible);
    }
    /**
     * Optional. The Compute Engine machine type used for cluster instances. A full URL, partial URI, or short name are valid. Examples: * ` https://www.googleapis.com/compute/v1/projects/(https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example,  `n1-standard-2`.
     * 
    */
    public Optional<String> getMachineType() {
        return Optional.ofNullable(this.machineType);
    }
    /**
     * - 
     * Output only. The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
    */
    public List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfig> getManagedGroupConfigs() {
        return this.managedGroupConfigs == null ? List.of() : this.managedGroupConfigs;
    }
    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
    */
    public Optional<String> getMinCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }
    /**
     * Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1.
     * 
    */
    public Optional<Integer> getNumInstances() {
        return Optional.ofNullable(this.numInstances);
    }
    /**
     * Optional. Specifies the preemptibility of the instance group. The default value for master and worker groups is `NON_PREEMPTIBLE`. This default cannot be changed. The default value for secondary instances is `PREEMPTIBLE`. Possible values: PREEMPTIBILITY_UNSPECIFIED, NON_PREEMPTIBLE, PREEMPTIBLE
     * 
    */
    public Optional<String> getPreemptibility() {
        return Optional.ofNullable(this.preemptibility);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAccelerator> accelerators;
        private @Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig diskConfig;
        private @Nullable String image;
        private @Nullable List<String> instanceNames;
        private @Nullable Boolean isPreemptible;
        private @Nullable String machineType;
        private @Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfig> managedGroupConfigs;
        private @Nullable String minCpuPlatform;
        private @Nullable Integer numInstances;
        private @Nullable String preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.image = defaults.image;
    	      this.instanceNames = defaults.instanceNames;
    	      this.isPreemptible = defaults.isPreemptible;
    	      this.machineType = defaults.machineType;
    	      this.managedGroupConfigs = defaults.managedGroupConfigs;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder accelerators(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigAccelerator> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        public Builder diskConfig(@Nullable WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }

        public Builder image(@Nullable String image) {
            this.image = image;
            return this;
        }

        public Builder instanceNames(@Nullable List<String> instanceNames) {
            this.instanceNames = instanceNames;
            return this;
        }

        public Builder isPreemptible(@Nullable Boolean isPreemptible) {
            this.isPreemptible = isPreemptible;
            return this;
        }

        public Builder machineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder managedGroupConfigs(@Nullable List<WorkflowTemplatePlacementManagedClusterConfigMasterConfigManagedGroupConfig> managedGroupConfigs) {
            this.managedGroupConfigs = managedGroupConfigs;
            return this;
        }

        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder numInstances(@Nullable Integer numInstances) {
            this.numInstances = numInstances;
            return this;
        }

        public Builder preemptibility(@Nullable String preemptibility) {
            this.preemptibility = preemptibility;
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigMasterConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigMasterConfig(accelerators, diskConfig, image, instanceNames, isPreemptible, machineType, managedGroupConfigs, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
