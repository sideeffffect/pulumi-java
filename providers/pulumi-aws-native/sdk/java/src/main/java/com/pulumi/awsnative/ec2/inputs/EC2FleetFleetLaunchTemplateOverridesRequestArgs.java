// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.inputs.EC2FleetInstanceRequirementsRequestArgs;
import com.pulumi.awsnative.ec2.inputs.EC2FleetPlacementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EC2FleetFleetLaunchTemplateOverridesRequestArgs extends ResourceArgs {

    public static final EC2FleetFleetLaunchTemplateOverridesRequestArgs Empty = new EC2FleetFleetLaunchTemplateOverridesRequestArgs();

    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    @Import(name="instanceRequirements")
    private @Nullable Output<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements;

    public Optional<Output<EC2FleetInstanceRequirementsRequestArgs>> instanceRequirements() {
        return Optional.ofNullable(this.instanceRequirements);
    }

    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    @Import(name="maxPrice")
    private @Nullable Output<String> maxPrice;

    public Optional<Output<String>> maxPrice() {
        return Optional.ofNullable(this.maxPrice);
    }

    @Import(name="placement")
    private @Nullable Output<EC2FleetPlacementArgs> placement;

    public Optional<Output<EC2FleetPlacementArgs>> placement() {
        return Optional.ofNullable(this.placement);
    }

    @Import(name="priority")
    private @Nullable Output<Double> priority;

    public Optional<Output<Double>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    @Import(name="weightedCapacity")
    private @Nullable Output<Double> weightedCapacity;

    public Optional<Output<Double>> weightedCapacity() {
        return Optional.ofNullable(this.weightedCapacity);
    }

    private EC2FleetFleetLaunchTemplateOverridesRequestArgs() {}

    private EC2FleetFleetLaunchTemplateOverridesRequestArgs(EC2FleetFleetLaunchTemplateOverridesRequestArgs $) {
        this.availabilityZone = $.availabilityZone;
        this.instanceRequirements = $.instanceRequirements;
        this.instanceType = $.instanceType;
        this.maxPrice = $.maxPrice;
        this.placement = $.placement;
        this.priority = $.priority;
        this.subnetId = $.subnetId;
        this.weightedCapacity = $.weightedCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EC2FleetFleetLaunchTemplateOverridesRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EC2FleetFleetLaunchTemplateOverridesRequestArgs $;

        public Builder() {
            $ = new EC2FleetFleetLaunchTemplateOverridesRequestArgs();
        }

        public Builder(EC2FleetFleetLaunchTemplateOverridesRequestArgs defaults) {
            $ = new EC2FleetFleetLaunchTemplateOverridesRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        public Builder instanceRequirements(@Nullable Output<EC2FleetInstanceRequirementsRequestArgs> instanceRequirements) {
            $.instanceRequirements = instanceRequirements;
            return this;
        }

        public Builder instanceRequirements(EC2FleetInstanceRequirementsRequestArgs instanceRequirements) {
            return instanceRequirements(Output.of(instanceRequirements));
        }

        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder maxPrice(@Nullable Output<String> maxPrice) {
            $.maxPrice = maxPrice;
            return this;
        }

        public Builder maxPrice(String maxPrice) {
            return maxPrice(Output.of(maxPrice));
        }

        public Builder placement(@Nullable Output<EC2FleetPlacementArgs> placement) {
            $.placement = placement;
            return this;
        }

        public Builder placement(EC2FleetPlacementArgs placement) {
            return placement(Output.of(placement));
        }

        public Builder priority(@Nullable Output<Double> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Double priority) {
            return priority(Output.of(priority));
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public Builder weightedCapacity(@Nullable Output<Double> weightedCapacity) {
            $.weightedCapacity = weightedCapacity;
            return this;
        }

        public Builder weightedCapacity(Double weightedCapacity) {
            return weightedCapacity(Output.of(weightedCapacity));
        }

        public EC2FleetFleetLaunchTemplateOverridesRequestArgs build() {
            return $;
        }
    }

}
