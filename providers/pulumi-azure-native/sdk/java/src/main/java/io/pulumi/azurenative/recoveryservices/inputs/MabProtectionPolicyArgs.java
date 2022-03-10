// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Mab container-specific backup policy.
 * 
 */
public final class MabProtectionPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final MabProtectionPolicyArgs Empty = new MabProtectionPolicyArgs();

    /**
     * This property will be used as the discriminator for deciding the specific types in the polymorphic chain of types.
     * Expected value is 'MAB'.
     * 
     */
    @InputImport(name="backupManagementType", required=true)
      private final Input<String> backupManagementType;

    public Input<String> getBackupManagementType() {
        return this.backupManagementType;
    }

    /**
     * Number of items associated with this policy.
     * 
     */
    @InputImport(name="protectedItemsCount")
      private final @Nullable Input<Integer> protectedItemsCount;

    public Input<Integer> getProtectedItemsCount() {
        return this.protectedItemsCount == null ? Input.empty() : this.protectedItemsCount;
    }

    /**
     * Retention policy details.
     * 
     */
    @InputImport(name="retentionPolicy")
      private final @Nullable Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    public Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> getRetentionPolicy() {
        return this.retentionPolicy == null ? Input.empty() : this.retentionPolicy;
    }

    /**
     * Backup schedule of backup policy.
     * 
     */
    @InputImport(name="schedulePolicy")
      private final @Nullable Input<Object> schedulePolicy;

    public Input<Object> getSchedulePolicy() {
        return this.schedulePolicy == null ? Input.empty() : this.schedulePolicy;
    }

    public MabProtectionPolicyArgs(
        Input<String> backupManagementType,
        @Nullable Input<Integer> protectedItemsCount,
        @Nullable Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy,
        @Nullable Input<Object> schedulePolicy) {
        this.backupManagementType = Objects.requireNonNull(backupManagementType, "expected parameter 'backupManagementType' to be non-null");
        this.protectedItemsCount = protectedItemsCount;
        this.retentionPolicy = retentionPolicy;
        this.schedulePolicy = schedulePolicy;
    }

    private MabProtectionPolicyArgs() {
        this.backupManagementType = Input.empty();
        this.protectedItemsCount = Input.empty();
        this.retentionPolicy = Input.empty();
        this.schedulePolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MabProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> backupManagementType;
        private @Nullable Input<Integer> protectedItemsCount;
        private @Nullable Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;
        private @Nullable Input<Object> schedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(MabProtectionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.protectedItemsCount = defaults.protectedItemsCount;
    	      this.retentionPolicy = defaults.retentionPolicy;
    	      this.schedulePolicy = defaults.schedulePolicy;
        }

        public Builder backupManagementType(Input<String> backupManagementType) {
            this.backupManagementType = Objects.requireNonNull(backupManagementType);
            return this;
        }

        public Builder backupManagementType(String backupManagementType) {
            this.backupManagementType = Input.of(Objects.requireNonNull(backupManagementType));
            return this;
        }

        public Builder protectedItemsCount(@Nullable Input<Integer> protectedItemsCount) {
            this.protectedItemsCount = protectedItemsCount;
            return this;
        }

        public Builder protectedItemsCount(@Nullable Integer protectedItemsCount) {
            this.protectedItemsCount = Input.ofNullable(protectedItemsCount);
            return this;
        }

        public Builder retentionPolicy(@Nullable Input<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder retentionPolicy(@Nullable Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = Input.ofNullable(retentionPolicy);
            return this;
        }

        public Builder schedulePolicy(@Nullable Input<Object> schedulePolicy) {
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        public Builder schedulePolicy(@Nullable Object schedulePolicy) {
            this.schedulePolicy = Input.ofNullable(schedulePolicy);
            return this;
        }
        public MabProtectionPolicyArgs build() {
            return new MabProtectionPolicyArgs(backupManagementType, protectedItemsCount, retentionPolicy, schedulePolicy);
        }
    }
}
