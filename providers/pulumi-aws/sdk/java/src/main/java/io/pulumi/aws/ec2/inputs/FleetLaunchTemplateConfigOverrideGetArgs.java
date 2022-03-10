// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetLaunchTemplateConfigOverrideGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FleetLaunchTemplateConfigOverrideGetArgs Empty = new FleetLaunchTemplateConfigOverrideGetArgs();

    /**
     * Availability Zone in which to launch the instances.
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * Instance type.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable Input<String> instanceType;

    public Input<String> getInstanceType() {
        return this.instanceType == null ? Input.empty() : this.instanceType;
    }

    /**
     * Maximum price per unit hour that you are willing to pay for a Spot Instance.
     * 
     */
    @InputImport(name="maxPrice")
      private final @Nullable Input<String> maxPrice;

    public Input<String> getMaxPrice() {
        return this.maxPrice == null ? Input.empty() : this.maxPrice;
    }

    /**
     * Priority for the launch template override. If `on_demand_options` `allocation_strategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Double> priority;

    public Input<Double> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * ID of the subnet in which to launch the instances.
     * 
     */
    @InputImport(name="subnetId")
      private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    /**
     * Number of units provided by the specified instance type.
     * 
     */
    @InputImport(name="weightedCapacity")
      private final @Nullable Input<Double> weightedCapacity;

    public Input<Double> getWeightedCapacity() {
        return this.weightedCapacity == null ? Input.empty() : this.weightedCapacity;
    }

    public FleetLaunchTemplateConfigOverrideGetArgs(
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> instanceType,
        @Nullable Input<String> maxPrice,
        @Nullable Input<Double> priority,
        @Nullable Input<String> subnetId,
        @Nullable Input<Double> weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceType = instanceType;
        this.maxPrice = maxPrice;
        this.priority = priority;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    private FleetLaunchTemplateConfigOverrideGetArgs() {
        this.availabilityZone = Input.empty();
        this.instanceType = Input.empty();
        this.maxPrice = Input.empty();
        this.priority = Input.empty();
        this.subnetId = Input.empty();
        this.weightedCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetLaunchTemplateConfigOverrideGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> instanceType;
        private @Nullable Input<String> maxPrice;
        private @Nullable Input<Double> priority;
        private @Nullable Input<String> subnetId;
        private @Nullable Input<Double> weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetLaunchTemplateConfigOverrideGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceType = defaults.instanceType;
    	      this.maxPrice = defaults.maxPrice;
    	      this.priority = defaults.priority;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder availabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder instanceType(@Nullable Input<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Input.ofNullable(instanceType);
            return this;
        }

        public Builder maxPrice(@Nullable Input<String> maxPrice) {
            this.maxPrice = maxPrice;
            return this;
        }

        public Builder maxPrice(@Nullable String maxPrice) {
            this.maxPrice = Input.ofNullable(maxPrice);
            return this;
        }

        public Builder priority(@Nullable Input<Double> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Double priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder subnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }

        public Builder weightedCapacity(@Nullable Input<Double> weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = Input.ofNullable(weightedCapacity);
            return this;
        }
        public FleetLaunchTemplateConfigOverrideGetArgs build() {
            return new FleetLaunchTemplateConfigOverrideGetArgs(availabilityZone, instanceType, maxPrice, priority, subnetId, weightedCapacity);
        }
    }
}
