// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.notebooks_v1.enums.RuntimeAcceleratorConfigType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of the types of hardware accelerators that can be used. Definition of the types of hardware accelerators that can be used. See [Compute Engine AcceleratorTypes](https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes). Examples: * `nvidia-tesla-k80` * `nvidia-tesla-p100` * `nvidia-tesla-v100` * `nvidia-tesla-p4` * `nvidia-tesla-t4` * `nvidia-tesla-a100`
 * 
 */
public final class RuntimeAcceleratorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeAcceleratorConfigArgs Empty = new RuntimeAcceleratorConfigArgs();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @InputImport(name="coreCount")
      private final @Nullable Input<String> coreCount;

    public Input<String> getCoreCount() {
        return this.coreCount == null ? Input.empty() : this.coreCount;
    }

    /**
     * Accelerator model.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<RuntimeAcceleratorConfigType> type;

    public Input<RuntimeAcceleratorConfigType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public RuntimeAcceleratorConfigArgs(
        @Nullable Input<String> coreCount,
        @Nullable Input<RuntimeAcceleratorConfigType> type) {
        this.coreCount = coreCount;
        this.type = type;
    }

    private RuntimeAcceleratorConfigArgs() {
        this.coreCount = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> coreCount;
        private @Nullable Input<RuntimeAcceleratorConfigType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeAcceleratorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder coreCount(@Nullable Input<String> coreCount) {
            this.coreCount = coreCount;
            return this;
        }

        public Builder coreCount(@Nullable String coreCount) {
            this.coreCount = Input.ofNullable(coreCount);
            return this;
        }

        public Builder type(@Nullable Input<RuntimeAcceleratorConfigType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable RuntimeAcceleratorConfigType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public RuntimeAcceleratorConfigArgs build() {
            return new RuntimeAcceleratorConfigArgs(coreCount, type);
        }
    }
}
