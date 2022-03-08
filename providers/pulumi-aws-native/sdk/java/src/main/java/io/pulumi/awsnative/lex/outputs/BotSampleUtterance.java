// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BotSampleUtterance {
    private final String utterance;

    @OutputCustomType.Constructor({"utterance"})
    private BotSampleUtterance(String utterance) {
        this.utterance = utterance;
    }

    public String getUtterance() {
        return this.utterance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSampleUtterance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String utterance;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSampleUtterance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.utterance = defaults.utterance;
        }

        public Builder setUtterance(String utterance) {
            this.utterance = Objects.requireNonNull(utterance);
            return this;
        }
        public BotSampleUtterance build() {
            return new BotSampleUtterance(utterance);
        }
    }
}
