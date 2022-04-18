// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.SecurityGroupEgressGetArgs;
import com.pulumi.aws.ec2.inputs.SecurityGroupIngressGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityGroupState extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupState Empty = new SecurityGroupState();

    /**
     * ARN of the security group.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Description of this egress rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Configuration block for egress rules. Can be specified multiple times for each egress rule. Each egress block supports fields documented below.
     * 
     */
    @Import(name="egress")
      private final @Nullable Output<List<SecurityGroupEgressGetArgs>> egress;

    public Output<List<SecurityGroupEgressGetArgs>> egress() {
        return this.egress == null ? Codegen.empty() : this.egress;
    }

    /**
     * Configuration block for egress rules. Can be specified multiple times for each ingress rule. Each ingress block supports fields documented below.
     * 
     */
    @Import(name="ingress")
      private final @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress;

    public Output<List<SecurityGroupIngressGetArgs>> ingress() {
        return this.ingress == null ? Codegen.empty() : this.ingress;
    }

    /**
     * Name of the security group. If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> namePrefix() {
        return this.namePrefix == null ? Codegen.empty() : this.namePrefix;
    }

    /**
     * Owner ID.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> ownerId() {
        return this.ownerId == null ? Codegen.empty() : this.ownerId;
    }

    /**
     * Instruct this provider to revoke all of the Security Groups attached ingress and egress rules before deleting the rule itself. This is normally not needed, however certain AWS services such as Elastic Map Reduce may automatically add required rules to security groups used with the service, and those rules may contain a cyclic dependency that prevent the security groups from being destroyed without removing the dependency first. Default `false`.
     * 
     */
    @Import(name="revokeRulesOnDelete")
      private final @Nullable Output<Boolean> revokeRulesOnDelete;

    public Output<Boolean> revokeRulesOnDelete() {
        return this.revokeRulesOnDelete == null ? Codegen.empty() : this.revokeRulesOnDelete;
    }

    /**
     * Map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * VPC ID.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public SecurityGroupState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<List<SecurityGroupEgressGetArgs>> egress,
        @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<String> ownerId,
        @Nullable Output<Boolean> revokeRulesOnDelete,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpcId) {
        this.arn = arn;
        this.description = description == null ? Codegen.ofNullable("Managed by Pulumi") : description;
        this.egress = egress;
        this.ingress = ingress;
        this.name = name;
        this.namePrefix = namePrefix;
        this.ownerId = ownerId;
        this.revokeRulesOnDelete = revokeRulesOnDelete;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcId = vpcId;
    }

    private SecurityGroupState() {
        this.arn = Codegen.empty();
        this.description = Codegen.empty();
        this.egress = Codegen.empty();
        this.ingress = Codegen.empty();
        this.name = Codegen.empty();
        this.namePrefix = Codegen.empty();
        this.ownerId = Codegen.empty();
        this.revokeRulesOnDelete = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<List<SecurityGroupEgressGetArgs>> egress;
        private @Nullable Output<List<SecurityGroupIngressGetArgs>> ingress;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<Boolean> revokeRulesOnDelete;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityGroupState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.egress = defaults.egress;
    	      this.ingress = defaults.ingress;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.ownerId = defaults.ownerId;
    	      this.revokeRulesOnDelete = defaults.revokeRulesOnDelete;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder egress(@Nullable Output<List<SecurityGroupEgressGetArgs>> egress) {
            this.egress = egress;
            return this;
        }
        public Builder egress(@Nullable List<SecurityGroupEgressGetArgs> egress) {
            this.egress = Codegen.ofNullable(egress);
            return this;
        }
        public Builder egress(SecurityGroupEgressGetArgs... egress) {
            return egress(List.of(egress));
        }
        public Builder ingress(@Nullable Output<List<SecurityGroupIngressGetArgs>> ingress) {
            this.ingress = ingress;
            return this;
        }
        public Builder ingress(@Nullable List<SecurityGroupIngressGetArgs> ingress) {
            this.ingress = Codegen.ofNullable(ingress);
            return this;
        }
        public Builder ingress(SecurityGroupIngressGetArgs... ingress) {
            return ingress(List.of(ingress));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Codegen.ofNullable(namePrefix);
            return this;
        }
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Codegen.ofNullable(ownerId);
            return this;
        }
        public Builder revokeRulesOnDelete(@Nullable Output<Boolean> revokeRulesOnDelete) {
            this.revokeRulesOnDelete = revokeRulesOnDelete;
            return this;
        }
        public Builder revokeRulesOnDelete(@Nullable Boolean revokeRulesOnDelete) {
            this.revokeRulesOnDelete = Codegen.ofNullable(revokeRulesOnDelete);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public SecurityGroupState build() {
            return new SecurityGroupState(arn, description, egress, ingress, name, namePrefix, ownerId, revokeRulesOnDelete, tags, tagsAll, vpcId);
        }
    }
}
