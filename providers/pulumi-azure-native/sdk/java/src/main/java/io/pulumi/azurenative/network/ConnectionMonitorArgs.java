// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ConnectionMonitorDestinationArgs;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointArgs;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorOutputArgs;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorSourceArgs;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorTestConfigurationArgs;
import io.pulumi.azurenative.network.inputs.ConnectionMonitorTestGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionMonitorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorArgs Empty = new ConnectionMonitorArgs();

    /**
     * Determines if the connection monitor will start automatically once created.
     * 
     */
    @InputImport(name="autoStart")
      private final @Nullable Input<Boolean> autoStart;

    public Input<Boolean> getAutoStart() {
        return this.autoStart == null ? Input.empty() : this.autoStart;
    }

    /**
     * The name of the connection monitor.
     * 
     */
    @InputImport(name="connectionMonitorName")
      private final @Nullable Input<String> connectionMonitorName;

    public Input<String> getConnectionMonitorName() {
        return this.connectionMonitorName == null ? Input.empty() : this.connectionMonitorName;
    }

    /**
     * Describes the destination of connection monitor.
     * 
     */
    @InputImport(name="destination")
      private final @Nullable Input<ConnectionMonitorDestinationArgs> destination;

    public Input<ConnectionMonitorDestinationArgs> getDestination() {
        return this.destination == null ? Input.empty() : this.destination;
    }

    /**
     * List of connection monitor endpoints.
     * 
     */
    @InputImport(name="endpoints")
      private final @Nullable Input<List<ConnectionMonitorEndpointArgs>> endpoints;

    public Input<List<ConnectionMonitorEndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    /**
     * Connection monitor location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Value indicating whether connection monitor V1 should be migrated to V2 format.
     * 
     */
    @InputImport(name="migrate")
      private final @Nullable Input<String> migrate;

    public Input<String> getMigrate() {
        return this.migrate == null ? Input.empty() : this.migrate;
    }

    /**
     * Monitoring interval in seconds.
     * 
     */
    @InputImport(name="monitoringIntervalInSeconds")
      private final @Nullable Input<Integer> monitoringIntervalInSeconds;

    public Input<Integer> getMonitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds == null ? Input.empty() : this.monitoringIntervalInSeconds;
    }

    /**
     * The name of the Network Watcher resource.
     * 
     */
    @InputImport(name="networkWatcherName", required=true)
      private final Input<String> networkWatcherName;

    public Input<String> getNetworkWatcherName() {
        return this.networkWatcherName;
    }

    /**
     * Optional notes to be associated with the connection monitor.
     * 
     */
    @InputImport(name="notes")
      private final @Nullable Input<String> notes;

    public Input<String> getNotes() {
        return this.notes == null ? Input.empty() : this.notes;
    }

    /**
     * List of connection monitor outputs.
     * 
     */
    @InputImport(name="outputs")
      private final @Nullable Input<List<ConnectionMonitorOutputArgs>> outputs;

    public Input<List<ConnectionMonitorOutputArgs>> getOutputs() {
        return this.outputs == null ? Input.empty() : this.outputs;
    }

    /**
     * The name of the resource group containing Network Watcher.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Describes the source of connection monitor.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Input<ConnectionMonitorSourceArgs> source;

    public Input<ConnectionMonitorSourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    /**
     * Connection monitor tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * List of connection monitor test configurations.
     * 
     */
    @InputImport(name="testConfigurations")
      private final @Nullable Input<List<ConnectionMonitorTestConfigurationArgs>> testConfigurations;

    public Input<List<ConnectionMonitorTestConfigurationArgs>> getTestConfigurations() {
        return this.testConfigurations == null ? Input.empty() : this.testConfigurations;
    }

    /**
     * List of connection monitor test groups.
     * 
     */
    @InputImport(name="testGroups")
      private final @Nullable Input<List<ConnectionMonitorTestGroupArgs>> testGroups;

    public Input<List<ConnectionMonitorTestGroupArgs>> getTestGroups() {
        return this.testGroups == null ? Input.empty() : this.testGroups;
    }

    public ConnectionMonitorArgs(
        @Nullable Input<Boolean> autoStart,
        @Nullable Input<String> connectionMonitorName,
        @Nullable Input<ConnectionMonitorDestinationArgs> destination,
        @Nullable Input<List<ConnectionMonitorEndpointArgs>> endpoints,
        @Nullable Input<String> location,
        @Nullable Input<String> migrate,
        @Nullable Input<Integer> monitoringIntervalInSeconds,
        Input<String> networkWatcherName,
        @Nullable Input<String> notes,
        @Nullable Input<List<ConnectionMonitorOutputArgs>> outputs,
        Input<String> resourceGroupName,
        @Nullable Input<ConnectionMonitorSourceArgs> source,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<ConnectionMonitorTestConfigurationArgs>> testConfigurations,
        @Nullable Input<List<ConnectionMonitorTestGroupArgs>> testGroups) {
        this.autoStart = autoStart == null ? Input.ofNullable(true) : autoStart;
        this.connectionMonitorName = connectionMonitorName;
        this.destination = destination;
        this.endpoints = endpoints;
        this.location = location;
        this.migrate = migrate;
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds == null ? Input.ofNullable(60) : monitoringIntervalInSeconds;
        this.networkWatcherName = Objects.requireNonNull(networkWatcherName, "expected parameter 'networkWatcherName' to be non-null");
        this.notes = notes;
        this.outputs = outputs;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = source;
        this.tags = tags;
        this.testConfigurations = testConfigurations;
        this.testGroups = testGroups;
    }

    private ConnectionMonitorArgs() {
        this.autoStart = Input.empty();
        this.connectionMonitorName = Input.empty();
        this.destination = Input.empty();
        this.endpoints = Input.empty();
        this.location = Input.empty();
        this.migrate = Input.empty();
        this.monitoringIntervalInSeconds = Input.empty();
        this.networkWatcherName = Input.empty();
        this.notes = Input.empty();
        this.outputs = Input.empty();
        this.resourceGroupName = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
        this.testConfigurations = Input.empty();
        this.testGroups = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> autoStart;
        private @Nullable Input<String> connectionMonitorName;
        private @Nullable Input<ConnectionMonitorDestinationArgs> destination;
        private @Nullable Input<List<ConnectionMonitorEndpointArgs>> endpoints;
        private @Nullable Input<String> location;
        private @Nullable Input<String> migrate;
        private @Nullable Input<Integer> monitoringIntervalInSeconds;
        private Input<String> networkWatcherName;
        private @Nullable Input<String> notes;
        private @Nullable Input<List<ConnectionMonitorOutputArgs>> outputs;
        private Input<String> resourceGroupName;
        private @Nullable Input<ConnectionMonitorSourceArgs> source;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<ConnectionMonitorTestConfigurationArgs>> testConfigurations;
        private @Nullable Input<List<ConnectionMonitorTestGroupArgs>> testGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoStart = defaults.autoStart;
    	      this.connectionMonitorName = defaults.connectionMonitorName;
    	      this.destination = defaults.destination;
    	      this.endpoints = defaults.endpoints;
    	      this.location = defaults.location;
    	      this.migrate = defaults.migrate;
    	      this.monitoringIntervalInSeconds = defaults.monitoringIntervalInSeconds;
    	      this.networkWatcherName = defaults.networkWatcherName;
    	      this.notes = defaults.notes;
    	      this.outputs = defaults.outputs;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.testConfigurations = defaults.testConfigurations;
    	      this.testGroups = defaults.testGroups;
        }

        public Builder autoStart(@Nullable Input<Boolean> autoStart) {
            this.autoStart = autoStart;
            return this;
        }

        public Builder autoStart(@Nullable Boolean autoStart) {
            this.autoStart = Input.ofNullable(autoStart);
            return this;
        }

        public Builder connectionMonitorName(@Nullable Input<String> connectionMonitorName) {
            this.connectionMonitorName = connectionMonitorName;
            return this;
        }

        public Builder connectionMonitorName(@Nullable String connectionMonitorName) {
            this.connectionMonitorName = Input.ofNullable(connectionMonitorName);
            return this;
        }

        public Builder destination(@Nullable Input<ConnectionMonitorDestinationArgs> destination) {
            this.destination = destination;
            return this;
        }

        public Builder destination(@Nullable ConnectionMonitorDestinationArgs destination) {
            this.destination = Input.ofNullable(destination);
            return this;
        }

        public Builder endpoints(@Nullable Input<List<ConnectionMonitorEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder endpoints(@Nullable List<ConnectionMonitorEndpointArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder migrate(@Nullable Input<String> migrate) {
            this.migrate = migrate;
            return this;
        }

        public Builder migrate(@Nullable String migrate) {
            this.migrate = Input.ofNullable(migrate);
            return this;
        }

        public Builder monitoringIntervalInSeconds(@Nullable Input<Integer> monitoringIntervalInSeconds) {
            this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
            return this;
        }

        public Builder monitoringIntervalInSeconds(@Nullable Integer monitoringIntervalInSeconds) {
            this.monitoringIntervalInSeconds = Input.ofNullable(monitoringIntervalInSeconds);
            return this;
        }

        public Builder networkWatcherName(Input<String> networkWatcherName) {
            this.networkWatcherName = Objects.requireNonNull(networkWatcherName);
            return this;
        }

        public Builder networkWatcherName(String networkWatcherName) {
            this.networkWatcherName = Input.of(Objects.requireNonNull(networkWatcherName));
            return this;
        }

        public Builder notes(@Nullable Input<String> notes) {
            this.notes = notes;
            return this;
        }

        public Builder notes(@Nullable String notes) {
            this.notes = Input.ofNullable(notes);
            return this;
        }

        public Builder outputs(@Nullable Input<List<ConnectionMonitorOutputArgs>> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder outputs(@Nullable List<ConnectionMonitorOutputArgs> outputs) {
            this.outputs = Input.ofNullable(outputs);
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

        public Builder source(@Nullable Input<ConnectionMonitorSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable ConnectionMonitorSourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder testConfigurations(@Nullable Input<List<ConnectionMonitorTestConfigurationArgs>> testConfigurations) {
            this.testConfigurations = testConfigurations;
            return this;
        }

        public Builder testConfigurations(@Nullable List<ConnectionMonitorTestConfigurationArgs> testConfigurations) {
            this.testConfigurations = Input.ofNullable(testConfigurations);
            return this;
        }

        public Builder testGroups(@Nullable Input<List<ConnectionMonitorTestGroupArgs>> testGroups) {
            this.testGroups = testGroups;
            return this;
        }

        public Builder testGroups(@Nullable List<ConnectionMonitorTestGroupArgs> testGroups) {
            this.testGroups = Input.ofNullable(testGroups);
            return this;
        }
        public ConnectionMonitorArgs build() {
            return new ConnectionMonitorArgs(autoStart, connectionMonitorName, destination, endpoints, location, migrate, monitoringIntervalInSeconds, networkWatcherName, notes, outputs, resourceGroupName, source, tags, testConfigurations, testGroups);
        }
    }
}
