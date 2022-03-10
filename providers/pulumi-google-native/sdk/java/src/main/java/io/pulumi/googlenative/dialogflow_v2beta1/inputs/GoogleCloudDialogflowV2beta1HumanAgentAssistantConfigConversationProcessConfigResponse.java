// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Config to process conversation.
 * 
 */
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse Empty = new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse();

    /**
     * Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
     * 
     */
    @InputImport(name="recentSentencesCount", required=true)
      private final Integer recentSentencesCount;

    public Integer getRecentSentencesCount() {
        return this.recentSentencesCount;
    }

    public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse(Integer recentSentencesCount) {
        this.recentSentencesCount = Objects.requireNonNull(recentSentencesCount, "expected parameter 'recentSentencesCount' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse() {
        this.recentSentencesCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer recentSentencesCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recentSentencesCount = defaults.recentSentencesCount;
        }

        public Builder recentSentencesCount(Integer recentSentencesCount) {
            this.recentSentencesCount = Objects.requireNonNull(recentSentencesCount);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigConversationProcessConfigResponse(recentSentencesCount);
        }
    }
}
