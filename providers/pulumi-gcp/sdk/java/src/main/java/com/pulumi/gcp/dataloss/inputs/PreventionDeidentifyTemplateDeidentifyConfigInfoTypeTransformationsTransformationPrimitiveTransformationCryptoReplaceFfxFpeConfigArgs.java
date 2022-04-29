// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs;
import com.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs extends ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs();

    /**
     * Common alphabets.
     * Possible values are `FFX_COMMON_NATIVE_ALPHABET_UNSPECIFIED`, `NUMERIC`, `HEXADECIMAL`, `UPPER_CASE_ALPHA_NUMERIC`, and `ALPHA_NUMERIC`.
     * 
     */
    @Import(name="commonAlphabet")
    private @Nullable Output<String> commonAlphabet;

    /**
     * @return Common alphabets.
     * Possible values are `FFX_COMMON_NATIVE_ALPHABET_UNSPECIFIED`, `NUMERIC`, `HEXADECIMAL`, `UPPER_CASE_ALPHA_NUMERIC`, and `ALPHA_NUMERIC`.
     * 
     */
    public Optional<Output<String>> commonAlphabet() {
        return Optional.ofNullable(this.commonAlphabet);
    }

    /**
     * The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used.
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
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs> context;

    /**
     * @return The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used.
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
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The key used by the encryption algorithm.
     * Structure is documented below.
     * 
     */
    @Import(name="cryptoKey")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs> cryptoKey;

    /**
     * @return The key used by the encryption algorithm.
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs>> cryptoKey() {
        return Optional.ofNullable(this.cryptoKey);
    }

    /**
     * This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range \[2, 95\]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is:
     * ``0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&amp;*()_-+={[}]|:;&#34;&#39;&lt;,&gt;.?/``
     * 
     */
    @Import(name="customAlphabet")
    private @Nullable Output<String> customAlphabet;

    /**
     * @return This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range \[2, 95\]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is:
     * ``0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&amp;*()_-+={[}]|:;&#34;&#39;&lt;,&gt;.?/``
     * 
     */
    public Optional<Output<String>> customAlphabet() {
        return Optional.ofNullable(this.customAlphabet);
    }

    /**
     * The native way to select the alphabet. Must be in the range \[2, 95\].
     * 
     */
    @Import(name="radix")
    private @Nullable Output<Integer> radix;

    /**
     * @return The native way to select the alphabet. Must be in the range \[2, 95\].
     * 
     */
    public Optional<Output<Integer>> radix() {
        return Optional.ofNullable(this.radix);
    }

    /**
     * The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
     * For example, if the name of custom infoType is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     * This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
     * In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE
     * Structure is documented below.
     * 
     */
    @Import(name="surrogateInfoType")
    private @Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs> surrogateInfoType;

    /**
     * @return The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
     * For example, if the name of custom infoType is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
     * This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
     * In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE
     * Structure is documented below.
     * 
     */
    public Optional<Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs>> surrogateInfoType() {
        return Optional.ofNullable(this.surrogateInfoType);
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs() {}

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs $) {
        this.commonAlphabet = $.commonAlphabet;
        this.context = $.context;
        this.cryptoKey = $.cryptoKey;
        this.customAlphabet = $.customAlphabet;
        this.radix = $.radix;
        this.surrogateInfoType = $.surrogateInfoType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs $;

        public Builder() {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs();
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs defaults) {
            $ = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonAlphabet Common alphabets.
         * Possible values are `FFX_COMMON_NATIVE_ALPHABET_UNSPECIFIED`, `NUMERIC`, `HEXADECIMAL`, `UPPER_CASE_ALPHA_NUMERIC`, and `ALPHA_NUMERIC`.
         * 
         * @return builder
         * 
         */
        public Builder commonAlphabet(@Nullable Output<String> commonAlphabet) {
            $.commonAlphabet = commonAlphabet;
            return this;
        }

        /**
         * @param commonAlphabet Common alphabets.
         * Possible values are `FFX_COMMON_NATIVE_ALPHABET_UNSPECIFIED`, `NUMERIC`, `HEXADECIMAL`, `UPPER_CASE_ALPHA_NUMERIC`, and `ALPHA_NUMERIC`.
         * 
         * @return builder
         * 
         */
        public Builder commonAlphabet(String commonAlphabet) {
            return commonAlphabet(Output.of(commonAlphabet));
        }

        /**
         * @param context The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used.
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
         * @return builder
         * 
         */
        public Builder context(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs> context) {
            $.context = context;
            return this;
        }

        /**
         * @param context The &#39;tweak&#39;, a context may be used for higher security since the same identifier in two different contexts won&#39;t be given the same surrogate. If the context is not set, a default tweak will be used.
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
         * @return builder
         * 
         */
        public Builder context(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigContextArgs context) {
            return context(Output.of(context));
        }

        /**
         * @param cryptoKey The key used by the encryption algorithm.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs> cryptoKey) {
            $.cryptoKey = cryptoKey;
            return this;
        }

        /**
         * @param cryptoKey The key used by the encryption algorithm.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder cryptoKey(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigCryptoKeyArgs cryptoKey) {
            return cryptoKey(Output.of(cryptoKey));
        }

        /**
         * @param customAlphabet This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range \[2, 95\]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is:
         * ``0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&amp;*()_-+={[}]|:;&#34;&#39;&lt;,&gt;.?/``
         * 
         * @return builder
         * 
         */
        public Builder customAlphabet(@Nullable Output<String> customAlphabet) {
            $.customAlphabet = customAlphabet;
            return this;
        }

        /**
         * @param customAlphabet This is supported by mapping these to the alphanumeric characters that the FFX mode natively supports. This happens before/after encryption/decryption. Each character listed must appear only once. Number of characters must be in the range \[2, 95\]. This must be encoded as ASCII. The order of characters does not matter. The full list of allowed characters is:
         * ``0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ~`!@#$%^&amp;*()_-+={[}]|:;&#34;&#39;&lt;,&gt;.?/``
         * 
         * @return builder
         * 
         */
        public Builder customAlphabet(String customAlphabet) {
            return customAlphabet(Output.of(customAlphabet));
        }

        /**
         * @param radix The native way to select the alphabet. Must be in the range \[2, 95\].
         * 
         * @return builder
         * 
         */
        public Builder radix(@Nullable Output<Integer> radix) {
            $.radix = radix;
            return this;
        }

        /**
         * @param radix The native way to select the alphabet. Must be in the range \[2, 95\].
         * 
         * @return builder
         * 
         */
        public Builder radix(Integer radix) {
            return radix(Output.of(radix));
        }

        /**
         * @param surrogateInfoType The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
         * For example, if the name of custom infoType is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
         * This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
         * In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder surrogateInfoType(@Nullable Output<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs> surrogateInfoType) {
            $.surrogateInfoType = surrogateInfoType;
            return this;
        }

        /**
         * @param surrogateInfoType The custom infoType to annotate the surrogate with. This annotation will be applied to the surrogate by prefixing it with the name of the custom infoType followed by the number of characters comprising the surrogate. The following scheme defines the format: info\_type\_name(surrogate\_character\_count):surrogate
         * For example, if the name of custom infoType is &#39;MY\_TOKEN\_INFO\_TYPE&#39; and the surrogate is &#39;abc&#39;, the full replacement value will be: &#39;MY\_TOKEN\_INFO\_TYPE(3):abc&#39;
         * This annotation identifies the surrogate when inspecting content using the custom infoType [`SurrogateType`](https://cloud.google.com/dlp/docs/reference/rest/v2/InspectConfig#surrogatetype). This facilitates reversal of the surrogate when it occurs in free text.
         * In order for inspection to work properly, the name of this infoType must not occur naturally anywhere in your data; otherwise, inspection may find a surrogate that does not correspond to an actual identifier. Therefore, choose your custom infoType name carefully after considering what your data looks like. One way to select a name that has a high chance of yielding reliable detection is to include one or more unicode characters that are highly improbable to exist in your data. For example, assuming your data is entered from a regular ASCII keyboard, the symbol with the hex code point 29DD might be used like so: ⧝MY\_TOKEN\_TYPE
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder surrogateInfoType(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigSurrogateInfoTypeArgs surrogateInfoType) {
            return surrogateInfoType(Output.of(surrogateInfoType));
        }

        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCryptoReplaceFfxFpeConfigArgs build() {
            return $;
        }
    }

}
