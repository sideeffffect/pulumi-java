// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigEphemeralStorageConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigGcfsConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigGuestAcceleratorArgs;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigKubeletConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigLinuxNodeConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigSandboxConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigShieldedInstanceConfigArgs;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigTaintArgs;
import io.pulumi.gcp.container.inputs.ClusterNodeConfigWorkloadMetadataConfigArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigArgs Empty = new ClusterNodeConfigArgs();

    /**
     * The Customer Managed Encryption Key used to encrypt the boot disk attached to each node in the node pool. This should be of the form projects/[KEY_PROJECT_ID]/locations/[LOCATION]/keyRings/[RING_NAME]/cryptoKeys/[KEY_NAME]. For more information about protecting resources with Cloud KMS Keys please see: <https://cloud.google.com/compute/docs/disks/customer-managed-encryption>
     * 
     */
    @Import(name="bootDiskKmsKey")
      private final @Nullable Output<String> bootDiskKmsKey;

    public Output<String> bootDiskKmsKey() {
        return this.bootDiskKmsKey == null ? Codegen.empty() : this.bootDiskKmsKey;
    }

    /**
     * Size of the disk attached to each node, specified
     * in GB. The smallest allowed disk size is 10GB. Defaults to 100GB.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<Integer> diskSizeGb;

    public Output<Integer> diskSizeGb() {
        return this.diskSizeGb == null ? Codegen.empty() : this.diskSizeGb;
    }

    /**
     * Type of the disk attached to each node
     * (e.g. 'pd-standard', 'pd-balanced' or 'pd-ssd'). If unspecified, the default disk type is 'pd-standard'
     * 
     */
    @Import(name="diskType")
      private final @Nullable Output<String> diskType;

    public Output<String> diskType() {
        return this.diskType == null ? Codegen.empty() : this.diskType;
    }

    /**
     * Parameters for the ephemeral storage filesystem. If unspecified, ephemeral storage is backed by the boot disk. Structure is documented below.
     * 
     */
    @Import(name="ephemeralStorageConfig")
      private final @Nullable Output<ClusterNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig;

    public Output<ClusterNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig() {
        return this.ephemeralStorageConfig == null ? Codegen.empty() : this.ephemeralStorageConfig;
    }

    /**
     * Parameters for the Google Container Filesystem (GCFS).
     * If unspecified, GCFS will not be enabled on the node pool. When enabling this feature you must specify `image_type = "COS_CONTAINERD"` and `node_version` from GKE versions 1.19 or later to use it.
     * For GKE versions 1.19, 1.20, and 1.21, the recommended minimum `node_version` would be 1.19.15-gke.1300, 1.20.11-gke.1300, and 1.21.5-gke.1300 respectively.
     * A `machine_type` that has more than 16 GiB of memory is also recommended.
     * GCFS must be enabled in order to use [image streaming](https://cloud.google.com/kubernetes-engine/docs/how-to/image-streaming).
     * Structure is documented below.
     * 
     */
    @Import(name="gcfsConfig")
      private final @Nullable Output<ClusterNodeConfigGcfsConfigArgs> gcfsConfig;

    public Output<ClusterNodeConfigGcfsConfigArgs> gcfsConfig() {
        return this.gcfsConfig == null ? Codegen.empty() : this.gcfsConfig;
    }

    /**
     * List of the type and count of accelerator cards attached to the instance.
     * Structure documented below.
     * 
     */
    @Import(name="guestAccelerators")
      private final @Nullable Output<List<ClusterNodeConfigGuestAcceleratorArgs>> guestAccelerators;

    public Output<List<ClusterNodeConfigGuestAcceleratorArgs>> guestAccelerators() {
        return this.guestAccelerators == null ? Codegen.empty() : this.guestAccelerators;
    }

    /**
     * The image type to use for this node. Note that changing the image type
     * will delete and recreate all nodes in the node pool.
     * 
     */
    @Import(name="imageType")
      private final @Nullable Output<String> imageType;

    public Output<String> imageType() {
        return this.imageType == null ? Codegen.empty() : this.imageType;
    }

    /**
     * Kubelet configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     * Structure is documented below.
     * 
     */
    @Import(name="kubeletConfig")
      private final @Nullable Output<ClusterNodeConfigKubeletConfigArgs> kubeletConfig;

    public Output<ClusterNodeConfigKubeletConfigArgs> kubeletConfig() {
        return this.kubeletConfig == null ? Codegen.empty() : this.kubeletConfig;
    }

    /**
     * The Kubernetes labels (key/value pairs) to be applied to each node. The kubernetes.io/ and k8s.io/ prefixes are
     * reserved by Kubernetes Core components and cannot be specified.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Linux node configuration, currently supported attributes can be found [here](https://cloud.google.com/sdk/gcloud/reference/beta/container/node-pools/create#--system-config-from-file).
     * Note that validations happen all server side. All attributes are optional.
     * Structure is documented below.
     * 
     */
    @Import(name="linuxNodeConfig")
      private final @Nullable Output<ClusterNodeConfigLinuxNodeConfigArgs> linuxNodeConfig;

    public Output<ClusterNodeConfigLinuxNodeConfigArgs> linuxNodeConfig() {
        return this.linuxNodeConfig == null ? Codegen.empty() : this.linuxNodeConfig;
    }

    /**
     * Number of local SSDs to use to back ephemeral storage. Uses NVMe interfaces. Each local SSD is 375 GB in size. If zero, it means to disable using local SSDs as ephemeral storage.
     * 
     */
    @Import(name="localSsdCount")
      private final @Nullable Output<Integer> localSsdCount;

    public Output<Integer> localSsdCount() {
        return this.localSsdCount == null ? Codegen.empty() : this.localSsdCount;
    }

    /**
     * The name of a Google Compute Engine machine type.
     * Defaults to `e2-medium`. To create a custom machine type, value should be set as specified
     * [here](https://cloud.google.com/compute/docs/reference/latest/instances#machineType).
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> machineType() {
        return this.machineType == null ? Codegen.empty() : this.machineType;
    }

    /**
     * The metadata key/value pairs assigned to instances in
     * the cluster. From GKE `1.12` onwards, `disable-legacy-endpoints` is set to
     * `true` by the API; if `metadata` is set but that default value is not
     * included, the provider will attempt to unset the value. To avoid this, set the
     * value in your config.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Minimum CPU platform to be used by this instance.
     * The instance may be scheduled on the specified or newer CPU platform. Applicable
     * values are the friendly names of CPU platforms, such as `Intel Haswell`. See the
     * [official documentation](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for more information.
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform == null ? Codegen.empty() : this.minCpuPlatform;
    }

    /**
     * Setting this field will assign instances of this pool to run on the specified node group. This is useful for running workloads on [sole tenant nodes](https://cloud.google.com/compute/docs/nodes/sole-tenant-nodes).
     * 
     */
    @Import(name="nodeGroup")
      private final @Nullable Output<String> nodeGroup;

    public Output<String> nodeGroup() {
        return this.nodeGroup == null ? Codegen.empty() : this.nodeGroup;
    }

    /**
     * The set of Google API scopes to be made available
     * on all of the node VMs under the "default" service account.
     * Use the "https://www.googleapis.com/auth/cloud-platform" scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
     * 
     */
    @Import(name="oauthScopes")
      private final @Nullable Output<List<String>> oauthScopes;

    public Output<List<String>> oauthScopes() {
        return this.oauthScopes == null ? Codegen.empty() : this.oauthScopes;
    }

    /**
     * A boolean that represents whether or not the underlying node VMs
     * are preemptible. See the [official documentation](https://cloud.google.com/container-engine/docs/preemptible-vm)
     * for more information. Defaults to false.
     * 
     */
    @Import(name="preemptible")
      private final @Nullable Output<Boolean> preemptible;

    public Output<Boolean> preemptible() {
        return this.preemptible == null ? Codegen.empty() : this.preemptible;
    }

    /**
     * [GKE Sandbox](https://cloud.google.com/kubernetes-engine/docs/how-to/sandbox-pods) configuration. When enabling this feature you must specify `image_type = "COS_CONTAINERD"` and `node_version = "1.12.7-gke.17"` or later to use it.
     * Structure is documented below.
     * 
     */
    @Import(name="sandboxConfig")
      private final @Nullable Output<ClusterNodeConfigSandboxConfigArgs> sandboxConfig;

    public Output<ClusterNodeConfigSandboxConfigArgs> sandboxConfig() {
        return this.sandboxConfig == null ? Codegen.empty() : this.sandboxConfig;
    }

    /**
     * The service account to be used by the Node VMs.
     * If not specified, the "default" service account is used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> serviceAccount() {
        return this.serviceAccount == null ? Codegen.empty() : this.serviceAccount;
    }

    /**
     * Shielded Instance options. Structure is documented below.
     * 
     */
    @Import(name="shieldedInstanceConfig")
      private final @Nullable Output<ClusterNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Output<ClusterNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Codegen.empty() : this.shieldedInstanceConfig;
    }

    /**
     * ) A boolean
     * that represents whether the underlying node VMs are spot. See the [official documentation](https://cloud.google.com/kubernetes-engine/docs/concepts/spot-vms)
     * for more information. Defaults to false.
     * 
     */
    @Import(name="spot")
      private final @Nullable Output<Boolean> spot;

    public Output<Boolean> spot() {
        return this.spot == null ? Codegen.empty() : this.spot;
    }

    /**
     * The list of instance tags applied to all nodes. Tags are used to identify
     * valid sources or targets for network firewalls.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A list of [Kubernetes taints](https://kubernetes.io/docs/concepts/configuration/taint-and-toleration/)
     * to apply to nodes. GKE's API can only set this field on cluster creation.
     * However, GKE will add taints to your nodes if you enable certain features such
     * as GPUs. If this field is set, any diffs on this field will cause the provider to
     * recreate the underlying resource. Taint values can be updated safely in
     * Kubernetes (eg. through `kubectl`), and it's recommended that you do not use
     * this field to manage taints. If you do, `lifecycle.ignore_changes` is
     * recommended. Structure is documented below.
     * 
     */
    @Import(name="taints")
      private final @Nullable Output<List<ClusterNodeConfigTaintArgs>> taints;

    public Output<List<ClusterNodeConfigTaintArgs>> taints() {
        return this.taints == null ? Codegen.empty() : this.taints;
    }

    /**
     * Metadata configuration to expose to workloads on the node pool.
     * Structure is documented below.
     * 
     */
    @Import(name="workloadMetadataConfig")
      private final @Nullable Output<ClusterNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig;

    public Output<ClusterNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig() {
        return this.workloadMetadataConfig == null ? Codegen.empty() : this.workloadMetadataConfig;
    }

    public ClusterNodeConfigArgs(
        @Nullable Output<String> bootDiskKmsKey,
        @Nullable Output<Integer> diskSizeGb,
        @Nullable Output<String> diskType,
        @Nullable Output<ClusterNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig,
        @Nullable Output<ClusterNodeConfigGcfsConfigArgs> gcfsConfig,
        @Nullable Output<List<ClusterNodeConfigGuestAcceleratorArgs>> guestAccelerators,
        @Nullable Output<String> imageType,
        @Nullable Output<ClusterNodeConfigKubeletConfigArgs> kubeletConfig,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<ClusterNodeConfigLinuxNodeConfigArgs> linuxNodeConfig,
        @Nullable Output<Integer> localSsdCount,
        @Nullable Output<String> machineType,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<String> nodeGroup,
        @Nullable Output<List<String>> oauthScopes,
        @Nullable Output<Boolean> preemptible,
        @Nullable Output<ClusterNodeConfigSandboxConfigArgs> sandboxConfig,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<ClusterNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Output<Boolean> spot,
        @Nullable Output<List<String>> tags,
        @Nullable Output<List<ClusterNodeConfigTaintArgs>> taints,
        @Nullable Output<ClusterNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig) {
        this.bootDiskKmsKey = bootDiskKmsKey;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.ephemeralStorageConfig = ephemeralStorageConfig;
        this.gcfsConfig = gcfsConfig;
        this.guestAccelerators = guestAccelerators;
        this.imageType = imageType;
        this.kubeletConfig = kubeletConfig;
        this.labels = labels;
        this.linuxNodeConfig = linuxNodeConfig;
        this.localSsdCount = localSsdCount;
        this.machineType = machineType;
        this.metadata = metadata;
        this.minCpuPlatform = minCpuPlatform;
        this.nodeGroup = nodeGroup;
        this.oauthScopes = oauthScopes;
        this.preemptible = preemptible;
        this.sandboxConfig = sandboxConfig;
        this.serviceAccount = serviceAccount;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.spot = spot;
        this.tags = tags;
        this.taints = taints;
        this.workloadMetadataConfig = workloadMetadataConfig;
    }

    private ClusterNodeConfigArgs() {
        this.bootDiskKmsKey = Codegen.empty();
        this.diskSizeGb = Codegen.empty();
        this.diskType = Codegen.empty();
        this.ephemeralStorageConfig = Codegen.empty();
        this.gcfsConfig = Codegen.empty();
        this.guestAccelerators = Codegen.empty();
        this.imageType = Codegen.empty();
        this.kubeletConfig = Codegen.empty();
        this.labels = Codegen.empty();
        this.linuxNodeConfig = Codegen.empty();
        this.localSsdCount = Codegen.empty();
        this.machineType = Codegen.empty();
        this.metadata = Codegen.empty();
        this.minCpuPlatform = Codegen.empty();
        this.nodeGroup = Codegen.empty();
        this.oauthScopes = Codegen.empty();
        this.preemptible = Codegen.empty();
        this.sandboxConfig = Codegen.empty();
        this.serviceAccount = Codegen.empty();
        this.shieldedInstanceConfig = Codegen.empty();
        this.spot = Codegen.empty();
        this.tags = Codegen.empty();
        this.taints = Codegen.empty();
        this.workloadMetadataConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bootDiskKmsKey;
        private @Nullable Output<Integer> diskSizeGb;
        private @Nullable Output<String> diskType;
        private @Nullable Output<ClusterNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig;
        private @Nullable Output<ClusterNodeConfigGcfsConfigArgs> gcfsConfig;
        private @Nullable Output<List<ClusterNodeConfigGuestAcceleratorArgs>> guestAccelerators;
        private @Nullable Output<String> imageType;
        private @Nullable Output<ClusterNodeConfigKubeletConfigArgs> kubeletConfig;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<ClusterNodeConfigLinuxNodeConfigArgs> linuxNodeConfig;
        private @Nullable Output<Integer> localSsdCount;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<String> nodeGroup;
        private @Nullable Output<List<String>> oauthScopes;
        private @Nullable Output<Boolean> preemptible;
        private @Nullable Output<ClusterNodeConfigSandboxConfigArgs> sandboxConfig;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<ClusterNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Output<Boolean> spot;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<List<ClusterNodeConfigTaintArgs>> taints;
        private @Nullable Output<ClusterNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskKmsKey = defaults.bootDiskKmsKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.ephemeralStorageConfig = defaults.ephemeralStorageConfig;
    	      this.gcfsConfig = defaults.gcfsConfig;
    	      this.guestAccelerators = defaults.guestAccelerators;
    	      this.imageType = defaults.imageType;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.labels = defaults.labels;
    	      this.linuxNodeConfig = defaults.linuxNodeConfig;
    	      this.localSsdCount = defaults.localSsdCount;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.nodeGroup = defaults.nodeGroup;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.preemptible = defaults.preemptible;
    	      this.sandboxConfig = defaults.sandboxConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.spot = defaults.spot;
    	      this.tags = defaults.tags;
    	      this.taints = defaults.taints;
    	      this.workloadMetadataConfig = defaults.workloadMetadataConfig;
        }

        public Builder bootDiskKmsKey(@Nullable Output<String> bootDiskKmsKey) {
            this.bootDiskKmsKey = bootDiskKmsKey;
            return this;
        }
        public Builder bootDiskKmsKey(@Nullable String bootDiskKmsKey) {
            this.bootDiskKmsKey = Codegen.ofNullable(bootDiskKmsKey);
            return this;
        }
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Codegen.ofNullable(diskSizeGb);
            return this;
        }
        public Builder diskType(@Nullable Output<String> diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = Codegen.ofNullable(diskType);
            return this;
        }
        public Builder ephemeralStorageConfig(@Nullable Output<ClusterNodeConfigEphemeralStorageConfigArgs> ephemeralStorageConfig) {
            this.ephemeralStorageConfig = ephemeralStorageConfig;
            return this;
        }
        public Builder ephemeralStorageConfig(@Nullable ClusterNodeConfigEphemeralStorageConfigArgs ephemeralStorageConfig) {
            this.ephemeralStorageConfig = Codegen.ofNullable(ephemeralStorageConfig);
            return this;
        }
        public Builder gcfsConfig(@Nullable Output<ClusterNodeConfigGcfsConfigArgs> gcfsConfig) {
            this.gcfsConfig = gcfsConfig;
            return this;
        }
        public Builder gcfsConfig(@Nullable ClusterNodeConfigGcfsConfigArgs gcfsConfig) {
            this.gcfsConfig = Codegen.ofNullable(gcfsConfig);
            return this;
        }
        public Builder guestAccelerators(@Nullable Output<List<ClusterNodeConfigGuestAcceleratorArgs>> guestAccelerators) {
            this.guestAccelerators = guestAccelerators;
            return this;
        }
        public Builder guestAccelerators(@Nullable List<ClusterNodeConfigGuestAcceleratorArgs> guestAccelerators) {
            this.guestAccelerators = Codegen.ofNullable(guestAccelerators);
            return this;
        }
        public Builder guestAccelerators(ClusterNodeConfigGuestAcceleratorArgs... guestAccelerators) {
            return guestAccelerators(List.of(guestAccelerators));
        }
        public Builder imageType(@Nullable Output<String> imageType) {
            this.imageType = imageType;
            return this;
        }
        public Builder imageType(@Nullable String imageType) {
            this.imageType = Codegen.ofNullable(imageType);
            return this;
        }
        public Builder kubeletConfig(@Nullable Output<ClusterNodeConfigKubeletConfigArgs> kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }
        public Builder kubeletConfig(@Nullable ClusterNodeConfigKubeletConfigArgs kubeletConfig) {
            this.kubeletConfig = Codegen.ofNullable(kubeletConfig);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder linuxNodeConfig(@Nullable Output<ClusterNodeConfigLinuxNodeConfigArgs> linuxNodeConfig) {
            this.linuxNodeConfig = linuxNodeConfig;
            return this;
        }
        public Builder linuxNodeConfig(@Nullable ClusterNodeConfigLinuxNodeConfigArgs linuxNodeConfig) {
            this.linuxNodeConfig = Codegen.ofNullable(linuxNodeConfig);
            return this;
        }
        public Builder localSsdCount(@Nullable Output<Integer> localSsdCount) {
            this.localSsdCount = localSsdCount;
            return this;
        }
        public Builder localSsdCount(@Nullable Integer localSsdCount) {
            this.localSsdCount = Codegen.ofNullable(localSsdCount);
            return this;
        }
        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }
        public Builder machineType(@Nullable String machineType) {
            this.machineType = Codegen.ofNullable(machineType);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Codegen.ofNullable(minCpuPlatform);
            return this;
        }
        public Builder nodeGroup(@Nullable Output<String> nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }
        public Builder nodeGroup(@Nullable String nodeGroup) {
            this.nodeGroup = Codegen.ofNullable(nodeGroup);
            return this;
        }
        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }
        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = Codegen.ofNullable(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = Codegen.ofNullable(preemptible);
            return this;
        }
        public Builder sandboxConfig(@Nullable Output<ClusterNodeConfigSandboxConfigArgs> sandboxConfig) {
            this.sandboxConfig = sandboxConfig;
            return this;
        }
        public Builder sandboxConfig(@Nullable ClusterNodeConfigSandboxConfigArgs sandboxConfig) {
            this.sandboxConfig = Codegen.ofNullable(sandboxConfig);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Codegen.ofNullable(serviceAccount);
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable Output<ClusterNodeConfigShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable ClusterNodeConfigShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Codegen.ofNullable(shieldedInstanceConfig);
            return this;
        }
        public Builder spot(@Nullable Output<Boolean> spot) {
            this.spot = spot;
            return this;
        }
        public Builder spot(@Nullable Boolean spot) {
            this.spot = Codegen.ofNullable(spot);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder taints(@Nullable Output<List<ClusterNodeConfigTaintArgs>> taints) {
            this.taints = taints;
            return this;
        }
        public Builder taints(@Nullable List<ClusterNodeConfigTaintArgs> taints) {
            this.taints = Codegen.ofNullable(taints);
            return this;
        }
        public Builder taints(ClusterNodeConfigTaintArgs... taints) {
            return taints(List.of(taints));
        }
        public Builder workloadMetadataConfig(@Nullable Output<ClusterNodeConfigWorkloadMetadataConfigArgs> workloadMetadataConfig) {
            this.workloadMetadataConfig = workloadMetadataConfig;
            return this;
        }
        public Builder workloadMetadataConfig(@Nullable ClusterNodeConfigWorkloadMetadataConfigArgs workloadMetadataConfig) {
            this.workloadMetadataConfig = Codegen.ofNullable(workloadMetadataConfig);
            return this;
        }        public ClusterNodeConfigArgs build() {
            return new ClusterNodeConfigArgs(bootDiskKmsKey, diskSizeGb, diskType, ephemeralStorageConfig, gcfsConfig, guestAccelerators, imageType, kubeletConfig, labels, linuxNodeConfig, localSsdCount, machineType, metadata, minCpuPlatform, nodeGroup, oauthScopes, preemptible, sandboxConfig, serviceAccount, shieldedInstanceConfig, spot, tags, taints, workloadMetadataConfig);
        }
    }
}
