// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceCorsConfigurationInfoResponse {
    /**
     * If credentials are allowed via CORS.
     * 
     */
    private final @Nullable Boolean allowCredentials;
    /**
     * The headers to be allowed via CORS.
     * 
     */
    private final @Nullable List<String> headers;
    /**
     * The max age to be allowed via CORS.
     * 
     */
    private final @Nullable Integer maxAge;
    /**
     * The methods to be allowed via CORS.
     * 
     */
    private final @Nullable List<String> methods;
    /**
     * The origins to be allowed via CORS.
     * 
     */
    private final @Nullable List<String> origins;

    @OutputCustomType.Constructor
    private ServiceCorsConfigurationInfoResponse(
        @OutputCustomType.Parameter("allowCredentials") @Nullable Boolean allowCredentials,
        @OutputCustomType.Parameter("headers") @Nullable List<String> headers,
        @OutputCustomType.Parameter("maxAge") @Nullable Integer maxAge,
        @OutputCustomType.Parameter("methods") @Nullable List<String> methods,
        @OutputCustomType.Parameter("origins") @Nullable List<String> origins) {
        this.allowCredentials = allowCredentials;
        this.headers = headers;
        this.maxAge = maxAge;
        this.methods = methods;
        this.origins = origins;
    }

    /**
     * If credentials are allowed via CORS.
     * 
    */
    public Optional<Boolean> getAllowCredentials() {
        return Optional.ofNullable(this.allowCredentials);
    }
    /**
     * The headers to be allowed via CORS.
     * 
    */
    public List<String> getHeaders() {
        return this.headers == null ? List.of() : this.headers;
    }
    /**
     * The max age to be allowed via CORS.
     * 
    */
    public Optional<Integer> getMaxAge() {
        return Optional.ofNullable(this.maxAge);
    }
    /**
     * The methods to be allowed via CORS.
     * 
    */
    public List<String> getMethods() {
        return this.methods == null ? List.of() : this.methods;
    }
    /**
     * The origins to be allowed via CORS.
     * 
    */
    public List<String> getOrigins() {
        return this.origins == null ? List.of() : this.origins;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceCorsConfigurationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowCredentials;
        private @Nullable List<String> headers;
        private @Nullable Integer maxAge;
        private @Nullable List<String> methods;
        private @Nullable List<String> origins;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceCorsConfigurationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCredentials = defaults.allowCredentials;
    	      this.headers = defaults.headers;
    	      this.maxAge = defaults.maxAge;
    	      this.methods = defaults.methods;
    	      this.origins = defaults.origins;
        }

        public Builder allowCredentials(@Nullable Boolean allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }

        public Builder headers(@Nullable List<String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder maxAge(@Nullable Integer maxAge) {
            this.maxAge = maxAge;
            return this;
        }

        public Builder methods(@Nullable List<String> methods) {
            this.methods = methods;
            return this;
        }

        public Builder origins(@Nullable List<String> origins) {
            this.origins = origins;
            return this;
        }
        public ServiceCorsConfigurationInfoResponse build() {
            return new ServiceCorsConfigurationInfoResponse(allowCredentials, headers, maxAge, methods, origins);
        }
    }
}
