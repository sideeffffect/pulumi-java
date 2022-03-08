// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse;
import io.pulumi.googlenative.dialogflow_v2.outputs.GoogleCloudDialogflowV2NotificationConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse {
    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig;
    /**
     * Configuration for agent assistance of human agent participant.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig;
    /**
     * Configuration for message analysis.
     * 
     */
    private final GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig;
    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
     */
    private final GoogleCloudDialogflowV2NotificationConfigResponse notificationConfig;

    @OutputCustomType.Constructor({"endUserSuggestionConfig","humanAgentSuggestionConfig","messageAnalysisConfig","notificationConfig"})
    private GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse(
        GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig,
        GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig,
        GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig,
        GoogleCloudDialogflowV2NotificationConfigResponse notificationConfig) {
        this.endUserSuggestionConfig = endUserSuggestionConfig;
        this.humanAgentSuggestionConfig = humanAgentSuggestionConfig;
        this.messageAnalysisConfig = messageAnalysisConfig;
        this.notificationConfig = notificationConfig;
    }

    /**
     * Configuration for agent assistance of end user participant. Currently, this feature is not general available, please contact Google to get access.
     * 
    */
    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse getEndUserSuggestionConfig() {
        return this.endUserSuggestionConfig;
    }
    /**
     * Configuration for agent assistance of human agent participant.
     * 
    */
    public GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse getHumanAgentSuggestionConfig() {
        return this.humanAgentSuggestionConfig;
    }
    /**
     * Configuration for message analysis.
     * 
    */
    public GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse getMessageAnalysisConfig() {
        return this.messageAnalysisConfig;
    }
    /**
     * Pub/Sub topic on which to publish new agent assistant events.
     * 
    */
    public GoogleCloudDialogflowV2NotificationConfigResponse getNotificationConfig() {
        return this.notificationConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig;
        private GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig;
        private GoogleCloudDialogflowV2NotificationConfigResponse notificationConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endUserSuggestionConfig = defaults.endUserSuggestionConfig;
    	      this.humanAgentSuggestionConfig = defaults.humanAgentSuggestionConfig;
    	      this.messageAnalysisConfig = defaults.messageAnalysisConfig;
    	      this.notificationConfig = defaults.notificationConfig;
        }

        public Builder setEndUserSuggestionConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse endUserSuggestionConfig) {
            this.endUserSuggestionConfig = Objects.requireNonNull(endUserSuggestionConfig);
            return this;
        }

        public Builder setHumanAgentSuggestionConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigSuggestionConfigResponse humanAgentSuggestionConfig) {
            this.humanAgentSuggestionConfig = Objects.requireNonNull(humanAgentSuggestionConfig);
            return this;
        }

        public Builder setMessageAnalysisConfig(GoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfigResponse messageAnalysisConfig) {
            this.messageAnalysisConfig = Objects.requireNonNull(messageAnalysisConfig);
            return this;
        }

        public Builder setNotificationConfig(GoogleCloudDialogflowV2NotificationConfigResponse notificationConfig) {
            this.notificationConfig = Objects.requireNonNull(notificationConfig);
            return this;
        }
        public GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse build() {
            return new GoogleCloudDialogflowV2HumanAgentAssistantConfigResponse(endUserSuggestionConfig, humanAgentSuggestionConfig, messageAnalysisConfig, notificationConfig);
        }
    }
}
