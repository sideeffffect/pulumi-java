// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionBackendServiceCircuitBreakersConnectTimeoutArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceCircuitBreakersArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceCircuitBreakersArgs Empty = new RegionBackendServiceCircuitBreakersArgs();

    /**
     * The timeout for new network connections to hosts.
     * Structure is documented below.
     * 
     */
    @Import(name="connectTimeout")
      private final @Nullable Output<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout;

    public Output<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout() {
        return this.connectTimeout == null ? Codegen.empty() : this.connectTimeout;
    }

    /**
     * The maximum number of connections to the backend cluster.
     * Defaults to 1024.
     * 
     */
    @Import(name="maxConnections")
      private final @Nullable Output<Integer> maxConnections;

    public Output<Integer> maxConnections() {
        return this.maxConnections == null ? Codegen.empty() : this.maxConnections;
    }

    /**
     * The maximum number of pending requests to the backend cluster.
     * Defaults to 1024.
     * 
     */
    @Import(name="maxPendingRequests")
      private final @Nullable Output<Integer> maxPendingRequests;

    public Output<Integer> maxPendingRequests() {
        return this.maxPendingRequests == null ? Codegen.empty() : this.maxPendingRequests;
    }

    /**
     * The maximum number of parallel requests to the backend cluster.
     * Defaults to 1024.
     * 
     */
    @Import(name="maxRequests")
      private final @Nullable Output<Integer> maxRequests;

    public Output<Integer> maxRequests() {
        return this.maxRequests == null ? Codegen.empty() : this.maxRequests;
    }

    /**
     * Maximum requests for a single backend connection. This parameter
     * is respected by both the HTTP/1.1 and HTTP/2 implementations. If
     * not specified, there is no limit. Setting this parameter to 1
     * will effectively disable keep alive.
     * 
     */
    @Import(name="maxRequestsPerConnection")
      private final @Nullable Output<Integer> maxRequestsPerConnection;

    public Output<Integer> maxRequestsPerConnection() {
        return this.maxRequestsPerConnection == null ? Codegen.empty() : this.maxRequestsPerConnection;
    }

    /**
     * The maximum number of parallel retries to the backend cluster.
     * Defaults to 3.
     * 
     */
    @Import(name="maxRetries")
      private final @Nullable Output<Integer> maxRetries;

    public Output<Integer> maxRetries() {
        return this.maxRetries == null ? Codegen.empty() : this.maxRetries;
    }

    public RegionBackendServiceCircuitBreakersArgs(
        @Nullable Output<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout,
        @Nullable Output<Integer> maxConnections,
        @Nullable Output<Integer> maxPendingRequests,
        @Nullable Output<Integer> maxRequests,
        @Nullable Output<Integer> maxRequestsPerConnection,
        @Nullable Output<Integer> maxRetries) {
        this.connectTimeout = connectTimeout;
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
        this.maxRequests = maxRequests;
        this.maxRequestsPerConnection = maxRequestsPerConnection;
        this.maxRetries = maxRetries;
    }

    private RegionBackendServiceCircuitBreakersArgs() {
        this.connectTimeout = Codegen.empty();
        this.maxConnections = Codegen.empty();
        this.maxPendingRequests = Codegen.empty();
        this.maxRequests = Codegen.empty();
        this.maxRequestsPerConnection = Codegen.empty();
        this.maxRetries = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceCircuitBreakersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout;
        private @Nullable Output<Integer> maxConnections;
        private @Nullable Output<Integer> maxPendingRequests;
        private @Nullable Output<Integer> maxRequests;
        private @Nullable Output<Integer> maxRequestsPerConnection;
        private @Nullable Output<Integer> maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceCircuitBreakersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder connectTimeout(@Nullable Output<RegionBackendServiceCircuitBreakersConnectTimeoutArgs> connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Builder connectTimeout(@Nullable RegionBackendServiceCircuitBreakersConnectTimeoutArgs connectTimeout) {
            this.connectTimeout = Codegen.ofNullable(connectTimeout);
            return this;
        }
        public Builder maxConnections(@Nullable Output<Integer> maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Builder maxConnections(@Nullable Integer maxConnections) {
            this.maxConnections = Codegen.ofNullable(maxConnections);
            return this;
        }
        public Builder maxPendingRequests(@Nullable Output<Integer> maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }
        public Builder maxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = Codegen.ofNullable(maxPendingRequests);
            return this;
        }
        public Builder maxRequests(@Nullable Output<Integer> maxRequests) {
            this.maxRequests = maxRequests;
            return this;
        }
        public Builder maxRequests(@Nullable Integer maxRequests) {
            this.maxRequests = Codegen.ofNullable(maxRequests);
            return this;
        }
        public Builder maxRequestsPerConnection(@Nullable Output<Integer> maxRequestsPerConnection) {
            this.maxRequestsPerConnection = maxRequestsPerConnection;
            return this;
        }
        public Builder maxRequestsPerConnection(@Nullable Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Codegen.ofNullable(maxRequestsPerConnection);
            return this;
        }
        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }
        public Builder maxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = Codegen.ofNullable(maxRetries);
            return this;
        }        public RegionBackendServiceCircuitBreakersArgs build() {
            return new RegionBackendServiceCircuitBreakersArgs(connectTimeout, maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
