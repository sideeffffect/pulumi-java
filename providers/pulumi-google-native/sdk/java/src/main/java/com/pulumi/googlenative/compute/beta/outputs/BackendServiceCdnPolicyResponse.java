// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.beta.outputs.BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse;
import com.pulumi.googlenative.compute.beta.outputs.BackendServiceCdnPolicyNegativeCachingPolicyResponse;
import com.pulumi.googlenative.compute.beta.outputs.CacheKeyPolicyResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BackendServiceCdnPolicyResponse {
    /**
     * @return Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
     * 
     */
    private final List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders;
    /**
     * @return The CacheKeyPolicy for this CdnPolicy.
     * 
     */
    private final CacheKeyPolicyResponse cacheKeyPolicy;
    /**
     * @return Specifies the cache setting for all responses from this backend. The possible values are: USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google&#39;s edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server. FORCE_CACHE_ALL Cache all content, ignoring any &#34;private&#34;, &#34;no-store&#34; or &#34;no-cache&#34; directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content. CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
     * 
     */
    private final String cacheMode;
    /**
     * @return Specifies a separate client (e.g. browser client) maximum TTL. This is used to clamp the max-age (or Expires) value sent to the client. With FORCE_CACHE_ALL, the lesser of client_ttl and default_ttl is used for the response max-age directive, along with a &#34;public&#34; directive. For cacheable content in CACHE_ALL_STATIC mode, client_ttl clamps the max-age from the origin (if specified), or else sets the response max-age directive to the lesser of the client_ttl and default_ttl, and also ensures a &#34;public&#34; cache-control directive is present. If a client TTL is not specified, a default value (1 hour) will be used. The maximum allowed value is 31,622,400s (1 year).
     * 
     */
    private final Integer clientTtl;
    /**
     * @return Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age). Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34;. The value of defaultTTL cannot be set to a value greater than that of maxTTL, but can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    private final Integer defaultTtl;
    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin. Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34;. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    private final Integer maxTtl;
    /**
     * @return Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency. When the cache mode is set to CACHE_ALL_STATIC or USE_ORIGIN_HEADERS, negative caching applies to responses with the specified response code that lack any Cache-Control, Expires, or Pragma: no-cache directives. When the cache mode is set to FORCE_CACHE_ALL, negative caching applies to all responses with the specified response code, and override any caching headers. By default, Cloud CDN will apply the following default TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s. These defaults can be overridden in negative_caching_policy.
     * 
     */
    private final Boolean negativeCaching;
    /**
     * @return Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN&#39;s default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
     * 
     */
    private final List<BackendServiceCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy;
    /**
     * @return If true then Cloud CDN will combine multiple concurrent cache fill requests into a small number of requests to the origin.
     * 
     */
    private final Boolean requestCoalescing;
    /**
     * @return Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache. This setting defines the default &#34;max-stale&#34; duration for any cached responses that do not specify a max-stale directive. Stale responses that exceed the TTL configured here will not be served. The default limit (max-stale) is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this to zero (0) to disable serve-while-stale.
     * 
     */
    private final Integer serveWhileStale;
    /**
     * @return Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a &#34;Cache-Control: public, max-age=[TTL]&#34; header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
     * 
     */
    private final String signedUrlCacheMaxAgeSec;
    /**
     * @return Names of the keys for signing request URLs.
     * 
     */
    private final List<String> signedUrlKeyNames;

    @CustomType.Constructor
    private BackendServiceCdnPolicyResponse(
        @CustomType.Parameter("bypassCacheOnRequestHeaders") List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders,
        @CustomType.Parameter("cacheKeyPolicy") CacheKeyPolicyResponse cacheKeyPolicy,
        @CustomType.Parameter("cacheMode") String cacheMode,
        @CustomType.Parameter("clientTtl") Integer clientTtl,
        @CustomType.Parameter("defaultTtl") Integer defaultTtl,
        @CustomType.Parameter("maxTtl") Integer maxTtl,
        @CustomType.Parameter("negativeCaching") Boolean negativeCaching,
        @CustomType.Parameter("negativeCachingPolicy") List<BackendServiceCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy,
        @CustomType.Parameter("requestCoalescing") Boolean requestCoalescing,
        @CustomType.Parameter("serveWhileStale") Integer serveWhileStale,
        @CustomType.Parameter("signedUrlCacheMaxAgeSec") String signedUrlCacheMaxAgeSec,
        @CustomType.Parameter("signedUrlKeyNames") List<String> signedUrlKeyNames) {
        this.bypassCacheOnRequestHeaders = bypassCacheOnRequestHeaders;
        this.cacheKeyPolicy = cacheKeyPolicy;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicy = negativeCachingPolicy;
        this.requestCoalescing = requestCoalescing;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
        this.signedUrlKeyNames = signedUrlKeyNames;
    }

    /**
     * @return Bypass the cache when the specified request headers are matched - e.g. Pragma or Authorization headers. Up to 5 headers can be specified. The cache is bypassed for all cdnPolicy.cacheMode settings.
     * 
     */
    public List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders() {
        return this.bypassCacheOnRequestHeaders;
    }
    /**
     * @return The CacheKeyPolicy for this CdnPolicy.
     * 
     */
    public CacheKeyPolicyResponse cacheKeyPolicy() {
        return this.cacheKeyPolicy;
    }
    /**
     * @return Specifies the cache setting for all responses from this backend. The possible values are: USE_ORIGIN_HEADERS Requires the origin to set valid caching headers to cache content. Responses without these headers will not be cached at Google&#39;s edge, and will require a full trip to the origin on every request, potentially impacting performance and increasing load on the origin server. FORCE_CACHE_ALL Cache all content, ignoring any &#34;private&#34;, &#34;no-store&#34; or &#34;no-cache&#34; directives in Cache-Control response headers. Warning: this may result in Cloud CDN caching private, per-user (user identifiable) content. CACHE_ALL_STATIC Automatically cache static content, including common image formats, media (video and audio), and web assets (JavaScript and CSS). Requests and responses that are marked as uncacheable, as well as dynamic content (including HTML), will not be cached.
     * 
     */
    public String cacheMode() {
        return this.cacheMode;
    }
    /**
     * @return Specifies a separate client (e.g. browser client) maximum TTL. This is used to clamp the max-age (or Expires) value sent to the client. With FORCE_CACHE_ALL, the lesser of client_ttl and default_ttl is used for the response max-age directive, along with a &#34;public&#34; directive. For cacheable content in CACHE_ALL_STATIC mode, client_ttl clamps the max-age from the origin (if specified), or else sets the response max-age directive to the lesser of the client_ttl and default_ttl, and also ensures a &#34;public&#34; cache-control directive is present. If a client TTL is not specified, a default value (1 hour) will be used. The maximum allowed value is 31,622,400s (1 year).
     * 
     */
    public Integer clientTtl() {
        return this.clientTtl;
    }
    /**
     * @return Specifies the default TTL for cached content served by this origin for responses that do not have an existing valid TTL (max-age or s-max-age). Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34;. The value of defaultTTL cannot be set to a value greater than that of maxTTL, but can be equal. When the cacheMode is set to FORCE_CACHE_ALL, the defaultTTL will overwrite the TTL set in all responses. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    public Integer defaultTtl() {
        return this.defaultTtl;
    }
    /**
     * @return Specifies the maximum allowed TTL for cached content served by this origin. Cache directives that attempt to set a max-age or s-maxage higher than this, or an Expires header more than maxTTL seconds in the future will be capped at the value of maxTTL, as if it were the value of an s-maxage Cache-Control directive. Headers sent to the client will not be modified. Setting a TTL of &#34;0&#34; means &#34;always revalidate&#34;. The maximum allowed value is 31,622,400s (1 year), noting that infrequently accessed objects may be evicted from the cache before the defined TTL.
     * 
     */
    public Integer maxTtl() {
        return this.maxTtl;
    }
    /**
     * @return Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects. This can reduce the load on your origin and improve end-user experience by reducing response latency. When the cache mode is set to CACHE_ALL_STATIC or USE_ORIGIN_HEADERS, negative caching applies to responses with the specified response code that lack any Cache-Control, Expires, or Pragma: no-cache directives. When the cache mode is set to FORCE_CACHE_ALL, negative caching applies to all responses with the specified response code, and override any caching headers. By default, Cloud CDN will apply the following default TTLs to these status codes: HTTP 300 (Multiple Choice), 301, 308 (Permanent Redirects): 10m HTTP 404 (Not Found), 410 (Gone), 451 (Unavailable For Legal Reasons): 120s HTTP 405 (Method Not Found), 421 (Misdirected Request), 501 (Not Implemented): 60s. These defaults can be overridden in negative_caching_policy.
     * 
     */
    public Boolean negativeCaching() {
        return this.negativeCaching;
    }
    /**
     * @return Sets a cache TTL for the specified HTTP status code. negative_caching must be enabled to configure negative_caching_policy. Omitting the policy and leaving negative_caching enabled will use Cloud CDN&#39;s default cache TTLs. Note that when specifying an explicit negative_caching_policy, you should take care to specify a cache TTL for all response codes that you wish to cache. Cloud CDN will not apply any default negative caching when a policy exists.
     * 
     */
    public List<BackendServiceCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy() {
        return this.negativeCachingPolicy;
    }
    /**
     * @return If true then Cloud CDN will combine multiple concurrent cache fill requests into a small number of requests to the origin.
     * 
     */
    public Boolean requestCoalescing() {
        return this.requestCoalescing;
    }
    /**
     * @return Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache. This setting defines the default &#34;max-stale&#34; duration for any cached responses that do not specify a max-stale directive. Stale responses that exceed the TTL configured here will not be served. The default limit (max-stale) is 86400s (1 day), which will allow stale content to be served up to this limit beyond the max-age (or s-max-age) of a cached response. The maximum allowed value is 604800 (1 week). Set this to zero (0) to disable serve-while-stale.
     * 
     */
    public Integer serveWhileStale() {
        return this.serveWhileStale;
    }
    /**
     * @return Maximum number of seconds the response to a signed URL request will be considered fresh. After this time period, the response will be revalidated before being served. Defaults to 1hr (3600s). When serving responses to signed URL requests, Cloud CDN will internally behave as though all responses from this backend had a &#34;Cache-Control: public, max-age=[TTL]&#34; header, regardless of any existing Cache-Control header. The actual headers served in responses will not be altered.
     * 
     */
    public String signedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec;
    }
    /**
     * @return Names of the keys for signing request URLs.
     * 
     */
    public List<String> signedUrlKeyNames() {
        return this.signedUrlKeyNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCdnPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders;
        private CacheKeyPolicyResponse cacheKeyPolicy;
        private String cacheMode;
        private Integer clientTtl;
        private Integer defaultTtl;
        private Integer maxTtl;
        private Boolean negativeCaching;
        private List<BackendServiceCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy;
        private Boolean requestCoalescing;
        private Integer serveWhileStale;
        private String signedUrlCacheMaxAgeSec;
        private List<String> signedUrlKeyNames;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCdnPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bypassCacheOnRequestHeaders = defaults.bypassCacheOnRequestHeaders;
    	      this.cacheKeyPolicy = defaults.cacheKeyPolicy;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicy = defaults.negativeCachingPolicy;
    	      this.requestCoalescing = defaults.requestCoalescing;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
    	      this.signedUrlKeyNames = defaults.signedUrlKeyNames;
        }

        public Builder bypassCacheOnRequestHeaders(List<BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse> bypassCacheOnRequestHeaders) {
            this.bypassCacheOnRequestHeaders = Objects.requireNonNull(bypassCacheOnRequestHeaders);
            return this;
        }
        public Builder bypassCacheOnRequestHeaders(BackendServiceCdnPolicyBypassCacheOnRequestHeaderResponse... bypassCacheOnRequestHeaders) {
            return bypassCacheOnRequestHeaders(List.of(bypassCacheOnRequestHeaders));
        }
        public Builder cacheKeyPolicy(CacheKeyPolicyResponse cacheKeyPolicy) {
            this.cacheKeyPolicy = Objects.requireNonNull(cacheKeyPolicy);
            return this;
        }
        public Builder cacheMode(String cacheMode) {
            this.cacheMode = Objects.requireNonNull(cacheMode);
            return this;
        }
        public Builder clientTtl(Integer clientTtl) {
            this.clientTtl = Objects.requireNonNull(clientTtl);
            return this;
        }
        public Builder defaultTtl(Integer defaultTtl) {
            this.defaultTtl = Objects.requireNonNull(defaultTtl);
            return this;
        }
        public Builder maxTtl(Integer maxTtl) {
            this.maxTtl = Objects.requireNonNull(maxTtl);
            return this;
        }
        public Builder negativeCaching(Boolean negativeCaching) {
            this.negativeCaching = Objects.requireNonNull(negativeCaching);
            return this;
        }
        public Builder negativeCachingPolicy(List<BackendServiceCdnPolicyNegativeCachingPolicyResponse> negativeCachingPolicy) {
            this.negativeCachingPolicy = Objects.requireNonNull(negativeCachingPolicy);
            return this;
        }
        public Builder negativeCachingPolicy(BackendServiceCdnPolicyNegativeCachingPolicyResponse... negativeCachingPolicy) {
            return negativeCachingPolicy(List.of(negativeCachingPolicy));
        }
        public Builder requestCoalescing(Boolean requestCoalescing) {
            this.requestCoalescing = Objects.requireNonNull(requestCoalescing);
            return this;
        }
        public Builder serveWhileStale(Integer serveWhileStale) {
            this.serveWhileStale = Objects.requireNonNull(serveWhileStale);
            return this;
        }
        public Builder signedUrlCacheMaxAgeSec(String signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Objects.requireNonNull(signedUrlCacheMaxAgeSec);
            return this;
        }
        public Builder signedUrlKeyNames(List<String> signedUrlKeyNames) {
            this.signedUrlKeyNames = Objects.requireNonNull(signedUrlKeyNames);
            return this;
        }
        public Builder signedUrlKeyNames(String... signedUrlKeyNames) {
            return signedUrlKeyNames(List.of(signedUrlKeyNames));
        }        public BackendServiceCdnPolicyResponse build() {
            return new BackendServiceCdnPolicyResponse(bypassCacheOnRequestHeaders, cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicy, requestCoalescing, serveWhileStale, signedUrlCacheMaxAgeSec, signedUrlKeyNames);
        }
    }
}
