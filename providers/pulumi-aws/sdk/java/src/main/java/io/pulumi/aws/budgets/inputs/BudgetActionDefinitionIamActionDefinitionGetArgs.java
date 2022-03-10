// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.budgets.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BudgetActionDefinitionIamActionDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final BudgetActionDefinitionIamActionDefinitionGetArgs Empty = new BudgetActionDefinitionIamActionDefinitionGetArgs();

    /**
     * A list of groups to be attached. There must be at least one group.
     * 
     */
    @InputImport(name="groups")
      private final @Nullable Input<List<String>> groups;

    public Input<List<String>> getGroups() {
        return this.groups == null ? Input.empty() : this.groups;
    }

    /**
     * The Amazon Resource Name (ARN) of the policy to be attached.
     * 
     */
    @InputImport(name="policyArn", required=true)
      private final Input<String> policyArn;

    public Input<String> getPolicyArn() {
        return this.policyArn;
    }

    /**
     * A list of roles to be attached. There must be at least one role.
     * 
     */
    @InputImport(name="roles")
      private final @Nullable Input<List<String>> roles;

    public Input<List<String>> getRoles() {
        return this.roles == null ? Input.empty() : this.roles;
    }

    /**
     * A list of users to be attached. There must be at least one user.
     * 
     */
    @InputImport(name="users")
      private final @Nullable Input<List<String>> users;

    public Input<List<String>> getUsers() {
        return this.users == null ? Input.empty() : this.users;
    }

    public BudgetActionDefinitionIamActionDefinitionGetArgs(
        @Nullable Input<List<String>> groups,
        Input<String> policyArn,
        @Nullable Input<List<String>> roles,
        @Nullable Input<List<String>> users) {
        this.groups = groups;
        this.policyArn = Objects.requireNonNull(policyArn, "expected parameter 'policyArn' to be non-null");
        this.roles = roles;
        this.users = users;
    }

    private BudgetActionDefinitionIamActionDefinitionGetArgs() {
        this.groups = Input.empty();
        this.policyArn = Input.empty();
        this.roles = Input.empty();
        this.users = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetActionDefinitionIamActionDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> groups;
        private Input<String> policyArn;
        private @Nullable Input<List<String>> roles;
        private @Nullable Input<List<String>> users;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetActionDefinitionIamActionDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.policyArn = defaults.policyArn;
    	      this.roles = defaults.roles;
    	      this.users = defaults.users;
        }

        public Builder groups(@Nullable Input<List<String>> groups) {
            this.groups = groups;
            return this;
        }

        public Builder groups(@Nullable List<String> groups) {
            this.groups = Input.ofNullable(groups);
            return this;
        }

        public Builder policyArn(Input<String> policyArn) {
            this.policyArn = Objects.requireNonNull(policyArn);
            return this;
        }

        public Builder policyArn(String policyArn) {
            this.policyArn = Input.of(Objects.requireNonNull(policyArn));
            return this;
        }

        public Builder roles(@Nullable Input<List<String>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder roles(@Nullable List<String> roles) {
            this.roles = Input.ofNullable(roles);
            return this;
        }

        public Builder users(@Nullable Input<List<String>> users) {
            this.users = users;
            return this;
        }

        public Builder users(@Nullable List<String> users) {
            this.users = Input.ofNullable(users);
            return this;
        }
        public BudgetActionDefinitionIamActionDefinitionGetArgs build() {
            return new BudgetActionDefinitionIamActionDefinitionGetArgs(groups, policyArn, roles, users);
        }
    }
}
