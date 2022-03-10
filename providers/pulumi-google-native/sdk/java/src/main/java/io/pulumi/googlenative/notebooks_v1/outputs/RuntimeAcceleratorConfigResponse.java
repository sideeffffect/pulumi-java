// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class RuntimeAcceleratorConfigResponse {
    /**
     * Count of cores of this accelerator.
     * 
     */
    private final String coreCount;
    /**
     * Accelerator model.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private RuntimeAcceleratorConfigResponse(
        @OutputCustomType.Parameter("coreCount") String coreCount,
        @OutputCustomType.Parameter("type") String type) {
        this.coreCount = coreCount;
        this.type = type;
    }

    /**
     * Count of cores of this accelerator.
     * 
    */
    public String getCoreCount() {
        return this.coreCount;
    }
    /**
     * Accelerator model.
     * 
    */
    public String getType() {
        return this.type;
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
