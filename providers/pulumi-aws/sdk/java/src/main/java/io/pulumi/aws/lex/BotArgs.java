// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex;

import io.pulumi.aws.lex.inputs.BotAbortStatementArgs;
import io.pulumi.aws.lex.inputs.BotClarificationPromptArgs;
import io.pulumi.aws.lex.inputs.BotIntentArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BotArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotArgs Empty = new BotArgs();

    /**
     * The message that Amazon Lex uses to abort a conversation. Attributes are documented under statement.
     * 
     */
    @InputImport(name="abortStatement", required=true)
      private final Input<BotAbortStatementArgs> abortStatement;

    public Input<BotAbortStatementArgs> getAbortStatement() {
        return this.abortStatement;
    }

    /**
     * By specifying true, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. For more information see the [Amazon Lex FAQ](https://aws.amazon.com/lex/faqs#data-security) and the [Amazon Lex PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-childDirected).
     * 
     */
    @InputImport(name="childDirected", required=true)
      private final Input<Boolean> childDirected;

    public Input<Boolean> getChildDirected() {
        return this.childDirected;
    }

    /**
     * The message that Amazon Lex uses when it doesn't understand the user's request. Attributes are documented under prompt.
     * 
     */
    @InputImport(name="clarificationPrompt")
      private final @Nullable Input<BotClarificationPromptArgs> clarificationPrompt;

    public Input<BotClarificationPromptArgs> getClarificationPrompt() {
        return this.clarificationPrompt == null ? Input.empty() : this.clarificationPrompt;
    }

    /**
     * Determines if a new bot version is created when the initial resource is created and on each update. Defaults to `false`.
     * 
     */
    @InputImport(name="createVersion")
      private final @Nullable Input<Boolean> createVersion;

    public Input<Boolean> getCreateVersion() {
        return this.createVersion == null ? Input.empty() : this.createVersion;
    }

    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * When set to true user utterances are sent to Amazon Comprehend for sentiment analysis. If you don't specify detectSentiment, the default is `false`.
     * 
     */
    @InputImport(name="detectSentiment")
      private final @Nullable Input<Boolean> detectSentiment;

    public Input<Boolean> getDetectSentiment() {
        return this.detectSentiment == null ? Input.empty() : this.detectSentiment;
    }

    /**
     * Set to `true` to enable access to natural language understanding improvements. When you set the `enable_model_improvements` parameter to true you can use the `nlu_intent_confidence_threshold` parameter to configure confidence scores. For more information, see [Confidence Scores](https://docs.aws.amazon.com/lex/latest/dg/confidence-scores.html). You can only set the `enable_model_improvements` parameter in certain Regions. If you set the parameter to true, your bot has access to accuracy improvements. For more information see the [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-enableModelImprovements).
     * 
     */
    @InputImport(name="enableModelImprovements")
      private final @Nullable Input<Boolean> enableModelImprovements;

    public Input<Boolean> getEnableModelImprovements() {
        return this.enableModelImprovements == null ? Input.empty() : this.enableModelImprovements;
    }

    /**
     * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. Default is `300`. Must be a number between 60 and 86400 (inclusive).
     * 
     */
    @InputImport(name="idleSessionTtlInSeconds")
      private final @Nullable Input<Integer> idleSessionTtlInSeconds;

    public Input<Integer> getIdleSessionTtlInSeconds() {
        return this.idleSessionTtlInSeconds == null ? Input.empty() : this.idleSessionTtlInSeconds;
    }

    /**
     * A set of Intent objects. Each intent represents a command that a user can express. Attributes are documented under intent. Can have up to 100 Intent objects.
     * 
     */
    @InputImport(name="intents", required=true)
      private final Input<List<BotIntentArgs>> intents;

    public Input<List<BotIntentArgs>> getIntents() {
        return this.intents;
    }

    /**
     * Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot. For available locales, see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-locale). Default is `en-US`.
     * 
     */
    @InputImport(name="locale")
      private final @Nullable Input<String> locale;

    public Input<String> getLocale() {
        return this.locale == null ? Input.empty() : this.locale;
    }

    /**
     * The name of the bot that you want to create, case sensitive. Must be between 2 and 50 characters in length.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Determines the threshold where Amazon Lex will insert the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent and AMAZON.KendraSearchIntent are only inserted if they are configured for the bot. For more information see [Amazon Lex Bot PutBot API Docs](https://docs.aws.amazon.com/lex/latest/dg/API_PutBot.html#lex-PutBot-request-nluIntentConfidenceThreshold) This value requires `enable_model_improvements` to be set to `true` and the default is `0`. Must be a float between 0 and 1.
     * 
     */
    @InputImport(name="nluIntentConfidenceThreshold")
      private final @Nullable Input<Double> nluIntentConfidenceThreshold;

    public Input<Double> getNluIntentConfidenceThreshold() {
        return this.nluIntentConfidenceThreshold == null ? Input.empty() : this.nluIntentConfidenceThreshold;
    }

    /**
     * If you set the `process_behavior` element to `BUILD`, Amazon Lex builds the bot so that it can be run. If you set the element to `SAVE` Amazon Lex saves the bot, but doesn't build it. Default is `SAVE`.
     * 
     */
    @InputImport(name="processBehavior")
      private final @Nullable Input<String> processBehavior;

    public Input<String> getProcessBehavior() {
        return this.processBehavior == null ? Input.empty() : this.processBehavior;
    }

    /**
     * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see [Available Voices](http://docs.aws.amazon.com/polly/latest/dg/voicelist.html) in the Amazon Polly Developer Guide.
     * 
     */
    @InputImport(name="voiceId")
      private final @Nullable Input<String> voiceId;

    public Input<String> getVoiceId() {
        return this.voiceId == null ? Input.empty() : this.voiceId;
    }

    public BotArgs(
        Input<BotAbortStatementArgs> abortStatement,
        Input<Boolean> childDirected,
        @Nullable Input<BotClarificationPromptArgs> clarificationPrompt,
        @Nullable Input<Boolean> createVersion,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> detectSentiment,
        @Nullable Input<Boolean> enableModelImprovements,
        @Nullable Input<Integer> idleSessionTtlInSeconds,
        Input<List<BotIntentArgs>> intents,
        @Nullable Input<String> locale,
        @Nullable Input<String> name,
        @Nullable Input<Double> nluIntentConfidenceThreshold,
        @Nullable Input<String> processBehavior,
        @Nullable Input<String> voiceId) {
        this.abortStatement = Objects.requireNonNull(abortStatement, "expected parameter 'abortStatement' to be non-null");
        this.childDirected = Objects.requireNonNull(childDirected, "expected parameter 'childDirected' to be non-null");
        this.clarificationPrompt = clarificationPrompt;
        this.createVersion = createVersion;
        this.description = description;
        this.detectSentiment = detectSentiment;
        this.enableModelImprovements = enableModelImprovements;
        this.idleSessionTtlInSeconds = idleSessionTtlInSeconds;
        this.intents = Objects.requireNonNull(intents, "expected parameter 'intents' to be non-null");
        this.locale = locale;
        this.name = name;
        this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
        this.processBehavior = processBehavior;
        this.voiceId = voiceId;
    }

    private BotArgs() {
        this.abortStatement = Input.empty();
        this.childDirected = Input.empty();
        this.clarificationPrompt = Input.empty();
        this.createVersion = Input.empty();
        this.description = Input.empty();
        this.detectSentiment = Input.empty();
        this.enableModelImprovements = Input.empty();
        this.idleSessionTtlInSeconds = Input.empty();
        this.intents = Input.empty();
        this.locale = Input.empty();
        this.name = Input.empty();
        this.nluIntentConfidenceThreshold = Input.empty();
        this.processBehavior = Input.empty();
        this.voiceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BotAbortStatementArgs> abortStatement;
        private Input<Boolean> childDirected;
        private @Nullable Input<BotClarificationPromptArgs> clarificationPrompt;
        private @Nullable Input<Boolean> createVersion;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> detectSentiment;
        private @Nullable Input<Boolean> enableModelImprovements;
        private @Nullable Input<Integer> idleSessionTtlInSeconds;
        private Input<List<BotIntentArgs>> intents;
        private @Nullable Input<String> locale;
        private @Nullable Input<String> name;
        private @Nullable Input<Double> nluIntentConfidenceThreshold;
        private @Nullable Input<String> processBehavior;
        private @Nullable Input<String> voiceId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortStatement = defaults.abortStatement;
    	      this.childDirected = defaults.childDirected;
    	      this.clarificationPrompt = defaults.clarificationPrompt;
    	      this.createVersion = defaults.createVersion;
    	      this.description = defaults.description;
    	      this.detectSentiment = defaults.detectSentiment;
    	      this.enableModelImprovements = defaults.enableModelImprovements;
    	      this.idleSessionTtlInSeconds = defaults.idleSessionTtlInSeconds;
    	      this.intents = defaults.intents;
    	      this.locale = defaults.locale;
    	      this.name = defaults.name;
    	      this.nluIntentConfidenceThreshold = defaults.nluIntentConfidenceThreshold;
    	      this.processBehavior = defaults.processBehavior;
    	      this.voiceId = defaults.voiceId;
        }

        public Builder abortStatement(Input<BotAbortStatementArgs> abortStatement) {
            this.abortStatement = Objects.requireNonNull(abortStatement);
            return this;
        }

        public Builder abortStatement(BotAbortStatementArgs abortStatement) {
            this.abortStatement = Input.of(Objects.requireNonNull(abortStatement));
            return this;
        }

        public Builder childDirected(Input<Boolean> childDirected) {
            this.childDirected = Objects.requireNonNull(childDirected);
            return this;
        }

        public Builder childDirected(Boolean childDirected) {
            this.childDirected = Input.of(Objects.requireNonNull(childDirected));
            return this;
        }

        public Builder clarificationPrompt(@Nullable Input<BotClarificationPromptArgs> clarificationPrompt) {
            this.clarificationPrompt = clarificationPrompt;
            return this;
        }

        public Builder clarificationPrompt(@Nullable BotClarificationPromptArgs clarificationPrompt) {
            this.clarificationPrompt = Input.ofNullable(clarificationPrompt);
            return this;
        }

        public Builder createVersion(@Nullable Input<Boolean> createVersion) {
            this.createVersion = createVersion;
            return this;
        }

        public Builder createVersion(@Nullable Boolean createVersion) {
            this.createVersion = Input.ofNullable(createVersion);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder detectSentiment(@Nullable Input<Boolean> detectSentiment) {
            this.detectSentiment = detectSentiment;
            return this;
        }

        public Builder detectSentiment(@Nullable Boolean detectSentiment) {
            this.detectSentiment = Input.ofNullable(detectSentiment);
            return this;
        }

        public Builder enableModelImprovements(@Nullable Input<Boolean> enableModelImprovements) {
            this.enableModelImprovements = enableModelImprovements;
            return this;
        }

        public Builder enableModelImprovements(@Nullable Boolean enableModelImprovements) {
            this.enableModelImprovements = Input.ofNullable(enableModelImprovements);
            return this;
        }

        public Builder idleSessionTtlInSeconds(@Nullable Input<Integer> idleSessionTtlInSeconds) {
            this.idleSessionTtlInSeconds = idleSessionTtlInSeconds;
            return this;
        }

        public Builder idleSessionTtlInSeconds(@Nullable Integer idleSessionTtlInSeconds) {
            this.idleSessionTtlInSeconds = Input.ofNullable(idleSessionTtlInSeconds);
            return this;
        }

        public Builder intents(Input<List<BotIntentArgs>> intents) {
            this.intents = Objects.requireNonNull(intents);
            return this;
        }

        public Builder intents(List<BotIntentArgs> intents) {
            this.intents = Input.of(Objects.requireNonNull(intents));
            return this;
        }

        public Builder locale(@Nullable Input<String> locale) {
            this.locale = locale;
            return this;
        }

        public Builder locale(@Nullable String locale) {
            this.locale = Input.ofNullable(locale);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder nluIntentConfidenceThreshold(@Nullable Input<Double> nluIntentConfidenceThreshold) {
            this.nluIntentConfidenceThreshold = nluIntentConfidenceThreshold;
            return this;
        }

        public Builder nluIntentConfidenceThreshold(@Nullable Double nluIntentConfidenceThreshold) {
            this.nluIntentConfidenceThreshold = Input.ofNullable(nluIntentConfidenceThreshold);
            return this;
        }

        public Builder processBehavior(@Nullable Input<String> processBehavior) {
            this.processBehavior = processBehavior;
            return this;
        }

        public Builder processBehavior(@Nullable String processBehavior) {
            this.processBehavior = Input.ofNullable(processBehavior);
            return this;
        }

        public Builder voiceId(@Nullable Input<String> voiceId) {
            this.voiceId = voiceId;
            return this;
        }

        public Builder voiceId(@Nullable String voiceId) {
            this.voiceId = Input.ofNullable(voiceId);
            return this;
        }
        public BotArgs build() {
            return new BotArgs(abortStatement, childDirected, clarificationPrompt, createVersion, description, detectSentiment, enableModelImprovements, idleSessionTtlInSeconds, intents, locale, name, nluIntentConfidenceThreshold, processBehavior, voiceId);
        }
    }
}
