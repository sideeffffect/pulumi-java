// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Configuration for analyses to run on each conversation message.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse();

    /**
     * Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    @Import(name="enableEntityExtraction", required=true)
      private final Boolean enableEntityExtraction;

    public Boolean enableEntityExtraction() {
        return this.enableEntityExtraction;
    }

    /**
     * Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user's attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
     * 
     */
    @Import(name="enableSentimentAnalysis", required=true)
      private final Boolean enableSentimentAnalysis;

    public Boolean enableSentimentAnalysis() {
        return this.enableSentimentAnalysis;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse(
        Boolean enableEntityExtraction,
        Boolean enableSentimentAnalysis) {
        this.enableEntityExtraction = Objects.requireNonNull(enableEntityExtraction, "expected parameter 'enableEntityExtraction' to be non-null");
        this.enableSentimentAnalysis = Objects.requireNonNull(enableSentimentAnalysis, "expected parameter 'enableSentimentAnalysis' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse() {
        this.enableEntityExtraction = null;
        this.enableSentimentAnalysis = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableEntityExtraction;
        private Boolean enableSentimentAnalysis;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableEntityExtraction = defaults.enableEntityExtraction;
    	      this.enableSentimentAnalysis = defaults.enableSentimentAnalysis;
        }

        public Builder enableEntityExtraction(Boolean enableEntityExtraction) {
            this.enableEntityExtraction = Objects.requireNonNull(enableEntityExtraction);
            return this;
        }
        public Builder enableSentimentAnalysis(Boolean enableSentimentAnalysis) {
            this.enableSentimentAnalysis = Objects.requireNonNull(enableSentimentAnalysis);
            return this;
        }        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigMessageAnalysisConfigResponse(enableEntityExtraction, enableSentimentAnalysis);
        }
    }
}
