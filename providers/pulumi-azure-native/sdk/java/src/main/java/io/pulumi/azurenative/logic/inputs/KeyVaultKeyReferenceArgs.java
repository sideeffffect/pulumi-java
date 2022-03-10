// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.KeyVaultKeyReferenceKeyVaultArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The reference to the key vault key.
 * 
 */
public final class KeyVaultKeyReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyVaultKeyReferenceArgs Empty = new KeyVaultKeyReferenceArgs();

    /**
     * The private key name in key vault.
     * 
     */
    @InputImport(name="keyName", required=true)
      private final Input<String> keyName;

    public Input<String> getKeyName() {
        return this.keyName;
    }

    /**
     * The key vault reference.
     * 
     */
    @InputImport(name="keyVault", required=true)
      private final Input<KeyVaultKeyReferenceKeyVaultArgs> keyVault;

    public Input<KeyVaultKeyReferenceKeyVaultArgs> getKeyVault() {
        return this.keyVault;
    }

    /**
     * The private key version in key vault.
     * 
     */
    @InputImport(name="keyVersion")
      private final @Nullable Input<String> keyVersion;

    public Input<String> getKeyVersion() {
        return this.keyVersion == null ? Input.empty() : this.keyVersion;
    }

    public KeyVaultKeyReferenceArgs(
        Input<String> keyName,
        Input<KeyVaultKeyReferenceKeyVaultArgs> keyVault,
        @Nullable Input<String> keyVersion) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.keyVault = Objects.requireNonNull(keyVault, "expected parameter 'keyVault' to be non-null");
        this.keyVersion = keyVersion;
    }

    private KeyVaultKeyReferenceArgs() {
        this.keyName = Input.empty();
        this.keyVault = Input.empty();
        this.keyVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultKeyReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyName;
        private Input<KeyVaultKeyReferenceKeyVaultArgs> keyVault;
        private @Nullable Input<String> keyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultKeyReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVault = defaults.keyVault;
    	      this.keyVersion = defaults.keyVersion;
        }

        public Builder keyName(Input<String> keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder keyName(String keyName) {
            this.keyName = Input.of(Objects.requireNonNull(keyName));
            return this;
        }

        public Builder keyVault(Input<KeyVaultKeyReferenceKeyVaultArgs> keyVault) {
            this.keyVault = Objects.requireNonNull(keyVault);
            return this;
        }

        public Builder keyVault(KeyVaultKeyReferenceKeyVaultArgs keyVault) {
            this.keyVault = Input.of(Objects.requireNonNull(keyVault));
            return this;
        }

        public Builder keyVersion(@Nullable Input<String> keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = Input.ofNullable(keyVersion);
            return this;
        }
        public KeyVaultKeyReferenceArgs build() {
            return new KeyVaultKeyReferenceArgs(keyName, keyVault, keyVersion);
        }
    }
}
