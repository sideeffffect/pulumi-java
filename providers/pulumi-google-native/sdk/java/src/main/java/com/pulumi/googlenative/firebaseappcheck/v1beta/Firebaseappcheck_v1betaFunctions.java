// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebaseappcheck.v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.firebaseappcheck.v1beta.inputs.GetDebugTokenArgs;
import com.pulumi.googlenative.firebaseappcheck.v1beta.inputs.GetDebugTokenPlainArgs;
import com.pulumi.googlenative.firebaseappcheck.v1beta.outputs.GetDebugTokenResult;
import java.util.concurrent.CompletableFuture;

public final class Firebaseappcheck_v1betaFunctions {
    /**
     * Gets the specified DebugToken. For security reasons, the `token` field is never populated in the response.
     * 
     */
    public static Output<GetDebugTokenResult> getDebugToken(GetDebugTokenArgs args) {
        return getDebugToken(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified DebugToken. For security reasons, the `token` field is never populated in the response.
     * 
     */
    public static CompletableFuture<GetDebugTokenResult> getDebugTokenPlain(GetDebugTokenPlainArgs args) {
        return getDebugTokenPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified DebugToken. For security reasons, the `token` field is never populated in the response.
     * 
     */
    public static Output<GetDebugTokenResult> getDebugToken(GetDebugTokenArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:firebaseappcheck/v1beta:getDebugToken", TypeShape.of(GetDebugTokenResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified DebugToken. For security reasons, the `token` field is never populated in the response.
     * 
     */
    public static CompletableFuture<GetDebugTokenResult> getDebugTokenPlain(GetDebugTokenPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:firebaseappcheck/v1beta:getDebugToken", TypeShape.of(GetDebugTokenResult.class), args, Utilities.withVersion(options));
    }
}
