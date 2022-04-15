// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapPathMatcherRouteRuleUrlRedirect {
    /**
     * The host that will be used in the redirect response instead of the one that was
     * supplied in the request. The value must be between 1 and 255 characters.
     * 
     */
    private final @Nullable String hostRedirect;
    /**
     * If set to true, the URL scheme in the redirected request is set to https. If set to
     * false, the URL scheme of the redirected request will remain the same as that of the
     * request. This must only be set for UrlMaps used in TargetHttpProxys. Setting this
     * true for TargetHttpsProxy is not permitted. The default is set to false.
     * 
     */
    private final @Nullable Boolean httpsRedirect;
    /**
     * The path that will be used in the redirect response instead of the one that was
     * supplied in the request. pathRedirect cannot be supplied together with
     * prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the
     * original request will be used for the redirect. The value must be between 1 and 1024
     * characters.
     * 
     */
    private final @Nullable String pathRedirect;
    /**
     * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch,
     * retaining the remaining portion of the URL before redirecting the request.
     * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or
     * neither. If neither is supplied, the path of the original request will be used for
     * the redirect. The value must be between 1 and 1024 characters.
     * 
     */
    private final @Nullable String prefixRedirect;
    /**
     * The HTTP Status code to use for this RedirectAction. Supported values are:
     * * MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301.
     * * FOUND, which corresponds to 302.
     * * SEE_OTHER which corresponds to 303.
     * * TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method
     *   will be retained.
     * * PERMANENT_REDIRECT, which corresponds to 308. In this case,
     *   the request method will be retained.
     * 
     */
    private final @Nullable String redirectResponseCode;
    /**
     * If set to true, any accompanying query portion of the original URL is removed prior
     * to redirecting the request. If set to false, the query portion of the original URL is
     * retained.
     * This field is required to ensure an empty block is not set. The normal default value is false.
     * 
     */
    private final @Nullable Boolean stripQuery;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherRouteRuleUrlRedirect(
        @CustomType.Parameter("hostRedirect") @Nullable String hostRedirect,
        @CustomType.Parameter("httpsRedirect") @Nullable Boolean httpsRedirect,
        @CustomType.Parameter("pathRedirect") @Nullable String pathRedirect,
        @CustomType.Parameter("prefixRedirect") @Nullable String prefixRedirect,
        @CustomType.Parameter("redirectResponseCode") @Nullable String redirectResponseCode,
        @CustomType.Parameter("stripQuery") @Nullable Boolean stripQuery) {
        this.hostRedirect = hostRedirect;
        this.httpsRedirect = httpsRedirect;
        this.pathRedirect = pathRedirect;
        this.prefixRedirect = prefixRedirect;
        this.redirectResponseCode = redirectResponseCode;
        this.stripQuery = stripQuery;
    }

    /**
     * The host that will be used in the redirect response instead of the one that was
     * supplied in the request. The value must be between 1 and 255 characters.
     * 
    */
    public Optional<String> hostRedirect() {
        return Optional.ofNullable(this.hostRedirect);
    }
    /**
     * If set to true, the URL scheme in the redirected request is set to https. If set to
     * false, the URL scheme of the redirected request will remain the same as that of the
     * request. This must only be set for UrlMaps used in TargetHttpProxys. Setting this
     * true for TargetHttpsProxy is not permitted. The default is set to false.
     * 
    */
    public Optional<Boolean> httpsRedirect() {
        return Optional.ofNullable(this.httpsRedirect);
    }
    /**
     * The path that will be used in the redirect response instead of the one that was
     * supplied in the request. pathRedirect cannot be supplied together with
     * prefixRedirect. Supply one alone or neither. If neither is supplied, the path of the
     * original request will be used for the redirect. The value must be between 1 and 1024
     * characters.
     * 
    */
    public Optional<String> pathRedirect() {
        return Optional.ofNullable(this.pathRedirect);
    }
    /**
     * The prefix that replaces the prefixMatch specified in the HttpRouteRuleMatch,
     * retaining the remaining portion of the URL before redirecting the request.
     * prefixRedirect cannot be supplied together with pathRedirect. Supply one alone or
     * neither. If neither is supplied, the path of the original request will be used for
     * the redirect. The value must be between 1 and 1024 characters.
     * 
    */
    public Optional<String> prefixRedirect() {
        return Optional.ofNullable(this.prefixRedirect);
    }
    /**
     * The HTTP Status code to use for this RedirectAction. Supported values are:
     * * MOVED_PERMANENTLY_DEFAULT, which is the default value and corresponds to 301.
     * * FOUND, which corresponds to 302.
     * * SEE_OTHER which corresponds to 303.
     * * TEMPORARY_REDIRECT, which corresponds to 307. In this case, the request method
     *   will be retained.
     * * PERMANENT_REDIRECT, which corresponds to 308. In this case,
     *   the request method will be retained.
     * 
    */
    public Optional<String> redirectResponseCode() {
        return Optional.ofNullable(this.redirectResponseCode);
    }
    /**
     * If set to true, any accompanying query portion of the original URL is removed prior
     * to redirecting the request. If set to false, the query portion of the original URL is
     * retained.
     * This field is required to ensure an empty block is not set. The normal default value is false.
     * 
    */
    public Optional<Boolean> stripQuery() {
        return Optional.ofNullable(this.stripQuery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleUrlRedirect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostRedirect;
        private @Nullable Boolean httpsRedirect;
        private @Nullable String pathRedirect;
        private @Nullable String prefixRedirect;
        private @Nullable String redirectResponseCode;
        private @Nullable Boolean stripQuery;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleUrlRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRedirect = defaults.hostRedirect;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.pathRedirect = defaults.pathRedirect;
    	      this.prefixRedirect = defaults.prefixRedirect;
    	      this.redirectResponseCode = defaults.redirectResponseCode;
    	      this.stripQuery = defaults.stripQuery;
        }

        public Builder hostRedirect(@Nullable String hostRedirect) {
            this.hostRedirect = hostRedirect;
            return this;
        }
        public Builder httpsRedirect(@Nullable Boolean httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }
        public Builder pathRedirect(@Nullable String pathRedirect) {
            this.pathRedirect = pathRedirect;
            return this;
        }
        public Builder prefixRedirect(@Nullable String prefixRedirect) {
            this.prefixRedirect = prefixRedirect;
            return this;
        }
        public Builder redirectResponseCode(@Nullable String redirectResponseCode) {
            this.redirectResponseCode = redirectResponseCode;
            return this;
        }
        public Builder stripQuery(@Nullable Boolean stripQuery) {
            this.stripQuery = stripQuery;
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleUrlRedirect build() {
            return new RegionUrlMapPathMatcherRouteRuleUrlRedirect(hostRedirect, httpsRedirect, pathRedirect, prefixRedirect, redirectResponseCode, stripQuery);
        }
    }
}
