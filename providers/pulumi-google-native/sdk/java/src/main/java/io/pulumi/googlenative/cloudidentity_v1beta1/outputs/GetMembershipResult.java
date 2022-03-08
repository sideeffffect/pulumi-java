// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudidentity_v1beta1.outputs.EntityKeyResponse;
import io.pulumi.googlenative.cloudidentity_v1beta1.outputs.MembershipRoleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetMembershipResult {
    /**
     * The time when the `Membership` was created.
     * 
     */
    private final String createTime;
    /**
     * Immutable. The `EntityKey` of the member. Either `member_key` or `preferred_member_key` must be set when calling MembershipsService.CreateMembership but not both; both shall be set when returned.
     * 
     */
    private final EntityKeyResponse memberKey;
    /**
     * The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership`. Shall be of the form `groups/{group_id}/memberships/{membership_id}`.
     * 
     */
    private final String name;
    /**
     * Immutable. The `EntityKey` of the member. Either `member_key` or `preferred_member_key` must be set when calling MembershipsService.CreateMembership but not both; both shall be set when returned.
     * 
     */
    private final EntityKeyResponse preferredMemberKey;
    /**
     * The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with the same `name`.
     * 
     */
    private final List<MembershipRoleResponse> roles;
    /**
     * The type of the membership.
     * 
     */
    private final String type;
    /**
     * The time when the `Membership` was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"createTime","memberKey","name","preferredMemberKey","roles","type","updateTime"})
    private GetMembershipResult(
        String createTime,
        EntityKeyResponse memberKey,
        String name,
        EntityKeyResponse preferredMemberKey,
        List<MembershipRoleResponse> roles,
        String type,
        String updateTime) {
        this.createTime = createTime;
        this.memberKey = memberKey;
        this.name = name;
        this.preferredMemberKey = preferredMemberKey;
        this.roles = roles;
        this.type = type;
        this.updateTime = updateTime;
    }

    /**
     * The time when the `Membership` was created.
     * 
    */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Immutable. The `EntityKey` of the member. Either `member_key` or `preferred_member_key` must be set when calling MembershipsService.CreateMembership but not both; both shall be set when returned.
     * 
    */
    public EntityKeyResponse getMemberKey() {
        return this.memberKey;
    }
    /**
     * The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership`. Shall be of the form `groups/{group_id}/memberships/{membership_id}`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The `EntityKey` of the member. Either `member_key` or `preferred_member_key` must be set when calling MembershipsService.CreateMembership but not both; both shall be set when returned.
     * 
    */
    public EntityKeyResponse getPreferredMemberKey() {
        return this.preferredMemberKey;
    }
    /**
     * The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with the same `name`.
     * 
    */
    public List<MembershipRoleResponse> getRoles() {
        return this.roles;
    }
    /**
     * The type of the membership.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The time when the `Membership` was last updated.
     * 
    */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMembershipResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private EntityKeyResponse memberKey;
        private String name;
        private EntityKeyResponse preferredMemberKey;
        private List<MembershipRoleResponse> roles;
        private String type;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMembershipResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.memberKey = defaults.memberKey;
    	      this.name = defaults.name;
    	      this.preferredMemberKey = defaults.preferredMemberKey;
    	      this.roles = defaults.roles;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setMemberKey(EntityKeyResponse memberKey) {
            this.memberKey = Objects.requireNonNull(memberKey);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPreferredMemberKey(EntityKeyResponse preferredMemberKey) {
            this.preferredMemberKey = Objects.requireNonNull(preferredMemberKey);
            return this;
        }

        public Builder setRoles(List<MembershipRoleResponse> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetMembershipResult build() {
            return new GetMembershipResult(createTime, memberKey, name, preferredMemberKey, roles, type, updateTime);
        }
    }
}
