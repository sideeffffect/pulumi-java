// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverFirewallRuleGroupAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final ResolverFirewallRuleGroupAssociationState Empty = new ResolverFirewallRuleGroupAssociationState();

    /**
     * The ARN (Amazon Resource Name) of the firewall rule group association.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The unique identifier of the firewall rule group.
     * 
     */
    @Import(name="firewallRuleGroupId")
    private @Nullable Output<String> firewallRuleGroupId;

    public Optional<Output<String>> firewallRuleGroupId() {
        return Optional.ofNullable(this.firewallRuleGroupId);
    }

    /**
     * If enabled, this setting disallows modification or removal of the association, to help prevent against accidentally altering DNS firewall protections. Valid values: `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="mutationProtection")
    private @Nullable Output<String> mutationProtection;

    public Optional<Output<String>> mutationProtection() {
        return Optional.ofNullable(this.mutationProtection);
    }

    /**
     * A name that lets you identify the rule group association, to manage and use it.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The setting that determines the processing order of the rule group among the rule groups that you associate with the specified VPC. DNS Firewall filters VPC traffic starting from the rule group with the lowest numeric priority setting.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The unique identifier of the VPC that you want to associate with the rule group.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private ResolverFirewallRuleGroupAssociationState() {}

    private ResolverFirewallRuleGroupAssociationState(ResolverFirewallRuleGroupAssociationState $) {
        this.arn = $.arn;
        this.firewallRuleGroupId = $.firewallRuleGroupId;
        this.mutationProtection = $.mutationProtection;
        this.name = $.name;
        this.priority = $.priority;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverFirewallRuleGroupAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverFirewallRuleGroupAssociationState $;

        public Builder() {
            $ = new ResolverFirewallRuleGroupAssociationState();
        }

        public Builder(ResolverFirewallRuleGroupAssociationState defaults) {
            $ = new ResolverFirewallRuleGroupAssociationState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder firewallRuleGroupId(@Nullable Output<String> firewallRuleGroupId) {
            $.firewallRuleGroupId = firewallRuleGroupId;
            return this;
        }

        public Builder firewallRuleGroupId(String firewallRuleGroupId) {
            return firewallRuleGroupId(Output.of(firewallRuleGroupId));
        }

        public Builder mutationProtection(@Nullable Output<String> mutationProtection) {
            $.mutationProtection = mutationProtection;
            return this;
        }

        public Builder mutationProtection(String mutationProtection) {
            return mutationProtection(Output.of(mutationProtection));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ResolverFirewallRuleGroupAssociationState build() {
            return $;
        }
    }

}
