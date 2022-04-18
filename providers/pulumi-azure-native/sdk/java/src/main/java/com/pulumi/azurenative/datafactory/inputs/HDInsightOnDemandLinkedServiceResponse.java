// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceResponse;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationResponse;
import com.pulumi.azurenative.datafactory.inputs.ScriptActionResponse;
import com.pulumi.azurenative.datafactory.inputs.SecureStringResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * HDInsight ondemand linked service.
 * 
 */
public final class HDInsightOnDemandLinkedServiceResponse extends com.pulumi.resources.InvokeArgs {

    public static final HDInsightOnDemandLinkedServiceResponse Empty = new HDInsightOnDemandLinkedServiceResponse();

    /**
     * Specifies additional storage accounts for the HDInsight linked service so that the Data Factory service can register them on your behalf.
     * 
     */
    @Import(name="additionalLinkedServiceNames")
      private final @Nullable List<LinkedServiceReferenceResponse> additionalLinkedServiceNames;

    public List<LinkedServiceReferenceResponse> additionalLinkedServiceNames() {
        return this.additionalLinkedServiceNames == null ? List.of() : this.additionalLinkedServiceNames;
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
      private final @Nullable List<Object> annotations;

    public List<Object> annotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }

    /**
     * The prefix of cluster name, postfix will be distinct with timestamp. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterNamePrefix")
      private final @Nullable Object clusterNamePrefix;

    public Optional<Object> clusterNamePrefix() {
        return this.clusterNamePrefix == null ? Optional.empty() : Optional.ofNullable(this.clusterNamePrefix);
    }

    /**
     * The password to access the cluster.
     * 
     */
    @Import(name="clusterPassword")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterPassword;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterPassword() {
        return this.clusterPassword == null ? null : this.clusterPassword;
    }

    /**
     * The resource group where the cluster belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterResourceGroup", required=true)
      private final Object clusterResourceGroup;

    public Object clusterResourceGroup() {
        return this.clusterResourceGroup;
    }

    /**
     * Number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterSize", required=true)
      private final Object clusterSize;

    public Object clusterSize() {
        return this.clusterSize;
    }

    /**
     * The password to SSH remotely connect cluster’s node (for Linux).
     * 
     */
    @Import(name="clusterSshPassword")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterSshPassword;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterSshPassword() {
        return this.clusterSshPassword == null ? null : this.clusterSshPassword;
    }

    /**
     * The username to SSH remotely connect to cluster’s node (for Linux). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterSshUserName")
      private final @Nullable Object clusterSshUserName;

    public Optional<Object> clusterSshUserName() {
        return this.clusterSshUserName == null ? Optional.empty() : Optional.ofNullable(this.clusterSshUserName);
    }

    /**
     * The cluster type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterType")
      private final @Nullable Object clusterType;

    public Optional<Object> clusterType() {
        return this.clusterType == null ? Optional.empty() : Optional.ofNullable(this.clusterType);
    }

    /**
     * The username to access the cluster. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterUserName")
      private final @Nullable Object clusterUserName;

    public Optional<Object> clusterUserName() {
        return this.clusterUserName == null ? Optional.empty() : Optional.ofNullable(this.clusterUserName);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
      private final @Nullable IntegrationRuntimeReferenceResponse connectVia;

    public Optional<IntegrationRuntimeReferenceResponse> connectVia() {
        return this.connectVia == null ? Optional.empty() : Optional.ofNullable(this.connectVia);
    }

    /**
     * Specifies the core configuration parameters (as in core-site.xml) for the HDInsight cluster to be created.
     * 
     */
    @Import(name="coreConfiguration")
      private final @Nullable Object coreConfiguration;

    public Optional<Object> coreConfiguration() {
        return this.coreConfiguration == null ? Optional.empty() : Optional.ofNullable(this.coreConfiguration);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
      private final @Nullable CredentialReferenceResponse credential;

    public Optional<CredentialReferenceResponse> credential() {
        return this.credential == null ? Optional.empty() : Optional.ofNullable(this.credential);
    }

    /**
     * Specifies the size of the data node for the HDInsight cluster.
     * 
     */
    @Import(name="dataNodeSize")
      private final @Nullable Object dataNodeSize;

    public Optional<Object> dataNodeSize() {
        return this.dataNodeSize == null ? Optional.empty() : Optional.ofNullable(this.dataNodeSize);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
      private final @Nullable Object encryptedCredential;

    public Optional<Object> encryptedCredential() {
        return this.encryptedCredential == null ? Optional.empty() : Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Specifies the HBase configuration parameters (hbase-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="hBaseConfiguration")
      private final @Nullable Object hBaseConfiguration;

    public Optional<Object> hBaseConfiguration() {
        return this.hBaseConfiguration == null ? Optional.empty() : Optional.ofNullable(this.hBaseConfiguration);
    }

    /**
     * The name of Azure SQL linked service that point to the HCatalog database. The on-demand HDInsight cluster is created by using the Azure SQL database as the metastore.
     * 
     */
    @Import(name="hcatalogLinkedServiceName")
      private final @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName;

    public Optional<LinkedServiceReferenceResponse> hcatalogLinkedServiceName() {
        return this.hcatalogLinkedServiceName == null ? Optional.empty() : Optional.ofNullable(this.hcatalogLinkedServiceName);
    }

    /**
     * Specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="hdfsConfiguration")
      private final @Nullable Object hdfsConfiguration;

    public Optional<Object> hdfsConfiguration() {
        return this.hdfsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.hdfsConfiguration);
    }

    /**
     * Specifies the size of the head node for the HDInsight cluster.
     * 
     */
    @Import(name="headNodeSize")
      private final @Nullable Object headNodeSize;

    public Optional<Object> headNodeSize() {
        return this.headNodeSize == null ? Optional.empty() : Optional.ofNullable(this.headNodeSize);
    }

    /**
     * Specifies the hive configuration parameters (hive-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="hiveConfiguration")
      private final @Nullable Object hiveConfiguration;

    public Optional<Object> hiveConfiguration() {
        return this.hiveConfiguration == null ? Optional.empty() : Optional.ofNullable(this.hiveConfiguration);
    }

    /**
     * The customer’s subscription to host the cluster. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="hostSubscriptionId", required=true)
      private final Object hostSubscriptionId;

    public Object hostSubscriptionId() {
        return this.hostSubscriptionId;
    }

    /**
     * Azure Storage linked service to be used by the on-demand cluster for storing and processing data.
     * 
     */
    @Import(name="linkedServiceName", required=true)
      private final LinkedServiceReferenceResponse linkedServiceName;

    public LinkedServiceReferenceResponse linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Specifies the MapReduce configuration parameters (mapred-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="mapReduceConfiguration")
      private final @Nullable Object mapReduceConfiguration;

    public Optional<Object> mapReduceConfiguration() {
        return this.mapReduceConfiguration == null ? Optional.empty() : Optional.ofNullable(this.mapReduceConfiguration);
    }

    /**
     * Specifies the Oozie configuration parameters (oozie-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="oozieConfiguration")
      private final @Nullable Object oozieConfiguration;

    public Optional<Object> oozieConfiguration() {
        return this.oozieConfiguration == null ? Optional.empty() : Optional.ofNullable(this.oozieConfiguration);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Map<String,ParameterSpecificationResponse> parameters;

    public Map<String,ParameterSpecificationResponse> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }

    /**
     * Custom script actions to run on HDI ondemand cluster once it's up. Please refer to https://docs.microsoft.com/en-us/azure/hdinsight/hdinsight-hadoop-customize-cluster-linux?toc=%2Fen-us%2Fazure%2Fhdinsight%2Fr-server%2FTOC.json&bc=%2Fen-us%2Fazure%2Fbread%2Ftoc.json#understanding-script-actions.
     * 
     */
    @Import(name="scriptActions")
      private final @Nullable List<ScriptActionResponse> scriptActions;

    public List<ScriptActionResponse> scriptActions() {
        return this.scriptActions == null ? List.of() : this.scriptActions;
    }

    /**
     * The service principal id for the hostSubscriptionId. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
      private final @Nullable Object servicePrincipalId;

    public Optional<Object> servicePrincipalId() {
        return this.servicePrincipalId == null ? Optional.empty() : Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key for the service principal id.
     * 
     */
    @Import(name="servicePrincipalKey")
      private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;

    public Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey() {
        return this.servicePrincipalKey == null ? null : this.servicePrincipalKey;
    }

    /**
     * The version of spark if the cluster type is 'spark'. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sparkVersion")
      private final @Nullable Object sparkVersion;

    public Optional<Object> sparkVersion() {
        return this.sparkVersion == null ? Optional.empty() : Optional.ofNullable(this.sparkVersion);
    }

    /**
     * Specifies the Storm configuration parameters (storm-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="stormConfiguration")
      private final @Nullable Object stormConfiguration;

    public Optional<Object> stormConfiguration() {
        return this.stormConfiguration == null ? Optional.empty() : Optional.ofNullable(this.stormConfiguration);
    }

    /**
     * The ARM resource ID for the subnet in the vNet. If virtualNetworkId was specified, then this property is required. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="subnetName")
      private final @Nullable Object subnetName;

    public Optional<Object> subnetName() {
        return this.subnetName == null ? Optional.empty() : Optional.ofNullable(this.subnetName);
    }

    /**
     * The Tenant id/name to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant", required=true)
      private final Object tenant;

    public Object tenant() {
        return this.tenant;
    }

    /**
     * The allowed idle time for the on-demand HDInsight cluster. Specifies how long the on-demand HDInsight cluster stays alive after completion of an activity run if there are no other active jobs in the cluster. The minimum value is 5 mins. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="timeToLive", required=true)
      private final Object timeToLive;

    public Object timeToLive() {
        return this.timeToLive;
    }

    /**
     * Type of linked service.
     * Expected value is 'HDInsightOnDemand'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="version", required=true)
      private final Object version;

    public Object version() {
        return this.version;
    }

    /**
     * The ARM resource ID for the vNet to which the cluster should be joined after creation. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="virtualNetworkId")
      private final @Nullable Object virtualNetworkId;

    public Optional<Object> virtualNetworkId() {
        return this.virtualNetworkId == null ? Optional.empty() : Optional.ofNullable(this.virtualNetworkId);
    }

    /**
     * Specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="yarnConfiguration")
      private final @Nullable Object yarnConfiguration;

    public Optional<Object> yarnConfiguration() {
        return this.yarnConfiguration == null ? Optional.empty() : Optional.ofNullable(this.yarnConfiguration);
    }

    /**
     * Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     * 
     */
    @Import(name="zookeeperNodeSize")
      private final @Nullable Object zookeeperNodeSize;

    public Optional<Object> zookeeperNodeSize() {
        return this.zookeeperNodeSize == null ? Optional.empty() : Optional.ofNullable(this.zookeeperNodeSize);
    }

    public HDInsightOnDemandLinkedServiceResponse(
        @Nullable List<LinkedServiceReferenceResponse> additionalLinkedServiceNames,
        @Nullable List<Object> annotations,
        @Nullable Object clusterNamePrefix,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterPassword,
        Object clusterResourceGroup,
        Object clusterSize,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterSshPassword,
        @Nullable Object clusterSshUserName,
        @Nullable Object clusterType,
        @Nullable Object clusterUserName,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object coreConfiguration,
        @Nullable CredentialReferenceResponse credential,
        @Nullable Object dataNodeSize,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Object hBaseConfiguration,
        @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName,
        @Nullable Object hdfsConfiguration,
        @Nullable Object headNodeSize,
        @Nullable Object hiveConfiguration,
        Object hostSubscriptionId,
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object mapReduceConfiguration,
        @Nullable Object oozieConfiguration,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable List<ScriptActionResponse> scriptActions,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object sparkVersion,
        @Nullable Object stormConfiguration,
        @Nullable Object subnetName,
        Object tenant,
        Object timeToLive,
        String type,
        Object version,
        @Nullable Object virtualNetworkId,
        @Nullable Object yarnConfiguration,
        @Nullable Object zookeeperNodeSize) {
        this.additionalLinkedServiceNames = additionalLinkedServiceNames;
        this.annotations = annotations;
        this.clusterNamePrefix = clusterNamePrefix;
        this.clusterPassword = clusterPassword;
        this.clusterResourceGroup = Objects.requireNonNull(clusterResourceGroup, "expected parameter 'clusterResourceGroup' to be non-null");
        this.clusterSize = Objects.requireNonNull(clusterSize, "expected parameter 'clusterSize' to be non-null");
        this.clusterSshPassword = clusterSshPassword;
        this.clusterSshUserName = clusterSshUserName;
        this.clusterType = clusterType;
        this.clusterUserName = clusterUserName;
        this.connectVia = connectVia;
        this.coreConfiguration = coreConfiguration;
        this.credential = credential;
        this.dataNodeSize = dataNodeSize;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.hBaseConfiguration = hBaseConfiguration;
        this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
        this.hdfsConfiguration = hdfsConfiguration;
        this.headNodeSize = headNodeSize;
        this.hiveConfiguration = hiveConfiguration;
        this.hostSubscriptionId = Objects.requireNonNull(hostSubscriptionId, "expected parameter 'hostSubscriptionId' to be non-null");
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
        this.mapReduceConfiguration = mapReduceConfiguration;
        this.oozieConfiguration = oozieConfiguration;
        this.parameters = parameters;
        this.scriptActions = scriptActions;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.sparkVersion = sparkVersion;
        this.stormConfiguration = stormConfiguration;
        this.subnetName = subnetName;
        this.tenant = Objects.requireNonNull(tenant, "expected parameter 'tenant' to be non-null");
        this.timeToLive = Objects.requireNonNull(timeToLive, "expected parameter 'timeToLive' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
        this.virtualNetworkId = virtualNetworkId;
        this.yarnConfiguration = yarnConfiguration;
        this.zookeeperNodeSize = zookeeperNodeSize;
    }

    private HDInsightOnDemandLinkedServiceResponse() {
        this.additionalLinkedServiceNames = List.of();
        this.annotations = List.of();
        this.clusterNamePrefix = null;
        this.clusterPassword = null;
        this.clusterResourceGroup = null;
        this.clusterSize = null;
        this.clusterSshPassword = null;
        this.clusterSshUserName = null;
        this.clusterType = null;
        this.clusterUserName = null;
        this.connectVia = null;
        this.coreConfiguration = null;
        this.credential = null;
        this.dataNodeSize = null;
        this.description = null;
        this.encryptedCredential = null;
        this.hBaseConfiguration = null;
        this.hcatalogLinkedServiceName = null;
        this.hdfsConfiguration = null;
        this.headNodeSize = null;
        this.hiveConfiguration = null;
        this.hostSubscriptionId = null;
        this.linkedServiceName = null;
        this.mapReduceConfiguration = null;
        this.oozieConfiguration = null;
        this.parameters = Map.of();
        this.scriptActions = List.of();
        this.servicePrincipalId = null;
        this.servicePrincipalKey = null;
        this.sparkVersion = null;
        this.stormConfiguration = null;
        this.subnetName = null;
        this.tenant = null;
        this.timeToLive = null;
        this.type = null;
        this.version = null;
        this.virtualNetworkId = null;
        this.yarnConfiguration = null;
        this.zookeeperNodeSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HDInsightOnDemandLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LinkedServiceReferenceResponse> additionalLinkedServiceNames;
        private @Nullable List<Object> annotations;
        private @Nullable Object clusterNamePrefix;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterPassword;
        private Object clusterResourceGroup;
        private Object clusterSize;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterSshPassword;
        private @Nullable Object clusterSshUserName;
        private @Nullable Object clusterType;
        private @Nullable Object clusterUserName;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object coreConfiguration;
        private @Nullable CredentialReferenceResponse credential;
        private @Nullable Object dataNodeSize;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Object hBaseConfiguration;
        private @Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName;
        private @Nullable Object hdfsConfiguration;
        private @Nullable Object headNodeSize;
        private @Nullable Object hiveConfiguration;
        private Object hostSubscriptionId;
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object mapReduceConfiguration;
        private @Nullable Object oozieConfiguration;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable List<ScriptActionResponse> scriptActions;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object sparkVersion;
        private @Nullable Object stormConfiguration;
        private @Nullable Object subnetName;
        private Object tenant;
        private Object timeToLive;
        private String type;
        private Object version;
        private @Nullable Object virtualNetworkId;
        private @Nullable Object yarnConfiguration;
        private @Nullable Object zookeeperNodeSize;

        public Builder() {
    	      // Empty
        }

        public Builder(HDInsightOnDemandLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLinkedServiceNames = defaults.additionalLinkedServiceNames;
    	      this.annotations = defaults.annotations;
    	      this.clusterNamePrefix = defaults.clusterNamePrefix;
    	      this.clusterPassword = defaults.clusterPassword;
    	      this.clusterResourceGroup = defaults.clusterResourceGroup;
    	      this.clusterSize = defaults.clusterSize;
    	      this.clusterSshPassword = defaults.clusterSshPassword;
    	      this.clusterSshUserName = defaults.clusterSshUserName;
    	      this.clusterType = defaults.clusterType;
    	      this.clusterUserName = defaults.clusterUserName;
    	      this.connectVia = defaults.connectVia;
    	      this.coreConfiguration = defaults.coreConfiguration;
    	      this.credential = defaults.credential;
    	      this.dataNodeSize = defaults.dataNodeSize;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.hBaseConfiguration = defaults.hBaseConfiguration;
    	      this.hcatalogLinkedServiceName = defaults.hcatalogLinkedServiceName;
    	      this.hdfsConfiguration = defaults.hdfsConfiguration;
    	      this.headNodeSize = defaults.headNodeSize;
    	      this.hiveConfiguration = defaults.hiveConfiguration;
    	      this.hostSubscriptionId = defaults.hostSubscriptionId;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.mapReduceConfiguration = defaults.mapReduceConfiguration;
    	      this.oozieConfiguration = defaults.oozieConfiguration;
    	      this.parameters = defaults.parameters;
    	      this.scriptActions = defaults.scriptActions;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.sparkVersion = defaults.sparkVersion;
    	      this.stormConfiguration = defaults.stormConfiguration;
    	      this.subnetName = defaults.subnetName;
    	      this.tenant = defaults.tenant;
    	      this.timeToLive = defaults.timeToLive;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
    	      this.yarnConfiguration = defaults.yarnConfiguration;
    	      this.zookeeperNodeSize = defaults.zookeeperNodeSize;
        }

        public Builder additionalLinkedServiceNames(@Nullable List<LinkedServiceReferenceResponse> additionalLinkedServiceNames) {
            this.additionalLinkedServiceNames = additionalLinkedServiceNames;
            return this;
        }
        public Builder additionalLinkedServiceNames(LinkedServiceReferenceResponse... additionalLinkedServiceNames) {
            return additionalLinkedServiceNames(List.of(additionalLinkedServiceNames));
        }
        public Builder annotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }
        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }
        public Builder clusterNamePrefix(@Nullable Object clusterNamePrefix) {
            this.clusterNamePrefix = clusterNamePrefix;
            return this;
        }
        public Builder clusterPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterPassword) {
            this.clusterPassword = clusterPassword;
            return this;
        }
        public Builder clusterResourceGroup(Object clusterResourceGroup) {
            this.clusterResourceGroup = Objects.requireNonNull(clusterResourceGroup);
            return this;
        }
        public Builder clusterSize(Object clusterSize) {
            this.clusterSize = Objects.requireNonNull(clusterSize);
            return this;
        }
        public Builder clusterSshPassword(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> clusterSshPassword) {
            this.clusterSshPassword = clusterSshPassword;
            return this;
        }
        public Builder clusterSshUserName(@Nullable Object clusterSshUserName) {
            this.clusterSshUserName = clusterSshUserName;
            return this;
        }
        public Builder clusterType(@Nullable Object clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Builder clusterUserName(@Nullable Object clusterUserName) {
            this.clusterUserName = clusterUserName;
            return this;
        }
        public Builder connectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }
        public Builder coreConfiguration(@Nullable Object coreConfiguration) {
            this.coreConfiguration = coreConfiguration;
            return this;
        }
        public Builder credential(@Nullable CredentialReferenceResponse credential) {
            this.credential = credential;
            return this;
        }
        public Builder dataNodeSize(@Nullable Object dataNodeSize) {
            this.dataNodeSize = dataNodeSize;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder encryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }
        public Builder hBaseConfiguration(@Nullable Object hBaseConfiguration) {
            this.hBaseConfiguration = hBaseConfiguration;
            return this;
        }
        public Builder hcatalogLinkedServiceName(@Nullable LinkedServiceReferenceResponse hcatalogLinkedServiceName) {
            this.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
            return this;
        }
        public Builder hdfsConfiguration(@Nullable Object hdfsConfiguration) {
            this.hdfsConfiguration = hdfsConfiguration;
            return this;
        }
        public Builder headNodeSize(@Nullable Object headNodeSize) {
            this.headNodeSize = headNodeSize;
            return this;
        }
        public Builder hiveConfiguration(@Nullable Object hiveConfiguration) {
            this.hiveConfiguration = hiveConfiguration;
            return this;
        }
        public Builder hostSubscriptionId(Object hostSubscriptionId) {
            this.hostSubscriptionId = Objects.requireNonNull(hostSubscriptionId);
            return this;
        }
        public Builder linkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }
        public Builder mapReduceConfiguration(@Nullable Object mapReduceConfiguration) {
            this.mapReduceConfiguration = mapReduceConfiguration;
            return this;
        }
        public Builder oozieConfiguration(@Nullable Object oozieConfiguration) {
            this.oozieConfiguration = oozieConfiguration;
            return this;
        }
        public Builder parameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder scriptActions(@Nullable List<ScriptActionResponse> scriptActions) {
            this.scriptActions = scriptActions;
            return this;
        }
        public Builder scriptActions(ScriptActionResponse... scriptActions) {
            return scriptActions(List.of(scriptActions));
        }
        public Builder servicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }
        public Builder servicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }
        public Builder sparkVersion(@Nullable Object sparkVersion) {
            this.sparkVersion = sparkVersion;
            return this;
        }
        public Builder stormConfiguration(@Nullable Object stormConfiguration) {
            this.stormConfiguration = stormConfiguration;
            return this;
        }
        public Builder subnetName(@Nullable Object subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public Builder tenant(Object tenant) {
            this.tenant = Objects.requireNonNull(tenant);
            return this;
        }
        public Builder timeToLive(Object timeToLive) {
            this.timeToLive = Objects.requireNonNull(timeToLive);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(Object version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder virtualNetworkId(@Nullable Object virtualNetworkId) {
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        public Builder yarnConfiguration(@Nullable Object yarnConfiguration) {
            this.yarnConfiguration = yarnConfiguration;
            return this;
        }
        public Builder zookeeperNodeSize(@Nullable Object zookeeperNodeSize) {
            this.zookeeperNodeSize = zookeeperNodeSize;
            return this;
        }        public HDInsightOnDemandLinkedServiceResponse build() {
            return new HDInsightOnDemandLinkedServiceResponse(additionalLinkedServiceNames, annotations, clusterNamePrefix, clusterPassword, clusterResourceGroup, clusterSize, clusterSshPassword, clusterSshUserName, clusterType, clusterUserName, connectVia, coreConfiguration, credential, dataNodeSize, description, encryptedCredential, hBaseConfiguration, hcatalogLinkedServiceName, hdfsConfiguration, headNodeSize, hiveConfiguration, hostSubscriptionId, linkedServiceName, mapReduceConfiguration, oozieConfiguration, parameters, scriptActions, servicePrincipalId, servicePrincipalKey, sparkVersion, stormConfiguration, subnetName, tenant, timeToLive, type, version, virtualNetworkId, yarnConfiguration, zookeeperNodeSize);
        }
    }
}
