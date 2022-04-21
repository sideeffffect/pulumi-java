// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning key vault encryption for a configuration store.
 * 
 */
public final class KeyVaultPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyVaultPropertiesArgs Empty = new KeyVaultPropertiesArgs();

    /**
     * The name of key used to encrypt data.
     * 
     */
    @Import(name="keyName")
    private @Nullable Output<String> keyName;

    public Optional<Output<String>> keyName() {
        return Optional.ofNullable(this.keyName);
    }

    /**
     * The key version of the key used to encrypt data.
     * 
     */
    @Import(name="keyVersion")
    private @Nullable Output<String> keyVersion;

    public Optional<Output<String>> keyVersion() {
        return Optional.ofNullable(this.keyVersion);
    }

    /**
     * The URI of the key vault key used to encrypt data.
     * 
     */
    @Import(name="keyvaultUri")
    private @Nullable Output<String> keyvaultUri;

    public Optional<Output<String>> keyvaultUri() {
        return Optional.ofNullable(this.keyvaultUri);
    }

    private KeyVaultPropertiesArgs() {}

    private KeyVaultPropertiesArgs(KeyVaultPropertiesArgs $) {
        this.keyName = $.keyName;
        this.keyVersion = $.keyVersion;
        this.keyvaultUri = $.keyvaultUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyVaultPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyVaultPropertiesArgs $;

        public Builder() {
            $ = new KeyVaultPropertiesArgs();
        }

        public Builder(KeyVaultPropertiesArgs defaults) {
            $ = new KeyVaultPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyName(@Nullable Output<String> keyName) {
            $.keyName = keyName;
            return this;
        }

        public Builder keyName(String keyName) {
            return keyName(Output.of(keyName));
        }

        public Builder keyVersion(@Nullable Output<String> keyVersion) {
            $.keyVersion = keyVersion;
            return this;
        }

        public Builder keyVersion(String keyVersion) {
            return keyVersion(Output.of(keyVersion));
        }

        public Builder keyvaultUri(@Nullable Output<String> keyvaultUri) {
            $.keyvaultUri = keyvaultUri;
            return this;
        }

        public Builder keyvaultUri(String keyvaultUri) {
            return keyvaultUri(Output.of(keyvaultUri));
        }

        public KeyVaultPropertiesArgs build() {
            return $;
        }
    }

}
