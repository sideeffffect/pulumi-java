// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Batch endpoint configuration.
 * 
 */
public final class BatchEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final BatchEndpointResponse Empty = new BatchEndpointResponse();

    /**
     * Enum to determine endpoint authentication mode.
     * 
     */
    @InputImport(name="authMode")
      private final @Nullable String authMode;

    public Optional<String> getAuthMode() {
        return this.authMode == null ? Optional.empty() : Optional.ofNullable(this.authMode);
    }

    /**
     * Description of the inference endpoint.
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * Endpoint URI.
     * 
     */
    @InputImport(name="scoringUri", required=true)
      private final String scoringUri;

    public String getScoringUri() {
        return this.scoringUri;
    }

    /**
     * Endpoint Swagger URI.
     * 
     */
    @InputImport(name="swaggerUri", required=true)
      private final String swaggerUri;

    public String getSwaggerUri() {
        return this.swaggerUri;
    }

    /**
     * Traffic rules on how the traffic will be routed across deployments.
     * 
     */
    @InputImport(name="traffic")
      private final @Nullable Map<String,Integer> traffic;

    public Map<String,Integer> getTraffic() {
        return this.traffic == null ? Map.of() : this.traffic;
    }

    public BatchEndpointResponse(
        @Nullable String authMode,
        @Nullable String description,
        @Nullable Map<String,String> properties,
        String scoringUri,
        String swaggerUri,
        @Nullable Map<String,Integer> traffic) {
        this.authMode = authMode;
        this.description = description;
        this.properties = properties;
        this.scoringUri = Objects.requireNonNull(scoringUri, "expected parameter 'scoringUri' to be non-null");
        this.swaggerUri = Objects.requireNonNull(swaggerUri, "expected parameter 'swaggerUri' to be non-null");
        this.traffic = traffic;
    }

    private BatchEndpointResponse() {
        this.authMode = null;
        this.description = null;
        this.properties = Map.of();
        this.scoringUri = null;
        this.swaggerUri = null;
        this.traffic = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BatchEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authMode;
        private @Nullable String description;
        private @Nullable Map<String,String> properties;
        private String scoringUri;
        private String swaggerUri;
        private @Nullable Map<String,Integer> traffic;

        public Builder() {
    	      // Empty
        }

        public Builder(BatchEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authMode = defaults.authMode;
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.scoringUri = defaults.scoringUri;
    	      this.swaggerUri = defaults.swaggerUri;
    	      this.traffic = defaults.traffic;
        }

        public Builder authMode(@Nullable String authMode) {
            this.authMode = authMode;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder scoringUri(String scoringUri) {
            this.scoringUri = Objects.requireNonNull(scoringUri);
            return this;
        }

        public Builder swaggerUri(String swaggerUri) {
            this.swaggerUri = Objects.requireNonNull(swaggerUri);
            return this;
        }

        public Builder traffic(@Nullable Map<String,Integer> traffic) {
            this.traffic = traffic;
            return this;
        }
        public BatchEndpointResponse build() {
            return new BatchEndpointResponse(authMode, description, properties, scoringUri, swaggerUri, traffic);
        }
    }
}
