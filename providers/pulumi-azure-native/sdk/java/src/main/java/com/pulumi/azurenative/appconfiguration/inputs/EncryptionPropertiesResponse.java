// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration.inputs;

import com.pulumi.azurenative.appconfiguration.inputs.KeyVaultPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption settings for a configuration store.
 * 
 */
public final class EncryptionPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final EncryptionPropertiesResponse Empty = new EncryptionPropertiesResponse();

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

        public Builder keyVaultProperties(@Nullable KeyVaultPropertiesResponse keyVaultProperties) {
            $.keyVaultProperties = keyVaultProperties;
            return this;
        }

        public EncryptionPropertiesResponse build() {
            return $;
        }
    }

}
