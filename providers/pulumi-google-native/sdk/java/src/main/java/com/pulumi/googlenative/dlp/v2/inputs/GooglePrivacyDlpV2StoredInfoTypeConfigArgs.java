// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2DictionaryArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs;
import com.pulumi.googlenative.dlp.v2.inputs.GooglePrivacyDlpV2RegexArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for stored infoTypes. All fields and subfield are provided by the user. For more information, see https://cloud.google.com/dlp/docs/creating-custom-infotypes.
 * 
 */
public final class GooglePrivacyDlpV2StoredInfoTypeConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2StoredInfoTypeConfigArgs Empty = new GooglePrivacyDlpV2StoredInfoTypeConfigArgs();

    /**
     * Description of the StoredInfoType (max 256 characters).
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the StoredInfoType (max 256 characters).
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Store dictionary-based CustomInfoType.
     * 
     */
    @Import(name="dictionary")
    private @Nullable Output<GooglePrivacyDlpV2DictionaryArgs> dictionary;

    /**
     * @return Store dictionary-based CustomInfoType.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2DictionaryArgs>> dictionary() {
        return Optional.ofNullable(this.dictionary);
    }

    /**
     * Display name of the StoredInfoType (max 256 characters).
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Display name of the StoredInfoType (max 256 characters).
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * StoredInfoType where findings are defined by a dictionary of phrases.
     * 
     */
    @Import(name="largeCustomDictionary")
    private @Nullable Output<GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs> largeCustomDictionary;

    /**
     * @return StoredInfoType where findings are defined by a dictionary of phrases.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs>> largeCustomDictionary() {
        return Optional.ofNullable(this.largeCustomDictionary);
    }

    /**
     * Store regular expression-based StoredInfoType.
     * 
     */
    @Import(name="regex")
    private @Nullable Output<GooglePrivacyDlpV2RegexArgs> regex;

    /**
     * @return Store regular expression-based StoredInfoType.
     * 
     */
    public Optional<Output<GooglePrivacyDlpV2RegexArgs>> regex() {
        return Optional.ofNullable(this.regex);
    }

    private GooglePrivacyDlpV2StoredInfoTypeConfigArgs() {}

    private GooglePrivacyDlpV2StoredInfoTypeConfigArgs(GooglePrivacyDlpV2StoredInfoTypeConfigArgs $) {
        this.description = $.description;
        this.dictionary = $.dictionary;
        this.displayName = $.displayName;
        this.largeCustomDictionary = $.largeCustomDictionary;
        this.regex = $.regex;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GooglePrivacyDlpV2StoredInfoTypeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2StoredInfoTypeConfigArgs $;

        public Builder() {
            $ = new GooglePrivacyDlpV2StoredInfoTypeConfigArgs();
        }

        public Builder(GooglePrivacyDlpV2StoredInfoTypeConfigArgs defaults) {
            $ = new GooglePrivacyDlpV2StoredInfoTypeConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the StoredInfoType (max 256 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the StoredInfoType (max 256 characters).
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dictionary Store dictionary-based CustomInfoType.
         * 
         * @return builder
         * 
         */
        public Builder dictionary(@Nullable Output<GooglePrivacyDlpV2DictionaryArgs> dictionary) {
            $.dictionary = dictionary;
            return this;
        }

        /**
         * @param dictionary Store dictionary-based CustomInfoType.
         * 
         * @return builder
         * 
         */
        public Builder dictionary(GooglePrivacyDlpV2DictionaryArgs dictionary) {
            return dictionary(Output.of(dictionary));
        }

        /**
         * @param displayName Display name of the StoredInfoType (max 256 characters).
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of the StoredInfoType (max 256 characters).
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param largeCustomDictionary StoredInfoType where findings are defined by a dictionary of phrases.
         * 
         * @return builder
         * 
         */
        public Builder largeCustomDictionary(@Nullable Output<GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs> largeCustomDictionary) {
            $.largeCustomDictionary = largeCustomDictionary;
            return this;
        }

        /**
         * @param largeCustomDictionary StoredInfoType where findings are defined by a dictionary of phrases.
         * 
         * @return builder
         * 
         */
        public Builder largeCustomDictionary(GooglePrivacyDlpV2LargeCustomDictionaryConfigArgs largeCustomDictionary) {
            return largeCustomDictionary(Output.of(largeCustomDictionary));
        }

        /**
         * @param regex Store regular expression-based StoredInfoType.
         * 
         * @return builder
         * 
         */
        public Builder regex(@Nullable Output<GooglePrivacyDlpV2RegexArgs> regex) {
            $.regex = regex;
            return this;
        }

        /**
         * @param regex Store regular expression-based StoredInfoType.
         * 
         * @return builder
         * 
         */
        public Builder regex(GooglePrivacyDlpV2RegexArgs regex) {
            return regex(Output.of(regex));
        }

        public GooglePrivacyDlpV2StoredInfoTypeConfigArgs build() {
            return $;
        }
    }

}
