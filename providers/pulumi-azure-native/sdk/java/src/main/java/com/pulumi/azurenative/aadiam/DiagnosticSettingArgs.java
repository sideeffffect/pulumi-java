// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam;

import com.pulumi.azurenative.aadiam.inputs.LogSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DiagnosticSettingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticSettingArgs Empty = new DiagnosticSettingArgs();

    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @Import(name="eventHubAuthorizationRuleId")
      private final @Nullable Output<String> eventHubAuthorizationRuleId;

    public Output<String> eventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId == null ? Codegen.empty() : this.eventHubAuthorizationRuleId;
    }

    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @Import(name="eventHubName")
      private final @Nullable Output<String> eventHubName;

    public Output<String> eventHubName() {
        return this.eventHubName == null ? Codegen.empty() : this.eventHubName;
    }

    /**
     * The list of logs settings.
     * 
     */
    @Import(name="logs")
      private final @Nullable Output<List<LogSettingsArgs>> logs;

    public Output<List<LogSettingsArgs>> logs() {
        return this.logs == null ? Codegen.empty() : this.logs;
    }

    /**
     * The name of the diagnostic setting.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @Import(name="serviceBusRuleId")
      private final @Nullable Output<String> serviceBusRuleId;

    public Output<String> serviceBusRuleId() {
        return this.serviceBusRuleId == null ? Codegen.empty() : this.serviceBusRuleId;
    }

    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @Import(name="storageAccountId")
      private final @Nullable Output<String> storageAccountId;

    public Output<String> storageAccountId() {
        return this.storageAccountId == null ? Codegen.empty() : this.storageAccountId;
    }

    /**
     * The workspace ID (resource ID of a Log Analytics workspace) for a Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @Import(name="workspaceId")
      private final @Nullable Output<String> workspaceId;

    public Output<String> workspaceId() {
        return this.workspaceId == null ? Codegen.empty() : this.workspaceId;
    }

    public DiagnosticSettingArgs(
        @Nullable Output<String> eventHubAuthorizationRuleId,
        @Nullable Output<String> eventHubName,
        @Nullable Output<List<LogSettingsArgs>> logs,
        @Nullable Output<String> name,
        @Nullable Output<String> serviceBusRuleId,
        @Nullable Output<String> storageAccountId,
        @Nullable Output<String> workspaceId) {
        this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
        this.eventHubName = eventHubName;
        this.logs = logs;
        this.name = name;
        this.serviceBusRuleId = serviceBusRuleId;
        this.storageAccountId = storageAccountId;
        this.workspaceId = workspaceId;
    }

    private DiagnosticSettingArgs() {
        this.eventHubAuthorizationRuleId = Codegen.empty();
        this.eventHubName = Codegen.empty();
        this.logs = Codegen.empty();
        this.name = Codegen.empty();
        this.serviceBusRuleId = Codegen.empty();
        this.storageAccountId = Codegen.empty();
        this.workspaceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eventHubAuthorizationRuleId;
        private @Nullable Output<String> eventHubName;
        private @Nullable Output<List<LogSettingsArgs>> logs;
        private @Nullable Output<String> name;
        private @Nullable Output<String> serviceBusRuleId;
        private @Nullable Output<String> storageAccountId;
        private @Nullable Output<String> workspaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubAuthorizationRuleId = defaults.eventHubAuthorizationRuleId;
    	      this.eventHubName = defaults.eventHubName;
    	      this.logs = defaults.logs;
    	      this.name = defaults.name;
    	      this.serviceBusRuleId = defaults.serviceBusRuleId;
    	      this.storageAccountId = defaults.storageAccountId;
    	      this.workspaceId = defaults.workspaceId;
        }

        public Builder eventHubAuthorizationRuleId(@Nullable Output<String> eventHubAuthorizationRuleId) {
            this.eventHubAuthorizationRuleId = eventHubAuthorizationRuleId;
            return this;
        }
        public Builder eventHubAuthorizationRuleId(@Nullable String eventHubAuthorizationRuleId) {
            this.eventHubAuthorizationRuleId = Codegen.ofNullable(eventHubAuthorizationRuleId);
            return this;
        }
        public Builder eventHubName(@Nullable Output<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }
        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = Codegen.ofNullable(eventHubName);
            return this;
        }
        public Builder logs(@Nullable Output<List<LogSettingsArgs>> logs) {
            this.logs = logs;
            return this;
        }
        public Builder logs(@Nullable List<LogSettingsArgs> logs) {
            this.logs = Codegen.ofNullable(logs);
            return this;
        }
        public Builder logs(LogSettingsArgs... logs) {
            return logs(List.of(logs));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder serviceBusRuleId(@Nullable Output<String> serviceBusRuleId) {
            this.serviceBusRuleId = serviceBusRuleId;
            return this;
        }
        public Builder serviceBusRuleId(@Nullable String serviceBusRuleId) {
            this.serviceBusRuleId = Codegen.ofNullable(serviceBusRuleId);
            return this;
        }
        public Builder storageAccountId(@Nullable Output<String> storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }
        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = Codegen.ofNullable(storageAccountId);
            return this;
        }
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public Builder workspaceId(@Nullable String workspaceId) {
            this.workspaceId = Codegen.ofNullable(workspaceId);
            return this;
        }        public DiagnosticSettingArgs build() {
            return new DiagnosticSettingArgs(eventHubAuthorizationRuleId, eventHubName, logs, name, serviceBusRuleId, storageAccountId, workspaceId);
        }
    }
}
