// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a CORS rule for the Blob service.
 * 
 */
public final class CorsRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CorsRuleArgs Empty = new CorsRuleArgs();

    /**
     * Required if CorsRule element is present. A list of headers allowed to be part of the cross-origin request.
     * 
     */
    @InputImport(name="allowedHeaders", required=true)
      private final Input<List<String>> allowedHeaders;

    public Input<List<String>> getAllowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * Required if CorsRule element is present. A list of HTTP methods that are allowed to be executed by the origin.
     * 
     */
    @InputImport(name="allowedMethods", required=true)
      private final Input<List<String>> allowedMethods;

    public Input<List<String>> getAllowedMethods() {
        return this.allowedMethods;
    }

    /**
     * Required if CorsRule element is present. A list of origin domains that will be allowed via CORS, or "*" to allow all domains
     * 
     */
    @InputImport(name="allowedOrigins", required=true)
      private final Input<List<String>> allowedOrigins;

    public Input<List<String>> getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * Required if CorsRule element is present. A list of response headers to expose to CORS clients.
     * 
     */
    @InputImport(name="exposedHeaders", required=true)
      private final Input<List<String>> exposedHeaders;

    public Input<List<String>> getExposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * Required if CorsRule element is present. The number of seconds that the client/browser should cache a preflight response.
     * 
     */
    @InputImport(name="maxAgeInSeconds", required=true)
      private final Input<Integer> maxAgeInSeconds;

    public Input<Integer> getMaxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    public CorsRuleArgs(
        Input<List<String>> allowedHeaders,
        Input<List<String>> allowedMethods,
        Input<List<String>> allowedOrigins,
        Input<List<String>> exposedHeaders,
        Input<Integer> maxAgeInSeconds) {
        this.allowedHeaders = Objects.requireNonNull(allowedHeaders, "expected parameter 'allowedHeaders' to be non-null");
        this.allowedMethods = Objects.requireNonNull(allowedMethods, "expected parameter 'allowedMethods' to be non-null");
        this.allowedOrigins = Objects.requireNonNull(allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
        this.exposedHeaders = Objects.requireNonNull(exposedHeaders, "expected parameter 'exposedHeaders' to be non-null");
        this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds, "expected parameter 'maxAgeInSeconds' to be non-null");
    }

    private CorsRuleArgs() {
        this.allowedHeaders = Input.empty();
        this.allowedMethods = Input.empty();
        this.allowedOrigins = Input.empty();
        this.exposedHeaders = Input.empty();
        this.maxAgeInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CorsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> allowedHeaders;
        private Input<List<String>> allowedMethods;
        private Input<List<String>> allowedOrigins;
        private Input<List<String>> exposedHeaders;
        private Input<Integer> maxAgeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CorsRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedHeaders = defaults.allowedHeaders;
    	      this.allowedMethods = defaults.allowedMethods;
    	      this.allowedOrigins = defaults.allowedOrigins;
    	      this.exposedHeaders = defaults.exposedHeaders;
    	      this.maxAgeInSeconds = defaults.maxAgeInSeconds;
        }

        public Builder allowedHeaders(Input<List<String>> allowedHeaders) {
            this.allowedHeaders = Objects.requireNonNull(allowedHeaders);
            return this;
        }

        public Builder allowedHeaders(List<String> allowedHeaders) {
            this.allowedHeaders = Input.of(Objects.requireNonNull(allowedHeaders));
            return this;
        }

        public Builder allowedMethods(Input<List<String>> allowedMethods) {
            this.allowedMethods = Objects.requireNonNull(allowedMethods);
            return this;
        }

        public Builder allowedMethods(List<String> allowedMethods) {
            this.allowedMethods = Input.of(Objects.requireNonNull(allowedMethods));
            return this;
        }

        public Builder allowedOrigins(Input<List<String>> allowedOrigins) {
            this.allowedOrigins = Objects.requireNonNull(allowedOrigins);
            return this;
        }

        public Builder allowedOrigins(List<String> allowedOrigins) {
            this.allowedOrigins = Input.of(Objects.requireNonNull(allowedOrigins));
            return this;
        }

        public Builder exposedHeaders(Input<List<String>> exposedHeaders) {
            this.exposedHeaders = Objects.requireNonNull(exposedHeaders);
            return this;
        }

        public Builder exposedHeaders(List<String> exposedHeaders) {
            this.exposedHeaders = Input.of(Objects.requireNonNull(exposedHeaders));
            return this;
        }

        public Builder maxAgeInSeconds(Input<Integer> maxAgeInSeconds) {
            this.maxAgeInSeconds = Objects.requireNonNull(maxAgeInSeconds);
            return this;
        }

        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = Input.of(Objects.requireNonNull(maxAgeInSeconds));
            return this;
        }
        public CorsRuleArgs build() {
            return new CorsRuleArgs(allowedHeaders, allowedMethods, allowedOrigins, exposedHeaders, maxAgeInSeconds);
        }
    }
}
