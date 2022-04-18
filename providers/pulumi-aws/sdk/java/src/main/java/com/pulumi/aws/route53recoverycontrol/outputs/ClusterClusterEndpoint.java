// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53recoverycontrol.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterEndpoint {
    /**
     * Cluster endpoint.
     * 
     */
    private final @Nullable String endpoint;
    /**
     * Region of the endpoint.
     * 
     */
    private final @Nullable String region;

    @CustomType.Constructor
    private ClusterClusterEndpoint(
        @CustomType.Parameter("endpoint") @Nullable String endpoint,
        @CustomType.Parameter("region") @Nullable String region) {
        this.endpoint = endpoint;
        this.region = region;
    }

    /**
     * Cluster endpoint.
     * 
    */
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * Region of the endpoint.
     * 
    */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;
        private @Nullable String region;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.region = defaults.region;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }        public ClusterClusterEndpoint build() {
            return new ClusterClusterEndpoint(endpoint, region);
        }
    }
}
