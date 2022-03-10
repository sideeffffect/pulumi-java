// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.outputs;

import io.pulumi.azurenative.aad.outputs.DomainSecuritySettingsResponse;
import io.pulumi.azurenative.aad.outputs.LdapsSettingsResponse;
import io.pulumi.azurenative.aad.outputs.MigrationPropertiesResponse;
import io.pulumi.azurenative.aad.outputs.NotificationSettingsResponse;
import io.pulumi.azurenative.aad.outputs.ReplicaSetResponse;
import io.pulumi.azurenative.aad.outputs.ResourceForestSettingsResponse;
import io.pulumi.azurenative.aad.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDomainServiceResult {
    /**
     * Deployment Id
     * 
     */
    private final String deploymentId;
    /**
     * Domain Configuration Type
     * 
     */
    private final @Nullable String domainConfigurationType;
    /**
     * The name of the Azure domain that the user would like to deploy Domain Services to.
     * 
     */
    private final @Nullable String domainName;
    /**
     * DomainSecurity Settings
     * 
     */
    private final @Nullable DomainSecuritySettingsResponse domainSecuritySettings;
    /**
     * Resource etag
     * 
     */
    private final @Nullable String etag;
    /**
     * Enabled or Disabled flag to turn on Group-based filtered sync
     * 
     */
    private final @Nullable String filteredSync;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Secure LDAP Settings
     * 
     */
    private final @Nullable LdapsSettingsResponse ldapsSettings;
    /**
     * Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * Migration Properties
     * 
     */
    private final MigrationPropertiesResponse migrationProperties;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Notification Settings
     * 
     */
    private final @Nullable NotificationSettingsResponse notificationSettings;
    /**
     * the current deployment or provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * List of ReplicaSets
     * 
     */
    private final @Nullable List<ReplicaSetResponse> replicaSets;
    /**
     * Resource Forest Settings
     * 
     */
    private final @Nullable ResourceForestSettingsResponse resourceForestSettings;
    /**
     * Sku Type
     * 
     */
    private final @Nullable String sku;
    /**
     * SyncOwner ReplicaSet Id
     * 
     */
    private final String syncOwner;
    /**
     * The system meta data relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure Active Directory Tenant Id
     * 
     */
    private final String tenantId;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * Data Model Version
     * 
     */
    private final Integer version;

    @OutputCustomType.Constructor
    private GetDomainServiceResult(
        @OutputCustomType.Parameter("deploymentId") String deploymentId,
        @OutputCustomType.Parameter("domainConfigurationType") @Nullable String domainConfigurationType,
        @OutputCustomType.Parameter("domainName") @Nullable String domainName,
        @OutputCustomType.Parameter("domainSecuritySettings") @Nullable DomainSecuritySettingsResponse domainSecuritySettings,
        @OutputCustomType.Parameter("etag") @Nullable String etag,
        @OutputCustomType.Parameter("filteredSync") @Nullable String filteredSync,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("ldapsSettings") @Nullable LdapsSettingsResponse ldapsSettings,
        @OutputCustomType.Parameter("location") @Nullable String location,
        @OutputCustomType.Parameter("migrationProperties") MigrationPropertiesResponse migrationProperties,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("notificationSettings") @Nullable NotificationSettingsResponse notificationSettings,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("replicaSets") @Nullable List<ReplicaSetResponse> replicaSets,
        @OutputCustomType.Parameter("resourceForestSettings") @Nullable ResourceForestSettingsResponse resourceForestSettings,
        @OutputCustomType.Parameter("sku") @Nullable String sku,
        @OutputCustomType.Parameter("syncOwner") String syncOwner,
        @OutputCustomType.Parameter("systemData") SystemDataResponse systemData,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("tenantId") String tenantId,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("version") Integer version) {
        this.deploymentId = deploymentId;
        this.domainConfigurationType = domainConfigurationType;
        this.domainName = domainName;
        this.domainSecuritySettings = domainSecuritySettings;
        this.etag = etag;
        this.filteredSync = filteredSync;
        this.id = id;
        this.ldapsSettings = ldapsSettings;
        this.location = location;
        this.migrationProperties = migrationProperties;
        this.name = name;
        this.notificationSettings = notificationSettings;
        this.provisioningState = provisioningState;
        this.replicaSets = replicaSets;
        this.resourceForestSettings = resourceForestSettings;
        this.sku = sku;
        this.syncOwner = syncOwner;
        this.systemData = systemData;
        this.tags = tags;
        this.tenantId = tenantId;
        this.type = type;
        this.version = version;
    }

    /**
     * Deployment Id
     * 
    */
    public String getDeploymentId() {
        return this.deploymentId;
    }
    /**
     * Domain Configuration Type
     * 
    */
    public Optional<String> getDomainConfigurationType() {
        return Optional.ofNullable(this.domainConfigurationType);
    }
    /**
     * The name of the Azure domain that the user would like to deploy Domain Services to.
     * 
    */
    public Optional<String> getDomainName() {
        return Optional.ofNullable(this.domainName);
    }
    /**
     * DomainSecurity Settings
     * 
    */
    public Optional<DomainSecuritySettingsResponse> getDomainSecuritySettings() {
        return Optional.ofNullable(this.domainSecuritySettings);
    }
    /**
     * Resource etag
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Enabled or Disabled flag to turn on Group-based filtered sync
     * 
    */
    public Optional<String> getFilteredSync() {
        return Optional.ofNullable(this.filteredSync);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Secure LDAP Settings
     * 
    */
    public Optional<LdapsSettingsResponse> getLdapsSettings() {
        return Optional.ofNullable(this.ldapsSettings);
    }
    /**
     * Resource location
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Migration Properties
     * 
    */
    public MigrationPropertiesResponse getMigrationProperties() {
        return this.migrationProperties;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Notification Settings
     * 
    */
    public Optional<NotificationSettingsResponse> getNotificationSettings() {
        return Optional.ofNullable(this.notificationSettings);
    }
    /**
     * the current deployment or provisioning state, which only appears in the response.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * List of ReplicaSets
     * 
    */
    public List<ReplicaSetResponse> getReplicaSets() {
        return this.replicaSets == null ? List.of() : this.replicaSets;
    }
    /**
     * Resource Forest Settings
     * 
    */
    public Optional<ResourceForestSettingsResponse> getResourceForestSettings() {
        return Optional.ofNullable(this.resourceForestSettings);
    }
    /**
     * Sku Type
     * 
    */
    public Optional<String> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * SyncOwner ReplicaSet Id
     * 
    */
    public String getSyncOwner() {
        return this.syncOwner;
    }
    /**
     * The system meta data relating to this resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure Active Directory Tenant Id
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Data Model Version
     * 
    */
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deploymentId;
        private @Nullable String domainConfigurationType;
        private @Nullable String domainName;
        private @Nullable DomainSecuritySettingsResponse domainSecuritySettings;
        private @Nullable String etag;
        private @Nullable String filteredSync;
        private String id;
        private @Nullable LdapsSettingsResponse ldapsSettings;
        private @Nullable String location;
        private MigrationPropertiesResponse migrationProperties;
        private String name;
        private @Nullable NotificationSettingsResponse notificationSettings;
        private String provisioningState;
        private @Nullable List<ReplicaSetResponse> replicaSets;
        private @Nullable ResourceForestSettingsResponse resourceForestSettings;
        private @Nullable String sku;
        private String syncOwner;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentId = defaults.deploymentId;
    	      this.domainConfigurationType = defaults.domainConfigurationType;
    	      this.domainName = defaults.domainName;
    	      this.domainSecuritySettings = defaults.domainSecuritySettings;
    	      this.etag = defaults.etag;
    	      this.filteredSync = defaults.filteredSync;
    	      this.id = defaults.id;
    	      this.ldapsSettings = defaults.ldapsSettings;
    	      this.location = defaults.location;
    	      this.migrationProperties = defaults.migrationProperties;
    	      this.name = defaults.name;
    	      this.notificationSettings = defaults.notificationSettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.replicaSets = defaults.replicaSets;
    	      this.resourceForestSettings = defaults.resourceForestSettings;
    	      this.sku = defaults.sku;
    	      this.syncOwner = defaults.syncOwner;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder deploymentId(String deploymentId) {
            this.deploymentId = Objects.requireNonNull(deploymentId);
            return this;
        }

        public Builder domainConfigurationType(@Nullable String domainConfigurationType) {
            this.domainConfigurationType = domainConfigurationType;
            return this;
        }

        public Builder domainName(@Nullable String domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder domainSecuritySettings(@Nullable DomainSecuritySettingsResponse domainSecuritySettings) {
            this.domainSecuritySettings = domainSecuritySettings;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder filteredSync(@Nullable String filteredSync) {
            this.filteredSync = filteredSync;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder ldapsSettings(@Nullable LdapsSettingsResponse ldapsSettings) {
            this.ldapsSettings = ldapsSettings;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder migrationProperties(MigrationPropertiesResponse migrationProperties) {
            this.migrationProperties = Objects.requireNonNull(migrationProperties);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder notificationSettings(@Nullable NotificationSettingsResponse notificationSettings) {
            this.notificationSettings = notificationSettings;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder replicaSets(@Nullable List<ReplicaSetResponse> replicaSets) {
            this.replicaSets = replicaSets;
            return this;
        }

        public Builder resourceForestSettings(@Nullable ResourceForestSettingsResponse resourceForestSettings) {
            this.resourceForestSettings = resourceForestSettings;
            return this;
        }

        public Builder sku(@Nullable String sku) {
            this.sku = sku;
            return this;
        }

        public Builder syncOwner(String syncOwner) {
            this.syncOwner = Objects.requireNonNull(syncOwner);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder version(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetDomainServiceResult build() {
            return new GetDomainServiceResult(deploymentId, domainConfigurationType, domainName, domainSecuritySettings, etag, filteredSync, id, ldapsSettings, location, migrationProperties, name, notificationSettings, provisioningState, replicaSets, resourceForestSettings, sku, syncOwner, systemData, tags, tenantId, type, version);
        }
    }
}
