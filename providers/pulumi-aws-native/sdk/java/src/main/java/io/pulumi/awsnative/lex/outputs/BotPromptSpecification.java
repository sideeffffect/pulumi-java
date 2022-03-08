// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.awsnative.lex.outputs.BotMessageGroup;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BotPromptSpecification {
    /**
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * 
     */
    private final @Nullable Boolean allowInterrupt;
    private final Integer maxRetries;
    private final List<BotMessageGroup> messageGroupsList;

    @OutputCustomType.Constructor({"allowInterrupt","maxRetries","messageGroupsList"})
    private BotPromptSpecification(
        @Nullable Boolean allowInterrupt,
        Integer maxRetries,
        List<BotMessageGroup> messageGroupsList) {
        this.allowInterrupt = allowInterrupt;
        this.maxRetries = maxRetries;
        this.messageGroupsList = messageGroupsList;
    }

    /**
     * Indicates whether the user can interrupt a speech prompt from the bot.
     * 
    */
    public Optional<Boolean> getAllowInterrupt() {
        return Optional.ofNullable(this.allowInterrupt);
    }
    public Integer getMaxRetries() {
        return this.maxRetries;
    }
    public List<BotMessageGroup> getMessageGroupsList() {
        return this.messageGroupsList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotPromptSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowInterrupt;
        private Integer maxRetries;
        private List<BotMessageGroup> messageGroupsList;

        public Builder() {
    	      // Empty
        }

        public Builder(BotPromptSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowInterrupt = defaults.allowInterrupt;
    	      this.maxRetries = defaults.maxRetries;
    	      this.messageGroupsList = defaults.messageGroupsList;
        }

        public Builder setAllowInterrupt(@Nullable Boolean allowInterrupt) {
            this.allowInterrupt = allowInterrupt;
            return this;
        }

        public Builder setMaxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }

        public Builder setMessageGroupsList(List<BotMessageGroup> messageGroupsList) {
            this.messageGroupsList = Objects.requireNonNull(messageGroupsList);
            return this;
        }
        public BotPromptSpecification build() {
            return new BotPromptSpecification(allowInterrupt, maxRetries, messageGroupsList);
        }
    }
}
