// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.azurenative.datalakestore.enums.EncryptionConfigType;
import com.pulumi.azurenative.datalakestore.inputs.KeyVaultMetaInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The encryption configuration for the account.
 * 
 */
public final class EncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EncryptionConfigArgs Empty = new EncryptionConfigArgs();

    /**
     * The Key Vault information for connecting to user managed encryption keys.
     * 
     */
    @Import(name="keyVaultMetaInfo")
    private @Nullable Output<KeyVaultMetaInfoArgs> keyVaultMetaInfo;

    public Optional<Output<KeyVaultMetaInfoArgs>> keyVaultMetaInfo() {
        return Optional.ofNullable(this.keyVaultMetaInfo);
    }

    /**
     * The type of encryption configuration being used. Currently the only supported types are &#39;UserManaged&#39; and &#39;ServiceManaged&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<EncryptionConfigType> type;

    public Output<EncryptionConfigType> type() {
        return this.type;
    }

    private EncryptionConfigArgs() {}

    private EncryptionConfigArgs(EncryptionConfigArgs $) {
        this.keyVaultMetaInfo = $.keyVaultMetaInfo;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptionConfigArgs $;

        public Builder() {
            $ = new EncryptionConfigArgs();
        }

        public Builder(EncryptionConfigArgs defaults) {
            $ = new EncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyVaultMetaInfo(@Nullable Output<KeyVaultMetaInfoArgs> keyVaultMetaInfo) {
            $.keyVaultMetaInfo = keyVaultMetaInfo;
            return this;
        }

        public Builder keyVaultMetaInfo(KeyVaultMetaInfoArgs keyVaultMetaInfo) {
            return keyVaultMetaInfo(Output.of(keyVaultMetaInfo));
        }

        public Builder type(Output<EncryptionConfigType> type) {
            $.type = type;
            return this;
        }

        public Builder type(EncryptionConfigType type) {
            return type(Output.of(type));
        }

        public EncryptionConfigArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
