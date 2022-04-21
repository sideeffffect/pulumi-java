// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cognitiveservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties to configure keyVault Properties
 * 
 */
public final class KeyVaultPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KeyVaultPropertiesResponse Empty = new KeyVaultPropertiesResponse();

    /**
     * Name of the Key from KeyVault
     * 
     */
    @Import(name="keyName")
    private @Nullable String keyName;

    public Optional<String> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * Uri of KeyVault
     * 
     */
    @Import(name="keyVaultUri")
    private @Nullable String keyVaultUri;

    public Optional<String> keyVaultUri() {
        return Optional.ofNullable(this.keyVaultUri);
    }

    /**
     * Version of the Key from KeyVault
     * 
     */
    @Import(name="keyVersion")
    private @Nullable String keyVersion;

    public Optional<String> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    private KeyVaultPropertiesResponse() {}

    private KeyVaultPropertiesResponse(KeyVaultPropertiesResponse $) {
        this.keyName = $.keyName;
        this.keyVaultUri = $.keyVaultUri;
        this.keyVersion = $.keyVersion;
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

        public Builder keyName(@Nullable String keyName) {
            $.keyName = keyName;
            return this;
        }

        public Builder keyVaultUri(@Nullable String keyVaultUri) {
            $.keyVaultUri = keyVaultUri;
            return this;
        }

        public Builder keyVersion(@Nullable String keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        public KeyVaultPropertiesResponse build() {
            return $;
        }
    }

}
