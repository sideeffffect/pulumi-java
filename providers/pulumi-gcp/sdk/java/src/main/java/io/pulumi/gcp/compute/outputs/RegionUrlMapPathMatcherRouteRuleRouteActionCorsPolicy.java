// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy {
    /**
     * In response to a preflight request, setting this to true indicates that the
     * actual request can include user credentials. This translates to the Access-
     * Control-Allow-Credentials header. Defaults to false.
     * 
     */
    private final @Nullable Boolean allowCredentials;
    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    private final @Nullable List<String> allowHeaders;
    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    private final @Nullable List<String> allowMethods;
    /**
     * Specifies the regular expression patterns that match allowed origins. For
     * regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either allow_origins or allow_origin_regex.
     * 
     */
    private final @Nullable List<String> allowOriginRegexes;
    /**
     * Specifies the list of origins that will be allowed to do CORS requests. An
     * origin is allowed if it matches either allow_origins or allow_origin_regex.
     * 
     */
    private final @Nullable List<String> allowOrigins;
    /**
     * If true, specifies the CORS policy is disabled.
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    private final @Nullable List<String> exposeHeaders;
    /**
     * Specifies how long the results of a preflight request can be cached. This
     * translates to the content for the Access-Control-Max-Age header.
     * 
     */
    private final @Nullable Integer maxAge;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy(
        @CustomType.Parameter("allowCredentials") @Nullable Boolean allowCredentials,
        @CustomType.Parameter("allowHeaders") @Nullable List<String> allowHeaders,
        @CustomType.Parameter("allowMethods") @Nullable List<String> allowMethods,
        @CustomType.Parameter("allowOriginRegexes") @Nullable List<String> allowOriginRegexes,
        @CustomType.Parameter("allowOrigins") @Nullable List<String> allowOrigins,
        @CustomType.Parameter("disabled") @Nullable Boolean disabled,
        @CustomType.Parameter("exposeHeaders") @Nullable List<String> exposeHeaders,
        @CustomType.Parameter("maxAge") @Nullable Integer maxAge) {
        this.allowCredentials = allowCredentials;
        this.allowHeaders = allowHeaders;
        this.allowMethods = allowMethods;
        this.allowOriginRegexes = allowOriginRegexes;
        this.allowOrigins = allowOrigins;
        this.disabled = disabled;
        this.exposeHeaders = exposeHeaders;
        this.maxAge = maxAge;
    }

    /**
     * In response to a preflight request, setting this to true indicates that the
     * actual request can include user credentials. This translates to the Access-
     * Control-Allow-Credentials header. Defaults to false.
     * 
    */
    public Optional<Boolean> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
    */
    public List<String> allowHeaders() {
        return this.allowHeaders == null ? List.of() : this.allowHeaders;
    }
    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
    */
    public List<String> allowMethods() {
        return this.allowMethods == null ? List.of() : this.allowMethods;
    }
    /**
     * Specifies the regular expression patterns that match allowed origins. For
     * regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either allow_origins or allow_origin_regex.
     * 
    */
    public List<String> allowOriginRegexes() {
        return this.allowOriginRegexes == null ? List.of() : this.allowOriginRegexes;
    }
    /**
     * Specifies the list of origins that will be allowed to do CORS requests. An
     * origin is allowed if it matches either allow_origins or allow_origin_regex.
     * 
    */
    public List<String> allowOrigins() {
        return this.allowOrigins == null ? List.of() : this.allowOrigins;
    }
    /**
     * If true, specifies the CORS policy is disabled.
     * 
    */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
    */
    public List<String> exposeHeaders() {
        return this.exposeHeaders == null ? List.of() : this.exposeHeaders;
    }
    /**
     * Specifies how long the results of a preflight request can be cached. This
     * translates to the content for the Access-Control-Max-Age header.
     * 
    */
    public Optional<Integer> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> allowHeaders;
        private @Nullable List<String> allowMethods;
        private @Nullable List<String> allowOriginRegexes;
        private @Nullable List<String> allowOrigins;
        private @Nullable Boolean disabled;
        private @Nullable List<String> exposeHeaders;
        private @Nullable Integer maxAge;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.allowHeaders = defaults.allowHeaders;
    	      this.allowMethods = defaults.allowMethods;
    	      this.allowOriginRegexes = defaults.allowOriginRegexes;
    	      this.allowOrigins = defaults.allowOrigins;
    	      this.disabled = defaults.disabled;
    	      this.exposeHeaders = defaults.exposeHeaders;
    	      this.maxAge = defaults.maxAge;
        }

        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public Builder allowHeaders(@Nullable List<String> allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }
        public Builder allowMethods(@Nullable List<String> allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }
        public Builder allowOriginRegexes(@Nullable List<String> allowOriginRegexes) {
            this.allowOriginRegexes = allowOriginRegexes;
            return this;
        }
        public Builder allowOriginRegexes(String... allowOriginRegexes) {
            return allowOriginRegexes(List.of(allowOriginRegexes));
        }
        public Builder allowOrigins(@Nullable List<String> allowOrigins) {
            this.allowOrigins = allowOrigins;
            return this;
        }
        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder exposeHeaders(@Nullable List<String> exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }
        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicy(allowCredentials, allowHeaders, allowMethods, allowOriginRegexes, allowOrigins, disabled, exposeHeaders, maxAge);
        }
    }
}
