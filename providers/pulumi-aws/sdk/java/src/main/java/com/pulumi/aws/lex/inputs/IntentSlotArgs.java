// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.aws.lex.inputs.IntentSlotValueElicitationPromptArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntentSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntentSlotArgs Empty = new IntentSlotArgs();

    /**
     * A description of the bot. Must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the intent slot that you want to create. The name is case sensitive. Must be less than or equal to 100 characters in length.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Directs Lex the order in which to elicit this slot value from the user.
     * For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for
     * the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits
     * values is arbitrary. Must be between 1 and 100.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The response card. Amazon Lex will substitute session attributes and
     * slot values into the response card. For more information, see
     * [Example: Using a Response Card](https://docs.aws.amazon.com/lex/latest/dg/ex-resp-card.html). Must be less than or equal to 50000 characters in length.
     * 
     */
    @Import(name="responseCard")
    private @Nullable Output<String> responseCard;

    public Optional<Output<String>> responseCard() {
        return Optional.ofNullable(this.responseCard);
    }

    /**
     * If you know a specific pattern with which users might respond to
     * an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This
     * is optional. In most cases, Amazon Lex is capable of understanding user utterances. Must have between 1 and 10 items in the list, and each item must be less than or equal to 200 characters in length.
     * 
     */
    @Import(name="sampleUtterances")
    private @Nullable Output<List<String>> sampleUtterances;

    public Optional<Output<List<String>>> sampleUtterances() {
        return Optional.ofNullable(this.sampleUtterances);
    }

    /**
     * Specifies whether the slot is required or optional.
     * 
     */
    @Import(name="slotConstraint", required=true)
    private Output<String> slotConstraint;

    public Output<String> slotConstraint() {
        return this.slotConstraint;
    }

    /**
     * The type of the slot, either a custom slot type that you defined or one of
     * the built-in slot types. Must be less than or equal to 100 characters in length.
     * 
     */
    @Import(name="slotType", required=true)
    private Output<String> slotType;

    public Output<String> slotType() {
        return this.slotType;
    }

    /**
     * The version of the slot type. Must be less than or equal to 64 characters in length.
     * 
     */
    @Import(name="slotTypeVersion")
    private @Nullable Output<String> slotTypeVersion;

    public Optional<Output<String>> slotTypeVersion() {
        return Optional.ofNullable(this.slotTypeVersion);
    }

    /**
     * The prompt that Amazon Lex uses to elicit the slot value
     * from the user. Attributes are documented under prompt.
     * 
     */
    @Import(name="valueElicitationPrompt")
    private @Nullable Output<IntentSlotValueElicitationPromptArgs> valueElicitationPrompt;

    public Optional<Output<IntentSlotValueElicitationPromptArgs>> valueElicitationPrompt() {
        return Optional.ofNullable(this.valueElicitationPrompt);
    }

    private IntentSlotArgs() {}

    private IntentSlotArgs(IntentSlotArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.priority = $.priority;
        this.responseCard = $.responseCard;
        this.sampleUtterances = $.sampleUtterances;
        this.slotConstraint = $.slotConstraint;
        this.slotType = $.slotType;
        this.slotTypeVersion = $.slotTypeVersion;
        this.valueElicitationPrompt = $.valueElicitationPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntentSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntentSlotArgs $;

        public Builder() {
            $ = new IntentSlotArgs();
        }

        public Builder(IntentSlotArgs defaults) {
            $ = new IntentSlotArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder responseCard(@Nullable Output<String> responseCard) {
            $.responseCard = responseCard;
            return this;
        }

        public Builder responseCard(String responseCard) {
            return responseCard(Output.of(responseCard));
        }

        public Builder sampleUtterances(@Nullable Output<List<String>> sampleUtterances) {
            $.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder sampleUtterances(List<String> sampleUtterances) {
            return sampleUtterances(Output.of(sampleUtterances));
        }

        public Builder sampleUtterances(String... sampleUtterances) {
            return sampleUtterances(List.of(sampleUtterances));
        }

        public Builder slotConstraint(Output<String> slotConstraint) {
            $.slotConstraint = slotConstraint;
            return this;
        }

        public Builder slotConstraint(String slotConstraint) {
            return slotConstraint(Output.of(slotConstraint));
        }

        public Builder slotType(Output<String> slotType) {
            $.slotType = slotType;
            return this;
        }

        public Builder slotType(String slotType) {
            return slotType(Output.of(slotType));
        }

        public Builder slotTypeVersion(@Nullable Output<String> slotTypeVersion) {
            $.slotTypeVersion = slotTypeVersion;
            return this;
        }

        public Builder slotTypeVersion(String slotTypeVersion) {
            return slotTypeVersion(Output.of(slotTypeVersion));
        }

        public Builder valueElicitationPrompt(@Nullable Output<IntentSlotValueElicitationPromptArgs> valueElicitationPrompt) {
            $.valueElicitationPrompt = valueElicitationPrompt;
            return this;
        }

        public Builder valueElicitationPrompt(IntentSlotValueElicitationPromptArgs valueElicitationPrompt) {
            return valueElicitationPrompt(Output.of(valueElicitationPrompt));
        }

        public IntentSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.slotConstraint = Objects.requireNonNull($.slotConstraint, "expected parameter 'slotConstraint' to be non-null");
            $.slotType = Objects.requireNonNull($.slotType, "expected parameter 'slotType' to be non-null");
            return $;
        }
    }

}
