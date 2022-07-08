// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.ids.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.ids.v1.inputs.GetEndpointArgs;
import com.pulumi.googlenative.ids.v1.inputs.GetEndpointIamPolicyArgs;
import com.pulumi.googlenative.ids.v1.inputs.GetEndpointIamPolicyPlainArgs;
import com.pulumi.googlenative.ids.v1.inputs.GetEndpointPlainArgs;
import com.pulumi.googlenative.ids.v1.outputs.GetEndpointIamPolicyResult;
import com.pulumi.googlenative.ids.v1.outputs.GetEndpointResult;
import java.util.concurrent.CompletableFuture;

public final class Ids_v1Functions {
    /**
     * Gets details of a single Endpoint.
     * 
     */
    public static Output<GetEndpointResult> getEndpoint(GetEndpointArgs args) {
        return getEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Endpoint.
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain(GetEndpointPlainArgs args) {
        return getEndpointPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Endpoint.
     * 
     */
    public static Output<GetEndpointResult> getEndpoint(GetEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ids/v1:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Endpoint.
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain(GetEndpointPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ids/v1:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetEndpointIamPolicyResult> getEndpointIamPolicy(GetEndpointIamPolicyArgs args) {
        return getEndpointIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEndpointIamPolicyResult> getEndpointIamPolicyPlain(GetEndpointIamPolicyPlainArgs args) {
        return getEndpointIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetEndpointIamPolicyResult> getEndpointIamPolicy(GetEndpointIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:ids/v1:getEndpointIamPolicy", TypeShape.of(GetEndpointIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetEndpointIamPolicyResult> getEndpointIamPolicyPlain(GetEndpointIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:ids/v1:getEndpointIamPolicy", TypeShape.of(GetEndpointIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
