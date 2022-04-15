// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iot;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.iot.inputs.RegistryCredentialArgs;
import io.pulumi.gcp.iot.inputs.RegistryEventNotificationConfigItemArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryArgs Empty = new RegistryArgs();

    /**
     * List of public key certificates to authenticate devices.
     * The structure is documented below.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<List<RegistryCredentialArgs>> credentials;

    public Output<List<RegistryCredentialArgs>> credentials() {
        return this.credentials == null ? Codegen.empty() : this.credentials;
    }

    /**
     * List of configurations for event notifications, such as PubSub topics
     * to publish device events to.
     * Structure is documented below.
     * 
     */
    @Import(name="eventNotificationConfigs")
      private final @Nullable Output<List<RegistryEventNotificationConfigItemArgs>> eventNotificationConfigs;

    public Output<List<RegistryEventNotificationConfigItemArgs>> eventNotificationConfigs() {
        return this.eventNotificationConfigs == null ? Codegen.empty() : this.eventNotificationConfigs;
    }

    /**
     * Activate or deactivate HTTP.
     * The structure is documented below.
     * 
     */
    @Import(name="httpConfig")
      private final @Nullable Output<Map<String,Object>> httpConfig;

    public Output<Map<String,Object>> httpConfig() {
        return this.httpConfig == null ? Codegen.empty() : this.httpConfig;
    }

    /**
     * The default logging verbosity for activity from devices in this
     * registry. Specifies which events should be written to logs. For
     * example, if the LogLevel is ERROR, only events that terminate in
     * errors will be logged. LogLevel is inclusive; enabling INFO logging
     * will also enable ERROR logging.
     * Default value is `NONE`.
     * Possible values are `NONE`, `ERROR`, `INFO`, and `DEBUG`.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<String> logLevel;

    public Output<String> logLevel() {
        return this.logLevel == null ? Codegen.empty() : this.logLevel;
    }

    /**
     * Activate or deactivate MQTT.
     * The structure is documented below.
     * 
     */
    @Import(name="mqttConfig")
      private final @Nullable Output<Map<String,Object>> mqttConfig;

    public Output<Map<String,Object>> mqttConfig() {
        return this.mqttConfig == null ? Codegen.empty() : this.mqttConfig;
    }

    /**
     * A unique name for the resource, required by device registry.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region in which the created registry should reside.
     * If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * A PubSub topic to publish device state updates.
     * The structure is documented below.
     * 
     */
    @Import(name="stateNotificationConfig")
      private final @Nullable Output<Map<String,Object>> stateNotificationConfig;

    public Output<Map<String,Object>> stateNotificationConfig() {
        return this.stateNotificationConfig == null ? Codegen.empty() : this.stateNotificationConfig;
    }

    public RegistryArgs(
        @Nullable Output<List<RegistryCredentialArgs>> credentials,
        @Nullable Output<List<RegistryEventNotificationConfigItemArgs>> eventNotificationConfigs,
        @Nullable Output<Map<String,Object>> httpConfig,
        @Nullable Output<String> logLevel,
        @Nullable Output<Map<String,Object>> mqttConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<Map<String,Object>> stateNotificationConfig) {
        this.credentials = credentials;
        this.eventNotificationConfigs = eventNotificationConfigs;
        this.httpConfig = httpConfig;
        this.logLevel = logLevel;
        this.mqttConfig = mqttConfig;
        this.name = name;
        this.project = project;
        this.region = region;
        this.stateNotificationConfig = stateNotificationConfig;
    }

    private RegistryArgs() {
        this.credentials = Codegen.empty();
        this.eventNotificationConfigs = Codegen.empty();
        this.httpConfig = Codegen.empty();
        this.logLevel = Codegen.empty();
        this.mqttConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.stateNotificationConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RegistryCredentialArgs>> credentials;
        private @Nullable Output<List<RegistryEventNotificationConfigItemArgs>> eventNotificationConfigs;
        private @Nullable Output<Map<String,Object>> httpConfig;
        private @Nullable Output<String> logLevel;
        private @Nullable Output<Map<String,Object>> mqttConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<Map<String,Object>> stateNotificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.eventNotificationConfigs = defaults.eventNotificationConfigs;
    	      this.httpConfig = defaults.httpConfig;
    	      this.logLevel = defaults.logLevel;
    	      this.mqttConfig = defaults.mqttConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.stateNotificationConfig = defaults.stateNotificationConfig;
        }

        public Builder credentials(@Nullable Output<List<RegistryCredentialArgs>> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable List<RegistryCredentialArgs> credentials) {
            this.credentials = Codegen.ofNullable(credentials);
            return this;
        }
        public Builder credentials(RegistryCredentialArgs... credentials) {
            return credentials(List.of(credentials));
        }
        public Builder eventNotificationConfigs(@Nullable Output<List<RegistryEventNotificationConfigItemArgs>> eventNotificationConfigs) {
            this.eventNotificationConfigs = eventNotificationConfigs;
            return this;
        }
        public Builder eventNotificationConfigs(@Nullable List<RegistryEventNotificationConfigItemArgs> eventNotificationConfigs) {
            this.eventNotificationConfigs = Codegen.ofNullable(eventNotificationConfigs);
            return this;
        }
        public Builder eventNotificationConfigs(RegistryEventNotificationConfigItemArgs... eventNotificationConfigs) {
            return eventNotificationConfigs(List.of(eventNotificationConfigs));
        }
        public Builder httpConfig(@Nullable Output<Map<String,Object>> httpConfig) {
            this.httpConfig = httpConfig;
            return this;
        }
        public Builder httpConfig(@Nullable Map<String,Object> httpConfig) {
            this.httpConfig = Codegen.ofNullable(httpConfig);
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
        public Builder mqttConfig(@Nullable Output<Map<String,Object>> mqttConfig) {
            this.mqttConfig = mqttConfig;
            return this;
        }
        public Builder mqttConfig(@Nullable Map<String,Object> mqttConfig) {
            this.mqttConfig = Codegen.ofNullable(mqttConfig);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder stateNotificationConfig(@Nullable Output<Map<String,Object>> stateNotificationConfig) {
            this.stateNotificationConfig = stateNotificationConfig;
            return this;
        }
        public Builder stateNotificationConfig(@Nullable Map<String,Object> stateNotificationConfig) {
            this.stateNotificationConfig = Codegen.ofNullable(stateNotificationConfig);
            return this;
        }        public RegistryArgs build() {
            return new RegistryArgs(credentials, eventNotificationConfigs, httpConfig, logLevel, mqttConfig, name, project, region, stateNotificationConfig);
        }
    }
}
