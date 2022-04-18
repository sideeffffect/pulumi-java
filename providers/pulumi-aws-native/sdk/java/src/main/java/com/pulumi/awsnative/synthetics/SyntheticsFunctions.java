// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.synthetics;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.synthetics.inputs.GetCanaryArgs;
import com.pulumi.awsnative.synthetics.outputs.GetCanaryResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class SyntheticsFunctions {
    /**
     * Resource Type definition for AWS::Synthetics::Canary
     * 
     */
    public static CompletableFuture<GetCanaryResult> getCanary(GetCanaryArgs args) {
        return getCanary(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCanaryResult> getCanary(GetCanaryArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:synthetics:getCanary", TypeShape.of(GetCanaryResult.class), args, Utilities.withVersion(options));
    }
}
