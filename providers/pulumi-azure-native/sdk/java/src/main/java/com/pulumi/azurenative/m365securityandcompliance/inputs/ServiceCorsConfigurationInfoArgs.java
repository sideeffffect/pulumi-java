// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.m365securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The settings for the CORS configuration of the service instance.
 * 
 */
public final class ServiceCorsConfigurationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceCorsConfigurationInfoArgs Empty = new ServiceCorsConfigurationInfoArgs();

    /**
     * If credentials are allowed via CORS.
     * 
     */
    @Import(name="allowCredentials")
    private @Nullable Output<Boolean> allowCredentials;

    public Optional<Output<Boolean>> allowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }

    /**
     * The headers to be allowed via CORS.
     * 
     */
    @Import(name="headers")
    private @Nullable Output<List<String>> headers;

    public Optional<Output<List<String>>> headers() {
        return Optional.ofNullable(this.headers);
    }

    /**
     * The max age to be allowed via CORS.
     * 
     */
    @Import(name="maxAge")
    private @Nullable Output<Double> maxAge;

    public Optional<Output<Double>> maxAge() {
        return Optional.ofNullable(this.maxAge);
    }

    /**
     * The methods to be allowed via CORS.
     * 
     */
    @Import(name="methods")
    private @Nullable Output<List<String>> methods;

    public Optional<Output<List<String>>> methods() {
        return Optional.ofNullable(this.methods);
    }

    /**
     * The origins to be allowed via CORS.
     * 
     */
    @Import(name="origins")
    private @Nullable Output<List<String>> origins;

    public Optional<Output<List<String>>> origins() {
        return Optional.ofNullable(this.origins);
    }

    private ServiceCorsConfigurationInfoArgs() {}

    private ServiceCorsConfigurationInfoArgs(ServiceCorsConfigurationInfoArgs $) {
        this.allowCredentials = $.allowCredentials;
        this.headers = $.headers;
        this.maxAge = $.maxAge;
        this.methods = $.methods;
        this.origins = $.origins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCorsConfigurationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCorsConfigurationInfoArgs $;

        public Builder() {
            $ = new ServiceCorsConfigurationInfoArgs();
        }

        public Builder(ServiceCorsConfigurationInfoArgs defaults) {
            $ = new ServiceCorsConfigurationInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowCredentials(@Nullable Output<Boolean> allowCredentials) {
            $.allowCredentials = allowCredentials;
            return this;
        }

        public Builder allowCredentials(Boolean allowCredentials) {
            return allowCredentials(Output.of(allowCredentials));
        }

        public Builder headers(@Nullable Output<List<String>> headers) {
            $.headers = headers;
            return this;
        }

        public Builder headers(List<String> headers) {
            return headers(Output.of(headers));
        }

        public Builder headers(String... headers) {
            return headers(List.of(headers));
        }

        public Builder maxAge(@Nullable Output<Double> maxAge) {
            $.maxAge = maxAge;
            return this;
        }

        public Builder maxAge(Double maxAge) {
            return maxAge(Output.of(maxAge));
        }

        public Builder methods(@Nullable Output<List<String>> methods) {
            $.methods = methods;
            return this;
        }

        public Builder methods(List<String> methods) {
            return methods(Output.of(methods));
        }

        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }

        public Builder origins(@Nullable Output<List<String>> origins) {
            $.origins = origins;
            return this;
        }

        public Builder origins(List<String> origins) {
            return origins(Output.of(origins));
        }

        public Builder origins(String... origins) {
            return origins(List.of(origins));
        }

        public ServiceCorsConfigurationInfoArgs build() {
            return $;
        }
    }

}
