// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.enums.EC2FleetSpotOptionsRequestAllocationStrategy;
import io.pulumi.awsnative.ec2.enums.EC2FleetSpotOptionsRequestInstanceInterruptionBehavior;
import io.pulumi.awsnative.ec2.outputs.EC2FleetMaintenanceStrategies;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EC2FleetSpotOptionsRequest {
    private final @Nullable EC2FleetSpotOptionsRequestAllocationStrategy allocationStrategy;
    private final @Nullable EC2FleetSpotOptionsRequestInstanceInterruptionBehavior instanceInterruptionBehavior;
    private final @Nullable Integer instancePoolsToUseCount;
    private final @Nullable EC2FleetMaintenanceStrategies maintenanceStrategies;
    private final @Nullable String maxTotalPrice;
    private final @Nullable Integer minTargetCapacity;
    private final @Nullable Boolean singleAvailabilityZone;
    private final @Nullable Boolean singleInstanceType;

    @OutputCustomType.Constructor
    private EC2FleetSpotOptionsRequest(
        @OutputCustomType.Parameter("allocationStrategy") @Nullable EC2FleetSpotOptionsRequestAllocationStrategy allocationStrategy,
        @OutputCustomType.Parameter("instanceInterruptionBehavior") @Nullable EC2FleetSpotOptionsRequestInstanceInterruptionBehavior instanceInterruptionBehavior,
        @OutputCustomType.Parameter("instancePoolsToUseCount") @Nullable Integer instancePoolsToUseCount,
        @OutputCustomType.Parameter("maintenanceStrategies") @Nullable EC2FleetMaintenanceStrategies maintenanceStrategies,
        @OutputCustomType.Parameter("maxTotalPrice") @Nullable String maxTotalPrice,
        @OutputCustomType.Parameter("minTargetCapacity") @Nullable Integer minTargetCapacity,
        @OutputCustomType.Parameter("singleAvailabilityZone") @Nullable Boolean singleAvailabilityZone,
        @OutputCustomType.Parameter("singleInstanceType") @Nullable Boolean singleInstanceType) {
        this.allocationStrategy = allocationStrategy;
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        this.maintenanceStrategies = maintenanceStrategies;
        this.maxTotalPrice = maxTotalPrice;
        this.minTargetCapacity = minTargetCapacity;
        this.singleAvailabilityZone = singleAvailabilityZone;
        this.singleInstanceType = singleInstanceType;
    }

    public Optional<EC2FleetSpotOptionsRequestAllocationStrategy> getAllocationStrategy() {
        return Optional.ofNullable(this.allocationStrategy);
    }
    public Optional<EC2FleetSpotOptionsRequestInstanceInterruptionBehavior> getInstanceInterruptionBehavior() {
        return Optional.ofNullable(this.instanceInterruptionBehavior);
    }
    public Optional<Integer> getInstancePoolsToUseCount() {
        return Optional.ofNullable(this.instancePoolsToUseCount);
    }
    public Optional<EC2FleetMaintenanceStrategies> getMaintenanceStrategies() {
        return Optional.ofNullable(this.maintenanceStrategies);
    }
    public Optional<String> getMaxTotalPrice() {
        return Optional.ofNullable(this.maxTotalPrice);
    }
    public Optional<Integer> getMinTargetCapacity() {
        return Optional.ofNullable(this.minTargetCapacity);
    }
    public Optional<Boolean> getSingleAvailabilityZone() {
        return Optional.ofNullable(this.singleAvailabilityZone);
    }
    public Optional<Boolean> getSingleInstanceType() {
        return Optional.ofNullable(this.singleInstanceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EC2FleetSpotOptionsRequest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EC2FleetSpotOptionsRequestAllocationStrategy allocationStrategy;
        private @Nullable EC2FleetSpotOptionsRequestInstanceInterruptionBehavior instanceInterruptionBehavior;
        private @Nullable Integer instancePoolsToUseCount;
        private @Nullable EC2FleetMaintenanceStrategies maintenanceStrategies;
        private @Nullable String maxTotalPrice;
        private @Nullable Integer minTargetCapacity;
        private @Nullable Boolean singleAvailabilityZone;
        private @Nullable Boolean singleInstanceType;

        public Builder() {
    	      // Empty
        }

        public Builder(EC2FleetSpotOptionsRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.instanceInterruptionBehavior = defaults.instanceInterruptionBehavior;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
    	      this.maintenanceStrategies = defaults.maintenanceStrategies;
    	      this.maxTotalPrice = defaults.maxTotalPrice;
    	      this.minTargetCapacity = defaults.minTargetCapacity;
    	      this.singleAvailabilityZone = defaults.singleAvailabilityZone;
    	      this.singleInstanceType = defaults.singleInstanceType;
        }

        public Builder allocationStrategy(@Nullable EC2FleetSpotOptionsRequestAllocationStrategy allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        public Builder instanceInterruptionBehavior(@Nullable EC2FleetSpotOptionsRequestInstanceInterruptionBehavior instanceInterruptionBehavior) {
            this.instanceInterruptionBehavior = instanceInterruptionBehavior;
            return this;
        }

        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }

        public Builder maintenanceStrategies(@Nullable EC2FleetMaintenanceStrategies maintenanceStrategies) {
            this.maintenanceStrategies = maintenanceStrategies;
            return this;
        }

        public Builder maxTotalPrice(@Nullable String maxTotalPrice) {
            this.maxTotalPrice = maxTotalPrice;
            return this;
        }

        public Builder minTargetCapacity(@Nullable Integer minTargetCapacity) {
            this.minTargetCapacity = minTargetCapacity;
            return this;
        }

        public Builder singleAvailabilityZone(@Nullable Boolean singleAvailabilityZone) {
            this.singleAvailabilityZone = singleAvailabilityZone;
            return this;
        }

        public Builder singleInstanceType(@Nullable Boolean singleInstanceType) {
            this.singleInstanceType = singleInstanceType;
            return this;
        }
        public EC2FleetSpotOptionsRequest build() {
            return new EC2FleetSpotOptionsRequest(allocationStrategy, instanceInterruptionBehavior, instancePoolsToUseCount, maintenanceStrategies, maxTotalPrice, minTargetCapacity, singleAvailabilityZone, singleInstanceType);
        }
    }
}
