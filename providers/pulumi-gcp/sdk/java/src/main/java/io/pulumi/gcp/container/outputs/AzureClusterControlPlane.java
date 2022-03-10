// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.container.outputs.AzureClusterControlPlaneDatabaseEncryption;
import io.pulumi.gcp.container.outputs.AzureClusterControlPlaneMainVolume;
import io.pulumi.gcp.container.outputs.AzureClusterControlPlaneProxyConfig;
import io.pulumi.gcp.container.outputs.AzureClusterControlPlaneReplicaPlacement;
import io.pulumi.gcp.container.outputs.AzureClusterControlPlaneRootVolume;
import io.pulumi.gcp.container.outputs.AzureClusterControlPlaneSshConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureClusterControlPlane {
    /**
     * Optional. Configuration related to application-layer secrets encryption.
     * 
     */
    private final @Nullable AzureClusterControlPlaneDatabaseEncryption databaseEncryption;
    /**
     * Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster's etcd state. When unspecified, it defaults to a 8-GiB Azure Disk.
     * 
     */
    private final @Nullable AzureClusterControlPlaneMainVolume mainVolume;
    /**
     * Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    private final @Nullable AzureClusterControlPlaneProxyConfig proxyConfig;
    /**
     * Configuration for where to place the control plane replicas. Up to three replica placement instances can be specified. If replica_placements is set, the replica placement instances will be applied to the three control plane replicas as evenly as possible.
     * 
     */
    private final @Nullable List<AzureClusterControlPlaneReplicaPlacement> replicaPlacements;
    /**
     * Optional. Configuration related to the root volume provisioned for each control plane replica. When unspecified, it defaults to 32-GiB Azure Disk.
     * 
     */
    private final @Nullable AzureClusterControlPlaneRootVolume rootVolume;
    /**
     * Required. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    private final AzureClusterControlPlaneSshConfig sshConfig;
    /**
     * For a given replica, the ARM ID of the subnet where the control plane VM is deployed. Make sure it's a subnet under the virtual network in the cluster configuration.
     * 
     */
    private final String subnetId;
    /**
     * Optional. A set of tags to apply to all underlying control plane Azure resources.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling GetAzureServerConfig.
     * 
     */
    private final String version;
    /**
     * Optional. The Azure VM size name. Example: `Standard_DS2_v2`. For available VM sizes, see https://docs.microsoft.com/en-us/azure/virtual-machines/vm-naming-conventions. When unspecified, it defaults to `Standard_DS2_v2`.
     * 
     */
    private final @Nullable String vmSize;

    @OutputCustomType.Constructor
    private AzureClusterControlPlane(
        @OutputCustomType.Parameter("databaseEncryption") @Nullable AzureClusterControlPlaneDatabaseEncryption databaseEncryption,
        @OutputCustomType.Parameter("mainVolume") @Nullable AzureClusterControlPlaneMainVolume mainVolume,
        @OutputCustomType.Parameter("proxyConfig") @Nullable AzureClusterControlPlaneProxyConfig proxyConfig,
        @OutputCustomType.Parameter("replicaPlacements") @Nullable List<AzureClusterControlPlaneReplicaPlacement> replicaPlacements,
        @OutputCustomType.Parameter("rootVolume") @Nullable AzureClusterControlPlaneRootVolume rootVolume,
        @OutputCustomType.Parameter("sshConfig") AzureClusterControlPlaneSshConfig sshConfig,
        @OutputCustomType.Parameter("subnetId") String subnetId,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("version") String version,
        @OutputCustomType.Parameter("vmSize") @Nullable String vmSize) {
        this.databaseEncryption = databaseEncryption;
        this.mainVolume = mainVolume;
        this.proxyConfig = proxyConfig;
        this.replicaPlacements = replicaPlacements;
        this.rootVolume = rootVolume;
        this.sshConfig = sshConfig;
        this.subnetId = subnetId;
        this.tags = tags;
        this.version = version;
        this.vmSize = vmSize;
    }

    /**
     * Optional. Configuration related to application-layer secrets encryption.
     * 
    */
    public Optional<AzureClusterControlPlaneDatabaseEncryption> getDatabaseEncryption() {
        return Optional.ofNullable(this.databaseEncryption);
    }
    /**
     * Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster's etcd state. When unspecified, it defaults to a 8-GiB Azure Disk.
     * 
    */
    public Optional<AzureClusterControlPlaneMainVolume> getMainVolume() {
        return Optional.ofNullable(this.mainVolume);
    }
    /**
     * Proxy configuration for outbound HTTP(S) traffic.
     * 
    */
    public Optional<AzureClusterControlPlaneProxyConfig> getProxyConfig() {
        return Optional.ofNullable(this.proxyConfig);
    }
    /**
     * Configuration for where to place the control plane replicas. Up to three replica placement instances can be specified. If replica_placements is set, the replica placement instances will be applied to the three control plane replicas as evenly as possible.
     * 
    */
    public List<AzureClusterControlPlaneReplicaPlacement> getReplicaPlacements() {
        return this.replicaPlacements == null ? List.of() : this.replicaPlacements;
    }
    /**
     * Optional. Configuration related to the root volume provisioned for each control plane replica. When unspecified, it defaults to 32-GiB Azure Disk.
     * 
    */
    public Optional<AzureClusterControlPlaneRootVolume> getRootVolume() {
        return Optional.ofNullable(this.rootVolume);
    }
    /**
     * Required. SSH configuration for how to access the underlying control plane machines.
     * 
    */
    public AzureClusterControlPlaneSshConfig getSshConfig() {
        return this.sshConfig;
    }
    /**
     * For a given replica, the ARM ID of the subnet where the control plane VM is deployed. Make sure it's a subnet under the virtual network in the cluster configuration.
     * 
    */
    public String getSubnetId() {
        return this.subnetId;
    }
    /**
     * Optional. A set of tags to apply to all underlying control plane Azure resources.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Required. The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling GetAzureServerConfig.
     * 
    */
    public String getVersion() {
        return this.version;
    }
    /**
     * Optional. The Azure VM size name. Example: `Standard_DS2_v2`. For available VM sizes, see https://docs.microsoft.com/en-us/azure/virtual-machines/vm-naming-conventions. When unspecified, it defaults to `Standard_DS2_v2`.
     * 
    */
    public Optional<String> getVmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlane defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureClusterControlPlaneDatabaseEncryption databaseEncryption;
        private @Nullable AzureClusterControlPlaneMainVolume mainVolume;
        private @Nullable AzureClusterControlPlaneProxyConfig proxyConfig;
        private @Nullable List<AzureClusterControlPlaneReplicaPlacement> replicaPlacements;
        private @Nullable AzureClusterControlPlaneRootVolume rootVolume;
        private AzureClusterControlPlaneSshConfig sshConfig;
        private String subnetId;
        private @Nullable Map<String,String> tags;
        private String version;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlane defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseEncryption = defaults.databaseEncryption;
    	      this.mainVolume = defaults.mainVolume;
    	      this.proxyConfig = defaults.proxyConfig;
    	      this.replicaPlacements = defaults.replicaPlacements;
    	      this.rootVolume = defaults.rootVolume;
    	      this.sshConfig = defaults.sshConfig;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder databaseEncryption(@Nullable AzureClusterControlPlaneDatabaseEncryption databaseEncryption) {
            this.databaseEncryption = databaseEncryption;
            return this;
        }

        public Builder mainVolume(@Nullable AzureClusterControlPlaneMainVolume mainVolume) {
            this.mainVolume = mainVolume;
            return this;
        }

        public Builder proxyConfig(@Nullable AzureClusterControlPlaneProxyConfig proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }

        public Builder replicaPlacements(@Nullable List<AzureClusterControlPlaneReplicaPlacement> replicaPlacements) {
            this.replicaPlacements = replicaPlacements;
            return this;
        }

        public Builder rootVolume(@Nullable AzureClusterControlPlaneRootVolume rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }

        public Builder sshConfig(AzureClusterControlPlaneSshConfig sshConfig) {
            this.sshConfig = Objects.requireNonNull(sshConfig);
            return this;
        }

        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }
        public AzureClusterControlPlane build() {
            return new AzureClusterControlPlane(databaseEncryption, mainVolume, proxyConfig, replicaPlacements, rootVolume, sshConfig, subnetId, tags, version, vmSize);
        }
    }
}
