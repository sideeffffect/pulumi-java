// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudiot_v1.enums.MqttConfigMqttEnabledState;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration of MQTT for a device registry.
 * 
 */
public final class MqttConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final MqttConfigArgs Empty = new MqttConfigArgs();

    /**
     * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail.
     * 
     */
    @InputImport(name="mqttEnabledState")
      private final @Nullable Input<MqttConfigMqttEnabledState> mqttEnabledState;

    public Input<MqttConfigMqttEnabledState> getMqttEnabledState() {
        return this.mqttEnabledState == null ? Input.empty() : this.mqttEnabledState;
    }

    public MqttConfigArgs(@Nullable Input<MqttConfigMqttEnabledState> mqttEnabledState) {
        this.mqttEnabledState = mqttEnabledState;
    }

    private MqttConfigArgs() {
        this.mqttEnabledState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MqttConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MqttConfigMqttEnabledState> mqttEnabledState;

        public Builder() {
    	      // Empty
        }

        public Builder(MqttConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mqttEnabledState = defaults.mqttEnabledState;
        }

        public Builder mqttEnabledState(@Nullable Input<MqttConfigMqttEnabledState> mqttEnabledState) {
            this.mqttEnabledState = mqttEnabledState;
            return this;
        }

        public Builder mqttEnabledState(@Nullable MqttConfigMqttEnabledState mqttEnabledState) {
            this.mqttEnabledState = Input.ofNullable(mqttEnabledState);
            return this;
        }
        public MqttConfigArgs build() {
            return new MqttConfigArgs(mqttEnabledState);
        }
    }
}
