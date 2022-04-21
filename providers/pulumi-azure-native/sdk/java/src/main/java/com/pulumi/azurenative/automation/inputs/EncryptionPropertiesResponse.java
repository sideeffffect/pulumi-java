// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.inputs.EncryptionPropertiesResponseIdentity;
import com.pulumi.azurenative.automation.inputs.KeyVaultPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption settings for automation account
 * 
 */
public final class EncryptionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionPropertiesResponse Empty = new EncryptionPropertiesResponse();

    /**
     * User identity used for CMK.
     * 
     */
    @Import(name="identity")
    private @Nullable EncryptionPropertiesResponseIdentity identity;

    public Optional<EncryptionPropertiesResponseIdentity> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Encryption Key Source
     * 
     */
    @Import(name="keySource")
    private @Nullable String keySource;

    public Optional<String> keySource() {
        return Optional.ofNullable(this.keySource);
    }

    /**
     * Key vault properties.
     * 
     */
    @Import(name="keyVaultProperties")
    private @Nullable KeyVaultPropertiesResponse keyVaultProperties;

    public Optional<KeyVaultPropertiesResponse> keyVaultProperties() {
        return Optional.ofNullable(this.keyVaultProperties);
    }

    private EncryptionPropertiesResponse() {}

    private EncryptionPropertiesResponse(EncryptionPropertiesResponse $) {
        this.identity = $.identity;
        this.keySource = $.keySource;
        this.keyVaultProperties = $.keyVaultProperties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionPropertiesResponse $;

        public Builder() {
            $ = new EncryptionPropertiesResponse();
        }

        public Builder(EncryptionPropertiesResponse defaults) {
            $ = new EncryptionPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder identity(@Nullable EncryptionPropertiesResponseIdentity identity) {
            $.identity = identity;
            return this;
        }

        public Builder keySource(@Nullable String keySource) {
            $.keySource = keySource;
            return this;
        }

        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            $.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public EncryptionPropertiesResponse build() {
            return $;
        }
    }

}
