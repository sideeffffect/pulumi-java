// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotCustomVocabularyArgs;
import com.pulumi.awsnative.lex.inputs.BotIntentArgs;
import com.pulumi.awsnative.lex.inputs.BotSlotTypeArgs;
import com.pulumi.awsnative.lex.inputs.BotVoiceSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A locale in the bot, which contains the intents and slot types that the bot uses in conversations with users in the specified language and locale.
 * 
 */
public final class BotLocaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotLocaleArgs Empty = new BotLocaleArgs();

    @Import(name="customVocabulary")
    private @Nullable Output<BotCustomVocabularyArgs> customVocabulary;

    public Optional<Output<BotCustomVocabularyArgs>> customVocabulary() {
        return Optional.ofNullable(this.customVocabulary);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of intents
     * 
     */
    @Import(name="intents")
    private @Nullable Output<List<BotIntentArgs>> intents;

    /**
     * @return List of intents
     * 
     */
    public Optional<Output<List<BotIntentArgs>>> intents() {
        return Optional.ofNullable(this.intents);
    }

    @Import(name="localeId", required=true)
    private Output<String> localeId;

    public Output<String> localeId() {
        return this.localeId;
    }

    @Import(name="nluConfidenceThreshold", required=true)
    private Output<Double> nluConfidenceThreshold;

    public Output<Double> nluConfidenceThreshold() {
        return this.nluConfidenceThreshold;
    }

    /**
     * List of SlotTypes
     * 
     */
    @Import(name="slotTypes")
    private @Nullable Output<List<BotSlotTypeArgs>> slotTypes;

    /**
     * @return List of SlotTypes
     * 
     */
    public Optional<Output<List<BotSlotTypeArgs>>> slotTypes() {
        return Optional.ofNullable(this.slotTypes);
    }

    @Import(name="voiceSettings")
    private @Nullable Output<BotVoiceSettingsArgs> voiceSettings;

    public Optional<Output<BotVoiceSettingsArgs>> voiceSettings() {
        return Optional.ofNullable(this.voiceSettings);
    }

    private BotLocaleArgs() {}

    private BotLocaleArgs(BotLocaleArgs $) {
        this.customVocabulary = $.customVocabulary;
        this.description = $.description;
        this.intents = $.intents;
        this.localeId = $.localeId;
        this.nluConfidenceThreshold = $.nluConfidenceThreshold;
        this.slotTypes = $.slotTypes;
        this.voiceSettings = $.voiceSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotLocaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotLocaleArgs $;

        public Builder() {
            $ = new BotLocaleArgs();
        }

        public Builder(BotLocaleArgs defaults) {
            $ = new BotLocaleArgs(Objects.requireNonNull(defaults));
        }

        public Builder customVocabulary(@Nullable Output<BotCustomVocabularyArgs> customVocabulary) {
            $.customVocabulary = customVocabulary;
            return this;
        }

        public Builder customVocabulary(BotCustomVocabularyArgs customVocabulary) {
            return customVocabulary(Output.of(customVocabulary));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param intents List of intents
         * 
         * @return builder
         * 
         */
        public Builder intents(@Nullable Output<List<BotIntentArgs>> intents) {
            $.intents = intents;
            return this;
        }

        /**
         * @param intents List of intents
         * 
         * @return builder
         * 
         */
        public Builder intents(List<BotIntentArgs> intents) {
            return intents(Output.of(intents));
        }

        /**
         * @param intents List of intents
         * 
         * @return builder
         * 
         */
        public Builder intents(BotIntentArgs... intents) {
            return intents(List.of(intents));
        }

        public Builder localeId(Output<String> localeId) {
            $.localeId = localeId;
            return this;
        }

        public Builder localeId(String localeId) {
            return localeId(Output.of(localeId));
        }

        public Builder nluConfidenceThreshold(Output<Double> nluConfidenceThreshold) {
            $.nluConfidenceThreshold = nluConfidenceThreshold;
            return this;
        }

        public Builder nluConfidenceThreshold(Double nluConfidenceThreshold) {
            return nluConfidenceThreshold(Output.of(nluConfidenceThreshold));
        }

        /**
         * @param slotTypes List of SlotTypes
         * 
         * @return builder
         * 
         */
        public Builder slotTypes(@Nullable Output<List<BotSlotTypeArgs>> slotTypes) {
            $.slotTypes = slotTypes;
            return this;
        }

        /**
         * @param slotTypes List of SlotTypes
         * 
         * @return builder
         * 
         */
        public Builder slotTypes(List<BotSlotTypeArgs> slotTypes) {
            return slotTypes(Output.of(slotTypes));
        }

        /**
         * @param slotTypes List of SlotTypes
         * 
         * @return builder
         * 
         */
        public Builder slotTypes(BotSlotTypeArgs... slotTypes) {
            return slotTypes(List.of(slotTypes));
        }

        public Builder voiceSettings(@Nullable Output<BotVoiceSettingsArgs> voiceSettings) {
            $.voiceSettings = voiceSettings;
            return this;
        }

        public Builder voiceSettings(BotVoiceSettingsArgs voiceSettings) {
            return voiceSettings(Output.of(voiceSettings));
        }

        public BotLocaleArgs build() {
            $.localeId = Objects.requireNonNull($.localeId, "expected parameter 'localeId' to be non-null");
            $.nluConfidenceThreshold = Objects.requireNonNull($.nluConfidenceThreshold, "expected parameter 'nluConfidenceThreshold' to be non-null");
            return $;
        }
    }

}
