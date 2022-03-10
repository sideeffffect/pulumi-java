// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMembershipArgs Empty = new GroupMembershipArgs();

    /**
     * The IAM Group name to attach the list of `users` to
     * 
     */
    @InputImport(name="group", required=true)
      private final Input<String> group;

    public Input<String> getGroup() {
        return this.group;
    }

    /**
     * The name to identify the Group Membership
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of IAM User names to associate with the Group
     * 
     */
    @InputImport(name="users", required=true)
      private final Input<List<String>> users;

    public Input<List<String>> getUsers() {
        return this.users;
    }

    public GroupMembershipArgs(
        Input<String> group,
        @Nullable Input<String> name,
        Input<List<String>> users) {
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.name = name;
        this.users = Objects.requireNonNull(users, "expected parameter 'users' to be non-null");
    }

    private GroupMembershipArgs() {
        this.group = Input.empty();
        this.name = Input.empty();
        this.users = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> group;
        private @Nullable Input<String> name;
        private Input<List<String>> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.users = defaults.users;
        }

        public Builder group(Input<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder group(String group) {
            this.group = Input.of(Objects.requireNonNull(group));
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

        public Builder users(Input<List<String>> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }

        public Builder users(List<String> users) {
            this.users = Input.of(Objects.requireNonNull(users));
            return this;
        }
        public GroupMembershipArgs build() {
            return new GroupMembershipArgs(group, name, users);
        }
    }
}
