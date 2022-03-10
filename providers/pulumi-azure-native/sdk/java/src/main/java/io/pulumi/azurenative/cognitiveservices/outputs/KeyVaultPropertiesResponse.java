// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    /**
     * Name of the Key from KeyVault
     * 
     */
    private final @Nullable String keyName;
    /**
     * Uri of KeyVault
     * 
     */
    private final @Nullable String keyVaultUri;
    /**
     * Version of the Key from KeyVault
     * 
     */
    private final @Nullable String keyVersion;

    @OutputCustomType.Constructor
    private KeyVaultPropertiesResponse(
        @OutputCustomType.Parameter("keyName") @Nullable String keyName,
        @OutputCustomType.Parameter("keyVaultUri") @Nullable String keyVaultUri,
        @OutputCustomType.Parameter("keyVersion") @Nullable String keyVersion) {
        this.keyName = keyName;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
    }

    /**
     * Name of the Key from KeyVault
     * 
    */
    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    /**
     * Uri of KeyVault
     * 
    */
    public Optional<String> getKeyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }
    /**
     * Version of the Key from KeyVault
     * 
    */
    public Optional<String> getKeyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String keyVaultUri;
        private @Nullable String keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder keyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyVaultUri, keyVersion);
        }
    }
}
