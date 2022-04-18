// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFileshareProtectedItemExtendedInfoResponse {
    /**
     * The oldest backup copy available for this item in the service.
     * 
     */
    private final @Nullable String oldestRecoveryPoint;
    /**
     * Indicates consistency of policy object and policy applied to this backup item.
     * 
     */
    private final @Nullable String policyState;
    /**
     * Number of available backup copies associated with this backup item.
     * 
     */
    private final @Nullable Integer recoveryPointCount;
    /**
     * Indicates the state of this resource. Possible values are from enum ResourceState {Invalid, Active, SoftDeleted, Deleted}
     * 
     */
    private final String resourceState;
    /**
     * The resource state sync time for this backup item.
     * 
     */
    private final String resourceStateSyncTime;

    @CustomType.Constructor
    private AzureFileshareProtectedItemExtendedInfoResponse(
        @CustomType.Parameter("oldestRecoveryPoint") @Nullable String oldestRecoveryPoint,
        @CustomType.Parameter("policyState") @Nullable String policyState,
        @CustomType.Parameter("recoveryPointCount") @Nullable Integer recoveryPointCount,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("resourceStateSyncTime") String resourceStateSyncTime) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyState = policyState;
        this.recoveryPointCount = recoveryPointCount;
        this.resourceState = resourceState;
        this.resourceStateSyncTime = resourceStateSyncTime;
    }

    /**
     * The oldest backup copy available for this item in the service.
     * 
    */
    public Optional<String> oldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }
    /**
     * Indicates consistency of policy object and policy applied to this backup item.
     * 
    */
    public Optional<String> policyState() {
        return Optional.ofNullable(this.policyState);
    }
    /**
     * Number of available backup copies associated with this backup item.
     * 
    */
    public Optional<Integer> recoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }
    /**
     * Indicates the state of this resource. Possible values are from enum ResourceState {Invalid, Active, SoftDeleted, Deleted}
     * 
    */
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * The resource state sync time for this backup item.
     * 
    */
    public String resourceStateSyncTime() {
        return this.resourceStateSyncTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileshareProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String oldestRecoveryPoint;
        private @Nullable String policyState;
        private @Nullable Integer recoveryPointCount;
        private String resourceState;
        private String resourceStateSyncTime;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileshareProtectedItemExtendedInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyState = defaults.policyState;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
    	      this.resourceState = defaults.resourceState;
    	      this.resourceStateSyncTime = defaults.resourceStateSyncTime;
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
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder resourceStateSyncTime(String resourceStateSyncTime) {
            this.resourceStateSyncTime = Objects.requireNonNull(resourceStateSyncTime);
            return this;
        }        public AzureFileshareProtectedItemExtendedInfoResponse build() {
            return new AzureFileshareProtectedItemExtendedInfoResponse(oldestRecoveryPoint, policyState, recoveryPointCount, resourceState, resourceStateSyncTime);
        }
    }
}
