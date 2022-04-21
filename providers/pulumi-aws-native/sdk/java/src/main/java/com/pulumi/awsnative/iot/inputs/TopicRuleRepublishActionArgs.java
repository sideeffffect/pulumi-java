// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleRepublishActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleRepublishActionArgs Empty = new TopicRuleRepublishActionArgs();

    @Import(name="qos")
    private @Nullable Output<Integer> qos;

    public Optional<Output<Integer>> qos() {
        return Optional.ofNullable(this.qos);
    }

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="topic", required=true)
    private Output<String> topic;

    public Output<String> topic() {
        return this.topic;
    }

    private TopicRuleRepublishActionArgs() {}

    private TopicRuleRepublishActionArgs(TopicRuleRepublishActionArgs $) {
        this.qos = $.qos;
        this.roleArn = $.roleArn;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleRepublishActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleRepublishActionArgs $;

        public Builder() {
            $ = new TopicRuleRepublishActionArgs();
        }

        public Builder(TopicRuleRepublishActionArgs defaults) {
            $ = new TopicRuleRepublishActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder qos(@Nullable Output<Integer> qos) {
            $.qos = qos;
            return this;
        }

        public Builder qos(Integer qos) {
            return qos(Output.of(qos));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public TopicRuleRepublishActionArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}
