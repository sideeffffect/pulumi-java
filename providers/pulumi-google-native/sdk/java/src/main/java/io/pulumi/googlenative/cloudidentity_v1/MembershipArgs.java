// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudidentity_v1.inputs.EntityKeyArgs;
import io.pulumi.googlenative.cloudidentity_v1.inputs.MembershipRoleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final MembershipArgs Empty = new MembershipArgs();

    @InputImport(name="groupId", required=true)
      private final Input<String> groupId;

    public Input<String> getGroupId() {
        return this.groupId;
    }

    /**
     * Immutable. The `EntityKey` of the member.
     * 
     */
    @InputImport(name="preferredMemberKey", required=true)
      private final Input<EntityKeyArgs> preferredMemberKey;

    public Input<EntityKeyArgs> getPreferredMemberKey() {
        return this.preferredMemberKey;
    }

    /**
     * The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with the same `name`.
     * 
     */
    @InputImport(name="roles")
      private final @Nullable Input<List<MembershipRoleArgs>> roles;

    public Input<List<MembershipRoleArgs>> getRoles() {
        return this.roles == null ? Input.empty() : this.roles;
    }

    public MembershipArgs(
        Input<String> groupId,
        Input<EntityKeyArgs> preferredMemberKey,
        @Nullable Input<List<MembershipRoleArgs>> roles) {
        this.groupId = Objects.requireNonNull(groupId, "expected parameter 'groupId' to be non-null");
        this.preferredMemberKey = Objects.requireNonNull(preferredMemberKey, "expected parameter 'preferredMemberKey' to be non-null");
        this.roles = roles;
    }

    private MembershipArgs() {
        this.groupId = Input.empty();
        this.preferredMemberKey = Input.empty();
        this.roles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> groupId;
        private Input<EntityKeyArgs> preferredMemberKey;
        private @Nullable Input<List<MembershipRoleArgs>> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(MembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.preferredMemberKey = defaults.preferredMemberKey;
    	      this.roles = defaults.roles;
        }

        public Builder groupId(Input<String> groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }

        public Builder groupId(String groupId) {
            this.groupId = Input.of(Objects.requireNonNull(groupId));
            return this;
        }

        public Builder preferredMemberKey(Input<EntityKeyArgs> preferredMemberKey) {
            this.preferredMemberKey = Objects.requireNonNull(preferredMemberKey);
            return this;
        }

        public Builder preferredMemberKey(EntityKeyArgs preferredMemberKey) {
            this.preferredMemberKey = Input.of(Objects.requireNonNull(preferredMemberKey));
            return this;
        }

        public Builder roles(@Nullable Input<List<MembershipRoleArgs>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder roles(@Nullable List<MembershipRoleArgs> roles) {
            this.roles = Input.ofNullable(roles);
            return this;
        }
        public MembershipArgs build() {
            return new MembershipArgs(groupId, preferredMemberKey, roles);
        }
    }
}
