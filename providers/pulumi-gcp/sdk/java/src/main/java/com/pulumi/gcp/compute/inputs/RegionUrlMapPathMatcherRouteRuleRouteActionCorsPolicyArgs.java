// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs();

    /**
     * In response to a preflight request, setting this to true indicates that the
     * actual request can include user credentials. This translates to the Access-
     * Control-Allow-Credentials header. Defaults to false.
     * 
     */
    @Import(name="allowCredentials")
    private @Nullable Output<Boolean> allowCredentials;

    public Optional<Output<Boolean>> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }

    /**
     * Specifies the content for the Access-Control-Allow-Headers header.
     * 
     */
    @Import(name="allowHeaders")
    private @Nullable Output<List<String>> allowHeaders;

    public Optional<Output<List<String>>> allowHeaders() {
        return Optional.ofNullable(this.allowHeaders);
    }

    /**
     * Specifies the content for the Access-Control-Allow-Methods header.
     * 
     */
    @Import(name="allowMethods")
    private @Nullable Output<List<String>> allowMethods;

    public Optional<Output<List<String>>> allowMethods() {
        return Optional.ofNullable(this.allowMethods);
    }

    /**
     * Specifies the regular expression patterns that match allowed origins. For
     * regular expression grammar please see en.cppreference.com/w/cpp/regex/ecmascript
     * An origin is allowed if it matches either allow_origins or allow_origin_regex.
     * 
     */
    @Import(name="allowOriginRegexes")
    private @Nullable Output<List<String>> allowOriginRegexes;

    public Optional<Output<List<String>>> allowOriginRegexes() {
        return Optional.ofNullable(this.allowOriginRegexes);
    }

    /**
     * Specifies the list of origins that will be allowed to do CORS requests. An
     * origin is allowed if it matches either allow_origins or allow_origin_regex.
     * 
     */
    @Import(name="allowOrigins")
    private @Nullable Output<List<String>> allowOrigins;

    public Optional<Output<List<String>>> allowOrigins() {
        return Optional.ofNullable(this.allowOrigins);
    }

    /**
     * If true, specifies the CORS policy is disabled.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Specifies the content for the Access-Control-Expose-Headers header.
     * 
     */
    @Import(name="exposeHeaders")
    private @Nullable Output<List<String>> exposeHeaders;

    public Optional<Output<List<String>>> exposeHeaders() {
        return Optional.ofNullable(this.exposeHeaders);
    }

    /**
     * Specifies how long the results of a preflight request can be cached. This
     * translates to the content for the Access-Control-Max-Age header.
     * 
     */
    @Import(name="maxAge")
    private @Nullable Output<Integer> maxAge;

    public Optional<Output<Integer>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs() {}

    private RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs(RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs $) {
        this.allowCredentials = $.allowCredentials;
        this.allowHeaders = $.allowHeaders;
        this.allowMethods = $.allowMethods;
        this.allowOriginRegexes = $.allowOriginRegexes;
        this.allowOrigins = $.allowOrigins;
        this.disabled = $.disabled;
        this.exposeHeaders = $.exposeHeaders;
        this.maxAge = $.maxAge;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            $.allowCredentials = allowCredentials;
            return this;
        }

        public Builder allowCredentials(Boolean allowCredentials) {
            return allowCredentials(Output.of(allowCredentials));
        }

        public Builder allowHeaders(@Nullable Output<List<String>> allowHeaders) {
            $.allowHeaders = allowHeaders;
            return this;
        }

        public Builder allowHeaders(List<String> allowHeaders) {
            return allowHeaders(Output.of(allowHeaders));
        }

        public Builder allowHeaders(String... allowHeaders) {
            return allowHeaders(List.of(allowHeaders));
        }

        public Builder allowMethods(@Nullable Output<List<String>> allowMethods) {
            $.allowMethods = allowMethods;
            return this;
        }

        public Builder allowMethods(List<String> allowMethods) {
            return allowMethods(Output.of(allowMethods));
        }

        public Builder allowMethods(String... allowMethods) {
            return allowMethods(List.of(allowMethods));
        }

        public Builder allowOriginRegexes(@Nullable Output<List<String>> allowOriginRegexes) {
            $.allowOriginRegexes = allowOriginRegexes;
            return this;
        }

        public Builder allowOriginRegexes(List<String> allowOriginRegexes) {
            return allowOriginRegexes(Output.of(allowOriginRegexes));
        }

        public Builder allowOriginRegexes(String... allowOriginRegexes) {
            return allowOriginRegexes(List.of(allowOriginRegexes));
        }

        public Builder allowOrigins(@Nullable Output<List<String>> allowOrigins) {
            $.allowOrigins = allowOrigins;
            return this;
        }

        public Builder allowOrigins(List<String> allowOrigins) {
            return allowOrigins(Output.of(allowOrigins));
        }

        public Builder allowOrigins(String... allowOrigins) {
            return allowOrigins(List.of(allowOrigins));
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        public Builder exposeHeaders(@Nullable Output<List<String>> exposeHeaders) {
            $.exposeHeaders = exposeHeaders;
            return this;
        }

        public Builder exposeHeaders(List<String> exposeHeaders) {
            return exposeHeaders(Output.of(exposeHeaders));
        }

        public Builder exposeHeaders(String... exposeHeaders) {
            return exposeHeaders(List.of(exposeHeaders));
        }

        public Builder maxAge(@Nullable Output<Integer> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        public Builder maxAge(Integer maxAge) {
            return maxAge(Output.of(maxAge));
        }

        public RegionUrlMapPathMatcherRouteRuleRouteActionCorsPolicyArgs build() {
            return $;
        }
    }

}
