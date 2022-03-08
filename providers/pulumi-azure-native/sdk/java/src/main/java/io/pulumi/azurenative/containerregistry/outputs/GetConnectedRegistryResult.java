// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.azurenative.containerregistry.outputs.ActivationPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.LoggingPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.LoginServerPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.ParentPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.StatusDetailPropertiesResponse;
import io.pulumi.azurenative.containerregistry.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetConnectedRegistryResult {
    /**
     * The activation properties of the connected registry.
     * 
     */
    private final ActivationPropertiesResponse activation;
    /**
     * The list of the ACR token resource IDs used to authenticate clients to the connected registry.
     * 
     */
    private final @Nullable List<String> clientTokenIds;
    /**
     * The current connection state of the connected registry.
     * 
     */
    private final String connectionState;
    /**
     * The resource ID.
     * 
     */
    private final String id;
    /**
     * The last activity time of the connected registry.
     * 
     */
    private final String lastActivityTime;
    /**
     * The logging properties of the connected registry.
     * 
     */
    private final @Nullable LoggingPropertiesResponse logging;
    /**
     * The login server properties of the connected registry.
     * 
     */
    private final @Nullable LoginServerPropertiesResponse loginServer;
    /**
     * The mode of the connected registry resource that indicates the permissions of the registry.
     * 
     */
    private final String mode;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The parent of the connected registry.
     * 
     */
    private final ParentPropertiesResponse parent;
    /**
     * Provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The list of current statuses of the connected registry.
     * 
     */
    private final List<StatusDetailPropertiesResponse> statusDetails;
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource.
     * 
     */
    private final String type;
    /**
     * The current version of ACR runtime on the connected registry.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"activation","clientTokenIds","connectionState","id","lastActivityTime","logging","loginServer","mode","name","parent","provisioningState","statusDetails","systemData","type","version"})
    private GetConnectedRegistryResult(
        ActivationPropertiesResponse activation,
        @Nullable List<String> clientTokenIds,
        String connectionState,
        String id,
        String lastActivityTime,
        @Nullable LoggingPropertiesResponse logging,
        @Nullable LoginServerPropertiesResponse loginServer,
        String mode,
        String name,
        ParentPropertiesResponse parent,
        String provisioningState,
        List<StatusDetailPropertiesResponse> statusDetails,
        SystemDataResponse systemData,
        String type,
        String version) {
        this.activation = activation;
        this.clientTokenIds = clientTokenIds;
        this.connectionState = connectionState;
        this.id = id;
        this.lastActivityTime = lastActivityTime;
        this.logging = logging;
        this.loginServer = loginServer;
        this.mode = mode;
        this.name = name;
        this.parent = parent;
        this.provisioningState = provisioningState;
        this.statusDetails = statusDetails;
        this.systemData = systemData;
        this.type = type;
        this.version = version;
    }

    /**
     * The activation properties of the connected registry.
     * 
    */
    public ActivationPropertiesResponse getActivation() {
        return this.activation;
    }
    /**
     * The list of the ACR token resource IDs used to authenticate clients to the connected registry.
     * 
    */
    public List<String> getClientTokenIds() {
        return this.clientTokenIds == null ? List.of() : this.clientTokenIds;
    }
    /**
     * The current connection state of the connected registry.
     * 
    */
    public String getConnectionState() {
        return this.connectionState;
    }
    /**
     * The resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The last activity time of the connected registry.
     * 
    */
    public String getLastActivityTime() {
        return this.lastActivityTime;
    }
    /**
     * The logging properties of the connected registry.
     * 
    */
    public Optional<LoggingPropertiesResponse> getLogging() {
        return Optional.ofNullable(this.logging);
    }
    /**
     * The login server properties of the connected registry.
     * 
    */
    public Optional<LoginServerPropertiesResponse> getLoginServer() {
        return Optional.ofNullable(this.loginServer);
    }
    /**
     * The mode of the connected registry resource that indicates the permissions of the registry.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The parent of the connected registry.
     * 
    */
    public ParentPropertiesResponse getParent() {
        return this.parent;
    }
    /**
     * Provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The list of current statuses of the connected registry.
     * 
    */
    public List<StatusDetailPropertiesResponse> getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The current version of ACR runtime on the connected registry.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectedRegistryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivationPropertiesResponse activation;
        private @Nullable List<String> clientTokenIds;
        private String connectionState;
        private String id;
        private String lastActivityTime;
        private @Nullable LoggingPropertiesResponse logging;
        private @Nullable LoginServerPropertiesResponse loginServer;
        private String mode;
        private String name;
        private ParentPropertiesResponse parent;
        private String provisioningState;
        private List<StatusDetailPropertiesResponse> statusDetails;
        private SystemDataResponse systemData;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectedRegistryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activation = defaults.activation;
    	      this.clientTokenIds = defaults.clientTokenIds;
    	      this.connectionState = defaults.connectionState;
    	      this.id = defaults.id;
    	      this.lastActivityTime = defaults.lastActivityTime;
    	      this.logging = defaults.logging;
    	      this.loginServer = defaults.loginServer;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.provisioningState = defaults.provisioningState;
    	      this.statusDetails = defaults.statusDetails;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setActivation(ActivationPropertiesResponse activation) {
            this.activation = Objects.requireNonNull(activation);
            return this;
        }

        public Builder setClientTokenIds(@Nullable List<String> clientTokenIds) {
            this.clientTokenIds = clientTokenIds;
            return this;
        }

        public Builder setConnectionState(String connectionState) {
            this.connectionState = Objects.requireNonNull(connectionState);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastActivityTime(String lastActivityTime) {
            this.lastActivityTime = Objects.requireNonNull(lastActivityTime);
            return this;
        }

        public Builder setLogging(@Nullable LoggingPropertiesResponse logging) {
            this.logging = logging;
            return this;
        }

        public Builder setLoginServer(@Nullable LoginServerPropertiesResponse loginServer) {
            this.loginServer = loginServer;
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParent(ParentPropertiesResponse parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatusDetails(List<StatusDetailPropertiesResponse> statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetConnectedRegistryResult build() {
            return new GetConnectedRegistryResult(activation, clientTokenIds, connectionState, id, lastActivityTime, logging, loginServer, mode, name, parent, provisioningState, statusDetails, systemData, type, version);
        }
    }
}
