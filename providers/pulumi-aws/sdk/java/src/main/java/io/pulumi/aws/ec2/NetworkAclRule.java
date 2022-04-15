// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.ec2.NetworkAclRuleArgs;
import io.pulumi.aws.ec2.inputs.NetworkAclRuleState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an entry (a rule) in a network ACL with the specified rule number.
 * 
 * > **NOTE on Network ACLs and Network ACL Rules:** This provider currently
 * provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
 * defined in-line. At this time you cannot use a Network ACL with in-line rules
 * in conjunction with any Network ACL Rule resources. Doing so will cause
 * a conflict of rule settings and will overwrite rules.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Individual rules can be imported using `NETWORK_ACL_ID:RULE_NUMBER:PROTOCOL:EGRESS`, where `PROTOCOL` can be a decimal (e.g. 6) or string (e.g. tcp) value. If importing a rule previously provisioned by the provider, the `PROTOCOL` must be the input value used at creation time. For more information on protocol numbers and keywords, see herehttps://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml For example, import a network ACL Rule with an argument like thisconsole
 * 
 * ```sh
 *  $ pulumi import aws:ec2/networkAclRule:NetworkAclRule my_rule acl-7aaabd18:100:tcp:false
 * ```
 * 
 *  Or by the procotol's decimal valueconsole
 * 
 * ```sh
 *  $ pulumi import aws:ec2/networkAclRule:NetworkAclRule my_rule acl-7aaabd18:100:6:false
 * ```
 * 
 */
@ResourceType(type="aws:ec2/networkAclRule:NetworkAclRule")
public class NetworkAclRule extends io.pulumi.resources.CustomResource {
    /**
     * The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
     * 
     */
    @Export(name="cidrBlock", type=String.class, parameters={})
    private Output</* @Nullable */ String> cidrBlock;

    /**
     * @return The network range to allow or deny, in CIDR notation (for example 172.16.0.0/24 ).
     * 
     */
    public Output</* @Nullable */ String> cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
     * 
     */
    @Export(name="egress", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> egress;

    /**
     * @return Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet). Default `false`.
     * 
     */
    public Output</* @Nullable */ Boolean> egress() {
        return this.egress;
    }
    /**
     * The from port to match.
     * 
     */
    @Export(name="fromPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> fromPort;

    /**
     * @return The from port to match.
     * 
     */
    public Output</* @Nullable */ Integer> fromPort() {
        return this.fromPort;
    }
    /**
     * ICMP protocol: The ICMP code. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    @Export(name="icmpCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> icmpCode;

    /**
     * @return ICMP protocol: The ICMP code. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    public Output</* @Nullable */ String> icmpCode() {
        return this.icmpCode;
    }
    /**
     * ICMP protocol: The ICMP type. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    @Export(name="icmpType", type=String.class, parameters={})
    private Output</* @Nullable */ String> icmpType;

    /**
     * @return ICMP protocol: The ICMP type. Required if specifying ICMP for the protocolE.g., -1
     * 
     */
    public Output</* @Nullable */ String> icmpType() {
        return this.icmpType;
    }
    /**
     * The IPv6 CIDR block to allow or deny.
     * 
     */
    @Export(name="ipv6CidrBlock", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv6CidrBlock;

    /**
     * @return The IPv6 CIDR block to allow or deny.
     * 
     */
    public Output</* @Nullable */ String> ipv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * The ID of the network ACL.
     * 
     */
    @Export(name="networkAclId", type=String.class, parameters={})
    private Output<String> networkAclId;

    /**
     * @return The ID of the network ACL.
     * 
     */
    public Output<String> networkAclId() {
        return this.networkAclId;
    }
    /**
     * The protocol. A value of -1 means all protocols.
     * 
     */
    @Export(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol. A value of -1 means all protocols.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
     * 
     */
    @Export(name="ruleAction", type=String.class, parameters={})
    private Output<String> ruleAction;

    /**
     * @return Indicates whether to allow or deny the traffic that matches the rule. Accepted values: `allow` | `deny`
     * 
     */
    public Output<String> ruleAction() {
        return this.ruleAction;
    }
    /**
     * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
     * 
     */
    @Export(name="ruleNumber", type=Integer.class, parameters={})
    private Output<Integer> ruleNumber;

    /**
     * @return The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
     * 
     */
    public Output<Integer> ruleNumber() {
        return this.ruleNumber;
    }
    /**
     * The to port to match.
     * 
     */
    @Export(name="toPort", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> toPort;

    /**
     * @return The to port to match.
     * 
     */
    public Output</* @Nullable */ Integer> toPort() {
        return this.toPort;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkAclRule(String name) {
        this(name, NetworkAclRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkAclRule(String name, NetworkAclRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkAclRule(String name, NetworkAclRuleArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkAclRule:NetworkAclRule", name, args == null ? NetworkAclRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkAclRule(String name, Output<String> id, @Nullable NetworkAclRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkAclRule:NetworkAclRule", name, state, makeResourceOptions(options, id));
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
    public static NetworkAclRule get(String name, Output<String> id, @Nullable NetworkAclRuleState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new NetworkAclRule(name, id, state, options);
    }
}
