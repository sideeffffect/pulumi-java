// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BucketingConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CharacterMaskConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoDeterministicConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoHashConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DateShiftConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FixedSizeBucketingConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2RedactConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ReplaceDictionaryConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ReplaceValueConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TimePartConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule for transforming a value.
 * 
 */
public final class GooglePrivacyDlpV2PrimitiveTransformationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2PrimitiveTransformationArgs Empty = new GooglePrivacyDlpV2PrimitiveTransformationArgs();

    /**
     * Bucketing
     * 
     */
    @Import(name="bucketingConfig")
    private @Nullable Output<GooglePrivacyDlpV2BucketingConfigArgs> bucketingConfig;

    public Optional<Output<GooglePrivacyDlpV2BucketingConfigArgs>> bucketingConfig() {
        return Optional.ofNullable(this.bucketingConfig);
    }

    /**
     * Mask
     * 
     */
    @Import(name="characterMaskConfig")
    private @Nullable Output<GooglePrivacyDlpV2CharacterMaskConfigArgs> characterMaskConfig;

    public Optional<Output<GooglePrivacyDlpV2CharacterMaskConfigArgs>> characterMaskConfig() {
        return Optional.ofNullable(this.characterMaskConfig);
    }

    /**
     * Deterministic Crypto
     * 
     */
    @Import(name="cryptoDeterministicConfig")
    private @Nullable Output<GooglePrivacyDlpV2CryptoDeterministicConfigArgs> cryptoDeterministicConfig;

    public Optional<Output<GooglePrivacyDlpV2CryptoDeterministicConfigArgs>> cryptoDeterministicConfig() {
        return Optional.ofNullable(this.cryptoDeterministicConfig);
    }

    /**
     * Crypto
     * 
     */
    @Import(name="cryptoHashConfig")
    private @Nullable Output<GooglePrivacyDlpV2CryptoHashConfigArgs> cryptoHashConfig;

    public Optional<Output<GooglePrivacyDlpV2CryptoHashConfigArgs>> cryptoHashConfig() {
        return Optional.ofNullable(this.cryptoHashConfig);
    }

    /**
     * Ffx-Fpe
     * 
     */
    @Import(name="cryptoReplaceFfxFpeConfig")
    private @Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig;

    public Optional<Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs>> cryptoReplaceFfxFpeConfig() {
        return Optional.ofNullable(this.cryptoReplaceFfxFpeConfig);
    }

    /**
     * Date Shift
     * 
     */
    @Import(name="dateShiftConfig")
    private @Nullable Output<GooglePrivacyDlpV2DateShiftConfigArgs> dateShiftConfig;

    public Optional<Output<GooglePrivacyDlpV2DateShiftConfigArgs>> dateShiftConfig() {
        return Optional.ofNullable(this.dateShiftConfig);
    }

    /**
     * Fixed size bucketing
     * 
     */
    @Import(name="fixedSizeBucketingConfig")
    private @Nullable Output<GooglePrivacyDlpV2FixedSizeBucketingConfigArgs> fixedSizeBucketingConfig;

    public Optional<Output<GooglePrivacyDlpV2FixedSizeBucketingConfigArgs>> fixedSizeBucketingConfig() {
        return Optional.ofNullable(this.fixedSizeBucketingConfig);
    }

    /**
     * Redact
     * 
     */
    @Import(name="redactConfig")
    private @Nullable Output<GooglePrivacyDlpV2RedactConfigArgs> redactConfig;

    public Optional<Output<GooglePrivacyDlpV2RedactConfigArgs>> redactConfig() {
        return Optional.ofNullable(this.redactConfig);
    }

    /**
     * Replace with a specified value.
     * 
     */
    @Import(name="replaceConfig")
    private @Nullable Output<GooglePrivacyDlpV2ReplaceValueConfigArgs> replaceConfig;

    public Optional<Output<GooglePrivacyDlpV2ReplaceValueConfigArgs>> replaceConfig() {
        return Optional.ofNullable(this.replaceConfig);
    }

    /**
     * Replace with a value randomly drawn (with replacement) from a dictionary.
     * 
     */
    @Import(name="replaceDictionaryConfig")
    private @Nullable Output<GooglePrivacyDlpV2ReplaceDictionaryConfigArgs> replaceDictionaryConfig;

    public Optional<Output<GooglePrivacyDlpV2ReplaceDictionaryConfigArgs>> replaceDictionaryConfig() {
        return Optional.ofNullable(this.replaceDictionaryConfig);
    }

    /**
     * Replace with infotype
     * 
     */
    @Import(name="replaceWithInfoTypeConfig")
    private @Nullable Output<GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs> replaceWithInfoTypeConfig;

    public Optional<Output<GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs>> replaceWithInfoTypeConfig() {
        return Optional.ofNullable(this.replaceWithInfoTypeConfig);
    }

    /**
     * Time extraction
     * 
     */
    @Import(name="timePartConfig")
    private @Nullable Output<GooglePrivacyDlpV2TimePartConfigArgs> timePartConfig;

    public Optional<Output<GooglePrivacyDlpV2TimePartConfigArgs>> timePartConfig() {
        return Optional.ofNullable(this.timePartConfig);
    }

    private GooglePrivacyDlpV2PrimitiveTransformationArgs() {}

    private GooglePrivacyDlpV2PrimitiveTransformationArgs(GooglePrivacyDlpV2PrimitiveTransformationArgs $) {
        this.bucketingConfig = $.bucketingConfig;
        this.characterMaskConfig = $.characterMaskConfig;
        this.cryptoDeterministicConfig = $.cryptoDeterministicConfig;
        this.cryptoHashConfig = $.cryptoHashConfig;
        this.cryptoReplaceFfxFpeConfig = $.cryptoReplaceFfxFpeConfig;
        this.dateShiftConfig = $.dateShiftConfig;
        this.fixedSizeBucketingConfig = $.fixedSizeBucketingConfig;
        this.redactConfig = $.redactConfig;
        this.replaceConfig = $.replaceConfig;
        this.replaceDictionaryConfig = $.replaceDictionaryConfig;
        this.replaceWithInfoTypeConfig = $.replaceWithInfoTypeConfig;
        this.timePartConfig = $.timePartConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2PrimitiveTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2PrimitiveTransformationArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2PrimitiveTransformationArgs();
        }

        public Builder(GooglePrivacyDlpV2PrimitiveTransformationArgs defaults) {
            $ = new GooglePrivacyDlpV2PrimitiveTransformationArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketingConfig(@Nullable Output<GooglePrivacyDlpV2BucketingConfigArgs> bucketingConfig) {
            $.bucketingConfig = bucketingConfig;
            return this;
        }

        public Builder bucketingConfig(GooglePrivacyDlpV2BucketingConfigArgs bucketingConfig) {
            return bucketingConfig(Output.of(bucketingConfig));
        }

        public Builder characterMaskConfig(@Nullable Output<GooglePrivacyDlpV2CharacterMaskConfigArgs> characterMaskConfig) {
            $.characterMaskConfig = characterMaskConfig;
            return this;
        }

        public Builder characterMaskConfig(GooglePrivacyDlpV2CharacterMaskConfigArgs characterMaskConfig) {
            return characterMaskConfig(Output.of(characterMaskConfig));
        }

        public Builder cryptoDeterministicConfig(@Nullable Output<GooglePrivacyDlpV2CryptoDeterministicConfigArgs> cryptoDeterministicConfig) {
            $.cryptoDeterministicConfig = cryptoDeterministicConfig;
            return this;
        }

        public Builder cryptoDeterministicConfig(GooglePrivacyDlpV2CryptoDeterministicConfigArgs cryptoDeterministicConfig) {
            return cryptoDeterministicConfig(Output.of(cryptoDeterministicConfig));
        }

        public Builder cryptoHashConfig(@Nullable Output<GooglePrivacyDlpV2CryptoHashConfigArgs> cryptoHashConfig) {
            $.cryptoHashConfig = cryptoHashConfig;
            return this;
        }

        public Builder cryptoHashConfig(GooglePrivacyDlpV2CryptoHashConfigArgs cryptoHashConfig) {
            return cryptoHashConfig(Output.of(cryptoHashConfig));
        }

        public Builder cryptoReplaceFfxFpeConfig(@Nullable Output<GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs> cryptoReplaceFfxFpeConfig) {
            $.cryptoReplaceFfxFpeConfig = cryptoReplaceFfxFpeConfig;
            return this;
        }

        public Builder cryptoReplaceFfxFpeConfig(GooglePrivacyDlpV2CryptoReplaceFfxFpeConfigArgs cryptoReplaceFfxFpeConfig) {
            return cryptoReplaceFfxFpeConfig(Output.of(cryptoReplaceFfxFpeConfig));
        }

        public Builder dateShiftConfig(@Nullable Output<GooglePrivacyDlpV2DateShiftConfigArgs> dateShiftConfig) {
            $.dateShiftConfig = dateShiftConfig;
            return this;
        }

        public Builder dateShiftConfig(GooglePrivacyDlpV2DateShiftConfigArgs dateShiftConfig) {
            return dateShiftConfig(Output.of(dateShiftConfig));
        }

        public Builder fixedSizeBucketingConfig(@Nullable Output<GooglePrivacyDlpV2FixedSizeBucketingConfigArgs> fixedSizeBucketingConfig) {
            $.fixedSizeBucketingConfig = fixedSizeBucketingConfig;
            return this;
        }

        public Builder fixedSizeBucketingConfig(GooglePrivacyDlpV2FixedSizeBucketingConfigArgs fixedSizeBucketingConfig) {
            return fixedSizeBucketingConfig(Output.of(fixedSizeBucketingConfig));
        }

        public Builder redactConfig(@Nullable Output<GooglePrivacyDlpV2RedactConfigArgs> redactConfig) {
            $.redactConfig = redactConfig;
            return this;
        }

        public Builder redactConfig(GooglePrivacyDlpV2RedactConfigArgs redactConfig) {
            return redactConfig(Output.of(redactConfig));
        }

        public Builder replaceConfig(@Nullable Output<GooglePrivacyDlpV2ReplaceValueConfigArgs> replaceConfig) {
            $.replaceConfig = replaceConfig;
            return this;
        }

        public Builder replaceConfig(GooglePrivacyDlpV2ReplaceValueConfigArgs replaceConfig) {
            return replaceConfig(Output.of(replaceConfig));
        }

        public Builder replaceDictionaryConfig(@Nullable Output<GooglePrivacyDlpV2ReplaceDictionaryConfigArgs> replaceDictionaryConfig) {
            $.replaceDictionaryConfig = replaceDictionaryConfig;
            return this;
        }

        public Builder replaceDictionaryConfig(GooglePrivacyDlpV2ReplaceDictionaryConfigArgs replaceDictionaryConfig) {
            return replaceDictionaryConfig(Output.of(replaceDictionaryConfig));
        }

        public Builder replaceWithInfoTypeConfig(@Nullable Output<GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs> replaceWithInfoTypeConfig) {
            $.replaceWithInfoTypeConfig = replaceWithInfoTypeConfig;
            return this;
        }

        public Builder replaceWithInfoTypeConfig(GooglePrivacyDlpV2ReplaceWithInfoTypeConfigArgs replaceWithInfoTypeConfig) {
            return replaceWithInfoTypeConfig(Output.of(replaceWithInfoTypeConfig));
        }

        public Builder timePartConfig(@Nullable Output<GooglePrivacyDlpV2TimePartConfigArgs> timePartConfig) {
            $.timePartConfig = timePartConfig;
            return this;
        }

        public Builder timePartConfig(GooglePrivacyDlpV2TimePartConfigArgs timePartConfig) {
            return timePartConfig(Output.of(timePartConfig));
        }

        public GooglePrivacyDlpV2PrimitiveTransformationArgs build() {
            return $;
        }
    }

}
