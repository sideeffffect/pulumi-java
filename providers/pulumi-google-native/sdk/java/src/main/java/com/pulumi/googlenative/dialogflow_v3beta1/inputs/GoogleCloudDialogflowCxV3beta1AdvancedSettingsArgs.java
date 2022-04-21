// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Hierarchical advanced settings for agent/flow/page/fulfillment/parameter. Settings exposed at lower level overrides the settings exposed at higher level. Hierarchy: Agent-&gt;Flow-&gt;Page-&gt;Fulfillment/Parameter.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs Empty = new GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs();

    /**
     * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
     * 
     */
    @Import(name="loggingSettings")
    private @Nullable Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs> loggingSettings;

    public Optional<Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs>> loggingSettings() {
        return Optional.ofNullable(this.loggingSettings);
    }

    private GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs() {}

    private GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs(GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs $) {
        this.loggingSettings = $.loggingSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder loggingSettings(@Nullable Output<GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs> loggingSettings) {
            $.loggingSettings = loggingSettings;
            return this;
        }

        public Builder loggingSettings(GoogleCloudDialogflowCxV3beta1AdvancedSettingsLoggingSettingsArgs loggingSettings) {
            return loggingSettings(Output.of(loggingSettings));
        }

        public GoogleCloudDialogflowCxV3beta1AdvancedSettingsArgs build() {
            return $;
        }
    }

}
