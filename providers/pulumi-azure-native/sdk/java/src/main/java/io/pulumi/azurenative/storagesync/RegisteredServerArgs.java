// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagesync;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegisteredServerArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegisteredServerArgs Empty = new RegisteredServerArgs();

    /**
     * Registered Server Agent Version
     * 
     */
    @InputImport(name="agentVersion")
      private final @Nullable Input<String> agentVersion;

    public Input<String> getAgentVersion() {
        return this.agentVersion == null ? Input.empty() : this.agentVersion;
    }

    /**
     * Registered Server clusterId
     * 
     */
    @InputImport(name="clusterId")
      private final @Nullable Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId == null ? Input.empty() : this.clusterId;
    }

    /**
     * Registered Server clusterName
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * Friendly Name
     * 
     */
    @InputImport(name="friendlyName")
      private final @Nullable Input<String> friendlyName;

    public Input<String> getFriendlyName() {
        return this.friendlyName == null ? Input.empty() : this.friendlyName;
    }

    /**
     * Registered Server last heart beat
     * 
     */
    @InputImport(name="lastHeartBeat")
      private final @Nullable Input<String> lastHeartBeat;

    public Input<String> getLastHeartBeat() {
        return this.lastHeartBeat == null ? Input.empty() : this.lastHeartBeat;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Registered Server Certificate
     * 
     */
    @InputImport(name="serverCertificate")
      private final @Nullable Input<String> serverCertificate;

    public Input<String> getServerCertificate() {
        return this.serverCertificate == null ? Input.empty() : this.serverCertificate;
    }

    /**
     * Registered Server serverId
     * 
     */
    @InputImport(name="serverId")
      private final @Nullable Input<String> serverId;

    public Input<String> getServerId() {
        return this.serverId == null ? Input.empty() : this.serverId;
    }

    /**
     * Registered Server OS Version
     * 
     */
    @InputImport(name="serverOSVersion")
      private final @Nullable Input<String> serverOSVersion;

    public Input<String> getServerOSVersion() {
        return this.serverOSVersion == null ? Input.empty() : this.serverOSVersion;
    }

    /**
     * Registered Server serverRole
     * 
     */
    @InputImport(name="serverRole")
      private final @Nullable Input<String> serverRole;

    public Input<String> getServerRole() {
        return this.serverRole == null ? Input.empty() : this.serverRole;
    }

    /**
     * Name of Storage Sync Service resource.
     * 
     */
    @InputImport(name="storageSyncServiceName", required=true)
      private final Input<String> storageSyncServiceName;

    public Input<String> getStorageSyncServiceName() {
        return this.storageSyncServiceName;
    }

    public RegisteredServerArgs(
        @Nullable Input<String> agentVersion,
        @Nullable Input<String> clusterId,
        @Nullable Input<String> clusterName,
        @Nullable Input<String> friendlyName,
        @Nullable Input<String> lastHeartBeat,
        Input<String> resourceGroupName,
        @Nullable Input<String> serverCertificate,
        @Nullable Input<String> serverId,
        @Nullable Input<String> serverOSVersion,
        @Nullable Input<String> serverRole,
        Input<String> storageSyncServiceName) {
        this.agentVersion = agentVersion;
        this.clusterId = clusterId;
        this.clusterName = clusterName;
        this.friendlyName = friendlyName;
        this.lastHeartBeat = lastHeartBeat;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverCertificate = serverCertificate;
        this.serverId = serverId;
        this.serverOSVersion = serverOSVersion;
        this.serverRole = serverRole;
        this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName, "expected parameter 'storageSyncServiceName' to be non-null");
    }

    private RegisteredServerArgs() {
        this.agentVersion = Input.empty();
        this.clusterId = Input.empty();
        this.clusterName = Input.empty();
        this.friendlyName = Input.empty();
        this.lastHeartBeat = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverCertificate = Input.empty();
        this.serverId = Input.empty();
        this.serverOSVersion = Input.empty();
        this.serverRole = Input.empty();
        this.storageSyncServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegisteredServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> agentVersion;
        private @Nullable Input<String> clusterId;
        private @Nullable Input<String> clusterName;
        private @Nullable Input<String> friendlyName;
        private @Nullable Input<String> lastHeartBeat;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> serverCertificate;
        private @Nullable Input<String> serverId;
        private @Nullable Input<String> serverOSVersion;
        private @Nullable Input<String> serverRole;
        private Input<String> storageSyncServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(RegisteredServerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.lastHeartBeat = defaults.lastHeartBeat;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverCertificate = defaults.serverCertificate;
    	      this.serverId = defaults.serverId;
    	      this.serverOSVersion = defaults.serverOSVersion;
    	      this.serverRole = defaults.serverRole;
    	      this.storageSyncServiceName = defaults.storageSyncServiceName;
        }

        public Builder agentVersion(@Nullable Input<String> agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = Input.ofNullable(agentVersion);
            return this;
        }

        public Builder clusterId(@Nullable Input<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = Input.ofNullable(clusterId);
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

        public Builder friendlyName(@Nullable Input<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Input.ofNullable(friendlyName);
            return this;
        }

        public Builder lastHeartBeat(@Nullable Input<String> lastHeartBeat) {
            this.lastHeartBeat = lastHeartBeat;
            return this;
        }

        public Builder lastHeartBeat(@Nullable String lastHeartBeat) {
            this.lastHeartBeat = Input.ofNullable(lastHeartBeat);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serverCertificate(@Nullable Input<String> serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }

        public Builder serverCertificate(@Nullable String serverCertificate) {
            this.serverCertificate = Input.ofNullable(serverCertificate);
            return this;
        }

        public Builder serverId(@Nullable Input<String> serverId) {
            this.serverId = serverId;
            return this;
        }

        public Builder serverId(@Nullable String serverId) {
            this.serverId = Input.ofNullable(serverId);
            return this;
        }

        public Builder serverOSVersion(@Nullable Input<String> serverOSVersion) {
            this.serverOSVersion = serverOSVersion;
            return this;
        }

        public Builder serverOSVersion(@Nullable String serverOSVersion) {
            this.serverOSVersion = Input.ofNullable(serverOSVersion);
            return this;
        }

        public Builder serverRole(@Nullable Input<String> serverRole) {
            this.serverRole = serverRole;
            return this;
        }

        public Builder serverRole(@Nullable String serverRole) {
            this.serverRole = Input.ofNullable(serverRole);
            return this;
        }

        public Builder storageSyncServiceName(Input<String> storageSyncServiceName) {
            this.storageSyncServiceName = Objects.requireNonNull(storageSyncServiceName);
            return this;
        }

        public Builder storageSyncServiceName(String storageSyncServiceName) {
            this.storageSyncServiceName = Input.of(Objects.requireNonNull(storageSyncServiceName));
            return this;
        }
        public RegisteredServerArgs build() {
            return new RegisteredServerArgs(agentVersion, clusterId, clusterName, friendlyName, lastHeartBeat, resourceGroupName, serverCertificate, serverId, serverOSVersion, serverRole, storageSyncServiceName);
        }
    }
}
