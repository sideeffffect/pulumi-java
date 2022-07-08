// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtasks.v2beta2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.GetQueueArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.GetQueueIamPolicyArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.GetQueueIamPolicyPlainArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.GetQueuePlainArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.GetTaskArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.inputs.GetTaskPlainArgs;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.GetQueueIamPolicyResult;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.GetQueueResult;
import com.pulumi.googlenative.cloudtasks.v2beta2.outputs.GetTaskResult;
import java.util.concurrent.CompletableFuture;

public final class Cloudtasks_v2beta2Functions {
    /**
     * Gets a queue.
     * 
     */
    public static Output<GetQueueResult> getQueue(GetQueueArgs args) {
        return getQueue(args, InvokeOptions.Empty);
    }
    /**
     * Gets a queue.
     * 
     */
    public static CompletableFuture<GetQueueResult> getQueuePlain(GetQueuePlainArgs args) {
        return getQueuePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a queue.
     * 
     */
    public static Output<GetQueueResult> getQueue(GetQueueArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudtasks/v2beta2:getQueue", TypeShape.of(GetQueueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a queue.
     * 
     */
    public static CompletableFuture<GetQueueResult> getQueuePlain(GetQueuePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtasks/v2beta2:getQueue", TypeShape.of(GetQueueResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a Queue. Returns an empty policy if the resource exists and does not have a policy set. Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission on the specified resource parent: * `cloudtasks.queues.getIamPolicy`
     * 
     */
    public static Output<GetQueueIamPolicyResult> getQueueIamPolicy(GetQueueIamPolicyArgs args) {
        return getQueueIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a Queue. Returns an empty policy if the resource exists and does not have a policy set. Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission on the specified resource parent: * `cloudtasks.queues.getIamPolicy`
     * 
     */
    public static CompletableFuture<GetQueueIamPolicyResult> getQueueIamPolicyPlain(GetQueueIamPolicyPlainArgs args) {
        return getQueueIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a Queue. Returns an empty policy if the resource exists and does not have a policy set. Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission on the specified resource parent: * `cloudtasks.queues.getIamPolicy`
     * 
     */
    public static Output<GetQueueIamPolicyResult> getQueueIamPolicy(GetQueueIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudtasks/v2beta2:getQueueIamPolicy", TypeShape.of(GetQueueIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a Queue. Returns an empty policy if the resource exists and does not have a policy set. Authorization requires the following [Google IAM](https://cloud.google.com/iam) permission on the specified resource parent: * `cloudtasks.queues.getIamPolicy`
     * 
     */
    public static CompletableFuture<GetQueueIamPolicyResult> getQueueIamPolicyPlain(GetQueueIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtasks/v2beta2:getQueueIamPolicy", TypeShape.of(GetQueueIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a task.
     * 
     */
    public static Output<GetTaskResult> getTask(GetTaskArgs args) {
        return getTask(args, InvokeOptions.Empty);
    }
    /**
     * Gets a task.
     * 
     */
    public static CompletableFuture<GetTaskResult> getTaskPlain(GetTaskPlainArgs args) {
        return getTaskPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a task.
     * 
     */
    public static Output<GetTaskResult> getTask(GetTaskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:cloudtasks/v2beta2:getTask", TypeShape.of(GetTaskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a task.
     * 
     */
    public static CompletableFuture<GetTaskResult> getTaskPlain(GetTaskPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:cloudtasks/v2beta2:getTask", TypeShape.of(GetTaskResult.class), args, Utilities.withVersion(options));
    }
}
