// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotGrammarSlotTypeSource;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotGrammarSlotTypeSetting {
    private final @Nullable BotGrammarSlotTypeSource source;

    @OutputCustomType.Constructor
    private BotGrammarSlotTypeSetting(@OutputCustomType.Parameter("source") @Nullable BotGrammarSlotTypeSource source) {
        this.source = source;
    }

    public Optional<BotGrammarSlotTypeSource> getSource() {
        return Optional.ofNullable(this.source);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotGrammarSlotTypeSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BotGrammarSlotTypeSource source;

        public Builder() {
    	      // Empty
        }

        public Builder(BotGrammarSlotTypeSetting defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
        }

        public Builder source(@Nullable BotGrammarSlotTypeSource source) {
            this.source = source;
            return this;
        }
        public BotGrammarSlotTypeSetting build() {
            return new BotGrammarSlotTypeSetting(source);
        }
    }
}
