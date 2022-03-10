// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs Empty = new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs();

    /**
     * - 
     * Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
     * 
     */
    @InputImport(name="allowPlaybackInterruption")
      private final @Nullable Input<Boolean> allowPlaybackInterruption;

    public Input<Boolean> getAllowPlaybackInterruption() {
        return this.allowPlaybackInterruption == null ? Input.empty() : this.allowPlaybackInterruption;
    }

    /**
     * A collection of text responses.
     * 
     */
    @InputImport(name="texts")
      private final @Nullable Input<List<String>> texts;

    public Input<List<String>> getTexts() {
        return this.texts == null ? Input.empty() : this.texts;
    }

    public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs(
        @Nullable Input<Boolean> allowPlaybackInterruption,
        @Nullable Input<List<String>> texts) {
        this.allowPlaybackInterruption = allowPlaybackInterruption;
        this.texts = texts;
    }

    private CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs() {
        this.allowPlaybackInterruption = Input.empty();
        this.texts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> allowPlaybackInterruption;
        private @Nullable Input<List<String>> texts;

        public Builder() {
    	      // Empty
        }

        public Builder(CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowPlaybackInterruption = defaults.allowPlaybackInterruption;
    	      this.texts = defaults.texts;
        }

        public Builder allowPlaybackInterruption(@Nullable Input<Boolean> allowPlaybackInterruption) {
            this.allowPlaybackInterruption = allowPlaybackInterruption;
            return this;
        }

        public Builder allowPlaybackInterruption(@Nullable Boolean allowPlaybackInterruption) {
            this.allowPlaybackInterruption = Input.ofNullable(allowPlaybackInterruption);
            return this;
        }

        public Builder texts(@Nullable Input<List<String>> texts) {
            this.texts = texts;
            return this;
        }

        public Builder texts(@Nullable List<String> texts) {
            this.texts = Input.ofNullable(texts);
            return this;
        }
        public CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs build() {
            return new CxPageFormParameterFillBehaviorInitialPromptFulfillmentMessageTextArgs(allowPlaybackInterruption, texts);
        }
    }
}
