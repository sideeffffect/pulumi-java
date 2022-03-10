// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for analyses to run on each conversation message.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs();

    /**
     * Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @InputImport(name="enableEntityExtraction")
      private final @Nullable Input<Boolean> enableEntityExtraction;

    public Input<Boolean> getEnableEntityExtraction() {
        return this.enableEntityExtraction == null ? Input.empty() : this.enableEntityExtraction;
    }

    /**
     * Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user's attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
     * 
     */
    @InputImport(name="enableSentimentAnalysis")
      private final @Nullable Input<Boolean> enableSentimentAnalysis;

    public Input<Boolean> getEnableSentimentAnalysis() {
        return this.enableSentimentAnalysis == null ? Input.empty() : this.enableSentimentAnalysis;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs(
        @Nullable Input<Boolean> enableEntityExtraction,
        @Nullable Input<Boolean> enableSentimentAnalysis) {
        this.enableEntityExtraction = enableEntityExtraction;
        this.enableSentimentAnalysis = enableSentimentAnalysis;
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs() {
        this.enableEntityExtraction = Input.empty();
        this.enableSentimentAnalysis = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableEntityExtraction;
        private @Nullable Input<Boolean> enableSentimentAnalysis;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableEntityExtraction = defaults.enableEntityExtraction;
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
        }

        public Builder enableEntityExtraction(@Nullable Input<Boolean> enableEntityExtraction) {
            this.enableEntityExtraction = enableEntityExtraction;
            return this;
        }

        public Builder enableEntityExtraction(@Nullable Boolean enableEntityExtraction) {
            this.enableEntityExtraction = Input.ofNullable(enableEntityExtraction);
            return this;
        }

        public Builder enableSentimentAnalysis(@Nullable Input<Boolean> enableSentimentAnalysis) {
            this.enableSentimentAnalysis = enableSentimentAnalysis;
            return this;
        }

        public Builder enableSentimentAnalysis(@Nullable Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = Input.ofNullable(enableSentimentAnalysis);
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigArgs(enableEntityExtraction, enableSentimentAnalysis);
        }
    }
}
