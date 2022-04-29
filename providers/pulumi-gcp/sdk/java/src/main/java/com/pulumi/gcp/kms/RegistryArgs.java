// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.kms.inputs.RegistryCredentialArgs;
import com.pulumi.gcp.kms.inputs.RegistryEventNotificationConfigItemArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryArgs extends ResourceArgs {

    public static final RegistryArgs Empty = new RegistryArgs();

    /**
     * List of public key certificates to authenticate devices.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<List<RegistryCredentialArgs>> credentials;

    /**
     * @return List of public key certificates to authenticate devices.
     * 
     */
    public Optional<Output<List<RegistryCredentialArgs>>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * List of configurations for event notifications, such as PubSub topics to publish device events to.
     * 
     */
    @Import(name="eventNotificationConfigs")
    private @Nullable Output<List<RegistryEventNotificationConfigItemArgs>> eventNotificationConfigs;

    /**
     * @return List of configurations for event notifications, such as PubSub topics to publish device events to.
     * 
     */
    public Optional<Output<List<RegistryEventNotificationConfigItemArgs>>> eventNotificationConfigs() {
        return Optional.ofNullable(this.eventNotificationConfigs);
    }

    /**
     * Activate or deactivate HTTP.
     * 
     */
    @Import(name="httpConfig")
    private @Nullable Output<Map<String,Object>> httpConfig;

    /**
     * @return Activate or deactivate HTTP.
     * 
     */
    public Optional<Output<Map<String,Object>>> httpConfig() {
        return Optional.ofNullable(this.httpConfig);
    }

    /**
     * The default logging verbosity for activity from devices in this registry. Specifies which events should be written to
     * logs. For example, if the LogLevel is ERROR, only events that terminate in errors will be logged. LogLevel is inclusive;
     * enabling INFO logging will also enable ERROR logging. Default value: &#34;NONE&#34; Possible values: [&#34;NONE&#34;, &#34;ERROR&#34;, &#34;INFO&#34;,
     * &#34;DEBUG&#34;]
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<String> logLevel;

    /**
     * @return The default logging verbosity for activity from devices in this registry. Specifies which events should be written to
     * logs. For example, if the LogLevel is ERROR, only events that terminate in errors will be logged. LogLevel is inclusive;
     * enabling INFO logging will also enable ERROR logging. Default value: &#34;NONE&#34; Possible values: [&#34;NONE&#34;, &#34;ERROR&#34;, &#34;INFO&#34;,
     * &#34;DEBUG&#34;]
     * 
     */
    public Optional<Output<String>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    /**
     * Activate or deactivate MQTT.
     * 
     */
    @Import(name="mqttConfig")
    private @Nullable Output<Map<String,Object>> mqttConfig;

    /**
     * @return Activate or deactivate MQTT.
     * 
     */
    public Optional<Output<Map<String,Object>>> mqttConfig() {
        return Optional.ofNullable(this.mqttConfig);
    }

    /**
     * A unique name for the resource, required by device registry.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A unique name for the resource, required by device registry.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region in which the created registry should reside. If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the created registry should reside. If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * A PubSub topic to publish device state updates.
     * 
     */
    @Import(name="stateNotificationConfig")
    private @Nullable Output<Map<String,Object>> stateNotificationConfig;

    /**
     * @return A PubSub topic to publish device state updates.
     * 
     */
    public Optional<Output<Map<String,Object>>> stateNotificationConfig() {
        return Optional.ofNullable(this.stateNotificationConfig);
    }

    private RegistryArgs() {}

    private RegistryArgs(RegistryArgs $) {
        this.credentials = $.credentials;
        this.eventNotificationConfigs = $.eventNotificationConfigs;
        this.httpConfig = $.httpConfig;
        this.logLevel = $.logLevel;
        this.mqttConfig = $.mqttConfig;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.stateNotificationConfig = $.stateNotificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryArgs $;

        public Builder() {
            $ = new RegistryArgs();
        }

        public Builder(RegistryArgs defaults) {
            $ = new RegistryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param credentials List of public key certificates to authenticate devices.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<List<RegistryCredentialArgs>> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials List of public key certificates to authenticate devices.
         * 
         * @return builder
         * 
         */
        public Builder credentials(List<RegistryCredentialArgs> credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param credentials List of public key certificates to authenticate devices.
         * 
         * @return builder
         * 
         */
        public Builder credentials(RegistryCredentialArgs... credentials) {
            return credentials(List.of(credentials));
        }

        /**
         * @param eventNotificationConfigs List of configurations for event notifications, such as PubSub topics to publish device events to.
         * 
         * @return builder
         * 
         */
        public Builder eventNotificationConfigs(@Nullable Output<List<RegistryEventNotificationConfigItemArgs>> eventNotificationConfigs) {
            $.eventNotificationConfigs = eventNotificationConfigs;
            return this;
        }

        /**
         * @param eventNotificationConfigs List of configurations for event notifications, such as PubSub topics to publish device events to.
         * 
         * @return builder
         * 
         */
        public Builder eventNotificationConfigs(List<RegistryEventNotificationConfigItemArgs> eventNotificationConfigs) {
            return eventNotificationConfigs(Output.of(eventNotificationConfigs));
        }

        /**
         * @param eventNotificationConfigs List of configurations for event notifications, such as PubSub topics to publish device events to.
         * 
         * @return builder
         * 
         */
        public Builder eventNotificationConfigs(RegistryEventNotificationConfigItemArgs... eventNotificationConfigs) {
            return eventNotificationConfigs(List.of(eventNotificationConfigs));
        }

        /**
         * @param httpConfig Activate or deactivate HTTP.
         * 
         * @return builder
         * 
         */
        public Builder httpConfig(@Nullable Output<Map<String,Object>> httpConfig) {
            $.httpConfig = httpConfig;
            return this;
        }

        /**
         * @param httpConfig Activate or deactivate HTTP.
         * 
         * @return builder
         * 
         */
        public Builder httpConfig(Map<String,Object> httpConfig) {
            return httpConfig(Output.of(httpConfig));
        }

        /**
         * @param logLevel The default logging verbosity for activity from devices in this registry. Specifies which events should be written to
         * logs. For example, if the LogLevel is ERROR, only events that terminate in errors will be logged. LogLevel is inclusive;
         * enabling INFO logging will also enable ERROR logging. Default value: &#34;NONE&#34; Possible values: [&#34;NONE&#34;, &#34;ERROR&#34;, &#34;INFO&#34;,
         * &#34;DEBUG&#34;]
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<String> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel The default logging verbosity for activity from devices in this registry. Specifies which events should be written to
         * logs. For example, if the LogLevel is ERROR, only events that terminate in errors will be logged. LogLevel is inclusive;
         * enabling INFO logging will also enable ERROR logging. Default value: &#34;NONE&#34; Possible values: [&#34;NONE&#34;, &#34;ERROR&#34;, &#34;INFO&#34;,
         * &#34;DEBUG&#34;]
         * 
         * @return builder
         * 
         */
        public Builder logLevel(String logLevel) {
            return logLevel(Output.of(logLevel));
        }

        /**
         * @param mqttConfig Activate or deactivate MQTT.
         * 
         * @return builder
         * 
         */
        public Builder mqttConfig(@Nullable Output<Map<String,Object>> mqttConfig) {
            $.mqttConfig = mqttConfig;
            return this;
        }

        /**
         * @param mqttConfig Activate or deactivate MQTT.
         * 
         * @return builder
         * 
         */
        public Builder mqttConfig(Map<String,Object> mqttConfig) {
            return mqttConfig(Output.of(mqttConfig));
        }

        /**
         * @param name A unique name for the resource, required by device registry.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A unique name for the resource, required by device registry.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region in which the created registry should reside. If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the created registry should reside. If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param stateNotificationConfig A PubSub topic to publish device state updates.
         * 
         * @return builder
         * 
         */
        public Builder stateNotificationConfig(@Nullable Output<Map<String,Object>> stateNotificationConfig) {
            $.stateNotificationConfig = stateNotificationConfig;
            return this;
        }

        /**
         * @param stateNotificationConfig A PubSub topic to publish device state updates.
         * 
         * @return builder
         * 
         */
        public Builder stateNotificationConfig(Map<String,Object> stateNotificationConfig) {
            return stateNotificationConfig(Output.of(stateNotificationConfig));
        }

        public RegistryArgs build() {
            return $;
        }
    }

}
