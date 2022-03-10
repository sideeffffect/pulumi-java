// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecoveryPlanProtectedItemResponse {
    /**
     * The ARM Id of the recovery plan protected item.
     * 
     */
    private final @Nullable String id;
    /**
     * The virtual machine Id.
     * 
     */
    private final @Nullable String virtualMachineId;

    @OutputCustomType.Constructor
    private RecoveryPlanProtectedItemResponse(
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("virtualMachineId") @Nullable String virtualMachineId) {
        this.id = id;
        this.virtualMachineId = virtualMachineId;
    }

    /**
     * The ARM Id of the recovery plan protected item.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The virtual machine Id.
     * 
    */
    public Optional<String> getVirtualMachineId() {
        return Optional.ofNullable(this.virtualMachineId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanProtectedItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String virtualMachineId;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanProtectedItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.virtualMachineId = defaults.virtualMachineId;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder virtualMachineId(@Nullable String virtualMachineId) {
            this.virtualMachineId = virtualMachineId;
            return this;
        }
        public RecoveryPlanProtectedItemResponse build() {
            return new RecoveryPlanProtectedItemResponse(id, virtualMachineId);
        }
    }
}
