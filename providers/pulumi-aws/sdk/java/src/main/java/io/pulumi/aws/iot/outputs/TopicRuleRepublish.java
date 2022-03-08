// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopicRuleRepublish {
    /**
     * The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0.
     * 
     */
    private final @Nullable Integer qos;
    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    private final String roleArn;
    /**
     * The name of the MQTT topic the message should be republished to.
     * 
     */
    private final String topic;

    @OutputCustomType.Constructor({"qos","roleArn","topic"})
    private TopicRuleRepublish(
        @Nullable Integer qos,
        String roleArn,
        String topic) {
        this.qos = qos;
        this.roleArn = roleArn;
        this.topic = topic;
    }

    /**
     * The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0.
     * 
    */
    public Optional<Integer> getQos() {
        return Optional.ofNullable(this.qos);
    }
    /**
     * The ARN of the IAM role that grants access.
     * 
    */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * The name of the MQTT topic the message should be republished to.
     * 
    */
    public String getTopic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleRepublish defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer qos;
        private String roleArn;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleRepublish defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.qos = defaults.qos;
    	      this.roleArn = defaults.roleArn;
    	      this.topic = defaults.topic;
        }

        public Builder setQos(@Nullable Integer qos) {
            this.qos = qos;
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }
        public TopicRuleRepublish build() {
            return new TopicRuleRepublish(qos, roleArn, topic);
        }
    }
}
