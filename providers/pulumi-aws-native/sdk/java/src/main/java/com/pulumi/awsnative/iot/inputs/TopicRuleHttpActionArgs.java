// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.inputs.TopicRuleHttpActionHeaderArgs;
import com.pulumi.awsnative.iot.inputs.TopicRuleHttpAuthorizationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleHttpActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleHttpActionArgs Empty = new TopicRuleHttpActionArgs();

    @Import(name="auth")
    private @Nullable Output<TopicRuleHttpAuthorizationArgs> auth;

    public Optional<Output<TopicRuleHttpAuthorizationArgs>> auth() {
        return Optional.ofNullable(this.auth);
    }

    @Import(name="confirmationUrl")
    private @Nullable Output<String> confirmationUrl;

    public Optional<Output<String>> confirmationUrl() {
        return Optional.ofNullable(this.confirmationUrl);
    }

    @Import(name="headers")
    private @Nullable Output<List<TopicRuleHttpActionHeaderArgs>> headers;

    public Optional<Output<List<TopicRuleHttpActionHeaderArgs>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    @Import(name="url", required=true)
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    private TopicRuleHttpActionArgs() {}

    private TopicRuleHttpActionArgs(TopicRuleHttpActionArgs $) {
        this.auth = $.auth;
        this.confirmationUrl = $.confirmationUrl;
        this.headers = $.headers;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleHttpActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleHttpActionArgs $;

        public Builder() {
            $ = new TopicRuleHttpActionArgs();
        }

        public Builder(TopicRuleHttpActionArgs defaults) {
            $ = new TopicRuleHttpActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder auth(@Nullable Output<TopicRuleHttpAuthorizationArgs> auth) {
            $.auth = auth;
            return this;
        }

        public Builder auth(TopicRuleHttpAuthorizationArgs auth) {
            return auth(Output.of(auth));
        }

        public Builder confirmationUrl(@Nullable Output<String> confirmationUrl) {
            $.confirmationUrl = confirmationUrl;
            return this;
        }

        public Builder confirmationUrl(String confirmationUrl) {
            return confirmationUrl(Output.of(confirmationUrl));
        }

        public Builder headers(@Nullable Output<List<TopicRuleHttpActionHeaderArgs>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<TopicRuleHttpActionHeaderArgs> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(TopicRuleHttpActionHeaderArgs... headers) {
            return headers(List.of(headers));
        }

        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public TopicRuleHttpActionArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
