// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BackendBucketCdnPolicyCacheKeyPolicyResponse {
    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
     */
    private final List<String> includeHttpHeaders;
    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
     */
    private final List<String> queryStringWhitelist;

    @CustomType.Constructor
    private BackendBucketCdnPolicyCacheKeyPolicyResponse(
        @CustomType.Parameter("includeHttpHeaders") List<String> includeHttpHeaders,
        @CustomType.Parameter("queryStringWhitelist") List<String> queryStringWhitelist) {
        this.includeHttpHeaders = includeHttpHeaders;
        this.queryStringWhitelist = queryStringWhitelist;
    }

    /**
     * Allows HTTP request headers (by name) to be used in the cache key.
     * 
    */
    public List<String> includeHttpHeaders() {
        return this.includeHttpHeaders;
    }
    /**
     * Names of query string parameters to include in cache keys. All other parameters will be excluded. '&' and '=' will be percent encoded and not treated as delimiters.
     * 
    */
    public List<String> queryStringWhitelist() {
        return this.queryStringWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendBucketCdnPolicyCacheKeyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> includeHttpHeaders;
        private List<String> queryStringWhitelist;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendBucketCdnPolicyCacheKeyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeHttpHeaders = defaults.includeHttpHeaders;
    	      this.queryStringWhitelist = defaults.queryStringWhitelist;
        }

        public Builder includeHttpHeaders(List<String> includeHttpHeaders) {
            this.includeHttpHeaders = Objects.requireNonNull(includeHttpHeaders);
            return this;
        }
        public Builder includeHttpHeaders(String... includeHttpHeaders) {
            return includeHttpHeaders(List.of(includeHttpHeaders));
        }
        public Builder queryStringWhitelist(List<String> queryStringWhitelist) {
            this.queryStringWhitelist = Objects.requireNonNull(queryStringWhitelist);
            return this;
        }
        public Builder queryStringWhitelist(String... queryStringWhitelist) {
            return queryStringWhitelist(List.of(queryStringWhitelist));
        }        public BackendBucketCdnPolicyCacheKeyPolicyResponse build() {
            return new BackendBucketCdnPolicyCacheKeyPolicyResponse(includeHttpHeaders, queryStringWhitelist);
        }
    }
}
