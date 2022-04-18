// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ResolverRuleArgs;
import com.pulumi.aws.route53.inputs.ResolverRuleState;
import com.pulumi.aws.route53.outputs.ResolverRuleTargetIp;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Route53 Resolver rule.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Route53 Resolver rules can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverRule:ResolverRule sys rslvr-rr-0123456789abcdef0
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverRule:ResolverRule")
public class ResolverRule extends com.pulumi.resources.CustomResource {
    /**
     * The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN (Amazon Resource Name) for the resolver rule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Export(name="resolverEndpointId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resolverEndpointId;

    /**
     * @return The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    public Output</* @Nullable */ String> resolverEndpointId() {
        return this.resolverEndpointId;
    }
    /**
     * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    @Export(name="ruleType", type=String.class, parameters={})
    private Output<String> ruleType;

    /**
     * @return The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    public Output<String> ruleType() {
        return this.ruleType;
    }
    /**
     * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    @Export(name="shareStatus", type=String.class, parameters={})
    private Output<String> shareStatus;

    /**
     * @return Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
     * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
     * 
     */
    public Output<String> shareStatus() {
        return this.shareStatus;
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
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @Export(name="targetIps", type=List.class, parameters={ResolverRuleTargetIp.class})
    private Output</* @Nullable */ List<ResolverRuleTargetIp>> targetIps;

    /**
     * @return Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    public Output</* @Nullable */ List<ResolverRuleTargetIp>> targetIps() {
        return this.targetIps;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverRule(String name) {
        this(name, ResolverRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverRule(String name, ResolverRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverRule(String name, ResolverRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverRule:ResolverRule", name, args == null ? ResolverRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverRule(String name, Output<String> id, @Nullable ResolverRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverRule:ResolverRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static ResolverRule get(String name, Output<String> id, @Nullable ResolverRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverRule(name, id, state, options);
    }
}
