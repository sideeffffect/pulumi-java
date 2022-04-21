// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * One interaction between a human and virtual agent. The human provides some input and the virtual agent provides a response.
 * 
 */
public final class GoogleCloudDialogflowCxV3ConversationTurnArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ConversationTurnArgs Empty = new GoogleCloudDialogflowCxV3ConversationTurnArgs();

    /**
     * The user input.
     * 
     */
    @Import(name="userInput")
    private @Nullable Output<GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs> userInput;

    public Optional<Output<GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs>> userInput() {
        return Optional.ofNullable(this.userInput);
    }

    /**
     * The virtual agent output.
     * 
     */
    @Import(name="virtualAgentOutput")
    private @Nullable Output<GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs> virtualAgentOutput;

    public Optional<Output<GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs>> virtualAgentOutput() {
        return Optional.ofNullable(this.virtualAgentOutput);
    }

    private GoogleCloudDialogflowCxV3ConversationTurnArgs() {}

    private GoogleCloudDialogflowCxV3ConversationTurnArgs(GoogleCloudDialogflowCxV3ConversationTurnArgs $) {
        this.userInput = $.userInput;
        this.virtualAgentOutput = $.virtualAgentOutput;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ConversationTurnArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3ConversationTurnArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3ConversationTurnArgs(Objects.requireNonNull(defaults));
        }

        public Builder userInput(@Nullable Output<GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs> userInput) {
            $.userInput = userInput;
            return this;
        }

        public Builder userInput(GoogleCloudDialogflowCxV3ConversationTurnUserInputArgs userInput) {
            return userInput(Output.of(userInput));
        }

        public Builder virtualAgentOutput(@Nullable Output<GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs> virtualAgentOutput) {
            $.virtualAgentOutput = virtualAgentOutput;
            return this;
        }

        public Builder virtualAgentOutput(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputArgs virtualAgentOutput) {
            return virtualAgentOutput(Output.of(virtualAgentOutput));
        }

        public GoogleCloudDialogflowCxV3ConversationTurnArgs build() {
            return $;
        }
    }

}
