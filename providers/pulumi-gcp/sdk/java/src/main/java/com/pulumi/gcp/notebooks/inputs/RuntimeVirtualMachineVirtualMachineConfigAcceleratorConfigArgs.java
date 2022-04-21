// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @Import(name="coreCount")
    private @Nullable Output<Integer> coreCount;

    public Optional<Output<Integer>> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs() {}

    private RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs $) {
        this.coreCount = $.coreCount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs $;

        public Builder() {
            $ = new RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs();
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs defaults) {
            $ = new RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder coreCount(@Nullable Output<Integer> coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        public Builder coreCount(Integer coreCount) {
            return coreCount(Output.of(coreCount));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigArgs build() {
            return $;
        }
    }

}
