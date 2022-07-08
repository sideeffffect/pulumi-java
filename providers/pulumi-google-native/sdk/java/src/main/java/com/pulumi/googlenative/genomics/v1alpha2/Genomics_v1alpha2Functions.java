// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.genomics.v1alpha2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.genomics.v1alpha2.inputs.GetPipelineArgs;
import com.pulumi.googlenative.genomics.v1alpha2.inputs.GetPipelinePlainArgs;
import com.pulumi.googlenative.genomics.v1alpha2.outputs.GetPipelineResult;
import java.util.concurrent.CompletableFuture;

public final class Genomics_v1alpha2Functions {
    /**
     * Retrieves a pipeline based on ID. Caller must have READ permission to the project.
     * 
     */
    public static Output<GetPipelineResult> getPipeline(GetPipelineArgs args) {
        return getPipeline(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a pipeline based on ID. Caller must have READ permission to the project.
     * 
     */
    public static CompletableFuture<GetPipelineResult> getPipelinePlain(GetPipelinePlainArgs args) {
        return getPipelinePlain(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves a pipeline based on ID. Caller must have READ permission to the project.
     * 
     */
    public static Output<GetPipelineResult> getPipeline(GetPipelineArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:genomics/v1alpha2:getPipeline", TypeShape.of(GetPipelineResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves a pipeline based on ID. Caller must have READ permission to the project.
     * 
     */
    public static CompletableFuture<GetPipelineResult> getPipelinePlain(GetPipelinePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:genomics/v1alpha2:getPipeline", TypeShape.of(GetPipelineResult.class), args, Utilities.withVersion(options));
    }
}
