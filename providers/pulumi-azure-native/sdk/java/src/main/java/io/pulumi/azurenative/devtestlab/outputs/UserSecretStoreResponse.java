// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserSecretStoreResponse {
    /**
     * The ID of the user's Key vault.
     * 
     */
    private final @Nullable String keyVaultId;
    /**
     * The URI of the user's Key vault.
     * 
     */
    private final @Nullable String keyVaultUri;

    @OutputCustomType.Constructor
    private UserSecretStoreResponse(
        @OutputCustomType.Parameter("keyVaultId") @Nullable String keyVaultId,
        @OutputCustomType.Parameter("keyVaultUri") @Nullable String keyVaultUri) {
        this.keyVaultId = keyVaultId;
        this.keyVaultUri = keyVaultUri;
    }

    /**
     * The ID of the user's Key vault.
     * 
    */
    public Optional<String> getKeyVaultId() {
        return Optional.ofNullable(this.keyVaultId);
    }
    /**
     * The URI of the user's Key vault.
     * 
    */
    public Optional<String> getKeyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSecretStoreResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyVaultId;
        private @Nullable String keyVaultUri;

        public Builder() {
    	      // Empty
        }

        public Builder(UserSecretStoreResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyVaultId = defaults.keyVaultId;
    	      this.keyVaultUri = defaults.keyVaultUri;
        }

        public Builder keyVaultId(@Nullable String keyVaultId) {
            this.keyVaultId = keyVaultId;
            return this;
        }

        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            this.keyVaultUri = keyVaultUri;
            return this;
        }
        public UserSecretStoreResponse build() {
            return new UserSecretStoreResponse(keyVaultId, keyVaultUri);
        }
    }
}
