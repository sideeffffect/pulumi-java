// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container resource requirements.
 * 
 */
public final class ContainerResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerResourcesArgs Empty = new ContainerResourcesArgs();

    /**
     * Required CPU in cores, e.g. 0.5
     * 
     */
    @InputImport(name="cpu")
      private final @Nullable Input<Double> cpu;

    public Input<Double> getCpu() {
        return this.cpu == null ? Input.empty() : this.cpu;
    }

    /**
     * Required memory, e.g. "250Mb"
     * 
     */
    @InputImport(name="memory")
      private final @Nullable Input<String> memory;

    public Input<String> getMemory() {
        return this.memory == null ? Input.empty() : this.memory;
    }

    public ContainerResourcesArgs(
        @Nullable Input<Double> cpu,
        @Nullable Input<String> memory) {
        this.cpu = cpu;
        this.memory = memory;
    }

    private ContainerResourcesArgs() {
        this.cpu = Input.empty();
        this.memory = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> cpu;
        private @Nullable Input<String> memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(@Nullable Input<Double> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Input.ofNullable(cpu);
            return this;
        }

        public Builder memory(@Nullable Input<String> memory) {
            this.memory = memory;
            return this;
        }

        public Builder memory(@Nullable String memory) {
            this.memory = Input.ofNullable(memory);
            return this;
        }
        public ContainerResourcesArgs build() {
            return new ContainerResourcesArgs(cpu, memory);
        }
    }
}
