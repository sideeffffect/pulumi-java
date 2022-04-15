// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsMembershipMemberKey;
import io.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsMembershipPreferredMemberKey;
import io.pulumi.gcp.cloudidentity.inputs.GetGroupMembershipsMembershipRole;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetGroupMembershipsMembership extends io.pulumi.resources.InvokeArgs {

    public static final GetGroupMembershipsMembership Empty = new GetGroupMembershipsMembership();

    @Import(name="createTime", required=true)
      private final String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * The parent Group resource under which to lookup the Membership names. Must be of the form groups/{group_id}.
     * 
     */
    @Import(name="group", required=true)
      private final String group;

    public String group() {
        return this.group;
    }

    @Import(name="memberKeys", required=true)
      private final List<GetGroupMembershipsMembershipMemberKey> memberKeys;

    public List<GetGroupMembershipsMembershipMemberKey> memberKeys() {
        return this.memberKeys;
    }

    /**
     * The name of the MembershipRole. One of OWNER, MANAGER, MEMBER.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="preferredMemberKeys", required=true)
      private final List<GetGroupMembershipsMembershipPreferredMemberKey> preferredMemberKeys;

    public List<GetGroupMembershipsMembershipPreferredMemberKey> preferredMemberKeys() {
        return this.preferredMemberKeys;
    }

    /**
     * The MembershipRoles that apply to the Membership. Structure is documented below.
     * 
     */
    @Import(name="roles", required=true)
      private final List<GetGroupMembershipsMembershipRole> roles;

    public List<GetGroupMembershipsMembershipRole> roles() {
        return this.roles;
    }

    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    @Import(name="updateTime", required=true)
      private final String updateTime;

    public String updateTime() {
        return this.updateTime;
    }

    public GetGroupMembershipsMembership(
        String createTime,
        String group,
        List<GetGroupMembershipsMembershipMemberKey> memberKeys,
        String name,
        List<GetGroupMembershipsMembershipPreferredMemberKey> preferredMemberKeys,
        List<GetGroupMembershipsMembershipRole> roles,
        String type,
        String updateTime) {
        this.createTime = Objects.requireNonNull(createTime, "expected parameter 'createTime' to be non-null");
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.memberKeys = Objects.requireNonNull(memberKeys, "expected parameter 'memberKeys' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.preferredMemberKeys = Objects.requireNonNull(preferredMemberKeys, "expected parameter 'preferredMemberKeys' to be non-null");
        this.roles = Objects.requireNonNull(roles, "expected parameter 'roles' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.updateTime = Objects.requireNonNull(updateTime, "expected parameter 'updateTime' to be non-null");
    }

    private GetGroupMembershipsMembership() {
        this.createTime = null;
        this.group = null;
        this.memberKeys = List.of();
        this.name = null;
        this.preferredMemberKeys = List.of();
        this.roles = List.of();
        this.type = null;
        this.updateTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupMembershipsMembership defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String group;
        private List<GetGroupMembershipsMembershipMemberKey> memberKeys;
        private String name;
        private List<GetGroupMembershipsMembershipPreferredMemberKey> preferredMemberKeys;
        private List<GetGroupMembershipsMembershipRole> roles;
        private String type;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupMembershipsMembership defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.group = defaults.group;
    	      this.memberKeys = defaults.memberKeys;
    	      this.name = defaults.name;
    	      this.preferredMemberKeys = defaults.preferredMemberKeys;
    	      this.roles = defaults.roles;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder group(String group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder memberKeys(List<GetGroupMembershipsMembershipMemberKey> memberKeys) {
            this.memberKeys = Objects.requireNonNull(memberKeys);
            return this;
        }
        public Builder memberKeys(GetGroupMembershipsMembershipMemberKey... memberKeys) {
            return memberKeys(List.of(memberKeys));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder preferredMemberKeys(List<GetGroupMembershipsMembershipPreferredMemberKey> preferredMemberKeys) {
            this.preferredMemberKeys = Objects.requireNonNull(preferredMemberKeys);
            return this;
        }
        public Builder preferredMemberKeys(GetGroupMembershipsMembershipPreferredMemberKey... preferredMemberKeys) {
            return preferredMemberKeys(List.of(preferredMemberKeys));
        }
        public Builder roles(List<GetGroupMembershipsMembershipRole> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }
        public Builder roles(GetGroupMembershipsMembershipRole... roles) {
            return roles(List.of(roles));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetGroupMembershipsMembership build() {
            return new GetGroupMembershipsMembership(createTime, group, memberKeys, name, preferredMemberKeys, roles, type, updateTime);
        }
    }
}
