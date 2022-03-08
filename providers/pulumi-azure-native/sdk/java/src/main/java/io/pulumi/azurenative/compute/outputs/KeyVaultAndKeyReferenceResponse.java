// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.SourceVaultResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class KeyVaultAndKeyReferenceResponse {
    /**
     * Url pointing to a key or secret in KeyVault
     * 
     */
    private final String keyUrl;
    /**
     * Resource id of the KeyVault containing the key or secret
     * 
     */
    private final SourceVaultResponse sourceVault;

    @OutputCustomType.Constructor({"keyUrl","sourceVault"})
    private KeyVaultAndKeyReferenceResponse(
        String keyUrl,
        SourceVaultResponse sourceVault) {
        this.keyUrl = keyUrl;
        this.sourceVault = sourceVault;
    }

    /**
     * Url pointing to a key or secret in KeyVault
     * 
    */
    public String getKeyUrl() {
        return this.keyUrl;
    }
    /**
     * Resource id of the KeyVault containing the key or secret
     * 
    */
    public SourceVaultResponse getSourceVault() {
        return this.sourceVault;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultAndKeyReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyUrl;
        private SourceVaultResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultAndKeyReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder setKeyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }

        public Builder setSourceVault(SourceVaultResponse sourceVault) {
            this.sourceVault = Objects.requireNonNull(sourceVault);
            return this;
        }
        public KeyVaultAndKeyReferenceResponse build() {
            return new KeyVaultAndKeyReferenceResponse(keyUrl, sourceVault);
        }
    }
}
