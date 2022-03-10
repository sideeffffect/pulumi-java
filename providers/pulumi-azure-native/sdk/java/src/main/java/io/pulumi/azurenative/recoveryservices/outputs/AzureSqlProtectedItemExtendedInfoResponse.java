// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureSqlProtectedItemExtendedInfoResponse {
    /**
     * The oldest backup copy available for this item in the service.
     * 
     */
    private final @Nullable String oldestRecoveryPoint;
    /**
     * State of the backup policy associated with this backup item.
     * 
     */
    private final @Nullable String policyState;
    /**
     * Number of available backup copies associated with this backup item.
     * 
     */
    private final @Nullable Integer recoveryPointCount;

    @OutputCustomType.Constructor
    private AzureSqlProtectedItemExtendedInfoResponse(
        @OutputCustomType.Parameter("oldestRecoveryPoint") @Nullable String oldestRecoveryPoint,
        @OutputCustomType.Parameter("policyState") @Nullable String policyState,
        @OutputCustomType.Parameter("recoveryPointCount") @Nullable Integer recoveryPointCount) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyState = policyState;
        this.recoveryPointCount = recoveryPointCount;
    }

    /**
     * The oldest backup copy available for this item in the service.
     * 
    */
    public Optional<String> getOldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }
    /**
     * State of the backup policy associated with this backup item.
     * 
    */
    public Optional<String> getPolicyState() {
        return Optional.ofNullable(this.policyState);
    }
    /**
     * Number of available backup copies associated with this backup item.
     * 
    */
    public Optional<Integer> getRecoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String oldestRecoveryPoint;
        private @Nullable String policyState;
        private @Nullable Integer recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyState = defaults.policyState;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder policyState(@Nullable String policyState) {
            this.policyState = policyState;
            return this;
        }

        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }
        public AzureSqlProtectedItemExtendedInfoResponse build() {
            return new AzureSqlProtectedItemExtendedInfoResponse(oldestRecoveryPoint, policyState, recoveryPointCount);
        }
    }
}
