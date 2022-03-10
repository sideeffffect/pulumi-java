// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Definition of the types of hardware accelerators that can be used. Definition of the types of hardware accelerators that can be used. See [Compute Engine AcceleratorTypes](https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes). Examples: * `nvidia-tesla-k80` * `nvidia-tesla-p100` * `nvidia-tesla-v100` * `nvidia-tesla-p4` * `nvidia-tesla-t4` * `nvidia-tesla-a100`
 * 
 */
public final class RuntimeAcceleratorConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuntimeAcceleratorConfigResponse Empty = new RuntimeAcceleratorConfigResponse();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @InputImport(name="coreCount", required=true)
      private final String coreCount;

    public String getCoreCount() {
        return this.coreCount;
    }

    /**
     * Accelerator model.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public RuntimeAcceleratorConfigResponse(
        String coreCount,
        String type) {
        this.coreCount = Objects.requireNonNull(coreCount, "expected parameter 'coreCount' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RuntimeAcceleratorConfigResponse() {
        this.coreCount = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeAcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String coreCount;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeAcceleratorConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder coreCount(String coreCount) {
            this.coreCount = Objects.requireNonNull(coreCount);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public RuntimeAcceleratorConfigResponse build() {
            return new RuntimeAcceleratorConfigResponse(coreCount, type);
        }
    }
}
