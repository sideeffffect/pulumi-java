// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1CallAnnotationResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse;
import io.pulumi.googlenative.contactcenterinsights_v1.outputs.GoogleCloudContactcenterinsightsV1IssueModelResultResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse {
    /**
     * A list of call annotations that apply to this call.
     * 
     */
    private final List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> annotations;
    /**
     * All the entities in the call.
     * 
     */
    private final Map<String,String> entities;
    /**
     * All the matched intents in the call.
     * 
     */
    private final Map<String,String> intents;
    /**
     * Overall conversation-level issue modeling result.
     * 
     */
    private final GoogleCloudContactcenterinsightsV1IssueModelResultResponse issueModelResult;
    /**
     * All the matched phrase matchers in the call.
     * 
     */
    private final Map<String,String> phraseMatchers;
    /**
     * Overall conversation-level sentiment for each channel of the call.
     * 
     */
    private final List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> sentiments;

    @OutputCustomType.Constructor({"annotations","entities","intents","issueModelResult","phraseMatchers","sentiments"})
    private GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse(
        List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> annotations,
        Map<String,String> entities,
        Map<String,String> intents,
        GoogleCloudContactcenterinsightsV1IssueModelResultResponse issueModelResult,
        Map<String,String> phraseMatchers,
        List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> sentiments) {
        this.annotations = annotations;
        this.entities = entities;
        this.intents = intents;
        this.issueModelResult = issueModelResult;
        this.phraseMatchers = phraseMatchers;
        this.sentiments = sentiments;
    }

    /**
     * A list of call annotations that apply to this call.
     * 
    */
    public List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> getAnnotations() {
        return this.annotations;
    }
    /**
     * All the entities in the call.
     * 
    */
    public Map<String,String> getEntities() {
        return this.entities;
    }
    /**
     * All the matched intents in the call.
     * 
    */
    public Map<String,String> getIntents() {
        return this.intents;
    }
    /**
     * Overall conversation-level issue modeling result.
     * 
    */
    public GoogleCloudContactcenterinsightsV1IssueModelResultResponse getIssueModelResult() {
        return this.issueModelResult;
    }
    /**
     * All the matched phrase matchers in the call.
     * 
    */
    public Map<String,String> getPhraseMatchers() {
        return this.phraseMatchers;
    }
    /**
     * Overall conversation-level sentiment for each channel of the call.
     * 
    */
    public List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> getSentiments() {
        return this.sentiments;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> annotations;
        private Map<String,String> entities;
        private Map<String,String> intents;
        private GoogleCloudContactcenterinsightsV1IssueModelResultResponse issueModelResult;
        private Map<String,String> phraseMatchers;
        private List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> sentiments;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.entities = defaults.entities;
    	      this.intents = defaults.intents;
    	      this.issueModelResult = defaults.issueModelResult;
    	      this.phraseMatchers = defaults.phraseMatchers;
    	      this.sentiments = defaults.sentiments;
        }

        public Builder setAnnotations(List<GoogleCloudContactcenterinsightsV1CallAnnotationResponse> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }

        public Builder setEntities(Map<String,String> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }

        public Builder setIntents(Map<String,String> intents) {
            this.intents = Objects.requireNonNull(intents);
            return this;
        }

        public Builder setIssueModelResult(GoogleCloudContactcenterinsightsV1IssueModelResultResponse issueModelResult) {
            this.issueModelResult = Objects.requireNonNull(issueModelResult);
            return this;
        }

        public Builder setPhraseMatchers(Map<String,String> phraseMatchers) {
            this.phraseMatchers = Objects.requireNonNull(phraseMatchers);
            return this;
        }

        public Builder setSentiments(List<GoogleCloudContactcenterinsightsV1ConversationLevelSentimentResponse> sentiments) {
            this.sentiments = Objects.requireNonNull(sentiments);
            return this;
        }
        public GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse build() {
            return new GoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadataResponse(annotations, entities, intents, issueModelResult, phraseMatchers, sentiments);
        }
    }
}
