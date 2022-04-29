// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EC2FleetAcceleratorTotalMemoryMiBRequestArgs extends ResourceArgs {

    public static final EC2FleetAcceleratorTotalMemoryMiBRequestArgs Empty = new EC2FleetAcceleratorTotalMemoryMiBRequestArgs();

    @Import(name="max")
    private @Nullable Output<Integer> max;

    public Optional<Output<Integer>> max() {
        return Optional.ofNullable(this.max);
    }

    @Import(name="min")
    private @Nullable Output<Integer> min;

    public Optional<Output<Integer>> min() {
        return Optional.ofNullable(this.min);
    }

    private EC2FleetAcceleratorTotalMemoryMiBRequestArgs() {}

    private EC2FleetAcceleratorTotalMemoryMiBRequestArgs(EC2FleetAcceleratorTotalMemoryMiBRequestArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EC2FleetAcceleratorTotalMemoryMiBRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EC2FleetAcceleratorTotalMemoryMiBRequestArgs $;

        public Builder() {
            $ = new EC2FleetAcceleratorTotalMemoryMiBRequestArgs();
        }

        public Builder(EC2FleetAcceleratorTotalMemoryMiBRequestArgs defaults) {
            $ = new EC2FleetAcceleratorTotalMemoryMiBRequestArgs(Objects.requireNonNull(defaults));
        }

        public Builder max(@Nullable Output<Integer> max) {
            $.max = max;
            return this;
        }

        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        public Builder min(@Nullable Output<Integer> min) {
            $.min = min;
            return this;
        }

        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public EC2FleetAcceleratorTotalMemoryMiBRequestArgs build() {
            return $;
        }
    }

}
