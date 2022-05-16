// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.devopsguru;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.devopsguru.inputs.GetNotificationChannelArgs;
import com.pulumi.awsnative.devopsguru.inputs.GetResourceCollectionArgs;
import com.pulumi.awsnative.devopsguru.outputs.GetNotificationChannelResult;
import com.pulumi.awsnative.devopsguru.outputs.GetResourceCollectionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DevopsguruFunctions {
    /**
     * This resource schema represents the NotificationChannel resource in the Amazon DevOps Guru.
     * 
     */
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannel(GetNotificationChannelArgs args) {
        return getNotificationChannel(args, InvokeOptions.Empty);
    }
    /**
     * This resource schema represents the NotificationChannel resource in the Amazon DevOps Guru.
     * 
     */
    public static CompletableFuture<GetNotificationChannelResult> getNotificationChannel(GetNotificationChannelArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:devopsguru:getNotificationChannel", TypeShape.of(GetNotificationChannelResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This resource schema represents the ResourceCollection resource in the Amazon DevOps Guru.
     * 
     */
    public static CompletableFuture<GetResourceCollectionResult> getResourceCollection(GetResourceCollectionArgs args) {
        return getResourceCollection(args, InvokeOptions.Empty);
    }
    /**
     * This resource schema represents the ResourceCollection resource in the Amazon DevOps Guru.
     * 
     */
    public static CompletableFuture<GetResourceCollectionResult> getResourceCollection(GetResourceCollectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:devopsguru:getResourceCollection", TypeShape.of(GetResourceCollectionResult.class), args, Utilities.withVersion(options));
    }
}
