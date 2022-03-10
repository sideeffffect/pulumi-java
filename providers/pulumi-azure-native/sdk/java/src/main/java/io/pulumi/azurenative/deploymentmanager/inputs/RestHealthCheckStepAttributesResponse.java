// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestHealthCheckResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the REST health check step properties.
 * 
 */
public final class RestHealthCheckStepAttributesResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestHealthCheckStepAttributesResponse Empty = new RestHealthCheckStepAttributesResponse();

    /**
     * The list of checks that form the health check step.
     * 
     */
    @InputImport(name="healthChecks", required=true)
      private final List<RestHealthCheckResponse> healthChecks;

    public List<RestHealthCheckResponse> getHealthChecks() {
        return this.healthChecks;
    }

    /**
     * The duration in ISO 8601 format for which the resource is expected to be continuously healthy. If maxElasticDuration is specified, healthy state duration is enforced after the detection of first healthy signal.
     * 
     */
    @InputImport(name="healthyStateDuration", required=true)
      private final String healthyStateDuration;

    public String getHealthyStateDuration() {
        return this.healthyStateDuration;
    }

    /**
     * The duration in ISO 8601 format for which the health check waits for the resource to become healthy. Health check fails if it doesn't. Health check starts to enforce healthyStateDuration once resource becomes healthy.
     * 
     */
    @InputImport(name="maxElasticDuration")
      private final @Nullable String maxElasticDuration;

    public Optional<String> getMaxElasticDuration() {
        return this.maxElasticDuration == null ? Optional.empty() : Optional.ofNullable(this.maxElasticDuration);
    }

    /**
     * The type of health check.
     * Expected value is 'REST'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The duration in ISO 8601 format for which health check waits idly without any checks.
     * 
     */
    @InputImport(name="waitDuration")
      private final @Nullable String waitDuration;

    public Optional<String> getWaitDuration() {
        return this.waitDuration == null ? Optional.empty() : Optional.ofNullable(this.waitDuration);
    }

    public RestHealthCheckStepAttributesResponse(
        List<RestHealthCheckResponse> healthChecks,
        String healthyStateDuration,
        @Nullable String maxElasticDuration,
        String type,
        @Nullable String waitDuration) {
        this.healthChecks = Objects.requireNonNull(healthChecks, "expected parameter 'healthChecks' to be non-null");
        this.healthyStateDuration = Objects.requireNonNull(healthyStateDuration, "expected parameter 'healthyStateDuration' to be non-null");
        this.maxElasticDuration = maxElasticDuration;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.waitDuration = waitDuration;
    }

    private RestHealthCheckStepAttributesResponse() {
        this.healthChecks = List.of();
        this.healthyStateDuration = null;
        this.maxElasticDuration = null;
        this.type = null;
        this.waitDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestHealthCheckStepAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RestHealthCheckResponse> healthChecks;
        private String healthyStateDuration;
        private @Nullable String maxElasticDuration;
        private String type;
        private @Nullable String waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(RestHealthCheckStepAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthChecks = defaults.healthChecks;
    	      this.healthyStateDuration = defaults.healthyStateDuration;
    	      this.maxElasticDuration = defaults.maxElasticDuration;
    	      this.type = defaults.type;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder healthChecks(List<RestHealthCheckResponse> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }

        public Builder healthyStateDuration(String healthyStateDuration) {
            this.healthyStateDuration = Objects.requireNonNull(healthyStateDuration);
            return this;
        }

        public Builder maxElasticDuration(@Nullable String maxElasticDuration) {
            this.maxElasticDuration = maxElasticDuration;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder waitDuration(@Nullable String waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }
        public RestHealthCheckStepAttributesResponse build() {
            return new RestHealthCheckStepAttributesResponse(healthChecks, healthyStateDuration, maxElasticDuration, type, waitDuration);
        }
    }
}
