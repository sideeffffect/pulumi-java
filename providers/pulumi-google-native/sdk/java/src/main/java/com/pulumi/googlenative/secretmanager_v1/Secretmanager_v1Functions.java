// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.secretmanager_v1.inputs.GetSecretArgs;
import com.pulumi.googlenative.secretmanager_v1.inputs.GetSecretIamPolicyArgs;
import com.pulumi.googlenative.secretmanager_v1.outputs.GetSecretIamPolicyResult;
import com.pulumi.googlenative.secretmanager_v1.outputs.GetSecretResult;
import java.util.concurrent.CompletableFuture;

public final class Secretmanager_v1Functions {
    /**
     * Gets metadata for a given Secret.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args) {
        return getSecret(args, InvokeOptions.Empty);
    }
    /**
     * Gets metadata for a given Secret.
     * 
     */
    public static CompletableFuture<GetSecretResult> getSecret(GetSecretArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:secretmanager/v1:getSecret", TypeShape.of(GetSecretResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a secret. Returns empty policy if the secret exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetSecretIamPolicyResult> getSecretIamPolicy(GetSecretIamPolicyArgs args) {
        return getSecretIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a secret. Returns empty policy if the secret exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetSecretIamPolicyResult> getSecretIamPolicy(GetSecretIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:secretmanager/v1:getSecretIamPolicy", TypeShape.of(GetSecretIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
