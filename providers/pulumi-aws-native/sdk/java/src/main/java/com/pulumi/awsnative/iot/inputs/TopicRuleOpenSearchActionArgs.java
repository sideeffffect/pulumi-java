// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleOpenSearchActionArgs extends ResourceArgs {

    public static final TopicRuleOpenSearchActionArgs Empty = new TopicRuleOpenSearchActionArgs();

    @Import(name="endpoint", required=true)
    private Output<String> endpoint;

    public Output<String> endpoint() {
        return this.endpoint;
    }

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    @Import(name="index", required=true)
    private Output<String> index;

    public Output<String> index() {
        return this.index;
    }

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private TopicRuleOpenSearchActionArgs() {}

    private TopicRuleOpenSearchActionArgs(TopicRuleOpenSearchActionArgs $) {
        this.endpoint = $.endpoint;
        this.id = $.id;
        this.index = $.index;
        this.roleArn = $.roleArn;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleOpenSearchActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleOpenSearchActionArgs $;

        public Builder() {
            $ = new TopicRuleOpenSearchActionArgs();
        }

        public Builder(TopicRuleOpenSearchActionArgs defaults) {
            $ = new TopicRuleOpenSearchActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpoint(Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder index(Output<String> index) {
            $.index = index;
            return this;
        }

        public Builder index(String index) {
            return index(Output.of(index));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TopicRuleOpenSearchActionArgs build() {
            $.endpoint = Objects.requireNonNull($.endpoint, "expected parameter 'endpoint' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.index = Objects.requireNonNull($.index, "expected parameter 'index' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
