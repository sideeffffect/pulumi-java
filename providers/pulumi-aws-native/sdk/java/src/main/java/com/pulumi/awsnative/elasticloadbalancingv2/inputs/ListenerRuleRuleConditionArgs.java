// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticloadbalancingv2.inputs;

import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHostHeaderConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHttpHeaderConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleHttpRequestMethodConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRulePathPatternConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleQueryStringConfigArgs;
import com.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleSourceIpConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleRuleConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleRuleConditionArgs Empty = new ListenerRuleRuleConditionArgs();

    @Import(name="field")
    private @Nullable Output<String> field;

    public Optional<Output<String>> field() {
        return Optional.ofNullable(this.field);
    }

    @Import(name="hostHeaderConfig")
    private @Nullable Output<ListenerRuleHostHeaderConfigArgs> hostHeaderConfig;

    public Optional<Output<ListenerRuleHostHeaderConfigArgs>> hostHeaderConfig() {
        return Optional.ofNullable(this.hostHeaderConfig);
    }

    @Import(name="httpHeaderConfig")
    private @Nullable Output<ListenerRuleHttpHeaderConfigArgs> httpHeaderConfig;

    public Optional<Output<ListenerRuleHttpHeaderConfigArgs>> httpHeaderConfig() {
        return Optional.ofNullable(this.httpHeaderConfig);
    }

    @Import(name="httpRequestMethodConfig")
    private @Nullable Output<ListenerRuleHttpRequestMethodConfigArgs> httpRequestMethodConfig;

    public Optional<Output<ListenerRuleHttpRequestMethodConfigArgs>> httpRequestMethodConfig() {
        return Optional.ofNullable(this.httpRequestMethodConfig);
    }

    @Import(name="pathPatternConfig")
    private @Nullable Output<ListenerRulePathPatternConfigArgs> pathPatternConfig;

    public Optional<Output<ListenerRulePathPatternConfigArgs>> pathPatternConfig() {
        return Optional.ofNullable(this.pathPatternConfig);
    }

    @Import(name="queryStringConfig")
    private @Nullable Output<ListenerRuleQueryStringConfigArgs> queryStringConfig;

    public Optional<Output<ListenerRuleQueryStringConfigArgs>> queryStringConfig() {
        return Optional.ofNullable(this.queryStringConfig);
    }

    @Import(name="sourceIpConfig")
    private @Nullable Output<ListenerRuleSourceIpConfigArgs> sourceIpConfig;

    public Optional<Output<ListenerRuleSourceIpConfigArgs>> sourceIpConfig() {
        return Optional.ofNullable(this.sourceIpConfig);
    }

    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ListenerRuleRuleConditionArgs() {}

    private ListenerRuleRuleConditionArgs(ListenerRuleRuleConditionArgs $) {
        this.field = $.field;
        this.hostHeaderConfig = $.hostHeaderConfig;
        this.httpHeaderConfig = $.httpHeaderConfig;
        this.httpRequestMethodConfig = $.httpRequestMethodConfig;
        this.pathPatternConfig = $.pathPatternConfig;
        this.queryStringConfig = $.queryStringConfig;
        this.sourceIpConfig = $.sourceIpConfig;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleRuleConditionArgs $;

        public Builder() {
            $ = new ListenerRuleRuleConditionArgs();
        }

        public Builder(ListenerRuleRuleConditionArgs defaults) {
            $ = new ListenerRuleRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder field(@Nullable Output<String> field) {
            $.field = field;
            return this;
        }

        public Builder field(String field) {
            return field(Output.of(field));
        }

        public Builder hostHeaderConfig(@Nullable Output<ListenerRuleHostHeaderConfigArgs> hostHeaderConfig) {
            $.hostHeaderConfig = hostHeaderConfig;
            return this;
        }

        public Builder hostHeaderConfig(ListenerRuleHostHeaderConfigArgs hostHeaderConfig) {
            return hostHeaderConfig(Output.of(hostHeaderConfig));
        }

        public Builder httpHeaderConfig(@Nullable Output<ListenerRuleHttpHeaderConfigArgs> httpHeaderConfig) {
            $.httpHeaderConfig = httpHeaderConfig;
            return this;
        }

        public Builder httpHeaderConfig(ListenerRuleHttpHeaderConfigArgs httpHeaderConfig) {
            return httpHeaderConfig(Output.of(httpHeaderConfig));
        }

        public Builder httpRequestMethodConfig(@Nullable Output<ListenerRuleHttpRequestMethodConfigArgs> httpRequestMethodConfig) {
            $.httpRequestMethodConfig = httpRequestMethodConfig;
            return this;
        }

        public Builder httpRequestMethodConfig(ListenerRuleHttpRequestMethodConfigArgs httpRequestMethodConfig) {
            return httpRequestMethodConfig(Output.of(httpRequestMethodConfig));
        }

        public Builder pathPatternConfig(@Nullable Output<ListenerRulePathPatternConfigArgs> pathPatternConfig) {
            $.pathPatternConfig = pathPatternConfig;
            return this;
        }

        public Builder pathPatternConfig(ListenerRulePathPatternConfigArgs pathPatternConfig) {
            return pathPatternConfig(Output.of(pathPatternConfig));
        }

        public Builder queryStringConfig(@Nullable Output<ListenerRuleQueryStringConfigArgs> queryStringConfig) {
            $.queryStringConfig = queryStringConfig;
            return this;
        }

        public Builder queryStringConfig(ListenerRuleQueryStringConfigArgs queryStringConfig) {
            return queryStringConfig(Output.of(queryStringConfig));
        }

        public Builder sourceIpConfig(@Nullable Output<ListenerRuleSourceIpConfigArgs> sourceIpConfig) {
            $.sourceIpConfig = sourceIpConfig;
            return this;
        }

        public Builder sourceIpConfig(ListenerRuleSourceIpConfigArgs sourceIpConfig) {
            return sourceIpConfig(Output.of(sourceIpConfig));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ListenerRuleRuleConditionArgs build() {
            return $;
        }
    }

}
