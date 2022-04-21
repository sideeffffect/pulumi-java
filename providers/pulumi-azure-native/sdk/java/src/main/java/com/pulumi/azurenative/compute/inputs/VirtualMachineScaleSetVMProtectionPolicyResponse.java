// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The protection policy of a virtual machine scale set VM.
 * 
 */
public final class VirtualMachineScaleSetVMProtectionPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetVMProtectionPolicyResponse Empty = new VirtualMachineScaleSetVMProtectionPolicyResponse();

    /**
     * Indicates that the virtual machine scale set VM shouldn&#39;t be considered for deletion during a scale-in operation.
     * 
     */
    @Import(name="protectFromScaleIn")
    private @Nullable Boolean protectFromScaleIn;

    public Optional<Boolean> protectFromScaleIn() {
        return Optional.ofNullable(this.protectFromScaleIn);
    }

    /**
     * Indicates that model updates or actions (including scale-in) initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     * 
     */
    @Import(name="protectFromScaleSetActions")
    private @Nullable Boolean protectFromScaleSetActions;

    public Optional<Boolean> protectFromScaleSetActions() {
        return Optional.ofNullable(this.protectFromScaleSetActions);
    }

    private VirtualMachineScaleSetVMProtectionPolicyResponse() {}

    private VirtualMachineScaleSetVMProtectionPolicyResponse(VirtualMachineScaleSetVMProtectionPolicyResponse $) {
        this.protectFromScaleIn = $.protectFromScaleIn;
        this.protectFromScaleSetActions = $.protectFromScaleSetActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineScaleSetVMProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineScaleSetVMProtectionPolicyResponse $;

        public Builder() {
            $ = new VirtualMachineScaleSetVMProtectionPolicyResponse();
        }

        public Builder(VirtualMachineScaleSetVMProtectionPolicyResponse defaults) {
            $ = new VirtualMachineScaleSetVMProtectionPolicyResponse(Objects.requireNonNull(defaults));
        }

        public Builder protectFromScaleIn(@Nullable Boolean protectFromScaleIn) {
            $.protectFromScaleIn = protectFromScaleIn;
            return this;
        }

        public Builder protectFromScaleSetActions(@Nullable Boolean protectFromScaleSetActions) {
            $.protectFromScaleSetActions = protectFromScaleSetActions;
            return this;
        }

        public VirtualMachineScaleSetVMProtectionPolicyResponse build() {
            return $;
        }
    }

}
