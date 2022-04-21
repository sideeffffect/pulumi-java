// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.CredentialReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.IntegrationRuntimeReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.LinkedServiceReferenceArgs;
import com.pulumi.azurenative.datafactory.inputs.ParameterSpecificationArgs;
import com.pulumi.azurenative.datafactory.inputs.ScriptActionArgs;
import com.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
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
public final class HDInsightOnDemandLinkedServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HDInsightOnDemandLinkedServiceArgs Empty = new HDInsightOnDemandLinkedServiceArgs();

    /**
     * Specifies additional storage accounts for the HDInsight linked service so that the Data Factory service can register them on your behalf.
     * 
     */
    @Import(name="additionalLinkedServiceNames")
    private @Nullable Output<List<LinkedServiceReferenceArgs>> additionalLinkedServiceNames;

    public Optional<Output<List<LinkedServiceReferenceArgs>>> additionalLinkedServiceNames() {
        return Optional.ofNullable(this.additionalLinkedServiceNames);
    }

    /**
     * List of tags that can be used for describing the linked service.
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<List<Object>> annotations;

    public Optional<Output<List<Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * The prefix of cluster name, postfix will be distinct with timestamp. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterNamePrefix")
    private @Nullable Output<Object> clusterNamePrefix;

    public Optional<Output<Object>> clusterNamePrefix() {
        return Optional.ofNullable(this.clusterNamePrefix);
    }

    /**
     * The password to access the cluster.
     * 
     */
    @Import(name="clusterPassword")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clusterPassword;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> clusterPassword() {
        return Optional.ofNullable(this.clusterPassword);
    }

    /**
     * The resource group where the cluster belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterResourceGroup", required=true)
    private Output<Object> clusterResourceGroup;

    public Output<Object> clusterResourceGroup() {
        return this.clusterResourceGroup;
    }

    /**
     * Number of worker/data nodes in the cluster. Suggestion value: 4. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterSize", required=true)
    private Output<Object> clusterSize;

    public Output<Object> clusterSize() {
        return this.clusterSize;
    }

    /**
     * The password to SSH remotely connect cluster’s node (for Linux).
     * 
     */
    @Import(name="clusterSshPassword")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clusterSshPassword;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> clusterSshPassword() {
        return Optional.ofNullable(this.clusterSshPassword);
    }

    /**
     * The username to SSH remotely connect to cluster’s node (for Linux). Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterSshUserName")
    private @Nullable Output<Object> clusterSshUserName;

    public Optional<Output<Object>> clusterSshUserName() {
        return Optional.ofNullable(this.clusterSshUserName);
    }

    /**
     * The cluster type. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterType")
    private @Nullable Output<Object> clusterType;

    public Optional<Output<Object>> clusterType() {
        return Optional.ofNullable(this.clusterType);
    }

    /**
     * The username to access the cluster. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="clusterUserName")
    private @Nullable Output<Object> clusterUserName;

    public Optional<Output<Object>> clusterUserName() {
        return Optional.ofNullable(this.clusterUserName);
    }

    /**
     * The integration runtime reference.
     * 
     */
    @Import(name="connectVia")
    private @Nullable Output<IntegrationRuntimeReferenceArgs> connectVia;

    public Optional<Output<IntegrationRuntimeReferenceArgs>> connectVia() {
        return Optional.ofNullable(this.connectVia);
    }

    /**
     * Specifies the core configuration parameters (as in core-site.xml) for the HDInsight cluster to be created.
     * 
     */
    @Import(name="coreConfiguration")
    private @Nullable Output<Object> coreConfiguration;

    public Optional<Output<Object>> coreConfiguration() {
        return Optional.ofNullable(this.coreConfiguration);
    }

    /**
     * The credential reference containing authentication information.
     * 
     */
    @Import(name="credential")
    private @Nullable Output<CredentialReferenceArgs> credential;

    public Optional<Output<CredentialReferenceArgs>> credential() {
        return Optional.ofNullable(this.credential);
    }

    /**
     * Specifies the size of the data node for the HDInsight cluster.
     * 
     */
    @Import(name="dataNodeSize")
    private @Nullable Output<Object> dataNodeSize;

    public Optional<Output<Object>> dataNodeSize() {
        return Optional.ofNullable(this.dataNodeSize);
    }

    /**
     * Linked service description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="encryptedCredential")
    private @Nullable Output<Object> encryptedCredential;

    public Optional<Output<Object>> encryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }

    /**
     * Specifies the HBase configuration parameters (hbase-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="hBaseConfiguration")
    private @Nullable Output<Object> hBaseConfiguration;

    public Optional<Output<Object>> hBaseConfiguration() {
        return Optional.ofNullable(this.hBaseConfiguration);
    }

    /**
     * The name of Azure SQL linked service that point to the HCatalog database. The on-demand HDInsight cluster is created by using the Azure SQL database as the metastore.
     * 
     */
    @Import(name="hcatalogLinkedServiceName")
    private @Nullable Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName;

    public Optional<Output<LinkedServiceReferenceArgs>> hcatalogLinkedServiceName() {
        return Optional.ofNullable(this.hcatalogLinkedServiceName);
    }

    /**
     * Specifies the HDFS configuration parameters (hdfs-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="hdfsConfiguration")
    private @Nullable Output<Object> hdfsConfiguration;

    public Optional<Output<Object>> hdfsConfiguration() {
        return Optional.ofNullable(this.hdfsConfiguration);
    }

    /**
     * Specifies the size of the head node for the HDInsight cluster.
     * 
     */
    @Import(name="headNodeSize")
    private @Nullable Output<Object> headNodeSize;

    public Optional<Output<Object>> headNodeSize() {
        return Optional.ofNullable(this.headNodeSize);
    }

    /**
     * Specifies the hive configuration parameters (hive-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="hiveConfiguration")
    private @Nullable Output<Object> hiveConfiguration;

    public Optional<Output<Object>> hiveConfiguration() {
        return Optional.ofNullable(this.hiveConfiguration);
    }

    /**
     * The customer’s subscription to host the cluster. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="hostSubscriptionId", required=true)
    private Output<Object> hostSubscriptionId;

    public Output<Object> hostSubscriptionId() {
        return this.hostSubscriptionId;
    }

    /**
     * Azure Storage linked service to be used by the on-demand cluster for storing and processing data.
     * 
     */
    @Import(name="linkedServiceName", required=true)
    private Output<LinkedServiceReferenceArgs> linkedServiceName;

    public Output<LinkedServiceReferenceArgs> linkedServiceName() {
        return this.linkedServiceName;
    }

    /**
     * Specifies the MapReduce configuration parameters (mapred-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="mapReduceConfiguration")
    private @Nullable Output<Object> mapReduceConfiguration;

    public Optional<Output<Object>> mapReduceConfiguration() {
        return Optional.ofNullable(this.mapReduceConfiguration);
    }

    /**
     * Specifies the Oozie configuration parameters (oozie-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="oozieConfiguration")
    private @Nullable Output<Object> oozieConfiguration;

    public Optional<Output<Object>> oozieConfiguration() {
        return Optional.ofNullable(this.oozieConfiguration);
    }

    /**
     * Parameters for linked service.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterSpecificationArgs>> parameters;

    public Optional<Output<Map<String,ParameterSpecificationArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * Custom script actions to run on HDI ondemand cluster once it&#39;s up. Please refer to https://docs.microsoft.com/en-us/azure/hdinsight/hdinsight-hadoop-customize-cluster-linux?toc=%2Fen-us%2Fazure%2Fhdinsight%2Fr-server%2FTOC.json&amp;bc=%2Fen-us%2Fazure%2Fbread%2Ftoc.json#understanding-script-actions.
     * 
     */
    @Import(name="scriptActions")
    private @Nullable Output<List<ScriptActionArgs>> scriptActions;

    public Optional<Output<List<ScriptActionArgs>>> scriptActions() {
        return Optional.ofNullable(this.scriptActions);
    }

    /**
     * The service principal id for the hostSubscriptionId. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="servicePrincipalId")
    private @Nullable Output<Object> servicePrincipalId;

    public Optional<Output<Object>> servicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }

    /**
     * The key for the service principal id.
     * 
     */
    @Import(name="servicePrincipalKey")
    private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey;

    public Optional<Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>>> servicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }

    /**
     * The version of spark if the cluster type is &#39;spark&#39;. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="sparkVersion")
    private @Nullable Output<Object> sparkVersion;

    public Optional<Output<Object>> sparkVersion() {
        return Optional.ofNullable(this.sparkVersion);
    }

    /**
     * Specifies the Storm configuration parameters (storm-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="stormConfiguration")
    private @Nullable Output<Object> stormConfiguration;

    public Optional<Output<Object>> stormConfiguration() {
        return Optional.ofNullable(this.stormConfiguration);
    }

    /**
     * The ARM resource ID for the subnet in the vNet. If virtualNetworkId was specified, then this property is required. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="subnetName")
    private @Nullable Output<Object> subnetName;

    public Optional<Output<Object>> subnetName() {
        return Optional.ofNullable(this.subnetName);
    }

    /**
     * The Tenant id/name to which the service principal belongs. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="tenant", required=true)
    private Output<Object> tenant;

    public Output<Object> tenant() {
        return this.tenant;
    }

    /**
     * The allowed idle time for the on-demand HDInsight cluster. Specifies how long the on-demand HDInsight cluster stays alive after completion of an activity run if there are no other active jobs in the cluster. The minimum value is 5 mins. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="timeToLive", required=true)
    private Output<Object> timeToLive;

    public Output<Object> timeToLive() {
        return this.timeToLive;
    }

    /**
     * Type of linked service.
     * Expected value is &#39;HDInsightOnDemand&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Version of the HDInsight cluster.  Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="version", required=true)
    private Output<Object> version;

    public Output<Object> version() {
        return this.version;
    }

    /**
     * The ARM resource ID for the vNet to which the cluster should be joined after creation. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="virtualNetworkId")
    private @Nullable Output<Object> virtualNetworkId;

    public Optional<Output<Object>> virtualNetworkId() {
        return Optional.ofNullable(this.virtualNetworkId);
    }

    /**
     * Specifies the Yarn configuration parameters (yarn-site.xml) for the HDInsight cluster.
     * 
     */
    @Import(name="yarnConfiguration")
    private @Nullable Output<Object> yarnConfiguration;

    public Optional<Output<Object>> yarnConfiguration() {
        return Optional.ofNullable(this.yarnConfiguration);
    }

    /**
     * Specifies the size of the Zoo Keeper node for the HDInsight cluster.
     * 
     */
    @Import(name="zookeeperNodeSize")
    private @Nullable Output<Object> zookeeperNodeSize;

    public Optional<Output<Object>> zookeeperNodeSize() {
        return Optional.ofNullable(this.zookeeperNodeSize);
    }

    private HDInsightOnDemandLinkedServiceArgs() {}

    private HDInsightOnDemandLinkedServiceArgs(HDInsightOnDemandLinkedServiceArgs $) {
        this.additionalLinkedServiceNames = $.additionalLinkedServiceNames;
        this.annotations = $.annotations;
        this.clusterNamePrefix = $.clusterNamePrefix;
        this.clusterPassword = $.clusterPassword;
        this.clusterResourceGroup = $.clusterResourceGroup;
        this.clusterSize = $.clusterSize;
        this.clusterSshPassword = $.clusterSshPassword;
        this.clusterSshUserName = $.clusterSshUserName;
        this.clusterType = $.clusterType;
        this.clusterUserName = $.clusterUserName;
        this.connectVia = $.connectVia;
        this.coreConfiguration = $.coreConfiguration;
        this.credential = $.credential;
        this.dataNodeSize = $.dataNodeSize;
        this.description = $.description;
        this.encryptedCredential = $.encryptedCredential;
        this.hBaseConfiguration = $.hBaseConfiguration;
        this.hcatalogLinkedServiceName = $.hcatalogLinkedServiceName;
        this.hdfsConfiguration = $.hdfsConfiguration;
        this.headNodeSize = $.headNodeSize;
        this.hiveConfiguration = $.hiveConfiguration;
        this.hostSubscriptionId = $.hostSubscriptionId;
        this.linkedServiceName = $.linkedServiceName;
        this.mapReduceConfiguration = $.mapReduceConfiguration;
        this.oozieConfiguration = $.oozieConfiguration;
        this.parameters = $.parameters;
        this.scriptActions = $.scriptActions;
        this.servicePrincipalId = $.servicePrincipalId;
        this.servicePrincipalKey = $.servicePrincipalKey;
        this.sparkVersion = $.sparkVersion;
        this.stormConfiguration = $.stormConfiguration;
        this.subnetName = $.subnetName;
        this.tenant = $.tenant;
        this.timeToLive = $.timeToLive;
        this.type = $.type;
        this.version = $.version;
        this.virtualNetworkId = $.virtualNetworkId;
        this.yarnConfiguration = $.yarnConfiguration;
        this.zookeeperNodeSize = $.zookeeperNodeSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HDInsightOnDemandLinkedServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HDInsightOnDemandLinkedServiceArgs $;

        public Builder() {
            $ = new HDInsightOnDemandLinkedServiceArgs();
        }

        public Builder(HDInsightOnDemandLinkedServiceArgs defaults) {
            $ = new HDInsightOnDemandLinkedServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalLinkedServiceNames(@Nullable Output<List<LinkedServiceReferenceArgs>> additionalLinkedServiceNames) {
            $.additionalLinkedServiceNames = additionalLinkedServiceNames;
            return this;
        }

        public Builder additionalLinkedServiceNames(List<LinkedServiceReferenceArgs> additionalLinkedServiceNames) {
            return additionalLinkedServiceNames(Output.of(additionalLinkedServiceNames));
        }

        public Builder additionalLinkedServiceNames(LinkedServiceReferenceArgs... additionalLinkedServiceNames) {
            return additionalLinkedServiceNames(List.of(additionalLinkedServiceNames));
        }

        public Builder annotations(@Nullable Output<List<Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder annotations(List<Object> annotations) {
            return annotations(Output.of(annotations));
        }

        public Builder annotations(Object... annotations) {
            return annotations(List.of(annotations));
        }

        public Builder clusterNamePrefix(@Nullable Output<Object> clusterNamePrefix) {
            $.clusterNamePrefix = clusterNamePrefix;
            return this;
        }

        public Builder clusterNamePrefix(Object clusterNamePrefix) {
            return clusterNamePrefix(Output.of(clusterNamePrefix));
        }

        public Builder clusterPassword(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clusterPassword) {
            $.clusterPassword = clusterPassword;
            return this;
        }

        public Builder clusterPassword(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clusterPassword) {
            return clusterPassword(Output.of(clusterPassword));
        }

        public Builder clusterResourceGroup(Output<Object> clusterResourceGroup) {
            $.clusterResourceGroup = clusterResourceGroup;
            return this;
        }

        public Builder clusterResourceGroup(Object clusterResourceGroup) {
            return clusterResourceGroup(Output.of(clusterResourceGroup));
        }

        public Builder clusterSize(Output<Object> clusterSize) {
            $.clusterSize = clusterSize;
            return this;
        }

        public Builder clusterSize(Object clusterSize) {
            return clusterSize(Output.of(clusterSize));
        }

        public Builder clusterSshPassword(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> clusterSshPassword) {
            $.clusterSshPassword = clusterSshPassword;
            return this;
        }

        public Builder clusterSshPassword(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> clusterSshPassword) {
            return clusterSshPassword(Output.of(clusterSshPassword));
        }

        public Builder clusterSshUserName(@Nullable Output<Object> clusterSshUserName) {
            $.clusterSshUserName = clusterSshUserName;
            return this;
        }

        public Builder clusterSshUserName(Object clusterSshUserName) {
            return clusterSshUserName(Output.of(clusterSshUserName));
        }

        public Builder clusterType(@Nullable Output<Object> clusterType) {
            $.clusterType = clusterType;
            return this;
        }

        public Builder clusterType(Object clusterType) {
            return clusterType(Output.of(clusterType));
        }

        public Builder clusterUserName(@Nullable Output<Object> clusterUserName) {
            $.clusterUserName = clusterUserName;
            return this;
        }

        public Builder clusterUserName(Object clusterUserName) {
            return clusterUserName(Output.of(clusterUserName));
        }

        public Builder connectVia(@Nullable Output<IntegrationRuntimeReferenceArgs> connectVia) {
            $.connectVia = connectVia;
            return this;
        }

        public Builder connectVia(IntegrationRuntimeReferenceArgs connectVia) {
            return connectVia(Output.of(connectVia));
        }

        public Builder coreConfiguration(@Nullable Output<Object> coreConfiguration) {
            $.coreConfiguration = coreConfiguration;
            return this;
        }

        public Builder coreConfiguration(Object coreConfiguration) {
            return coreConfiguration(Output.of(coreConfiguration));
        }

        public Builder credential(@Nullable Output<CredentialReferenceArgs> credential) {
            $.credential = credential;
            return this;
        }

        public Builder credential(CredentialReferenceArgs credential) {
            return credential(Output.of(credential));
        }

        public Builder dataNodeSize(@Nullable Output<Object> dataNodeSize) {
            $.dataNodeSize = dataNodeSize;
            return this;
        }

        public Builder dataNodeSize(Object dataNodeSize) {
            return dataNodeSize(Output.of(dataNodeSize));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder encryptedCredential(@Nullable Output<Object> encryptedCredential) {
            $.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder encryptedCredential(Object encryptedCredential) {
            return encryptedCredential(Output.of(encryptedCredential));
        }

        public Builder hBaseConfiguration(@Nullable Output<Object> hBaseConfiguration) {
            $.hBaseConfiguration = hBaseConfiguration;
            return this;
        }

        public Builder hBaseConfiguration(Object hBaseConfiguration) {
            return hBaseConfiguration(Output.of(hBaseConfiguration));
        }

        public Builder hcatalogLinkedServiceName(@Nullable Output<LinkedServiceReferenceArgs> hcatalogLinkedServiceName) {
            $.hcatalogLinkedServiceName = hcatalogLinkedServiceName;
            return this;
        }

        public Builder hcatalogLinkedServiceName(LinkedServiceReferenceArgs hcatalogLinkedServiceName) {
            return hcatalogLinkedServiceName(Output.of(hcatalogLinkedServiceName));
        }

        public Builder hdfsConfiguration(@Nullable Output<Object> hdfsConfiguration) {
            $.hdfsConfiguration = hdfsConfiguration;
            return this;
        }

        public Builder hdfsConfiguration(Object hdfsConfiguration) {
            return hdfsConfiguration(Output.of(hdfsConfiguration));
        }

        public Builder headNodeSize(@Nullable Output<Object> headNodeSize) {
            $.headNodeSize = headNodeSize;
            return this;
        }

        public Builder headNodeSize(Object headNodeSize) {
            return headNodeSize(Output.of(headNodeSize));
        }

        public Builder hiveConfiguration(@Nullable Output<Object> hiveConfiguration) {
            $.hiveConfiguration = hiveConfiguration;
            return this;
        }

        public Builder hiveConfiguration(Object hiveConfiguration) {
            return hiveConfiguration(Output.of(hiveConfiguration));
        }

        public Builder hostSubscriptionId(Output<Object> hostSubscriptionId) {
            $.hostSubscriptionId = hostSubscriptionId;
            return this;
        }

        public Builder hostSubscriptionId(Object hostSubscriptionId) {
            return hostSubscriptionId(Output.of(hostSubscriptionId));
        }

        public Builder linkedServiceName(Output<LinkedServiceReferenceArgs> linkedServiceName) {
            $.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder linkedServiceName(LinkedServiceReferenceArgs linkedServiceName) {
            return linkedServiceName(Output.of(linkedServiceName));
        }

        public Builder mapReduceConfiguration(@Nullable Output<Object> mapReduceConfiguration) {
            $.mapReduceConfiguration = mapReduceConfiguration;
            return this;
        }

        public Builder mapReduceConfiguration(Object mapReduceConfiguration) {
            return mapReduceConfiguration(Output.of(mapReduceConfiguration));
        }

        public Builder oozieConfiguration(@Nullable Output<Object> oozieConfiguration) {
            $.oozieConfiguration = oozieConfiguration;
            return this;
        }

        public Builder oozieConfiguration(Object oozieConfiguration) {
            return oozieConfiguration(Output.of(oozieConfiguration));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterSpecificationArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterSpecificationArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder scriptActions(@Nullable Output<List<ScriptActionArgs>> scriptActions) {
            $.scriptActions = scriptActions;
            return this;
        }

        public Builder scriptActions(List<ScriptActionArgs> scriptActions) {
            return scriptActions(Output.of(scriptActions));
        }

        public Builder scriptActions(ScriptActionArgs... scriptActions) {
            return scriptActions(List.of(scriptActions));
        }

        public Builder servicePrincipalId(@Nullable Output<Object> servicePrincipalId) {
            $.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder servicePrincipalId(Object servicePrincipalId) {
            return servicePrincipalId(Output.of(servicePrincipalId));
        }

        public Builder servicePrincipalKey(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> servicePrincipalKey) {
            $.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder servicePrincipalKey(Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> servicePrincipalKey) {
            return servicePrincipalKey(Output.of(servicePrincipalKey));
        }

        public Builder sparkVersion(@Nullable Output<Object> sparkVersion) {
            $.sparkVersion = sparkVersion;
            return this;
        }

        public Builder sparkVersion(Object sparkVersion) {
            return sparkVersion(Output.of(sparkVersion));
        }

        public Builder stormConfiguration(@Nullable Output<Object> stormConfiguration) {
            $.stormConfiguration = stormConfiguration;
            return this;
        }

        public Builder stormConfiguration(Object stormConfiguration) {
            return stormConfiguration(Output.of(stormConfiguration));
        }

        public Builder subnetName(@Nullable Output<Object> subnetName) {
            $.subnetName = subnetName;
            return this;
        }

        public Builder subnetName(Object subnetName) {
            return subnetName(Output.of(subnetName));
        }

        public Builder tenant(Output<Object> tenant) {
            $.tenant = tenant;
            return this;
        }

        public Builder tenant(Object tenant) {
            return tenant(Output.of(tenant));
        }

        public Builder timeToLive(Output<Object> timeToLive) {
            $.timeToLive = timeToLive;
            return this;
        }

        public Builder timeToLive(Object timeToLive) {
            return timeToLive(Output.of(timeToLive));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder version(Output<Object> version) {
            $.version = version;
            return this;
        }

        public Builder version(Object version) {
            return version(Output.of(version));
        }

        public Builder virtualNetworkId(@Nullable Output<Object> virtualNetworkId) {
            $.virtualNetworkId = virtualNetworkId;
            return this;
        }

        public Builder virtualNetworkId(Object virtualNetworkId) {
            return virtualNetworkId(Output.of(virtualNetworkId));
        }

        public Builder yarnConfiguration(@Nullable Output<Object> yarnConfiguration) {
            $.yarnConfiguration = yarnConfiguration;
            return this;
        }

        public Builder yarnConfiguration(Object yarnConfiguration) {
            return yarnConfiguration(Output.of(yarnConfiguration));
        }

        public Builder zookeeperNodeSize(@Nullable Output<Object> zookeeperNodeSize) {
            $.zookeeperNodeSize = zookeeperNodeSize;
            return this;
        }

        public Builder zookeeperNodeSize(Object zookeeperNodeSize) {
            return zookeeperNodeSize(Output.of(zookeeperNodeSize));
        }

        public HDInsightOnDemandLinkedServiceArgs build() {
            $.clusterResourceGroup = Objects.requireNonNull($.clusterResourceGroup, "expected parameter 'clusterResourceGroup' to be non-null");
            $.clusterSize = Objects.requireNonNull($.clusterSize, "expected parameter 'clusterSize' to be non-null");
            $.hostSubscriptionId = Objects.requireNonNull($.hostSubscriptionId, "expected parameter 'hostSubscriptionId' to be non-null");
            $.linkedServiceName = Objects.requireNonNull($.linkedServiceName, "expected parameter 'linkedServiceName' to be non-null");
            $.tenant = Objects.requireNonNull($.tenant, "expected parameter 'tenant' to be non-null");
            $.timeToLive = Objects.requireNonNull($.timeToLive, "expected parameter 'timeToLive' to be non-null");
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}
