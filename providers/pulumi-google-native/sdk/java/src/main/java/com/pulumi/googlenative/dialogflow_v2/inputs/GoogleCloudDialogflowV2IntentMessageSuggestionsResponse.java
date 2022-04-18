// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageSuggestionResponse;
import java.util.List;
import java.util.Objects;


/**
 * The collection of suggestions.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageSuggestionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2IntentMessageSuggestionsResponse Empty = new GoogleCloudDialogflowV2IntentMessageSuggestionsResponse();

    /**
     * The list of suggested replies.
     * 
     */
    @Import(name="suggestions", required=true)
      private final List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions;

    public List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions() {
        return this.suggestions;
    }

    public GoogleCloudDialogflowV2IntentMessageSuggestionsResponse(List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions) {
        this.suggestions = Objects.requireNonNull(suggestions, "expected parameter 'suggestions' to be non-null");
    }

    private GoogleCloudDialogflowV2IntentMessageSuggestionsResponse() {
        this.suggestions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageSuggestionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageSuggestionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.suggestions = defaults.suggestions;
        }

        public Builder suggestions(List<GoogleCloudDialogflowV2IntentMessageSuggestionResponse> suggestions) {
            this.suggestions = Objects.requireNonNull(suggestions);
            return this;
        }
        public Builder suggestions(GoogleCloudDialogflowV2IntentMessageSuggestionResponse... suggestions) {
            return suggestions(List.of(suggestions));
        }        public GoogleCloudDialogflowV2IntentMessageSuggestionsResponse build() {
            return new GoogleCloudDialogflowV2IntentMessageSuggestionsResponse(suggestions);
        }
    }
}
