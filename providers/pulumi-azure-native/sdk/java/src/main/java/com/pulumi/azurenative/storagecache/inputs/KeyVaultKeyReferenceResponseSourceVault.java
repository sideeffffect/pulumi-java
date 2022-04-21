// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagecache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a resource Id to source Key Vault.
 * 
 */
public final class KeyVaultKeyReferenceResponseSourceVault extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultKeyReferenceResponseSourceVault Empty = new KeyVaultKeyReferenceResponseSourceVault();

    /**
     * Resource Id.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private KeyVaultKeyReferenceResponseSourceVault() {}

    private KeyVaultKeyReferenceResponseSourceVault(KeyVaultKeyReferenceResponseSourceVault $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultKeyReferenceResponseSourceVault defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultKeyReferenceResponseSourceVault $;

        public Builder() {
            $ = new KeyVaultKeyReferenceResponseSourceVault();
        }

        public Builder(KeyVaultKeyReferenceResponseSourceVault defaults) {
            $ = new KeyVaultKeyReferenceResponseSourceVault(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public KeyVaultKeyReferenceResponseSourceVault build() {
            return $;
        }
    }

}
