// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.route53.ResolverFirewallRuleArgs;
import io.pulumi.aws.route53.inputs.ResolverFirewallRuleState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver DNS Firewall rule resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 *  Route 53 Resolver DNS Firewall rules can be imported using the Route 53 Resolver DNS Firewall rule group ID and domain list ID separated by ':', e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverFirewallRule:ResolverFirewallRule example rslvr-frg-0123456789abcdef:rslvr-fdl-0123456789abcdef
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverFirewallRule:ResolverFirewallRule")
public class ResolverFirewallRule extends io.pulumi.resources.CustomResource {
    /**
     * The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list. Valid values: `ALLOW`, `BLOCK`, `ALERT`.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The action that DNS Firewall should take on a DNS query when it matches one of the domains in the rule's domain list. Valid values: `ALLOW`, `BLOCK`, `ALERT`.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Value values: `CNAME`.
     * 
     */
    @Export(name="blockOverrideDnsType", type=String.class, parameters={})
    private Output</* @Nullable */ String> blockOverrideDnsType;

    /**
     * @return The DNS record's type. This determines the format of the record value that you provided in BlockOverrideDomain. Value values: `CNAME`.
     * 
     */
    public Output</* @Nullable */ String> blockOverrideDnsType() {
        return this.blockOverrideDnsType;
    }
    /**
     * The custom DNS record to send back in response to the query.
     * 
     */
    @Export(name="blockOverrideDomain", type=String.class, parameters={})
    private Output</* @Nullable */ String> blockOverrideDomain;

    /**
     * @return The custom DNS record to send back in response to the query.
     * 
     */
    public Output</* @Nullable */ String> blockOverrideDomain() {
        return this.blockOverrideDomain;
    }
    /**
     * The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Minimum value of 0. Maximum value of 604800.
     * 
     */
    @Export(name="blockOverrideTtl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> blockOverrideTtl;

    /**
     * @return The recommended amount of time, in seconds, for the DNS resolver or web browser to cache the provided override record. Minimum value of 0. Maximum value of 604800.
     * 
     */
    public Output</* @Nullable */ Integer> blockOverrideTtl() {
        return this.blockOverrideTtl;
    }
    /**
     * The way that you want DNS Firewall to block the request. Valid values: `NODATA`, `NXDOMAIN`, `OVERRIDE`.
     * 
     */
    @Export(name="blockResponse", type=String.class, parameters={})
    private Output</* @Nullable */ String> blockResponse;

    /**
     * @return The way that you want DNS Firewall to block the request. Valid values: `NODATA`, `NXDOMAIN`, `OVERRIDE`.
     * 
     */
    public Output</* @Nullable */ String> blockResponse() {
        return this.blockResponse;
    }
    /**
     * The ID of the domain list that you want to use in the rule.
     * 
     */
    @Export(name="firewallDomainListId", type=String.class, parameters={})
    private Output<String> firewallDomainListId;

    /**
     * @return The ID of the domain list that you want to use in the rule.
     * 
     */
    public Output<String> firewallDomainListId() {
        return this.firewallDomainListId;
    }
    /**
     * The unique identifier of the firewall rule group where you want to create the rule.
     * 
     */
    @Export(name="firewallRuleGroupId", type=String.class, parameters={})
    private Output<String> firewallRuleGroupId;

    /**
     * @return The unique identifier of the firewall rule group where you want to create the rule.
     * 
     */
    public Output<String> firewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }
    /**
     * A name that lets you identify the rule, to manage and use it.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name that lets you identify the rule, to manage and use it.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The setting that determines the processing order of the rule in the rule group. DNS Firewall processes the rules in a rule group by order of priority, starting from the lowest setting.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverFirewallRule(String name) {
        this(name, ResolverFirewallRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverFirewallRule(String name, ResolverFirewallRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverFirewallRule(String name, ResolverFirewallRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallRule:ResolverFirewallRule", name, args == null ? ResolverFirewallRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverFirewallRule(String name, Output<String> id, @Nullable ResolverFirewallRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverFirewallRule:ResolverFirewallRule", name, state, makeResourceOptions(options, id));
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
    public static ResolverFirewallRule get(String name, Output<String> id, @Nullable ResolverFirewallRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new ResolverFirewallRule(name, id, state, options);
    }
}
