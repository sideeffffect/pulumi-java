// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMCustomRoleState extends io.pulumi.resources.ResourceArgs {

    public static final IAMCustomRoleState Empty = new IAMCustomRoleState();

    /**
     * (Optional) The current deleted state of the role.
     * 
     */
    @InputImport(name="deleted")
      private final @Nullable Input<Boolean> deleted;

    public Input<Boolean> getDeleted() {
        return this.deleted == null ? Input.empty() : this.deleted;
    }

    /**
     * A human-readable description for the role.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The name of the role in the format `organizations/{{org_id}}/roles/{{role_id}}`. Like `id`, this field can be used as a reference in other resources such as IAM role bindings.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The numeric ID of the organization in which you want to create a custom role.
     * 
     */
    @InputImport(name="orgId")
      private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
    }

    /**
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    @InputImport(name="permissions")
      private final @Nullable Input<List<String>> permissions;

    public Input<List<String>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    /**
     * The role id to use for this role.
     * 
     */
    @InputImport(name="roleId")
      private final @Nullable Input<String> roleId;

    public Input<String> getRoleId() {
        return this.roleId == null ? Input.empty() : this.roleId;
    }

    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    @InputImport(name="stage")
      private final @Nullable Input<String> stage;

    public Input<String> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    /**
     * A human-readable title for the role.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Input<String> title;

    public Input<String> getTitle() {
        return this.title == null ? Input.empty() : this.title;
    }

    public IAMCustomRoleState(
        @Nullable Input<Boolean> deleted,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> orgId,
        @Nullable Input<List<String>> permissions,
        @Nullable Input<String> roleId,
        @Nullable Input<String> stage,
        @Nullable Input<String> title) {
        this.deleted = deleted;
        this.description = description;
        this.name = name;
        this.orgId = orgId;
        this.permissions = permissions;
        this.roleId = roleId;
        this.stage = stage;
        this.title = title;
    }

    private IAMCustomRoleState() {
        this.deleted = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.orgId = Input.empty();
        this.permissions = Input.empty();
        this.roleId = Input.empty();
        this.stage = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMCustomRoleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleted;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> orgId;
        private @Nullable Input<List<String>> permissions;
        private @Nullable Input<String> roleId;
        private @Nullable Input<String> stage;
        private @Nullable Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMCustomRoleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.permissions = defaults.permissions;
    	      this.roleId = defaults.roleId;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder deleted(@Nullable Input<Boolean> deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder deleted(@Nullable Boolean deleted) {
            this.deleted = Input.ofNullable(deleted);
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder orgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder orgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
            return this;
        }

        public Builder permissions(@Nullable Input<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }

        public Builder roleId(@Nullable Input<String> roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder roleId(@Nullable String roleId) {
            this.roleId = Input.ofNullable(roleId);
            return this;
        }

        public Builder stage(@Nullable Input<String> stage) {
            this.stage = stage;
            return this;
        }

        public Builder stage(@Nullable String stage) {
            this.stage = Input.ofNullable(stage);
            return this;
        }

        public Builder title(@Nullable Input<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Input.ofNullable(title);
            return this;
        }
        public IAMCustomRoleState build() {
            return new IAMCustomRoleState(deleted, description, name, orgId, permissions, roleId, stage, title);
        }
    }
}
