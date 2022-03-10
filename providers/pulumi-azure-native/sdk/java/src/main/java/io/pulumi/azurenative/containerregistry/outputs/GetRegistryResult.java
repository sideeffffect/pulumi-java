// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.NetworkRuleSetResponse;
import io.pulumi.azurenative.containerregistry.outputs.PoliciesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SkuResponse;
import io.pulumi.azurenative.containerregistry.outputs.StatusResponse;
import io.pulumi.azurenative.containerregistry.outputs.StorageAccountPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRegistryResult {
    /**
     * The value that indicates whether the admin user is enabled.
     * 
     */
    private final @Nullable Boolean adminUserEnabled;
    /**
     * The creation date of the container registry in ISO8601 format.
     * 
     */
    private final String creationDate;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
     */
    private final String location;
    /**
     * The URL that can be used to log into the container registry.
     * 
     */
    private final String loginServer;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The network rule set for a container registry.
     * 
     */
    private final @Nullable NetworkRuleSetResponse networkRuleSet;
    /**
     * The policies for a container registry.
     * 
     */
    private final @Nullable PoliciesResponse policies;
    /**
     * The provisioning state of the container registry at the time the operation was called.
     * 
     */
    private final String provisioningState;
    /**
     * The SKU of the container registry.
     * 
     */
    private final SkuResponse sku;
    /**
     * The status of the container registry at the time the operation was called.
     * 
     */
    private final StatusResponse status;
    /**
     * The properties of the storage account for the container registry. Only applicable to Classic SKU.
     * 
     */
    private final @Nullable StorageAccountPropertiesResponse storageAccount;
    /**
     * The tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private GetRegistryResult(
        @OutputCustomType.Parameter("adminUserEnabled") @Nullable Boolean adminUserEnabled,
        @OutputCustomType.Parameter("creationDate") String creationDate,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("location") String location,
        @OutputCustomType.Parameter("loginServer") String loginServer,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("networkRuleSet") @Nullable NetworkRuleSetResponse networkRuleSet,
        @OutputCustomType.Parameter("policies") @Nullable PoliciesResponse policies,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("sku") SkuResponse sku,
        @OutputCustomType.Parameter("status") StatusResponse status,
        @OutputCustomType.Parameter("storageAccount") @Nullable StorageAccountPropertiesResponse storageAccount,
        @OutputCustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @OutputCustomType.Parameter("type") String type) {
        this.adminUserEnabled = adminUserEnabled;
        this.creationDate = creationDate;
        this.id = id;
        this.location = location;
        this.loginServer = loginServer;
        this.name = name;
        this.networkRuleSet = networkRuleSet;
        this.policies = policies;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.status = status;
        this.storageAccount = storageAccount;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The value that indicates whether the admin user is enabled.
     * 
    */
    public Optional<Boolean> getAdminUserEnabled() {
        return Optional.ofNullable(this.adminUserEnabled);
    }
    /**
     * The creation date of the container registry in ISO8601 format.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource. This cannot be changed after the resource is created.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The URL that can be used to log into the container registry.
     * 
    */
    public String getLoginServer() {
        return this.loginServer;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The network rule set for a container registry.
     * 
    */
    public Optional<NetworkRuleSetResponse> getNetworkRuleSet() {
        return Optional.ofNullable(this.networkRuleSet);
    }
    /**
     * The policies for a container registry.
     * 
    */
    public Optional<PoliciesResponse> getPolicies() {
        return Optional.ofNullable(this.policies);
    }
    /**
     * The provisioning state of the container registry at the time the operation was called.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU of the container registry.
     * 
    */
    public SkuResponse getSku() {
        return this.sku;
    }
    /**
     * The status of the container registry at the time the operation was called.
     * 
    */
    public StatusResponse getStatus() {
        return this.status;
    }
    /**
     * The properties of the storage account for the container registry. Only applicable to Classic SKU.
     * 
    */
    public Optional<StorageAccountPropertiesResponse> getStorageAccount() {
        return Optional.ofNullable(this.storageAccount);
    }
    /**
     * The tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean adminUserEnabled;
        private String creationDate;
        private String id;
        private String location;
        private String loginServer;
        private String name;
        private @Nullable NetworkRuleSetResponse networkRuleSet;
        private @Nullable PoliciesResponse policies;
        private String provisioningState;
        private SkuResponse sku;
        private StatusResponse status;
        private @Nullable StorageAccountPropertiesResponse storageAccount;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUserEnabled = defaults.adminUserEnabled;
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.loginServer = defaults.loginServer;
    	      this.name = defaults.name;
    	      this.networkRuleSet = defaults.networkRuleSet;
    	      this.policies = defaults.policies;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.status = defaults.status;
    	      this.storageAccount = defaults.storageAccount;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder adminUserEnabled(@Nullable Boolean adminUserEnabled) {
            this.adminUserEnabled = adminUserEnabled;
            return this;
        }

        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder loginServer(String loginServer) {
            this.loginServer = Objects.requireNonNull(loginServer);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder networkRuleSet(@Nullable NetworkRuleSetResponse networkRuleSet) {
            this.networkRuleSet = networkRuleSet;
            return this;
        }

        public Builder policies(@Nullable PoliciesResponse policies) {
            this.policies = policies;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder sku(SkuResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder status(StatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder storageAccount(@Nullable StorageAccountPropertiesResponse storageAccount) {
            this.storageAccount = storageAccount;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRegistryResult build() {
            return new GetRegistryResult(adminUserEnabled, creationDate, id, location, loginServer, name, networkRuleSet, policies, provisioningState, sku, status, storageAccount, tags, type);
        }
    }
}
