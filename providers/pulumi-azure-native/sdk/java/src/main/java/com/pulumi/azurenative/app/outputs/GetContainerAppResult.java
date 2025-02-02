// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.outputs;

import com.pulumi.azurenative.app.outputs.ConfigurationResponse;
import com.pulumi.azurenative.app.outputs.ManagedServiceIdentityResponse;
import com.pulumi.azurenative.app.outputs.SystemDataResponse;
import com.pulumi.azurenative.app.outputs.TemplateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetContainerAppResult {
    /**
     * @return Non versioned Container App configuration properties.
     * 
     */
    private final @Nullable ConfigurationResponse configuration;
    /**
     * @return Id used to verify domain name ownership
     * 
     */
    private final String customDomainVerificationId;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return managed identities for the Container App to interact with other Azure services without maintaining any secrets or credentials in code.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * @return Fully Qualified Domain Name of the latest revision of the Container App.
     * 
     */
    private final String latestRevisionFqdn;
    /**
     * @return Name of the latest revision of the Container App.
     * 
     */
    private final String latestRevisionName;
    /**
     * @return The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * @return Resource ID of the Container App&#39;s environment.
     * 
     */
    private final @Nullable String managedEnvironmentId;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Outbound IP Addresses for container app.
     * 
     */
    private final List<String> outboundIPAddresses;
    /**
     * @return Provisioning state of the Container App.
     * 
     */
    private final String provisioningState;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Container App versioned application definition.
     * 
     */
    private final @Nullable TemplateResponse template;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetContainerAppResult(
        @CustomType.Parameter("configuration") @Nullable ConfigurationResponse configuration,
        @CustomType.Parameter("customDomainVerificationId") String customDomainVerificationId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable ManagedServiceIdentityResponse identity,
        @CustomType.Parameter("latestRevisionFqdn") String latestRevisionFqdn,
        @CustomType.Parameter("latestRevisionName") String latestRevisionName,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("managedEnvironmentId") @Nullable String managedEnvironmentId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("outboundIPAddresses") List<String> outboundIPAddresses,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("template") @Nullable TemplateResponse template,
        @CustomType.Parameter("type") String type) {
        this.configuration = configuration;
        this.customDomainVerificationId = customDomainVerificationId;
        this.id = id;
        this.identity = identity;
        this.latestRevisionFqdn = latestRevisionFqdn;
        this.latestRevisionName = latestRevisionName;
        this.location = location;
        this.managedEnvironmentId = managedEnvironmentId;
        this.name = name;
        this.outboundIPAddresses = outboundIPAddresses;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.tags = tags;
        this.template = template;
        this.type = type;
    }

    /**
     * @return Non versioned Container App configuration properties.
     * 
     */
    public Optional<ConfigurationResponse> configuration() {
        return Optional.ofNullable(this.configuration);
    }
    /**
     * @return Id used to verify domain name ownership
     * 
     */
    public String customDomainVerificationId() {
        return this.customDomainVerificationId;
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return managed identities for the Container App to interact with other Azure services without maintaining any secrets or credentials in code.
     * 
     */
    public Optional<ManagedServiceIdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return Fully Qualified Domain Name of the latest revision of the Container App.
     * 
     */
    public String latestRevisionFqdn() {
        return this.latestRevisionFqdn;
    }
    /**
     * @return Name of the latest revision of the Container App.
     * 
     */
    public String latestRevisionName() {
        return this.latestRevisionName;
    }
    /**
     * @return The geo-location where the resource lives
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Resource ID of the Container App&#39;s environment.
     * 
     */
    public Optional<String> managedEnvironmentId() {
        return Optional.ofNullable(this.managedEnvironmentId);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Outbound IP Addresses for container app.
     * 
     */
    public List<String> outboundIPAddresses() {
        return this.outboundIPAddresses;
    }
    /**
     * @return Provisioning state of the Container App.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Container App versioned application definition.
     * 
     */
    public Optional<TemplateResponse> template() {
        return Optional.ofNullable(this.template);
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContainerAppResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConfigurationResponse configuration;
        private String customDomainVerificationId;
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private String latestRevisionFqdn;
        private String latestRevisionName;
        private String location;
        private @Nullable String managedEnvironmentId;
        private String name;
        private List<String> outboundIPAddresses;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable TemplateResponse template;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContainerAppResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.customDomainVerificationId = defaults.customDomainVerificationId;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.latestRevisionFqdn = defaults.latestRevisionFqdn;
    	      this.latestRevisionName = defaults.latestRevisionName;
    	      this.location = defaults.location;
    	      this.managedEnvironmentId = defaults.managedEnvironmentId;
    	      this.name = defaults.name;
    	      this.outboundIPAddresses = defaults.outboundIPAddresses;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.template = defaults.template;
    	      this.type = defaults.type;
        }

        public Builder configuration(@Nullable ConfigurationResponse configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder customDomainVerificationId(String customDomainVerificationId) {
            this.customDomainVerificationId = Objects.requireNonNull(customDomainVerificationId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder latestRevisionFqdn(String latestRevisionFqdn) {
            this.latestRevisionFqdn = Objects.requireNonNull(latestRevisionFqdn);
            return this;
        }
        public Builder latestRevisionName(String latestRevisionName) {
            this.latestRevisionName = Objects.requireNonNull(latestRevisionName);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder managedEnvironmentId(@Nullable String managedEnvironmentId) {
            this.managedEnvironmentId = managedEnvironmentId;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder outboundIPAddresses(List<String> outboundIPAddresses) {
            this.outboundIPAddresses = Objects.requireNonNull(outboundIPAddresses);
            return this;
        }
        public Builder outboundIPAddresses(String... outboundIPAddresses) {
            return outboundIPAddresses(List.of(outboundIPAddresses));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
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
        public Builder template(@Nullable TemplateResponse template) {
            this.template = template;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetContainerAppResult build() {
            return new GetContainerAppResult(configuration, customDomainVerificationId, id, identity, latestRevisionFqdn, latestRevisionName, location, managedEnvironmentId, name, outboundIPAddresses, provisioningState, systemData, tags, template, type);
        }
    }
}
