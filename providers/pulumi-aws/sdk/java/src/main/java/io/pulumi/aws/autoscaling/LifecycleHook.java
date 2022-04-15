// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.autoscaling.LifecycleHookArgs;
import io.pulumi.aws.autoscaling.inputs.LifecycleHookState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AutoScaling Lifecycle Hook resource.
 * 
 * > **NOTE:** This provider has two types of ways you can add lifecycle hooks - via
 * the `initial_lifecycle_hook` attribute from the
 * `aws.autoscaling.Group`
 * resource, or via this one. Hooks added via this resource will not be added
 * until the autoscaling group has been created, and depending on your
 * `capacity`
 * settings, after the initial instances have been launched, creating unintended
 * behavior. If you need hooks to run on all instances, add them with
 * `initial_lifecycle_hook` in
 * `aws.autoscaling.Group`,
 * but take care to not duplicate those hooks with this resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * AutoScaling Lifecycle Hooks can be imported using the role autoscaling_group_name and name separated by `/`.
 * 
 * ```sh
 *  $ pulumi import aws:autoscaling/lifecycleHook:LifecycleHook test-lifecycle-hook asg-name/lifecycle-hook-name
 * ```
 * 
 */
@ResourceType(type="aws:autoscaling/lifecycleHook:LifecycleHook")
public class LifecycleHook extends io.pulumi.resources.CustomResource {
    /**
     * The name of the Auto Scaling group to which you want to assign the lifecycle hook
     * 
     */
    @Export(name="autoscalingGroupName", type=String.class, parameters={})
    private Output<String> autoscalingGroupName;

    /**
     * @return The name of the Auto Scaling group to which you want to assign the lifecycle hook
     * 
     */
    public Output<String> autoscalingGroupName() {
        return this.autoscalingGroupName;
    }
    /**
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
     * 
     */
    @Export(name="defaultResult", type=String.class, parameters={})
    private Output<String> defaultResult;

    /**
     * @return Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
     * 
     */
    public Output<String> defaultResult() {
        return this.defaultResult;
    }
    /**
     * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
     * 
     */
    @Export(name="heartbeatTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> heartbeatTimeout;

    /**
     * @return Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
     * 
     */
    public Output</* @Nullable */ Integer> heartbeatTimeout() {
        return this.heartbeatTimeout;
    }
    /**
     * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
     * 
     */
    @Export(name="lifecycleTransition", type=String.class, parameters={})
    private Output<String> lifecycleTransition;

    /**
     * @return The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
     * 
     */
    public Output<String> lifecycleTransition() {
        return this.lifecycleTransition;
    }
    /**
     * The name of the lifecycle hook.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the lifecycle hook.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
     * 
     */
    @Export(name="notificationMetadata", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationMetadata;

    /**
     * @return Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
     * 
     */
    public Output</* @Nullable */ String> notificationMetadata() {
        return this.notificationMetadata;
    }
    /**
     * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
     * 
     */
    @Export(name="notificationTargetArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> notificationTargetArn;

    /**
     * @return The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
     * 
     */
    public Output</* @Nullable */ String> notificationTargetArn() {
        return this.notificationTargetArn;
    }
    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * 
     */
    public Output</* @Nullable */ String> roleArn() {
        return this.roleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LifecycleHook(String name) {
        this(name, LifecycleHookArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LifecycleHook(String name, LifecycleHookArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LifecycleHook(String name, LifecycleHookArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/lifecycleHook:LifecycleHook", name, args == null ? LifecycleHookArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LifecycleHook(String name, Output<String> id, @Nullable LifecycleHookState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/lifecycleHook:LifecycleHook", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LifecycleHook get(String name, Output<String> id, @Nullable LifecycleHookState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new LifecycleHook(name, id, state, options);
    }
}
