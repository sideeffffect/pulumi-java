// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.azurenative.machinelearningservices.outputs.EncryptionPropertyResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.IdentityResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.NotebookResourceInfoResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.PrivateEndpointConnectionResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.ServiceManagedResourcesSettingsResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SharedPrivateLinkResourceResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SkuResponse;
import com.pulumi.azurenative.machinelearningservices.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkspaceResult {
    /**
     * The flag to indicate whether to allow public access when behind VNet.
     * 
     */
    private final @Nullable Boolean allowPublicAccessWhenBehindVnet;
    /**
     * ARM id of the application insights associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    private final @Nullable String applicationInsights;
    /**
     * ARM id of the container registry associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    private final @Nullable String containerRegistry;
    /**
     * The description of this workspace.
     * 
     */
    private final @Nullable String description;
    /**
     * Url for the discovery service to identify regional endpoints for machine learning experimentation services
     * 
     */
    private final @Nullable String discoveryUrl;
    /**
     * The encryption settings of Azure ML workspace.
     * 
     */
    private final @Nullable EncryptionPropertyResponse encryption;
    /**
     * The friendly name for this workspace. This name in mutable
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The flag to signal HBI data in the workspace and reduce diagnostic data collected by the service
     * 
     */
    private final @Nullable Boolean hbiWorkspace;
    /**
     * Specifies the resource ID.
     * 
     */
    private final String id;
    /**
     * The identity of the resource.
     * 
     */
    private final @Nullable IdentityResponse identity;
    /**
     * The compute name for image build
     * 
     */
    private final @Nullable String imageBuildCompute;
    /**
     * ARM id of the key vault associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    private final @Nullable String keyVault;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * Specifies the name of the resource.
     * 
     */
    private final String name;
    /**
     * The notebook info of Azure ML workspace.
     * 
     */
    private final NotebookResourceInfoResponse notebookInfo;
    /**
     * The user assigned identity resource id that represents the workspace identity.
     * 
     */
    private final @Nullable String primaryUserAssignedIdentity;
    /**
     * The list of private endpoint connections in the workspace.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Count of private connections in the workspace
     * 
     */
    private final Integer privateLinkCount;
    /**
     * The current deployment state of workspace resource. The provisioningState is to indicate states for resource provisioning.
     * 
     */
    private final String provisioningState;
    /**
     * The service managed resource settings.
     * 
     */
    private final @Nullable ServiceManagedResourcesSettingsResponse serviceManagedResourcesSettings;
    /**
     * The name of the managed resource group created by workspace RP in customer subscription if the workspace is CMK workspace
     * 
     */
    private final String serviceProvisionedResourceGroup;
    /**
     * The list of shared private link resources in this workspace.
     * 
     */
    private final @Nullable List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources;
    /**
     * The sku of the workspace.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * ARM id of the storage account associated with this workspace. This cannot be changed once the workspace has been created
     * 
     */
    private final @Nullable String storageAccount;
    /**
     * Read only system data
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Specifies the type of the resource.
     * 
     */
    private final String type;
    /**
     * The immutable id associated with this workspace.
     * 
     */
    private final String workspaceId;

    @CustomType.Constructor
    private GetWorkspaceResult(
        @CustomType.Parameter("allowPublicAccessWhenBehindVnet") @Nullable Boolean allowPublicAccessWhenBehindVnet,
        @CustomType.Parameter("applicationInsights") @Nullable String applicationInsights,
        @CustomType.Parameter("containerRegistry") @Nullable String containerRegistry,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("discoveryUrl") @Nullable String discoveryUrl,
        @CustomType.Parameter("encryption") @Nullable EncryptionPropertyResponse encryption,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("hbiWorkspace") @Nullable Boolean hbiWorkspace,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") @Nullable IdentityResponse identity,
        @CustomType.Parameter("imageBuildCompute") @Nullable String imageBuildCompute,
        @CustomType.Parameter("keyVault") @Nullable String keyVault,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("notebookInfo") NotebookResourceInfoResponse notebookInfo,
        @CustomType.Parameter("primaryUserAssignedIdentity") @Nullable String primaryUserAssignedIdentity,
        @CustomType.Parameter("privateEndpointConnections") List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @CustomType.Parameter("privateLinkCount") Integer privateLinkCount,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("serviceManagedResourcesSettings") @Nullable ServiceManagedResourcesSettingsResponse serviceManagedResourcesSettings,
        @CustomType.Parameter("serviceProvisionedResourceGroup") String serviceProvisionedResourceGroup,
        @CustomType.Parameter("sharedPrivateLinkResources") @Nullable List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("storageAccount") @Nullable String storageAccount,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("workspaceId") String workspaceId) {
        this.allowPublicAccessWhenBehindVnet = allowPublicAccessWhenBehindVnet;
        this.applicationInsights = applicationInsights;
        this.containerRegistry = containerRegistry;
        this.description = description;
        this.discoveryUrl = discoveryUrl;
        this.encryption = encryption;
        this.friendlyName = friendlyName;
        this.hbiWorkspace = hbiWorkspace;
        this.id = id;
        this.identity = identity;
        this.imageBuildCompute = imageBuildCompute;
        this.keyVault = keyVault;
        this.location = location;
        this.name = name;
        this.notebookInfo = notebookInfo;
        this.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
        this.privateEndpointConnections = privateEndpointConnections;
        this.privateLinkCount = privateLinkCount;
        this.provisioningState = provisioningState;
        this.serviceManagedResourcesSettings = serviceManagedResourcesSettings;
        this.serviceProvisionedResourceGroup = serviceProvisionedResourceGroup;
        this.sharedPrivateLinkResources = sharedPrivateLinkResources;
        this.sku = sku;
        this.storageAccount = storageAccount;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.workspaceId = workspaceId;
    }

    /**
     * The flag to indicate whether to allow public access when behind VNet.
     * 
    */
    public Optional<Boolean> allowPublicAccessWhenBehindVnet() {
        return Optional.ofNullable(this.allowPublicAccessWhenBehindVnet);
    }
    /**
     * ARM id of the application insights associated with this workspace. This cannot be changed once the workspace has been created
     * 
    */
    public Optional<String> applicationInsights() {
        return Optional.ofNullable(this.applicationInsights);
    }
    /**
     * ARM id of the container registry associated with this workspace. This cannot be changed once the workspace has been created
     * 
    */
    public Optional<String> containerRegistry() {
        return Optional.ofNullable(this.containerRegistry);
    }
    /**
     * The description of this workspace.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Url for the discovery service to identify regional endpoints for machine learning experimentation services
     * 
    */
    public Optional<String> discoveryUrl() {
        return Optional.ofNullable(this.discoveryUrl);
    }
    /**
     * The encryption settings of Azure ML workspace.
     * 
    */
    public Optional<EncryptionPropertyResponse> encryption() {
        return Optional.ofNullable(this.encryption);
    }
    /**
     * The friendly name for this workspace. This name in mutable
     * 
    */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The flag to signal HBI data in the workspace and reduce diagnostic data collected by the service
     * 
    */
    public Optional<Boolean> hbiWorkspace() {
        return Optional.ofNullable(this.hbiWorkspace);
    }
    /**
     * Specifies the resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The identity of the resource.
     * 
    */
    public Optional<IdentityResponse> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The compute name for image build
     * 
    */
    public Optional<String> imageBuildCompute() {
        return Optional.ofNullable(this.imageBuildCompute);
    }
    /**
     * ARM id of the key vault associated with this workspace. This cannot be changed once the workspace has been created
     * 
    */
    public Optional<String> keyVault() {
        return Optional.ofNullable(this.keyVault);
    }
    /**
     * Specifies the location of the resource.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Specifies the name of the resource.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The notebook info of Azure ML workspace.
     * 
    */
    public NotebookResourceInfoResponse notebookInfo() {
        return this.notebookInfo;
    }
    /**
     * The user assigned identity resource id that represents the workspace identity.
     * 
    */
    public Optional<String> primaryUserAssignedIdentity() {
        return Optional.ofNullable(this.primaryUserAssignedIdentity);
    }
    /**
     * The list of private endpoint connections in the workspace.
     * 
    */
    public List<PrivateEndpointConnectionResponse> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Count of private connections in the workspace
     * 
    */
    public Integer privateLinkCount() {
        return this.privateLinkCount;
    }
    /**
     * The current deployment state of workspace resource. The provisioningState is to indicate states for resource provisioning.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * The service managed resource settings.
     * 
    */
    public Optional<ServiceManagedResourcesSettingsResponse> serviceManagedResourcesSettings() {
        return Optional.ofNullable(this.serviceManagedResourcesSettings);
    }
    /**
     * The name of the managed resource group created by workspace RP in customer subscription if the workspace is CMK workspace
     * 
    */
    public String serviceProvisionedResourceGroup() {
        return this.serviceProvisionedResourceGroup;
    }
    /**
     * The list of shared private link resources in this workspace.
     * 
    */
    public List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources() {
        return this.sharedPrivateLinkResources == null ? List.of() : this.sharedPrivateLinkResources;
    }
    /**
     * The sku of the workspace.
     * 
    */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * ARM id of the storage account associated with this workspace. This cannot be changed once the workspace has been created
     * 
    */
    public Optional<String> storageAccount() {
        return Optional.ofNullable(this.storageAccount);
    }
    /**
     * Read only system data
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The immutable id associated with this workspace.
     * 
    */
    public String workspaceId() {
        return this.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkspaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowPublicAccessWhenBehindVnet;
        private @Nullable String applicationInsights;
        private @Nullable String containerRegistry;
        private @Nullable String description;
        private @Nullable String discoveryUrl;
        private @Nullable EncryptionPropertyResponse encryption;
        private @Nullable String friendlyName;
        private @Nullable Boolean hbiWorkspace;
        private String id;
        private @Nullable IdentityResponse identity;
        private @Nullable String imageBuildCompute;
        private @Nullable String keyVault;
        private @Nullable String location;
        private String name;
        private NotebookResourceInfoResponse notebookInfo;
        private @Nullable String primaryUserAssignedIdentity;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private Integer privateLinkCount;
        private String provisioningState;
        private @Nullable ServiceManagedResourcesSettingsResponse serviceManagedResourcesSettings;
        private String serviceProvisionedResourceGroup;
        private @Nullable List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources;
        private @Nullable SkuResponse sku;
        private @Nullable String storageAccount;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkspaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPublicAccessWhenBehindVnet = defaults.allowPublicAccessWhenBehindVnet;
    	      this.applicationInsights = defaults.applicationInsights;
    	      this.containerRegistry = defaults.containerRegistry;
    	      this.description = defaults.description;
    	      this.discoveryUrl = defaults.discoveryUrl;
    	      this.encryption = defaults.encryption;
    	      this.friendlyName = defaults.friendlyName;
    	      this.hbiWorkspace = defaults.hbiWorkspace;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.imageBuildCompute = defaults.imageBuildCompute;
    	      this.keyVault = defaults.keyVault;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.notebookInfo = defaults.notebookInfo;
    	      this.primaryUserAssignedIdentity = defaults.primaryUserAssignedIdentity;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.privateLinkCount = defaults.privateLinkCount;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceManagedResourcesSettings = defaults.serviceManagedResourcesSettings;
    	      this.serviceProvisionedResourceGroup = defaults.serviceProvisionedResourceGroup;
    	      this.sharedPrivateLinkResources = defaults.sharedPrivateLinkResources;
    	      this.sku = defaults.sku;
    	      this.storageAccount = defaults.storageAccount;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder allowPublicAccessWhenBehindVnet(@Nullable Boolean allowPublicAccessWhenBehindVnet) {
            this.allowPublicAccessWhenBehindVnet = allowPublicAccessWhenBehindVnet;
            return this;
        }
        public Builder applicationInsights(@Nullable String applicationInsights) {
            this.applicationInsights = applicationInsights;
            return this;
        }
        public Builder containerRegistry(@Nullable String containerRegistry) {
            this.containerRegistry = containerRegistry;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder discoveryUrl(@Nullable String discoveryUrl) {
            this.discoveryUrl = discoveryUrl;
            return this;
        }
        public Builder encryption(@Nullable EncryptionPropertyResponse encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder hbiWorkspace(@Nullable Boolean hbiWorkspace) {
            this.hbiWorkspace = hbiWorkspace;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(@Nullable IdentityResponse identity) {
            this.identity = identity;
            return this;
        }
        public Builder imageBuildCompute(@Nullable String imageBuildCompute) {
            this.imageBuildCompute = imageBuildCompute;
            return this;
        }
        public Builder keyVault(@Nullable String keyVault) {
            this.keyVault = keyVault;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder notebookInfo(NotebookResourceInfoResponse notebookInfo) {
            this.notebookInfo = Objects.requireNonNull(notebookInfo);
            return this;
        }
        public Builder primaryUserAssignedIdentity(@Nullable String primaryUserAssignedIdentity) {
            this.primaryUserAssignedIdentity = primaryUserAssignedIdentity;
            return this;
        }
        public Builder privateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }
        public Builder privateEndpointConnections(PrivateEndpointConnectionResponse... privateEndpointConnections) {
            return privateEndpointConnections(List.of(privateEndpointConnections));
        }
        public Builder privateLinkCount(Integer privateLinkCount) {
            this.privateLinkCount = Objects.requireNonNull(privateLinkCount);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder serviceManagedResourcesSettings(@Nullable ServiceManagedResourcesSettingsResponse serviceManagedResourcesSettings) {
            this.serviceManagedResourcesSettings = serviceManagedResourcesSettings;
            return this;
        }
        public Builder serviceProvisionedResourceGroup(String serviceProvisionedResourceGroup) {
            this.serviceProvisionedResourceGroup = Objects.requireNonNull(serviceProvisionedResourceGroup);
            return this;
        }
        public Builder sharedPrivateLinkResources(@Nullable List<SharedPrivateLinkResourceResponse> sharedPrivateLinkResources) {
            this.sharedPrivateLinkResources = sharedPrivateLinkResources;
            return this;
        }
        public Builder sharedPrivateLinkResources(SharedPrivateLinkResourceResponse... sharedPrivateLinkResources) {
            return sharedPrivateLinkResources(List.of(sharedPrivateLinkResources));
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder storageAccount(@Nullable String storageAccount) {
            this.storageAccount = storageAccount;
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = Objects.requireNonNull(workspaceId);
            return this;
        }        public GetWorkspaceResult build() {
            return new GetWorkspaceResult(allowPublicAccessWhenBehindVnet, applicationInsights, containerRegistry, description, discoveryUrl, encryption, friendlyName, hbiWorkspace, id, identity, imageBuildCompute, keyVault, location, name, notebookInfo, primaryUserAssignedIdentity, privateEndpointConnections, privateLinkCount, provisioningState, serviceManagedResourcesSettings, serviceProvisionedResourceGroup, sharedPrivateLinkResources, sku, storageAccount, systemData, tags, type, workspaceId);
        }
    }
}
