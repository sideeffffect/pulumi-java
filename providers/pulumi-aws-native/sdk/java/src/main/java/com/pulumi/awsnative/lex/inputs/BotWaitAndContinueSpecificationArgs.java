// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotResponseSpecificationArgs;
import com.pulumi.awsnative.lex.inputs.BotStillWaitingResponseSpecificationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The prompts that Amazon Lex uses while a bot is waiting for customer input.
 * 
 */
public final class BotWaitAndContinueSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotWaitAndContinueSpecificationArgs Empty = new BotWaitAndContinueSpecificationArgs();

    /**
     * The response that Amazon Lex sends to indicate that the bot is ready to continue the conversation.
     * 
     */
    @Import(name="continueResponse", required=true)
    private Output<BotResponseSpecificationArgs> continueResponse;

    public Output<BotResponseSpecificationArgs> continueResponse() {
        return this.continueResponse;
    }

    /**
     * Specifies whether the bot will wait for a user to respond.
     * 
     */
    @Import(name="isActive")
    private @Nullable Output<Boolean> isActive;

    public Optional<Output<Boolean>> isActive() {
        return Optional.ofNullable(this.isActive);
    }

    /**
     * The response that Amazon Lex sends periodically to the user to indicate that the bot is still waiting for input from the user.
     * 
     */
    @Import(name="stillWaitingResponse")
    private @Nullable Output<BotStillWaitingResponseSpecificationArgs> stillWaitingResponse;

    public Optional<Output<BotStillWaitingResponseSpecificationArgs>> stillWaitingResponse() {
        return Optional.ofNullable(this.stillWaitingResponse);
    }

    /**
     * The response that Amazon Lex sends to indicate that the bot is waiting for the conversation to continue.
     * 
     */
    @Import(name="waitingResponse", required=true)
    private Output<BotResponseSpecificationArgs> waitingResponse;

    public Output<BotResponseSpecificationArgs> waitingResponse() {
        return this.waitingResponse;
    }

    private BotWaitAndContinueSpecificationArgs() {}

    private BotWaitAndContinueSpecificationArgs(BotWaitAndContinueSpecificationArgs $) {
        this.continueResponse = $.continueResponse;
        this.isActive = $.isActive;
        this.stillWaitingResponse = $.stillWaitingResponse;
        this.waitingResponse = $.waitingResponse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotWaitAndContinueSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotWaitAndContinueSpecificationArgs $;

        public Builder() {
            $ = new BotWaitAndContinueSpecificationArgs();
        }

        public Builder(BotWaitAndContinueSpecificationArgs defaults) {
            $ = new BotWaitAndContinueSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder continueResponse(Output<BotResponseSpecificationArgs> continueResponse) {
            $.continueResponse = continueResponse;
            return this;
        }

        public Builder continueResponse(BotResponseSpecificationArgs continueResponse) {
            return continueResponse(Output.of(continueResponse));
        }

        public Builder isActive(@Nullable Output<Boolean> isActive) {
            $.isActive = isActive;
            return this;
        }

        public Builder isActive(Boolean isActive) {
            return isActive(Output.of(isActive));
        }

        public Builder stillWaitingResponse(@Nullable Output<BotStillWaitingResponseSpecificationArgs> stillWaitingResponse) {
            $.stillWaitingResponse = stillWaitingResponse;
            return this;
        }

        public Builder stillWaitingResponse(BotStillWaitingResponseSpecificationArgs stillWaitingResponse) {
            return stillWaitingResponse(Output.of(stillWaitingResponse));
        }

        public Builder waitingResponse(Output<BotResponseSpecificationArgs> waitingResponse) {
            $.waitingResponse = waitingResponse;
            return this;
        }

        public Builder waitingResponse(BotResponseSpecificationArgs waitingResponse) {
            return waitingResponse(Output.of(waitingResponse));
        }

        public BotWaitAndContinueSpecificationArgs build() {
            $.continueResponse = Objects.requireNonNull($.continueResponse, "expected parameter 'continueResponse' to be non-null");
            $.waitingResponse = Objects.requireNonNull($.waitingResponse, "expected parameter 'waitingResponse' to be non-null");
            return $;
        }
    }

}
