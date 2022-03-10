// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.FirewallPolicyFilterRuleCollectionArgs;
import io.pulumi.azurenative.network.inputs.FirewallPolicyNatRuleCollectionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleCollectionGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleCollectionGroupArgs Empty = new FirewallPolicyRuleCollectionGroupArgs();

    /**
     * The name of the Firewall Policy.
     * 
     */
    @InputImport(name="firewallPolicyName", required=true)
      private final Input<String> firewallPolicyName;

    public Input<String> getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Priority of the Firewall Policy Rule Collection Group resource.
     * 
     */
    @InputImport(name="priority")
      private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the FirewallPolicyRuleCollectionGroup.
     * 
     */
    @InputImport(name="ruleCollectionGroupName")
      private final @Nullable Input<String> ruleCollectionGroupName;

    public Input<String> getRuleCollectionGroupName() {
        return this.ruleCollectionGroupName == null ? Input.empty() : this.ruleCollectionGroupName;
    }

    /**
     * Group of Firewall Policy rule collections.
     * 
     */
    @InputImport(name="ruleCollections")
      private final @Nullable Input<List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>>> ruleCollections;

    public Input<List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>>> getRuleCollections() {
        return this.ruleCollections == null ? Input.empty() : this.ruleCollections;
    }

    public FirewallPolicyRuleCollectionGroupArgs(
        Input<String> firewallPolicyName,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        Input<String> resourceGroupName,
        @Nullable Input<String> ruleCollectionGroupName,
        @Nullable Input<List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>>> ruleCollections) {
        this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName, "expected parameter 'firewallPolicyName' to be non-null");
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleCollectionGroupName = ruleCollectionGroupName;
        this.ruleCollections = ruleCollections;
    }

    private FirewallPolicyRuleCollectionGroupArgs() {
        this.firewallPolicyName = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.resourceGroupName = Input.empty();
        this.ruleCollectionGroupName = Input.empty();
        this.ruleCollections = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleCollectionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> firewallPolicyName;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> ruleCollectionGroupName;
        private @Nullable Input<List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>>> ruleCollections;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleCollectionGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.firewallPolicyName = defaults.firewallPolicyName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleCollectionGroupName = defaults.ruleCollectionGroupName;
    	      this.ruleCollections = defaults.ruleCollections;
        }

        public Builder firewallPolicyName(Input<String> firewallPolicyName) {
            this.firewallPolicyName = Objects.requireNonNull(firewallPolicyName);
            return this;
        }

        public Builder firewallPolicyName(String firewallPolicyName) {
            this.firewallPolicyName = Input.of(Objects.requireNonNull(firewallPolicyName));
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
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

        public Builder priority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder priority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder ruleCollectionGroupName(@Nullable Input<String> ruleCollectionGroupName) {
            this.ruleCollectionGroupName = ruleCollectionGroupName;
            return this;
        }

        public Builder ruleCollectionGroupName(@Nullable String ruleCollectionGroupName) {
            this.ruleCollectionGroupName = Input.ofNullable(ruleCollectionGroupName);
            return this;
        }

        public Builder ruleCollections(@Nullable Input<List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>>> ruleCollections) {
            this.ruleCollections = ruleCollections;
            return this;
        }

        public Builder ruleCollections(@Nullable List<Either<FirewallPolicyFilterRuleCollectionArgs,FirewallPolicyNatRuleCollectionArgs>> ruleCollections) {
            this.ruleCollections = Input.ofNullable(ruleCollections);
            return this;
        }
        public FirewallPolicyRuleCollectionGroupArgs build() {
            return new FirewallPolicyRuleCollectionGroupArgs(firewallPolicyName, id, name, priority, resourceGroupName, ruleCollectionGroupName, ruleCollections);
        }
    }
}
