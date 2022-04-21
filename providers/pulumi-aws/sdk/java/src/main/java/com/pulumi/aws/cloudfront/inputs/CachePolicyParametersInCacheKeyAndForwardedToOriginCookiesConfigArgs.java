// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.aws.cloudfront.inputs.CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs();

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and automatically included in requests that CloudFront sends to the origin. Valid values are `none`, `whitelist`, `allExcept`, `all`.
     * 
     */
    @Import(name="cookieBehavior", required=true)
    private Output<String> cookieBehavior;

    public Output<String> cookieBehavior() {
        return this.cookieBehavior;
    }

    /**
     * Object that contains a list of cookie names. See Items for more information.
     * 
     */
    @Import(name="cookies")
    private @Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs> cookies;

    public Optional<Output<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs>> cookies() {
        return Optional.ofNullable(this.cookies);
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs() {}

    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs $) {
        this.cookieBehavior = $.cookieBehavior;
        this.cookies = $.cookies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs $;

        public Builder() {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs();
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs defaults) {
            $ = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder cookieBehavior(Output<String> cookieBehavior) {
            $.cookieBehavior = cookieBehavior;
            return this;
        }

        public Builder cookieBehavior(String cookieBehavior) {
            return cookieBehavior(Output.of(cookieBehavior));
        }

        public Builder cookies(@Nullable Output<CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs> cookies) {
            $.cookies = cookies;
            return this;
        }

        public Builder cookies(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesArgs cookies) {
            return cookies(Output.of(cookies));
        }

        public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigArgs build() {
            $.cookieBehavior = Objects.requireNonNull($.cookieBehavior, "expected parameter 'cookieBehavior' to be non-null");
            return $;
        }
    }

}
