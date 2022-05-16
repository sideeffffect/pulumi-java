// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.connect.inputs.GetContactFlowArgs;
import com.pulumi.awsnative.connect.inputs.GetContactFlowModuleArgs;
import com.pulumi.awsnative.connect.inputs.GetHoursOfOperationArgs;
import com.pulumi.awsnative.connect.inputs.GetPhoneNumberArgs;
import com.pulumi.awsnative.connect.inputs.GetQuickConnectArgs;
import com.pulumi.awsnative.connect.inputs.GetUserArgs;
import com.pulumi.awsnative.connect.inputs.GetUserHierarchyGroupArgs;
import com.pulumi.awsnative.connect.outputs.GetContactFlowModuleResult;
import com.pulumi.awsnative.connect.outputs.GetContactFlowResult;
import com.pulumi.awsnative.connect.outputs.GetHoursOfOperationResult;
import com.pulumi.awsnative.connect.outputs.GetPhoneNumberResult;
import com.pulumi.awsnative.connect.outputs.GetQuickConnectResult;
import com.pulumi.awsnative.connect.outputs.GetUserHierarchyGroupResult;
import com.pulumi.awsnative.connect.outputs.GetUserResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ConnectFunctions {
    /**
     * Resource Type definition for AWS::Connect::ContactFlow
     * 
     */
    public static CompletableFuture<GetContactFlowResult> getContactFlow(GetContactFlowArgs args) {
        return getContactFlow(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Connect::ContactFlow
     * 
     */
    public static CompletableFuture<GetContactFlowResult> getContactFlow(GetContactFlowArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getContactFlow", TypeShape.of(GetContactFlowResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Connect::ContactFlowModule.
     * 
     */
    public static CompletableFuture<GetContactFlowModuleResult> getContactFlowModule(GetContactFlowModuleArgs args) {
        return getContactFlowModule(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Connect::ContactFlowModule.
     * 
     */
    public static CompletableFuture<GetContactFlowModuleResult> getContactFlowModule(GetContactFlowModuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getContactFlowModule", TypeShape.of(GetContactFlowModuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Connect::HoursOfOperation
     * 
     */
    public static CompletableFuture<GetHoursOfOperationResult> getHoursOfOperation(GetHoursOfOperationArgs args) {
        return getHoursOfOperation(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Connect::HoursOfOperation
     * 
     */
    public static CompletableFuture<GetHoursOfOperationResult> getHoursOfOperation(GetHoursOfOperationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getHoursOfOperation", TypeShape.of(GetHoursOfOperationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Connect::PhoneNumber
     * 
     */
    public static CompletableFuture<GetPhoneNumberResult> getPhoneNumber(GetPhoneNumberArgs args) {
        return getPhoneNumber(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Connect::PhoneNumber
     * 
     */
    public static CompletableFuture<GetPhoneNumberResult> getPhoneNumber(GetPhoneNumberArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getPhoneNumber", TypeShape.of(GetPhoneNumberResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Connect::QuickConnect
     * 
     */
    public static CompletableFuture<GetQuickConnectResult> getQuickConnect(GetQuickConnectArgs args) {
        return getQuickConnect(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Connect::QuickConnect
     * 
     */
    public static CompletableFuture<GetQuickConnectResult> getQuickConnect(GetQuickConnectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getQuickConnect", TypeShape.of(GetQuickConnectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Connect::User
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args) {
        return getUser(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Connect::User
     * 
     */
    public static CompletableFuture<GetUserResult> getUser(GetUserArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Connect::UserHierarchyGroup
     * 
     */
    public static CompletableFuture<GetUserHierarchyGroupResult> getUserHierarchyGroup(GetUserHierarchyGroupArgs args) {
        return getUserHierarchyGroup(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Connect::UserHierarchyGroup
     * 
     */
    public static CompletableFuture<GetUserHierarchyGroupResult> getUserHierarchyGroup(GetUserHierarchyGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:connect:getUserHierarchyGroup", TypeShape.of(GetUserHierarchyGroupResult.class), args, Utilities.withVersion(options));
    }
}
