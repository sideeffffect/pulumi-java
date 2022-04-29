// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.route53resolver.ResolverRuleArgs;
import com.pulumi.awsnative.route53resolver.enums.ResolverRuleRuleType;
import com.pulumi.awsnative.route53resolver.outputs.ResolverRuleTag;
import com.pulumi.awsnative.route53resolver.outputs.ResolverRuleTargetAddress;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::Route53Resolver::ResolverRule
 * 
 */
@ResourceType(type="aws-native:route53resolver:ResolverRule")
public class ResolverRule extends CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the resolver rule.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the resolver rule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The name for the Resolver rule
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name for the Resolver rule
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    @Export(name="resolverEndpointId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resolverEndpointId;

    /**
     * @return The ID of the endpoint that the rule is associated with.
     * 
     */
    public Output<Optional<String>> resolverEndpointId() {
        return Codegen.optional(this.resolverEndpointId);
    }
    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    @Export(name="resolverRuleId", type=String.class, parameters={})
    private Output<String> resolverRuleId;

    /**
     * @return The ID of the endpoint that the rule is associated with.
     * 
     */
    public Output<String> resolverRuleId() {
        return this.resolverRuleId;
    }
    /**
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify FORWARD. When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to process queries for a subdomain of that domain, specify SYSTEM.
     * 
     */
    @Export(name="ruleType", type=ResolverRuleRuleType.class, parameters={})
    private Output<ResolverRuleRuleType> ruleType;

    /**
     * @return When you want to forward DNS queries for specified domain name to resolvers on your network, specify FORWARD. When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to process queries for a subdomain of that domain, specify SYSTEM.
     * 
     */
    public Output<ResolverRuleRuleType> ruleType() {
        return this.ruleType;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ResolverRuleTag.class})
    private Output</* @Nullable */ List<ResolverRuleTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<ResolverRuleTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * 
     */
    @Export(name="targetIps", type=List.class, parameters={ResolverRuleTargetAddress.class})
    private Output</* @Nullable */ List<ResolverRuleTargetAddress>> targetIps;

    /**
     * @return An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * 
     */
    public Output<Optional<List<ResolverRuleTargetAddress>>> targetIps() {
        return Codegen.optional(this.targetIps);
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
    public ResolverRule(String name, ResolverRuleArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverRule", name, args == null ? ResolverRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverRule(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:route53resolver:ResolverRule", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ResolverRule get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ResolverRule(name, id, options);
    }
}
