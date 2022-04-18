// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.outputs;

import com.pulumi.azurenative.powerplatform.outputs.KeyPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyVaultPropertiesResponse {
    /**
     * Uri of KeyVault
     * 
     */
    private final @Nullable String id;
    /**
     * Identity of the secret that includes name and version.
     * 
     */
    private final @Nullable KeyPropertiesResponse key;

    @CustomType.Constructor
    private KeyVaultPropertiesResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("key") @Nullable KeyPropertiesResponse key) {
        this.id = id;
        this.key = key;
    }

    /**
     * Uri of KeyVault
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Identity of the secret that includes name and version.
     * 
    */
    public Optional<KeyPropertiesResponse> key() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable KeyPropertiesResponse key;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder key(@Nullable KeyPropertiesResponse key) {
            this.key = key;
            return this;
        }        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(id, key);
        }
    }
}
