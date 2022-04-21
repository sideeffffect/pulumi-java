// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.inputs;

import com.pulumi.azurenative.powerplatform.inputs.KeyPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning key vault encryption for a configuration store.
 * 
 */
public final class KeyVaultPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * Uri of KeyVault
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Identity of the secret that includes name and version.
     * 
     */
    @Import(name="key")
    private @Nullable KeyPropertiesResponse key;

    public Optional<KeyPropertiesResponse> key() {
        return Optional.ofNullable(this.key);
    }

    private KeyVaultPropertiesResponse() {}

    private KeyVaultPropertiesResponse(KeyVaultPropertiesResponse $) {
        this.id = $.id;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultPropertiesResponse $;

        public Builder() {
            $ = new KeyVaultPropertiesResponse();
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
            $ = new KeyVaultPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder key(@Nullable KeyPropertiesResponse key) {
            $.key = key;
            return this;
        }

        public KeyVaultPropertiesResponse build() {
            return $;
        }
    }

}
