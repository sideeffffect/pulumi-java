// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.CachePolicyCookiesConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.CachePolicyHeadersConfigArgs;
import com.pulumi.awsnative.cloudfront.inputs.CachePolicyQueryStringsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginArgs extends ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginArgs();

    @Import(name="cookiesConfig", required=true)
    private Output<CachePolicyCookiesConfigArgs> cookiesConfig;

    public Output<CachePolicyCookiesConfigArgs> cookiesConfig() {
        return this.cookiesConfig;
    }

    @Import(name="enableAcceptEncodingBrotli")
    private @Nullable Output<Boolean> enableAcceptEncodingBrotli;

    public Optional<Output<Boolean>> enableAcceptEncodingBrotli() {
        return Optional.ofNullable(this.enableAcceptEncodingBrotli);
    }

    @Import(name="enableAcceptEncodingGzip", required=true)
    private Output<Boolean> enableAcceptEncodingGzip;

    public Output<Boolean> enableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip;
    }

    @Import(name="headersConfig", required=true)
    private Output<CachePolicyHeadersConfigArgs> headersConfig;

    public Output<CachePolicyHeadersConfigArgs> headersConfig() {
        return this.headersConfig;
    }

    @Import(name="queryStringsConfig", required=true)
    private Output<CachePolicyQueryStringsConfigArgs> queryStringsConfig;

    public Output<CachePolicyQueryStringsConfigArgs> queryStringsConfig() {
        return this.queryStringsConfig;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginArgs() {}

    private CachePolicyParametersInCacheKeyAndForwardedToOriginArgs(CachePolicyParametersInCacheKeyAndForwardedToOriginArgs $) {
        this.cookiesConfig = $.cookiesConfig;
        this.enableAcceptEncodingBrotli = $.enableAcceptEncodingBrotli;
        this.enableAcceptEncodingGzip = $.enableAcceptEncodingGzip;
        this.headersConfig = $.headersConfig;
        this.queryStringsConfig = $.queryStringsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyParametersInCacheKeyAndForwardedToOriginArgs $;

        public Builder() {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginArgs();
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginArgs defaults) {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginArgs(Objects.requireNonNull(defaults));
        }

        public Builder cookiesConfig(Output<CachePolicyCookiesConfigArgs> cookiesConfig) {
            $.cookiesConfig = cookiesConfig;
            return this;
        }

        public Builder cookiesConfig(CachePolicyCookiesConfigArgs cookiesConfig) {
            return cookiesConfig(Output.of(cookiesConfig));
        }

        public Builder enableAcceptEncodingBrotli(@Nullable Output<Boolean> enableAcceptEncodingBrotli) {
            $.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
            return this;
        }

        public Builder enableAcceptEncodingBrotli(Boolean enableAcceptEncodingBrotli) {
            return enableAcceptEncodingBrotli(Output.of(enableAcceptEncodingBrotli));
        }

        public Builder enableAcceptEncodingGzip(Output<Boolean> enableAcceptEncodingGzip) {
            $.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
            return this;
        }

        public Builder enableAcceptEncodingGzip(Boolean enableAcceptEncodingGzip) {
            return enableAcceptEncodingGzip(Output.of(enableAcceptEncodingGzip));
        }

        public Builder headersConfig(Output<CachePolicyHeadersConfigArgs> headersConfig) {
            $.headersConfig = headersConfig;
            return this;
        }

        public Builder headersConfig(CachePolicyHeadersConfigArgs headersConfig) {
            return headersConfig(Output.of(headersConfig));
        }

        public Builder queryStringsConfig(Output<CachePolicyQueryStringsConfigArgs> queryStringsConfig) {
            $.queryStringsConfig = queryStringsConfig;
            return this;
        }

        public Builder queryStringsConfig(CachePolicyQueryStringsConfigArgs queryStringsConfig) {
            return queryStringsConfig(Output.of(queryStringsConfig));
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOriginArgs build() {
            $.cookiesConfig = Objects.requireNonNull($.cookiesConfig, "expected parameter 'cookiesConfig' to be non-null");
            $.enableAcceptEncodingGzip = Objects.requireNonNull($.enableAcceptEncodingGzip, "expected parameter 'enableAcceptEncodingGzip' to be non-null");
            $.headersConfig = Objects.requireNonNull($.headersConfig, "expected parameter 'headersConfig' to be non-null");
            $.queryStringsConfig = Objects.requireNonNull($.queryStringsConfig, "expected parameter 'queryStringsConfig' to be non-null");
            return $;
        }
    }

}
