// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetVMProtectionPolicyResponse {
    /**
     * @return Indicates that the virtual machine scale set VM shouldn&#39;t be considered for deletion during a scale-in operation.
     * 
     */
    private final @Nullable Boolean protectFromScaleIn;
    /**
     * @return Indicates that model updates or actions (including scale-in) initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     * 
     */
    private final @Nullable Boolean protectFromScaleSetActions;

    @CustomType.Constructor
    private VirtualMachineScaleSetVMProtectionPolicyResponse(
        @CustomType.Parameter("protectFromScaleIn") @Nullable Boolean protectFromScaleIn,
        @CustomType.Parameter("protectFromScaleSetActions") @Nullable Boolean protectFromScaleSetActions) {
        this.protectFromScaleIn = protectFromScaleIn;
        this.protectFromScaleSetActions = protectFromScaleSetActions;
    }

    /**
     * @return Indicates that the virtual machine scale set VM shouldn&#39;t be considered for deletion during a scale-in operation.
     * 
     */
    public Optional<Boolean> protectFromScaleIn() {
        return Optional.ofNullable(this.protectFromScaleIn);
    }
    /**
     * @return Indicates that model updates or actions (including scale-in) initiated on the virtual machine scale set should not be applied to the virtual machine scale set VM.
     * 
     */
    public Optional<Boolean> protectFromScaleSetActions() {
        return Optional.ofNullable(this.protectFromScaleSetActions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean protectFromScaleIn;
        private @Nullable Boolean protectFromScaleSetActions;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protectFromScaleIn = defaults.protectFromScaleIn;
    	      this.protectFromScaleSetActions = defaults.protectFromScaleSetActions;
        }

        public Builder protectFromScaleIn(@Nullable Boolean protectFromScaleIn) {
            this.protectFromScaleIn = protectFromScaleIn;
            return this;
        }
        public Builder protectFromScaleSetActions(@Nullable Boolean protectFromScaleSetActions) {
            this.protectFromScaleSetActions = protectFromScaleSetActions;
            return this;
        }        public VirtualMachineScaleSetVMProtectionPolicyResponse build() {
            return new VirtualMachineScaleSetVMProtectionPolicyResponse(protectFromScaleIn, protectFromScaleSetActions);
        }
    }
}
