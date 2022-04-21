// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.KeyVaultLastAccessStatusContractPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KeyVault contract details.
 * 
 */
public final class KeyVaultContractPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultContractPropertiesResponse Empty = new KeyVaultContractPropertiesResponse();

    /**
     * SystemAssignedIdentity or UserAssignedIdentity Client Id which will be used to access key vault secret.
     * 
     */
    @Import(name="identityClientId")
    private @Nullable String identityClientId;

    public Optional<String> identityClientId() {
        return Optional.ofNullable(this.identityClientId);
    }

    /**
     * Last time sync and refresh status of secret from key vault.
     * 
     */
    @Import(name="lastStatus")
    private @Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus;

    public Optional<KeyVaultLastAccessStatusContractPropertiesResponse> lastStatus() {
        return Optional.ofNullable(this.lastStatus);
    }

    /**
     * Key vault secret identifier for fetching secret. Providing a versioned secret will prevent auto-refresh. This requires Api Management service to be configured with aka.ms/apimmsi
     * 
     */
    @Import(name="secretIdentifier")
    private @Nullable String secretIdentifier;

    public Optional<String> secretIdentifier() {
        return Optional.ofNullable(this.secretIdentifier);
    }

    private KeyVaultContractPropertiesResponse() {}

    private KeyVaultContractPropertiesResponse(KeyVaultContractPropertiesResponse $) {
        this.identityClientId = $.identityClientId;
        this.lastStatus = $.lastStatus;
        this.secretIdentifier = $.secretIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultContractPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultContractPropertiesResponse $;

        public Builder() {
            $ = new KeyVaultContractPropertiesResponse();
        }

        public Builder(KeyVaultContractPropertiesResponse defaults) {
            $ = new KeyVaultContractPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder identityClientId(@Nullable String identityClientId) {
            $.identityClientId = identityClientId;
            return this;
        }

        public Builder lastStatus(@Nullable KeyVaultLastAccessStatusContractPropertiesResponse lastStatus) {
            $.lastStatus = lastStatus;
            return this;
        }

        public Builder secretIdentifier(@Nullable String secretIdentifier) {
            $.secretIdentifier = secretIdentifier;
            return this;
        }

        public KeyVaultContractPropertiesResponse build() {
            return $;
        }
    }

}
