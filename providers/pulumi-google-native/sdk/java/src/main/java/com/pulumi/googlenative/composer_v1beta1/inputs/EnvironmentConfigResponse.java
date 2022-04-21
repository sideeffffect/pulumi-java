// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.composer_v1beta1.inputs.DatabaseConfigResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.EncryptionConfigResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.MaintenanceWindowResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.MasterAuthorizedNetworksConfigResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.NodeConfigResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.PrivateEnvironmentConfigResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.SoftwareConfigResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.WebServerConfigResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.WebServerNetworkAccessControlResponse;
import com.pulumi.googlenative.composer_v1beta1.inputs.WorkloadsConfigResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration information for an environment.
 * 
 */
public final class EnvironmentConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentConfigResponse Empty = new EnvironmentConfigResponse();

    /**
     * The URI of the Apache Airflow Web UI hosted within this environment (see [Airflow web interface](/composer/docs/how-to/accessing/airflow-web-interface)).
     * 
     */
    @Import(name="airflowUri", required=true)
    private String airflowUri;

    public String airflowUri() {
        return this.airflowUri;
    }

    /**
     * The Cloud Storage prefix of the DAGs for this environment. Although Cloud Storage objects reside in a flat namespace, a hierarchical file tree can be simulated using &#34;/&#34;-delimited object name prefixes. DAG objects for this environment reside in a simulated directory with the given prefix.
     * 
     */
    @Import(name="dagGcsPrefix", required=true)
    private String dagGcsPrefix;

    public String dagGcsPrefix() {
        return this.dagGcsPrefix;
    }

    /**
     * Optional. The configuration settings for Cloud SQL instance used internally by Apache Airflow software. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="databaseConfig", required=true)
    private DatabaseConfigResponse databaseConfig;

    public DatabaseConfigResponse databaseConfig() {
        return this.databaseConfig;
    }

    /**
     * Optional. The encryption options for the Cloud Composer environment and its dependencies. Cannot be updated.
     * 
     */
    @Import(name="encryptionConfig", required=true)
    private EncryptionConfigResponse encryptionConfig;

    public EncryptionConfigResponse encryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * Optional. The size of the Cloud Composer environment. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    @Import(name="environmentSize", required=true)
    private String environmentSize;

    public String environmentSize() {
        return this.environmentSize;
    }

    /**
     * The Kubernetes Engine cluster used to run this environment.
     * 
     */
    @Import(name="gkeCluster", required=true)
    private String gkeCluster;

    public String gkeCluster() {
        return this.gkeCluster;
    }

    /**
     * Optional. The maintenance window is the period when Cloud Composer components may undergo maintenance. It is defined so that maintenance is not executed during peak hours or critical time periods. The system will not be under maintenance for every occurrence of this window, but when maintenance is planned, it will be scheduled during the window. The maintenance window period must encompass at least 12 hours per week. This may be split into multiple chunks, each with a size of at least 4 hours. If this value is omitted, Cloud Composer components may be subject to maintenance at any time.
     * 
     */
    @Import(name="maintenanceWindow", required=true)
    private MaintenanceWindowResponse maintenanceWindow;

    public MaintenanceWindowResponse maintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * Optional. The configuration options for GKE clusters master authorized networks. By default master authorized networks feature is: - in case of private environment: enabled with no external networks allowlisted. - in case of public environment: disabled.
     * 
     */
    @Import(name="masterAuthorizedNetworksConfig", required=true)
    private MasterAuthorizedNetworksConfigResponse masterAuthorizedNetworksConfig;

    public MasterAuthorizedNetworksConfigResponse masterAuthorizedNetworksConfig() {
        return this.masterAuthorizedNetworksConfig;
    }

    /**
     * The configuration used for the Kubernetes Engine cluster.
     * 
     */
    @Import(name="nodeConfig", required=true)
    private NodeConfigResponse nodeConfig;

    public NodeConfigResponse nodeConfig() {
        return this.nodeConfig;
    }

    /**
     * The number of nodes in the Kubernetes Engine cluster that will be used to run this environment. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="nodeCount", required=true)
    private Integer nodeCount;

    public Integer nodeCount() {
        return this.nodeCount;
    }

    /**
     * The configuration used for the Private IP Cloud Composer environment.
     * 
     */
    @Import(name="privateEnvironmentConfig", required=true)
    private PrivateEnvironmentConfigResponse privateEnvironmentConfig;

    public PrivateEnvironmentConfigResponse privateEnvironmentConfig() {
        return this.privateEnvironmentConfig;
    }

    /**
     * The configuration settings for software inside the environment.
     * 
     */
    @Import(name="softwareConfig", required=true)
    private SoftwareConfigResponse softwareConfig;

    public SoftwareConfigResponse softwareConfig() {
        return this.softwareConfig;
    }

    /**
     * Optional. The configuration settings for the Airflow web server App Engine instance. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @Import(name="webServerConfig", required=true)
    private WebServerConfigResponse webServerConfig;

    public WebServerConfigResponse webServerConfig() {
        return this.webServerConfig;
    }

    /**
     * Optional. The network-level access control policy for the Airflow web server. If unspecified, no network-level access restrictions will be applied.
     * 
     */
    @Import(name="webServerNetworkAccessControl", required=true)
    private WebServerNetworkAccessControlResponse webServerNetworkAccessControl;

    public WebServerNetworkAccessControlResponse webServerNetworkAccessControl() {
        return this.webServerNetworkAccessControl;
    }

    /**
     * Optional. The workloads configuration settings for the GKE cluster associated with the Cloud Composer environment. The GKE cluster runs Airflow scheduler, web server and workers workloads. This field is supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.* and newer.
     * 
     */
    @Import(name="workloadsConfig", required=true)
    private WorkloadsConfigResponse workloadsConfig;

    public WorkloadsConfigResponse workloadsConfig() {
        return this.workloadsConfig;
    }

    private EnvironmentConfigResponse() {}

    private EnvironmentConfigResponse(EnvironmentConfigResponse $) {
        this.airflowUri = $.airflowUri;
        this.dagGcsPrefix = $.dagGcsPrefix;
        this.databaseConfig = $.databaseConfig;
        this.encryptionConfig = $.encryptionConfig;
        this.environmentSize = $.environmentSize;
        this.gkeCluster = $.gkeCluster;
        this.maintenanceWindow = $.maintenanceWindow;
        this.masterAuthorizedNetworksConfig = $.masterAuthorizedNetworksConfig;
        this.nodeConfig = $.nodeConfig;
        this.nodeCount = $.nodeCount;
        this.privateEnvironmentConfig = $.privateEnvironmentConfig;
        this.softwareConfig = $.softwareConfig;
        this.webServerConfig = $.webServerConfig;
        this.webServerNetworkAccessControl = $.webServerNetworkAccessControl;
        this.workloadsConfig = $.workloadsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigResponse $;

        public Builder() {
            $ = new EnvironmentConfigResponse();
        }

        public Builder(EnvironmentConfigResponse defaults) {
            $ = new EnvironmentConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder airflowUri(String airflowUri) {
            $.airflowUri = airflowUri;
            return this;
        }

        public Builder dagGcsPrefix(String dagGcsPrefix) {
            $.dagGcsPrefix = dagGcsPrefix;
            return this;
        }

        public Builder databaseConfig(DatabaseConfigResponse databaseConfig) {
            $.databaseConfig = databaseConfig;
            return this;
        }

        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder environmentSize(String environmentSize) {
            $.environmentSize = environmentSize;
            return this;
        }

        public Builder gkeCluster(String gkeCluster) {
            $.gkeCluster = gkeCluster;
            return this;
        }

        public Builder maintenanceWindow(MaintenanceWindowResponse maintenanceWindow) {
            $.maintenanceWindow = maintenanceWindow;
            return this;
        }

        public Builder masterAuthorizedNetworksConfig(MasterAuthorizedNetworksConfigResponse masterAuthorizedNetworksConfig) {
            $.masterAuthorizedNetworksConfig = masterAuthorizedNetworksConfig;
            return this;
        }

        public Builder nodeConfig(NodeConfigResponse nodeConfig) {
            $.nodeConfig = nodeConfig;
            return this;
        }

        public Builder nodeCount(Integer nodeCount) {
            $.nodeCount = nodeCount;
            return this;
        }

        public Builder privateEnvironmentConfig(PrivateEnvironmentConfigResponse privateEnvironmentConfig) {
            $.privateEnvironmentConfig = privateEnvironmentConfig;
            return this;
        }

        public Builder softwareConfig(SoftwareConfigResponse softwareConfig) {
            $.softwareConfig = softwareConfig;
            return this;
        }

        public Builder webServerConfig(WebServerConfigResponse webServerConfig) {
            $.webServerConfig = webServerConfig;
            return this;
        }

        public Builder webServerNetworkAccessControl(WebServerNetworkAccessControlResponse webServerNetworkAccessControl) {
            $.webServerNetworkAccessControl = webServerNetworkAccessControl;
            return this;
        }

        public Builder workloadsConfig(WorkloadsConfigResponse workloadsConfig) {
            $.workloadsConfig = workloadsConfig;
            return this;
        }

        public EnvironmentConfigResponse build() {
            $.airflowUri = Objects.requireNonNull($.airflowUri, "expected parameter 'airflowUri' to be non-null");
            $.dagGcsPrefix = Objects.requireNonNull($.dagGcsPrefix, "expected parameter 'dagGcsPrefix' to be non-null");
            $.databaseConfig = Objects.requireNonNull($.databaseConfig, "expected parameter 'databaseConfig' to be non-null");
            $.encryptionConfig = Objects.requireNonNull($.encryptionConfig, "expected parameter 'encryptionConfig' to be non-null");
            $.environmentSize = Objects.requireNonNull($.environmentSize, "expected parameter 'environmentSize' to be non-null");
            $.gkeCluster = Objects.requireNonNull($.gkeCluster, "expected parameter 'gkeCluster' to be non-null");
            $.maintenanceWindow = Objects.requireNonNull($.maintenanceWindow, "expected parameter 'maintenanceWindow' to be non-null");
            $.masterAuthorizedNetworksConfig = Objects.requireNonNull($.masterAuthorizedNetworksConfig, "expected parameter 'masterAuthorizedNetworksConfig' to be non-null");
            $.nodeConfig = Objects.requireNonNull($.nodeConfig, "expected parameter 'nodeConfig' to be non-null");
            $.nodeCount = Objects.requireNonNull($.nodeCount, "expected parameter 'nodeCount' to be non-null");
            $.privateEnvironmentConfig = Objects.requireNonNull($.privateEnvironmentConfig, "expected parameter 'privateEnvironmentConfig' to be non-null");
            $.softwareConfig = Objects.requireNonNull($.softwareConfig, "expected parameter 'softwareConfig' to be non-null");
            $.webServerConfig = Objects.requireNonNull($.webServerConfig, "expected parameter 'webServerConfig' to be non-null");
            $.webServerNetworkAccessControl = Objects.requireNonNull($.webServerNetworkAccessControl, "expected parameter 'webServerNetworkAccessControl' to be non-null");
            $.workloadsConfig = Objects.requireNonNull($.workloadsConfig, "expected parameter 'workloadsConfig' to be non-null");
            return $;
        }
    }

}
