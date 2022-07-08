// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkconnectivity.v1alpha1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetConnectionPolicyIamPolicyArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetConnectionPolicyIamPolicyPlainArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetHubArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetHubIamPolicyArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetHubIamPolicyPlainArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetHubPlainArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetInternalRangeIamPolicyArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetInternalRangeIamPolicyPlainArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetServiceInstanceIamPolicyArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetServiceInstanceIamPolicyPlainArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetSpokeArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetSpokeIamPolicyArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetSpokeIamPolicyPlainArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.inputs.GetSpokePlainArgs;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs.GetConnectionPolicyIamPolicyResult;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs.GetHubIamPolicyResult;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs.GetHubResult;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs.GetInternalRangeIamPolicyResult;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs.GetServiceInstanceIamPolicyResult;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs.GetSpokeIamPolicyResult;
import com.pulumi.googlenative.networkconnectivity.v1alpha1.outputs.GetSpokeResult;
import java.util.concurrent.CompletableFuture;

public final class Networkconnectivity_v1alpha1Functions {
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetConnectionPolicyIamPolicyResult> getConnectionPolicyIamPolicy(GetConnectionPolicyIamPolicyArgs args) {
        return getConnectionPolicyIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectionPolicyIamPolicyResult> getConnectionPolicyIamPolicyPlain(GetConnectionPolicyIamPolicyPlainArgs args) {
        return getConnectionPolicyIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetConnectionPolicyIamPolicyResult> getConnectionPolicyIamPolicy(GetConnectionPolicyIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkconnectivity/v1alpha1:getConnectionPolicyIamPolicy", TypeShape.of(GetConnectionPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetConnectionPolicyIamPolicyResult> getConnectionPolicyIamPolicyPlain(GetConnectionPolicyIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getConnectionPolicyIamPolicy", TypeShape.of(GetConnectionPolicyIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Hub.
     * 
     */
    public static Output<GetHubResult> getHub(GetHubArgs args) {
        return getHub(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Hub.
     * 
     */
    public static CompletableFuture<GetHubResult> getHubPlain(GetHubPlainArgs args) {
        return getHubPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Hub.
     * 
     */
    public static Output<GetHubResult> getHub(GetHubArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkconnectivity/v1alpha1:getHub", TypeShape.of(GetHubResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Hub.
     * 
     */
    public static CompletableFuture<GetHubResult> getHubPlain(GetHubPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getHub", TypeShape.of(GetHubResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetHubIamPolicyResult> getHubIamPolicy(GetHubIamPolicyArgs args) {
        return getHubIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetHubIamPolicyResult> getHubIamPolicyPlain(GetHubIamPolicyPlainArgs args) {
        return getHubIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetHubIamPolicyResult> getHubIamPolicy(GetHubIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkconnectivity/v1alpha1:getHubIamPolicy", TypeShape.of(GetHubIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetHubIamPolicyResult> getHubIamPolicyPlain(GetHubIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getHubIamPolicy", TypeShape.of(GetHubIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetInternalRangeIamPolicyResult> getInternalRangeIamPolicy(GetInternalRangeIamPolicyArgs args) {
        return getInternalRangeIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInternalRangeIamPolicyResult> getInternalRangeIamPolicyPlain(GetInternalRangeIamPolicyPlainArgs args) {
        return getInternalRangeIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetInternalRangeIamPolicyResult> getInternalRangeIamPolicy(GetInternalRangeIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkconnectivity/v1alpha1:getInternalRangeIamPolicy", TypeShape.of(GetInternalRangeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetInternalRangeIamPolicyResult> getInternalRangeIamPolicyPlain(GetInternalRangeIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getInternalRangeIamPolicy", TypeShape.of(GetInternalRangeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceInstanceIamPolicyResult> getServiceInstanceIamPolicy(GetServiceInstanceIamPolicyArgs args) {
        return getServiceInstanceIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceInstanceIamPolicyResult> getServiceInstanceIamPolicyPlain(GetServiceInstanceIamPolicyPlainArgs args) {
        return getServiceInstanceIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetServiceInstanceIamPolicyResult> getServiceInstanceIamPolicy(GetServiceInstanceIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkconnectivity/v1alpha1:getServiceInstanceIamPolicy", TypeShape.of(GetServiceInstanceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetServiceInstanceIamPolicyResult> getServiceInstanceIamPolicyPlain(GetServiceInstanceIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getServiceInstanceIamPolicy", TypeShape.of(GetServiceInstanceIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Spoke.
     * 
     */
    public static Output<GetSpokeResult> getSpoke(GetSpokeArgs args) {
        return getSpoke(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Spoke.
     * 
     */
    public static CompletableFuture<GetSpokeResult> getSpokePlain(GetSpokePlainArgs args) {
        return getSpokePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets details of a single Spoke.
     * 
     */
    public static Output<GetSpokeResult> getSpoke(GetSpokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkconnectivity/v1alpha1:getSpoke", TypeShape.of(GetSpokeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets details of a single Spoke.
     * 
     */
    public static CompletableFuture<GetSpokeResult> getSpokePlain(GetSpokePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getSpoke", TypeShape.of(GetSpokeResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetSpokeIamPolicyResult> getSpokeIamPolicy(GetSpokeIamPolicyArgs args) {
        return getSpokeIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetSpokeIamPolicyResult> getSpokeIamPolicyPlain(GetSpokeIamPolicyPlainArgs args) {
        return getSpokeIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetSpokeIamPolicyResult> getSpokeIamPolicy(GetSpokeIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:networkconnectivity/v1alpha1:getSpokeIamPolicy", TypeShape.of(GetSpokeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetSpokeIamPolicyResult> getSpokeIamPolicyPlain(GetSpokeIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:networkconnectivity/v1alpha1:getSpokeIamPolicy", TypeShape.of(GetSpokeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
