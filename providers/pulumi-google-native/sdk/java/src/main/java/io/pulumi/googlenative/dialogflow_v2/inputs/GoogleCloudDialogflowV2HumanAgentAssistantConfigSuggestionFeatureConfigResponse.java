// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsResponse;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2SuggestionFeatureResponse;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Config for suggestion features.
 * 
 */
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse Empty = new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse();

    /**
     * Configs of custom conversation model.
     * 
     */
    @InputImport(name="conversationModelConfig", required=true)
      private final GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse conversationModelConfig;

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse getConversationModelConfig() {
        return this.conversationModelConfig;
    }

    /**
     * Configs for processing conversation.
     * 
     */
    @InputImport(name="conversationProcessConfig", required=true)
      private final GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse conversationProcessConfig;

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse getConversationProcessConfig() {
        return this.conversationProcessConfig;
    }

    /**
     * Automatically iterates all participants and tries to compile suggestions. Supported features: ARTICLE_SUGGESTION, FAQ, DIALOGFLOW_ASSIST.
     * 
     */
    @InputImport(name="enableEventBasedSuggestion", required=true)
      private final Boolean enableEventBasedSuggestion;

    public Boolean getEnableEventBasedSuggestion() {
        return this.enableEventBasedSuggestion;
    }

    /**
     * Configs of query.
     * 
     */
    @InputImport(name="queryConfig", required=true)
      private final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse queryConfig;

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse getQueryConfig() {
        return this.queryConfig;
    }

    /**
     * The suggestion feature.
     * 
     */
    @InputImport(name="suggestionFeature", required=true)
      private final GoogleCloudDialogflowV2SuggestionFeatureResponse suggestionFeature;

    public GoogleCloudDialogflowV2SuggestionFeatureResponse getSuggestionFeature() {
        return this.suggestionFeature;
    }

    /**
     * Settings of suggestion trigger. Currently, only ARTICLE_SUGGESTION and FAQ will use this field.
     * 
     */
    @InputImport(name="suggestionTriggerSettings", required=true)
      private final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsResponse suggestionTriggerSettings;

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsResponse getSuggestionTriggerSettings() {
        return this.suggestionTriggerSettings;
    }

    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse(
        GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse conversationModelConfig,
        GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse conversationProcessConfig,
        Boolean enableEventBasedSuggestion,
        GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse queryConfig,
        GoogleCloudDialogflowV2SuggestionFeatureResponse suggestionFeature,
        GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsResponse suggestionTriggerSettings) {
        this.conversationModelConfig = Objects.requireNonNull(conversationModelConfig, "expected parameter 'conversationModelConfig' to be non-null");
        this.conversationProcessConfig = Objects.requireNonNull(conversationProcessConfig, "expected parameter 'conversationProcessConfig' to be non-null");
        this.enableEventBasedSuggestion = Objects.requireNonNull(enableEventBasedSuggestion, "expected parameter 'enableEventBasedSuggestion' to be non-null");
        this.queryConfig = Objects.requireNonNull(queryConfig, "expected parameter 'queryConfig' to be non-null");
        this.suggestionFeature = Objects.requireNonNull(suggestionFeature, "expected parameter 'suggestionFeature' to be non-null");
        this.suggestionTriggerSettings = Objects.requireNonNull(suggestionTriggerSettings, "expected parameter 'suggestionTriggerSettings' to be non-null");
    }

    private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse() {
        this.conversationModelConfig = null;
        this.conversationProcessConfig = null;
        this.enableEventBasedSuggestion = null;
        this.queryConfig = null;
        this.suggestionFeature = null;
        this.suggestionTriggerSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse conversationModelConfig;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse conversationProcessConfig;
        private Boolean enableEventBasedSuggestion;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse queryConfig;
        private GoogleCloudDialogflowV2SuggestionFeatureResponse suggestionFeature;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsResponse suggestionTriggerSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conversationModelConfig = defaults.conversationModelConfig;
    	      this.conversationProcessConfig = defaults.conversationProcessConfig;
    	      this.enableEventBasedSuggestion = defaults.enableEventBasedSuggestion;
    	      this.queryConfig = defaults.queryConfig;
    	      this.suggestionFeature = defaults.suggestionFeature;
    	      this.suggestionTriggerSettings = defaults.suggestionTriggerSettings;
        }

        public Builder conversationModelConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationModelConfigResponse conversationModelConfig) {
            this.conversationModelConfig = Objects.requireNonNull(conversationModelConfig);
            return this;
        }

        public Builder conversationProcessConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigConversationProcessConfigResponse conversationProcessConfig) {
            this.conversationProcessConfig = Objects.requireNonNull(conversationProcessConfig);
            return this;
        }

        public Builder enableEventBasedSuggestion(Boolean enableEventBasedSuggestion) {
            this.enableEventBasedSuggestion = Objects.requireNonNull(enableEventBasedSuggestion);
            return this;
        }

        public Builder queryConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionQueryConfigResponse queryConfig) {
            this.queryConfig = Objects.requireNonNull(queryConfig);
            return this;
        }

        public Builder suggestionFeature(GoogleCloudDialogflowV2SuggestionFeatureResponse suggestionFeature) {
            this.suggestionFeature = Objects.requireNonNull(suggestionFeature);
            return this;
        }

        public Builder suggestionTriggerSettings(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionTriggerSettingsResponse suggestionTriggerSettings) {
            this.suggestionTriggerSettings = Objects.requireNonNull(suggestionTriggerSettings);
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionFeatureConfigResponse(conversationModelConfig, conversationProcessConfig, enableEventBasedSuggestion, queryConfig, suggestionFeature, suggestionTriggerSettings);
        }
    }
}
