// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.aws.mq.outputs.GetBrokerConfiguration;
import io.pulumi.aws.mq.outputs.GetBrokerEncryptionOption;
import io.pulumi.aws.mq.outputs.GetBrokerInstance;
import io.pulumi.aws.mq.outputs.GetBrokerLdapServerMetadata;
import io.pulumi.aws.mq.outputs.GetBrokerLogs;
import io.pulumi.aws.mq.outputs.GetBrokerMaintenanceWindowStartTime;
import io.pulumi.aws.mq.outputs.GetBrokerUser;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetBrokerResult {
    private final String arn;
    private final String authenticationStrategy;
    private final Boolean autoMinorVersionUpgrade;
    private final String brokerId;
    private final String brokerName;
    private final GetBrokerConfiguration configuration;
    private final String deploymentMode;
    private final List<GetBrokerEncryptionOption> encryptionOptions;
    private final String engineType;
    private final String engineVersion;
    private final String hostInstanceType;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetBrokerInstance> instances;
    private final List<GetBrokerLdapServerMetadata> ldapServerMetadatas;
    private final GetBrokerLogs logs;
    private final GetBrokerMaintenanceWindowStartTime maintenanceWindowStartTime;
    private final Boolean publiclyAccessible;
    private final List<String> securityGroups;
    private final String storageType;
    private final List<String> subnetIds;
    private final Map<String,String> tags;
    private final List<GetBrokerUser> users;

    @OutputCustomType.Constructor
    private GetBrokerResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("authenticationStrategy") String authenticationStrategy,
        @OutputCustomType.Parameter("autoMinorVersionUpgrade") Boolean autoMinorVersionUpgrade,
        @OutputCustomType.Parameter("brokerId") String brokerId,
        @OutputCustomType.Parameter("brokerName") String brokerName,
        @OutputCustomType.Parameter("configuration") GetBrokerConfiguration configuration,
        @OutputCustomType.Parameter("deploymentMode") String deploymentMode,
        @OutputCustomType.Parameter("encryptionOptions") List<GetBrokerEncryptionOption> encryptionOptions,
        @OutputCustomType.Parameter("engineType") String engineType,
        @OutputCustomType.Parameter("engineVersion") String engineVersion,
        @OutputCustomType.Parameter("hostInstanceType") String hostInstanceType,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("instances") List<GetBrokerInstance> instances,
        @OutputCustomType.Parameter("ldapServerMetadatas") List<GetBrokerLdapServerMetadata> ldapServerMetadatas,
        @OutputCustomType.Parameter("logs") GetBrokerLogs logs,
        @OutputCustomType.Parameter("maintenanceWindowStartTime") GetBrokerMaintenanceWindowStartTime maintenanceWindowStartTime,
        @OutputCustomType.Parameter("publiclyAccessible") Boolean publiclyAccessible,
        @OutputCustomType.Parameter("securityGroups") List<String> securityGroups,
        @OutputCustomType.Parameter("storageType") String storageType,
        @OutputCustomType.Parameter("subnetIds") List<String> subnetIds,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("users") List<GetBrokerUser> users) {
        this.arn = arn;
        this.authenticationStrategy = authenticationStrategy;
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        this.brokerId = brokerId;
        this.brokerName = brokerName;
        this.configuration = configuration;
        this.deploymentMode = deploymentMode;
        this.encryptionOptions = encryptionOptions;
        this.engineType = engineType;
        this.engineVersion = engineVersion;
        this.hostInstanceType = hostInstanceType;
        this.id = id;
        this.instances = instances;
        this.ldapServerMetadatas = ldapServerMetadatas;
        this.logs = logs;
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
        this.publiclyAccessible = publiclyAccessible;
        this.securityGroups = securityGroups;
        this.storageType = storageType;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.users = users;
    }

    public String getArn() {
        return this.arn;
    }
    public String getAuthenticationStrategy() {
        return this.authenticationStrategy;
    }
    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }
    public String getBrokerId() {
        return this.brokerId;
    }
    public String getBrokerName() {
        return this.brokerName;
    }
    public GetBrokerConfiguration getConfiguration() {
        return this.configuration;
    }
    public String getDeploymentMode() {
        return this.deploymentMode;
    }
    public List<GetBrokerEncryptionOption> getEncryptionOptions() {
        return this.encryptionOptions;
    }
    public String getEngineType() {
        return this.engineType;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }
    public String getHostInstanceType() {
        return this.hostInstanceType;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<GetBrokerInstance> getInstances() {
        return this.instances;
    }
    public List<GetBrokerLdapServerMetadata> getLdapServerMetadatas() {
        return this.ldapServerMetadatas;
    }
    public GetBrokerLogs getLogs() {
        return this.logs;
    }
    public GetBrokerMaintenanceWindowStartTime getMaintenanceWindowStartTime() {
        return this.maintenanceWindowStartTime;
    }
    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    public String getStorageType() {
        return this.storageType;
    }
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public List<GetBrokerUser> getUsers() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBrokerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String authenticationStrategy;
        private Boolean autoMinorVersionUpgrade;
        private String brokerId;
        private String brokerName;
        private GetBrokerConfiguration configuration;
        private String deploymentMode;
        private List<GetBrokerEncryptionOption> encryptionOptions;
        private String engineType;
        private String engineVersion;
        private String hostInstanceType;
        private String id;
        private List<GetBrokerInstance> instances;
        private List<GetBrokerLdapServerMetadata> ldapServerMetadatas;
        private GetBrokerLogs logs;
        private GetBrokerMaintenanceWindowStartTime maintenanceWindowStartTime;
        private Boolean publiclyAccessible;
        private List<String> securityGroups;
        private String storageType;
        private List<String> subnetIds;
        private Map<String,String> tags;
        private List<GetBrokerUser> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBrokerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.authenticationStrategy = defaults.authenticationStrategy;
    	      this.autoMinorVersionUpgrade = defaults.autoMinorVersionUpgrade;
    	      this.brokerId = defaults.brokerId;
    	      this.brokerName = defaults.brokerName;
    	      this.configuration = defaults.configuration;
    	      this.deploymentMode = defaults.deploymentMode;
    	      this.encryptionOptions = defaults.encryptionOptions;
    	      this.engineType = defaults.engineType;
    	      this.engineVersion = defaults.engineVersion;
    	      this.hostInstanceType = defaults.hostInstanceType;
    	      this.id = defaults.id;
    	      this.instances = defaults.instances;
    	      this.ldapServerMetadatas = defaults.ldapServerMetadatas;
    	      this.logs = defaults.logs;
    	      this.maintenanceWindowStartTime = defaults.maintenanceWindowStartTime;
    	      this.publiclyAccessible = defaults.publiclyAccessible;
    	      this.securityGroups = defaults.securityGroups;
    	      this.storageType = defaults.storageType;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.users = defaults.users;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder authenticationStrategy(String authenticationStrategy) {
            this.authenticationStrategy = Objects.requireNonNull(authenticationStrategy);
            return this;
        }

        public Builder autoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
            this.autoMinorVersionUpgrade = Objects.requireNonNull(autoMinorVersionUpgrade);
            return this;
        }

        public Builder brokerId(String brokerId) {
            this.brokerId = Objects.requireNonNull(brokerId);
            return this;
        }

        public Builder brokerName(String brokerName) {
            this.brokerName = Objects.requireNonNull(brokerName);
            return this;
        }

        public Builder configuration(GetBrokerConfiguration configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }

        public Builder deploymentMode(String deploymentMode) {
            this.deploymentMode = Objects.requireNonNull(deploymentMode);
            return this;
        }

        public Builder encryptionOptions(List<GetBrokerEncryptionOption> encryptionOptions) {
            this.encryptionOptions = Objects.requireNonNull(encryptionOptions);
            return this;
        }

        public Builder engineType(String engineType) {
            this.engineType = Objects.requireNonNull(engineType);
            return this;
        }

        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }

        public Builder hostInstanceType(String hostInstanceType) {
            this.hostInstanceType = Objects.requireNonNull(hostInstanceType);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder instances(List<GetBrokerInstance> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }

        public Builder ldapServerMetadatas(List<GetBrokerLdapServerMetadata> ldapServerMetadatas) {
            this.ldapServerMetadatas = Objects.requireNonNull(ldapServerMetadatas);
            return this;
        }

        public Builder logs(GetBrokerLogs logs) {
            this.logs = Objects.requireNonNull(logs);
            return this;
        }

        public Builder maintenanceWindowStartTime(GetBrokerMaintenanceWindowStartTime maintenanceWindowStartTime) {
            this.maintenanceWindowStartTime = Objects.requireNonNull(maintenanceWindowStartTime);
            return this;
        }

        public Builder publiclyAccessible(Boolean publiclyAccessible) {
            this.publiclyAccessible = Objects.requireNonNull(publiclyAccessible);
            return this;
        }

        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }

        public Builder storageType(String storageType) {
            this.storageType = Objects.requireNonNull(storageType);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder users(List<GetBrokerUser> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public GetBrokerResult build() {
            return new GetBrokerResult(arn, authenticationStrategy, autoMinorVersionUpgrade, brokerId, brokerName, configuration, deploymentMode, encryptionOptions, engineType, engineVersion, hostInstanceType, id, instances, ldapServerMetadatas, logs, maintenanceWindowStartTime, publiclyAccessible, securityGroups, storageType, subnetIds, tags, users);
        }
    }
}
