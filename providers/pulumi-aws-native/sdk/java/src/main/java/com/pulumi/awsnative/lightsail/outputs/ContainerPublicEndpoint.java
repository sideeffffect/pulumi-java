// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.outputs;

import com.pulumi.awsnative.lightsail.outputs.ContainerHealthCheckConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerPublicEndpoint {
    /**
     * The name of the container for the endpoint.
     * 
     */
    private final @Nullable String containerName;
    /**
     * The port of the container to which traffic is forwarded to.
     * 
     */
    private final @Nullable Integer containerPort;
    /**
     * An object that describes the health check configuration of the container.
     * 
     */
    private final @Nullable ContainerHealthCheckConfig healthCheckConfig;

    @CustomType.Constructor
    private ContainerPublicEndpoint(
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("containerPort") @Nullable Integer containerPort,
        @CustomType.Parameter("healthCheckConfig") @Nullable ContainerHealthCheckConfig healthCheckConfig) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.healthCheckConfig = healthCheckConfig;
    }

    /**
     * The name of the container for the endpoint.
     * 
    */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * The port of the container to which traffic is forwarded to.
     * 
    */
    public Optional<Integer> containerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    /**
     * An object that describes the health check configuration of the container.
     * 
    */
    public Optional<ContainerHealthCheckConfig> healthCheckConfig() {
        return Optional.ofNullable(this.healthCheckConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPublicEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private @Nullable Integer containerPort;
        private @Nullable ContainerHealthCheckConfig healthCheckConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPublicEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.healthCheckConfig = defaults.healthCheckConfig;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Builder healthCheckConfig(@Nullable ContainerHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }        public ContainerPublicEndpoint build() {
            return new ContainerPublicEndpoint(containerName, containerPort, healthCheckConfig);
        }
    }
}
