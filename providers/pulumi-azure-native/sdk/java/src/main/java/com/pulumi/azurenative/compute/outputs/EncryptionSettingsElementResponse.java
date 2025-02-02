// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.KeyVaultAndKeyReferenceResponse;
import com.pulumi.azurenative.compute.outputs.KeyVaultAndSecretReferenceResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EncryptionSettingsElementResponse {
    /**
     * @return Key Vault Secret Url and vault id of the disk encryption key
     * 
     */
    private final @Nullable KeyVaultAndSecretReferenceResponse diskEncryptionKey;
    /**
     * @return Key Vault Key Url and vault id of the key encryption key. KeyEncryptionKey is optional and when provided is used to unwrap the disk encryption key.
     * 
     */
    private final @Nullable KeyVaultAndKeyReferenceResponse keyEncryptionKey;

    @CustomType.Constructor
    private EncryptionSettingsElementResponse(
        @CustomType.Parameter("diskEncryptionKey") @Nullable KeyVaultAndSecretReferenceResponse diskEncryptionKey,
        @CustomType.Parameter("keyEncryptionKey") @Nullable KeyVaultAndKeyReferenceResponse keyEncryptionKey) {
        this.diskEncryptionKey = diskEncryptionKey;
        this.keyEncryptionKey = keyEncryptionKey;
    }

    /**
     * @return Key Vault Secret Url and vault id of the disk encryption key
     * 
     */
    public Optional<KeyVaultAndSecretReferenceResponse> diskEncryptionKey() {
        return Optional.ofNullable(this.diskEncryptionKey);
    }
    /**
     * @return Key Vault Key Url and vault id of the key encryption key. KeyEncryptionKey is optional and when provided is used to unwrap the disk encryption key.
     * 
     */
    public Optional<KeyVaultAndKeyReferenceResponse> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionSettingsElementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable KeyVaultAndSecretReferenceResponse diskEncryptionKey;
        private @Nullable KeyVaultAndKeyReferenceResponse keyEncryptionKey;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionSettingsElementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
        }

        public Builder diskEncryptionKey(@Nullable KeyVaultAndSecretReferenceResponse diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }
        public Builder keyEncryptionKey(@Nullable KeyVaultAndKeyReferenceResponse keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }        public EncryptionSettingsElementResponse build() {
            return new EncryptionSettingsElementResponse(diskEncryptionKey, keyEncryptionKey);
        }
    }
}
