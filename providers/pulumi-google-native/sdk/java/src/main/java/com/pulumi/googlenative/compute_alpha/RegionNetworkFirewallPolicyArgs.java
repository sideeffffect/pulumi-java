// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.RegionNetworkFirewallPolicyVpcNetworkScope;
import com.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyAssociationArgs;
import com.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionNetworkFirewallPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionNetworkFirewallPolicyArgs Empty = new RegionNetworkFirewallPolicyArgs();

    /**
     * A list of associations that belong to this firewall policy.
     * 
     */
    @Import(name="associations")
    private @Nullable Output<List<FirewallPolicyAssociationArgs>> associations;

    public Optional<Output<List<FirewallPolicyAssociationArgs>>> associations() {
        return Optional.ofNullable(this.associations);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * A list of rules that belong to this policy. There must always be a default rule (rule with priority 2147483647 and match &#34;*&#34;). If no rules are provided when creating a firewall policy, a default rule with action &#34;allow&#34; will be added.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<FirewallPolicyRuleArgs>> rules;

    public Optional<Output<List<FirewallPolicyRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * User-provided name of the Organization firewall plicy. The name should be unique in the organization in which the firewall policy is created. This name must be set on creation and cannot be changed. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="shortName")
    private @Nullable Output<String> shortName;

    public Optional<Output<String>> shortName() {
        return Optional.ofNullable(this.shortName);
    }

    /**
     * The scope of networks allowed to be associated with the firewall policy. This field can be either GLOBAL_VPC_NETWORK or REGIONAL_VPC_NETWORK. A firewall policy with the VPC scope set to GLOBAL_VPC_NETWORK is allowed to be attached only to global networks. When the VPC scope is set to REGIONAL_VPC_NETWORK the firewall policy is allowed to be attached only to regional networks in the same scope as the firewall policy. Note: if not specified then GLOBAL_VPC_NETWORK will be used.
     * 
     */
    @Import(name="vpcNetworkScope")
    private @Nullable Output<RegionNetworkFirewallPolicyVpcNetworkScope> vpcNetworkScope;

    public Optional<Output<RegionNetworkFirewallPolicyVpcNetworkScope>> vpcNetworkScope() {
        return Optional.ofNullable(this.vpcNetworkScope);
    }

    private RegionNetworkFirewallPolicyArgs() {}

    private RegionNetworkFirewallPolicyArgs(RegionNetworkFirewallPolicyArgs $) {
        this.associations = $.associations;
        this.description = $.description;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.rules = $.rules;
        this.shortName = $.shortName;
        this.vpcNetworkScope = $.vpcNetworkScope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionNetworkFirewallPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionNetworkFirewallPolicyArgs $;

        public Builder() {
            $ = new RegionNetworkFirewallPolicyArgs();
        }

        public Builder(RegionNetworkFirewallPolicyArgs defaults) {
            $ = new RegionNetworkFirewallPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder associations(@Nullable Output<List<FirewallPolicyAssociationArgs>> associations) {
            $.associations = associations;
            return this;
        }

        public Builder associations(List<FirewallPolicyAssociationArgs> associations) {
            return associations(Output.of(associations));
        }

        public Builder associations(FirewallPolicyAssociationArgs... associations) {
            return associations(List.of(associations));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder rules(@Nullable Output<List<FirewallPolicyRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<FirewallPolicyRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(FirewallPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public Builder shortName(@Nullable Output<String> shortName) {
            $.shortName = shortName;
            return this;
        }

        public Builder shortName(String shortName) {
            return shortName(Output.of(shortName));
        }

        public Builder vpcNetworkScope(@Nullable Output<RegionNetworkFirewallPolicyVpcNetworkScope> vpcNetworkScope) {
            $.vpcNetworkScope = vpcNetworkScope;
            return this;
        }

        public Builder vpcNetworkScope(RegionNetworkFirewallPolicyVpcNetworkScope vpcNetworkScope) {
            return vpcNetworkScope(Output.of(vpcNetworkScope));
        }

        public RegionNetworkFirewallPolicyArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
