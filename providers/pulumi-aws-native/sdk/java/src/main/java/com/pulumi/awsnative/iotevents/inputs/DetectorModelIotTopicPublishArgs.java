// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotevents.inputs;

import com.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information required to publish the MQTT message through the AWS IoT message broker.
 * 
 */
public final class DetectorModelIotTopicPublishArgs extends ResourceArgs {

    public static final DetectorModelIotTopicPublishArgs Empty = new DetectorModelIotTopicPublishArgs();

    /**
     * The MQTT topic of the message. You can use a string expression that includes variables (`$variable.&lt;variable-name&gt;`) and input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`) as the topic string.
     * 
     */
    @Import(name="mqttTopic", required=true)
    private Output<String> mqttTopic;

    /**
     * @return The MQTT topic of the message. You can use a string expression that includes variables (`$variable.&lt;variable-name&gt;`) and input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`) as the topic string.
     * 
     */
    public Output<String> mqttTopic() {
        return this.mqttTopic;
    }

    @Import(name="payload")
    private @Nullable Output<DetectorModelPayloadArgs> payload;

    public Optional<Output<DetectorModelPayloadArgs>> payload() {
        return Optional.ofNullable(this.payload);
    }

    private DetectorModelIotTopicPublishArgs() {}

    private DetectorModelIotTopicPublishArgs(DetectorModelIotTopicPublishArgs $) {
        this.mqttTopic = $.mqttTopic;
        this.payload = $.payload;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DetectorModelIotTopicPublishArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DetectorModelIotTopicPublishArgs $;

        public Builder() {
            $ = new DetectorModelIotTopicPublishArgs();
        }

        public Builder(DetectorModelIotTopicPublishArgs defaults) {
            $ = new DetectorModelIotTopicPublishArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param mqttTopic The MQTT topic of the message. You can use a string expression that includes variables (`$variable.&lt;variable-name&gt;`) and input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`) as the topic string.
         * 
         * @return builder
         * 
         */
        public Builder mqttTopic(Output<String> mqttTopic) {
            $.mqttTopic = mqttTopic;
            return this;
        }

        /**
         * @param mqttTopic The MQTT topic of the message. You can use a string expression that includes variables (`$variable.&lt;variable-name&gt;`) and input values (`$input.&lt;input-name&gt;.&lt;path-to-datum&gt;`) as the topic string.
         * 
         * @return builder
         * 
         */
        public Builder mqttTopic(String mqttTopic) {
            return mqttTopic(Output.of(mqttTopic));
        }

        public Builder payload(@Nullable Output<DetectorModelPayloadArgs> payload) {
            $.payload = payload;
            return this;
        }

        public Builder payload(DetectorModelPayloadArgs payload) {
            return payload(Output.of(payload));
        }

        public DetectorModelIotTopicPublishArgs build() {
            $.mqttTopic = Objects.requireNonNull($.mqttTopic, "expected parameter 'mqttTopic' to be non-null");
            return $;
        }
    }

}
