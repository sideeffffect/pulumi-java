// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.dataproc.v1.outputs.AcceleratorConfigResponse;
import com.pulumi.googlenative.dataproc.v1.outputs.DiskConfigResponse;
import com.pulumi.googlenative.dataproc.v1.outputs.InstanceReferenceResponse;
import com.pulumi.googlenative.dataproc.v1.outputs.ManagedGroupConfigResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class InstanceGroupConfigResponse {
    /**
     * @return Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    private final List<AcceleratorConfigResponse> accelerators;
    /**
     * @return Optional. Disk option config settings.
     * 
     */
    private final DiskConfigResponse diskConfig;
    /**
     * @return Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
     * 
     */
    private final String imageUri;
    /**
     * @return The list of instance names. Dataproc derives the names from cluster_name, num_instances, and the instance group.
     * 
     */
    private final List<String> instanceNames;
    /**
     * @return List of references to Compute Engine instances.
     * 
     */
    private final List<InstanceReferenceResponse> instanceReferences;
    /**
     * @return Specifies that this instance group contains preemptible instances.
     * 
     */
    private final Boolean isPreemptible;
    /**
     * @return Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
     * 
     */
    private final String machineTypeUri;
    /**
     * @return The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    private final ManagedGroupConfigResponse managedGroupConfig;
    /**
     * @return Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -&gt; Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    private final String minCpuPlatform;
    /**
     * @return Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
     * 
     */
    private final Integer numInstances;
    /**
     * @return Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
     */
    private final String preemptibility;

    @CustomType.Constructor
    private InstanceGroupConfigResponse(
        @CustomType.Parameter("accelerators") List<AcceleratorConfigResponse> accelerators,
        @CustomType.Parameter("diskConfig") DiskConfigResponse diskConfig,
        @CustomType.Parameter("imageUri") String imageUri,
        @CustomType.Parameter("instanceNames") List<String> instanceNames,
        @CustomType.Parameter("instanceReferences") List<InstanceReferenceResponse> instanceReferences,
        @CustomType.Parameter("isPreemptible") Boolean isPreemptible,
        @CustomType.Parameter("machineTypeUri") String machineTypeUri,
        @CustomType.Parameter("managedGroupConfig") ManagedGroupConfigResponse managedGroupConfig,
        @CustomType.Parameter("minCpuPlatform") String minCpuPlatform,
        @CustomType.Parameter("numInstances") Integer numInstances,
        @CustomType.Parameter("preemptibility") String preemptibility) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.imageUri = imageUri;
        this.instanceNames = instanceNames;
        this.instanceReferences = instanceReferences;
        this.isPreemptible = isPreemptible;
        this.machineTypeUri = machineTypeUri;
        this.managedGroupConfig = managedGroupConfig;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
        this.preemptibility = preemptibility;
    }

    /**
     * @return Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    public List<AcceleratorConfigResponse> accelerators() {
        return this.accelerators;
    }
    /**
     * @return Optional. Disk option config settings.
     * 
     */
    public DiskConfigResponse diskConfig() {
        return this.diskConfig;
    }
    /**
     * @return Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
     * 
     */
    public String imageUri() {
        return this.imageUri;
    }
    /**
     * @return The list of instance names. Dataproc derives the names from cluster_name, num_instances, and the instance group.
     * 
     */
    public List<String> instanceNames() {
        return this.instanceNames;
    }
    /**
     * @return List of references to Compute Engine instances.
     * 
     */
    public List<InstanceReferenceResponse> instanceReferences() {
        return this.instanceReferences;
    }
    /**
     * @return Specifies that this instance group contains preemptible instances.
     * 
     */
    public Boolean isPreemptible() {
        return this.isPreemptible;
    }
    /**
     * @return Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
     * 
     */
    public String machineTypeUri() {
        return this.machineTypeUri;
    }
    /**
     * @return The config for Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups.
     * 
     */
    public ManagedGroupConfigResponse managedGroupConfig() {
        return this.managedGroupConfig;
    }
    /**
     * @return Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -&gt; Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    public String minCpuPlatform() {
        return this.minCpuPlatform;
    }
    /**
     * @return Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
     * 
     */
    public Integer numInstances() {
        return this.numInstances;
    }
    /**
     * @return Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
     */
    public String preemptibility() {
        return this.preemptibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> accelerators;
        private DiskConfigResponse diskConfig;
        private String imageUri;
        private List<String> instanceNames;
        private List<InstanceReferenceResponse> instanceReferences;
        private Boolean isPreemptible;
        private String machineTypeUri;
        private ManagedGroupConfigResponse managedGroupConfig;
        private String minCpuPlatform;
        private Integer numInstances;
        private String preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.instanceNames = defaults.instanceNames;
    	      this.instanceReferences = defaults.instanceReferences;
    	      this.isPreemptible = defaults.isPreemptible;
    	      this.machineTypeUri = defaults.machineTypeUri;
    	      this.managedGroupConfig = defaults.managedGroupConfig;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder accelerators(List<AcceleratorConfigResponse> accelerators) {
            this.accelerators = Objects.requireNonNull(accelerators);
            return this;
        }
        public Builder accelerators(AcceleratorConfigResponse... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder diskConfig(DiskConfigResponse diskConfig) {
            this.diskConfig = Objects.requireNonNull(diskConfig);
            return this;
        }
        public Builder imageUri(String imageUri) {
            this.imageUri = Objects.requireNonNull(imageUri);
            return this;
        }
        public Builder instanceNames(List<String> instanceNames) {
            this.instanceNames = Objects.requireNonNull(instanceNames);
            return this;
        }
        public Builder instanceNames(String... instanceNames) {
            return instanceNames(List.of(instanceNames));
        }
        public Builder instanceReferences(List<InstanceReferenceResponse> instanceReferences) {
            this.instanceReferences = Objects.requireNonNull(instanceReferences);
            return this;
        }
        public Builder instanceReferences(InstanceReferenceResponse... instanceReferences) {
            return instanceReferences(List.of(instanceReferences));
        }
        public Builder isPreemptible(Boolean isPreemptible) {
            this.isPreemptible = Objects.requireNonNull(isPreemptible);
            return this;
        }
        public Builder machineTypeUri(String machineTypeUri) {
            this.machineTypeUri = Objects.requireNonNull(machineTypeUri);
            return this;
        }
        public Builder managedGroupConfig(ManagedGroupConfigResponse managedGroupConfig) {
            this.managedGroupConfig = Objects.requireNonNull(managedGroupConfig);
            return this;
        }
        public Builder minCpuPlatform(String minCpuPlatform) {
            this.minCpuPlatform = Objects.requireNonNull(minCpuPlatform);
            return this;
        }
        public Builder numInstances(Integer numInstances) {
            this.numInstances = Objects.requireNonNull(numInstances);
            return this;
        }
        public Builder preemptibility(String preemptibility) {
            this.preemptibility = Objects.requireNonNull(preemptibility);
            return this;
        }        public InstanceGroupConfigResponse build() {
            return new InstanceGroupConfigResponse(accelerators, diskConfig, imageUri, instanceNames, instanceReferences, isPreemptible, machineTypeUri, managedGroupConfig, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
