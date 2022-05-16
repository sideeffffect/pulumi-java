// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ecs.inputs.GetCapacityProviderArgs;
import com.pulumi.awsnative.ecs.inputs.GetClusterArgs;
import com.pulumi.awsnative.ecs.inputs.GetClusterCapacityProviderAssociationsArgs;
import com.pulumi.awsnative.ecs.inputs.GetPrimaryTaskSetArgs;
import com.pulumi.awsnative.ecs.inputs.GetServiceArgs;
import com.pulumi.awsnative.ecs.inputs.GetTaskDefinitionArgs;
import com.pulumi.awsnative.ecs.inputs.GetTaskSetArgs;
import com.pulumi.awsnative.ecs.outputs.GetCapacityProviderResult;
import com.pulumi.awsnative.ecs.outputs.GetClusterCapacityProviderAssociationsResult;
import com.pulumi.awsnative.ecs.outputs.GetClusterResult;
import com.pulumi.awsnative.ecs.outputs.GetPrimaryTaskSetResult;
import com.pulumi.awsnative.ecs.outputs.GetServiceResult;
import com.pulumi.awsnative.ecs.outputs.GetTaskDefinitionResult;
import com.pulumi.awsnative.ecs.outputs.GetTaskSetResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EcsFunctions {
    /**
     * Resource Type definition for AWS::ECS::CapacityProvider.
     * 
     */
    public static CompletableFuture<GetCapacityProviderResult> getCapacityProvider(GetCapacityProviderArgs args) {
        return getCapacityProvider(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::ECS::CapacityProvider.
     * 
     */
    public static CompletableFuture<GetCapacityProviderResult> getCapacityProvider(GetCapacityProviderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getCapacityProvider", TypeShape.of(GetCapacityProviderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Create an Elastic Container Service (ECS) cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * Create an Elastic Container Service (ECS) cluster.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Associate a set of ECS Capacity Providers with a specified ECS Cluster
     * 
     */
    public static CompletableFuture<GetClusterCapacityProviderAssociationsResult> getClusterCapacityProviderAssociations(GetClusterCapacityProviderAssociationsArgs args) {
        return getClusterCapacityProviderAssociations(args, InvokeOptions.Empty);
    }
    /**
     * Associate a set of ECS Capacity Providers with a specified ECS Cluster
     * 
     */
    public static CompletableFuture<GetClusterCapacityProviderAssociationsResult> getClusterCapacityProviderAssociations(GetClusterCapacityProviderAssociationsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getClusterCapacityProviderAssociations", TypeShape.of(GetClusterCapacityProviderAssociationsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A pseudo-resource that manages which of your ECS task sets is primary.
     * 
     */
    public static CompletableFuture<GetPrimaryTaskSetResult> getPrimaryTaskSet(GetPrimaryTaskSetArgs args) {
        return getPrimaryTaskSet(args, InvokeOptions.Empty);
    }
    /**
     * A pseudo-resource that manages which of your ECS task sets is primary.
     * 
     */
    public static CompletableFuture<GetPrimaryTaskSetResult> getPrimaryTaskSet(GetPrimaryTaskSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getPrimaryTaskSet", TypeShape.of(GetPrimaryTaskSetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::ECS::Service
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::ECS::Service
     * 
     */
    public static CompletableFuture<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Schema describing various properties for ECS TaskDefinition
     * 
     */
    public static CompletableFuture<GetTaskDefinitionResult> getTaskDefinition(GetTaskDefinitionArgs args) {
        return getTaskDefinition(args, InvokeOptions.Empty);
    }
    /**
     * Resource Schema describing various properties for ECS TaskDefinition
     * 
     */
    public static CompletableFuture<GetTaskDefinitionResult> getTaskDefinition(GetTaskDefinitionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getTaskDefinition", TypeShape.of(GetTaskDefinitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Create a task set in the specified cluster and service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.htmlin the Amazon Elastic Container Service Developer Guide.
     * 
     */
    public static CompletableFuture<GetTaskSetResult> getTaskSet(GetTaskSetArgs args) {
        return getTaskSet(args, InvokeOptions.Empty);
    }
    /**
     * Create a task set in the specified cluster and service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.htmlin the Amazon Elastic Container Service Developer Guide.
     * 
     */
    public static CompletableFuture<GetTaskSetResult> getTaskSet(GetTaskSetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:ecs:getTaskSet", TypeShape.of(GetTaskSetResult.class), args, Utilities.withVersion(options));
    }
}
