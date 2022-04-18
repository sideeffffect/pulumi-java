// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.openenergyplatform;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.openenergyplatform.inputs.GetEnergyServiceArgs;
import com.pulumi.azurenative.openenergyplatform.outputs.GetEnergyServiceResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class OpenenergyplatformFunctions {
    /**
     * API Version: 2021-06-01-preview.
     * 
     */
    public static CompletableFuture<GetEnergyServiceResult> getEnergyService(GetEnergyServiceArgs args) {
        return getEnergyService(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetEnergyServiceResult> getEnergyService(GetEnergyServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:openenergyplatform:getEnergyService", TypeShape.of(GetEnergyServiceResult.class), args, Utilities.withVersion(options));
    }
}
