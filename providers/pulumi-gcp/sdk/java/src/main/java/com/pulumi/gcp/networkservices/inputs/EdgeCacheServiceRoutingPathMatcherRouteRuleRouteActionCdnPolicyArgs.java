// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs extends ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs();

    /**
     * Defines the request parameters that contribute to the cache key.
     * Structure is documented below.
     * 
     */
    @Import(name="cacheKeyPolicy")
    private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy;

    /**
     * @return Defines the request parameters that contribute to the cache key.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs>> cacheKeyPolicy() {
        return Optional.ofNullable(this.cacheKeyPolicy);
    }

    /**
     * Cache modes allow users to control the behaviour of the cache, what content it should cache automatically, whether to respect origin headers, or whether to unconditionally cache all responses.
     * For all cache modes, Cache-Control headers will be passed to the client. Use clientTtl to override what is sent to the client.
     * Possible values are `CACHE_ALL_STATIC`, `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `BYPASS_CACHE`.
     * 
     */
    @Import(name="cacheMode")
    private @Nullable Output<String> cacheMode;

    /**
     * @return Cache modes allow users to control the behaviour of the cache, what content it should cache automatically, whether to respect origin headers, or whether to unconditionally cache all responses.
     * For all cache modes, Cache-Control headers will be passed to the client. Use clientTtl to override what is sent to the client.
     * Possible values are `CACHE_ALL_STATIC`, `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `BYPASS_CACHE`.
     * 
     */
    public Optional<Output<String>> cacheMode() {
        return Optional.ofNullable(this.cacheMode);
    }

    /**
     * Specifies a separate client (e.g. browser client) TTL, separate from the TTL used by the edge caches. Leaving this empty will use the same cache TTL for both the CDN and the client-facing response.
     * - The TTL must be &gt; 0 and &lt;= 86400s (1 day)
     * - The clientTtl cannot be larger than the defaultTtl (if set)
     * - Fractions of a second are not allowed.
     * - Omit this field to use the defaultTtl, or the max-age set by the origin, as the client-facing TTL.
     *   When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34; or &#34;BYPASS_CACHE&#34;, you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="clientTtl")
    private @Nullable Output<String> clientTtl;

    /**
     * @return Specifies a separate client (e.g. browser client) TTL, separate from the TTL used by the edge caches. Leaving this empty will use the same cache TTL for both the CDN and the client-facing response.
     * - The TTL must be &gt; 0 and &lt;= 86400s (1 day)
     * - The clientTtl cannot be larger than the defaultTtl (if set)
     * - Fractions of a second are not allowed.
     * - Omit this field to use the defaultTtl, or the max-age set by the origin, as the client-facing TTL.
     *   When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34; or &#34;BYPASS_CACHE&#34;, you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> clientTtl() {
        return Optional.ofNullable(this.clientTtl);
    }

    /**
     * Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age).
     * Defaults to 3600s (1 hour).
     * - The TTL must be &gt;= 0 and &lt;= 2592000s (1 month)
     * - Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34; (equivalent to must-revalidate)
     * - The value of defaultTTL cannot be set to a value greater than that of maxTTL.
     * - Fractions of a second are not allowed.
     * - When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses.
     *   Note that infrequently accessed objects may be evicted from the cache before the defined TTL. Objects that expire will be revalidated with the origin.
     *   When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34; or &#34;BYPASS_CACHE&#34;, you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="defaultTtl")
    private @Nullable Output<String> defaultTtl;

    /**
     * @return Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age).
     * Defaults to 3600s (1 hour).
     * - The TTL must be &gt;= 0 and &lt;= 2592000s (1 month)
     * - Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34; (equivalent to must-revalidate)
     * - The value of defaultTTL cannot be set to a value greater than that of maxTTL.
     * - Fractions of a second are not allowed.
     * - When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses.
     *   Note that infrequently accessed objects may be evicted from the cache before the defined TTL. Objects that expire will be revalidated with the origin.
     *   When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34; or &#34;BYPASS_CACHE&#34;, you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> defaultTtl() {
        return Optional.ofNullable(this.defaultTtl);
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * Defaults to 86400s (1 day).
     * Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTtl seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive.
     * - The TTL must be &gt;= 0 and &lt;= 2592000s (1 month)
     * - Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34;
     * - The value of maxTtl must be equal to or greater than defaultTtl.
     * - Fractions of a second are not allowed.
     * - When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34;, &#34;FORCE_CACHE_ALL&#34;, or &#34;BYPASS_CACHE&#34;, you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="maxTtl")
    private @Nullable Output<String> maxTtl;

    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin.
     * Defaults to 86400s (1 day).
     * Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTtl seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive.
     * - The TTL must be &gt;= 0 and &lt;= 2592000s (1 month)
     * - Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34;
     * - The value of maxTtl must be equal to or greater than defaultTtl.
     * - Fractions of a second are not allowed.
     * - When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34;, &#34;FORCE_CACHE_ALL&#34;, or &#34;BYPASS_CACHE&#34;, you must omit this field.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<Output<String>> maxTtl() {
        return Optional.ofNullable(this.maxTtl);
    }

    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency.
     * By default, the CDNPolicy will apply the following default TTLs to these status codes:
     * - HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
     * - HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s
     * - HTTP 405 (Method Not Found), 414 (URI Too Long), 501 (Not Implemented): 60s
     *   These defaults can be overridden in negativeCachingPolicy
     * 
     */
    @Import(name="negativeCaching")
    private @Nullable Output<Boolean> negativeCaching;

    /**
     * @return Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency.
     * By default, the CDNPolicy will apply the following default TTLs to these status codes:
     * - HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
     * - HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s
     * - HTTP 405 (Method Not Found), 414 (URI Too Long), 501 (Not Implemented): 60s
     *   These defaults can be overridden in negativeCachingPolicy
     * 
     */
    public Optional<Output<Boolean>> negativeCaching() {
        return Optional.ofNullable(this.negativeCaching);
    }

    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * - Omitting the policy and leaving negativeCaching enabled will use the default TTLs for each status code, defined in negativeCaching.
     * - TTLs must be &gt;= 0 (where 0 is &#34;always revalidate&#34;) and &lt;= 86400s (1 day)
     *   Note that when specifying an explicit negativeCachingPolicy, you should take care to specify a cache TTL for all response codes that you wish to cache. The CDNPolicy will not apply any default negative caching when a policy exists.
     * 
     */
    @Import(name="negativeCachingPolicy")
    private @Nullable Output<Map<String,String>> negativeCachingPolicy;

    /**
     * @return Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * - Omitting the policy and leaving negativeCaching enabled will use the default TTLs for each status code, defined in negativeCaching.
     * - TTLs must be &gt;= 0 (where 0 is &#34;always revalidate&#34;) and &lt;= 86400s (1 day)
     *   Note that when specifying an explicit negativeCachingPolicy, you should take care to specify a cache TTL for all response codes that you wish to cache. The CDNPolicy will not apply any default negative caching when a policy exists.
     * 
     */
    public Optional<Output<Map<String,String>>> negativeCachingPolicy() {
        return Optional.ofNullable(this.negativeCachingPolicy);
    }

    /**
     * The EdgeCacheKeyset containing the set of public keys used to validate signed requests at the edge.
     * 
     */
    @Import(name="signedRequestKeyset")
    private @Nullable Output<String> signedRequestKeyset;

    /**
     * @return The EdgeCacheKeyset containing the set of public keys used to validate signed requests at the edge.
     * 
     */
    public Optional<Output<String>> signedRequestKeyset() {
        return Optional.ofNullable(this.signedRequestKeyset);
    }

    /**
     * Whether to enforce signed requests. The default value is DISABLED, which means all content is public, and does not authorize access.
     * You must also set a signedRequestKeyset to enable signed requests.
     * When set to REQUIRE_SIGNATURES, all matching requests will have their signature validated. Requests that were not signed with the corresponding private key, or that are otherwise invalid (expired, do not match the signature, IP address, or header) will be rejected with a HTTP 403 and (if enabled) logged.
     * Possible values are `DISABLED` and `REQUIRE_SIGNATURES`.
     * 
     */
    @Import(name="signedRequestMode")
    private @Nullable Output<String> signedRequestMode;

    /**
     * @return Whether to enforce signed requests. The default value is DISABLED, which means all content is public, and does not authorize access.
     * You must also set a signedRequestKeyset to enable signed requests.
     * When set to REQUIRE_SIGNATURES, all matching requests will have their signature validated. Requests that were not signed with the corresponding private key, or that are otherwise invalid (expired, do not match the signature, IP address, or header) will be rejected with a HTTP 403 and (if enabled) logged.
     * Possible values are `DISABLED` and `REQUIRE_SIGNATURES`.
     * 
     */
    public Optional<Output<String>> signedRequestMode() {
        return Optional.ofNullable(this.signedRequestMode);
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs() {}

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs $) {
        this.cacheKeyPolicy = $.cacheKeyPolicy;
        this.cacheMode = $.cacheMode;
        this.clientTtl = $.clientTtl;
        this.defaultTtl = $.defaultTtl;
        this.maxTtl = $.maxTtl;
        this.negativeCaching = $.negativeCaching;
        this.negativeCachingPolicy = $.negativeCachingPolicy;
        this.signedRequestKeyset = $.signedRequestKeyset;
        this.signedRequestMode = $.signedRequestMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs $;

        public Builder() {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs();
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs defaults) {
            $ = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cacheKeyPolicy Defines the request parameters that contribute to the cache key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cacheKeyPolicy(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy) {
            $.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }

        /**
         * @param cacheKeyPolicy Defines the request parameters that contribute to the cache key.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cacheKeyPolicy(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyCacheKeyPolicyArgs cacheKeyPolicy) {
            return cacheKeyPolicy(Output.of(cacheKeyPolicy));
        }

        /**
         * @param cacheMode Cache modes allow users to control the behaviour of the cache, what content it should cache automatically, whether to respect origin headers, or whether to unconditionally cache all responses.
         * For all cache modes, Cache-Control headers will be passed to the client. Use clientTtl to override what is sent to the client.
         * Possible values are `CACHE_ALL_STATIC`, `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `BYPASS_CACHE`.
         * 
         * @return builder
         * 
         */
        public Builder cacheMode(@Nullable Output<String> cacheMode) {
            $.cacheMode = cacheMode;
            return this;
        }

        /**
         * @param cacheMode Cache modes allow users to control the behaviour of the cache, what content it should cache automatically, whether to respect origin headers, or whether to unconditionally cache all responses.
         * For all cache modes, Cache-Control headers will be passed to the client. Use clientTtl to override what is sent to the client.
         * Possible values are `CACHE_ALL_STATIC`, `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `BYPASS_CACHE`.
         * 
         * @return builder
         * 
         */
        public Builder cacheMode(String cacheMode) {
            return cacheMode(Output.of(cacheMode));
        }

        /**
         * @param clientTtl Specifies a separate client (e.g. browser client) TTL, separate from the TTL used by the edge caches. Leaving this empty will use the same cache TTL for both the CDN and the client-facing response.
         * - The TTL must be &gt; 0 and &lt;= 86400s (1 day)
         * - The clientTtl cannot be larger than the defaultTtl (if set)
         * - Fractions of a second are not allowed.
         * - Omit this field to use the defaultTtl, or the max-age set by the origin, as the client-facing TTL.
         *   When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34; or &#34;BYPASS_CACHE&#34;, you must omit this field.
         *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder clientTtl(@Nullable Output<String> clientTtl) {
            $.clientTtl = clientTtl;
            return this;
        }

        /**
         * @param clientTtl Specifies a separate client (e.g. browser client) TTL, separate from the TTL used by the edge caches. Leaving this empty will use the same cache TTL for both the CDN and the client-facing response.
         * - The TTL must be &gt; 0 and &lt;= 86400s (1 day)
         * - The clientTtl cannot be larger than the defaultTtl (if set)
         * - Fractions of a second are not allowed.
         * - Omit this field to use the defaultTtl, or the max-age set by the origin, as the client-facing TTL.
         *   When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34; or &#34;BYPASS_CACHE&#34;, you must omit this field.
         *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder clientTtl(String clientTtl) {
            return clientTtl(Output.of(clientTtl));
        }

        /**
         * @param defaultTtl Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age).
         * Defaults to 3600s (1 hour).
         * - The TTL must be &gt;= 0 and &lt;= 2592000s (1 month)
         * - Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34; (equivalent to must-revalidate)
         * - The value of defaultTTL cannot be set to a value greater than that of maxTTL.
         * - Fractions of a second are not allowed.
         * - When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses.
         *   Note that infrequently accessed objects may be evicted from the cache before the defined TTL. Objects that expire will be revalidated with the origin.
         *   When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34; or &#34;BYPASS_CACHE&#34;, you must omit this field.
         *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(@Nullable Output<String> defaultTtl) {
            $.defaultTtl = defaultTtl;
            return this;
        }

        /**
         * @param defaultTtl Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age).
         * Defaults to 3600s (1 hour).
         * - The TTL must be &gt;= 0 and &lt;= 2592000s (1 month)
         * - Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34; (equivalent to must-revalidate)
         * - The value of defaultTTL cannot be set to a value greater than that of maxTTL.
         * - Fractions of a second are not allowed.
         * - When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses.
         *   Note that infrequently accessed objects may be evicted from the cache before the defined TTL. Objects that expire will be revalidated with the origin.
         *   When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34; or &#34;BYPASS_CACHE&#34;, you must omit this field.
         *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder defaultTtl(String defaultTtl) {
            return defaultTtl(Output.of(defaultTtl));
        }

        /**
         * @param maxTtl Specifies the maximum allowed TTL for cached content served by this origin.
         * Defaults to 86400s (1 day).
         * Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTtl seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive.
         * - The TTL must be &gt;= 0 and &lt;= 2592000s (1 month)
         * - Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34;
         * - The value of maxTtl must be equal to or greater than defaultTtl.
         * - Fractions of a second are not allowed.
         * - When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34;, &#34;FORCE_CACHE_ALL&#34;, or &#34;BYPASS_CACHE&#34;, you must omit this field.
         *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(@Nullable Output<String> maxTtl) {
            $.maxTtl = maxTtl;
            return this;
        }

        /**
         * @param maxTtl Specifies the maximum allowed TTL for cached content served by this origin.
         * Defaults to 86400s (1 day).
         * Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTtl seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive.
         * - The TTL must be &gt;= 0 and &lt;= 2592000s (1 month)
         * - Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34;
         * - The value of maxTtl must be equal to or greater than defaultTtl.
         * - Fractions of a second are not allowed.
         * - When the cache mode is set to &#34;USE_ORIGIN_HEADERS&#34;, &#34;FORCE_CACHE_ALL&#34;, or &#34;BYPASS_CACHE&#34;, you must omit this field.
         *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
         * 
         * @return builder
         * 
         */
        public Builder maxTtl(String maxTtl) {
            return maxTtl(Output.of(maxTtl));
        }

        /**
         * @param negativeCaching Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency.
         * By default, the CDNPolicy will apply the following default TTLs to these status codes:
         * - HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
         * - HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s
         * - HTTP 405 (Method Not Found), 414 (URI Too Long), 501 (Not Implemented): 60s
         *   These defaults can be overridden in negativeCachingPolicy
         * 
         * @return builder
         * 
         */
        public Builder negativeCaching(@Nullable Output<Boolean> negativeCaching) {
            $.negativeCaching = negativeCaching;
            return this;
        }

        /**
         * @param negativeCaching Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency.
         * By default, the CDNPolicy will apply the following default TTLs to these status codes:
         * - HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m
         * - HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s
         * - HTTP 405 (Method Not Found), 414 (URI Too Long), 501 (Not Implemented): 60s
         *   These defaults can be overridden in negativeCachingPolicy
         * 
         * @return builder
         * 
         */
        public Builder negativeCaching(Boolean negativeCaching) {
            return negativeCaching(Output.of(negativeCaching));
        }

        /**
         * @param negativeCachingPolicy Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
         * - Omitting the policy and leaving negativeCaching enabled will use the default TTLs for each status code, defined in negativeCaching.
         * - TTLs must be &gt;= 0 (where 0 is &#34;always revalidate&#34;) and &lt;= 86400s (1 day)
         *   Note that when specifying an explicit negativeCachingPolicy, you should take care to specify a cache TTL for all response codes that you wish to cache. The CDNPolicy will not apply any default negative caching when a policy exists.
         * 
         * @return builder
         * 
         */
        public Builder negativeCachingPolicy(@Nullable Output<Map<String,String>> negativeCachingPolicy) {
            $.negativeCachingPolicy = negativeCachingPolicy;
            return this;
        }

        /**
         * @param negativeCachingPolicy Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
         * - Omitting the policy and leaving negativeCaching enabled will use the default TTLs for each status code, defined in negativeCaching.
         * - TTLs must be &gt;= 0 (where 0 is &#34;always revalidate&#34;) and &lt;= 86400s (1 day)
         *   Note that when specifying an explicit negativeCachingPolicy, you should take care to specify a cache TTL for all response codes that you wish to cache. The CDNPolicy will not apply any default negative caching when a policy exists.
         * 
         * @return builder
         * 
         */
        public Builder negativeCachingPolicy(Map<String,String> negativeCachingPolicy) {
            return negativeCachingPolicy(Output.of(negativeCachingPolicy));
        }

        /**
         * @param signedRequestKeyset The EdgeCacheKeyset containing the set of public keys used to validate signed requests at the edge.
         * 
         * @return builder
         * 
         */
        public Builder signedRequestKeyset(@Nullable Output<String> signedRequestKeyset) {
            $.signedRequestKeyset = signedRequestKeyset;
            return this;
        }

        /**
         * @param signedRequestKeyset The EdgeCacheKeyset containing the set of public keys used to validate signed requests at the edge.
         * 
         * @return builder
         * 
         */
        public Builder signedRequestKeyset(String signedRequestKeyset) {
            return signedRequestKeyset(Output.of(signedRequestKeyset));
        }

        /**
         * @param signedRequestMode Whether to enforce signed requests. The default value is DISABLED, which means all content is public, and does not authorize access.
         * You must also set a signedRequestKeyset to enable signed requests.
         * When set to REQUIRE_SIGNATURES, all matching requests will have their signature validated. Requests that were not signed with the corresponding private key, or that are otherwise invalid (expired, do not match the signature, IP address, or header) will be rejected with a HTTP 403 and (if enabled) logged.
         * Possible values are `DISABLED` and `REQUIRE_SIGNATURES`.
         * 
         * @return builder
         * 
         */
        public Builder signedRequestMode(@Nullable Output<String> signedRequestMode) {
            $.signedRequestMode = signedRequestMode;
            return this;
        }

        /**
         * @param signedRequestMode Whether to enforce signed requests. The default value is DISABLED, which means all content is public, and does not authorize access.
         * You must also set a signedRequestKeyset to enable signed requests.
         * When set to REQUIRE_SIGNATURES, all matching requests will have their signature validated. Requests that were not signed with the corresponding private key, or that are otherwise invalid (expired, do not match the signature, IP address, or header) will be rejected with a HTTP 403 and (if enabled) logged.
         * Possible values are `DISABLED` and `REQUIRE_SIGNATURES`.
         * 
         * @return builder
         * 
         */
        public Builder signedRequestMode(String signedRequestMode) {
            return signedRequestMode(Output.of(signedRequestMode));
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs build() {
            return $;
        }
    }

}
