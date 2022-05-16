// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.servicebus.inputs.GetDisasterRecoveryConfigArgs;
import com.pulumi.azurenative.servicebus.inputs.GetMigrationConfigArgs;
import com.pulumi.azurenative.servicebus.inputs.GetNamespaceArgs;
import com.pulumi.azurenative.servicebus.inputs.GetNamespaceAuthorizationRuleArgs;
import com.pulumi.azurenative.servicebus.inputs.GetNamespaceIpFilterRuleArgs;
import com.pulumi.azurenative.servicebus.inputs.GetNamespaceNetworkRuleSetArgs;
import com.pulumi.azurenative.servicebus.inputs.GetNamespaceVirtualNetworkRuleArgs;
import com.pulumi.azurenative.servicebus.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.servicebus.inputs.GetQueueArgs;
import com.pulumi.azurenative.servicebus.inputs.GetQueueAuthorizationRuleArgs;
import com.pulumi.azurenative.servicebus.inputs.GetRuleArgs;
import com.pulumi.azurenative.servicebus.inputs.GetSubscriptionArgs;
import com.pulumi.azurenative.servicebus.inputs.GetTopicArgs;
import com.pulumi.azurenative.servicebus.inputs.GetTopicAuthorizationRuleArgs;
import com.pulumi.azurenative.servicebus.inputs.ListDisasterRecoveryConfigKeysArgs;
import com.pulumi.azurenative.servicebus.inputs.ListNamespaceKeysArgs;
import com.pulumi.azurenative.servicebus.inputs.ListQueueKeysArgs;
import com.pulumi.azurenative.servicebus.inputs.ListTopicKeysArgs;
import com.pulumi.azurenative.servicebus.outputs.GetDisasterRecoveryConfigResult;
import com.pulumi.azurenative.servicebus.outputs.GetMigrationConfigResult;
import com.pulumi.azurenative.servicebus.outputs.GetNamespaceAuthorizationRuleResult;
import com.pulumi.azurenative.servicebus.outputs.GetNamespaceIpFilterRuleResult;
import com.pulumi.azurenative.servicebus.outputs.GetNamespaceNetworkRuleSetResult;
import com.pulumi.azurenative.servicebus.outputs.GetNamespaceResult;
import com.pulumi.azurenative.servicebus.outputs.GetNamespaceVirtualNetworkRuleResult;
import com.pulumi.azurenative.servicebus.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.servicebus.outputs.GetQueueAuthorizationRuleResult;
import com.pulumi.azurenative.servicebus.outputs.GetQueueResult;
import com.pulumi.azurenative.servicebus.outputs.GetRuleResult;
import com.pulumi.azurenative.servicebus.outputs.GetSubscriptionResult;
import com.pulumi.azurenative.servicebus.outputs.GetTopicAuthorizationRuleResult;
import com.pulumi.azurenative.servicebus.outputs.GetTopicResult;
import com.pulumi.azurenative.servicebus.outputs.ListDisasterRecoveryConfigKeysResult;
import com.pulumi.azurenative.servicebus.outputs.ListNamespaceKeysResult;
import com.pulumi.azurenative.servicebus.outputs.ListQueueKeysResult;
import com.pulumi.azurenative.servicebus.outputs.ListTopicKeysResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ServicebusFunctions {
    /**
     * Single item in List or Get Alias(Disaster Recovery configuration) operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetDisasterRecoveryConfigResult> getDisasterRecoveryConfig(GetDisasterRecoveryConfigArgs args) {
        return getDisasterRecoveryConfig(args, InvokeOptions.Empty);
    }
    /**
     * Single item in List or Get Alias(Disaster Recovery configuration) operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetDisasterRecoveryConfigResult> getDisasterRecoveryConfig(GetDisasterRecoveryConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getDisasterRecoveryConfig", TypeShape.of(GetDisasterRecoveryConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in List or Get Migration Config operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetMigrationConfigResult> getMigrationConfig(GetMigrationConfigArgs args) {
        return getMigrationConfig(args, InvokeOptions.Empty);
    }
    /**
     * Single item in List or Get Migration Config operation
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetMigrationConfigResult> getMigrationConfig(GetMigrationConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getMigrationConfig", TypeShape.of(GetMigrationConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of a namespace resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceResult> getNamespace(GetNamespaceArgs args) {
        return getNamespace(args, InvokeOptions.Empty);
    }
    /**
     * Description of a namespace resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceResult> getNamespace(GetNamespaceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getNamespace", TypeShape.of(GetNamespaceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of a namespace authorization rule.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> getNamespaceAuthorizationRule(GetNamespaceAuthorizationRuleArgs args) {
        return getNamespaceAuthorizationRule(args, InvokeOptions.Empty);
    }
    /**
     * Description of a namespace authorization rule.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceAuthorizationRuleResult> getNamespaceAuthorizationRule(GetNamespaceAuthorizationRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getNamespaceAuthorizationRule", TypeShape.of(GetNamespaceAuthorizationRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in a List or Get IpFilterRules operation
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNamespaceIpFilterRuleResult> getNamespaceIpFilterRule(GetNamespaceIpFilterRuleArgs args) {
        return getNamespaceIpFilterRule(args, InvokeOptions.Empty);
    }
    /**
     * Single item in a List or Get IpFilterRules operation
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNamespaceIpFilterRuleResult> getNamespaceIpFilterRule(GetNamespaceIpFilterRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getNamespaceIpFilterRule", TypeShape.of(GetNamespaceIpFilterRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of NetworkRuleSet resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceNetworkRuleSetResult> getNamespaceNetworkRuleSet(GetNamespaceNetworkRuleSetArgs args) {
        return getNamespaceNetworkRuleSet(args, InvokeOptions.Empty);
    }
    /**
     * Description of NetworkRuleSet resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetNamespaceNetworkRuleSetResult> getNamespaceNetworkRuleSet(GetNamespaceNetworkRuleSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getNamespaceNetworkRuleSet", TypeShape.of(GetNamespaceNetworkRuleSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Single item in a List or Get VirtualNetworkRules operation
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNamespaceVirtualNetworkRuleResult> getNamespaceVirtualNetworkRule(GetNamespaceVirtualNetworkRuleArgs args) {
        return getNamespaceVirtualNetworkRule(args, InvokeOptions.Empty);
    }
    /**
     * Single item in a List or Get VirtualNetworkRules operation
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetNamespaceVirtualNetworkRuleResult> getNamespaceVirtualNetworkRule(GetNamespaceVirtualNetworkRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getNamespaceVirtualNetworkRule", TypeShape.of(GetNamespaceVirtualNetworkRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Properties of the PrivateEndpointConnection.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * Properties of the PrivateEndpointConnection.
     * API Version: 2018-01-01-preview.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of queue Resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetQueueResult> getQueue(GetQueueArgs args) {
        return getQueue(args, InvokeOptions.Empty);
    }
    /**
     * Description of queue Resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetQueueResult> getQueue(GetQueueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getQueue", TypeShape.of(GetQueueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of a namespace authorization rule.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetQueueAuthorizationRuleResult> getQueueAuthorizationRule(GetQueueAuthorizationRuleArgs args) {
        return getQueueAuthorizationRule(args, InvokeOptions.Empty);
    }
    /**
     * Description of a namespace authorization rule.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetQueueAuthorizationRuleResult> getQueueAuthorizationRule(GetQueueAuthorizationRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getQueueAuthorizationRule", TypeShape.of(GetQueueAuthorizationRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of Rule Resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetRuleResult> getRule(GetRuleArgs args) {
        return getRule(args, InvokeOptions.Empty);
    }
    /**
     * Description of Rule Resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetRuleResult> getRule(GetRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getRule", TypeShape.of(GetRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of subscription resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> getSubscription(GetSubscriptionArgs args) {
        return getSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Description of subscription resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> getSubscription(GetSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getSubscription", TypeShape.of(GetSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of topic resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopic(GetTopicArgs args) {
        return getTopic(args, InvokeOptions.Empty);
    }
    /**
     * Description of topic resource.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopic(GetTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getTopic", TypeShape.of(GetTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Description of a namespace authorization rule.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetTopicAuthorizationRuleResult> getTopicAuthorizationRule(GetTopicAuthorizationRuleArgs args) {
        return getTopicAuthorizationRule(args, InvokeOptions.Empty);
    }
    /**
     * Description of a namespace authorization rule.
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<GetTopicAuthorizationRuleResult> getTopicAuthorizationRule(GetTopicAuthorizationRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:getTopicAuthorizationRule", TypeShape.of(GetTopicAuthorizationRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListDisasterRecoveryConfigKeysResult> listDisasterRecoveryConfigKeys(ListDisasterRecoveryConfigKeysArgs args) {
        return listDisasterRecoveryConfigKeys(args, InvokeOptions.Empty);
    }
    /**
     * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListDisasterRecoveryConfigKeysResult> listDisasterRecoveryConfigKeys(ListDisasterRecoveryConfigKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:listDisasterRecoveryConfigKeys", TypeShape.of(ListDisasterRecoveryConfigKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListNamespaceKeysResult> listNamespaceKeys(ListNamespaceKeysArgs args) {
        return listNamespaceKeys(args, InvokeOptions.Empty);
    }
    /**
     * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListNamespaceKeysResult> listNamespaceKeys(ListNamespaceKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:listNamespaceKeys", TypeShape.of(ListNamespaceKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListQueueKeysResult> listQueueKeys(ListQueueKeysArgs args) {
        return listQueueKeys(args, InvokeOptions.Empty);
    }
    /**
     * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListQueueKeysResult> listQueueKeys(ListQueueKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:listQueueKeys", TypeShape.of(ListQueueKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListTopicKeysResult> listTopicKeys(ListTopicKeysArgs args) {
        return listTopicKeys(args, InvokeOptions.Empty);
    }
    /**
     * Namespace/ServiceBus Connection String
     * API Version: 2017-04-01.
     * 
     */
    public static CompletableFuture<ListTopicKeysResult> listTopicKeys(ListTopicKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:servicebus:listTopicKeys", TypeShape.of(ListTopicKeysResult.class), args, Utilities.withVersion(options));
    }
}
