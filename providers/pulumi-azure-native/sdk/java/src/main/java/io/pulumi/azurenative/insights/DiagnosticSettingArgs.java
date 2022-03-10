// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.LogSettingsArgs;
import io.pulumi.azurenative.insights.inputs.MetricSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiagnosticSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiagnosticSettingArgs Empty = new DiagnosticSettingArgs();

    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @InputImport(name="eventHubAuthorizationRuleId")
      private final @Nullable Input<String> eventHubAuthorizationRuleId;

    public Input<String> getEventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId == null ? Input.empty() : this.eventHubAuthorizationRuleId;
    }

    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @InputImport(name="eventHubName")
      private final @Nullable Input<String> eventHubName;

    public Input<String> getEventHubName() {
        return this.eventHubName == null ? Input.empty() : this.eventHubName;
    }

    /**
     * A string indicating whether the export to Log Analytics should use the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows: <normalized service identity>_<normalized category name>. Possible values are: Dedicated and null (null is default.)
     * 
     */
    @InputImport(name="logAnalyticsDestinationType")
      private final @Nullable Input<String> logAnalyticsDestinationType;

    public Input<String> getLogAnalyticsDestinationType() {
        return this.logAnalyticsDestinationType == null ? Input.empty() : this.logAnalyticsDestinationType;
    }

    /**
     * The list of logs settings.
     * 
     */
    @InputImport(name="logs")
      private final @Nullable Input<List<LogSettingsArgs>> logs;

    public Input<List<LogSettingsArgs>> getLogs() {
        return this.logs == null ? Input.empty() : this.logs;
    }

    /**
     * The list of metric settings.
     * 
     */
    @InputImport(name="metrics")
      private final @Nullable Input<List<MetricSettingsArgs>> metrics;

    public Input<List<MetricSettingsArgs>> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    /**
     * The name of the diagnostic setting.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final Input<String> resourceUri;

    public Input<String> getResourceUri() {
        return this.resourceUri;
    }

    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @InputImport(name="serviceBusRuleId")
      private final @Nullable Input<String> serviceBusRuleId;

    public Input<String> getServiceBusRuleId() {
        return this.serviceBusRuleId == null ? Input.empty() : this.serviceBusRuleId;
    }

    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @InputImport(name="storageAccountId")
      private final @Nullable Input<String> storageAccountId;

    public Input<String> getStorageAccountId() {
        return this.storageAccountId == null ? Input.empty() : this.storageAccountId;
    }

    /**
     * The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @InputImport(name="workspaceId")
      private final @Nullable Input<String> workspaceId;

    public Input<String> getWorkspaceId() {
        return this.workspaceId == null ? Input.empty() : this.workspaceId;
    }

    public DiagnosticSettingArgs(
        @Nullable Input<String> eventHubAuthorizationRuleId,
        @Nullable Input<String> eventHubName,
        @Nullable Input<String> logAnalyticsDestinationType,
        @Nullable Input<List<LogSettingsArgs>> logs,
        @Nullable Input<List<MetricSettingsArgs>> metrics,
        @Nullable Input<String> name,
        Input<String> resourceUri,
        @Nullable Input<String> serviceBusRuleId,
        @Nullable Input<String> storageAccountId,
        @Nullable Input<String> workspaceId) {
        this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
        this.eventHubName = eventHubName;
        this.logAnalyticsDestinationType = logAnalyticsDestinationType;
        this.logs = logs;
        this.metrics = metrics;
        this.name = name;
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
        this.serviceBusRuleId = serviceBusRuleId;
        this.storageAccountId = storageAccountId;
        this.workspaceId = workspaceId;
    }

    private DiagnosticSettingArgs() {
        this.eventHubAuthorizationRuleId = Input.empty();
        this.eventHubName = Input.empty();
        this.logAnalyticsDestinationType = Input.empty();
        this.logs = Input.empty();
        this.metrics = Input.empty();
        this.name = Input.empty();
        this.resourceUri = Input.empty();
        this.serviceBusRuleId = Input.empty();
        this.storageAccountId = Input.empty();
        this.workspaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> eventHubAuthorizationRuleId;
        private @Nullable Input<String> eventHubName;
        private @Nullable Input<String> logAnalyticsDestinationType;
        private @Nullable Input<List<LogSettingsArgs>> logs;
        private @Nullable Input<List<MetricSettingsArgs>> metrics;
        private @Nullable Input<String> name;
        private Input<String> resourceUri;
        private @Nullable Input<String> serviceBusRuleId;
        private @Nullable Input<String> storageAccountId;
        private @Nullable Input<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubAuthorizationRuleId = defaults.eventHubAuthorizationRuleId;
    	      this.eventHubName = defaults.eventHubName;
    	      this.logAnalyticsDestinationType = defaults.logAnalyticsDestinationType;
    	      this.logs = defaults.logs;
    	      this.metrics = defaults.metrics;
    	      this.name = defaults.name;
    	      this.resourceUri = defaults.resourceUri;
    	      this.serviceBusRuleId = defaults.serviceBusRuleId;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder eventHubAuthorizationRuleId(@Nullable Input<String> eventHubAuthorizationRuleId) {
            this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
            return this;
        }

        public Builder eventHubAuthorizationRuleId(@Nullable String eventHubAuthorizationRuleId) {
            this.eventHubAuthorizationRuleId = Input.ofNullable(eventHubAuthorizationRuleId);
            return this;
        }

        public Builder eventHubName(@Nullable Input<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }

        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = Input.ofNullable(eventHubName);
            return this;
        }

        public Builder logAnalyticsDestinationType(@Nullable Input<String> logAnalyticsDestinationType) {
            this.logAnalyticsDestinationType = logAnalyticsDestinationType;
            return this;
        }

        public Builder logAnalyticsDestinationType(@Nullable String logAnalyticsDestinationType) {
            this.logAnalyticsDestinationType = Input.ofNullable(logAnalyticsDestinationType);
            return this;
        }

        public Builder logs(@Nullable Input<List<LogSettingsArgs>> logs) {
            this.logs = logs;
            return this;
        }

        public Builder logs(@Nullable List<LogSettingsArgs> logs) {
            this.logs = Input.ofNullable(logs);
            return this;
        }

        public Builder metrics(@Nullable Input<List<MetricSettingsArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder metrics(@Nullable List<MetricSettingsArgs> metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder resourceUri(Input<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder resourceUri(String resourceUri) {
            this.resourceUri = Input.of(Objects.requireNonNull(resourceUri));
            return this;
        }

        public Builder serviceBusRuleId(@Nullable Input<String> serviceBusRuleId) {
            this.serviceBusRuleId = serviceBusRuleId;
            return this;
        }

        public Builder serviceBusRuleId(@Nullable String serviceBusRuleId) {
            this.serviceBusRuleId = Input.ofNullable(serviceBusRuleId);
            return this;
        }

        public Builder storageAccountId(@Nullable Input<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }

        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Input.ofNullable(storageAccountId);
            return this;
        }

        public Builder workspaceId(@Nullable Input<String> workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = Input.ofNullable(workspaceId);
            return this;
        }
        public DiagnosticSettingArgs build() {
            return new DiagnosticSettingArgs(eventHubAuthorizationRuleId, eventHubName, logAnalyticsDestinationType, logs, metrics, name, resourceUri, serviceBusRuleId, storageAccountId, workspaceId);
        }
    }
}
