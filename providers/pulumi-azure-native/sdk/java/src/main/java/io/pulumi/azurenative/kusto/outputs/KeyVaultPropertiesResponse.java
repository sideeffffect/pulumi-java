// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    /**
     * The name of the key vault key.
     * 
     */
    private final String keyName;
    /**
     * The Uri of the key vault.
     * 
     */
    private final String keyVaultUri;
    /**
     * The version of the key vault key.
     * 
     */
    private final @Nullable String keyVersion;
    /**
     * The user assigned identity (ARM resource id) that has access to the key.
     * 
     */
    private final @Nullable String userIdentity;

    @OutputCustomType.Constructor
    private KeyVaultPropertiesResponse(
        @OutputCustomType.Parameter("keyName") String keyName,
        @OutputCustomType.Parameter("keyVaultUri") String keyVaultUri,
        @OutputCustomType.Parameter("keyVersion") @Nullable String keyVersion,
        @OutputCustomType.Parameter("userIdentity") @Nullable String userIdentity) {
        this.keyName = keyName;
        this.keyVaultUri = keyVaultUri;
        this.keyVersion = keyVersion;
        this.userIdentity = userIdentity;
    }

    /**
     * The name of the key vault key.
     * 
    */
    public String getKeyName() {
        return this.keyName;
    }
    /**
     * The Uri of the key vault.
     * 
    */
    public String getKeyVaultUri() {
        return this.keyVaultUri;
    }
    /**
     * The version of the key vault key.
     * 
    */
    public Optional<String> getKeyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }
    /**
     * The user assigned identity (ARM resource id) that has access to the key.
     * 
    */
    public Optional<String> getUserIdentity() {
        return Optional.ofNullable(this.userIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String keyVaultUri;
        private @Nullable String keyVersion;
        private @Nullable String userIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.keyVaultUri = defaults.keyVaultUri;
    	      this.keyVersion = defaults.keyVersion;
    	      this.userIdentity = defaults.userIdentity;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }

        public Builder keyVaultUri(String keyVaultUri) {
            this.keyVaultUri = Objects.requireNonNull(keyVaultUri);
            return this;
        }

        public Builder keyVersion(@Nullable String keyVersion) {
            this.keyVersion = keyVersion;
            return this;
        }

        public Builder userIdentity(@Nullable String userIdentity) {
            this.userIdentity = userIdentity;
            return this;
        }
        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(keyName, keyVaultUri, keyVersion, userIdentity);
        }
    }
}
