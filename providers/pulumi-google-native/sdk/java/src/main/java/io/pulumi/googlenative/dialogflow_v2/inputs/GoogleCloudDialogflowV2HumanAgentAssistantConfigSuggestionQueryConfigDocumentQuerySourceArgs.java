// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Document source settings. Supported features: SMART_REPLY, SMART_COMPOSE.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs();

    /**
     * Knowledge documents to query from. Format: `projects//locations//knowledgeBases//documents/`. Currently, at most 5 documents are supported.
     * 
     */
    @InputImport(name="documents", required=true)
      private final Input<List<String>> documents;

    public Input<List<String>> getDocuments() {
        return this.documents;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs(Input<List<String>> documents) {
        this.documents = Objects.requireNonNull(documents, "expected parameter 'documents' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs() {
        this.documents = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> documents;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documents = defaults.documents;
        }

        public Builder documents(Input<List<String>> documents) {
            this.documents = Objects.requireNonNull(documents);
            return this;
        }

        public Builder documents(List<String> documents) {
            this.documents = Input.of(Objects.requireNonNull(documents));
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigDocumentQuerySourceArgs(documents);
        }
    }
}
