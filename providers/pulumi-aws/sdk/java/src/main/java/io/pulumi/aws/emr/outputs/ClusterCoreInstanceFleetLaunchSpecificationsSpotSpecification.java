// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification {
    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
     */
    private final String allocationStrategy;
    /**
     * Defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * 
     */
    private final @Nullable Integer blockDurationMinutes;
    /**
     * Action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * 
     */
    private final String timeoutAction;
    /**
     * Spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
     * 
     */
    private final Integer timeoutDurationMinutes;

    @OutputCustomType.Constructor({"allocationStrategy","blockDurationMinutes","timeoutAction","timeoutDurationMinutes"})
    private ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification(
        String allocationStrategy,
        @Nullable Integer blockDurationMinutes,
        String timeoutAction,
        Integer timeoutDurationMinutes) {
        this.allocationStrategy = allocationStrategy;
        this.blockDurationMinutes = blockDurationMinutes;
        this.timeoutAction = timeoutAction;
        this.timeoutDurationMinutes = timeoutDurationMinutes;
    }

    /**
     * Specifies the strategy to use in launching Spot instance fleets. Currently, the only option is `capacity-optimized` (the default), which launches instances from Spot instance pools with optimal capacity for the number of instances that are launching.
     * 
    */
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }
    /**
     * Defined duration for Spot instances (also known as Spot blocks) in minutes. When specified, the Spot instance does not terminate before the defined duration expires, and defined duration pricing for Spot instances applies. Valid values are 60, 120, 180, 240, 300, or 360. The duration period starts as soon as a Spot instance receives its instance ID. At the end of the duration, Amazon EC2 marks the Spot instance for termination and provides a Spot instance termination notice, which gives the instance a two-minute warning before it terminates.
     * 
    */
    public Optional<Integer> getBlockDurationMinutes() {
        return Optional.ofNullable(this.blockDurationMinutes);
    }
    /**
     * Action to take when TargetSpotCapacity has not been fulfilled when the TimeoutDurationMinutes has expired; that is, when all Spot instances could not be provisioned within the Spot provisioning timeout. Valid values are `TERMINATE_CLUSTER` and `SWITCH_TO_ON_DEMAND`. SWITCH_TO_ON_DEMAND specifies that if no Spot instances are available, On-Demand Instances should be provisioned to fulfill any remaining Spot capacity.
     * 
    */
    public String getTimeoutAction() {
        return this.timeoutAction;
    }
    /**
     * Spot provisioning timeout period in minutes. If Spot instances are not provisioned within this time period, the TimeOutAction is taken. Minimum value is 5 and maximum value is 1440. The timeout applies only during initial provisioning, when the cluster is first created.
     * 
    */
    public Integer getTimeoutDurationMinutes() {
        return this.timeoutDurationMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationStrategy;
        private @Nullable Integer blockDurationMinutes;
        private String timeoutAction;
        private Integer timeoutDurationMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.blockDurationMinutes = defaults.blockDurationMinutes;
    	      this.timeoutAction = defaults.timeoutAction;
    	      this.timeoutDurationMinutes = defaults.timeoutDurationMinutes;
        }

        public Builder setAllocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }

        public Builder setBlockDurationMinutes(@Nullable Integer blockDurationMinutes) {
            this.blockDurationMinutes = blockDurationMinutes;
            return this;
        }

        public Builder setTimeoutAction(String timeoutAction) {
            this.timeoutAction = Objects.requireNonNull(timeoutAction);
            return this;
        }

        public Builder setTimeoutDurationMinutes(Integer timeoutDurationMinutes) {
            this.timeoutDurationMinutes = Objects.requireNonNull(timeoutDurationMinutes);
            return this;
        }
        public ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification build() {
            return new ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification(allocationStrategy, blockDurationMinutes, timeoutAction, timeoutDurationMinutes);
        }
    }
}
