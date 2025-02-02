// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.storagepool.inputs.GetDiskPoolArgs;
import com.pulumi.azurenative.storagepool.inputs.GetDiskPoolPlainArgs;
import com.pulumi.azurenative.storagepool.inputs.GetIscsiTargetArgs;
import com.pulumi.azurenative.storagepool.inputs.GetIscsiTargetPlainArgs;
import com.pulumi.azurenative.storagepool.outputs.GetDiskPoolResult;
import com.pulumi.azurenative.storagepool.outputs.GetIscsiTargetResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class StoragepoolFunctions {
    /**
     * Response for Disk pool request.
     * API Version: 2020-03-15-preview.
     * 
     */
    public static Output<GetDiskPoolResult> getDiskPool(GetDiskPoolArgs args) {
        return getDiskPool(args, InvokeOptions.Empty);
    }
    /**
     * Response for Disk pool request.
     * API Version: 2020-03-15-preview.
     * 
     */
    public static CompletableFuture<GetDiskPoolResult> getDiskPoolPlain(GetDiskPoolPlainArgs args) {
        return getDiskPoolPlain(args, InvokeOptions.Empty);
    }
    /**
     * Response for Disk pool request.
     * API Version: 2020-03-15-preview.
     * 
     */
    public static Output<GetDiskPoolResult> getDiskPool(GetDiskPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:storagepool:getDiskPool", TypeShape.of(GetDiskPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response for Disk pool request.
     * API Version: 2020-03-15-preview.
     * 
     */
    public static CompletableFuture<GetDiskPoolResult> getDiskPoolPlain(GetDiskPoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storagepool:getDiskPool", TypeShape.of(GetDiskPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response for iSCSI target requests.
     * API Version: 2020-03-15-preview.
     * 
     */
    public static Output<GetIscsiTargetResult> getIscsiTarget(GetIscsiTargetArgs args) {
        return getIscsiTarget(args, InvokeOptions.Empty);
    }
    /**
     * Response for iSCSI target requests.
     * API Version: 2020-03-15-preview.
     * 
     */
    public static CompletableFuture<GetIscsiTargetResult> getIscsiTargetPlain(GetIscsiTargetPlainArgs args) {
        return getIscsiTargetPlain(args, InvokeOptions.Empty);
    }
    /**
     * Response for iSCSI target requests.
     * API Version: 2020-03-15-preview.
     * 
     */
    public static Output<GetIscsiTargetResult> getIscsiTarget(GetIscsiTargetArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:storagepool:getIscsiTarget", TypeShape.of(GetIscsiTargetResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Response for iSCSI target requests.
     * API Version: 2020-03-15-preview.
     * 
     */
    public static CompletableFuture<GetIscsiTargetResult> getIscsiTargetPlain(GetIscsiTargetPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:storagepool:getIscsiTarget", TypeShape.of(GetIscsiTargetResult.class), args, Utilities.withVersion(options));
    }
}
