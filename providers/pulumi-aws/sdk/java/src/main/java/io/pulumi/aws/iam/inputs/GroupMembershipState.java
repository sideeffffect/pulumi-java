// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipState extends io.pulumi.resources.ResourceArgs {

    public static final GroupMembershipState Empty = new GroupMembershipState();

    /**
     * The IAM Group name to attach the list of `users` to
     * 
     */
    @Import(name="group")
      private final @Nullable Output<String> group;

    public Output<String> group() {
        return this.group == null ? Codegen.empty() : this.group;
    }

    /**
     * The name to identify the Group Membership
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A list of IAM User names to associate with the Group
     * 
     */
    @Import(name="users")
      private final @Nullable Output<List<String>> users;

    public Output<List<String>> users() {
        return this.users == null ? Codegen.empty() : this.users;
    }

    public GroupMembershipState(
        @Nullable Output<String> group,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> users) {
        this.group = group;
        this.name = name;
        this.users = users;
    }

    private GroupMembershipState() {
        this.group = Codegen.empty();
        this.name = Codegen.empty();
        this.users = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> group;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.name = defaults.name;
    	      this.users = defaults.users;
        }

        public Builder group(@Nullable Output<String> group) {
            this.group = group;
            return this;
        }
        public Builder group(@Nullable String group) {
            this.group = Codegen.ofNullable(group);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder users(@Nullable Output<List<String>> users) {
            this.users = users;
            return this;
        }
        public Builder users(@Nullable List<String> users) {
            this.users = Codegen.ofNullable(users);
            return this;
        }
        public Builder users(String... users) {
            return users(List.of(users));
        }        public GroupMembershipState build() {
            return new GroupMembershipState(group, name, users);
        }
    }
}
