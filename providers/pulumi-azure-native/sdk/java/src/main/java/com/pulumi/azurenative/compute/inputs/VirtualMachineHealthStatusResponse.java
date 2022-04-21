// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The health status of the VM.
 * 
 */
public final class VirtualMachineHealthStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineHealthStatusResponse Empty = new VirtualMachineHealthStatusResponse();

    /**
     * The health status information for the VM.
     * 
     */
    @Import(name="status", required=true)
    private InstanceViewStatusResponse status;

    public InstanceViewStatusResponse status() {
        return this.status;
    }

    private VirtualMachineHealthStatusResponse() {}

    private VirtualMachineHealthStatusResponse(VirtualMachineHealthStatusResponse $) {
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineHealthStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineHealthStatusResponse $;

        public Builder() {
            $ = new VirtualMachineHealthStatusResponse();
        }

        public Builder(VirtualMachineHealthStatusResponse defaults) {
            $ = new VirtualMachineHealthStatusResponse(Objects.requireNonNull(defaults));
        }

        public Builder status(InstanceViewStatusResponse status) {
            $.status = status;
            return this;
        }

        public VirtualMachineHealthStatusResponse build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
