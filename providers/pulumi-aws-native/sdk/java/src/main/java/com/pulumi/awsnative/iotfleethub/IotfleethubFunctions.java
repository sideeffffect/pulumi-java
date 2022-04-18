// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotfleethub;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotfleethub.inputs.GetApplicationArgs;
import com.pulumi.awsnative.iotfleethub.outputs.GetApplicationResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class IotfleethubFunctions {
    /**
     * Resource schema for AWS::IoTFleetHub::Application
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:iotfleethub:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
}
