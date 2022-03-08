// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3.outputs.GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3AdvancedSettingsResponse {
    /**
     * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
     * 
     */
    private final GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings;

    @OutputCustomType.Constructor({"loggingSettings"})
    private GoogleCloudDialogflowCxV3AdvancedSettingsResponse(GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings) {
        this.loggingSettings = loggingSettings;
    }

    /**
     * Settings for logging. Settings for Dialogflow History, Contact Center messages, StackDriver logs, and speech logging. Exposed at the following levels: - Agent level.
     * 
    */
    public GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse getLoggingSettings() {
        return this.loggingSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3AdvancedSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3AdvancedSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loggingSettings = defaults.loggingSettings;
        }

        public Builder setLoggingSettings(GoogleCloudDialogflowCxV3AdvancedSettingsLoggingSettingsResponse loggingSettings) {
            this.loggingSettings = Objects.requireNonNull(loggingSettings);
            return this;
        }
        public GoogleCloudDialogflowCxV3AdvancedSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3AdvancedSettingsResponse(loggingSettings);
        }
    }
}
