// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy.v2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.orgpolicy.v2.inputs.GetFolderPolicyArgs;
import com.pulumi.googlenative.orgpolicy.v2.inputs.GetFolderPolicyPlainArgs;
import com.pulumi.googlenative.orgpolicy.v2.inputs.GetOrganizationPolicyArgs;
import com.pulumi.googlenative.orgpolicy.v2.inputs.GetOrganizationPolicyPlainArgs;
import com.pulumi.googlenative.orgpolicy.v2.inputs.GetPolicyArgs;
import com.pulumi.googlenative.orgpolicy.v2.inputs.GetPolicyPlainArgs;
import com.pulumi.googlenative.orgpolicy.v2.outputs.GetFolderPolicyResult;
import com.pulumi.googlenative.orgpolicy.v2.outputs.GetOrganizationPolicyResult;
import com.pulumi.googlenative.orgpolicy.v2.outputs.GetPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class Orgpolicy_v2Functions {
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static Output<GetFolderPolicyResult> getFolderPolicy(GetFolderPolicyArgs args) {
        return getFolderPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static CompletableFuture<GetFolderPolicyResult> getFolderPolicyPlain(GetFolderPolicyPlainArgs args) {
        return getFolderPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static Output<GetFolderPolicyResult> getFolderPolicy(GetFolderPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:orgpolicy/v2:getFolderPolicy", TypeShape.of(GetFolderPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static CompletableFuture<GetFolderPolicyResult> getFolderPolicyPlain(GetFolderPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:orgpolicy/v2:getFolderPolicy", TypeShape.of(GetFolderPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static Output<GetOrganizationPolicyResult> getOrganizationPolicy(GetOrganizationPolicyArgs args) {
        return getOrganizationPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static CompletableFuture<GetOrganizationPolicyResult> getOrganizationPolicyPlain(GetOrganizationPolicyPlainArgs args) {
        return getOrganizationPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static Output<GetOrganizationPolicyResult> getOrganizationPolicy(GetOrganizationPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:orgpolicy/v2:getOrganizationPolicy", TypeShape.of(GetOrganizationPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static CompletableFuture<GetOrganizationPolicyResult> getOrganizationPolicyPlain(GetOrganizationPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:orgpolicy/v2:getOrganizationPolicy", TypeShape.of(GetOrganizationPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static Output<GetPolicyResult> getPolicy(GetPolicyArgs args) {
        return getPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicyPlain(GetPolicyPlainArgs args) {
        return getPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static Output<GetPolicyResult> getPolicy(GetPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:orgpolicy/v2:getPolicy", TypeShape.of(GetPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a `Policy` on a resource. If no `Policy` is set on the resource, NOT_FOUND is returned. The `etag` value can be used with `UpdatePolicy()` to update a `Policy` during read-modify-write.
     * 
     */
    public static CompletableFuture<GetPolicyResult> getPolicyPlain(GetPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:orgpolicy/v2:getPolicy", TypeShape.of(GetPolicyResult.class), args, Utilities.withVersion(options));
    }
}
