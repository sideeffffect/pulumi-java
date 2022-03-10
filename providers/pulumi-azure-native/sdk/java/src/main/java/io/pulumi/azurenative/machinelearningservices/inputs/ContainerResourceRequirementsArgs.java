// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The resource requirements for the container (cpu and memory).
 * 
 */
public final class ContainerResourceRequirementsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourceRequirementsArgs Empty = new ContainerResourceRequirementsArgs();

    /**
     * The minimum amount of CPU cores to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    @InputImport(name="cpu")
      private final @Nullable Input<Double> cpu;

    public Input<Double> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    /**
     * The maximum amount of CPU cores allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    @InputImport(name="cpuLimit")
      private final @Nullable Input<Double> cpuLimit;

    public Input<Double> getCpuLimit() {
        return this.cpuLimit == null ? Input.empty() : this.cpuLimit;
    }

    /**
     * The number of FPGA PCIE devices exposed to the container. Must be multiple of 2.
     * 
     */
    @InputImport(name="fpga")
      private final @Nullable Input<Integer> fpga;

    public Input<Integer> getFpga() {
        return this.fpga == null ? Input.empty() : this.fpga;
    }

    /**
     * The number of GPU cores in the container.
     * 
     */
    @InputImport(name="gpu")
      private final @Nullable Input<Integer> gpu;

    public Input<Integer> getGpu() {
        return this.gpu == null ? Input.empty() : this.gpu;
    }

    /**
     * The minimum amount of memory (in GB) to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    @InputImport(name="memoryInGB")
      private final @Nullable Input<Double> memoryInGB;

    public Input<Double> getMemoryInGB() {
        return this.memoryInGB == null ? Input.empty() : this.memoryInGB;
    }

    /**
     * The maximum amount of memory (in GB) allowed to be used by the container. More info:
     * https://kubernetes.io/docs/concepts/configuration/manage-compute-resources-container/
     * 
     */
    @InputImport(name="memoryInGBLimit")
      private final @Nullable Input<Double> memoryInGBLimit;

    public Input<Double> getMemoryInGBLimit() {
        return this.memoryInGBLimit == null ? Input.empty() : this.memoryInGBLimit;
    }

    public ContainerResourceRequirementsArgs(
        @Nullable Input<Double> cpu,
        @Nullable Input<Double> cpuLimit,
        @Nullable Input<Integer> fpga,
        @Nullable Input<Integer> gpu,
        @Nullable Input<Double> memoryInGB,
        @Nullable Input<Double> memoryInGBLimit) {
        this.cpu = cpu;
        this.cpuLimit = cpuLimit;
        this.fpga = fpga;
        this.gpu = gpu;
        this.memoryInGB = memoryInGB;
        this.memoryInGBLimit = memoryInGBLimit;
    }

    private ContainerResourceRequirementsArgs() {
        this.cpu = Input.empty();
        this.cpuLimit = Input.empty();
        this.fpga = Input.empty();
        this.gpu = Input.empty();
        this.memoryInGB = Input.empty();
        this.memoryInGBLimit = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourceRequirementsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> cpu;
        private @Nullable Input<Double> cpuLimit;
        private @Nullable Input<Integer> fpga;
        private @Nullable Input<Integer> gpu;
        private @Nullable Input<Double> memoryInGB;
        private @Nullable Input<Double> memoryInGBLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourceRequirementsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.cpuLimit = defaults.cpuLimit;
    	      this.fpga = defaults.fpga;
    	      this.gpu = defaults.gpu;
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.memoryInGBLimit = defaults.memoryInGBLimit;
        }

        public Builder cpu(@Nullable Input<Double> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder cpuLimit(@Nullable Input<Double> cpuLimit) {
            this.cpuLimit = cpuLimit;
            return this;
        }

        public Builder cpuLimit(@Nullable Double cpuLimit) {
            this.cpuLimit = Input.ofNullable(cpuLimit);
            return this;
        }

        public Builder fpga(@Nullable Input<Integer> fpga) {
            this.fpga = fpga;
            return this;
        }

        public Builder fpga(@Nullable Integer fpga) {
            this.fpga = Input.ofNullable(fpga);
            return this;
        }

        public Builder gpu(@Nullable Input<Integer> gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder gpu(@Nullable Integer gpu) {
            this.gpu = Input.ofNullable(gpu);
            return this;
        }

        public Builder memoryInGB(@Nullable Input<Double> memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }

        public Builder memoryInGB(@Nullable Double memoryInGB) {
            this.memoryInGB = Input.ofNullable(memoryInGB);
            return this;
        }

        public Builder memoryInGBLimit(@Nullable Input<Double> memoryInGBLimit) {
            this.memoryInGBLimit = memoryInGBLimit;
            return this;
        }

        public Builder memoryInGBLimit(@Nullable Double memoryInGBLimit) {
            this.memoryInGBLimit = Input.ofNullable(memoryInGBLimit);
            return this;
        }
        public ContainerResourceRequirementsArgs build() {
            return new ContainerResourceRequirementsArgs(cpu, cpuLimit, fpga, gpu, memoryInGB, memoryInGBLimit);
        }
    }
}
