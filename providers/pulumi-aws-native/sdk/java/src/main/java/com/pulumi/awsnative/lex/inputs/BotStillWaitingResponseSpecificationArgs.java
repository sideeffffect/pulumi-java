// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.awsnative.lex.inputs.BotMessageGroupArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StillWaitingResponseSpecification.
 * 
 */
public final class BotStillWaitingResponseSpecificationArgs extends ResourceArgs {

    public static final BotStillWaitingResponseSpecificationArgs Empty = new BotStillWaitingResponseSpecificationArgs();

    /**
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * 
     */
    @Import(name="allowInterrupt")
    private @Nullable Output<Boolean> allowInterrupt;

    /**
     * @return Indicates whether the user can interrupt a speech prompt from the bot.
     * 
     */
    public Optional<Output<Boolean>> allowInterrupt() {
        return Optional.ofNullable(this.allowInterrupt);
    }

    @Import(name="frequencyInSeconds", required=true)
    private Output<Integer> frequencyInSeconds;

    public Output<Integer> frequencyInSeconds() {
        return this.frequencyInSeconds;
    }

    @Import(name="messageGroupsList", required=true)
    private Output<List<BotMessageGroupArgs>> messageGroupsList;

    public Output<List<BotMessageGroupArgs>> messageGroupsList() {
        return this.messageGroupsList;
    }

    @Import(name="timeoutInSeconds", required=true)
    private Output<Integer> timeoutInSeconds;

    public Output<Integer> timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    private BotStillWaitingResponseSpecificationArgs() {}

    private BotStillWaitingResponseSpecificationArgs(BotStillWaitingResponseSpecificationArgs $) {
        this.allowInterrupt = $.allowInterrupt;
        this.frequencyInSeconds = $.frequencyInSeconds;
        this.messageGroupsList = $.messageGroupsList;
        this.timeoutInSeconds = $.timeoutInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotStillWaitingResponseSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotStillWaitingResponseSpecificationArgs $;

        public Builder() {
            $ = new BotStillWaitingResponseSpecificationArgs();
        }

        public Builder(BotStillWaitingResponseSpecificationArgs defaults) {
            $ = new BotStillWaitingResponseSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowInterrupt Indicates whether the user can interrupt a speech prompt from the bot.
         * 
         * @return builder
         * 
         */
        public Builder allowInterrupt(@Nullable Output<Boolean> allowInterrupt) {
            $.allowInterrupt = allowInterrupt;
            return this;
        }

        /**
         * @param allowInterrupt Indicates whether the user can interrupt a speech prompt from the bot.
         * 
         * @return builder
         * 
         */
        public Builder allowInterrupt(Boolean allowInterrupt) {
            return allowInterrupt(Output.of(allowInterrupt));
        }

        public Builder frequencyInSeconds(Output<Integer> frequencyInSeconds) {
            $.frequencyInSeconds = frequencyInSeconds;
            return this;
        }

        public Builder frequencyInSeconds(Integer frequencyInSeconds) {
            return frequencyInSeconds(Output.of(frequencyInSeconds));
        }

        public Builder messageGroupsList(Output<List<BotMessageGroupArgs>> messageGroupsList) {
            $.messageGroupsList = messageGroupsList;
            return this;
        }

        public Builder messageGroupsList(List<BotMessageGroupArgs> messageGroupsList) {
            return messageGroupsList(Output.of(messageGroupsList));
        }

        public Builder messageGroupsList(BotMessageGroupArgs... messageGroupsList) {
            return messageGroupsList(List.of(messageGroupsList));
        }

        public Builder timeoutInSeconds(Output<Integer> timeoutInSeconds) {
            $.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            return timeoutInSeconds(Output.of(timeoutInSeconds));
        }

        public BotStillWaitingResponseSpecificationArgs build() {
            $.frequencyInSeconds = Objects.requireNonNull($.frequencyInSeconds, "expected parameter 'frequencyInSeconds' to be non-null");
            $.messageGroupsList = Objects.requireNonNull($.messageGroupsList, "expected parameter 'messageGroupsList' to be non-null");
            $.timeoutInSeconds = Objects.requireNonNull($.timeoutInSeconds, "expected parameter 'timeoutInSeconds' to be non-null");
            return $;
        }
    }

}
