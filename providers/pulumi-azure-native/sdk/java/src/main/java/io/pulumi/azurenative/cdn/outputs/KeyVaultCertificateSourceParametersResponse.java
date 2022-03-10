// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultCertificateSourceParametersResponse {
    /**
     * Describes the action that shall be taken when the certificate is removed from Key Vault.
     * 
     */
    private final String deleteRule;
    private final String odataType;
    /**
     * Resource group of the user's Key Vault containing the SSL certificate
     * 
     */
    private final String resourceGroupName;
    /**
     * The name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     * 
     */
    private final String secretName;
    /**
     * The version(GUID) of Key Vault Secret in Key Vault.
     * 
     */
    private final @Nullable String secretVersion;
    /**
     * Subscription Id of the user's Key Vault containing the SSL certificate
     * 
     */
    private final String subscriptionId;
    /**
     * Describes the action that shall be taken when the certificate is updated in Key Vault.
     * 
     */
    private final String updateRule;
    /**
     * The name of the user's Key Vault containing the SSL certificate
     * 
     */
    private final String vaultName;

    @OutputCustomType.Constructor
    private KeyVaultCertificateSourceParametersResponse(
        @OutputCustomType.Parameter("deleteRule") String deleteRule,
        @OutputCustomType.Parameter("odataType") String odataType,
        @OutputCustomType.Parameter("resourceGroupName") String resourceGroupName,
        @OutputCustomType.Parameter("secretName") String secretName,
        @OutputCustomType.Parameter("secretVersion") @Nullable String secretVersion,
        @OutputCustomType.Parameter("subscriptionId") String subscriptionId,
        @OutputCustomType.Parameter("updateRule") String updateRule,
        @OutputCustomType.Parameter("vaultName") String vaultName) {
        this.deleteRule = deleteRule;
        this.odataType = odataType;
        this.resourceGroupName = resourceGroupName;
        this.secretName = secretName;
        this.secretVersion = secretVersion;
        this.subscriptionId = subscriptionId;
        this.updateRule = updateRule;
        this.vaultName = vaultName;
    }

    /**
     * Describes the action that shall be taken when the certificate is removed from Key Vault.
     * 
    */
    public String getDeleteRule() {
        return this.deleteRule;
    }
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Resource group of the user's Key Vault containing the SSL certificate
     * 
    */
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * The name of Key Vault Secret (representing the full certificate PFX) in Key Vault.
     * 
    */
    public String getSecretName() {
        return this.secretName;
    }
    /**
     * The version(GUID) of Key Vault Secret in Key Vault.
     * 
    */
    public Optional<String> getSecretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }
    /**
     * Subscription Id of the user's Key Vault containing the SSL certificate
     * 
    */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
    /**
     * Describes the action that shall be taken when the certificate is updated in Key Vault.
     * 
    */
    public String getUpdateRule() {
        return this.updateRule;
    }
    /**
     * The name of the user's Key Vault containing the SSL certificate
     * 
    */
    public String getVaultName() {
        return this.vaultName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultCertificateSourceParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deleteRule;
        private String odataType;
        private String resourceGroupName;
        private String secretName;
        private @Nullable String secretVersion;
        private String subscriptionId;
        private String updateRule;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultCertificateSourceParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteRule = defaults.deleteRule;
    	      this.odataType = defaults.odataType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.updateRule = defaults.updateRule;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder deleteRule(String deleteRule) {
            this.deleteRule = Objects.requireNonNull(deleteRule);
            return this;
        }

        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder secretName(String secretName) {
            this.secretName = Objects.requireNonNull(secretName);
            return this;
        }

        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder updateRule(String updateRule) {
            this.updateRule = Objects.requireNonNull(updateRule);
            return this;
        }

        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }
        public KeyVaultCertificateSourceParametersResponse build() {
            return new KeyVaultCertificateSourceParametersResponse(deleteRule, odataType, resourceGroupName, secretName, secretVersion, subscriptionId, updateRule, vaultName);
        }
    }
}
