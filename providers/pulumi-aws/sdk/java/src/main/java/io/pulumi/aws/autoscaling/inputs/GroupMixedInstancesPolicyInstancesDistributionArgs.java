// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMixedInstancesPolicyInstancesDistributionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMixedInstancesPolicyInstancesDistributionArgs Empty = new GroupMixedInstancesPolicyInstancesDistributionArgs();

    /**
     * Strategy to use when launching on-demand instances. Valid values: `prioritized`. Default: `prioritized`.
     * 
     */
    @Import(name="onDemandAllocationStrategy")
      private final @Nullable Output<String> onDemandAllocationStrategy;

    public Output<String> onDemandAllocationStrategy() {
        return this.onDemandAllocationStrategy == null ? Codegen.empty() : this.onDemandAllocationStrategy;
    }

    /**
     * Absolute minimum amount of desired capacity that must be fulfilled by on-demand instances. Default: `0`.
     * 
     */
    @Import(name="onDemandBaseCapacity")
      private final @Nullable Output<Integer> onDemandBaseCapacity;

    public Output<Integer> onDemandBaseCapacity() {
        return this.onDemandBaseCapacity == null ? Codegen.empty() : this.onDemandBaseCapacity;
    }

    /**
     * Percentage split between on-demand and Spot instances above the base on-demand capacity. Default: `100`.
     * 
     */
    @Import(name="onDemandPercentageAboveBaseCapacity")
      private final @Nullable Output<Integer> onDemandPercentageAboveBaseCapacity;

    public Output<Integer> onDemandPercentageAboveBaseCapacity() {
        return this.onDemandPercentageAboveBaseCapacity == null ? Codegen.empty() : this.onDemandPercentageAboveBaseCapacity;
    }

    /**
     * How to allocate capacity across the Spot pools. Valid values: `lowest-price`, `capacity-optimized`, `capacity-optimized-prioritized`. Default: `lowest-price`.
     * 
     */
    @Import(name="spotAllocationStrategy")
      private final @Nullable Output<String> spotAllocationStrategy;

    public Output<String> spotAllocationStrategy() {
        return this.spotAllocationStrategy == null ? Codegen.empty() : this.spotAllocationStrategy;
    }

    /**
     * Number of Spot pools per availability zone to allocate capacity. EC2 Auto Scaling selects the cheapest Spot pools and evenly allocates Spot capacity across the number of Spot pools that you specify. Only available with `spot_allocation_strategy` set to `lowest-price`. Otherwise it must be set to `0`, if it has been defined before. Default: `2`.
     * 
     */
    @Import(name="spotInstancePools")
      private final @Nullable Output<Integer> spotInstancePools;

    public Output<Integer> spotInstancePools() {
        return this.spotInstancePools == null ? Codegen.empty() : this.spotInstancePools;
    }

    /**
     * Maximum price per unit hour that the user is willing to pay for the Spot instances. Default: an empty string which means the on-demand price.
     * 
     */
    @Import(name="spotMaxPrice")
      private final @Nullable Output<String> spotMaxPrice;

    public Output<String> spotMaxPrice() {
        return this.spotMaxPrice == null ? Codegen.empty() : this.spotMaxPrice;
    }

    public GroupMixedInstancesPolicyInstancesDistributionArgs(
        @Nullable Output<String> onDemandAllocationStrategy,
        @Nullable Output<Integer> onDemandBaseCapacity,
        @Nullable Output<Integer> onDemandPercentageAboveBaseCapacity,
        @Nullable Output<String> spotAllocationStrategy,
        @Nullable Output<Integer> spotInstancePools,
        @Nullable Output<String> spotMaxPrice) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        this.spotAllocationStrategy = spotAllocationStrategy;
        this.spotInstancePools = spotInstancePools;
        this.spotMaxPrice = spotMaxPrice;
    }

    private GroupMixedInstancesPolicyInstancesDistributionArgs() {
        this.onDemandAllocationStrategy = Codegen.empty();
        this.onDemandBaseCapacity = Codegen.empty();
        this.onDemandPercentageAboveBaseCapacity = Codegen.empty();
        this.spotAllocationStrategy = Codegen.empty();
        this.spotInstancePools = Codegen.empty();
        this.spotMaxPrice = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMixedInstancesPolicyInstancesDistributionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> onDemandAllocationStrategy;
        private @Nullable Output<Integer> onDemandBaseCapacity;
        private @Nullable Output<Integer> onDemandPercentageAboveBaseCapacity;
        private @Nullable Output<String> spotAllocationStrategy;
        private @Nullable Output<Integer> spotInstancePools;
        private @Nullable Output<String> spotMaxPrice;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMixedInstancesPolicyInstancesDistributionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.onDemandAllocationStrategy = defaults.onDemandAllocationStrategy;
    	      this.onDemandBaseCapacity = defaults.onDemandBaseCapacity;
    	      this.onDemandPercentageAboveBaseCapacity = defaults.onDemandPercentageAboveBaseCapacity;
    	      this.spotAllocationStrategy = defaults.spotAllocationStrategy;
    	      this.spotInstancePools = defaults.spotInstancePools;
    	      this.spotMaxPrice = defaults.spotMaxPrice;
        }

        public Builder onDemandAllocationStrategy(@Nullable Output<String> onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = onDemandAllocationStrategy;
            return this;
        }
        public Builder onDemandAllocationStrategy(@Nullable String onDemandAllocationStrategy) {
            this.onDemandAllocationStrategy = Codegen.ofNullable(onDemandAllocationStrategy);
            return this;
        }
        public Builder onDemandBaseCapacity(@Nullable Output<Integer> onDemandBaseCapacity) {
            this.onDemandBaseCapacity = onDemandBaseCapacity;
            return this;
        }
        public Builder onDemandBaseCapacity(@Nullable Integer onDemandBaseCapacity) {
            this.onDemandBaseCapacity = Codegen.ofNullable(onDemandBaseCapacity);
            return this;
        }
        public Builder onDemandPercentageAboveBaseCapacity(@Nullable Output<Integer> onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
            return this;
        }
        public Builder onDemandPercentageAboveBaseCapacity(@Nullable Integer onDemandPercentageAboveBaseCapacity) {
            this.onDemandPercentageAboveBaseCapacity = Codegen.ofNullable(onDemandPercentageAboveBaseCapacity);
            return this;
        }
        public Builder spotAllocationStrategy(@Nullable Output<String> spotAllocationStrategy) {
            this.spotAllocationStrategy = spotAllocationStrategy;
            return this;
        }
        public Builder spotAllocationStrategy(@Nullable String spotAllocationStrategy) {
            this.spotAllocationStrategy = Codegen.ofNullable(spotAllocationStrategy);
            return this;
        }
        public Builder spotInstancePools(@Nullable Output<Integer> spotInstancePools) {
            this.spotInstancePools = spotInstancePools;
            return this;
        }
        public Builder spotInstancePools(@Nullable Integer spotInstancePools) {
            this.spotInstancePools = Codegen.ofNullable(spotInstancePools);
            return this;
        }
        public Builder spotMaxPrice(@Nullable Output<String> spotMaxPrice) {
            this.spotMaxPrice = spotMaxPrice;
            return this;
        }
        public Builder spotMaxPrice(@Nullable String spotMaxPrice) {
            this.spotMaxPrice = Codegen.ofNullable(spotMaxPrice);
            return this;
        }        public GroupMixedInstancesPolicyInstancesDistributionArgs build() {
            return new GroupMixedInstancesPolicyInstancesDistributionArgs(onDemandAllocationStrategy, onDemandBaseCapacity, onDemandPercentageAboveBaseCapacity, spotAllocationStrategy, spotInstancePools, spotMaxPrice);
        }
    }
}
