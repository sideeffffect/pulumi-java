// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.aws.elasticsearch.outputs.GetDomainAdvancedSecurityOption;
import io.pulumi.aws.elasticsearch.outputs.GetDomainAutoTuneOption;
import io.pulumi.aws.elasticsearch.outputs.GetDomainClusterConfig;
import io.pulumi.aws.elasticsearch.outputs.GetDomainCognitoOption;
import io.pulumi.aws.elasticsearch.outputs.GetDomainEbsOption;
import io.pulumi.aws.elasticsearch.outputs.GetDomainEncryptionAtRest;
import io.pulumi.aws.elasticsearch.outputs.GetDomainLogPublishingOption;
import io.pulumi.aws.elasticsearch.outputs.GetDomainNodeToNodeEncryption;
import io.pulumi.aws.elasticsearch.outputs.GetDomainSnapshotOption;
import io.pulumi.aws.elasticsearch.outputs.GetDomainVpcOption;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDomainResult {
    /**
     * The policy document attached to the domain.
     * 
     */
    private final String accessPolicies;
    /**
     * Key-value string pairs to specify advanced configuration options.
     * 
     */
    private final Map<String,String> advancedOptions;
    /**
     * Status of the Elasticsearch domain's advanced security options. The block consists of the following attributes:
     * 
     */
    private final List<GetDomainAdvancedSecurityOption> advancedSecurityOptions;
    /**
     * The Amazon Resource Name (ARN) of the domain.
     * 
     */
    private final String arn;
    /**
     * Configuration of the Auto-Tune options of the domain.
     * 
     */
    private final List<GetDomainAutoTuneOption> autoTuneOptions;
    /**
     * Cluster configuration of the domain.
     * 
     */
    private final List<GetDomainClusterConfig> clusterConfigs;
    /**
     * Domain Amazon Cognito Authentication options for Kibana.
     * 
     */
    private final List<GetDomainCognitoOption> cognitoOptions;
    /**
     * Status of the creation of the domain.
     * 
     */
    private final Boolean created;
    /**
     * Status of the deletion of the domain.
     * 
     */
    private final Boolean deleted;
    /**
     * Unique identifier for the domain.
     * 
     */
    private final String domainId;
    private final String domainName;
    /**
     * EBS Options for the instances in the domain.
     * 
     */
    private final List<GetDomainEbsOption> ebsOptions;
    /**
     * Elasticsearch version for the domain.
     * 
     */
    private final String elasticsearchVersion;
    /**
     * Domain encryption at rest related options.
     * 
     */
    private final List<GetDomainEncryptionAtRest> encryptionAtRests;
    /**
     * Domain-specific endpoint used to submit index, search, and data upload requests.
     * 
     */
    private final String endpoint;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Domain-specific endpoint used to access the Kibana application.
     * 
     */
    private final String kibanaEndpoint;
    /**
     * Domain log publishing related options.
     * 
     */
    private final List<GetDomainLogPublishingOption> logPublishingOptions;
    /**
     * Domain in transit encryption related options.
     * 
     */
    private final List<GetDomainNodeToNodeEncryption> nodeToNodeEncryptions;
    /**
     * Status of a configuration change in the domain.
     * * `snapshot_options` – Domain snapshot related options.
     * 
     */
    private final Boolean processing;
    private final List<GetDomainSnapshotOption> snapshotOptions;
    /**
     * The tags assigned to the domain.
     * 
     */
    private final Map<String,String> tags;
    /**
     * VPC Options for private Elasticsearch domains.
     * 
     */
    private final List<GetDomainVpcOption> vpcOptions;

    @OutputCustomType.Constructor({"accessPolicies","advancedOptions","advancedSecurityOptions","arn","autoTuneOptions","clusterConfigs","cognitoOptions","created","deleted","domainId","domainName","ebsOptions","elasticsearchVersion","encryptionAtRests","endpoint","id","kibanaEndpoint","logPublishingOptions","nodeToNodeEncryptions","processing","snapshotOptions","tags","vpcOptions"})
    private GetDomainResult(
        String accessPolicies,
        Map<String,String> advancedOptions,
        List<GetDomainAdvancedSecurityOption> advancedSecurityOptions,
        String arn,
        List<GetDomainAutoTuneOption> autoTuneOptions,
        List<GetDomainClusterConfig> clusterConfigs,
        List<GetDomainCognitoOption> cognitoOptions,
        Boolean created,
        Boolean deleted,
        String domainId,
        String domainName,
        List<GetDomainEbsOption> ebsOptions,
        String elasticsearchVersion,
        List<GetDomainEncryptionAtRest> encryptionAtRests,
        String endpoint,
        String id,
        String kibanaEndpoint,
        List<GetDomainLogPublishingOption> logPublishingOptions,
        List<GetDomainNodeToNodeEncryption> nodeToNodeEncryptions,
        Boolean processing,
        List<GetDomainSnapshotOption> snapshotOptions,
        Map<String,String> tags,
        List<GetDomainVpcOption> vpcOptions) {
        this.accessPolicies = accessPolicies;
        this.advancedOptions = advancedOptions;
        this.advancedSecurityOptions = advancedSecurityOptions;
        this.arn = arn;
        this.autoTuneOptions = autoTuneOptions;
        this.clusterConfigs = clusterConfigs;
        this.cognitoOptions = cognitoOptions;
        this.created = created;
        this.deleted = deleted;
        this.domainId = domainId;
        this.domainName = domainName;
        this.ebsOptions = ebsOptions;
        this.elasticsearchVersion = elasticsearchVersion;
        this.encryptionAtRests = encryptionAtRests;
        this.endpoint = endpoint;
        this.id = id;
        this.kibanaEndpoint = kibanaEndpoint;
        this.logPublishingOptions = logPublishingOptions;
        this.nodeToNodeEncryptions = nodeToNodeEncryptions;
        this.processing = processing;
        this.snapshotOptions = snapshotOptions;
        this.tags = tags;
        this.vpcOptions = vpcOptions;
    }

    /**
     * The policy document attached to the domain.
     * 
    */
    public String getAccessPolicies() {
        return this.accessPolicies;
    }
    /**
     * Key-value string pairs to specify advanced configuration options.
     * 
    */
    public Map<String,String> getAdvancedOptions() {
        return this.advancedOptions;
    }
    /**
     * Status of the Elasticsearch domain's advanced security options. The block consists of the following attributes:
     * 
    */
    public List<GetDomainAdvancedSecurityOption> getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }
    /**
     * The Amazon Resource Name (ARN) of the domain.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Configuration of the Auto-Tune options of the domain.
     * 
    */
    public List<GetDomainAutoTuneOption> getAutoTuneOptions() {
        return this.autoTuneOptions;
    }
    /**
     * Cluster configuration of the domain.
     * 
    */
    public List<GetDomainClusterConfig> getClusterConfigs() {
        return this.clusterConfigs;
    }
    /**
     * Domain Amazon Cognito Authentication options for Kibana.
     * 
    */
    public List<GetDomainCognitoOption> getCognitoOptions() {
        return this.cognitoOptions;
    }
    /**
     * Status of the creation of the domain.
     * 
    */
    public Boolean getCreated() {
        return this.created;
    }
    /**
     * Status of the deletion of the domain.
     * 
    */
    public Boolean getDeleted() {
        return this.deleted;
    }
    /**
     * Unique identifier for the domain.
     * 
    */
    public String getDomainId() {
        return this.domainId;
    }
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * EBS Options for the instances in the domain.
     * 
    */
    public List<GetDomainEbsOption> getEbsOptions() {
        return this.ebsOptions;
    }
    /**
     * Elasticsearch version for the domain.
     * 
    */
    public String getElasticsearchVersion() {
        return this.elasticsearchVersion;
    }
    /**
     * Domain encryption at rest related options.
     * 
    */
    public List<GetDomainEncryptionAtRest> getEncryptionAtRests() {
        return this.encryptionAtRests;
    }
    /**
     * Domain-specific endpoint used to submit index, search, and data upload requests.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Domain-specific endpoint used to access the Kibana application.
     * 
    */
    public String getKibanaEndpoint() {
        return this.kibanaEndpoint;
    }
    /**
     * Domain log publishing related options.
     * 
    */
    public List<GetDomainLogPublishingOption> getLogPublishingOptions() {
        return this.logPublishingOptions;
    }
    /**
     * Domain in transit encryption related options.
     * 
    */
    public List<GetDomainNodeToNodeEncryption> getNodeToNodeEncryptions() {
        return this.nodeToNodeEncryptions;
    }
    /**
     * Status of a configuration change in the domain.
     * * `snapshot_options` – Domain snapshot related options.
     * 
    */
    public Boolean getProcessing() {
        return this.processing;
    }
    public List<GetDomainSnapshotOption> getSnapshotOptions() {
        return this.snapshotOptions;
    }
    /**
     * The tags assigned to the domain.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * VPC Options for private Elasticsearch domains.
     * 
    */
    public List<GetDomainVpcOption> getVpcOptions() {
        return this.vpcOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessPolicies;
        private Map<String,String> advancedOptions;
        private List<GetDomainAdvancedSecurityOption> advancedSecurityOptions;
        private String arn;
        private List<GetDomainAutoTuneOption> autoTuneOptions;
        private List<GetDomainClusterConfig> clusterConfigs;
        private List<GetDomainCognitoOption> cognitoOptions;
        private Boolean created;
        private Boolean deleted;
        private String domainId;
        private String domainName;
        private List<GetDomainEbsOption> ebsOptions;
        private String elasticsearchVersion;
        private List<GetDomainEncryptionAtRest> encryptionAtRests;
        private String endpoint;
        private String id;
        private String kibanaEndpoint;
        private List<GetDomainLogPublishingOption> logPublishingOptions;
        private List<GetDomainNodeToNodeEncryption> nodeToNodeEncryptions;
        private Boolean processing;
        private List<GetDomainSnapshotOption> snapshotOptions;
        private Map<String,String> tags;
        private List<GetDomainVpcOption> vpcOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
    	      this.advancedOptions = defaults.advancedOptions;
    	      this.advancedSecurityOptions = defaults.advancedSecurityOptions;
    	      this.arn = defaults.arn;
    	      this.autoTuneOptions = defaults.autoTuneOptions;
    	      this.clusterConfigs = defaults.clusterConfigs;
    	      this.cognitoOptions = defaults.cognitoOptions;
    	      this.created = defaults.created;
    	      this.deleted = defaults.deleted;
    	      this.domainId = defaults.domainId;
    	      this.domainName = defaults.domainName;
    	      this.ebsOptions = defaults.ebsOptions;
    	      this.elasticsearchVersion = defaults.elasticsearchVersion;
    	      this.encryptionAtRests = defaults.encryptionAtRests;
    	      this.endpoint = defaults.endpoint;
    	      this.id = defaults.id;
    	      this.kibanaEndpoint = defaults.kibanaEndpoint;
    	      this.logPublishingOptions = defaults.logPublishingOptions;
    	      this.nodeToNodeEncryptions = defaults.nodeToNodeEncryptions;
    	      this.processing = defaults.processing;
    	      this.snapshotOptions = defaults.snapshotOptions;
    	      this.tags = defaults.tags;
    	      this.vpcOptions = defaults.vpcOptions;
        }

        public Builder setAccessPolicies(String accessPolicies) {
            this.accessPolicies = Objects.requireNonNull(accessPolicies);
            return this;
        }

        public Builder setAdvancedOptions(Map<String,String> advancedOptions) {
            this.advancedOptions = Objects.requireNonNull(advancedOptions);
            return this;
        }

        public Builder setAdvancedSecurityOptions(List<GetDomainAdvancedSecurityOption> advancedSecurityOptions) {
            this.advancedSecurityOptions = Objects.requireNonNull(advancedSecurityOptions);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAutoTuneOptions(List<GetDomainAutoTuneOption> autoTuneOptions) {
            this.autoTuneOptions = Objects.requireNonNull(autoTuneOptions);
            return this;
        }

        public Builder setClusterConfigs(List<GetDomainClusterConfig> clusterConfigs) {
            this.clusterConfigs = Objects.requireNonNull(clusterConfigs);
            return this;
        }

        public Builder setCognitoOptions(List<GetDomainCognitoOption> cognitoOptions) {
            this.cognitoOptions = Objects.requireNonNull(cognitoOptions);
            return this;
        }

        public Builder setCreated(Boolean created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setDeleted(Boolean deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }

        public Builder setDomainId(String domainId) {
            this.domainId = Objects.requireNonNull(domainId);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setEbsOptions(List<GetDomainEbsOption> ebsOptions) {
            this.ebsOptions = Objects.requireNonNull(ebsOptions);
            return this;
        }

        public Builder setElasticsearchVersion(String elasticsearchVersion) {
            this.elasticsearchVersion = Objects.requireNonNull(elasticsearchVersion);
            return this;
        }

        public Builder setEncryptionAtRests(List<GetDomainEncryptionAtRest> encryptionAtRests) {
            this.encryptionAtRests = Objects.requireNonNull(encryptionAtRests);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKibanaEndpoint(String kibanaEndpoint) {
            this.kibanaEndpoint = Objects.requireNonNull(kibanaEndpoint);
            return this;
        }

        public Builder setLogPublishingOptions(List<GetDomainLogPublishingOption> logPublishingOptions) {
            this.logPublishingOptions = Objects.requireNonNull(logPublishingOptions);
            return this;
        }

        public Builder setNodeToNodeEncryptions(List<GetDomainNodeToNodeEncryption> nodeToNodeEncryptions) {
            this.nodeToNodeEncryptions = Objects.requireNonNull(nodeToNodeEncryptions);
            return this;
        }

        public Builder setProcessing(Boolean processing) {
            this.processing = Objects.requireNonNull(processing);
            return this;
        }

        public Builder setSnapshotOptions(List<GetDomainSnapshotOption> snapshotOptions) {
            this.snapshotOptions = Objects.requireNonNull(snapshotOptions);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpcOptions(List<GetDomainVpcOption> vpcOptions) {
            this.vpcOptions = Objects.requireNonNull(vpcOptions);
            return this;
        }
        public GetDomainResult build() {
            return new GetDomainResult(accessPolicies, advancedOptions, advancedSecurityOptions, arn, autoTuneOptions, clusterConfigs, cognitoOptions, created, deleted, domainId, domainName, ebsOptions, elasticsearchVersion, encryptionAtRests, endpoint, id, kibanaEndpoint, logPublishingOptions, nodeToNodeEncryptions, processing, snapshotOptions, tags, vpcOptions);
        }
    }
}
