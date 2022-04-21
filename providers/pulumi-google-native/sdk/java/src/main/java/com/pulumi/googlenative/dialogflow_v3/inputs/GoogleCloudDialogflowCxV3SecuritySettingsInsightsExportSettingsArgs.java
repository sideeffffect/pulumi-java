// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings for exporting conversations to [Insights](https://cloud.google.com/contact-center/insights/docs).
 * 
 */
public final class GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs Empty = new GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs();

    /**
     * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
     * 
     */
    @Import(name="enableInsightsExport")
    private @Nullable Output<Boolean> enableInsightsExport;

    public Optional<Output<Boolean>> enableInsightsExport() {
        return Optional.ofNullable(this.enableInsightsExport);
    }

    private GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs() {}

    private GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs(GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs $) {
        this.enableInsightsExport = $.enableInsightsExport;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs();
        }

        public Builder(GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs defaults) {
            $ = new GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableInsightsExport(@Nullable Output<Boolean> enableInsightsExport) {
            $.enableInsightsExport = enableInsightsExport;
            return this;
        }

        public Builder enableInsightsExport(Boolean enableInsightsExport) {
            return enableInsightsExport(Output.of(enableInsightsExport));
        }

        public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsArgs build() {
            return $;
        }
    }

}
