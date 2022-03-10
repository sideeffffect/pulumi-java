// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.inputs.DurationResponse;
import java.lang.Integer;
import java.util.Objects;


/**
 * Settings controlling the volume of requests, connections and retries to this backend service.
 * 
 */
public final class CircuitBreakersResponse extends io.pulumi.resources.InvokeArgs {

    public static final CircuitBreakersResponse Empty = new CircuitBreakersResponse();

    /**
     * The timeout for new network connections to hosts.
     * 
     */
    @InputImport(name="connectTimeout", required=true)
      private final DurationResponse connectTimeout;

    public DurationResponse getConnectTimeout() {
        return this.connectTimeout;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="maxConnections", required=true)
      private final Integer maxConnections;

    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="maxPendingRequests", required=true)
      private final Integer maxPendingRequests;

    public Integer getMaxPendingRequests() {
        return this.maxPendingRequests;
    }

    /**
     * The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit.
     * 
     */
    @InputImport(name="maxRequests", required=true)
      private final Integer maxRequests;

    public Integer getMaxRequests() {
        return this.maxRequests;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="maxRequestsPerConnection", required=true)
      private final Integer maxRequestsPerConnection;

    public Integer getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection;
    }

    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @InputImport(name="maxRetries", required=true)
      private final Integer maxRetries;

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public CircuitBreakersResponse(
        DurationResponse connectTimeout,
        Integer maxConnections,
        Integer maxPendingRequests,
        Integer maxRequests,
        Integer maxRequestsPerConnection,
        Integer maxRetries) {
        this.connectTimeout = Objects.requireNonNull(connectTimeout, "expected parameter 'connectTimeout' to be non-null");
        this.maxConnections = Objects.requireNonNull(maxConnections, "expected parameter 'maxConnections' to be non-null");
        this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests, "expected parameter 'maxPendingRequests' to be non-null");
        this.maxRequests = Objects.requireNonNull(maxRequests, "expected parameter 'maxRequests' to be non-null");
        this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection, "expected parameter 'maxRequestsPerConnection' to be non-null");
        this.maxRetries = Objects.requireNonNull(maxRetries, "expected parameter 'maxRetries' to be non-null");
    }

    private CircuitBreakersResponse() {
        this.connectTimeout = null;
        this.maxConnections = null;
        this.maxPendingRequests = null;
        this.maxRequests = null;
        this.maxRequestsPerConnection = null;
        this.maxRetries = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CircuitBreakersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DurationResponse connectTimeout;
        private Integer maxConnections;
        private Integer maxPendingRequests;
        private Integer maxRequests;
        private Integer maxRequestsPerConnection;
        private Integer maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(CircuitBreakersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder connectTimeout(DurationResponse connectTimeout) {
            this.connectTimeout = Objects.requireNonNull(connectTimeout);
            return this;
        }

        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder maxPendingRequests(Integer maxPendingRequests) {
            this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests);
            return this;
        }

        public Builder maxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }

        public Builder maxRequestsPerConnection(Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection);
            return this;
        }

        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        public CircuitBreakersResponse build() {
            return new CircuitBreakersResponse(connectTimeout, maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
