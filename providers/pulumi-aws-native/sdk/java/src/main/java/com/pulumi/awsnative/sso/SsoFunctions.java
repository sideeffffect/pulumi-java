// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.sso.inputs.GetAssignmentArgs;
import com.pulumi.awsnative.sso.inputs.GetInstanceAccessControlAttributeConfigurationArgs;
import com.pulumi.awsnative.sso.inputs.GetPermissionSetArgs;
import com.pulumi.awsnative.sso.outputs.GetAssignmentResult;
import com.pulumi.awsnative.sso.outputs.GetInstanceAccessControlAttributeConfigurationResult;
import com.pulumi.awsnative.sso.outputs.GetPermissionSetResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SsoFunctions {
    /**
     * Resource Type definition for SSO assignmet
     * 
     */
    public static CompletableFuture<GetAssignmentResult> getAssignment(GetAssignmentArgs args) {
        return getAssignment(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for SSO assignmet
     * 
     */
    public static CompletableFuture<GetAssignmentResult> getAssignment(GetAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sso:getAssignment", TypeShape.of(GetAssignmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for SSO InstanceAccessControlAttributeConfiguration
     * 
     */
    public static CompletableFuture<GetInstanceAccessControlAttributeConfigurationResult> getInstanceAccessControlAttributeConfiguration(GetInstanceAccessControlAttributeConfigurationArgs args) {
        return getInstanceAccessControlAttributeConfiguration(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for SSO InstanceAccessControlAttributeConfiguration
     * 
     */
    public static CompletableFuture<GetInstanceAccessControlAttributeConfigurationResult> getInstanceAccessControlAttributeConfiguration(GetInstanceAccessControlAttributeConfigurationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sso:getInstanceAccessControlAttributeConfiguration", TypeShape.of(GetInstanceAccessControlAttributeConfigurationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for SSO PermissionSet
     * 
     */
    public static CompletableFuture<GetPermissionSetResult> getPermissionSet(GetPermissionSetArgs args) {
        return getPermissionSet(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for SSO PermissionSet
     * 
     */
    public static CompletableFuture<GetPermissionSetResult> getPermissionSet(GetPermissionSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:sso:getPermissionSet", TypeShape.of(GetPermissionSetResult.class), args, Utilities.withVersion(options));
    }
}
