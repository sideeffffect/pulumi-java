// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.insights.inputs.ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProactiveDetectionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProactiveDetectionConfigurationArgs Empty = new ProactiveDetectionConfigurationArgs();

    /**
     * The ProactiveDetection configuration ID. This is unique within a Application Insights component.
     * 
     */
    @Import(name="configurationId")
    private @Nullable Output<String> configurationId;

    public Optional<Output<String>> configurationId() {
        return Optional.ofNullable(this.configurationId);
    }

    /**
     * Custom email addresses for this rule notifications
     * 
     */
    @Import(name="customEmails")
    private @Nullable Output<List<String>> customEmails;

    public Optional<Output<List<String>>> customEmails() {
        return Optional.ofNullable(this.customEmails);
    }

    /**
     * A flag that indicates whether this rule is enabled by the user
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The last time this rule was updated
     * 
     */
    @Import(name="lastUpdatedTime")
    private @Nullable Output<String> lastUpdatedTime;

    public Optional<Output<String>> lastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }

    /**
     * The rule name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Application Insights component resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Static definitions of the ProactiveDetection configuration rule (same values for all components).
     * 
     */
    @Import(name="ruleDefinitions")
    private @Nullable Output<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions;

    public Optional<Output<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs>> ruleDefinitions() {
        return Optional.ofNullable(this.ruleDefinitions);
    }

    /**
     * A flag that indicated whether notifications on this rule should be sent to subscription owners
     * 
     */
    @Import(name="sendEmailsToSubscriptionOwners")
    private @Nullable Output<Boolean> sendEmailsToSubscriptionOwners;

    public Optional<Output<Boolean>> sendEmailsToSubscriptionOwners() {
        return Optional.ofNullable(this.sendEmailsToSubscriptionOwners);
    }

    private ProactiveDetectionConfigurationArgs() {}

    private ProactiveDetectionConfigurationArgs(ProactiveDetectionConfigurationArgs $) {
        this.configurationId = $.configurationId;
        this.customEmails = $.customEmails;
        this.enabled = $.enabled;
        this.lastUpdatedTime = $.lastUpdatedTime;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
        this.ruleDefinitions = $.ruleDefinitions;
        this.sendEmailsToSubscriptionOwners = $.sendEmailsToSubscriptionOwners;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProactiveDetectionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProactiveDetectionConfigurationArgs $;

        public Builder() {
            $ = new ProactiveDetectionConfigurationArgs();
        }

        public Builder(ProactiveDetectionConfigurationArgs defaults) {
            $ = new ProactiveDetectionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder configurationId(@Nullable Output<String> configurationId) {
            $.configurationId = configurationId;
            return this;
        }

        public Builder configurationId(String configurationId) {
            return configurationId(Output.of(configurationId));
        }

        public Builder customEmails(@Nullable Output<List<String>> customEmails) {
            $.customEmails = customEmails;
            return this;
        }

        public Builder customEmails(List<String> customEmails) {
            return customEmails(Output.of(customEmails));
        }

        public Builder customEmails(String... customEmails) {
            return customEmails(List.of(customEmails));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            $.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder lastUpdatedTime(String lastUpdatedTime) {
            return lastUpdatedTime(Output.of(lastUpdatedTime));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public Builder ruleDefinitions(@Nullable Output<ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs> ruleDefinitions) {
            $.ruleDefinitions = ruleDefinitions;
            return this;
        }

        public Builder ruleDefinitions(ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitionsArgs ruleDefinitions) {
            return ruleDefinitions(Output.of(ruleDefinitions));
        }

        public Builder sendEmailsToSubscriptionOwners(@Nullable Output<Boolean> sendEmailsToSubscriptionOwners) {
            $.sendEmailsToSubscriptionOwners = sendEmailsToSubscriptionOwners;
            return this;
        }

        public Builder sendEmailsToSubscriptionOwners(Boolean sendEmailsToSubscriptionOwners) {
            return sendEmailsToSubscriptionOwners(Output.of(sendEmailsToSubscriptionOwners));
        }

        public ProactiveDetectionConfigurationArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
