// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.BotClarificationPromptMessageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotClarificationPromptArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotClarificationPromptArgs Empty = new BotClarificationPromptArgs();

    /**
     * The number of times to prompt the user for information.
     * 
     */
    @Import(name="maxAttempts", required=true)
    private Output<Integer> maxAttempts;

    public Output<Integer> maxAttempts() {
        return this.maxAttempts;
    }

    /**
     * A set of messages, each of which provides a message string and its type. You
     * can specify the message string in plain text or in Speech Synthesis Markup Language (SSML). Attributes
     * are documented under message.
     * 
     */
    @Import(name="messages", required=true)
    private Output<List<BotClarificationPromptMessageArgs>> messages;

    public Output<List<BotClarificationPromptMessageArgs>> messages() {
        return this.messages;
    }

    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html).
     * 
     */
    @Import(name="responseCard")
    private @Nullable Output<String> responseCard;

    public Optional<Output<String>> responseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    private BotClarificationPromptArgs() {}

    private BotClarificationPromptArgs(BotClarificationPromptArgs $) {
        this.maxAttempts = $.maxAttempts;
        this.messages = $.messages;
        this.responseCard = $.responseCard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotClarificationPromptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotClarificationPromptArgs $;

        public Builder() {
            $ = new BotClarificationPromptArgs();
        }

        public Builder(BotClarificationPromptArgs defaults) {
            $ = new BotClarificationPromptArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxAttempts(Output<Integer> maxAttempts) {
            $.maxAttempts = maxAttempts;
            return this;
        }

        public Builder maxAttempts(Integer maxAttempts) {
            return maxAttempts(Output.of(maxAttempts));
        }

        public Builder messages(Output<List<BotClarificationPromptMessageArgs>> messages) {
            $.messages = messages;
            return this;
        }

        public Builder messages(List<BotClarificationPromptMessageArgs> messages) {
            return messages(Output.of(messages));
        }

        public Builder messages(BotClarificationPromptMessageArgs... messages) {
            return messages(List.of(messages));
        }

        public Builder responseCard(@Nullable Output<String> responseCard) {
            $.responseCard = responseCard;
            return this;
        }

        public Builder responseCard(String responseCard) {
            return responseCard(Output.of(responseCard));
        }

        public BotClarificationPromptArgs build() {
            $.maxAttempts = Objects.requireNonNull($.maxAttempts, "expected parameter 'maxAttempts' to be non-null");
            $.messages = Objects.requireNonNull($.messages, "expected parameter 'messages' to be non-null");
            return $;
        }
    }

}
