// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs;
import com.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs;
import com.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupMembershipArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMembershipArgs Empty = new GroupMembershipArgs();

    /**
     * The name of the Group to create this membership in.
     * 
     */
    @Import(name="group", required=true)
    private Output<String> group;

    public Output<String> group() {
        return this.group;
    }

    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @Import(name="memberKey")
    private @Nullable Output<GroupMembershipMemberKeyArgs> memberKey;

    public Optional<Output<GroupMembershipMemberKeyArgs>> memberKey() {
        return Optional.ofNullable(this.memberKey);
    }

    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @Import(name="preferredMemberKey")
    private @Nullable Output<GroupMembershipPreferredMemberKeyArgs> preferredMemberKey;

    public Optional<Output<GroupMembershipPreferredMemberKeyArgs>> preferredMemberKey() {
        return Optional.ofNullable(this.preferredMemberKey);
    }

    /**
     * The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    @Import(name="roles", required=true)
    private Output<List<GroupMembershipRoleArgs>> roles;

    public Output<List<GroupMembershipRoleArgs>> roles() {
        return this.roles;
    }

    private GroupMembershipArgs() {}

    private GroupMembershipArgs(GroupMembershipArgs $) {
        this.group = $.group;
        this.memberKey = $.memberKey;
        this.preferredMemberKey = $.preferredMemberKey;
        this.roles = $.roles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMembershipArgs $;

        public Builder() {
            $ = new GroupMembershipArgs();
        }

        public Builder(GroupMembershipArgs defaults) {
            $ = new GroupMembershipArgs(Objects.requireNonNull(defaults));
        }

        public Builder group(Output<String> group) {
            $.group = group;
            return this;
        }

        public Builder group(String group) {
            return group(Output.of(group));
        }

        public Builder memberKey(@Nullable Output<GroupMembershipMemberKeyArgs> memberKey) {
            $.memberKey = memberKey;
            return this;
        }

        public Builder memberKey(GroupMembershipMemberKeyArgs memberKey) {
            return memberKey(Output.of(memberKey));
        }

        public Builder preferredMemberKey(@Nullable Output<GroupMembershipPreferredMemberKeyArgs> preferredMemberKey) {
            $.preferredMemberKey = preferredMemberKey;
            return this;
        }

        public Builder preferredMemberKey(GroupMembershipPreferredMemberKeyArgs preferredMemberKey) {
            return preferredMemberKey(Output.of(preferredMemberKey));
        }

        public Builder roles(Output<List<GroupMembershipRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        public Builder roles(List<GroupMembershipRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        public Builder roles(GroupMembershipRoleArgs... roles) {
            return roles(List.of(roles));
        }

        public GroupMembershipArgs build() {
            $.group = Objects.requireNonNull($.group, "expected parameter 'group' to be non-null");
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            return $;
        }
    }

}
