// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageAdvancedMachineFeaturesGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageAdvancedMachineFeaturesGetArgs Empty = new InstanceFromMachineImageAdvancedMachineFeaturesGetArgs();

    @Import(name="enableNestedVirtualization")
    private @Nullable Output<Boolean> enableNestedVirtualization;

    public Optional<Output<Boolean>> enableNestedVirtualization() {
        return Optional.ofNullable(this.enableNestedVirtualization);
    }

    @Import(name="threadsPerCore")
    private @Nullable Output<Integer> threadsPerCore;

    public Optional<Output<Integer>> threadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    private InstanceFromMachineImageAdvancedMachineFeaturesGetArgs() {}

    private InstanceFromMachineImageAdvancedMachineFeaturesGetArgs(InstanceFromMachineImageAdvancedMachineFeaturesGetArgs $) {
        this.enableNestedVirtualization = $.enableNestedVirtualization;
        this.threadsPerCore = $.threadsPerCore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageAdvancedMachineFeaturesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageAdvancedMachineFeaturesGetArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageAdvancedMachineFeaturesGetArgs();
        }

        public Builder(InstanceFromMachineImageAdvancedMachineFeaturesGetArgs defaults) {
            $ = new InstanceFromMachineImageAdvancedMachineFeaturesGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableNestedVirtualization(@Nullable Output<Boolean> enableNestedVirtualization) {
            $.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }

        public Builder enableNestedVirtualization(Boolean enableNestedVirtualization) {
            return enableNestedVirtualization(Output.of(enableNestedVirtualization));
        }

        public Builder threadsPerCore(@Nullable Output<Integer> threadsPerCore) {
            $.threadsPerCore = threadsPerCore;
            return this;
        }

        public Builder threadsPerCore(Integer threadsPerCore) {
            return threadsPerCore(Output.of(threadsPerCore));
        }

        public InstanceFromMachineImageAdvancedMachineFeaturesGetArgs build() {
            return $;
        }
    }

}
