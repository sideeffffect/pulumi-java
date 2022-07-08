// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryconnection.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.bigqueryconnection.v1beta1.inputs.GetConnectionArgs;
import com.pulumi.googlenative.bigqueryconnection.v1beta1.inputs.GetConnectionIamPolicyArgs;
import com.pulumi.googlenative.bigqueryconnection.v1beta1.inputs.GetConnectionIamPolicyPlainArgs;
import com.pulumi.googlenative.bigqueryconnection.v1beta1.inputs.GetConnectionPlainArgs;
import com.pulumi.googlenative.bigqueryconnection.v1beta1.outputs.GetConnectionIamPolicyResult;
import com.pulumi.googlenative.bigqueryconnection.v1beta1.outputs.GetConnectionResult;
import java.util.concurrent.CompletableFuture;

public final class Bigqueryconnection_v1beta1Functions {
    /**
     * Returns specified connection.
     * 
     */
    public static Output<GetConnectionResult> getConnection(GetConnectionArgs args) {
        return getConnection(args, InvokeOptions.Empty);
    }
    /**
     * Returns specified connection.
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnectionPlain(GetConnectionPlainArgs args) {
        return getConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns specified connection.
     * 
     */
    public static Output<GetConnectionResult> getConnection(GetConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:bigqueryconnection/v1beta1:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns specified connection.
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnectionPlain(GetConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigqueryconnection/v1beta1:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetConnectionIamPolicyResult> getConnectionIamPolicy(GetConnectionIamPolicyArgs args) {
        return getConnectionIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectionIamPolicyResult> getConnectionIamPolicyPlain(GetConnectionIamPolicyPlainArgs args) {
        return getConnectionIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetConnectionIamPolicyResult> getConnectionIamPolicy(GetConnectionIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:bigqueryconnection/v1beta1:getConnectionIamPolicy", TypeShape.of(GetConnectionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectionIamPolicyResult> getConnectionIamPolicyPlain(GetConnectionIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:bigqueryconnection/v1beta1:getConnectionIamPolicy", TypeShape.of(GetConnectionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
