// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datafusion_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The crypto key configuration. This field is used by the Customer-managed encryption keys (CMEK) feature.
 * 
 */
public final class CryptoKeyConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final CryptoKeyConfigArgs Empty = new CryptoKeyConfigArgs();

    /**
     * The name of the key which is used to encrypt/decrypt customer data. For key in Cloud KMS, the key should be in the format of `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*`.
     * 
     */
    @Import(name="keyReference")
    private @Nullable Output<String> keyReference;

    public Optional<Output<String>> keyReference() {
        return Optional.ofNullable(this.keyReference);
    }

    private CryptoKeyConfigArgs() {}

    private CryptoKeyConfigArgs(CryptoKeyConfigArgs $) {
        this.keyReference = $.keyReference;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyConfigArgs $;

        public Builder() {
            $ = new CryptoKeyConfigArgs();
        }

        public Builder(CryptoKeyConfigArgs defaults) {
            $ = new CryptoKeyConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyReference(@Nullable Output<String> keyReference) {
            $.keyReference = keyReference;
            return this;
        }

        public Builder keyReference(String keyReference) {
            return keyReference(Output.of(keyReference));
        }

        public CryptoKeyConfigArgs build() {
            return $;
        }
    }

}
