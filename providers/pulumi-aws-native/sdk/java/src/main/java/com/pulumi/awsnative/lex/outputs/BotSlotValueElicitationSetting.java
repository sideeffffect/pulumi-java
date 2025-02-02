// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.awsnative.lex.enums.BotSlotConstraint;
import com.pulumi.awsnative.lex.outputs.BotPromptSpecification;
import com.pulumi.awsnative.lex.outputs.BotSampleUtterance;
import com.pulumi.awsnative.lex.outputs.BotSlotDefaultValueSpecification;
import com.pulumi.awsnative.lex.outputs.BotWaitAndContinueSpecification;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BotSlotValueElicitationSetting {
    /**
     * @return A list of default values for a slot.
     * 
     */
    private final @Nullable BotSlotDefaultValueSpecification defaultValueSpecification;
    /**
     * @return The prompt that Amazon Lex uses to elicit the slot value from the user.
     * 
     */
    private final @Nullable BotPromptSpecification promptSpecification;
    /**
     * @return If you know a specific pattern that users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
     * 
     */
    private final @Nullable List<BotSampleUtterance> sampleUtterances;
    /**
     * @return Specifies whether the slot is required or optional.
     * 
     */
    private final BotSlotConstraint slotConstraint;
    /**
     * @return Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     * 
     */
    private final @Nullable BotWaitAndContinueSpecification waitAndContinueSpecification;

    @CustomType.Constructor
    private BotSlotValueElicitationSetting(
        @CustomType.Parameter("defaultValueSpecification") @Nullable BotSlotDefaultValueSpecification defaultValueSpecification,
        @CustomType.Parameter("promptSpecification") @Nullable BotPromptSpecification promptSpecification,
        @CustomType.Parameter("sampleUtterances") @Nullable List<BotSampleUtterance> sampleUtterances,
        @CustomType.Parameter("slotConstraint") BotSlotConstraint slotConstraint,
        @CustomType.Parameter("waitAndContinueSpecification") @Nullable BotWaitAndContinueSpecification waitAndContinueSpecification) {
        this.defaultValueSpecification = defaultValueSpecification;
        this.promptSpecification = promptSpecification;
        this.sampleUtterances = sampleUtterances;
        this.slotConstraint = slotConstraint;
        this.waitAndContinueSpecification = waitAndContinueSpecification;
    }

    /**
     * @return A list of default values for a slot.
     * 
     */
    public Optional<BotSlotDefaultValueSpecification> defaultValueSpecification() {
        return Optional.ofNullable(this.defaultValueSpecification);
    }
    /**
     * @return The prompt that Amazon Lex uses to elicit the slot value from the user.
     * 
     */
    public Optional<BotPromptSpecification> promptSpecification() {
        return Optional.ofNullable(this.promptSpecification);
    }
    /**
     * @return If you know a specific pattern that users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy.
     * 
     */
    public List<BotSampleUtterance> sampleUtterances() {
        return this.sampleUtterances == null ? List.of() : this.sampleUtterances;
    }
    /**
     * @return Specifies whether the slot is required or optional.
     * 
     */
    public BotSlotConstraint slotConstraint() {
        return this.slotConstraint;
    }
    /**
     * @return Specifies the prompts that Amazon Lex uses while a bot is waiting for customer input.
     * 
     */
    public Optional<BotWaitAndContinueSpecification> waitAndContinueSpecification() {
        return Optional.ofNullable(this.waitAndContinueSpecification);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotValueElicitationSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotSlotDefaultValueSpecification defaultValueSpecification;
        private @Nullable BotPromptSpecification promptSpecification;
        private @Nullable List<BotSampleUtterance> sampleUtterances;
        private BotSlotConstraint slotConstraint;
        private @Nullable BotWaitAndContinueSpecification waitAndContinueSpecification;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotValueElicitationSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValueSpecification = defaults.defaultValueSpecification;
    	      this.promptSpecification = defaults.promptSpecification;
    	      this.sampleUtterances = defaults.sampleUtterances;
    	      this.slotConstraint = defaults.slotConstraint;
    	      this.waitAndContinueSpecification = defaults.waitAndContinueSpecification;
        }

        public Builder defaultValueSpecification(@Nullable BotSlotDefaultValueSpecification defaultValueSpecification) {
            this.defaultValueSpecification = defaultValueSpecification;
            return this;
        }
        public Builder promptSpecification(@Nullable BotPromptSpecification promptSpecification) {
            this.promptSpecification = promptSpecification;
            return this;
        }
        public Builder sampleUtterances(@Nullable List<BotSampleUtterance> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }
        public Builder sampleUtterances(BotSampleUtterance... sampleUtterances) {
            return sampleUtterances(List.of(sampleUtterances));
        }
        public Builder slotConstraint(BotSlotConstraint slotConstraint) {
            this.slotConstraint = Objects.requireNonNull(slotConstraint);
            return this;
        }
        public Builder waitAndContinueSpecification(@Nullable BotWaitAndContinueSpecification waitAndContinueSpecification) {
            this.waitAndContinueSpecification = waitAndContinueSpecification;
            return this;
        }        public BotSlotValueElicitationSetting build() {
            return new BotSlotValueElicitationSetting(defaultValueSpecification, promptSpecification, sampleUtterances, slotConstraint, waitAndContinueSpecification);
        }
    }
}
