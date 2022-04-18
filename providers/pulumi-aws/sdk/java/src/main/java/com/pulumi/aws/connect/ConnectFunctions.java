// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.inputs.GetBotAssociationArgs;
import com.pulumi.aws.connect.inputs.GetContactFlowArgs;
import com.pulumi.aws.connect.inputs.GetContactFlowModuleArgs;
import com.pulumi.aws.connect.inputs.GetHoursOfOperationArgs;
import com.pulumi.aws.connect.inputs.GetInstanceArgs;
import com.pulumi.aws.connect.inputs.GetLambdaFunctionAssociationArgs;
import com.pulumi.aws.connect.inputs.GetPromptArgs;
import com.pulumi.aws.connect.inputs.GetQuickConnectArgs;
import com.pulumi.aws.connect.outputs.GetBotAssociationResult;
import com.pulumi.aws.connect.outputs.GetContactFlowModuleResult;
import com.pulumi.aws.connect.outputs.GetContactFlowResult;
import com.pulumi.aws.connect.outputs.GetHoursOfOperationResult;
import com.pulumi.aws.connect.outputs.GetInstanceResult;
import com.pulumi.aws.connect.outputs.GetLambdaFunctionAssociationResult;
import com.pulumi.aws.connect.outputs.GetPromptResult;
import com.pulumi.aws.connect.outputs.GetQuickConnectResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ConnectFunctions {
    /**
     * Provides details about a specific Lex (V1) Bot associated with an Amazon Connect instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBotAssociationResult> getBotAssociation(GetBotAssociationArgs args) {
        return getBotAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBotAssociationResult> getBotAssociation(GetBotAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getBotAssociation:getBotAssociation", TypeShape.of(GetBotAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Connect Contact Flow.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetContactFlowResult> getContactFlow(GetContactFlowArgs args) {
        return getContactFlow(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetContactFlowResult> getContactFlow(GetContactFlowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getContactFlow:getContactFlow", TypeShape.of(GetContactFlowResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Connect Contact Flow Module.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetContactFlowModuleResult> getContactFlowModule(GetContactFlowModuleArgs args) {
        return getContactFlowModule(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetContactFlowModuleResult> getContactFlowModule(GetContactFlowModuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getContactFlowModule:getContactFlowModule", TypeShape.of(GetContactFlowModuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Connect Hours of Operation.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetHoursOfOperationResult> getHoursOfOperation(GetHoursOfOperationArgs args) {
        return getHoursOfOperation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetHoursOfOperationResult> getHoursOfOperation(GetHoursOfOperationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getHoursOfOperation:getHoursOfOperation", TypeShape.of(GetHoursOfOperationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Connect Instance.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetInstanceResult> getInstance() {
        return getInstance(GetInstanceArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args) {
        return getInstance(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetInstanceResult> getInstance(GetInstanceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getInstance:getInstance", TypeShape.of(GetInstanceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Connect Lambda Function Association.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLambdaFunctionAssociationResult> getLambdaFunctionAssociation(GetLambdaFunctionAssociationArgs args) {
        return getLambdaFunctionAssociation(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLambdaFunctionAssociationResult> getLambdaFunctionAssociation(GetLambdaFunctionAssociationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getLambdaFunctionAssociation:getLambdaFunctionAssociation", TypeShape.of(GetLambdaFunctionAssociationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Connect Prompt.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPromptResult> getPrompt(GetPromptArgs args) {
        return getPrompt(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPromptResult> getPrompt(GetPromptArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getPrompt:getPrompt", TypeShape.of(GetPromptResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides details about a specific Amazon Connect Quick Connect.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetQuickConnectResult> getQuickConnect(GetQuickConnectArgs args) {
        return getQuickConnect(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetQuickConnectResult> getQuickConnect(GetQuickConnectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:connect/getQuickConnect:getQuickConnect", TypeShape.of(GetQuickConnectResult.class), args, Utilities.withVersion(options));
    }
}
