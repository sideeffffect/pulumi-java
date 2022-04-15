// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceBackendArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceBackendArgs Empty = new RegionBackendServiceBackendArgs();

    /**
     * Specifies the balancing mode for this backend.
     * Default value is `CONNECTION`.
     * Possible values are `UTILIZATION`, `RATE`, and `CONNECTION`.
     * 
     */
    @Import(name="balancingMode")
      private final @Nullable Output<String> balancingMode;

    public Output<String> balancingMode() {
        return this.balancingMode == null ? Codegen.empty() : this.balancingMode;
    }

    /**
     * A multiplier applied to the group's maximum servicing capacity
     * (based on UTILIZATION, RATE or CONNECTION).
     * ~>**NOTE**: This field cannot be set for
     * INTERNAL region backend services (default loadBalancingScheme),
     * but is required for non-INTERNAL backend service. The total
     * capacity_scaler for all backends must be non-zero.
     * A setting of 0 means the group is completely drained, offering
     * 0% of its available Capacity. Valid range is [0.0,1.0].
     * 
     */
    @Import(name="capacityScaler")
      private final @Nullable Output<Double> capacityScaler;

    public Output<Double> capacityScaler() {
        return this.capacityScaler == null ? Codegen.empty() : this.capacityScaler;
    }

    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * This field designates whether this is a failover backend. More
     * than one failover backend can be configured for a given RegionBackendService.
     * 
     */
    @Import(name="failover")
      private final @Nullable Output<Boolean> failover;

    public Output<Boolean> failover() {
        return this.failover == null ? Codegen.empty() : this.failover;
    }

    /**
     * The fully-qualified URL of an Instance Group or Network Endpoint
     * Group resource. In case of instance group this defines the list
     * of instances that serve traffic. Member virtual machine
     * instances from each instance group must live in the same zone as
     * the instance group itself. No two backends in a backend service
     * are allowed to use same Instance Group resource.
     * For Network Endpoint Groups this defines list of endpoints. All
     * endpoints of Network Endpoint Group must be hosted on instances
     * located in the same zone as the Network Endpoint Group.
     * Backend services cannot mix Instance Group and
     * Network Endpoint Group backends.
     * When the `load_balancing_scheme` is INTERNAL, only instance groups
     * are supported.
     * Note that you must specify an Instance Group or Network Endpoint
     * Group resource using the fully-qualified URL, rather than a
     * partial URL.
     * 
     */
    @Import(name="group", required=true)
      private final Output<String> group;

    public Output<String> group() {
        return this.group;
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
     * The max number of simultaneous connections that a single backend
     * network endpoint can handle. Cannot be set
     * for INTERNAL backend services.
     * This is used to calculate the capacity of the group. Can be
     * used in either CONNECTION or UTILIZATION balancing modes. For
     * CONNECTION mode, either maxConnections or
     * maxConnectionsPerEndpoint must be set.
     * 
     */
    @Import(name="maxConnectionsPerEndpoint")
      private final @Nullable Output<Integer> maxConnectionsPerEndpoint;

    public Output<Integer> maxConnectionsPerEndpoint() {
        return this.maxConnectionsPerEndpoint == null ? Codegen.empty() : this.maxConnectionsPerEndpoint;
    }

    /**
     * The max number of simultaneous connections that a single
     * backend instance can handle. Cannot be set for INTERNAL backend
     * services.
     * This is used to calculate the capacity of the group.
     * Can be used in either CONNECTION or UTILIZATION balancing modes.
     * For CONNECTION mode, either maxConnections or
     * maxConnectionsPerInstance must be set.
     * 
     */
    @Import(name="maxConnectionsPerInstance")
      private final @Nullable Output<Integer> maxConnectionsPerInstance;

    public Output<Integer> maxConnectionsPerInstance() {
        return this.maxConnectionsPerInstance == null ? Codegen.empty() : this.maxConnectionsPerInstance;
    }

    /**
     * The max requests per second (RPS) of the group. Cannot be set
     * for INTERNAL backend services.
     * Can be used with either RATE or UTILIZATION balancing modes,
     * but required if RATE mode. Either maxRate or one
     * of maxRatePerInstance or maxRatePerEndpoint, as appropriate for
     * group type, must be set.
     * 
     */
    @Import(name="maxRate")
      private final @Nullable Output<Integer> maxRate;

    public Output<Integer> maxRate() {
        return this.maxRate == null ? Codegen.empty() : this.maxRate;
    }

    /**
     * The max requests per second (RPS) that a single backend network
     * endpoint can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerEndpoint must be set. Cannot be set
     * for INTERNAL backend services.
     * 
     */
    @Import(name="maxRatePerEndpoint")
      private final @Nullable Output<Double> maxRatePerEndpoint;

    public Output<Double> maxRatePerEndpoint() {
        return this.maxRatePerEndpoint == null ? Codegen.empty() : this.maxRatePerEndpoint;
    }

    /**
     * The max requests per second (RPS) that a single backend
     * instance can handle. This is used to calculate the capacity of
     * the group. Can be used in either balancing mode. For RATE mode,
     * either maxRate or maxRatePerInstance must be set. Cannot be set
     * for INTERNAL backend services.
     * 
     */
    @Import(name="maxRatePerInstance")
      private final @Nullable Output<Double> maxRatePerInstance;

    public Output<Double> maxRatePerInstance() {
        return this.maxRatePerInstance == null ? Codegen.empty() : this.maxRatePerInstance;
    }

    /**
     * Used when balancingMode is UTILIZATION. This ratio defines the
     * CPU utilization target for the group. Valid range is [0.0, 1.0].
     * Cannot be set for INTERNAL backend services.
     * 
     */
    @Import(name="maxUtilization")
      private final @Nullable Output<Double> maxUtilization;

    public Output<Double> maxUtilization() {
        return this.maxUtilization == null ? Codegen.empty() : this.maxUtilization;
    }

    public RegionBackendServiceBackendArgs(
        @Nullable Output<String> balancingMode,
        @Nullable Output<Double> capacityScaler,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> failover,
        Output<String> group,
        @Nullable Output<Integer> maxConnections,
        @Nullable Output<Integer> maxConnectionsPerEndpoint,
        @Nullable Output<Integer> maxConnectionsPerInstance,
        @Nullable Output<Integer> maxRate,
        @Nullable Output<Double> maxRatePerEndpoint,
        @Nullable Output<Double> maxRatePerInstance,
        @Nullable Output<Double> maxUtilization) {
        this.balancingMode = balancingMode;
        this.capacityScaler = capacityScaler;
        this.description = description;
        this.failover = failover;
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.maxConnections = maxConnections;
        this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
        this.maxConnectionsPerInstance = maxConnectionsPerInstance;
        this.maxRate = maxRate;
        this.maxRatePerEndpoint = maxRatePerEndpoint;
        this.maxRatePerInstance = maxRatePerInstance;
        this.maxUtilization = maxUtilization;
    }

    private RegionBackendServiceBackendArgs() {
        this.balancingMode = Codegen.empty();
        this.capacityScaler = Codegen.empty();
        this.description = Codegen.empty();
        this.failover = Codegen.empty();
        this.group = Codegen.empty();
        this.maxConnections = Codegen.empty();
        this.maxConnectionsPerEndpoint = Codegen.empty();
        this.maxConnectionsPerInstance = Codegen.empty();
        this.maxRate = Codegen.empty();
        this.maxRatePerEndpoint = Codegen.empty();
        this.maxRatePerInstance = Codegen.empty();
        this.maxUtilization = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceBackendArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> balancingMode;
        private @Nullable Output<Double> capacityScaler;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> failover;
        private Output<String> group;
        private @Nullable Output<Integer> maxConnections;
        private @Nullable Output<Integer> maxConnectionsPerEndpoint;
        private @Nullable Output<Integer> maxConnectionsPerInstance;
        private @Nullable Output<Integer> maxRate;
        private @Nullable Output<Double> maxRatePerEndpoint;
        private @Nullable Output<Double> maxRatePerInstance;
        private @Nullable Output<Double> maxUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceBackendArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balancingMode = defaults.balancingMode;
    	      this.capacityScaler = defaults.capacityScaler;
    	      this.description = defaults.description;
    	      this.failover = defaults.failover;
    	      this.group = defaults.group;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxConnectionsPerEndpoint = defaults.maxConnectionsPerEndpoint;
    	      this.maxConnectionsPerInstance = defaults.maxConnectionsPerInstance;
    	      this.maxRate = defaults.maxRate;
    	      this.maxRatePerEndpoint = defaults.maxRatePerEndpoint;
    	      this.maxRatePerInstance = defaults.maxRatePerInstance;
    	      this.maxUtilization = defaults.maxUtilization;
        }

        public Builder balancingMode(@Nullable Output<String> balancingMode) {
            this.balancingMode = balancingMode;
            return this;
        }
        public Builder balancingMode(@Nullable String balancingMode) {
            this.balancingMode = Codegen.ofNullable(balancingMode);
            return this;
        }
        public Builder capacityScaler(@Nullable Output<Double> capacityScaler) {
            this.capacityScaler = capacityScaler;
            return this;
        }
        public Builder capacityScaler(@Nullable Double capacityScaler) {
            this.capacityScaler = Codegen.ofNullable(capacityScaler);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder failover(@Nullable Output<Boolean> failover) {
            this.failover = failover;
            return this;
        }
        public Builder failover(@Nullable Boolean failover) {
            this.failover = Codegen.ofNullable(failover);
            return this;
        }
        public Builder group(Output<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder group(String group) {
            this.group = Output.of(Objects.requireNonNull(group));
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
        public Builder maxConnectionsPerEndpoint(@Nullable Output<Integer> maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = maxConnectionsPerEndpoint;
            return this;
        }
        public Builder maxConnectionsPerEndpoint(@Nullable Integer maxConnectionsPerEndpoint) {
            this.maxConnectionsPerEndpoint = Codegen.ofNullable(maxConnectionsPerEndpoint);
            return this;
        }
        public Builder maxConnectionsPerInstance(@Nullable Output<Integer> maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = maxConnectionsPerInstance;
            return this;
        }
        public Builder maxConnectionsPerInstance(@Nullable Integer maxConnectionsPerInstance) {
            this.maxConnectionsPerInstance = Codegen.ofNullable(maxConnectionsPerInstance);
            return this;
        }
        public Builder maxRate(@Nullable Output<Integer> maxRate) {
            this.maxRate = maxRate;
            return this;
        }
        public Builder maxRate(@Nullable Integer maxRate) {
            this.maxRate = Codegen.ofNullable(maxRate);
            return this;
        }
        public Builder maxRatePerEndpoint(@Nullable Output<Double> maxRatePerEndpoint) {
            this.maxRatePerEndpoint = maxRatePerEndpoint;
            return this;
        }
        public Builder maxRatePerEndpoint(@Nullable Double maxRatePerEndpoint) {
            this.maxRatePerEndpoint = Codegen.ofNullable(maxRatePerEndpoint);
            return this;
        }
        public Builder maxRatePerInstance(@Nullable Output<Double> maxRatePerInstance) {
            this.maxRatePerInstance = maxRatePerInstance;
            return this;
        }
        public Builder maxRatePerInstance(@Nullable Double maxRatePerInstance) {
            this.maxRatePerInstance = Codegen.ofNullable(maxRatePerInstance);
            return this;
        }
        public Builder maxUtilization(@Nullable Output<Double> maxUtilization) {
            this.maxUtilization = maxUtilization;
            return this;
        }
        public Builder maxUtilization(@Nullable Double maxUtilization) {
            this.maxUtilization = Codegen.ofNullable(maxUtilization);
            return this;
        }        public RegionBackendServiceBackendArgs build() {
            return new RegionBackendServiceBackendArgs(balancingMode, capacityScaler, description, failover, group, maxConnections, maxConnectionsPerEndpoint, maxConnectionsPerInstance, maxRate, maxRatePerEndpoint, maxRatePerInstance, maxUtilization);
        }
    }
}
