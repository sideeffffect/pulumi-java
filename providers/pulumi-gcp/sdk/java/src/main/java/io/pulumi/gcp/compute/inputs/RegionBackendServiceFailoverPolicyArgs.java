// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceFailoverPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceFailoverPolicyArgs Empty = new RegionBackendServiceFailoverPolicyArgs();

    /**
     * On failover or failback, this field indicates whether connection drain
     * will be honored. Setting this to true has the following effect: connections
     * to the old active pool are not drained. Connections to the new active pool
     * use the timeout of 10 min (currently fixed). Setting to false has the
     * following effect: both old and new connections will have a drain timeout
     * of 10 min.
     * This can be set to true only if the protocol is TCP.
     * The default is false.
     * 
     */
    @InputImport(name="disableConnectionDrainOnFailover")
      private final @Nullable Input<Boolean> disableConnectionDrainOnFailover;

    public Input<Boolean> getDisableConnectionDrainOnFailover() {
        return this.disableConnectionDrainOnFailover == null ? Input.empty() : this.disableConnectionDrainOnFailover;
    }

    /**
     * This option is used only when no healthy VMs are detected in the primary
     * and backup instance groups. When set to true, traffic is dropped. When
     * set to false, new connections are sent across all VMs in the primary group.
     * The default is false.
     * 
     */
    @InputImport(name="dropTrafficIfUnhealthy")
      private final @Nullable Input<Boolean> dropTrafficIfUnhealthy;

    public Input<Boolean> getDropTrafficIfUnhealthy() {
        return this.dropTrafficIfUnhealthy == null ? Input.empty() : this.dropTrafficIfUnhealthy;
    }

    /**
     * The value of the field must be in [0, 1]. If the ratio of the healthy
     * VMs in the primary backend is at or below this number, traffic arriving
     * at the load-balanced IP will be directed to the failover backend.
     * In case where 'failoverRatio' is not set or all the VMs in the backup
     * backend are unhealthy, the traffic will be directed back to the primary
     * backend in the "force" mode, where traffic will be spread to the healthy
     * VMs with the best effort, or to all VMs when no VM is healthy.
     * This field is only used with l4 load balancing.
     * 
     */
    @InputImport(name="failoverRatio")
      private final @Nullable Input<Double> failoverRatio;

    public Input<Double> getFailoverRatio() {
        return this.failoverRatio == null ? Input.empty() : this.failoverRatio;
    }

    public RegionBackendServiceFailoverPolicyArgs(
        @Nullable Input<Boolean> disableConnectionDrainOnFailover,
        @Nullable Input<Boolean> dropTrafficIfUnhealthy,
        @Nullable Input<Double> failoverRatio) {
        this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
        this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
        this.failoverRatio = failoverRatio;
    }

    private RegionBackendServiceFailoverPolicyArgs() {
        this.disableConnectionDrainOnFailover = Input.empty();
        this.dropTrafficIfUnhealthy = Input.empty();
        this.failoverRatio = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceFailoverPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableConnectionDrainOnFailover;
        private @Nullable Input<Boolean> dropTrafficIfUnhealthy;
        private @Nullable Input<Double> failoverRatio;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceFailoverPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableConnectionDrainOnFailover = defaults.disableConnectionDrainOnFailover;
    	      this.dropTrafficIfUnhealthy = defaults.dropTrafficIfUnhealthy;
    	      this.failoverRatio = defaults.failoverRatio;
        }

        public Builder disableConnectionDrainOnFailover(@Nullable Input<Boolean> disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = disableConnectionDrainOnFailover;
            return this;
        }

        public Builder disableConnectionDrainOnFailover(@Nullable Boolean disableConnectionDrainOnFailover) {
            this.disableConnectionDrainOnFailover = Input.ofNullable(disableConnectionDrainOnFailover);
            return this;
        }

        public Builder dropTrafficIfUnhealthy(@Nullable Input<Boolean> dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = dropTrafficIfUnhealthy;
            return this;
        }

        public Builder dropTrafficIfUnhealthy(@Nullable Boolean dropTrafficIfUnhealthy) {
            this.dropTrafficIfUnhealthy = Input.ofNullable(dropTrafficIfUnhealthy);
            return this;
        }

        public Builder failoverRatio(@Nullable Input<Double> failoverRatio) {
            this.failoverRatio = failoverRatio;
            return this;
        }

        public Builder failoverRatio(@Nullable Double failoverRatio) {
            this.failoverRatio = Input.ofNullable(failoverRatio);
            return this;
        }
        public RegionBackendServiceFailoverPolicyArgs build() {
            return new RegionBackendServiceFailoverPolicyArgs(disableConnectionDrainOnFailover, dropTrafficIfUnhealthy, failoverRatio);
        }
    }
}
