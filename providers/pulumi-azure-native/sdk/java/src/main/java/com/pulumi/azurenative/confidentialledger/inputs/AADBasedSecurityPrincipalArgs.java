// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.confidentialledger.inputs;

import com.pulumi.azurenative.confidentialledger.enums.LedgerRoleName;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * AAD based security principal with associated Ledger RoleName
 * 
 */
public final class AADBasedSecurityPrincipalArgs extends com.pulumi.resources.ResourceArgs {

    public static final AADBasedSecurityPrincipalArgs Empty = new AADBasedSecurityPrincipalArgs();

    /**
     * LedgerRole associated with the Security Principal of Ledger
     * 
     */
    @Import(name="ledgerRoleName")
    private @Nullable Output<Either<String,LedgerRoleName>> ledgerRoleName;

    /**
     * @return LedgerRole associated with the Security Principal of Ledger
     * 
     */
    public Optional<Output<Either<String,LedgerRoleName>>> ledgerRoleName() {
        return Optional.ofNullable(this.ledgerRoleName);
    }

    /**
     * UUID/GUID based Principal Id of the Security Principal
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return UUID/GUID based Principal Id of the Security Principal
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * UUID/GUID based Tenant Id of the Security Principal
     * 
     */
    @Import(name="tenantId")
    private @Nullable Output<String> tenantId;

    /**
     * @return UUID/GUID based Tenant Id of the Security Principal
     * 
     */
    public Optional<Output<String>> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    private AADBasedSecurityPrincipalArgs() {}

    private AADBasedSecurityPrincipalArgs(AADBasedSecurityPrincipalArgs $) {
        this.ledgerRoleName = $.ledgerRoleName;
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AADBasedSecurityPrincipalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AADBasedSecurityPrincipalArgs $;

        public Builder() {
            $ = new AADBasedSecurityPrincipalArgs();
        }

        public Builder(AADBasedSecurityPrincipalArgs defaults) {
            $ = new AADBasedSecurityPrincipalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ledgerRoleName LedgerRole associated with the Security Principal of Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerRoleName(@Nullable Output<Either<String,LedgerRoleName>> ledgerRoleName) {
            $.ledgerRoleName = ledgerRoleName;
            return this;
        }

        /**
         * @param ledgerRoleName LedgerRole associated with the Security Principal of Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerRoleName(Either<String,LedgerRoleName> ledgerRoleName) {
            return ledgerRoleName(Output.of(ledgerRoleName));
        }

        /**
         * @param ledgerRoleName LedgerRole associated with the Security Principal of Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerRoleName(String ledgerRoleName) {
            return ledgerRoleName(Either.ofLeft(ledgerRoleName));
        }

        /**
         * @param ledgerRoleName LedgerRole associated with the Security Principal of Ledger
         * 
         * @return builder
         * 
         */
        public Builder ledgerRoleName(LedgerRoleName ledgerRoleName) {
            return ledgerRoleName(Either.ofRight(ledgerRoleName));
        }

        /**
         * @param principalId UUID/GUID based Principal Id of the Security Principal
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId UUID/GUID based Principal Id of the Security Principal
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        /**
         * @param tenantId UUID/GUID based Tenant Id of the Security Principal
         * 
         * @return builder
         * 
         */
        public Builder tenantId(@Nullable Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId UUID/GUID based Tenant Id of the Security Principal
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        public AADBasedSecurityPrincipalArgs build() {
            return $;
        }
    }

}
