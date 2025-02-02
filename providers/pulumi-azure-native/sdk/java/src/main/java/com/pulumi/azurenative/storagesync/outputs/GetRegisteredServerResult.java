// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagesync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRegisteredServerResult {
    /**
     * @return Registered Server Agent Version
     * 
     */
    private final @Nullable String agentVersion;
    /**
     * @return Registered Server Agent Version Expiration Date
     * 
     */
    private final String agentVersionExpirationDate;
    /**
     * @return Registered Server Agent Version Status
     * 
     */
    private final String agentVersionStatus;
    /**
     * @return Registered Server clusterId
     * 
     */
    private final @Nullable String clusterId;
    /**
     * @return Registered Server clusterName
     * 
     */
    private final @Nullable String clusterName;
    /**
     * @return Resource discoveryEndpointUri
     * 
     */
    private final @Nullable String discoveryEndpointUri;
    /**
     * @return Friendly Name
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return Registered Server last heart beat
     * 
     */
    private final @Nullable String lastHeartBeat;
    /**
     * @return Resource Last Operation Name
     * 
     */
    private final @Nullable String lastOperationName;
    /**
     * @return Registered Server lastWorkflowId
     * 
     */
    private final @Nullable String lastWorkflowId;
    /**
     * @return Management Endpoint Uri
     * 
     */
    private final @Nullable String managementEndpointUri;
    /**
     * @return Monitoring Configuration
     * 
     */
    private final @Nullable String monitoringConfiguration;
    /**
     * @return Telemetry Endpoint Uri
     * 
     */
    private final @Nullable String monitoringEndpointUri;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return Registered Server Provisioning State
     * 
     */
    private final @Nullable String provisioningState;
    /**
     * @return Resource Location
     * 
     */
    private final @Nullable String resourceLocation;
    /**
     * @return Registered Server Certificate
     * 
     */
    private final @Nullable String serverCertificate;
    /**
     * @return Registered Server serverId
     * 
     */
    private final @Nullable String serverId;
    /**
     * @return Registered Server Management Error Code
     * 
     */
    private final @Nullable Integer serverManagementErrorCode;
    /**
     * @return Registered Server OS Version
     * 
     */
    private final @Nullable String serverOSVersion;
    /**
     * @return Registered Server serverRole
     * 
     */
    private final @Nullable String serverRole;
    /**
     * @return Service Location
     * 
     */
    private final @Nullable String serviceLocation;
    /**
     * @return Registered Server storageSyncServiceUid
     * 
     */
    private final @Nullable String storageSyncServiceUid;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetRegisteredServerResult(
        @CustomType.Parameter("agentVersion") @Nullable String agentVersion,
        @CustomType.Parameter("agentVersionExpirationDate") String agentVersionExpirationDate,
        @CustomType.Parameter("agentVersionStatus") String agentVersionStatus,
        @CustomType.Parameter("clusterId") @Nullable String clusterId,
        @CustomType.Parameter("clusterName") @Nullable String clusterName,
        @CustomType.Parameter("discoveryEndpointUri") @Nullable String discoveryEndpointUri,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastHeartBeat") @Nullable String lastHeartBeat,
        @CustomType.Parameter("lastOperationName") @Nullable String lastOperationName,
        @CustomType.Parameter("lastWorkflowId") @Nullable String lastWorkflowId,
        @CustomType.Parameter("managementEndpointUri") @Nullable String managementEndpointUri,
        @CustomType.Parameter("monitoringConfiguration") @Nullable String monitoringConfiguration,
        @CustomType.Parameter("monitoringEndpointUri") @Nullable String monitoringEndpointUri,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("resourceLocation") @Nullable String resourceLocation,
        @CustomType.Parameter("serverCertificate") @Nullable String serverCertificate,
        @CustomType.Parameter("serverId") @Nullable String serverId,
        @CustomType.Parameter("serverManagementErrorCode") @Nullable Integer serverManagementErrorCode,
        @CustomType.Parameter("serverOSVersion") @Nullable String serverOSVersion,
        @CustomType.Parameter("serverRole") @Nullable String serverRole,
        @CustomType.Parameter("serviceLocation") @Nullable String serviceLocation,
        @CustomType.Parameter("storageSyncServiceUid") @Nullable String storageSyncServiceUid,
        @CustomType.Parameter("type") String type) {
        this.agentVersion = agentVersion;
        this.agentVersionExpirationDate = agentVersionExpirationDate;
        this.agentVersionStatus = agentVersionStatus;
        this.clusterId = clusterId;
        this.clusterName = clusterName;
        this.discoveryEndpointUri = discoveryEndpointUri;
        this.friendlyName = friendlyName;
        this.id = id;
        this.lastHeartBeat = lastHeartBeat;
        this.lastOperationName = lastOperationName;
        this.lastWorkflowId = lastWorkflowId;
        this.managementEndpointUri = managementEndpointUri;
        this.monitoringConfiguration = monitoringConfiguration;
        this.monitoringEndpointUri = monitoringEndpointUri;
        this.name = name;
        this.provisioningState = provisioningState;
        this.resourceLocation = resourceLocation;
        this.serverCertificate = serverCertificate;
        this.serverId = serverId;
        this.serverManagementErrorCode = serverManagementErrorCode;
        this.serverOSVersion = serverOSVersion;
        this.serverRole = serverRole;
        this.serviceLocation = serviceLocation;
        this.storageSyncServiceUid = storageSyncServiceUid;
        this.type = type;
    }

    /**
     * @return Registered Server Agent Version
     * 
     */
    public Optional<String> agentVersion() {
        return Optional.ofNullable(this.agentVersion);
    }
    /**
     * @return Registered Server Agent Version Expiration Date
     * 
     */
    public String agentVersionExpirationDate() {
        return this.agentVersionExpirationDate;
    }
    /**
     * @return Registered Server Agent Version Status
     * 
     */
    public String agentVersionStatus() {
        return this.agentVersionStatus;
    }
    /**
     * @return Registered Server clusterId
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return Registered Server clusterName
     * 
     */
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    /**
     * @return Resource discoveryEndpointUri
     * 
     */
    public Optional<String> discoveryEndpointUri() {
        return Optional.ofNullable(this.discoveryEndpointUri);
    }
    /**
     * @return Friendly Name
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Registered Server last heart beat
     * 
     */
    public Optional<String> lastHeartBeat() {
        return Optional.ofNullable(this.lastHeartBeat);
    }
    /**
     * @return Resource Last Operation Name
     * 
     */
    public Optional<String> lastOperationName() {
        return Optional.ofNullable(this.lastOperationName);
    }
    /**
     * @return Registered Server lastWorkflowId
     * 
     */
    public Optional<String> lastWorkflowId() {
        return Optional.ofNullable(this.lastWorkflowId);
    }
    /**
     * @return Management Endpoint Uri
     * 
     */
    public Optional<String> managementEndpointUri() {
        return Optional.ofNullable(this.managementEndpointUri);
    }
    /**
     * @return Monitoring Configuration
     * 
     */
    public Optional<String> monitoringConfiguration() {
        return Optional.ofNullable(this.monitoringConfiguration);
    }
    /**
     * @return Telemetry Endpoint Uri
     * 
     */
    public Optional<String> monitoringEndpointUri() {
        return Optional.ofNullable(this.monitoringEndpointUri);
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Registered Server Provisioning State
     * 
     */
    public Optional<String> provisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    /**
     * @return Resource Location
     * 
     */
    public Optional<String> resourceLocation() {
        return Optional.ofNullable(this.resourceLocation);
    }
    /**
     * @return Registered Server Certificate
     * 
     */
    public Optional<String> serverCertificate() {
        return Optional.ofNullable(this.serverCertificate);
    }
    /**
     * @return Registered Server serverId
     * 
     */
    public Optional<String> serverId() {
        return Optional.ofNullable(this.serverId);
    }
    /**
     * @return Registered Server Management Error Code
     * 
     */
    public Optional<Integer> serverManagementErrorCode() {
        return Optional.ofNullable(this.serverManagementErrorCode);
    }
    /**
     * @return Registered Server OS Version
     * 
     */
    public Optional<String> serverOSVersion() {
        return Optional.ofNullable(this.serverOSVersion);
    }
    /**
     * @return Registered Server serverRole
     * 
     */
    public Optional<String> serverRole() {
        return Optional.ofNullable(this.serverRole);
    }
    /**
     * @return Service Location
     * 
     */
    public Optional<String> serviceLocation() {
        return Optional.ofNullable(this.serviceLocation);
    }
    /**
     * @return Registered Server storageSyncServiceUid
     * 
     */
    public Optional<String> storageSyncServiceUid() {
        return Optional.ofNullable(this.storageSyncServiceUid);
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

    public static Builder builder(GetRegisteredServerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentVersion;
        private String agentVersionExpirationDate;
        private String agentVersionStatus;
        private @Nullable String clusterId;
        private @Nullable String clusterName;
        private @Nullable String discoveryEndpointUri;
        private @Nullable String friendlyName;
        private String id;
        private @Nullable String lastHeartBeat;
        private @Nullable String lastOperationName;
        private @Nullable String lastWorkflowId;
        private @Nullable String managementEndpointUri;
        private @Nullable String monitoringConfiguration;
        private @Nullable String monitoringEndpointUri;
        private String name;
        private @Nullable String provisioningState;
        private @Nullable String resourceLocation;
        private @Nullable String serverCertificate;
        private @Nullable String serverId;
        private @Nullable Integer serverManagementErrorCode;
        private @Nullable String serverOSVersion;
        private @Nullable String serverRole;
        private @Nullable String serviceLocation;
        private @Nullable String storageSyncServiceUid;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegisteredServerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.agentVersionExpirationDate = defaults.agentVersionExpirationDate;
    	      this.agentVersionStatus = defaults.agentVersionStatus;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.discoveryEndpointUri = defaults.discoveryEndpointUri;
    	      this.friendlyName = defaults.friendlyName;
    	      this.id = defaults.id;
    	      this.lastHeartBeat = defaults.lastHeartBeat;
    	      this.lastOperationName = defaults.lastOperationName;
    	      this.lastWorkflowId = defaults.lastWorkflowId;
    	      this.managementEndpointUri = defaults.managementEndpointUri;
    	      this.monitoringConfiguration = defaults.monitoringConfiguration;
    	      this.monitoringEndpointUri = defaults.monitoringEndpointUri;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.serverCertificate = defaults.serverCertificate;
    	      this.serverId = defaults.serverId;
    	      this.serverManagementErrorCode = defaults.serverManagementErrorCode;
    	      this.serverOSVersion = defaults.serverOSVersion;
    	      this.serverRole = defaults.serverRole;
    	      this.serviceLocation = defaults.serviceLocation;
    	      this.storageSyncServiceUid = defaults.storageSyncServiceUid;
    	      this.type = defaults.type;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder agentVersionExpirationDate(String agentVersionExpirationDate) {
            this.agentVersionExpirationDate = Objects.requireNonNull(agentVersionExpirationDate);
            return this;
        }
        public Builder agentVersionStatus(String agentVersionStatus) {
            this.agentVersionStatus = Objects.requireNonNull(agentVersionStatus);
            return this;
        }
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder discoveryEndpointUri(@Nullable String discoveryEndpointUri) {
            this.discoveryEndpointUri = discoveryEndpointUri;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastHeartBeat(@Nullable String lastHeartBeat) {
            this.lastHeartBeat = lastHeartBeat;
            return this;
        }
        public Builder lastOperationName(@Nullable String lastOperationName) {
            this.lastOperationName = lastOperationName;
            return this;
        }
        public Builder lastWorkflowId(@Nullable String lastWorkflowId) {
            this.lastWorkflowId = lastWorkflowId;
            return this;
        }
        public Builder managementEndpointUri(@Nullable String managementEndpointUri) {
            this.managementEndpointUri = managementEndpointUri;
            return this;
        }
        public Builder monitoringConfiguration(@Nullable String monitoringConfiguration) {
            this.monitoringConfiguration = monitoringConfiguration;
            return this;
        }
        public Builder monitoringEndpointUri(@Nullable String monitoringEndpointUri) {
            this.monitoringEndpointUri = monitoringEndpointUri;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder resourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }
        public Builder serverCertificate(@Nullable String serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }
        public Builder serverId(@Nullable String serverId) {
            this.serverId = serverId;
            return this;
        }
        public Builder serverManagementErrorCode(@Nullable Integer serverManagementErrorCode) {
            this.serverManagementErrorCode = serverManagementErrorCode;
            return this;
        }
        public Builder serverOSVersion(@Nullable String serverOSVersion) {
            this.serverOSVersion = serverOSVersion;
            return this;
        }
        public Builder serverRole(@Nullable String serverRole) {
            this.serverRole = serverRole;
            return this;
        }
        public Builder serviceLocation(@Nullable String serviceLocation) {
            this.serviceLocation = serviceLocation;
            return this;
        }
        public Builder storageSyncServiceUid(@Nullable String storageSyncServiceUid) {
            this.storageSyncServiceUid = storageSyncServiceUid;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetRegisteredServerResult build() {
            return new GetRegisteredServerResult(agentVersion, agentVersionExpirationDate, agentVersionStatus, clusterId, clusterName, discoveryEndpointUri, friendlyName, id, lastHeartBeat, lastOperationName, lastWorkflowId, managementEndpointUri, monitoringConfiguration, monitoringEndpointUri, name, provisioningState, resourceLocation, serverCertificate, serverId, serverManagementErrorCode, serverOSVersion, serverRole, serviceLocation, storageSyncServiceUid, type);
        }
    }
}
