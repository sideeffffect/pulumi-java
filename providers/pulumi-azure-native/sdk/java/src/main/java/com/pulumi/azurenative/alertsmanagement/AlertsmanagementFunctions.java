// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.alertsmanagement;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.alertsmanagement.inputs.GetActionRuleByNameArgs;
import com.pulumi.azurenative.alertsmanagement.inputs.GetSmartDetectorAlertRuleArgs;
import com.pulumi.azurenative.alertsmanagement.outputs.GetActionRuleByNameResult;
import com.pulumi.azurenative.alertsmanagement.outputs.GetSmartDetectorAlertRuleResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AlertsmanagementFunctions {
    /**
     * Action rule object containing target scope, conditions and suppression logic
     * API Version: 2019-05-05-preview.
     * 
     */
    public static CompletableFuture<GetActionRuleByNameResult> getActionRuleByName(GetActionRuleByNameArgs args) {
        return getActionRuleByName(args, InvokeOptions.Empty);
    }
    /**
     * Action rule object containing target scope, conditions and suppression logic
     * API Version: 2019-05-05-preview.
     * 
     */
    public static CompletableFuture<GetActionRuleByNameResult> getActionRuleByName(GetActionRuleByNameArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:alertsmanagement:getActionRuleByName", TypeShape.of(GetActionRuleByNameResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The alert rule information
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetSmartDetectorAlertRuleResult> getSmartDetectorAlertRule(GetSmartDetectorAlertRuleArgs args) {
        return getSmartDetectorAlertRule(args, InvokeOptions.Empty);
    }
    /**
     * The alert rule information
     * API Version: 2019-06-01.
     * 
     */
    public static CompletableFuture<GetSmartDetectorAlertRuleResult> getSmartDetectorAlertRule(GetSmartDetectorAlertRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:alertsmanagement:getSmartDetectorAlertRule", TypeShape.of(GetSmartDetectorAlertRuleResult.class), args, Utilities.withVersion(options));
    }
}
