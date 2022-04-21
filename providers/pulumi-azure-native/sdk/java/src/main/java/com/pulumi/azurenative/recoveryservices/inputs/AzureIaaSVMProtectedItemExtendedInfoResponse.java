// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional information on Azure IaaS VM specific backup item.
 * 
 */
public final class AzureIaaSVMProtectedItemExtendedInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureIaaSVMProtectedItemExtendedInfoResponse Empty = new AzureIaaSVMProtectedItemExtendedInfoResponse();

    /**
     * The oldest backup copy available for this backup item.
     * 
     */
    @Import(name="oldestRecoveryPoint")
    private @Nullable String oldestRecoveryPoint;

    public Optional<String> oldestRecoveryPoint() {
        return Optional.ofNullable(this.oldestRecoveryPoint);
    }

    /**
     * Specifies if backup policy associated with the backup item is inconsistent.
     * 
     */
    @Import(name="policyInconsistent")
    private @Nullable Boolean policyInconsistent;

    public Optional<Boolean> policyInconsistent() {
        return Optional.ofNullable(this.policyInconsistent);
    }

    /**
     * Number of backup copies available for this backup item.
     * 
     */
    @Import(name="recoveryPointCount")
    private @Nullable Integer recoveryPointCount;

    public Optional<Integer> recoveryPointCount() {
        return Optional.ofNullable(this.recoveryPointCount);
    }

    private AzureIaaSVMProtectedItemExtendedInfoResponse() {}

    private AzureIaaSVMProtectedItemExtendedInfoResponse(AzureIaaSVMProtectedItemExtendedInfoResponse $) {
        this.oldestRecoveryPoint = $.oldestRecoveryPoint;
        this.policyInconsistent = $.policyInconsistent;
        this.recoveryPointCount = $.recoveryPointCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureIaaSVMProtectedItemExtendedInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureIaaSVMProtectedItemExtendedInfoResponse $;

        public Builder() {
            $ = new AzureIaaSVMProtectedItemExtendedInfoResponse();
        }

        public Builder(AzureIaaSVMProtectedItemExtendedInfoResponse defaults) {
            $ = new AzureIaaSVMProtectedItemExtendedInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder oldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            $.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder policyInconsistent(@Nullable Boolean policyInconsistent) {
            $.policyInconsistent = policyInconsistent;
            return this;
        }

        public Builder recoveryPointCount(@Nullable Integer recoveryPointCount) {
            $.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public AzureIaaSVMProtectedItemExtendedInfoResponse build() {
            return $;
        }
    }

}
