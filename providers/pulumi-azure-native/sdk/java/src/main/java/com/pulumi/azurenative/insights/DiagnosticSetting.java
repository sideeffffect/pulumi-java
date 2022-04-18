// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.insights.DiagnosticSettingArgs;
import com.pulumi.azurenative.insights.outputs.LogSettingsResponse;
import com.pulumi.azurenative.insights.outputs.MetricSettingsResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The diagnostic setting resource.
 * API Version: 2017-05-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:insights:DiagnosticSetting mysetting /subscriptions/1a66ce04-b633-4a0b-b2bc-a912ec8986a6/resourcegroups/viruela1/providers/microsoft.logic/workflows/viruela6/diagnosticSettings/mysetting 
 * ```
 * 
 */
@ResourceType(type="azure-native:insights:DiagnosticSetting")
public class DiagnosticSetting extends com.pulumi.resources.CustomResource {
    /**
     * The resource Id for the event hub authorization rule.
     * 
     */
    @Export(name="eventHubAuthorizationRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubAuthorizationRuleId;

    /**
     * @return The resource Id for the event hub authorization rule.
     * 
     */
    public Output</* @Nullable */ String> eventHubAuthorizationRuleId() {
        return this.eventHubAuthorizationRuleId;
    }
    /**
     * The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    @Export(name="eventHubName", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubName;

    /**
     * @return The name of the event hub. If none is specified, the default event hub will be selected.
     * 
     */
    public Output</* @Nullable */ String> eventHubName() {
        return this.eventHubName;
    }
    /**
     * A string indicating whether the export to Log Analytics should use the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows: <normalized service identity>_<normalized category name>. Possible values are: Dedicated and null (null is default.)
     * 
     */
    @Export(name="logAnalyticsDestinationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> logAnalyticsDestinationType;

    /**
     * @return A string indicating whether the export to Log Analytics should use the default destination type, i.e. AzureDiagnostics, or use a destination type constructed as follows: <normalized service identity>_<normalized category name>. Possible values are: Dedicated and null (null is default.)
     * 
     */
    public Output</* @Nullable */ String> logAnalyticsDestinationType() {
        return this.logAnalyticsDestinationType;
    }
    /**
     * The list of logs settings.
     * 
     */
    @Export(name="logs", type=List.class, parameters={LogSettingsResponse.class})
    private Output</* @Nullable */ List<LogSettingsResponse>> logs;

    /**
     * @return The list of logs settings.
     * 
     */
    public Output</* @Nullable */ List<LogSettingsResponse>> logs() {
        return this.logs;
    }
    /**
     * The list of metric settings.
     * 
     */
    @Export(name="metrics", type=List.class, parameters={MetricSettingsResponse.class})
    private Output</* @Nullable */ List<MetricSettingsResponse>> metrics;

    /**
     * @return The list of metric settings.
     * 
     */
    public Output</* @Nullable */ List<MetricSettingsResponse>> metrics() {
        return this.metrics;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    @Export(name="serviceBusRuleId", type=String.class, parameters={})
    private Output</* @Nullable */ String> serviceBusRuleId;

    /**
     * @return The service bus rule Id of the diagnostic setting. This is here to maintain backwards compatibility.
     * 
     */
    public Output</* @Nullable */ String> serviceBusRuleId() {
        return this.serviceBusRuleId;
    }
    /**
     * The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    @Export(name="storageAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageAccountId;

    /**
     * @return The resource ID of the storage account to which you would like to send Diagnostic Logs.
     * 
     */
    public Output</* @Nullable */ String> storageAccountId() {
        return this.storageAccountId;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    @Export(name="workspaceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> workspaceId;

    /**
     * @return The full ARM resource ID of the Log Analytics workspace to which you would like to send Diagnostic Logs. Example: /subscriptions/4b9e8510-67ab-4e9a-95a9-e2f1e570ea9c/resourceGroups/insights-integration/providers/Microsoft.OperationalInsights/workspaces/viruela2
     * 
     */
    public Output</* @Nullable */ String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DiagnosticSetting(String name) {
        this(name, DiagnosticSettingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DiagnosticSetting(String name, DiagnosticSettingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DiagnosticSetting(String name, DiagnosticSettingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:DiagnosticSetting", name, args == null ? DiagnosticSettingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DiagnosticSetting(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:insights:DiagnosticSetting", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:insights/v20170501preview:DiagnosticSetting").build()),
                Output.of(Alias.builder().type("azure-native:insights/v20210501preview:DiagnosticSetting").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DiagnosticSetting get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DiagnosticSetting(name, id, options);
    }
}
