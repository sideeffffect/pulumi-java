// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.awsnative.gamelift.enums.FleetNewGameSessionProtectionPolicy;
import io.pulumi.awsnative.gamelift.outputs.FleetIpPermission;
import io.pulumi.awsnative.gamelift.outputs.FleetLocationConfiguration;
import io.pulumi.awsnative.gamelift.outputs.FleetResourceCreationLimitPolicy;
import io.pulumi.awsnative.gamelift.outputs.FleetRuntimeConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFleetResult {
    /**
     * A human-readable description of a fleet.
     * 
     */
    private final @Nullable String description;
    /**
     * [DEPRECATED] The number of EC2 instances that you want this fleet to host. When creating a new fleet, GameLift automatically sets this value to "1" and initiates a single instance. Once the fleet is active, update this value to trigger GameLift to add or remove instances from the fleet.
     * 
     */
    private final @Nullable Integer desiredEC2Instances;
    /**
     * A range of IP addresses and port settings that allow inbound traffic to connect to server processes on an Amazon GameLift server.
     * 
     */
    private final @Nullable List<FleetIpPermission> eC2InboundPermissions;
    /**
     * Unique fleet ID
     * 
     */
    private final @Nullable String fleetId;
    private final @Nullable List<FleetLocationConfiguration> locations;
    /**
     * [DEPRECATED] The maximum value that is allowed for the fleet's instance count. When creating a new fleet, GameLift automatically sets this value to "1". Once the fleet is active, you can change this value.
     * 
     */
    private final @Nullable Integer maxSize;
    /**
     * The name of an Amazon CloudWatch metric group. A metric group aggregates the metrics for all fleets in the group. Specify a string containing the metric group name. You can use an existing name or use a new name to create a new metric group. Currently, this parameter can have only one string.
     * 
     */
    private final @Nullable List<String> metricGroups;
    /**
     * [DEPRECATED] The minimum value allowed for the fleet's instance count. When creating a new fleet, GameLift automatically sets this value to "0". After the fleet is active, you can change this value.
     * 
     */
    private final @Nullable Integer minSize;
    /**
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * 
     */
    private final @Nullable String name;
    /**
     * A game session protection policy to apply to all game sessions hosted on instances in this fleet. When protected, active game sessions cannot be terminated during a scale-down event. If this parameter is not set, instances in this fleet default to no protection. You can change a fleet's protection policy to affect future game sessions on the fleet. You can also set protection for individual game sessions.
     * 
     */
    private final @Nullable FleetNewGameSessionProtectionPolicy newGameSessionProtectionPolicy;
    /**
     * A policy that limits the number of game sessions an individual player can create over a span of time for this fleet.
     * 
     */
    private final @Nullable FleetResourceCreationLimitPolicy resourceCreationLimitPolicy;
    /**
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime script. The runtime configuration defines the server executables or launch script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails with an invalid request exception.
     * 
     * This parameter is required unless the parameters ServerLaunchPath and ServerLaunchParameters are defined. Runtime configuration has replaced these parameters, but fleets that use them will continue to work.
     * 
     */
    private final @Nullable FleetRuntimeConfiguration runtimeConfiguration;

    @OutputCustomType.Constructor
    private GetFleetResult(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("desiredEC2Instances") @Nullable Integer desiredEC2Instances,
        @OutputCustomType.Parameter("eC2InboundPermissions") @Nullable List<FleetIpPermission> eC2InboundPermissions,
        @OutputCustomType.Parameter("fleetId") @Nullable String fleetId,
        @OutputCustomType.Parameter("locations") @Nullable List<FleetLocationConfiguration> locations,
        @OutputCustomType.Parameter("maxSize") @Nullable Integer maxSize,
        @OutputCustomType.Parameter("metricGroups") @Nullable List<String> metricGroups,
        @OutputCustomType.Parameter("minSize") @Nullable Integer minSize,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("newGameSessionProtectionPolicy") @Nullable FleetNewGameSessionProtectionPolicy newGameSessionProtectionPolicy,
        @OutputCustomType.Parameter("resourceCreationLimitPolicy") @Nullable FleetResourceCreationLimitPolicy resourceCreationLimitPolicy,
        @OutputCustomType.Parameter("runtimeConfiguration") @Nullable FleetRuntimeConfiguration runtimeConfiguration) {
        this.description = description;
        this.desiredEC2Instances = desiredEC2Instances;
        this.eC2InboundPermissions = eC2InboundPermissions;
        this.fleetId = fleetId;
        this.locations = locations;
        this.maxSize = maxSize;
        this.metricGroups = metricGroups;
        this.minSize = minSize;
        this.name = name;
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
        this.runtimeConfiguration = runtimeConfiguration;
    }

    /**
     * A human-readable description of a fleet.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * [DEPRECATED] The number of EC2 instances that you want this fleet to host. When creating a new fleet, GameLift automatically sets this value to "1" and initiates a single instance. Once the fleet is active, update this value to trigger GameLift to add or remove instances from the fleet.
     * 
    */
    public Optional<Integer> getDesiredEC2Instances() {
        return Optional.ofNullable(this.desiredEC2Instances);
    }
    /**
     * A range of IP addresses and port settings that allow inbound traffic to connect to server processes on an Amazon GameLift server.
     * 
    */
    public List<FleetIpPermission> getEC2InboundPermissions() {
        return this.eC2InboundPermissions == null ? List.of() : this.eC2InboundPermissions;
    }
    /**
     * Unique fleet ID
     * 
    */
    public Optional<String> getFleetId() {
        return Optional.ofNullable(this.fleetId);
    }
    public List<FleetLocationConfiguration> getLocations() {
        return this.locations == null ? List.of() : this.locations;
    }
    /**
     * [DEPRECATED] The maximum value that is allowed for the fleet's instance count. When creating a new fleet, GameLift automatically sets this value to "1". Once the fleet is active, you can change this value.
     * 
    */
    public Optional<Integer> getMaxSize() {
        return Optional.ofNullable(this.maxSize);
    }
    /**
     * The name of an Amazon CloudWatch metric group. A metric group aggregates the metrics for all fleets in the group. Specify a string containing the metric group name. You can use an existing name or use a new name to create a new metric group. Currently, this parameter can have only one string.
     * 
    */
    public List<String> getMetricGroups() {
        return this.metricGroups == null ? List.of() : this.metricGroups;
    }
    /**
     * [DEPRECATED] The minimum value allowed for the fleet's instance count. When creating a new fleet, GameLift automatically sets this value to "0". After the fleet is active, you can change this value.
     * 
    */
    public Optional<Integer> getMinSize() {
        return Optional.ofNullable(this.minSize);
    }
    /**
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * A game session protection policy to apply to all game sessions hosted on instances in this fleet. When protected, active game sessions cannot be terminated during a scale-down event. If this parameter is not set, instances in this fleet default to no protection. You can change a fleet's protection policy to affect future game sessions on the fleet. You can also set protection for individual game sessions.
     * 
    */
    public Optional<FleetNewGameSessionProtectionPolicy> getNewGameSessionProtectionPolicy() {
        return Optional.ofNullable(this.newGameSessionProtectionPolicy);
    }
    /**
     * A policy that limits the number of game sessions an individual player can create over a span of time for this fleet.
     * 
    */
    public Optional<FleetResourceCreationLimitPolicy> getResourceCreationLimitPolicy() {
        return Optional.ofNullable(this.resourceCreationLimitPolicy);
    }
    /**
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime script. The runtime configuration defines the server executables or launch script file, launch parameters, and the number of processes to run concurrently on each instance. When creating a fleet, the runtime configuration must have at least one server process configuration; otherwise the request fails with an invalid request exception.
     * 
     * This parameter is required unless the parameters ServerLaunchPath and ServerLaunchParameters are defined. Runtime configuration has replaced these parameters, but fleets that use them will continue to work.
     * 
    */
    public Optional<FleetRuntimeConfiguration> getRuntimeConfiguration() {
        return Optional.ofNullable(this.runtimeConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFleetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Integer desiredEC2Instances;
        private @Nullable List<FleetIpPermission> eC2InboundPermissions;
        private @Nullable String fleetId;
        private @Nullable List<FleetLocationConfiguration> locations;
        private @Nullable Integer maxSize;
        private @Nullable List<String> metricGroups;
        private @Nullable Integer minSize;
        private @Nullable String name;
        private @Nullable FleetNewGameSessionProtectionPolicy newGameSessionProtectionPolicy;
        private @Nullable FleetResourceCreationLimitPolicy resourceCreationLimitPolicy;
        private @Nullable FleetRuntimeConfiguration runtimeConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFleetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.desiredEC2Instances = defaults.desiredEC2Instances;
    	      this.eC2InboundPermissions = defaults.eC2InboundPermissions;
    	      this.fleetId = defaults.fleetId;
    	      this.locations = defaults.locations;
    	      this.maxSize = defaults.maxSize;
    	      this.metricGroups = defaults.metricGroups;
    	      this.minSize = defaults.minSize;
    	      this.name = defaults.name;
    	      this.newGameSessionProtectionPolicy = defaults.newGameSessionProtectionPolicy;
    	      this.resourceCreationLimitPolicy = defaults.resourceCreationLimitPolicy;
    	      this.runtimeConfiguration = defaults.runtimeConfiguration;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder desiredEC2Instances(@Nullable Integer desiredEC2Instances) {
            this.desiredEC2Instances = desiredEC2Instances;
            return this;
        }

        public Builder eC2InboundPermissions(@Nullable List<FleetIpPermission> eC2InboundPermissions) {
            this.eC2InboundPermissions = eC2InboundPermissions;
            return this;
        }

        public Builder fleetId(@Nullable String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        public Builder locations(@Nullable List<FleetLocationConfiguration> locations) {
            this.locations = locations;
            return this;
        }

        public Builder maxSize(@Nullable Integer maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        public Builder metricGroups(@Nullable List<String> metricGroups) {
            this.metricGroups = metricGroups;
            return this;
        }

        public Builder minSize(@Nullable Integer minSize) {
            this.minSize = minSize;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder newGameSessionProtectionPolicy(@Nullable FleetNewGameSessionProtectionPolicy newGameSessionProtectionPolicy) {
            this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
            return this;
        }

        public Builder resourceCreationLimitPolicy(@Nullable FleetResourceCreationLimitPolicy resourceCreationLimitPolicy) {
            this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
            return this;
        }

        public Builder runtimeConfiguration(@Nullable FleetRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public GetFleetResult build() {
            return new GetFleetResult(description, desiredEC2Instances, eC2InboundPermissions, fleetId, locations, maxSize, metricGroups, minSize, name, newGameSessionProtectionPolicy, resourceCreationLimitPolicy, runtimeConfiguration);
        }
    }
}
