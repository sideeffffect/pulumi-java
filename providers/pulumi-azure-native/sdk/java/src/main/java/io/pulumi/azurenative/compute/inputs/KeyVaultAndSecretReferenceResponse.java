// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.SourceVaultResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Key Vault Secret Url and vault id of the encryption key
 * 
 */
public final class KeyVaultAndSecretReferenceResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultAndSecretReferenceResponse Empty = new KeyVaultAndSecretReferenceResponse();

    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    @InputImport(name="secretUrl", required=true)
      private final String secretUrl;

    public String getSecretUrl() {
        return this.secretUrl;
    }

    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    @InputImport(name="sourceVault", required=true)
      private final SourceVaultResponse sourceVault;

    public SourceVaultResponse getSourceVault() {
        return this.sourceVault;
    }

    public KeyVaultAndSecretReferenceResponse(
        String secretUrl,
        SourceVaultResponse sourceVault) {
        this.secretUrl = Objects.requireNonNull(secretUrl, "expected parameter 'secretUrl' to be non-null");
        this.sourceVault = Objects.requireNonNull(sourceVault, "expected parameter 'sourceVault' to be non-null");
    }

    private KeyVaultAndSecretReferenceResponse() {
        this.secretUrl = null;
        this.sourceVault = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultAndSecretReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String secretUrl;
        private SourceVaultResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultAndSecretReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretUrl = defaults.secretUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder secretUrl(String secretUrl) {
            this.secretUrl = Objects.requireNonNull(secretUrl);
            return this;
        }

        public Builder sourceVault(SourceVaultResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }
        public KeyVaultAndSecretReferenceResponse build() {
            return new KeyVaultAndSecretReferenceResponse(secretUrl, sourceVault);
        }
    }
}
