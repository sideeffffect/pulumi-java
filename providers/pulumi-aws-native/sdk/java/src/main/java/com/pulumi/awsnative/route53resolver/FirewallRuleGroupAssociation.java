// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.route53resolver.FirewallRuleGroupAssociationArgs;
import com.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupAssociationMutationProtection;
import com.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupAssociationStatus;
import com.pulumi.awsnative.route53resolver.outputs.FirewallRuleGroupAssociationTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Route53Resolver::FirewallRuleGroupAssociation.
 * 
 */
@ResourceType(type="aws-native:route53resolver:FirewallRuleGroupAssociation")
public class FirewallRuleGroupAssociation extends CustomResource {
    /**
     * Arn
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Arn
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Rfc3339TimeString
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return Rfc3339TimeString
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The id of the creator request.
     * 
     */
    @Export(name="creatorRequestId", type=String.class, parameters={})
    private Output<String> creatorRequestId;

    /**
     * @return The id of the creator request.
     * 
     */
    public Output<String> creatorRequestId() {
        return this.creatorRequestId;
    }
    /**
     * FirewallRuleGroupId
     * 
     */
    @Export(name="firewallRuleGroupId", type=String.class, parameters={})
    private Output<String> firewallRuleGroupId;

    /**
     * @return FirewallRuleGroupId
     * 
     */
    public Output<String> firewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }
    /**
     * ServicePrincipal
     * 
     */
    @Export(name="managedOwnerName", type=String.class, parameters={})
    private Output<String> managedOwnerName;

    /**
     * @return ServicePrincipal
     * 
     */
    public Output<String> managedOwnerName() {
        return this.managedOwnerName;
    }
    /**
     * Rfc3339TimeString
     * 
     */
    @Export(name="modificationTime", type=String.class, parameters={})
    private Output<String> modificationTime;

    /**
     * @return Rfc3339TimeString
     * 
     */
    public Output<String> modificationTime() {
        return this.modificationTime;
    }
    /**
     * MutationProtectionStatus
     * 
     */
    @Export(name="mutationProtection", type=FirewallRuleGroupAssociationMutationProtection.class, parameters={})
    private Output</* @Nullable */ FirewallRuleGroupAssociationMutationProtection> mutationProtection;

    /**
     * @return MutationProtectionStatus
     * 
     */
    public Output<Optional<FirewallRuleGroupAssociationMutationProtection>> mutationProtection() {
        return Codegen.optional(this.mutationProtection);
    }
    /**
     * FirewallRuleGroupAssociationName
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return FirewallRuleGroupAssociationName
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * Priority
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return Priority
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    @Export(name="status", type=FirewallRuleGroupAssociationStatus.class, parameters={})
    private Output<FirewallRuleGroupAssociationStatus> status;

    /**
     * @return ResolverFirewallRuleGroupAssociation, possible values are COMPLETE, DELETING, UPDATING, and INACTIVE_OWNER_ACCOUNT_CLOSED.
     * 
     */
    public Output<FirewallRuleGroupAssociationStatus> status() {
        return this.status;
    }
    /**
     * FirewallDomainListAssociationStatus
     * 
     */
    @Export(name="statusMessage", type=String.class, parameters={})
    private Output<String> statusMessage;

    /**
     * @return FirewallDomainListAssociationStatus
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }
    /**
     * Tags
     * 
     */
    @Export(name="tags", type=List.class, parameters={FirewallRuleGroupAssociationTag.class})
    private Output</* @Nullable */ List<FirewallRuleGroupAssociationTag>> tags;

    /**
     * @return Tags
     * 
     */
    public Output<Optional<List<FirewallRuleGroupAssociationTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * VpcId
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return VpcId
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallRuleGroupAssociation(String name) {
        this(name, FirewallRuleGroupAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallRuleGroupAssociation(String name, FirewallRuleGroupAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallRuleGroupAssociation(String name, FirewallRuleGroupAssociationArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:route53resolver:FirewallRuleGroupAssociation", name, args == null ? FirewallRuleGroupAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallRuleGroupAssociation(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:route53resolver:FirewallRuleGroupAssociation", name, null, makeResourceOptions(options, id));
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
    public static FirewallRuleGroupAssociation get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new FirewallRuleGroupAssociation(name, id, options);
    }
}
