// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KeyVaultKeyReferenceResponse {
    /**
     * The URL referencing a key encryption key in Key Vault.
     * 
     */
    private final String keyUrl;
    /**
     * The relative URL of the Key Vault containing the key.
     * 
     */
    private final SubResourceResponse sourceVault;

    @CustomType.Constructor
    private KeyVaultKeyReferenceResponse(
        @CustomType.Parameter("keyUrl") String keyUrl,
        @CustomType.Parameter("sourceVault") SubResourceResponse sourceVault) {
        this.keyUrl = keyUrl;
        this.sourceVault = sourceVault;
    }

    /**
     * The URL referencing a key encryption key in Key Vault.
     * 
    */
    public String keyUrl() {
        return this.keyUrl;
    }
    /**
     * The relative URL of the Key Vault containing the key.
     * 
    */
    public SubResourceResponse sourceVault() {
        return this.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyUrl;
        private SubResourceResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder keyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }
        public Builder sourceVault(SubResourceResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }        public KeyVaultKeyReferenceResponse build() {
            return new KeyVaultKeyReferenceResponse(keyUrl, sourceVault);
        }
    }
}
