// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpotFleetRequestLaunchTemplateConfigOverride {
    /**
     * The availability zone in which to place the request.
     * 
     */
    private final @Nullable String availabilityZone;
    /**
     * The type of instance to request.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
     * 
     */
    private final @Nullable Double priority;
    /**
     * The maximum spot bid for this override request.
     * 
     */
    private final @Nullable String spotPrice;
    /**
     * The subnet in which to launch the requested instance.
     * 
     */
    private final @Nullable String subnetId;
    /**
     * The capacity added to the fleet by a fulfilled request.
     * 
     */
    private final @Nullable Double weightedCapacity;

    @CustomType.Constructor
    private SpotFleetRequestLaunchTemplateConfigOverride(
        @CustomType.Parameter("availabilityZone") @Nullable String availabilityZone,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("priority") @Nullable Double priority,
        @CustomType.Parameter("spotPrice") @Nullable String spotPrice,
        @CustomType.Parameter("subnetId") @Nullable String subnetId,
        @CustomType.Parameter("weightedCapacity") @Nullable Double weightedCapacity) {
        this.availabilityZone = availabilityZone;
        this.instanceType = instanceType;
        this.priority = priority;
        this.spotPrice = spotPrice;
        this.subnetId = subnetId;
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * The availability zone in which to place the request.
     * 
    */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }
    /**
     * The type of instance to request.
     * 
    */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
     * 
    */
    public Optional<Double> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * The maximum spot bid for this override request.
     * 
    */
    public Optional<String> spotPrice() {
        return Optional.ofNullable(this.spotPrice);
    }
    /**
     * The subnet in which to launch the requested instance.
     * 
    */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }
    /**
     * The capacity added to the fleet by a fulfilled request.
     * 
    */
    public Optional<Double> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetRequestLaunchTemplateConfigOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable String instanceType;
        private @Nullable Double priority;
        private @Nullable String spotPrice;
        private @Nullable String subnetId;
        private @Nullable Double weightedCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetRequestLaunchTemplateConfigOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.instanceType = defaults.instanceType;
    	      this.priority = defaults.priority;
    	      this.spotPrice = defaults.spotPrice;
    	      this.subnetId = defaults.subnetId;
    	      this.weightedCapacity = defaults.weightedCapacity;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder priority(@Nullable Double priority) {
            this.priority = priority;
            return this;
        }
        public Builder spotPrice(@Nullable String spotPrice) {
            this.spotPrice = spotPrice;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder weightedCapacity(@Nullable Double weightedCapacity) {
            this.weightedCapacity = weightedCapacity;
            return this;
        }        public SpotFleetRequestLaunchTemplateConfigOverride build() {
            return new SpotFleetRequestLaunchTemplateConfigOverride(availabilityZone, instanceType, priority, spotPrice, subnetId, weightedCapacity);
        }
    }
}
