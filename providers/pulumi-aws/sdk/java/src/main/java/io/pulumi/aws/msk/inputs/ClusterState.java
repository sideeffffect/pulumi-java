// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterBrokerNodeGroupInfoGetArgs;
import io.pulumi.aws.msk.inputs.ClusterClientAuthenticationGetArgs;
import io.pulumi.aws.msk.inputs.ClusterConfigurationInfoGetArgs;
import io.pulumi.aws.msk.inputs.ClusterEncryptionInfoGetArgs;
import io.pulumi.aws.msk.inputs.ClusterLoggingInfoGetArgs;
import io.pulumi.aws.msk.inputs.ClusterOpenMonitoringGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * Amazon Resource Name (ARN) of the MSK Configuration to use in the cluster.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Comma separated list of one or more hostname:port pairs of kafka brokers suitable to bootstrap connectivity to the kafka cluster. Contains a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `PLAINTEXT` or `TLS_PLAINTEXT`. The resource sorts values alphabetically. AWS may not always return all endpoints so this value is not guaranteed to be stable across applies.
     * 
     */
    @InputImport(name="bootstrapBrokers")
      private final @Nullable Input<String> bootstrapBrokers;

    public Input<String> getBootstrapBrokers() {
        return this.bootstrapBrokers == null ? Input.empty() : this.bootstrapBrokers;
    }

    /**
     * One or more DNS names (or IP addresses) and SASL IAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9098`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.iam` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @InputImport(name="bootstrapBrokersSaslIam")
      private final @Nullable Input<String> bootstrapBrokersSaslIam;

    public Input<String> getBootstrapBrokersSaslIam() {
        return this.bootstrapBrokersSaslIam == null ? Input.empty() : this.bootstrapBrokersSaslIam;
    }

    /**
     * One or more DNS names (or IP addresses) and SASL SCRAM port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9096`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS` and `client_authentication.0.sasl.0.scram` is set to `true`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @InputImport(name="bootstrapBrokersSaslScram")
      private final @Nullable Input<String> bootstrapBrokersSaslScram;

    public Input<String> getBootstrapBrokersSaslScram() {
        return this.bootstrapBrokersSaslScram == null ? Input.empty() : this.bootstrapBrokersSaslScram;
    }

    /**
     * One or more DNS names (or IP addresses) and TLS port pairs. For example, `b-1.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-2.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094,b-3.exampleClusterName.abcde.c2.kafka.us-east-1.amazonaws.com:9094`. This attribute will have a value if `encryption_info.0.encryption_in_transit.0.client_broker` is set to `TLS_PLAINTEXT` or `TLS`. The resource sorts the list alphabetically. AWS may not always return all endpoints so the values may not be stable across applies.
     * 
     */
    @InputImport(name="bootstrapBrokersTls")
      private final @Nullable Input<String> bootstrapBrokersTls;

    public Input<String> getBootstrapBrokersTls() {
        return this.bootstrapBrokersTls == null ? Input.empty() : this.bootstrapBrokersTls;
    }

    /**
     * Configuration block for the broker nodes of the Kafka cluster.
     * 
     */
    @InputImport(name="brokerNodeGroupInfo")
      private final @Nullable Input<ClusterBrokerNodeGroupInfoGetArgs> brokerNodeGroupInfo;

    public Input<ClusterBrokerNodeGroupInfoGetArgs> getBrokerNodeGroupInfo() {
        return this.brokerNodeGroupInfo == null ? Input.empty() : this.brokerNodeGroupInfo;
    }

    /**
     * Configuration block for specifying a client authentication. See below.
     * 
     */
    @InputImport(name="clientAuthentication")
      private final @Nullable Input<ClusterClientAuthenticationGetArgs> clientAuthentication;

    public Input<ClusterClientAuthenticationGetArgs> getClientAuthentication() {
        return this.clientAuthentication == null ? Input.empty() : this.clientAuthentication;
    }

    /**
     * Name of the MSK cluster.
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * Configuration block for specifying a MSK Configuration to attach to Kafka brokers. See below.
     * 
     */
    @InputImport(name="configurationInfo")
      private final @Nullable Input<ClusterConfigurationInfoGetArgs> configurationInfo;

    public Input<ClusterConfigurationInfoGetArgs> getConfigurationInfo() {
        return this.configurationInfo == null ? Input.empty() : this.configurationInfo;
    }

    /**
     * Current version of the MSK Cluster used for updates, e.g., `K13V1IB3VIYZZH`
     * * `encryption_info.0.encryption_at_rest_kms_key_arn` - The ARN of the KMS key used for encryption at rest of the broker data volumes.
     * 
     */
    @InputImport(name="currentVersion")
      private final @Nullable Input<String> currentVersion;

    public Input<String> getCurrentVersion() {
        return this.currentVersion == null ? Input.empty() : this.currentVersion;
    }

    /**
     * Configuration block for specifying encryption. See below.
     * 
     */
    @InputImport(name="encryptionInfo")
      private final @Nullable Input<ClusterEncryptionInfoGetArgs> encryptionInfo;

    public Input<ClusterEncryptionInfoGetArgs> getEncryptionInfo() {
        return this.encryptionInfo == null ? Input.empty() : this.encryptionInfo;
    }

    /**
     * Specify the desired enhanced MSK CloudWatch monitoring level.  See [Monitoring Amazon MSK with Amazon CloudWatch](https://docs.aws.amazon.com/msk/latest/developerguide/monitoring.html)
     * 
     */
    @InputImport(name="enhancedMonitoring")
      private final @Nullable Input<String> enhancedMonitoring;

    public Input<String> getEnhancedMonitoring() {
        return this.enhancedMonitoring == null ? Input.empty() : this.enhancedMonitoring;
    }

    /**
     * Specify the desired Kafka software version.
     * 
     */
    @InputImport(name="kafkaVersion")
      private final @Nullable Input<String> kafkaVersion;

    public Input<String> getKafkaVersion() {
        return this.kafkaVersion == null ? Input.empty() : this.kafkaVersion;
    }

    /**
     * Configuration block for streaming broker logs to Cloudwatch/S3/Kinesis Firehose. See below.
     * 
     */
    @InputImport(name="loggingInfo")
      private final @Nullable Input<ClusterLoggingInfoGetArgs> loggingInfo;

    public Input<ClusterLoggingInfoGetArgs> getLoggingInfo() {
        return this.loggingInfo == null ? Input.empty() : this.loggingInfo;
    }

    /**
     * The desired total number of broker nodes in the kafka cluster.  It must be a multiple of the number of specified client subnets.
     * 
     */
    @InputImport(name="numberOfBrokerNodes")
      private final @Nullable Input<Integer> numberOfBrokerNodes;

    public Input<Integer> getNumberOfBrokerNodes() {
        return this.numberOfBrokerNodes == null ? Input.empty() : this.numberOfBrokerNodes;
    }

    /**
     * Configuration block for JMX and Node monitoring for the MSK cluster. See below.
     * 
     */
    @InputImport(name="openMonitoring")
      private final @Nullable Input<ClusterOpenMonitoringGetArgs> openMonitoring;

    public Input<ClusterOpenMonitoringGetArgs> getOpenMonitoring() {
        return this.openMonitoring == null ? Input.empty() : this.openMonitoring;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    @InputImport(name="zookeeperConnectString")
      private final @Nullable Input<String> zookeeperConnectString;

    public Input<String> getZookeeperConnectString() {
        return this.zookeeperConnectString == null ? Input.empty() : this.zookeeperConnectString;
    }

    /**
     * A comma separated list of one or more hostname:port pairs to use to connect to the Apache Zookeeper cluster via TLS. The returned values are sorted alphbetically. The AWS API may not return all endpoints, so this value is not guaranteed to be stable across applies.
     * 
     */
    @InputImport(name="zookeeperConnectStringTls")
      private final @Nullable Input<String> zookeeperConnectStringTls;

    public Input<String> getZookeeperConnectStringTls() {
        return this.zookeeperConnectStringTls == null ? Input.empty() : this.zookeeperConnectStringTls;
    }

    public ClusterState(
        @Nullable Input<String> arn,
        @Nullable Input<String> bootstrapBrokers,
        @Nullable Input<String> bootstrapBrokersSaslIam,
        @Nullable Input<String> bootstrapBrokersSaslScram,
        @Nullable Input<String> bootstrapBrokersTls,
        @Nullable Input<ClusterBrokerNodeGroupInfoGetArgs> brokerNodeGroupInfo,
        @Nullable Input<ClusterClientAuthenticationGetArgs> clientAuthentication,
        @Nullable Input<String> clusterName,
        @Nullable Input<ClusterConfigurationInfoGetArgs> configurationInfo,
        @Nullable Input<String> currentVersion,
        @Nullable Input<ClusterEncryptionInfoGetArgs> encryptionInfo,
        @Nullable Input<String> enhancedMonitoring,
        @Nullable Input<String> kafkaVersion,
        @Nullable Input<ClusterLoggingInfoGetArgs> loggingInfo,
        @Nullable Input<Integer> numberOfBrokerNodes,
        @Nullable Input<ClusterOpenMonitoringGetArgs> openMonitoring,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> zookeeperConnectString,
        @Nullable Input<String> zookeeperConnectStringTls) {
        this.arn = arn;
        this.bootstrapBrokers = bootstrapBrokers;
        this.bootstrapBrokersSaslIam = bootstrapBrokersSaslIam;
        this.bootstrapBrokersSaslScram = bootstrapBrokersSaslScram;
        this.bootstrapBrokersTls = bootstrapBrokersTls;
        this.brokerNodeGroupInfo = brokerNodeGroupInfo;
        this.clientAuthentication = clientAuthentication;
        this.clusterName = clusterName;
        this.configurationInfo = configurationInfo;
        this.currentVersion = currentVersion;
        this.encryptionInfo = encryptionInfo;
        this.enhancedMonitoring = enhancedMonitoring;
        this.kafkaVersion = kafkaVersion;
        this.loggingInfo = loggingInfo;
        this.numberOfBrokerNodes = numberOfBrokerNodes;
        this.openMonitoring = openMonitoring;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.zookeeperConnectString = zookeeperConnectString;
        this.zookeeperConnectStringTls = zookeeperConnectStringTls;
    }

    private ClusterState() {
        this.arn = Input.empty();
        this.bootstrapBrokers = Input.empty();
        this.bootstrapBrokersSaslIam = Input.empty();
        this.bootstrapBrokersSaslScram = Input.empty();
        this.bootstrapBrokersTls = Input.empty();
        this.brokerNodeGroupInfo = Input.empty();
        this.clientAuthentication = Input.empty();
        this.clusterName = Input.empty();
        this.configurationInfo = Input.empty();
        this.currentVersion = Input.empty();
        this.encryptionInfo = Input.empty();
        this.enhancedMonitoring = Input.empty();
        this.kafkaVersion = Input.empty();
        this.loggingInfo = Input.empty();
        this.numberOfBrokerNodes = Input.empty();
        this.openMonitoring = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.zookeeperConnectString = Input.empty();
        this.zookeeperConnectStringTls = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> bootstrapBrokers;
        private @Nullable Input<String> bootstrapBrokersSaslIam;
        private @Nullable Input<String> bootstrapBrokersSaslScram;
        private @Nullable Input<String> bootstrapBrokersTls;
        private @Nullable Input<ClusterBrokerNodeGroupInfoGetArgs> brokerNodeGroupInfo;
        private @Nullable Input<ClusterClientAuthenticationGetArgs> clientAuthentication;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<ClusterConfigurationInfoGetArgs> configurationInfo;
        private @Nullable Input<String> currentVersion;
        private @Nullable Input<ClusterEncryptionInfoGetArgs> encryptionInfo;
        private @Nullable Input<String> enhancedMonitoring;
        private @Nullable Input<String> kafkaVersion;
        private @Nullable Input<ClusterLoggingInfoGetArgs> loggingInfo;
        private @Nullable Input<Integer> numberOfBrokerNodes;
        private @Nullable Input<ClusterOpenMonitoringGetArgs> openMonitoring;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> zookeeperConnectString;
        private @Nullable Input<String> zookeeperConnectStringTls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bootstrapBrokers = defaults.bootstrapBrokers;
    	      this.bootstrapBrokersSaslIam = defaults.bootstrapBrokersSaslIam;
    	      this.bootstrapBrokersSaslScram = defaults.bootstrapBrokersSaslScram;
    	      this.bootstrapBrokersTls = defaults.bootstrapBrokersTls;
    	      this.brokerNodeGroupInfo = defaults.brokerNodeGroupInfo;
    	      this.clientAuthentication = defaults.clientAuthentication;
    	      this.clusterName = defaults.clusterName;
    	      this.configurationInfo = defaults.configurationInfo;
    	      this.currentVersion = defaults.currentVersion;
    	      this.encryptionInfo = defaults.encryptionInfo;
    	      this.enhancedMonitoring = defaults.enhancedMonitoring;
    	      this.kafkaVersion = defaults.kafkaVersion;
    	      this.loggingInfo = defaults.loggingInfo;
    	      this.numberOfBrokerNodes = defaults.numberOfBrokerNodes;
    	      this.openMonitoring = defaults.openMonitoring;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.zookeeperConnectString = defaults.zookeeperConnectString;
    	      this.zookeeperConnectStringTls = defaults.zookeeperConnectStringTls;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder bootstrapBrokers(@Nullable Input<String> bootstrapBrokers) {
            this.bootstrapBrokers = bootstrapBrokers;
            return this;
        }

        public Builder bootstrapBrokers(@Nullable String bootstrapBrokers) {
            this.bootstrapBrokers = Input.ofNullable(bootstrapBrokers);
            return this;
        }

        public Builder bootstrapBrokersSaslIam(@Nullable Input<String> bootstrapBrokersSaslIam) {
            this.bootstrapBrokersSaslIam = bootstrapBrokersSaslIam;
            return this;
        }

        public Builder bootstrapBrokersSaslIam(@Nullable String bootstrapBrokersSaslIam) {
            this.bootstrapBrokersSaslIam = Input.ofNullable(bootstrapBrokersSaslIam);
            return this;
        }

        public Builder bootstrapBrokersSaslScram(@Nullable Input<String> bootstrapBrokersSaslScram) {
            this.bootstrapBrokersSaslScram = bootstrapBrokersSaslScram;
            return this;
        }

        public Builder bootstrapBrokersSaslScram(@Nullable String bootstrapBrokersSaslScram) {
            this.bootstrapBrokersSaslScram = Input.ofNullable(bootstrapBrokersSaslScram);
            return this;
        }

        public Builder bootstrapBrokersTls(@Nullable Input<String> bootstrapBrokersTls) {
            this.bootstrapBrokersTls = bootstrapBrokersTls;
            return this;
        }

        public Builder bootstrapBrokersTls(@Nullable String bootstrapBrokersTls) {
            this.bootstrapBrokersTls = Input.ofNullable(bootstrapBrokersTls);
            return this;
        }

        public Builder brokerNodeGroupInfo(@Nullable Input<ClusterBrokerNodeGroupInfoGetArgs> brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = brokerNodeGroupInfo;
            return this;
        }

        public Builder brokerNodeGroupInfo(@Nullable ClusterBrokerNodeGroupInfoGetArgs brokerNodeGroupInfo) {
            this.brokerNodeGroupInfo = Input.ofNullable(brokerNodeGroupInfo);
            return this;
        }

        public Builder clientAuthentication(@Nullable Input<ClusterClientAuthenticationGetArgs> clientAuthentication) {
            this.clientAuthentication = clientAuthentication;
            return this;
        }

        public Builder clientAuthentication(@Nullable ClusterClientAuthenticationGetArgs clientAuthentication) {
            this.clientAuthentication = Input.ofNullable(clientAuthentication);
            return this;
        }

        public Builder clusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder configurationInfo(@Nullable Input<ClusterConfigurationInfoGetArgs> configurationInfo) {
            this.configurationInfo = configurationInfo;
            return this;
        }

        public Builder configurationInfo(@Nullable ClusterConfigurationInfoGetArgs configurationInfo) {
            this.configurationInfo = Input.ofNullable(configurationInfo);
            return this;
        }

        public Builder currentVersion(@Nullable Input<String> currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder currentVersion(@Nullable String currentVersion) {
            this.currentVersion = Input.ofNullable(currentVersion);
            return this;
        }

        public Builder encryptionInfo(@Nullable Input<ClusterEncryptionInfoGetArgs> encryptionInfo) {
            this.encryptionInfo = encryptionInfo;
            return this;
        }

        public Builder encryptionInfo(@Nullable ClusterEncryptionInfoGetArgs encryptionInfo) {
            this.encryptionInfo = Input.ofNullable(encryptionInfo);
            return this;
        }

        public Builder enhancedMonitoring(@Nullable Input<String> enhancedMonitoring) {
            this.enhancedMonitoring = enhancedMonitoring;
            return this;
        }

        public Builder enhancedMonitoring(@Nullable String enhancedMonitoring) {
            this.enhancedMonitoring = Input.ofNullable(enhancedMonitoring);
            return this;
        }

        public Builder kafkaVersion(@Nullable Input<String> kafkaVersion) {
            this.kafkaVersion = kafkaVersion;
            return this;
        }

        public Builder kafkaVersion(@Nullable String kafkaVersion) {
            this.kafkaVersion = Input.ofNullable(kafkaVersion);
            return this;
        }

        public Builder loggingInfo(@Nullable Input<ClusterLoggingInfoGetArgs> loggingInfo) {
            this.loggingInfo = loggingInfo;
            return this;
        }

        public Builder loggingInfo(@Nullable ClusterLoggingInfoGetArgs loggingInfo) {
            this.loggingInfo = Input.ofNullable(loggingInfo);
            return this;
        }

        public Builder numberOfBrokerNodes(@Nullable Input<Integer> numberOfBrokerNodes) {
            this.numberOfBrokerNodes = numberOfBrokerNodes;
            return this;
        }

        public Builder numberOfBrokerNodes(@Nullable Integer numberOfBrokerNodes) {
            this.numberOfBrokerNodes = Input.ofNullable(numberOfBrokerNodes);
            return this;
        }

        public Builder openMonitoring(@Nullable Input<ClusterOpenMonitoringGetArgs> openMonitoring) {
            this.openMonitoring = openMonitoring;
            return this;
        }

        public Builder openMonitoring(@Nullable ClusterOpenMonitoringGetArgs openMonitoring) {
            this.openMonitoring = Input.ofNullable(openMonitoring);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder zookeeperConnectString(@Nullable Input<String> zookeeperConnectString) {
            this.zookeeperConnectString = zookeeperConnectString;
            return this;
        }

        public Builder zookeeperConnectString(@Nullable String zookeeperConnectString) {
            this.zookeeperConnectString = Input.ofNullable(zookeeperConnectString);
            return this;
        }

        public Builder zookeeperConnectStringTls(@Nullable Input<String> zookeeperConnectStringTls) {
            this.zookeeperConnectStringTls = zookeeperConnectStringTls;
            return this;
        }

        public Builder zookeeperConnectStringTls(@Nullable String zookeeperConnectStringTls) {
            this.zookeeperConnectStringTls = Input.ofNullable(zookeeperConnectStringTls);
            return this;
        }
        public ClusterState build() {
            return new ClusterState(arn, bootstrapBrokers, bootstrapBrokersSaslIam, bootstrapBrokersSaslScram, bootstrapBrokersTls, brokerNodeGroupInfo, clientAuthentication, clusterName, configurationInfo, currentVersion, encryptionInfo, enhancedMonitoring, kafkaVersion, loggingInfo, numberOfBrokerNodes, openMonitoring, tags, tagsAll, zookeeperConnectString, zookeeperConnectStringTls);
        }
    }
}
