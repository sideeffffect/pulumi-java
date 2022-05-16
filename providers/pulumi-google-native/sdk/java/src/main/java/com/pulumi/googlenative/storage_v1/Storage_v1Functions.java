// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.storage_v1.inputs.GetBucketAccessControlArgs;
import com.pulumi.googlenative.storage_v1.inputs.GetBucketArgs;
import com.pulumi.googlenative.storage_v1.inputs.GetBucketIamPolicyArgs;
import com.pulumi.googlenative.storage_v1.inputs.GetBucketObjectArgs;
import com.pulumi.googlenative.storage_v1.inputs.GetDefaultObjectAccessControlArgs;
import com.pulumi.googlenative.storage_v1.inputs.GetHmacKeyArgs;
import com.pulumi.googlenative.storage_v1.inputs.GetNotificationArgs;
import com.pulumi.googlenative.storage_v1.inputs.GetObjectAccessControlArgs;
import com.pulumi.googlenative.storage_v1.inputs.GetObjectIamPolicyArgs;
import com.pulumi.googlenative.storage_v1.outputs.GetBucketAccessControlResult;
import com.pulumi.googlenative.storage_v1.outputs.GetBucketIamPolicyResult;
import com.pulumi.googlenative.storage_v1.outputs.GetBucketObjectResult;
import com.pulumi.googlenative.storage_v1.outputs.GetBucketResult;
import com.pulumi.googlenative.storage_v1.outputs.GetDefaultObjectAccessControlResult;
import com.pulumi.googlenative.storage_v1.outputs.GetHmacKeyResult;
import com.pulumi.googlenative.storage_v1.outputs.GetNotificationResult;
import com.pulumi.googlenative.storage_v1.outputs.GetObjectAccessControlResult;
import com.pulumi.googlenative.storage_v1.outputs.GetObjectIamPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class Storage_v1Functions {
    /**
     * Returns metadata for the specified bucket.
     * 
     */
    public static CompletableFuture<GetBucketResult> getBucket(GetBucketArgs args) {
        return getBucket(args, InvokeOptions.Empty);
    }
    /**
     * Returns metadata for the specified bucket.
     * 
     */
    public static CompletableFuture<GetBucketResult> getBucket(GetBucketArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getBucket", TypeShape.of(GetBucketResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the ACL entry for the specified entity on the specified bucket.
     * 
     */
    public static CompletableFuture<GetBucketAccessControlResult> getBucketAccessControl(GetBucketAccessControlArgs args) {
        return getBucketAccessControl(args, InvokeOptions.Empty);
    }
    /**
     * Returns the ACL entry for the specified entity on the specified bucket.
     * 
     */
    public static CompletableFuture<GetBucketAccessControlResult> getBucketAccessControl(GetBucketAccessControlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getBucketAccessControl", TypeShape.of(GetBucketAccessControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns an IAM policy for the specified bucket.
     * 
     */
    public static CompletableFuture<GetBucketIamPolicyResult> getBucketIamPolicy(GetBucketIamPolicyArgs args) {
        return getBucketIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Returns an IAM policy for the specified bucket.
     * 
     */
    public static CompletableFuture<GetBucketIamPolicyResult> getBucketIamPolicy(GetBucketIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getBucketIamPolicy", TypeShape.of(GetBucketIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves an object or its metadata.
     * 
     */
    public static CompletableFuture<GetBucketObjectResult> getBucketObject(GetBucketObjectArgs args) {
        return getBucketObject(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an object or its metadata.
     * 
     */
    public static CompletableFuture<GetBucketObjectResult> getBucketObject(GetBucketObjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getBucketObject", TypeShape.of(GetBucketObjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the default object ACL entry for the specified entity on the specified bucket.
     * 
     */
    public static CompletableFuture<GetDefaultObjectAccessControlResult> getDefaultObjectAccessControl(GetDefaultObjectAccessControlArgs args) {
        return getDefaultObjectAccessControl(args, InvokeOptions.Empty);
    }
    /**
     * Returns the default object ACL entry for the specified entity on the specified bucket.
     * 
     */
    public static CompletableFuture<GetDefaultObjectAccessControlResult> getDefaultObjectAccessControl(GetDefaultObjectAccessControlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getDefaultObjectAccessControl", TypeShape.of(GetDefaultObjectAccessControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Retrieves an HMAC key&#39;s metadata
     * 
     */
    public static CompletableFuture<GetHmacKeyResult> getHmacKey(GetHmacKeyArgs args) {
        return getHmacKey(args, InvokeOptions.Empty);
    }
    /**
     * Retrieves an HMAC key&#39;s metadata
     * 
     */
    public static CompletableFuture<GetHmacKeyResult> getHmacKey(GetHmacKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getHmacKey", TypeShape.of(GetHmacKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * View a notification configuration.
     * 
     */
    public static CompletableFuture<GetNotificationResult> getNotification(GetNotificationArgs args) {
        return getNotification(args, InvokeOptions.Empty);
    }
    /**
     * View a notification configuration.
     * 
     */
    public static CompletableFuture<GetNotificationResult> getNotification(GetNotificationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getNotification", TypeShape.of(GetNotificationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns the ACL entry for the specified entity on the specified object.
     * 
     */
    public static CompletableFuture<GetObjectAccessControlResult> getObjectAccessControl(GetObjectAccessControlArgs args) {
        return getObjectAccessControl(args, InvokeOptions.Empty);
    }
    /**
     * Returns the ACL entry for the specified entity on the specified object.
     * 
     */
    public static CompletableFuture<GetObjectAccessControlResult> getObjectAccessControl(GetObjectAccessControlArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getObjectAccessControl", TypeShape.of(GetObjectAccessControlResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns an IAM policy for the specified object.
     * 
     */
    public static CompletableFuture<GetObjectIamPolicyResult> getObjectIamPolicy(GetObjectIamPolicyArgs args) {
        return getObjectIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Returns an IAM policy for the specified object.
     * 
     */
    public static CompletableFuture<GetObjectIamPolicyResult> getObjectIamPolicy(GetObjectIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:storage/v1:getObjectIamPolicy", TypeShape.of(GetObjectIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
