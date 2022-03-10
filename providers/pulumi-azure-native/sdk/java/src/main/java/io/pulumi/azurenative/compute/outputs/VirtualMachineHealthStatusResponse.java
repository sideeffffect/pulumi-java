// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class VirtualMachineHealthStatusResponse {
    /**
     * The health status information for the VM.
     * 
     */
    private final InstanceViewStatusResponse status;

    @OutputCustomType.Constructor
    private VirtualMachineHealthStatusResponse(@OutputCustomType.Parameter("status") InstanceViewStatusResponse status) {
        this.status = status;
    }

    /**
     * The health status information for the VM.
     * 
    */
    public InstanceViewStatusResponse getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineHealthStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceViewStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineHealthStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder status(InstanceViewStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public VirtualMachineHealthStatusResponse build() {
            return new VirtualMachineHealthStatusResponse(status);
        }
    }
}
