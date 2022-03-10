// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse {
    /**
     * Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
     * 
     */
    private final Integer recentSentencesCount;

    @OutputCustomType.Constructor
    private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse(@OutputCustomType.Parameter("recentSentencesCount") Integer recentSentencesCount) {
        this.recentSentencesCount = recentSentencesCount;
    }

    /**
     * Number of recent non-small-talk sentences to use as context for article and FAQ suggestion
     * 
    */
    public Integer getRecentSentencesCount() {
        return this.recentSentencesCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer recentSentencesCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recentSentencesCount = defaults.recentSentencesCount;
        }

        public Builder recentSentencesCount(Integer recentSentencesCount) {
            this.recentSentencesCount = Objects.requireNonNull(recentSentencesCount);
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse(recentSentencesCount);
        }
    }
}
