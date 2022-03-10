// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyCacheKeyPolicyArgs;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceCdnPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceCdnPolicyArgs Empty = new RegionBackendServiceCdnPolicyArgs();

    /**
     * The CacheKeyPolicy for this CdnPolicy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="cacheKeyPolicy")
      private final @Nullable Input<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy;

    public Input<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> getCacheKeyPolicy() {
        return this.cacheKeyPolicy == null ? Input.empty() : this.cacheKeyPolicy;
    }

    /**
     * Specifies the cache setting for all responses from this backend.
     * The possible values are: USE_ORIGIN_HEADERS, FORCE_CACHE_ALL and CACHE_ALL_STATIC
     * Possible values are `USE_ORIGIN_HEADERS`, `FORCE_CACHE_ALL`, and `CACHE_ALL_STATIC`.
     * 
     */
    @InputImport(name="cacheMode")
      private final @Nullable Input<String> cacheMode;

    public Input<String> getCacheMode() {
        return this.cacheMode == null ? Input.empty() : this.cacheMode;
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    @InputImport(name="clientTtl")
      private final @Nullable Input<Integer> clientTtl;

    public Input<Integer> getClientTtl() {
        return this.clientTtl == null ? Input.empty() : this.clientTtl;
    }

    /**
     * Specifies the default TTL for cached content served by this origin for responses
     * that do not have an existing valid TTL (max-age or s-max-age).
     * 
     */
    @InputImport(name="defaultTtl")
      private final @Nullable Input<Integer> defaultTtl;

    public Input<Integer> getDefaultTtl() {
        return this.defaultTtl == null ? Input.empty() : this.defaultTtl;
    }

    /**
     * Specifies the maximum allowed TTL for cached content served by this origin.
     * 
     */
    @InputImport(name="maxTtl")
      private final @Nullable Input<Integer> maxTtl;

    public Input<Integer> getMaxTtl() {
        return this.maxTtl == null ? Input.empty() : this.maxTtl;
    }

    /**
     * Negative caching allows per-status code TTLs to be set, in order to apply fine-grained caching for common errors or redirects.
     * 
     */
    @InputImport(name="negativeCaching")
      private final @Nullable Input<Boolean> negativeCaching;

    public Input<Boolean> getNegativeCaching() {
        return this.negativeCaching == null ? Input.empty() : this.negativeCaching;
    }

    /**
     * Sets a cache TTL for the specified HTTP status code. negativeCaching must be enabled to configure negativeCachingPolicy.
     * Omitting the policy and leaving negativeCaching enabled will use Cloud CDN's default cache TTLs.
     * Structure is documented below.
     * 
     */
    @InputImport(name="negativeCachingPolicies")
      private final @Nullable Input<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicies;

    public Input<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> getNegativeCachingPolicies() {
        return this.negativeCachingPolicies == null ? Input.empty() : this.negativeCachingPolicies;
    }

    /**
     * Serve existing content from the cache (if available) when revalidating content with the origin, or when an error is encountered when refreshing the cache.
     * 
     */
    @InputImport(name="serveWhileStale")
      private final @Nullable Input<Integer> serveWhileStale;

    public Input<Integer> getServeWhileStale() {
        return this.serveWhileStale == null ? Input.empty() : this.serveWhileStale;
    }

    /**
     * Maximum number of seconds the response to a signed URL request
     * will be considered fresh, defaults to 1hr (3600s). After this
     * time period, the response will be revalidated before
     * being served.
     * When serving responses to signed URL requests, Cloud CDN will
     * internally behave as though all responses from this backend had a
     * "Cache-Control: public, max-age=[TTL]" header, regardless of any
     * existing Cache-Control header. The actual headers served in
     * responses will not be altered.
     * 
     */
    @InputImport(name="signedUrlCacheMaxAgeSec")
      private final @Nullable Input<Integer> signedUrlCacheMaxAgeSec;

    public Input<Integer> getSignedUrlCacheMaxAgeSec() {
        return this.signedUrlCacheMaxAgeSec == null ? Input.empty() : this.signedUrlCacheMaxAgeSec;
    }

    public RegionBackendServiceCdnPolicyArgs(
        @Nullable Input<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy,
        @Nullable Input<String> cacheMode,
        @Nullable Input<Integer> clientTtl,
        @Nullable Input<Integer> defaultTtl,
        @Nullable Input<Integer> maxTtl,
        @Nullable Input<Boolean> negativeCaching,
        @Nullable Input<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicies,
        @Nullable Input<Integer> serveWhileStale,
        @Nullable Input<Integer> signedUrlCacheMaxAgeSec) {
        this.cacheKeyPolicy = cacheKeyPolicy;
        this.cacheMode = cacheMode;
        this.clientTtl = clientTtl;
        this.defaultTtl = defaultTtl;
        this.maxTtl = maxTtl;
        this.negativeCaching = negativeCaching;
        this.negativeCachingPolicies = negativeCachingPolicies;
        this.serveWhileStale = serveWhileStale;
        this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
    }

    private RegionBackendServiceCdnPolicyArgs() {
        this.cacheKeyPolicy = Input.empty();
        this.cacheMode = Input.empty();
        this.clientTtl = Input.empty();
        this.defaultTtl = Input.empty();
        this.maxTtl = Input.empty();
        this.negativeCaching = Input.empty();
        this.negativeCachingPolicies = Input.empty();
        this.serveWhileStale = Input.empty();
        this.signedUrlCacheMaxAgeSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceCdnPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy;
        private @Nullable Input<String> cacheMode;
        private @Nullable Input<Integer> clientTtl;
        private @Nullable Input<Integer> defaultTtl;
        private @Nullable Input<Integer> maxTtl;
        private @Nullable Input<Boolean> negativeCaching;
        private @Nullable Input<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicies;
        private @Nullable Input<Integer> serveWhileStale;
        private @Nullable Input<Integer> signedUrlCacheMaxAgeSec;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceCdnPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cacheKeyPolicy = defaults.cacheKeyPolicy;
    	      this.cacheMode = defaults.cacheMode;
    	      this.clientTtl = defaults.clientTtl;
    	      this.defaultTtl = defaults.defaultTtl;
    	      this.maxTtl = defaults.maxTtl;
    	      this.negativeCaching = defaults.negativeCaching;
    	      this.negativeCachingPolicies = defaults.negativeCachingPolicies;
    	      this.serveWhileStale = defaults.serveWhileStale;
    	      this.signedUrlCacheMaxAgeSec = defaults.signedUrlCacheMaxAgeSec;
        }

        public Builder cacheKeyPolicy(@Nullable Input<RegionBackendServiceCdnPolicyCacheKeyPolicyArgs> cacheKeyPolicy) {
            this.cacheKeyPolicy = cacheKeyPolicy;
            return this;
        }

        public Builder cacheKeyPolicy(@Nullable RegionBackendServiceCdnPolicyCacheKeyPolicyArgs cacheKeyPolicy) {
            this.cacheKeyPolicy = Input.ofNullable(cacheKeyPolicy);
            return this;
        }

        public Builder cacheMode(@Nullable Input<String> cacheMode) {
            this.cacheMode = cacheMode;
            return this;
        }

        public Builder cacheMode(@Nullable String cacheMode) {
            this.cacheMode = Input.ofNullable(cacheMode);
            return this;
        }

        public Builder clientTtl(@Nullable Input<Integer> clientTtl) {
            this.clientTtl = clientTtl;
            return this;
        }

        public Builder clientTtl(@Nullable Integer clientTtl) {
            this.clientTtl = Input.ofNullable(clientTtl);
            return this;
        }

        public Builder defaultTtl(@Nullable Input<Integer> defaultTtl) {
            this.defaultTtl = defaultTtl;
            return this;
        }

        public Builder defaultTtl(@Nullable Integer defaultTtl) {
            this.defaultTtl = Input.ofNullable(defaultTtl);
            return this;
        }

        public Builder maxTtl(@Nullable Input<Integer> maxTtl) {
            this.maxTtl = maxTtl;
            return this;
        }

        public Builder maxTtl(@Nullable Integer maxTtl) {
            this.maxTtl = Input.ofNullable(maxTtl);
            return this;
        }

        public Builder negativeCaching(@Nullable Input<Boolean> negativeCaching) {
            this.negativeCaching = negativeCaching;
            return this;
        }

        public Builder negativeCaching(@Nullable Boolean negativeCaching) {
            this.negativeCaching = Input.ofNullable(negativeCaching);
            return this;
        }

        public Builder negativeCachingPolicies(@Nullable Input<List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs>> negativeCachingPolicies) {
            this.negativeCachingPolicies = negativeCachingPolicies;
            return this;
        }

        public Builder negativeCachingPolicies(@Nullable List<RegionBackendServiceCdnPolicyNegativeCachingPolicyArgs> negativeCachingPolicies) {
            this.negativeCachingPolicies = Input.ofNullable(negativeCachingPolicies);
            return this;
        }

        public Builder serveWhileStale(@Nullable Input<Integer> serveWhileStale) {
            this.serveWhileStale = serveWhileStale;
            return this;
        }

        public Builder serveWhileStale(@Nullable Integer serveWhileStale) {
            this.serveWhileStale = Input.ofNullable(serveWhileStale);
            return this;
        }

        public Builder signedUrlCacheMaxAgeSec(@Nullable Input<Integer> signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = signedUrlCacheMaxAgeSec;
            return this;
        }

        public Builder signedUrlCacheMaxAgeSec(@Nullable Integer signedUrlCacheMaxAgeSec) {
            this.signedUrlCacheMaxAgeSec = Input.ofNullable(signedUrlCacheMaxAgeSec);
            return this;
        }
        public RegionBackendServiceCdnPolicyArgs build() {
            return new RegionBackendServiceCdnPolicyArgs(cacheKeyPolicy, cacheMode, clientTtl, defaultTtl, maxTtl, negativeCaching, negativeCachingPolicies, serveWhileStale, signedUrlCacheMaxAgeSec);
        }
    }
}
