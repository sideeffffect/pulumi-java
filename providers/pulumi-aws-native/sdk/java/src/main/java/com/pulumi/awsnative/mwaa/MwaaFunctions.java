// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mwaa;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.mwaa.inputs.GetEnvironmentArgs;
import com.pulumi.awsnative.mwaa.outputs.GetEnvironmentResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MwaaFunctions {
    /**
     * Resource schema for AWS::MWAA::Environment
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * Resource schema for AWS::MWAA::Environment
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:mwaa:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
}
