// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3ConversationTurnResponse {
    /**
     * The user input.
     * 
     */
    private final GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse userInput;
    /**
     * The virtual agent output.
     * 
     */
    private final GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

    @OutputCustomType.Constructor({"userInput","virtualAgentOutput"})
    private GoogleCloudDialogflowCxV3ConversationTurnResponse(
        GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse userInput,
        GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
        this.userInput = userInput;
        this.virtualAgentOutput = virtualAgentOutput;
    }

    /**
     * The user input.
     * 
    */
    public GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse getUserInput() {
        return this.userInput;
    }
    /**
     * The virtual agent output.
     * 
    */
    public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse getVirtualAgentOutput() {
        return this.virtualAgentOutput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse userInput;
        private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse virtualAgentOutput;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userInput = defaults.userInput;
    	      this.virtualAgentOutput = defaults.virtualAgentOutput;
        }

        public Builder setUserInput(GoogleCloudDialogflowCxV3ConversationTurnUserInputResponse userInput) {
            this.userInput = Objects.requireNonNull(userInput);
            return this;
        }

        public Builder setVirtualAgentOutput(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse virtualAgentOutput) {
            this.virtualAgentOutput = Objects.requireNonNull(virtualAgentOutput);
            return this;
        }
        public GoogleCloudDialogflowCxV3ConversationTurnResponse build() {
            return new GoogleCloudDialogflowCxV3ConversationTurnResponse(userInput, virtualAgentOutput);
        }
    }
}
