// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.enums.PolicyType;
import com.pulumi.azurenative.recoveryservices.inputs.LogSchedulePolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermRetentionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.LongTermSchedulePolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleRetentionPolicyArgs;
import com.pulumi.azurenative.recoveryservices.inputs.SimpleSchedulePolicyArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sub-protection policy which includes schedule and retention
 * 
 */
public final class SubProtectionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubProtectionPolicyArgs Empty = new SubProtectionPolicyArgs();

    /**
     * Type of backup policy type
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<Either<String,PolicyType>> policyType;

    /**
     * @return Type of backup policy type
     * 
     */
    public Optional<Output<Either<String,PolicyType>>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    /**
     * Retention policy with the details on backup copy retention ranges.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy;

    /**
     * @return Retention policy with the details on backup copy retention ranges.
     * 
     */
    public Optional<Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>>> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    /**
     * Backup schedule specified as part of backup policy.
     * 
     */
    @Import(name="schedulePolicy")
    private @Nullable Output<Object> schedulePolicy;

    /**
     * @return Backup schedule specified as part of backup policy.
     * 
     */
    public Optional<Output<Object>> schedulePolicy() {
        return Optional.ofNullable(this.schedulePolicy);
    }

    private SubProtectionPolicyArgs() {}

    private SubProtectionPolicyArgs(SubProtectionPolicyArgs $) {
        this.policyType = $.policyType;
        this.retentionPolicy = $.retentionPolicy;
        this.schedulePolicy = $.schedulePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubProtectionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubProtectionPolicyArgs $;

        public Builder() {
            $ = new SubProtectionPolicyArgs();
        }

        public Builder(SubProtectionPolicyArgs defaults) {
            $ = new SubProtectionPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param policyType Type of backup policy type
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<Either<String,PolicyType>> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType Type of backup policy type
         * 
         * @return builder
         * 
         */
        public Builder policyType(Either<String,PolicyType> policyType) {
            return policyType(Output.of(policyType));
        }

        /**
         * @param policyType Type of backup policy type
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Either.ofLeft(policyType));
        }

        /**
         * @param policyType Type of backup policy type
         * 
         * @return builder
         * 
         */
        public Builder policyType(PolicyType policyType) {
            return policyType(Either.ofRight(policyType));
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable Output<Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs>> retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(Either<LongTermRetentionPolicyArgs,SimpleRetentionPolicyArgs> retentionPolicy) {
            return retentionPolicy(Output.of(retentionPolicy));
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(LongTermRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Either.ofLeft(retentionPolicy));
        }

        /**
         * @param retentionPolicy Retention policy with the details on backup copy retention ranges.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(SimpleRetentionPolicyArgs retentionPolicy) {
            return retentionPolicy(Either.ofRight(retentionPolicy));
        }

        /**
         * @param schedulePolicy Backup schedule specified as part of backup policy.
         * 
         * @return builder
         * 
         */
        public Builder schedulePolicy(@Nullable Output<Object> schedulePolicy) {
            $.schedulePolicy = schedulePolicy;
            return this;
        }

        /**
         * @param schedulePolicy Backup schedule specified as part of backup policy.
         * 
         * @return builder
         * 
         */
        public Builder schedulePolicy(Object schedulePolicy) {
            return schedulePolicy(Output.of(schedulePolicy));
        }

        public SubProtectionPolicyArgs build() {
            return $;
        }
    }

}
