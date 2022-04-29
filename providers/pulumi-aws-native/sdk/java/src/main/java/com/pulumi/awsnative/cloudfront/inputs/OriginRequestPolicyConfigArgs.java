// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.OriginRequestPolicyCookiesConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.OriginRequestPolicyHeadersConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.OriginRequestPolicyQueryStringsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OriginRequestPolicyConfigArgs extends ResourceArgs {

    public static final OriginRequestPolicyConfigArgs Empty = new OriginRequestPolicyConfigArgs();

    @Import(name="comment")
    private @Nullable Output<String> comment;

    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="cookiesConfig", required=true)
    private Output<OriginRequestPolicyCookiesConfigArgs> cookiesConfig;

    public Output<OriginRequestPolicyCookiesConfigArgs> cookiesConfig() {
        return this.cookiesConfig;
    }

    @Import(name="headersConfig", required=true)
    private Output<OriginRequestPolicyHeadersConfigArgs> headersConfig;

    public Output<OriginRequestPolicyHeadersConfigArgs> headersConfig() {
        return this.headersConfig;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="queryStringsConfig", required=true)
    private Output<OriginRequestPolicyQueryStringsConfigArgs> queryStringsConfig;

    public Output<OriginRequestPolicyQueryStringsConfigArgs> queryStringsConfig() {
        return this.queryStringsConfig;
    }

    private OriginRequestPolicyConfigArgs() {}

    private OriginRequestPolicyConfigArgs(OriginRequestPolicyConfigArgs $) {
        this.comment = $.comment;
        this.cookiesConfig = $.cookiesConfig;
        this.headersConfig = $.headersConfig;
        this.name = $.name;
        this.queryStringsConfig = $.queryStringsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OriginRequestPolicyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OriginRequestPolicyConfigArgs $;

        public Builder() {
            $ = new OriginRequestPolicyConfigArgs();
        }

        public Builder(OriginRequestPolicyConfigArgs defaults) {
            $ = new OriginRequestPolicyConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder cookiesConfig(Output<OriginRequestPolicyCookiesConfigArgs> cookiesConfig) {
            $.cookiesConfig = cookiesConfig;
            return this;
        }

        public Builder cookiesConfig(OriginRequestPolicyCookiesConfigArgs cookiesConfig) {
            return cookiesConfig(Output.of(cookiesConfig));
        }

        public Builder headersConfig(Output<OriginRequestPolicyHeadersConfigArgs> headersConfig) {
            $.headersConfig = headersConfig;
            return this;
        }

        public Builder headersConfig(OriginRequestPolicyHeadersConfigArgs headersConfig) {
            return headersConfig(Output.of(headersConfig));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder queryStringsConfig(Output<OriginRequestPolicyQueryStringsConfigArgs> queryStringsConfig) {
            $.queryStringsConfig = queryStringsConfig;
            return this;
        }

        public Builder queryStringsConfig(OriginRequestPolicyQueryStringsConfigArgs queryStringsConfig) {
            return queryStringsConfig(Output.of(queryStringsConfig));
        }

        public OriginRequestPolicyConfigArgs build() {
            $.cookiesConfig = Objects.requireNonNull($.cookiesConfig, "expected parameter 'cookiesConfig' to be non-null");
            $.headersConfig = Objects.requireNonNull($.headersConfig, "expected parameter 'headersConfig' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.queryStringsConfig = Objects.requireNonNull($.queryStringsConfig, "expected parameter 'queryStringsConfig' to be non-null");
            return $;
        }
    }

}
