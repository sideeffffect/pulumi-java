// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.elasticloadbalancingv2.inputs.GetListenerArgs;
import com.pulumi.aws.elasticloadbalancingv2.inputs.GetLoadBalancerArgs;
import com.pulumi.aws.elasticloadbalancingv2.inputs.GetTargetGroupArgs;
import com.pulumi.aws.elasticloadbalancingv2.outputs.GetListenerResult;
import com.pulumi.aws.elasticloadbalancingv2.outputs.GetLoadBalancerResult;
import com.pulumi.aws.elasticloadbalancingv2.outputs.GetTargetGroupResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class Elasticloadbalancingv2Functions {
    /**
     * > **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Listener.
     * 
     * This data source can prove useful when a module accepts an LB Listener as an input variable and needs to know the LB it is attached to, or other information specific to the listener in question.
     * 
     * ## Example Usage
     * 
     * @Deprecated
     * aws.elasticloadbalancingv2.getListener has been deprecated in favor of aws.lb.getListener
     * 
     */
    @Deprecated /* aws.elasticloadbalancingv2.getListener has been deprecated in favor of aws.lb.getListener */
    public static CompletableFuture<GetListenerResult> getListener() {
        return getListener(GetListenerArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetListenerResult> getListener(GetListenerArgs args) {
        return getListener(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetListenerResult> getListener(GetListenerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticloadbalancingv2/getListener:getListener", TypeShape.of(GetListenerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * > **Note:** `aws.alb.LoadBalancer` is known as `aws.lb.LoadBalancer`. The functionality is identical.
     * 
     * Provides information about a Load Balancer.
     * 
     * This data source can prove useful when a module accepts an LB as an input
     * variable and needs to, for example, determine the security groups associated
     * with it, etc.
     * 
     * ## Example Usage
     * 
     * @Deprecated
     * aws.elasticloadbalancingv2.getLoadBalancer has been deprecated in favor of aws.lb.getLoadBalancer
     * 
     */
    @Deprecated /* aws.elasticloadbalancingv2.getLoadBalancer has been deprecated in favor of aws.lb.getLoadBalancer */
    public static CompletableFuture<GetLoadBalancerResult> getLoadBalancer() {
        return getLoadBalancer(GetLoadBalancerArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLoadBalancerResult> getLoadBalancer(GetLoadBalancerArgs args) {
        return getLoadBalancer(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetLoadBalancerResult> getLoadBalancer(GetLoadBalancerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticloadbalancingv2/getLoadBalancer:getLoadBalancer", TypeShape.of(GetLoadBalancerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * > **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
     * 
     * Provides information about a Load Balancer Target Group.
     * 
     * This data source can prove useful when a module accepts an LB Target Group as an
     * input variable and needs to know its attributes. It can also be used to get the ARN of
     * an LB Target Group for use in other resources, given LB Target Group name.
     * 
     * ## Example Usage
     * 
     * @Deprecated
     * aws.elasticloadbalancingv2.getTargetGroup has been deprecated in favor of aws.lb.getTargetGroup
     * 
     */
    @Deprecated /* aws.elasticloadbalancingv2.getTargetGroup has been deprecated in favor of aws.lb.getTargetGroup */
    public static CompletableFuture<GetTargetGroupResult> getTargetGroup() {
        return getTargetGroup(GetTargetGroupArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTargetGroupResult> getTargetGroup(GetTargetGroupArgs args) {
        return getTargetGroup(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetTargetGroupResult> getTargetGroup(GetTargetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:elasticloadbalancingv2/getTargetGroup:getTargetGroup", TypeShape.of(GetTargetGroupResult.class), args, Utilities.withVersion(options));
    }
}
