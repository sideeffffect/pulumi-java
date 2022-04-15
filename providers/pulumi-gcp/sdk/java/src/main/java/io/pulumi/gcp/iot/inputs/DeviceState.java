// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.iot.inputs.DeviceConfigGetArgs;
import io.pulumi.gcp.iot.inputs.DeviceCredentialGetArgs;
import io.pulumi.gcp.iot.inputs.DeviceGatewayConfigGetArgs;
import io.pulumi.gcp.iot.inputs.DeviceLastErrorStatusGetArgs;
import io.pulumi.gcp.iot.inputs.DeviceStateGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceState extends io.pulumi.resources.ResourceArgs {

    public static final DeviceState Empty = new DeviceState();

    /**
     * If a device is blocked, connections or requests from this device will fail.
     * 
     */
    @Import(name="blocked")
      private final @Nullable Output<Boolean> blocked;

    public Output<Boolean> blocked() {
        return this.blocked == null ? Codegen.empty() : this.blocked;
    }

    /**
     * The most recent device configuration, which is eventually sent from Cloud IoT Core to the device.
     * 
     */
    @Import(name="configs")
      private final @Nullable Output<List<DeviceConfigGetArgs>> configs;

    public Output<List<DeviceConfigGetArgs>> configs() {
        return this.configs == null ? Codegen.empty() : this.configs;
    }

    /**
     * The credentials used to authenticate this device.
     * Structure is documented below.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<List<DeviceCredentialGetArgs>> credentials;

    public Output<List<DeviceCredentialGetArgs>> credentials() {
        return this.credentials == null ? Codegen.empty() : this.credentials;
    }

    /**
     * Gateway-related configuration and state.
     * Structure is documented below.
     * 
     */
    @Import(name="gatewayConfig")
      private final @Nullable Output<DeviceGatewayConfigGetArgs> gatewayConfig;

    public Output<DeviceGatewayConfigGetArgs> gatewayConfig() {
        return this.gatewayConfig == null ? Codegen.empty() : this.gatewayConfig;
    }

    /**
     * The last time a cloud-to-device config version acknowledgment was received from the device.
     * 
     */
    @Import(name="lastConfigAckTime")
      private final @Nullable Output<String> lastConfigAckTime;

    public Output<String> lastConfigAckTime() {
        return this.lastConfigAckTime == null ? Codegen.empty() : this.lastConfigAckTime;
    }

    /**
     * The last time a cloud-to-device config version was sent to the device.
     * 
     */
    @Import(name="lastConfigSendTime")
      private final @Nullable Output<String> lastConfigSendTime;

    public Output<String> lastConfigSendTime() {
        return this.lastConfigSendTime == null ? Codegen.empty() : this.lastConfigSendTime;
    }

    /**
     * The error message of the most recent error, such as a failure to publish to Cloud Pub/Sub.
     * 
     */
    @Import(name="lastErrorStatuses")
      private final @Nullable Output<List<DeviceLastErrorStatusGetArgs>> lastErrorStatuses;

    public Output<List<DeviceLastErrorStatusGetArgs>> lastErrorStatuses() {
        return this.lastErrorStatuses == null ? Codegen.empty() : this.lastErrorStatuses;
    }

    /**
     * The time the most recent error occurred, such as a failure to publish to Cloud Pub/Sub.
     * 
     */
    @Import(name="lastErrorTime")
      private final @Nullable Output<String> lastErrorTime;

    public Output<String> lastErrorTime() {
        return this.lastErrorTime == null ? Codegen.empty() : this.lastErrorTime;
    }

    /**
     * The last time a telemetry event was received.
     * 
     */
    @Import(name="lastEventTime")
      private final @Nullable Output<String> lastEventTime;

    public Output<String> lastEventTime() {
        return this.lastEventTime == null ? Codegen.empty() : this.lastEventTime;
    }

    /**
     * The last time an MQTT PINGREQ was received.
     * 
     */
    @Import(name="lastHeartbeatTime")
      private final @Nullable Output<String> lastHeartbeatTime;

    public Output<String> lastHeartbeatTime() {
        return this.lastHeartbeatTime == null ? Codegen.empty() : this.lastHeartbeatTime;
    }

    /**
     * The last time a state event was received.
     * 
     */
    @Import(name="lastStateTime")
      private final @Nullable Output<String> lastStateTime;

    public Output<String> lastStateTime() {
        return this.lastStateTime == null ? Codegen.empty() : this.lastStateTime;
    }

    /**
     * The logging verbosity for device activity.
     * Possible values are `NONE`, `ERROR`, `INFO`, and `DEBUG`.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<String> logLevel;

    public Output<String> logLevel() {
        return this.logLevel == null ? Codegen.empty() : this.logLevel;
    }

    /**
     * The metadata key-value pairs assigned to the device.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * A unique name for the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A server-defined unique numeric ID for the device. This is a more compact way to identify devices, and it is globally
     * unique.
     * 
     */
    @Import(name="numId")
      private final @Nullable Output<String> numId;

    public Output<String> numId() {
        return this.numId == null ? Codegen.empty() : this.numId;
    }

    /**
     * The name of the device registry where this device should be created.
     * 
     */
    @Import(name="registry")
      private final @Nullable Output<String> registry;

    public Output<String> registry() {
        return this.registry == null ? Codegen.empty() : this.registry;
    }

    /**
     * The state most recently received from the device.
     * 
     */
    @Import(name="states")
      private final @Nullable Output<List<DeviceStateGetArgs>> states;

    public Output<List<DeviceStateGetArgs>> states() {
        return this.states == null ? Codegen.empty() : this.states;
    }

    public DeviceState(
        @Nullable Output<Boolean> blocked,
        @Nullable Output<List<DeviceConfigGetArgs>> configs,
        @Nullable Output<List<DeviceCredentialGetArgs>> credentials,
        @Nullable Output<DeviceGatewayConfigGetArgs> gatewayConfig,
        @Nullable Output<String> lastConfigAckTime,
        @Nullable Output<String> lastConfigSendTime,
        @Nullable Output<List<DeviceLastErrorStatusGetArgs>> lastErrorStatuses,
        @Nullable Output<String> lastErrorTime,
        @Nullable Output<String> lastEventTime,
        @Nullable Output<String> lastHeartbeatTime,
        @Nullable Output<String> lastStateTime,
        @Nullable Output<String> logLevel,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        @Nullable Output<String> numId,
        @Nullable Output<String> registry,
        @Nullable Output<List<DeviceStateGetArgs>> states) {
        this.blocked = blocked;
        this.configs = configs;
        this.credentials = credentials;
        this.gatewayConfig = gatewayConfig;
        this.lastConfigAckTime = lastConfigAckTime;
        this.lastConfigSendTime = lastConfigSendTime;
        this.lastErrorStatuses = lastErrorStatuses;
        this.lastErrorTime = lastErrorTime;
        this.lastEventTime = lastEventTime;
        this.lastHeartbeatTime = lastHeartbeatTime;
        this.lastStateTime = lastStateTime;
        this.logLevel = logLevel;
        this.metadata = metadata;
        this.name = name;
        this.numId = numId;
        this.registry = registry;
        this.states = states;
    }

    private DeviceState() {
        this.blocked = Codegen.empty();
        this.configs = Codegen.empty();
        this.credentials = Codegen.empty();
        this.gatewayConfig = Codegen.empty();
        this.lastConfigAckTime = Codegen.empty();
        this.lastConfigSendTime = Codegen.empty();
        this.lastErrorStatuses = Codegen.empty();
        this.lastErrorTime = Codegen.empty();
        this.lastEventTime = Codegen.empty();
        this.lastHeartbeatTime = Codegen.empty();
        this.lastStateTime = Codegen.empty();
        this.logLevel = Codegen.empty();
        this.metadata = Codegen.empty();
        this.name = Codegen.empty();
        this.numId = Codegen.empty();
        this.registry = Codegen.empty();
        this.states = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> blocked;
        private @Nullable Output<List<DeviceConfigGetArgs>> configs;
        private @Nullable Output<List<DeviceCredentialGetArgs>> credentials;
        private @Nullable Output<DeviceGatewayConfigGetArgs> gatewayConfig;
        private @Nullable Output<String> lastConfigAckTime;
        private @Nullable Output<String> lastConfigSendTime;
        private @Nullable Output<List<DeviceLastErrorStatusGetArgs>> lastErrorStatuses;
        private @Nullable Output<String> lastErrorTime;
        private @Nullable Output<String> lastEventTime;
        private @Nullable Output<String> lastHeartbeatTime;
        private @Nullable Output<String> lastStateTime;
        private @Nullable Output<String> logLevel;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<String> numId;
        private @Nullable Output<String> registry;
        private @Nullable Output<List<DeviceStateGetArgs>> states;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blocked = defaults.blocked;
    	      this.configs = defaults.configs;
    	      this.credentials = defaults.credentials;
    	      this.gatewayConfig = defaults.gatewayConfig;
    	      this.lastConfigAckTime = defaults.lastConfigAckTime;
    	      this.lastConfigSendTime = defaults.lastConfigSendTime;
    	      this.lastErrorStatuses = defaults.lastErrorStatuses;
    	      this.lastErrorTime = defaults.lastErrorTime;
    	      this.lastEventTime = defaults.lastEventTime;
    	      this.lastHeartbeatTime = defaults.lastHeartbeatTime;
    	      this.lastStateTime = defaults.lastStateTime;
    	      this.logLevel = defaults.logLevel;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.numId = defaults.numId;
    	      this.registry = defaults.registry;
    	      this.states = defaults.states;
        }

        public Builder blocked(@Nullable Output<Boolean> blocked) {
            this.blocked = blocked;
            return this;
        }
        public Builder blocked(@Nullable Boolean blocked) {
            this.blocked = Codegen.ofNullable(blocked);
            return this;
        }
        public Builder configs(@Nullable Output<List<DeviceConfigGetArgs>> configs) {
            this.configs = configs;
            return this;
        }
        public Builder configs(@Nullable List<DeviceConfigGetArgs> configs) {
            this.configs = Codegen.ofNullable(configs);
            return this;
        }
        public Builder configs(DeviceConfigGetArgs... configs) {
            return configs(List.of(configs));
        }
        public Builder credentials(@Nullable Output<List<DeviceCredentialGetArgs>> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable List<DeviceCredentialGetArgs> credentials) {
            this.credentials = Codegen.ofNullable(credentials);
            return this;
        }
        public Builder credentials(DeviceCredentialGetArgs... credentials) {
            return credentials(List.of(credentials));
        }
        public Builder gatewayConfig(@Nullable Output<DeviceGatewayConfigGetArgs> gatewayConfig) {
            this.gatewayConfig = gatewayConfig;
            return this;
        }
        public Builder gatewayConfig(@Nullable DeviceGatewayConfigGetArgs gatewayConfig) {
            this.gatewayConfig = Codegen.ofNullable(gatewayConfig);
            return this;
        }
        public Builder lastConfigAckTime(@Nullable Output<String> lastConfigAckTime) {
            this.lastConfigAckTime = lastConfigAckTime;
            return this;
        }
        public Builder lastConfigAckTime(@Nullable String lastConfigAckTime) {
            this.lastConfigAckTime = Codegen.ofNullable(lastConfigAckTime);
            return this;
        }
        public Builder lastConfigSendTime(@Nullable Output<String> lastConfigSendTime) {
            this.lastConfigSendTime = lastConfigSendTime;
            return this;
        }
        public Builder lastConfigSendTime(@Nullable String lastConfigSendTime) {
            this.lastConfigSendTime = Codegen.ofNullable(lastConfigSendTime);
            return this;
        }
        public Builder lastErrorStatuses(@Nullable Output<List<DeviceLastErrorStatusGetArgs>> lastErrorStatuses) {
            this.lastErrorStatuses = lastErrorStatuses;
            return this;
        }
        public Builder lastErrorStatuses(@Nullable List<DeviceLastErrorStatusGetArgs> lastErrorStatuses) {
            this.lastErrorStatuses = Codegen.ofNullable(lastErrorStatuses);
            return this;
        }
        public Builder lastErrorStatuses(DeviceLastErrorStatusGetArgs... lastErrorStatuses) {
            return lastErrorStatuses(List.of(lastErrorStatuses));
        }
        public Builder lastErrorTime(@Nullable Output<String> lastErrorTime) {
            this.lastErrorTime = lastErrorTime;
            return this;
        }
        public Builder lastErrorTime(@Nullable String lastErrorTime) {
            this.lastErrorTime = Codegen.ofNullable(lastErrorTime);
            return this;
        }
        public Builder lastEventTime(@Nullable Output<String> lastEventTime) {
            this.lastEventTime = lastEventTime;
            return this;
        }
        public Builder lastEventTime(@Nullable String lastEventTime) {
            this.lastEventTime = Codegen.ofNullable(lastEventTime);
            return this;
        }
        public Builder lastHeartbeatTime(@Nullable Output<String> lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }
        public Builder lastHeartbeatTime(@Nullable String lastHeartbeatTime) {
            this.lastHeartbeatTime = Codegen.ofNullable(lastHeartbeatTime);
            return this;
        }
        public Builder lastStateTime(@Nullable Output<String> lastStateTime) {
            this.lastStateTime = lastStateTime;
            return this;
        }
        public Builder lastStateTime(@Nullable String lastStateTime) {
            this.lastStateTime = Codegen.ofNullable(lastStateTime);
            return this;
        }
        public Builder logLevel(@Nullable Output<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = Codegen.ofNullable(logLevel);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder numId(@Nullable Output<String> numId) {
            this.numId = numId;
            return this;
        }
        public Builder numId(@Nullable String numId) {
            this.numId = Codegen.ofNullable(numId);
            return this;
        }
        public Builder registry(@Nullable Output<String> registry) {
            this.registry = registry;
            return this;
        }
        public Builder registry(@Nullable String registry) {
            this.registry = Codegen.ofNullable(registry);
            return this;
        }
        public Builder states(@Nullable Output<List<DeviceStateGetArgs>> states) {
            this.states = states;
            return this;
        }
        public Builder states(@Nullable List<DeviceStateGetArgs> states) {
            this.states = Codegen.ofNullable(states);
            return this;
        }
        public Builder states(DeviceStateGetArgs... states) {
            return states(List.of(states));
        }        public DeviceState build() {
            return new DeviceState(blocked, configs, credentials, gatewayConfig, lastConfigAckTime, lastConfigSendTime, lastErrorStatuses, lastErrorTime, lastEventTime, lastHeartbeatTime, lastStateTime, logLevel, metadata, name, numId, registry, states);
        }
    }
}
