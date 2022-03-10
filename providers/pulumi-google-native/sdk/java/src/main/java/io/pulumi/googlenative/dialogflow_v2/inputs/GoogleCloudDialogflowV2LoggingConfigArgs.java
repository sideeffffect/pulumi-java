// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines logging behavior for conversation lifecycle events.
 * 
 */
public final class GoogleCloudDialogflowV2LoggingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2LoggingConfigArgs Empty = new GoogleCloudDialogflowV2LoggingConfigArgs();

    /**
     * Whether to log conversation events like CONVERSATION_STARTED to Stackdriver in the conversation project as JSON format ConversationEvent protos.
     * 
     */
    @InputImport(name="enableStackdriverLogging")
      private final @Nullable Input<Boolean> enableStackdriverLogging;

    public Input<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Input.empty() : this.enableStackdriverLogging;
    }

    public GoogleCloudDialogflowV2LoggingConfigArgs(@Nullable Input<Boolean> enableStackdriverLogging) {
        this.enableStackdriverLogging = enableStackdriverLogging;
    }

    private GoogleCloudDialogflowV2LoggingConfigArgs() {
        this.enableStackdriverLogging = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2LoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableStackdriverLogging;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2LoggingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
        }

        public Builder enableStackdriverLogging(@Nullable Input<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }

        public Builder enableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Input.ofNullable(enableStackdriverLogging);
            return this;
        }
        public GoogleCloudDialogflowV2LoggingConfigArgs build() {
            return new GoogleCloudDialogflowV2LoggingConfigArgs(enableStackdriverLogging);
        }
    }
}
