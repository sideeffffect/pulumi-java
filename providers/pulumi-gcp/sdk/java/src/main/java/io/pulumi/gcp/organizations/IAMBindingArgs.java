// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.organizations.inputs.IAMBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMBindingArgs Empty = new IAMBindingArgs();

    @Import(name="condition")
      private final @Nullable Output<IAMBindingConditionArgs> condition;

    public Output<IAMBindingConditionArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * A list of users that the role should apply to. For more details on format and restrictions see https://cloud.google.com/billing/reference/rest/v1/Policy#Binding
     * 
     */
    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The numeric ID of the organization in which you want to create a custom role.
     * 
     */
    @Import(name="orgId", required=true)
      private final Output<String> orgId;

    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.organizations.IAMBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    public IAMBindingArgs(
        @Nullable Output<IAMBindingConditionArgs> condition,
        Output<List<String>> members,
        Output<String> orgId,
        Output<String> role) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.orgId = Objects.requireNonNull(orgId, "expected parameter 'orgId' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private IAMBindingArgs() {
        this.condition = Codegen.empty();
        this.members = Codegen.empty();
        this.orgId = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<IAMBindingConditionArgs> condition;
        private Output<List<String>> members;
        private Output<String> orgId;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.orgId = defaults.orgId;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<IAMBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable IAMBindingConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder orgId(Output<String> orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        public Builder orgId(String orgId) {
            this.orgId = Output.of(Objects.requireNonNull(orgId));
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public IAMBindingArgs build() {
            return new IAMBindingArgs(condition, members, orgId, role);
        }
    }
}
