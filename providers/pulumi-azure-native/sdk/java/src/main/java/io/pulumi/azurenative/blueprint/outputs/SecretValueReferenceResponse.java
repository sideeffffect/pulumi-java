// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint.outputs;

import io.pulumi.azurenative.blueprint.outputs.KeyVaultReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretValueReferenceResponse {
    /**
     * Specifies the reference to a given Azure Key Vault.
     * 
     */
    private final KeyVaultReferenceResponse keyVault;
    /**
     * Name of the secret.
     * 
     */
    private final String secretName;
    /**
     * The version of the secret to use. If left blank, the latest version of the secret is used.
     * 
     */
    private final @Nullable String secretVersion;

    @OutputCustomType.Constructor
    private SecretValueReferenceResponse(
        @OutputCustomType.Parameter("keyVault") KeyVaultReferenceResponse keyVault,
        @OutputCustomType.Parameter("secretName") String secretName,
        @OutputCustomType.Parameter("secretVersion") @Nullable String secretVersion) {
        this.keyVault = keyVault;
        this.secretName = secretName;
        this.secretVersion = secretVersion;
    }

    /**
     * Specifies the reference to a given Azure Key Vault.
     * 
    */
    public KeyVaultReferenceResponse getKeyVault() {
        return this.keyVault;
    }
    /**
     * Name of the secret.
     * 
    */
    public String getSecretName() {
        return this.secretName;
    }
    /**
     * The version of the secret to use. If left blank, the latest version of the secret is used.
     * 
    */
    public Optional<String> getSecretVersion() {
        return Optional.ofNullable(this.secretVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretValueReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultReferenceResponse keyVault;
        private String secretName;
        private @Nullable String secretVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretValueReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVault = defaults.keyVault;
    	      this.secretName = defaults.secretName;
    	      this.secretVersion = defaults.secretVersion;
        }

        public Builder keyVault(KeyVaultReferenceResponse keyVault) {
            this.keyVault = Objects.requireNonNull(keyVault);
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
        public SecretValueReferenceResponse build() {
            return new SecretValueReferenceResponse(keyVault, secretName, secretVersion);
        }
    }
}
