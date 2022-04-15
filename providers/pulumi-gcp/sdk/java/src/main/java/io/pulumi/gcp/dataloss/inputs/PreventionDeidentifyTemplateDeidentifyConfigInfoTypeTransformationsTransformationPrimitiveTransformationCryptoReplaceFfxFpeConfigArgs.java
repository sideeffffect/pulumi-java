// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs();

    /**
     * Common alphabets.
     * Possible values are `FFX_COMMON_NATIVE_ALPHABET_UNSPECIFIED`, `NUMERIC`, `HEXADECIMAL`, `UPPER_CASE_ALPHA_NUMERIC`, and `ALPHA_NUMERIC`.
     * 
     */
    @Import(name="commonAlphabet")
      private final @Nullable Output<String> commonAlphabet;

    public Output<String> commonAlphabet() {
        return this.commonAlphabet == null ? Codegen.empty() : this.commonAlphabet;
    }

    /**
     * The 'tweak', a context may be used for higher security since the same identifier in two different contexts won't be given the same surrogate. If the context is not set, a default tweak will be used.
     * If the context is set but:
     * 1.  there is no record present when transforming a given value or
     * 2.  the field is not present when transforming a given value,
     *     a default tweak will be used.
     *     Note that case (1) is expected when an `InfoTypeTransformation` is applied to both structured and non-structured `ContentItem`s. Currently, the referenced field may be of value type integer or string.
     *     The tweak is constructed as a sequence of bytes in big endian byte order such that:
     * *   a 64 bit integer is encoded followed by a single byte of value 1
     * *   a string is encoded in UTF-8 format followed by a single byte of value 2
     *     Structure is documented below.
     * 
     */
    @Import(name="context")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs> context;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs> context() {
        return this.context == null ? Codegen.empty() : this.context;
    }

    /**
     * The key used by the encryption algorithm.
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoKey")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs> cryptoKey;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs> cryptoKey() {
        return this.cryptoKey == null ? Codegen.empty() : this.cryptoKey;
    }

    /**
     * This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range \[2, 95\]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is:
     * ``0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&*()_-+={[}]|:;"'<,>.?/``
     * 
     */
    @Import(name="customAlphabet")
      private final @Nullable Output<String> customAlphabet;

    public Output<String> customAlphabet() {
        return this.customAlphabet == null ? Codegen.empty() : this.customAlphabet;
    }

    /**
     * The native way to select the alphabet. Must be in the range \[2, 95\].
     * 
     */
    @Import(name="radix")
      private final @Nullable Output<Integer> radix;

    public Output<Integer> radix() {
        return this.radix == null ? Codegen.empty() : this.radix;
    }

    /**
     * The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
     * For example, if the name of custom infoType is 'MY\_TOKEN\_INFO\_TYPE' and the surrogate is 'abc', the full replacement value will be: 'MY\_TOKEN\_INFO\_TYPE(3):abc'
     * This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
     * In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE
     * Structure is documented below.
     * 
     */
    @Import(name="surrogateInfoType")
      private final @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs> surrogateInfoType;

    public Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs> surrogateInfoType() {
        return this.surrogateInfoType == null ? Codegen.empty() : this.surrogateInfoType;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs(
        @Nullable Output<String> commonAlphabet,
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs> context,
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs> cryptoKey,
        @Nullable Output<String> customAlphabet,
        @Nullable Output<Integer> radix,
        @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs> surrogateInfoType) {
        this.commonAlphabet = commonAlphabet;
        this.context = context;
        this.cryptoKey = cryptoKey;
        this.customAlphabet = customAlphabet;
        this.radix = radix;
        this.surrogateInfoType = surrogateInfoType;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs() {
        this.commonAlphabet = Codegen.empty();
        this.context = Codegen.empty();
        this.cryptoKey = Codegen.empty();
        this.customAlphabet = Codegen.empty();
        this.radix = Codegen.empty();
        this.surrogateInfoType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> commonAlphabet;
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs> context;
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs> cryptoKey;
        private @Nullable Output<String> customAlphabet;
        private @Nullable Output<Integer> radix;
        private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs> surrogateInfoType;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonAlphabet = defaults.commonAlphabet;
    	      this.context = defaults.context;
    	      this.cryptoKey = defaults.cryptoKey;
    	      this.customAlphabet = defaults.customAlphabet;
    	      this.radix = defaults.radix;
    	      this.surrogateInfoType = defaults.surrogateInfoType;
        }

        public Builder commonAlphabet(@Nullable Output<String> commonAlphabet) {
            this.commonAlphabet = commonAlphabet;
            return this;
        }
        public Builder commonAlphabet(@Nullable String commonAlphabet) {
            this.commonAlphabet = Codegen.ofNullable(commonAlphabet);
            return this;
        }
        public Builder context(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs> context) {
            this.context = context;
            return this;
        }
        public Builder context(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs context) {
            this.context = Codegen.ofNullable(context);
            return this;
        }
        public Builder cryptoKey(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs> cryptoKey) {
            this.cryptoKey = cryptoKey;
            return this;
        }
        public Builder cryptoKey(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs cryptoKey) {
            this.cryptoKey = Codegen.ofNullable(cryptoKey);
            return this;
        }
        public Builder customAlphabet(@Nullable Output<String> customAlphabet) {
            this.customAlphabet = customAlphabet;
            return this;
        }
        public Builder customAlphabet(@Nullable String customAlphabet) {
            this.customAlphabet = Codegen.ofNullable(customAlphabet);
            return this;
        }
        public Builder radix(@Nullable Output<Integer> radix) {
            this.radix = radix;
            return this;
        }
        public Builder radix(@Nullable Integer radix) {
            this.radix = Codegen.ofNullable(radix);
            return this;
        }
        public Builder surrogateInfoType(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs> surrogateInfoType) {
            this.surrogateInfoType = surrogateInfoType;
            return this;
        }
        public Builder surrogateInfoType(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs surrogateInfoType) {
            this.surrogateInfoType = Codegen.ofNullable(surrogateInfoType);
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs(commonAlphabet, context, cryptoKey, customAlphabet, radix, surrogateInfoType);
        }
    }
}
