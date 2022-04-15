// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lex.inputs;

import io.pulumi.aws.lex.inputs.IntentFollowUpPromptRejectionStatementMessageArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntentFollowUpPromptRejectionStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntentFollowUpPromptRejectionStatementArgs Empty = new IntentFollowUpPromptRejectionStatementArgs();

    /**
     * A set of messages, each of which provides a message string and its type.
     * You can specify the message string in plain text or in Speech Synthesis Markup Language (SSML).
     * Attributes are documented under message. Must contain between 1 and 15 messages.
     * 
     */
    @Import(name="messages", required=true)
      private final Output<List<IntentFollowUpPromptRejectionStatementMessageArgs>> messages;

    public Output<List<IntentFollowUpPromptRejectionStatementMessageArgs>> messages() {
        return this.messages;
    }

    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    @Import(name="responseCard")
      private final @Nullable Output<String> responseCard;

    public Output<String> responseCard() {
        return this.responseCard == null ? Codegen.empty() : this.responseCard;
    }

    public IntentFollowUpPromptRejectionStatementArgs(
        Output<List<IntentFollowUpPromptRejectionStatementMessageArgs>> messages,
        @Nullable Output<String> responseCard) {
        this.messages = Objects.requireNonNull(messages, "expected parameter 'messages' to be non-null");
        this.responseCard = responseCard;
    }

    private IntentFollowUpPromptRejectionStatementArgs() {
        this.messages = Codegen.empty();
        this.responseCard = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntentFollowUpPromptRejectionStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<IntentFollowUpPromptRejectionStatementMessageArgs>> messages;
        private @Nullable Output<String> responseCard;

        public Builder() {
    	      // Empty
        }

        public Builder(IntentFollowUpPromptRejectionStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messages = defaults.messages;
    	      this.responseCard = defaults.responseCard;
        }

        public Builder messages(Output<List<IntentFollowUpPromptRejectionStatementMessageArgs>> messages) {
            this.messages = Objects.requireNonNull(messages);
            return this;
        }
        public Builder messages(List<IntentFollowUpPromptRejectionStatementMessageArgs> messages) {
            this.messages = Output.of(Objects.requireNonNull(messages));
            return this;
        }
        public Builder messages(IntentFollowUpPromptRejectionStatementMessageArgs... messages) {
            return messages(List.of(messages));
        }
        public Builder responseCard(@Nullable Output<String> responseCard) {
            this.responseCard = responseCard;
            return this;
        }
        public Builder responseCard(@Nullable String responseCard) {
            this.responseCard = Codegen.ofNullable(responseCard);
            return this;
        }        public IntentFollowUpPromptRejectionStatementArgs build() {
            return new IntentFollowUpPromptRejectionStatementArgs(messages, responseCard);
        }
    }
}
