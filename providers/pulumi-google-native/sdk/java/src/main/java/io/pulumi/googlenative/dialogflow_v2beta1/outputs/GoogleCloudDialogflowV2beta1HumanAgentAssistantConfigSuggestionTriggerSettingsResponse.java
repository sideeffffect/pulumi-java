// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsResponse {
    /**
     * Do not trigger if last utterance is small talk.
     * 
     */
    private final Boolean noSmallTalk;
    /**
     * Only trigger suggestion if participant role of last utterance is END_USER.
     * 
     */
    private final Boolean onlyEndUser;

    @OutputCustomType.Constructor({"noSmallTalk","onlyEndUser"})
    private GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsResponse(
        Boolean noSmallTalk,
        Boolean onlyEndUser) {
        this.noSmallTalk = noSmallTalk;
        this.onlyEndUser = onlyEndUser;
    }

    /**
     * Do not trigger if last utterance is small talk.
     * 
    */
    public Boolean getNoSmallTalk() {
        return this.noSmallTalk;
    }
    /**
     * Only trigger suggestion if participant role of last utterance is END_USER.
     * 
    */
    public Boolean getOnlyEndUser() {
        return this.onlyEndUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean noSmallTalk;
        private Boolean onlyEndUser;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.noSmallTalk = defaults.noSmallTalk;
    	      this.onlyEndUser = defaults.onlyEndUser;
        }

        public Builder setNoSmallTalk(Boolean noSmallTalk) {
            this.noSmallTalk = Objects.requireNonNull(noSmallTalk);
            return this;
        }

        public Builder setOnlyEndUser(Boolean onlyEndUser) {
            this.onlyEndUser = Objects.requireNonNull(onlyEndUser);
            return this;
        }
        public GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsResponse build() {
            return new GoogleCloudDialogflowV2beta1HumanAgentAssistantConfigSuggestionTriggerSettingsResponse(noSmallTalk, onlyEndUser);
        }
    }
}
