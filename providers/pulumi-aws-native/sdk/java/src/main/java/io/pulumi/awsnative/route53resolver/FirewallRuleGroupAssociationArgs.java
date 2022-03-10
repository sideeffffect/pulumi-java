// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.route53resolver.enums.FirewallRuleGroupAssociationMutationProtection;
import io.pulumi.awsnative.route53resolver.inputs.FirewallRuleGroupAssociationTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallRuleGroupAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallRuleGroupAssociationArgs Empty = new FirewallRuleGroupAssociationArgs();

    /**
     * FirewallRuleGroupId
     * 
     */
    @InputImport(name="firewallRuleGroupId", required=true)
      private final Input<String> firewallRuleGroupId;

    public Input<String> getFirewallRuleGroupId() {
        return this.firewallRuleGroupId;
    }

    /**
     * MutationProtectionStatus
     * 
     */
    @InputImport(name="mutationProtection")
      private final @Nullable Input<FirewallRuleGroupAssociationMutationProtection> mutationProtection;

    public Input<FirewallRuleGroupAssociationMutationProtection> getMutationProtection() {
        return this.mutationProtection == null ? Input.empty() : this.mutationProtection;
    }

    /**
     * FirewallRuleGroupAssociationName
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Priority
     * 
     */
    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * Tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<FirewallRuleGroupAssociationTagArgs>> tags;

    public Input<List<FirewallRuleGroupAssociationTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * VpcId
     * 
     */
    @InputImport(name="vpcId", required=true)
      private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public FirewallRuleGroupAssociationArgs(
        Input<String> firewallRuleGroupId,
        @Nullable Input<FirewallRuleGroupAssociationMutationProtection> mutationProtection,
        @Nullable Input<String> name,
        Input<Integer> priority,
        @Nullable Input<List<FirewallRuleGroupAssociationTagArgs>> tags,
        Input<String> vpcId) {
        this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId, "expected parameter 'firewallRuleGroupId' to be non-null");
        this.mutationProtection = mutationProtection;
        this.name = name;
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private FirewallRuleGroupAssociationArgs() {
        this.firewallRuleGroupId = Input.empty();
        this.mutationProtection = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleGroupAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> firewallRuleGroupId;
        private @Nullable Input<FirewallRuleGroupAssociationMutationProtection> mutationProtection;
        private @Nullable Input<String> name;
        private Input<Integer> priority;
        private @Nullable Input<List<FirewallRuleGroupAssociationTagArgs>> tags;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleGroupAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallRuleGroupId = defaults.firewallRuleGroupId;
    	      this.mutationProtection = defaults.mutationProtection;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder firewallRuleGroupId(Input<String> firewallRuleGroupId) {
            this.firewallRuleGroupId = Objects.requireNonNull(firewallRuleGroupId);
            return this;
        }

        public Builder firewallRuleGroupId(String firewallRuleGroupId) {
            this.firewallRuleGroupId = Input.of(Objects.requireNonNull(firewallRuleGroupId));
            return this;
        }

        public Builder mutationProtection(@Nullable Input<FirewallRuleGroupAssociationMutationProtection> mutationProtection) {
            this.mutationProtection = mutationProtection;
            return this;
        }

        public Builder mutationProtection(@Nullable FirewallRuleGroupAssociationMutationProtection mutationProtection) {
            this.mutationProtection = Input.ofNullable(mutationProtection);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder priority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder priority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder tags(@Nullable Input<List<FirewallRuleGroupAssociationTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<FirewallRuleGroupAssociationTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder vpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }
        public FirewallRuleGroupAssociationArgs build() {
            return new FirewallRuleGroupAssociationArgs(firewallRuleGroupId, mutationProtection, name, priority, tags, vpcId);
        }
    }
}
