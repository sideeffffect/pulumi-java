// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class BudgetsActionIamActionDefinition {
    private final @Nullable List<String> groups;
    private final String policyArn;
    private final @Nullable List<String> roles;
    private final @Nullable List<String> users;

    @OutputCustomType.Constructor
    private BudgetsActionIamActionDefinition(
        @OutputCustomType.Parameter("groups") @Nullable List<String> groups,
        @OutputCustomType.Parameter("policyArn") String policyArn,
        @OutputCustomType.Parameter("roles") @Nullable List<String> roles,
        @OutputCustomType.Parameter("users") @Nullable List<String> users) {
        this.groups = groups;
        this.policyArn = policyArn;
        this.roles = roles;
        this.users = users;
    }

    public List<String> getGroups() {
        return this.groups == null ? List.of() : this.groups;
    }
    public String getPolicyArn() {
        return this.policyArn;
    }
    public List<String> getRoles() {
        return this.roles == null ? List.of() : this.roles;
    }
    public List<String> getUsers() {
        return this.users == null ? List.of() : this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetsActionIamActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groups;
        private String policyArn;
        private @Nullable List<String> roles;
        private @Nullable List<String> users;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetsActionIamActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groups = defaults.groups;
    	      this.policyArn = defaults.policyArn;
    	      this.roles = defaults.roles;
    	      this.users = defaults.users;
        }

        public Builder groups(@Nullable List<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder policyArn(String policyArn) {
            this.policyArn = Objects.requireNonNull(policyArn);
            return this;
        }

        public Builder roles(@Nullable List<String> roles) {
            this.roles = roles;
            return this;
        }

        public Builder users(@Nullable List<String> users) {
            this.users = users;
            return this;
        }
        public BudgetsActionIamActionDefinition build() {
            return new BudgetsActionIamActionDefinition(groups, policyArn, roles, users);
        }
    }
}
