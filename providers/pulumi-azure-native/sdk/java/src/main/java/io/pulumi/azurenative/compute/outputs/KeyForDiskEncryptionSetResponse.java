// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.SourceVaultResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyForDiskEncryptionSetResponse {
    /**
     * Fully versioned Key Url pointing to a key in KeyVault. Version segment of the Url is required regardless of rotationToLatestKeyVersionEnabled value.
     * 
     */
    private final String keyUrl;
    /**
     * Resource id of the KeyVault containing the key or secret. This property is optional and cannot be used if the KeyVault subscription is not the same as the Disk Encryption Set subscription.
     * 
     */
    private final @Nullable SourceVaultResponse sourceVault;

    @OutputCustomType.Constructor
    private KeyForDiskEncryptionSetResponse(
        @OutputCustomType.Parameter("keyUrl") String keyUrl,
        @OutputCustomType.Parameter("sourceVault") @Nullable SourceVaultResponse sourceVault) {
        this.keyUrl = keyUrl;
        this.sourceVault = sourceVault;
    }

    /**
     * Fully versioned Key Url pointing to a key in KeyVault. Version segment of the Url is required regardless of rotationToLatestKeyVersionEnabled value.
     * 
    */
    public String getKeyUrl() {
        return this.keyUrl;
    }
    /**
     * Resource id of the KeyVault containing the key or secret. This property is optional and cannot be used if the KeyVault subscription is not the same as the Disk Encryption Set subscription.
     * 
    */
    public Optional<SourceVaultResponse> getSourceVault() {
        return Optional.ofNullable(this.sourceVault);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyForDiskEncryptionSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyUrl;
        private @Nullable SourceVaultResponse sourceVault;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyForDiskEncryptionSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyUrl = defaults.keyUrl;
    	      this.sourceVault = defaults.sourceVault;
        }

        public Builder keyUrl(String keyUrl) {
            this.keyUrl = Objects.requireNonNull(keyUrl);
            return this;
        }

        public Builder sourceVault(@Nullable SourceVaultResponse sourceVault) {
            this.sourceVault = sourceVault;
            return this;
        }
        public KeyForDiskEncryptionSetResponse build() {
            return new KeyForDiskEncryptionSetResponse(keyUrl, sourceVault);
        }
    }
}
