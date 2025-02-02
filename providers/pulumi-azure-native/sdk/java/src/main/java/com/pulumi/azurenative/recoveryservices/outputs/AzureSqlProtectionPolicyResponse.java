// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.LongTermRetentionPolicyResponse;
import com.pulumi.azurenative.recoveryservices.outputs.SimpleRetentionPolicyResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureSqlProtectionPolicyResponse {
    /**
     * @return This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;AzureSql&#39;.
     * 
     */
    private final String backupManagementType;
    /**
     * @return Number of items associated with this policy.
     * 
     */
    private final @Nullable Integer protectedItemsCount;
    /**
     * @return Retention policy details.
     * 
     */
    private final @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;

    @CustomType.Constructor
    private AzureSqlProtectionPolicyResponse(
        @CustomType.Parameter("backupManagementType") String backupManagementType,
        @CustomType.Parameter("protectedItemsCount") @Nullable Integer protectedItemsCount,
        @CustomType.Parameter("retentionPolicy") @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
        this.backupManagementType = backupManagementType;
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
    }

    /**
     * @return This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is &#39;AzureSql&#39;.
     * 
     */
    public String backupManagementType() {
        return this.backupManagementType;
    }
    /**
     * @return Number of items associated with this policy.
     * 
     */
    public Optional<Integer> protectedItemsCount() {
        return Optional.ofNullable(this.protectedItemsCount);
    }
    /**
     * @return Retention policy details.
     * 
     */
    public Optional<Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlProtectionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupManagementType;
        private @Nullable Integer protectedItemsCount;
        private @Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlProtectionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }
        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }
        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyResponse,SimpleRetentionPolicyResponse> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }        public AzureSqlProtectionPolicyResponse build() {
            return new AzureSqlProtectionPolicyResponse(backupManagementType, protectedItemsCount, retentionPolicy);
        }
    }
}
