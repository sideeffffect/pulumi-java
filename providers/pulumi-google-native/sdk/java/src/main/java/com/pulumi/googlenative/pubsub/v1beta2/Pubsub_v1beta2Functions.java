// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.pubsub.v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.pubsub.v1beta2.inputs.GetSubscriptionArgs;
import com.pulumi.googlenative.pubsub.v1beta2.inputs.GetSubscriptionIamPolicyArgs;
import com.pulumi.googlenative.pubsub.v1beta2.inputs.GetSubscriptionIamPolicyPlainArgs;
import com.pulumi.googlenative.pubsub.v1beta2.inputs.GetSubscriptionPlainArgs;
import com.pulumi.googlenative.pubsub.v1beta2.inputs.GetTopicArgs;
import com.pulumi.googlenative.pubsub.v1beta2.inputs.GetTopicIamPolicyArgs;
import com.pulumi.googlenative.pubsub.v1beta2.inputs.GetTopicIamPolicyPlainArgs;
import com.pulumi.googlenative.pubsub.v1beta2.inputs.GetTopicPlainArgs;
import com.pulumi.googlenative.pubsub.v1beta2.outputs.GetSubscriptionIamPolicyResult;
import com.pulumi.googlenative.pubsub.v1beta2.outputs.GetSubscriptionResult;
import com.pulumi.googlenative.pubsub.v1beta2.outputs.GetTopicIamPolicyResult;
import com.pulumi.googlenative.pubsub.v1beta2.outputs.GetTopicResult;
import java.util.concurrent.CompletableFuture;

public final class Pubsub_v1beta2Functions {
    /**
     * Gets the configuration details of a subscription.
     * 
     */
    public static Output<GetSubscriptionResult> getSubscription(GetSubscriptionArgs args) {
        return getSubscription(args, InvokeOptions.Empty);
    }
    /**
     * Gets the configuration details of a subscription.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> getSubscriptionPlain(GetSubscriptionPlainArgs args) {
        return getSubscriptionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the configuration details of a subscription.
     * 
     */
    public static Output<GetSubscriptionResult> getSubscription(GetSubscriptionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:pubsub/v1beta2:getSubscription", TypeShape.of(GetSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the configuration details of a subscription.
     * 
     */
    public static CompletableFuture<GetSubscriptionResult> getSubscriptionPlain(GetSubscriptionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsub/v1beta2:getSubscription", TypeShape.of(GetSubscriptionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetSubscriptionIamPolicyResult> getSubscriptionIamPolicy(GetSubscriptionIamPolicyArgs args) {
        return getSubscriptionIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetSubscriptionIamPolicyResult> getSubscriptionIamPolicyPlain(GetSubscriptionIamPolicyPlainArgs args) {
        return getSubscriptionIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetSubscriptionIamPolicyResult> getSubscriptionIamPolicy(GetSubscriptionIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:pubsub/v1beta2:getSubscriptionIamPolicy", TypeShape.of(GetSubscriptionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetSubscriptionIamPolicyResult> getSubscriptionIamPolicyPlain(GetSubscriptionIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsub/v1beta2:getSubscriptionIamPolicy", TypeShape.of(GetSubscriptionIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the configuration of a topic.
     * 
     */
    public static Output<GetTopicResult> getTopic(GetTopicArgs args) {
        return getTopic(args, InvokeOptions.Empty);
    }
    /**
     * Gets the configuration of a topic.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopicPlain(GetTopicPlainArgs args) {
        return getTopicPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the configuration of a topic.
     * 
     */
    public static Output<GetTopicResult> getTopic(GetTopicArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:pubsub/v1beta2:getTopic", TypeShape.of(GetTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the configuration of a topic.
     * 
     */
    public static CompletableFuture<GetTopicResult> getTopicPlain(GetTopicPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsub/v1beta2:getTopic", TypeShape.of(GetTopicResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetTopicIamPolicyResult> getTopicIamPolicy(GetTopicIamPolicyArgs args) {
        return getTopicIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTopicIamPolicyResult> getTopicIamPolicyPlain(GetTopicIamPolicyPlainArgs args) {
        return getTopicIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetTopicIamPolicyResult> getTopicIamPolicy(GetTopicIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:pubsub/v1beta2:getTopicIamPolicy", TypeShape.of(GetTopicIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetTopicIamPolicyResult> getTopicIamPolicyPlain(GetTopicIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:pubsub/v1beta2:getTopicIamPolicy", TypeShape.of(GetTopicIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
