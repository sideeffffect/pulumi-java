// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigDatabaseConfig;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigEncryptionConfig;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigMaintenanceWindow;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigMasterAuthorizedNetworksConfig;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigNodeConfig;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigPrivateEnvironmentConfig;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigSoftwareConfig;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigWebServerConfig;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigWebServerNetworkAccessControl;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetEnvironmentConfig {
    private final String airflowUri;
    private final String dagGcsPrefix;
    private final List<GetEnvironmentConfigDatabaseConfig> databaseConfigs;
    private final List<GetEnvironmentConfigEncryptionConfig> encryptionConfigs;
    private final String environmentSize;
    private final String gkeCluster;
    private final List<GetEnvironmentConfigMaintenanceWindow> maintenanceWindows;
    private final List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfigs;
    private final List<GetEnvironmentConfigNodeConfig> nodeConfigs;
    private final Integer nodeCount;
    private final List<GetEnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfigs;
    private final List<GetEnvironmentConfigSoftwareConfig> softwareConfigs;
    private final List<GetEnvironmentConfigWebServerConfig> webServerConfigs;
    private final List<GetEnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControls;
    private final List<GetEnvironmentConfigWorkloadsConfig> workloadsConfigs;

    @OutputCustomType.Constructor
    private GetEnvironmentConfig(
        @OutputCustomType.Parameter("airflowUri") String airflowUri,
        @OutputCustomType.Parameter("dagGcsPrefix") String dagGcsPrefix,
        @OutputCustomType.Parameter("databaseConfigs") List<GetEnvironmentConfigDatabaseConfig> databaseConfigs,
        @OutputCustomType.Parameter("encryptionConfigs") List<GetEnvironmentConfigEncryptionConfig> encryptionConfigs,
        @OutputCustomType.Parameter("environmentSize") String environmentSize,
        @OutputCustomType.Parameter("gkeCluster") String gkeCluster,
        @OutputCustomType.Parameter("maintenanceWindows") List<GetEnvironmentConfigMaintenanceWindow> maintenanceWindows,
        @OutputCustomType.Parameter("masterAuthorizedNetworksConfigs") List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfigs,
        @OutputCustomType.Parameter("nodeConfigs") List<GetEnvironmentConfigNodeConfig> nodeConfigs,
        @OutputCustomType.Parameter("nodeCount") Integer nodeCount,
        @OutputCustomType.Parameter("privateEnvironmentConfigs") List<GetEnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfigs,
        @OutputCustomType.Parameter("softwareConfigs") List<GetEnvironmentConfigSoftwareConfig> softwareConfigs,
        @OutputCustomType.Parameter("webServerConfigs") List<GetEnvironmentConfigWebServerConfig> webServerConfigs,
        @OutputCustomType.Parameter("webServerNetworkAccessControls") List<GetEnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControls,
        @OutputCustomType.Parameter("workloadsConfigs") List<GetEnvironmentConfigWorkloadsConfig> workloadsConfigs) {
        this.airflowUri = airflowUri;
        this.dagGcsPrefix = dagGcsPrefix;
        this.databaseConfigs = databaseConfigs;
        this.encryptionConfigs = encryptionConfigs;
        this.environmentSize = environmentSize;
        this.gkeCluster = gkeCluster;
        this.maintenanceWindows = maintenanceWindows;
        this.masterAuthorizedNetworksConfigs = masterAuthorizedNetworksConfigs;
        this.nodeConfigs = nodeConfigs;
        this.nodeCount = nodeCount;
        this.privateEnvironmentConfigs = privateEnvironmentConfigs;
        this.softwareConfigs = softwareConfigs;
        this.webServerConfigs = webServerConfigs;
        this.webServerNetworkAccessControls = webServerNetworkAccessControls;
        this.workloadsConfigs = workloadsConfigs;
    }

    public String getAirflowUri() {
        return this.airflowUri;
    }
    public String getDagGcsPrefix() {
        return this.dagGcsPrefix;
    }
    public List<GetEnvironmentConfigDatabaseConfig> getDatabaseConfigs() {
        return this.databaseConfigs;
    }
    public List<GetEnvironmentConfigEncryptionConfig> getEncryptionConfigs() {
        return this.encryptionConfigs;
    }
    public String getEnvironmentSize() {
        return this.environmentSize;
    }
    public String getGkeCluster() {
        return this.gkeCluster;
    }
    public List<GetEnvironmentConfigMaintenanceWindow> getMaintenanceWindows() {
        return this.maintenanceWindows;
    }
    public List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> getMasterAuthorizedNetworksConfigs() {
        return this.masterAuthorizedNetworksConfigs;
    }
    public List<GetEnvironmentConfigNodeConfig> getNodeConfigs() {
        return this.nodeConfigs;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }
    public List<GetEnvironmentConfigPrivateEnvironmentConfig> getPrivateEnvironmentConfigs() {
        return this.privateEnvironmentConfigs;
    }
    public List<GetEnvironmentConfigSoftwareConfig> getSoftwareConfigs() {
        return this.softwareConfigs;
    }
    public List<GetEnvironmentConfigWebServerConfig> getWebServerConfigs() {
        return this.webServerConfigs;
    }
    public List<GetEnvironmentConfigWebServerNetworkAccessControl> getWebServerNetworkAccessControls() {
        return this.webServerNetworkAccessControls;
    }
    public List<GetEnvironmentConfigWorkloadsConfig> getWorkloadsConfigs() {
        return this.workloadsConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String airflowUri;
        private String dagGcsPrefix;
        private List<GetEnvironmentConfigDatabaseConfig> databaseConfigs;
        private List<GetEnvironmentConfigEncryptionConfig> encryptionConfigs;
        private String environmentSize;
        private String gkeCluster;
        private List<GetEnvironmentConfigMaintenanceWindow> maintenanceWindows;
        private List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfigs;
        private List<GetEnvironmentConfigNodeConfig> nodeConfigs;
        private Integer nodeCount;
        private List<GetEnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfigs;
        private List<GetEnvironmentConfigSoftwareConfig> softwareConfigs;
        private List<GetEnvironmentConfigWebServerConfig> webServerConfigs;
        private List<GetEnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControls;
        private List<GetEnvironmentConfigWorkloadsConfig> workloadsConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowUri = defaults.airflowUri;
    	      this.dagGcsPrefix = defaults.dagGcsPrefix;
    	      this.databaseConfigs = defaults.databaseConfigs;
    	      this.encryptionConfigs = defaults.encryptionConfigs;
    	      this.environmentSize = defaults.environmentSize;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.masterAuthorizedNetworksConfigs = defaults.masterAuthorizedNetworksConfigs;
    	      this.nodeConfigs = defaults.nodeConfigs;
    	      this.nodeCount = defaults.nodeCount;
    	      this.privateEnvironmentConfigs = defaults.privateEnvironmentConfigs;
    	      this.softwareConfigs = defaults.softwareConfigs;
    	      this.webServerConfigs = defaults.webServerConfigs;
    	      this.webServerNetworkAccessControls = defaults.webServerNetworkAccessControls;
    	      this.workloadsConfigs = defaults.workloadsConfigs;
        }

        public Builder airflowUri(String airflowUri) {
            this.airflowUri = Objects.requireNonNull(airflowUri);
            return this;
        }

        public Builder dagGcsPrefix(String dagGcsPrefix) {
            this.dagGcsPrefix = Objects.requireNonNull(dagGcsPrefix);
            return this;
        }

        public Builder databaseConfigs(List<GetEnvironmentConfigDatabaseConfig> databaseConfigs) {
            this.databaseConfigs = Objects.requireNonNull(databaseConfigs);
            return this;
        }

        public Builder encryptionConfigs(List<GetEnvironmentConfigEncryptionConfig> encryptionConfigs) {
            this.encryptionConfigs = Objects.requireNonNull(encryptionConfigs);
            return this;
        }

        public Builder environmentSize(String environmentSize) {
            this.environmentSize = Objects.requireNonNull(environmentSize);
            return this;
        }

        public Builder gkeCluster(String gkeCluster) {
            this.gkeCluster = Objects.requireNonNull(gkeCluster);
            return this;
        }

        public Builder maintenanceWindows(List<GetEnvironmentConfigMaintenanceWindow> maintenanceWindows) {
            this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows);
            return this;
        }

        public Builder masterAuthorizedNetworksConfigs(List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfigs) {
            this.masterAuthorizedNetworksConfigs = Objects.requireNonNull(masterAuthorizedNetworksConfigs);
            return this;
        }

        public Builder nodeConfigs(List<GetEnvironmentConfigNodeConfig> nodeConfigs) {
            this.nodeConfigs = Objects.requireNonNull(nodeConfigs);
            return this;
        }

        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }

        public Builder privateEnvironmentConfigs(List<GetEnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfigs) {
            this.privateEnvironmentConfigs = Objects.requireNonNull(privateEnvironmentConfigs);
            return this;
        }

        public Builder softwareConfigs(List<GetEnvironmentConfigSoftwareConfig> softwareConfigs) {
            this.softwareConfigs = Objects.requireNonNull(softwareConfigs);
            return this;
        }

        public Builder webServerConfigs(List<GetEnvironmentConfigWebServerConfig> webServerConfigs) {
            this.webServerConfigs = Objects.requireNonNull(webServerConfigs);
            return this;
        }

        public Builder webServerNetworkAccessControls(List<GetEnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControls) {
            this.webServerNetworkAccessControls = Objects.requireNonNull(webServerNetworkAccessControls);
            return this;
        }

        public Builder workloadsConfigs(List<GetEnvironmentConfigWorkloadsConfig> workloadsConfigs) {
            this.workloadsConfigs = Objects.requireNonNull(workloadsConfigs);
            return this;
        }
        public GetEnvironmentConfig build() {
            return new GetEnvironmentConfig(airflowUri, dagGcsPrefix, databaseConfigs, encryptionConfigs, environmentSize, gkeCluster, maintenanceWindows, masterAuthorizedNetworksConfigs, nodeConfigs, nodeCount, privateEnvironmentConfigs, softwareConfigs, webServerConfigs, webServerNetworkAccessControls, workloadsConfigs);
        }
    }
}
