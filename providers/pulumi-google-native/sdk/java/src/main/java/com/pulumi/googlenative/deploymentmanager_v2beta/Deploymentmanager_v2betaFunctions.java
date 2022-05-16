// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.deploymentmanager_v2beta;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.GetCompositeTypeArgs;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.GetDeploymentArgs;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.GetDeploymentIamPolicyArgs;
import com.pulumi.googlenative.deploymentmanager_v2beta.inputs.GetTypeProviderArgs;
import com.pulumi.googlenative.deploymentmanager_v2beta.outputs.GetCompositeTypeResult;
import com.pulumi.googlenative.deploymentmanager_v2beta.outputs.GetDeploymentIamPolicyResult;
import com.pulumi.googlenative.deploymentmanager_v2beta.outputs.GetDeploymentResult;
import com.pulumi.googlenative.deploymentmanager_v2beta.outputs.GetTypeProviderResult;
import java.util.concurrent.CompletableFuture;

public final class Deploymentmanager_v2betaFunctions {
    /**
     * Gets information about a specific composite type.
     * 
     */
    public static CompletableFuture<GetCompositeTypeResult> getCompositeType(GetCompositeTypeArgs args) {
        return getCompositeType(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a specific composite type.
     * 
     */
    public static CompletableFuture<GetCompositeTypeResult> getCompositeType(GetCompositeTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/v2beta:getCompositeType", TypeShape.of(GetCompositeTypeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a specific deployment.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args) {
        return getDeployment(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a specific deployment.
     * 
     */
    public static CompletableFuture<GetDeploymentResult> getDeployment(GetDeploymentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/v2beta:getDeployment", TypeShape.of(GetDeploymentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetDeploymentIamPolicyResult> getDeploymentIamPolicy(GetDeploymentIamPolicyArgs args) {
        return getDeploymentIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. May be empty if no such policy or resource exists.
     * 
     */
    public static CompletableFuture<GetDeploymentIamPolicyResult> getDeploymentIamPolicy(GetDeploymentIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/v2beta:getDeploymentIamPolicy", TypeShape.of(GetDeploymentIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about a specific type provider.
     * 
     */
    public static CompletableFuture<GetTypeProviderResult> getTypeProvider(GetTypeProviderArgs args) {
        return getTypeProvider(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about a specific type provider.
     * 
     */
    public static CompletableFuture<GetTypeProviderResult> getTypeProvider(GetTypeProviderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:deploymentmanager/v2beta:getTypeProvider", TypeShape.of(GetTypeProviderResult.class), args, Utilities.withVersion(options));
    }
}
