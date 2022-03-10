// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotDialogCodeHookSetting;
import io.pulumi.awsnative.lex.outputs.BotFulfillmentCodeHookSetting;
import io.pulumi.awsnative.lex.outputs.BotInputContext;
import io.pulumi.awsnative.lex.outputs.BotIntentClosingSetting;
import io.pulumi.awsnative.lex.outputs.BotIntentConfirmationSetting;
import io.pulumi.awsnative.lex.outputs.BotKendraConfiguration;
import io.pulumi.awsnative.lex.outputs.BotOutputContext;
import io.pulumi.awsnative.lex.outputs.BotSampleUtterance;
import io.pulumi.awsnative.lex.outputs.BotSlot;
import io.pulumi.awsnative.lex.outputs.BotSlotPriority;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotIntent {
    private final @Nullable String description;
    private final @Nullable BotDialogCodeHookSetting dialogCodeHook;
    private final @Nullable BotFulfillmentCodeHookSetting fulfillmentCodeHook;
    private final @Nullable List<BotInputContext> inputContexts;
    private final @Nullable BotIntentClosingSetting intentClosingSetting;
    private final @Nullable BotIntentConfirmationSetting intentConfirmationSetting;
    private final @Nullable BotKendraConfiguration kendraConfiguration;
    private final String name;
    private final @Nullable List<BotOutputContext> outputContexts;
    private final @Nullable String parentIntentSignature;
    private final @Nullable List<BotSampleUtterance> sampleUtterances;
    private final @Nullable List<BotSlotPriority> slotPriorities;
    /**
     * List of slots
     * 
     */
    private final @Nullable List<BotSlot> slots;

    @OutputCustomType.Constructor
    private BotIntent(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("dialogCodeHook") @Nullable BotDialogCodeHookSetting dialogCodeHook,
        @OutputCustomType.Parameter("fulfillmentCodeHook") @Nullable BotFulfillmentCodeHookSetting fulfillmentCodeHook,
        @OutputCustomType.Parameter("inputContexts") @Nullable List<BotInputContext> inputContexts,
        @OutputCustomType.Parameter("intentClosingSetting") @Nullable BotIntentClosingSetting intentClosingSetting,
        @OutputCustomType.Parameter("intentConfirmationSetting") @Nullable BotIntentConfirmationSetting intentConfirmationSetting,
        @OutputCustomType.Parameter("kendraConfiguration") @Nullable BotKendraConfiguration kendraConfiguration,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("outputContexts") @Nullable List<BotOutputContext> outputContexts,
        @OutputCustomType.Parameter("parentIntentSignature") @Nullable String parentIntentSignature,
        @OutputCustomType.Parameter("sampleUtterances") @Nullable List<BotSampleUtterance> sampleUtterances,
        @OutputCustomType.Parameter("slotPriorities") @Nullable List<BotSlotPriority> slotPriorities,
        @OutputCustomType.Parameter("slots") @Nullable List<BotSlot> slots) {
        this.description = description;
        this.dialogCodeHook = dialogCodeHook;
        this.fulfillmentCodeHook = fulfillmentCodeHook;
        this.inputContexts = inputContexts;
        this.intentClosingSetting = intentClosingSetting;
        this.intentConfirmationSetting = intentConfirmationSetting;
        this.kendraConfiguration = kendraConfiguration;
        this.name = name;
        this.outputContexts = outputContexts;
        this.parentIntentSignature = parentIntentSignature;
        this.sampleUtterances = sampleUtterances;
        this.slotPriorities = slotPriorities;
        this.slots = slots;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<BotDialogCodeHookSetting> getDialogCodeHook() {
        return Optional.ofNullable(this.dialogCodeHook);
    }
    public Optional<BotFulfillmentCodeHookSetting> getFulfillmentCodeHook() {
        return Optional.ofNullable(this.fulfillmentCodeHook);
    }
    public List<BotInputContext> getInputContexts() {
        return this.inputContexts == null ? List.of() : this.inputContexts;
    }
    public Optional<BotIntentClosingSetting> getIntentClosingSetting() {
        return Optional.ofNullable(this.intentClosingSetting);
    }
    public Optional<BotIntentConfirmationSetting> getIntentConfirmationSetting() {
        return Optional.ofNullable(this.intentConfirmationSetting);
    }
    public Optional<BotKendraConfiguration> getKendraConfiguration() {
        return Optional.ofNullable(this.kendraConfiguration);
    }
    public String getName() {
        return this.name;
    }
    public List<BotOutputContext> getOutputContexts() {
        return this.outputContexts == null ? List.of() : this.outputContexts;
    }
    public Optional<String> getParentIntentSignature() {
        return Optional.ofNullable(this.parentIntentSignature);
    }
    public List<BotSampleUtterance> getSampleUtterances() {
        return this.sampleUtterances == null ? List.of() : this.sampleUtterances;
    }
    public List<BotSlotPriority> getSlotPriorities() {
        return this.slotPriorities == null ? List.of() : this.slotPriorities;
    }
    /**
     * List of slots
     * 
    */
    public List<BotSlot> getSlots() {
        return this.slots == null ? List.of() : this.slots;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable BotDialogCodeHookSetting dialogCodeHook;
        private @Nullable BotFulfillmentCodeHookSetting fulfillmentCodeHook;
        private @Nullable List<BotInputContext> inputContexts;
        private @Nullable BotIntentClosingSetting intentClosingSetting;
        private @Nullable BotIntentConfirmationSetting intentConfirmationSetting;
        private @Nullable BotKendraConfiguration kendraConfiguration;
        private String name;
        private @Nullable List<BotOutputContext> outputContexts;
        private @Nullable String parentIntentSignature;
        private @Nullable List<BotSampleUtterance> sampleUtterances;
        private @Nullable List<BotSlotPriority> slotPriorities;
        private @Nullable List<BotSlot> slots;

        public Builder() {
    	      // Empty
        }

        public Builder(BotIntent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dialogCodeHook = defaults.dialogCodeHook;
    	      this.fulfillmentCodeHook = defaults.fulfillmentCodeHook;
    	      this.inputContexts = defaults.inputContexts;
    	      this.intentClosingSetting = defaults.intentClosingSetting;
    	      this.intentConfirmationSetting = defaults.intentConfirmationSetting;
    	      this.kendraConfiguration = defaults.kendraConfiguration;
    	      this.name = defaults.name;
    	      this.outputContexts = defaults.outputContexts;
    	      this.parentIntentSignature = defaults.parentIntentSignature;
    	      this.sampleUtterances = defaults.sampleUtterances;
    	      this.slotPriorities = defaults.slotPriorities;
    	      this.slots = defaults.slots;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder dialogCodeHook(@Nullable BotDialogCodeHookSetting dialogCodeHook) {
            this.dialogCodeHook = dialogCodeHook;
            return this;
        }

        public Builder fulfillmentCodeHook(@Nullable BotFulfillmentCodeHookSetting fulfillmentCodeHook) {
            this.fulfillmentCodeHook = fulfillmentCodeHook;
            return this;
        }

        public Builder inputContexts(@Nullable List<BotInputContext> inputContexts) {
            this.inputContexts = inputContexts;
            return this;
        }

        public Builder intentClosingSetting(@Nullable BotIntentClosingSetting intentClosingSetting) {
            this.intentClosingSetting = intentClosingSetting;
            return this;
        }

        public Builder intentConfirmationSetting(@Nullable BotIntentConfirmationSetting intentConfirmationSetting) {
            this.intentConfirmationSetting = intentConfirmationSetting;
            return this;
        }

        public Builder kendraConfiguration(@Nullable BotKendraConfiguration kendraConfiguration) {
            this.kendraConfiguration = kendraConfiguration;
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder outputContexts(@Nullable List<BotOutputContext> outputContexts) {
            this.outputContexts = outputContexts;
            return this;
        }

        public Builder parentIntentSignature(@Nullable String parentIntentSignature) {
            this.parentIntentSignature = parentIntentSignature;
            return this;
        }

        public Builder sampleUtterances(@Nullable List<BotSampleUtterance> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder slotPriorities(@Nullable List<BotSlotPriority> slotPriorities) {
            this.slotPriorities = slotPriorities;
            return this;
        }

        public Builder slots(@Nullable List<BotSlot> slots) {
            this.slots = slots;
            return this;
        }
        public BotIntent build() {
            return new BotIntent(description, dialogCodeHook, fulfillmentCodeHook, inputContexts, intentClosingSetting, intentConfirmationSetting, kendraConfiguration, name, outputContexts, parentIntentSignature, sampleUtterances, slotPriorities, slots);
        }
    }
}
