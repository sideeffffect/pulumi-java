// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datalakestore.outputs;

import io.pulumi.azurenative.datalakestore.outputs.EncryptionConfigResponse;
import io.pulumi.azurenative.datalakestore.outputs.EncryptionIdentityResponse;
import io.pulumi.azurenative.datalakestore.outputs.FirewallRuleResponse;
import io.pulumi.azurenative.datalakestore.outputs.TrustedIdProviderResponse;
import io.pulumi.azurenative.datalakestore.outputs.VirtualNetworkRuleResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetAccountResult {
    /**
     * The unique identifier associated with this Data Lake Store account.
     * 
     */
    private final String accountId;
    /**
     * The account creation time.
     * 
     */
    private final String creationTime;
    /**
     * The commitment tier in use for the current month.
     * 
     */
    private final String currentTier;
    /**
     * The default owner group for all new folders and files created in the Data Lake Store account.
     * 
     */
    private final String defaultGroup;
    /**
     * The Key Vault encryption configuration.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * The current state of encryption provisioning for this Data Lake Store account.
     * 
     */
    private final String encryptionProvisioningState;
    /**
     * The current state of encryption for this Data Lake Store account.
     * 
     */
    private final String encryptionState;
    /**
     * The full CName endpoint for this account.
     * 
     */
    private final String endpoint;
    /**
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    private final String firewallAllowAzureIps;
    /**
     * The list of firewall rules associated with this Data Lake Store account.
     * 
     */
    private final List<FirewallRuleResponse> firewallRules;
    /**
     * The current state of the IP address firewall for this Data Lake Store account.
     * 
     */
    private final String firewallState;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The Key Vault encryption identity, if any.
     * 
     */
    private final EncryptionIdentityResponse identity;
    /**
     * The account last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * The resource location.
     * 
     */
    private final String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * The commitment tier to use for next month.
     * 
     */
    private final String newTier;
    /**
     * The provisioning status of the Data Lake Store account.
     * 
     */
    private final String provisioningState;
    /**
     * The state of the Data Lake Store account.
     * 
     */
    private final String state;
    /**
     * The resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The current state of the trusted identity provider feature for this Data Lake Store account.
     * 
     */
    private final String trustedIdProviderState;
    /**
     * The list of trusted identity providers associated with this Data Lake Store account.
     * 
     */
    private final List<TrustedIdProviderResponse> trustedIdProviders;
    /**
     * The resource type.
     * 
     */
    private final String type;
    /**
     * The list of virtual network rules associated with this Data Lake Store account.
     * 
     */
    private final List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @OutputCustomType.Constructor
    private GetAccountResult(
        @OutputCustomType.Parameter("accountId") String accountId,
        @OutputCustomType.Parameter("creationTime") String creationTime,
        @OutputCustomType.Parameter("currentTier") String currentTier,
        @OutputCustomType.Parameter("defaultGroup") String defaultGroup,
        @OutputCustomType.Parameter("encryptionConfig") EncryptionConfigResponse encryptionConfig,
        @OutputCustomType.Parameter("encryptionProvisioningState") String encryptionProvisioningState,
        @OutputCustomType.Parameter("encryptionState") String encryptionState,
        @OutputCustomType.Parameter("endpoint") String endpoint,
        @OutputCustomType.Parameter("firewallAllowAzureIps") String firewallAllowAzureIps,
        @OutputCustomType.Parameter("firewallRules") List<FirewallRuleResponse> firewallRules,
        @OutputCustomType.Parameter("firewallState") String firewallState,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identity") EncryptionIdentityResponse identity,
        @OutputCustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("newTier") String newTier,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("state") String state,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("trustedIdProviderState") String trustedIdProviderState,
        @OutputCustomType.Parameter("trustedIdProviders") List<TrustedIdProviderResponse> trustedIdProviders,
        @OutputCustomType.Parameter("type") String type,
        @OutputCustomType.Parameter("virtualNetworkRules") List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.accountId = accountId;
        this.creationTime = creationTime;
        this.currentTier = currentTier;
        this.defaultGroup = defaultGroup;
        this.encryptionConfig = encryptionConfig;
        this.encryptionProvisioningState = encryptionProvisioningState;
        this.encryptionState = encryptionState;
        this.endpoint = endpoint;
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        this.firewallRules = firewallRules;
        this.firewallState = firewallState;
        this.id = id;
        this.identity = identity;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.name = name;
        this.newTier = newTier;
        this.provisioningState = provisioningState;
        this.state = state;
        this.tags = tags;
        this.trustedIdProviderState = trustedIdProviderState;
        this.trustedIdProviders = trustedIdProviders;
        this.type = type;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * The unique identifier associated with this Data Lake Store account.
     * 
    */
    public String getAccountId() {
        return this.accountId;
    }
    /**
     * The account creation time.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * The commitment tier in use for the current month.
     * 
    */
    public String getCurrentTier() {
        return this.currentTier;
    }
    /**
     * The default owner group for all new folders and files created in the Data Lake Store account.
     * 
    */
    public String getDefaultGroup() {
        return this.defaultGroup;
    }
    /**
     * The Key Vault encryption configuration.
     * 
    */
    public EncryptionConfigResponse getEncryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * The current state of encryption provisioning for this Data Lake Store account.
     * 
    */
    public String getEncryptionProvisioningState() {
        return this.encryptionProvisioningState;
    }
    /**
     * The current state of encryption for this Data Lake Store account.
     * 
    */
    public String getEncryptionState() {
        return this.encryptionState;
    }
    /**
     * The full CName endpoint for this account.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
    */
    public String getFirewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }
    /**
     * The list of firewall rules associated with this Data Lake Store account.
     * 
    */
    public List<FirewallRuleResponse> getFirewallRules() {
        return this.firewallRules;
    }
    /**
     * The current state of the IP address firewall for this Data Lake Store account.
     * 
    */
    public String getFirewallState() {
        return this.firewallState;
    }
    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Key Vault encryption identity, if any.
     * 
    */
    public EncryptionIdentityResponse getIdentity() {
        return this.identity;
    }
    /**
     * The account last modified time.
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The commitment tier to use for next month.
     * 
    */
    public String getNewTier() {
        return this.newTier;
    }
    /**
     * The provisioning status of the Data Lake Store account.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The state of the Data Lake Store account.
     * 
    */
    public String getState() {
        return this.state;
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The current state of the trusted identity provider feature for this Data Lake Store account.
     * 
    */
    public String getTrustedIdProviderState() {
        return this.trustedIdProviderState;
    }
    /**
     * The list of trusted identity providers associated with this Data Lake Store account.
     * 
    */
    public List<TrustedIdProviderResponse> getTrustedIdProviders() {
        return this.trustedIdProviders;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The list of virtual network rules associated with this Data Lake Store account.
     * 
    */
    public List<VirtualNetworkRuleResponse> getVirtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String creationTime;
        private String currentTier;
        private String defaultGroup;
        private EncryptionConfigResponse encryptionConfig;
        private String encryptionProvisioningState;
        private String encryptionState;
        private String endpoint;
        private String firewallAllowAzureIps;
        private List<FirewallRuleResponse> firewallRules;
        private String firewallState;
        private String id;
        private EncryptionIdentityResponse identity;
        private String lastModifiedTime;
        private String location;
        private String name;
        private String newTier;
        private String provisioningState;
        private String state;
        private Map<String,String> tags;
        private String trustedIdProviderState;
        private List<TrustedIdProviderResponse> trustedIdProviders;
        private String type;
        private List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.creationTime = defaults.creationTime;
    	      this.currentTier = defaults.currentTier;
    	      this.defaultGroup = defaults.defaultGroup;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.encryptionProvisioningState = defaults.encryptionProvisioningState;
    	      this.encryptionState = defaults.encryptionState;
    	      this.endpoint = defaults.endpoint;
    	      this.firewallAllowAzureIps = defaults.firewallAllowAzureIps;
    	      this.firewallRules = defaults.firewallRules;
    	      this.firewallState = defaults.firewallState;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.newTier = defaults.newTier;
    	      this.provisioningState = defaults.provisioningState;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.trustedIdProviderState = defaults.trustedIdProviderState;
    	      this.trustedIdProviders = defaults.trustedIdProviders;
    	      this.type = defaults.type;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }

        public Builder currentTier(String currentTier) {
            this.currentTier = Objects.requireNonNull(currentTier);
            return this;
        }

        public Builder defaultGroup(String defaultGroup) {
            this.defaultGroup = Objects.requireNonNull(defaultGroup);
            return this;
        }

        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }

        public Builder encryptionProvisioningState(String encryptionProvisioningState) {
            this.encryptionProvisioningState = Objects.requireNonNull(encryptionProvisioningState);
            return this;
        }

        public Builder encryptionState(String encryptionState) {
            this.encryptionState = Objects.requireNonNull(encryptionState);
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder firewallAllowAzureIps(String firewallAllowAzureIps) {
            this.firewallAllowAzureIps = Objects.requireNonNull(firewallAllowAzureIps);
            return this;
        }

        public Builder firewallRules(List<FirewallRuleResponse> firewallRules) {
            this.firewallRules = Objects.requireNonNull(firewallRules);
            return this;
        }

        public Builder firewallState(String firewallState) {
            this.firewallState = Objects.requireNonNull(firewallState);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder identity(EncryptionIdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder newTier(String newTier) {
            this.newTier = Objects.requireNonNull(newTier);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder trustedIdProviderState(String trustedIdProviderState) {
            this.trustedIdProviderState = Objects.requireNonNull(trustedIdProviderState);
            return this;
        }

        public Builder trustedIdProviders(List<TrustedIdProviderResponse> trustedIdProviders) {
            this.trustedIdProviders = Objects.requireNonNull(trustedIdProviders);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder virtualNetworkRules(List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = Objects.requireNonNull(virtualNetworkRules);
            return this;
        }
        public GetAccountResult build() {
            return new GetAccountResult(accountId, creationTime, currentTier, defaultGroup, encryptionConfig, encryptionProvisioningState, encryptionState, endpoint, firewallAllowAzureIps, firewallRules, firewallState, id, identity, lastModifiedTime, location, name, newTier, provisioningState, state, tags, trustedIdProviderState, trustedIdProviders, type, virtualNetworkRules);
        }
    }
}
