// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.applicationinsights;

import com.pulumi.awsnative.applicationinsights.inputs.ApplicationComponentMonitoringSettingArgs;
import com.pulumi.awsnative.applicationinsights.inputs.ApplicationCustomComponentArgs;
import com.pulumi.awsnative.applicationinsights.inputs.ApplicationLogPatternSetArgs;
import com.pulumi.awsnative.applicationinsights.inputs.ApplicationTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * If set to true, application will be configured with recommended monitoring configuration.
     * 
     */
    @Import(name="autoConfigurationEnabled")
    private @Nullable Output<Boolean> autoConfigurationEnabled;

    public Optional<Output<Boolean>> autoConfigurationEnabled() {
        return Optional.ofNullable(this.autoConfigurationEnabled);
    }

    /**
     * Indicates whether Application Insights can listen to CloudWatch events for the application resources.
     * 
     */
    @Import(name="cWEMonitorEnabled")
    private @Nullable Output<Boolean> cWEMonitorEnabled;

    public Optional<Output<Boolean>> cWEMonitorEnabled() {
        return Optional.ofNullable(this.cWEMonitorEnabled);
    }

    /**
     * The monitoring settings of the components.
     * 
     */
    @Import(name="componentMonitoringSettings")
    private @Nullable Output<List<ApplicationComponentMonitoringSettingArgs>> componentMonitoringSettings;

    public Optional<Output<List<ApplicationComponentMonitoringSettingArgs>>> componentMonitoringSettings() {
        return Optional.ofNullable(this.componentMonitoringSettings);
    }

    /**
     * The custom grouped components.
     * 
     */
    @Import(name="customComponents")
    private @Nullable Output<List<ApplicationCustomComponentArgs>> customComponents;

    public Optional<Output<List<ApplicationCustomComponentArgs>>> customComponents() {
        return Optional.ofNullable(this.customComponents);
    }

    /**
     * The log pattern sets.
     * 
     */
    @Import(name="logPatternSets")
    private @Nullable Output<List<ApplicationLogPatternSetArgs>> logPatternSets;

    public Optional<Output<List<ApplicationLogPatternSetArgs>>> logPatternSets() {
        return Optional.ofNullable(this.logPatternSets);
    }

    /**
     * When set to true, creates opsItems for any problems detected on an application.
     * 
     */
    @Import(name="opsCenterEnabled")
    private @Nullable Output<Boolean> opsCenterEnabled;

    public Optional<Output<Boolean>> opsCenterEnabled() {
        return Optional.ofNullable(this.opsCenterEnabled);
    }

    /**
     * The SNS topic provided to Application Insights that is associated to the created opsItem.
     * 
     */
    @Import(name="opsItemSNSTopicArn")
    private @Nullable Output<String> opsItemSNSTopicArn;

    public Optional<Output<String>> opsItemSNSTopicArn() {
        return Optional.ofNullable(this.opsItemSNSTopicArn);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The tags of Application Insights application.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ApplicationTagArgs>> tags;

    public Optional<Output<List<ApplicationTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.autoConfigurationEnabled = $.autoConfigurationEnabled;
        this.cWEMonitorEnabled = $.cWEMonitorEnabled;
        this.componentMonitoringSettings = $.componentMonitoringSettings;
        this.customComponents = $.customComponents;
        this.logPatternSets = $.logPatternSets;
        this.opsCenterEnabled = $.opsCenterEnabled;
        this.opsItemSNSTopicArn = $.opsItemSNSTopicArn;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArgs $;

        public Builder() {
            $ = new ApplicationArgs();
        }

        public Builder(ApplicationArgs defaults) {
            $ = new ApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoConfigurationEnabled(@Nullable Output<Boolean> autoConfigurationEnabled) {
            $.autoConfigurationEnabled = autoConfigurationEnabled;
            return this;
        }

        public Builder autoConfigurationEnabled(Boolean autoConfigurationEnabled) {
            return autoConfigurationEnabled(Output.of(autoConfigurationEnabled));
        }

        public Builder cWEMonitorEnabled(@Nullable Output<Boolean> cWEMonitorEnabled) {
            $.cWEMonitorEnabled = cWEMonitorEnabled;
            return this;
        }

        public Builder cWEMonitorEnabled(Boolean cWEMonitorEnabled) {
            return cWEMonitorEnabled(Output.of(cWEMonitorEnabled));
        }

        public Builder componentMonitoringSettings(@Nullable Output<List<ApplicationComponentMonitoringSettingArgs>> componentMonitoringSettings) {
            $.componentMonitoringSettings = componentMonitoringSettings;
            return this;
        }

        public Builder componentMonitoringSettings(List<ApplicationComponentMonitoringSettingArgs> componentMonitoringSettings) {
            return componentMonitoringSettings(Output.of(componentMonitoringSettings));
        }

        public Builder componentMonitoringSettings(ApplicationComponentMonitoringSettingArgs... componentMonitoringSettings) {
            return componentMonitoringSettings(List.of(componentMonitoringSettings));
        }

        public Builder customComponents(@Nullable Output<List<ApplicationCustomComponentArgs>> customComponents) {
            $.customComponents = customComponents;
            return this;
        }

        public Builder customComponents(List<ApplicationCustomComponentArgs> customComponents) {
            return customComponents(Output.of(customComponents));
        }

        public Builder customComponents(ApplicationCustomComponentArgs... customComponents) {
            return customComponents(List.of(customComponents));
        }

        public Builder logPatternSets(@Nullable Output<List<ApplicationLogPatternSetArgs>> logPatternSets) {
            $.logPatternSets = logPatternSets;
            return this;
        }

        public Builder logPatternSets(List<ApplicationLogPatternSetArgs> logPatternSets) {
            return logPatternSets(Output.of(logPatternSets));
        }

        public Builder logPatternSets(ApplicationLogPatternSetArgs... logPatternSets) {
            return logPatternSets(List.of(logPatternSets));
        }

        public Builder opsCenterEnabled(@Nullable Output<Boolean> opsCenterEnabled) {
            $.opsCenterEnabled = opsCenterEnabled;
            return this;
        }

        public Builder opsCenterEnabled(Boolean opsCenterEnabled) {
            return opsCenterEnabled(Output.of(opsCenterEnabled));
        }

        public Builder opsItemSNSTopicArn(@Nullable Output<String> opsItemSNSTopicArn) {
            $.opsItemSNSTopicArn = opsItemSNSTopicArn;
            return this;
        }

        public Builder opsItemSNSTopicArn(String opsItemSNSTopicArn) {
            return opsItemSNSTopicArn(Output.of(opsItemSNSTopicArn));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<List<ApplicationTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<ApplicationTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(ApplicationTagArgs... tags) {
            return tags(List.of(tags));
        }

        public ApplicationArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
