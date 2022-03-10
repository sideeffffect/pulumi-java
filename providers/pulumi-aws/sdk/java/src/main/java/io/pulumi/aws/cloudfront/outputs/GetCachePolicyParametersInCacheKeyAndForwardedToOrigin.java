// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig;
import io.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig;
import io.pulumi.aws.cloudfront.outputs.GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCachePolicyParametersInCacheKeyAndForwardedToOrigin {
    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> cookiesConfigs;
    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    private final Boolean enableAcceptEncodingBrotli;
    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
     */
    private final Boolean enableAcceptEncodingGzip;
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> headersConfigs;
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    private final List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> queryStringsConfigs;

    @OutputCustomType.Constructor
    private GetCachePolicyParametersInCacheKeyAndForwardedToOrigin(
        @OutputCustomType.Parameter("cookiesConfigs") List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> cookiesConfigs,
        @OutputCustomType.Parameter("enableAcceptEncodingBrotli") Boolean enableAcceptEncodingBrotli,
        @OutputCustomType.Parameter("enableAcceptEncodingGzip") Boolean enableAcceptEncodingGzip,
        @OutputCustomType.Parameter("headersConfigs") List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> headersConfigs,
        @OutputCustomType.Parameter("queryStringsConfigs") List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> queryStringsConfigs) {
        this.cookiesConfigs = cookiesConfigs;
        this.enableAcceptEncodingBrotli = enableAcceptEncodingBrotli;
        this.enableAcceptEncodingGzip = enableAcceptEncodingGzip;
        this.headersConfigs = headersConfigs;
        this.queryStringsConfigs = queryStringsConfigs;
    }

    /**
     * Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
    */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> getCookiesConfigs() {
        return this.cookiesConfigs;
    }
    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
    */
    public Boolean getEnableAcceptEncodingBrotli() {
        return this.enableAcceptEncodingBrotli;
    }
    /**
     * A flag that can affect whether the Accept-Encoding HTTP header is included in the cache key and included in requests that CloudFront sends to the origin.
     * 
    */
    public Boolean getEnableAcceptEncodingGzip() {
        return this.enableAcceptEncodingGzip;
    }
    /**
     * Object that determines whether any HTTP headers (and if so, which headers) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
    */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> getHeadersConfigs() {
        return this.headersConfigs;
    }
    /**
     * Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the cache key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
    */
    public List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> getQueryStringsConfigs() {
        return this.queryStringsConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCachePolicyParametersInCacheKeyAndForwardedToOrigin defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> cookiesConfigs;
        private Boolean enableAcceptEncodingBrotli;
        private Boolean enableAcceptEncodingGzip;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> headersConfigs;
        private List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> queryStringsConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCachePolicyParametersInCacheKeyAndForwardedToOrigin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookiesConfigs = defaults.cookiesConfigs;
    	      this.enableAcceptEncodingBrotli = defaults.enableAcceptEncodingBrotli;
    	      this.enableAcceptEncodingGzip = defaults.enableAcceptEncodingGzip;
    	      this.headersConfigs = defaults.headersConfigs;
    	      this.queryStringsConfigs = defaults.queryStringsConfigs;
        }

        public Builder cookiesConfigs(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfig> cookiesConfigs) {
            this.cookiesConfigs = Objects.requireNonNull(cookiesConfigs);
            return this;
        }

        public Builder enableAcceptEncodingBrotli(Boolean enableAcceptEncodingBrotli) {
            this.enableAcceptEncodingBrotli = Objects.requireNonNull(enableAcceptEncodingBrotli);
            return this;
        }

        public Builder enableAcceptEncodingGzip(Boolean enableAcceptEncodingGzip) {
            this.enableAcceptEncodingGzip = Objects.requireNonNull(enableAcceptEncodingGzip);
            return this;
        }

        public Builder headersConfigs(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginHeadersConfig> headersConfigs) {
            this.headersConfigs = Objects.requireNonNull(headersConfigs);
            return this;
        }

        public Builder queryStringsConfigs(List<GetCachePolicyParametersInCacheKeyAndForwardedToOriginQueryStringsConfig> queryStringsConfigs) {
            this.queryStringsConfigs = Objects.requireNonNull(queryStringsConfigs);
            return this;
        }
        public GetCachePolicyParametersInCacheKeyAndForwardedToOrigin build() {
            return new GetCachePolicyParametersInCacheKeyAndForwardedToOrigin(cookiesConfigs, enableAcceptEncodingBrotli, enableAcceptEncodingGzip, headersConfigs, queryStringsConfigs);
        }
    }
}
