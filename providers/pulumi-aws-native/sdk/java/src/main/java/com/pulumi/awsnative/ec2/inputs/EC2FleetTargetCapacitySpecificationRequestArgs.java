// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.enums.EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType;
import com.pulumi.awsnative.ec2.enums.EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EC2FleetTargetCapacitySpecificationRequestArgs extends ResourceArgs {

    public static final EC2FleetTargetCapacitySpecificationRequestArgs Empty = new EC2FleetTargetCapacitySpecificationRequestArgs();

    @Import(name="defaultTargetCapacityType")
    private @Nullable Output<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> defaultTargetCapacityType;

    public Optional<Output<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType>> defaultTargetCapacityType() {
        return Optional.ofNullable(this.defaultTargetCapacityType);
    }

    @Import(name="onDemandTargetCapacity")
    private @Nullable Output<Integer> onDemandTargetCapacity;

    public Optional<Output<Integer>> onDemandTargetCapacity() {
        return Optional.ofNullable(this.onDemandTargetCapacity);
    }

    @Import(name="spotTargetCapacity")
    private @Nullable Output<Integer> spotTargetCapacity;

    public Optional<Output<Integer>> spotTargetCapacity() {
        return Optional.ofNullable(this.spotTargetCapacity);
    }

    @Import(name="targetCapacityUnitType")
    private @Nullable Output<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> targetCapacityUnitType;

    public Optional<Output<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType>> targetCapacityUnitType() {
        return Optional.ofNullable(this.targetCapacityUnitType);
    }

    @Import(name="totalTargetCapacity", required=true)
    private Output<Integer> totalTargetCapacity;

    public Output<Integer> totalTargetCapacity() {
        return this.totalTargetCapacity;
    }

    private EC2FleetTargetCapacitySpecificationRequestArgs() {}

    private EC2FleetTargetCapacitySpecificationRequestArgs(EC2FleetTargetCapacitySpecificationRequestArgs $) {
        this.defaultTargetCapacityType = $.defaultTargetCapacityType;
        this.onDemandTargetCapacity = $.onDemandTargetCapacity;
        this.spotTargetCapacity = $.spotTargetCapacity;
        this.targetCapacityUnitType = $.targetCapacityUnitType;
        this.totalTargetCapacity = $.totalTargetCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EC2FleetTargetCapacitySpecificationRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EC2FleetTargetCapacitySpecificationRequestArgs $;

        public Builder() {
            $ = new EC2FleetTargetCapacitySpecificationRequestArgs();
        }

        public Builder(EC2FleetTargetCapacitySpecificationRequestArgs defaults) {
            $ = new EC2FleetTargetCapacitySpecificationRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder defaultTargetCapacityType(@Nullable Output<EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType> defaultTargetCapacityType) {
            $.defaultTargetCapacityType = defaultTargetCapacityType;
            return this;
        }

        public Builder defaultTargetCapacityType(EC2FleetTargetCapacitySpecificationRequestDefaultTargetCapacityType defaultTargetCapacityType) {
            return defaultTargetCapacityType(Output.of(defaultTargetCapacityType));
        }

        public Builder onDemandTargetCapacity(@Nullable Output<Integer> onDemandTargetCapacity) {
            $.onDemandTargetCapacity = onDemandTargetCapacity;
            return this;
        }

        public Builder onDemandTargetCapacity(Integer onDemandTargetCapacity) {
            return onDemandTargetCapacity(Output.of(onDemandTargetCapacity));
        }

        public Builder spotTargetCapacity(@Nullable Output<Integer> spotTargetCapacity) {
            $.spotTargetCapacity = spotTargetCapacity;
            return this;
        }

        public Builder spotTargetCapacity(Integer spotTargetCapacity) {
            return spotTargetCapacity(Output.of(spotTargetCapacity));
        }

        public Builder targetCapacityUnitType(@Nullable Output<EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType> targetCapacityUnitType) {
            $.targetCapacityUnitType = targetCapacityUnitType;
            return this;
        }

        public Builder targetCapacityUnitType(EC2FleetTargetCapacitySpecificationRequestTargetCapacityUnitType targetCapacityUnitType) {
            return targetCapacityUnitType(Output.of(targetCapacityUnitType));
        }

        public Builder totalTargetCapacity(Output<Integer> totalTargetCapacity) {
            $.totalTargetCapacity = totalTargetCapacity;
            return this;
        }

        public Builder totalTargetCapacity(Integer totalTargetCapacity) {
            return totalTargetCapacity(Output.of(totalTargetCapacity));
        }

        public EC2FleetTargetCapacitySpecificationRequestArgs build() {
            $.totalTargetCapacity = Objects.requireNonNull($.totalTargetCapacity, "expected parameter 'totalTargetCapacity' to be non-null");
            return $;
        }
    }

}
