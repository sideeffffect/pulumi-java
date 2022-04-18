// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.alb.ListenerRuleArgs;
import com.pulumi.aws.alb.inputs.ListenerRuleState;
import com.pulumi.aws.alb.outputs.ListenerRuleAction;
import com.pulumi.aws.alb.outputs.ListenerRuleCondition;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Load Balancer Listener Rule resource.
 * 
 * > **Note:** `aws.alb.ListenerRule` is known as `aws.lb.ListenerRule`. The functionality is identical.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Rules can be imported using their ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:alb/listenerRule:ListenerRule front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener-rule/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b
 * ```
 * 
 */
@ResourceType(type="aws:alb/listenerRule:ListenerRule")
public class ListenerRule extends com.pulumi.resources.CustomResource {
    /**
     * An Action block. Action blocks are documented below.
     * 
     */
    @Export(name="actions", type=List.class, parameters={ListenerRuleAction.class})
    private Output<List<ListenerRuleAction>> actions;

    /**
     * @return An Action block. Action blocks are documented below.
     * 
     */
    public Output<List<ListenerRuleAction>> actions() {
        return this.actions;
    }
    /**
     * The Amazon Resource Name (ARN) of the target group.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the target group.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * 
     */
    @Export(name="conditions", type=List.class, parameters={ListenerRuleCondition.class})
    private Output<List<ListenerRuleCondition>> conditions;

    /**
     * @return A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
     * 
     */
    public Output<List<ListenerRuleCondition>> conditions() {
        return this.conditions;
    }
    /**
     * The ARN of the listener to which to attach the rule.
     * 
     */
    @Export(name="listenerArn", type=String.class, parameters={})
    private Output<String> listenerArn;

    /**
     * @return The ARN of the listener to which to attach the rule.
     * 
     */
    public Output<String> listenerArn() {
        return this.listenerArn;
    }
    /**
     * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ListenerRule(String name) {
        this(name, ListenerRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ListenerRule(String name, ListenerRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ListenerRule(String name, ListenerRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listenerRule:ListenerRule", name, args == null ? ListenerRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ListenerRule(String name, Output<String> id, @Nullable ListenerRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:alb/listenerRule:ListenerRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("aws:applicationloadbalancing/listenerRule:ListenerRule").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static ListenerRule get(String name, Output<String> id, @Nullable ListenerRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ListenerRule(name, id, state, options);
    }
}
