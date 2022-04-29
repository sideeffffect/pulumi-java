// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs extends ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs();

    /**
     * The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    @Import(name="cryptoKeyName", required=true)
    private Output<String> cryptoKeyName;

    /**
     * @return The resource name of the KMS CryptoKey to use for unwrapping.
     * 
     */
    public Output<String> cryptoKeyName() {
        return this.cryptoKeyName;
    }

    /**
     * The wrapped data crypto key.
     * A base64-encoded string.
     * 
     */
    @Import(name="wrappedKey", required=true)
    private Output<String> wrappedKey;

    /**
     * @return The wrapped data crypto key.
     * A base64-encoded string.
     * 
     */
    public Output<String> wrappedKey() {
        return this.wrappedKey;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs $) {
        this.cryptoKeyName = $.cryptoKeyName;
        this.wrappedKey = $.wrappedKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cryptoKeyName The resource name of the KMS CryptoKey to use for unwrapping.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyName(Output<String> cryptoKeyName) {
            $.cryptoKeyName = cryptoKeyName;
            return this;
        }

        /**
         * @param cryptoKeyName The resource name of the KMS CryptoKey to use for unwrapping.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKeyName(String cryptoKeyName) {
            return cryptoKeyName(Output.of(cryptoKeyName));
        }

        /**
         * @param wrappedKey The wrapped data crypto key.
         * A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder wrappedKey(Output<String> wrappedKey) {
            $.wrappedKey = wrappedKey;
            return this;
        }

        /**
         * @param wrappedKey The wrapped data crypto key.
         * A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder wrappedKey(String wrappedKey) {
            return wrappedKey(Output.of(wrappedKey));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyKmsWrappedArgs build() {
            $.cryptoKeyName = Objects.requireNonNull($.cryptoKeyName, "expected parameter 'cryptoKeyName' to be non-null");
            $.wrappedKey = Objects.requireNonNull($.wrappedKey, "expected parameter 'wrappedKey' to be non-null");
            return $;
        }
    }

}
