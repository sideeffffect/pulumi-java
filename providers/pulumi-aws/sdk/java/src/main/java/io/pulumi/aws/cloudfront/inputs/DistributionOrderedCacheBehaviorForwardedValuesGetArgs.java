// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionOrderedCacheBehaviorForwardedValuesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionOrderedCacheBehaviorForwardedValuesGetArgs Empty = new DistributionOrderedCacheBehaviorForwardedValuesGetArgs();

    /**
     * The forwarded values cookies
     * that specifies how CloudFront handles cookies (maximum one).
     * 
     */
    @Import(name="cookies", required=true)
      private final Output<DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs> cookies;

    public Output<DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs> cookies() {
        return this.cookies;
    }

    /**
     * Specifies the Headers, if any, that you want
     * CloudFront to vary upon for this cache behavior. Specify `*` to include all
     * headers.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<List<String>> headers;

    public Output<List<String>> headers() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * Indicates whether you want CloudFront to forward
     * query strings to the origin that is associated with this cache behavior.
     * 
     */
    @Import(name="queryString", required=true)
      private final Output<Boolean> queryString;

    public Output<Boolean> queryString() {
        return this.queryString;
    }

    /**
     * When specified, along with a value of
     * `true` for `query_string`, all query strings are forwarded, however only the
     * query string keys listed in this argument are cached. When omitted with a
     * value of `true` for `query_string`, all query string keys are cached.
     * 
     */
    @Import(name="queryStringCacheKeys")
      private final @Nullable Output<List<String>> queryStringCacheKeys;

    public Output<List<String>> queryStringCacheKeys() {
        return this.queryStringCacheKeys == null ? Codegen.empty() : this.queryStringCacheKeys;
    }

    public DistributionOrderedCacheBehaviorForwardedValuesGetArgs(
        Output<DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs> cookies,
        @Nullable Output<List<String>> headers,
        Output<Boolean> queryString,
        @Nullable Output<List<String>> queryStringCacheKeys) {
        this.cookies = Objects.requireNonNull(cookies, "expected parameter 'cookies' to be non-null");
        this.headers = headers;
        this.queryString = Objects.requireNonNull(queryString, "expected parameter 'queryString' to be non-null");
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    private DistributionOrderedCacheBehaviorForwardedValuesGetArgs() {
        this.cookies = Codegen.empty();
        this.headers = Codegen.empty();
        this.queryString = Codegen.empty();
        this.queryStringCacheKeys = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOrderedCacheBehaviorForwardedValuesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs> cookies;
        private @Nullable Output<List<String>> headers;
        private Output<Boolean> queryString;
        private @Nullable Output<List<String>> queryStringCacheKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOrderedCacheBehaviorForwardedValuesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookies = defaults.cookies;
    	      this.headers = defaults.headers;
    	      this.queryString = defaults.queryString;
    	      this.queryStringCacheKeys = defaults.queryStringCacheKeys;
        }

        public Builder cookies(Output<DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs> cookies) {
            this.cookies = Objects.requireNonNull(cookies);
            return this;
        }
        public Builder cookies(DistributionOrderedCacheBehaviorForwardedValuesCookiesGetArgs cookies) {
            this.cookies = Output.of(Objects.requireNonNull(cookies));
            return this;
        }
        public Builder headers(@Nullable Output<List<String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable List<String> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }
        public Builder queryString(Output<Boolean> queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }
        public Builder queryString(Boolean queryString) {
            this.queryString = Output.of(Objects.requireNonNull(queryString));
            return this;
        }
        public Builder queryStringCacheKeys(@Nullable Output<List<String>> queryStringCacheKeys) {
            this.queryStringCacheKeys = queryStringCacheKeys;
            return this;
        }
        public Builder queryStringCacheKeys(@Nullable List<String> queryStringCacheKeys) {
            this.queryStringCacheKeys = Codegen.ofNullable(queryStringCacheKeys);
            return this;
        }
        public Builder queryStringCacheKeys(String... queryStringCacheKeys) {
            return queryStringCacheKeys(List.of(queryStringCacheKeys));
        }        public DistributionOrderedCacheBehaviorForwardedValuesGetArgs build() {
            return new DistributionOrderedCacheBehaviorForwardedValuesGetArgs(cookies, headers, queryString, queryStringCacheKeys);
        }
    }
}
