// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.iam.v1.enums.OrganizationRoleStage;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationRoleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationRoleArgs Empty = new OrganizationRoleArgs();

    /**
     * The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
     * 
     */
    @Import(name="deleted")
    private @Nullable Output<Boolean> deleted;

    /**
     * @return The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
     * 
     */
    public Optional<Output<Boolean>> deleted() {
        return Optional.ofNullable(this.deleted);
    }

    /**
     * Optional. A human-readable description for the role.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. A human-readable description for the role.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Used to perform a consistent read-modify-write.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return Used to perform a consistent read-modify-write.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    @Import(name="includedPermissions")
    private @Nullable Output<List<String>> includedPermissions;

    /**
     * @return The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    public Optional<Output<List<String>>> includedPermissions() {
        return Optional.ofNullable(this.includedPermissions);
    }

    /**
     * The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="organizationId", required=true)
    private Output<String> organizationId;

    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     * The role ID to use for this role. A role ID may contain alphanumeric characters, underscores (`_`), and periods (`.`). It must contain a minimum of 3 characters and a maximum of 64 characters.
     * 
     */
    @Import(name="roleId")
    private @Nullable Output<String> roleId;

    /**
     * @return The role ID to use for this role. A role ID may contain alphanumeric characters, underscores (`_`), and periods (`.`). It must contain a minimum of 3 characters and a maximum of 64 characters.
     * 
     */
    public Optional<Output<String>> roleId() {
        return Optional.ofNullable(this.roleId);
    }

    /**
     * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
     * 
     */
    @Import(name="stage")
    private @Nullable Output<OrganizationRoleStage> stage;

    /**
     * @return The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
     * 
     */
    public Optional<Output<OrganizationRoleStage>> stage() {
        return Optional.ofNullable(this.stage);
    }

    /**
     * Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private OrganizationRoleArgs() {}

    private OrganizationRoleArgs(OrganizationRoleArgs $) {
        this.deleted = $.deleted;
        this.description = $.description;
        this.etag = $.etag;
        this.includedPermissions = $.includedPermissions;
        this.name = $.name;
        this.organizationId = $.organizationId;
        this.roleId = $.roleId;
        this.stage = $.stage;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationRoleArgs $;

        public Builder() {
            $ = new OrganizationRoleArgs();
        }

        public Builder(OrganizationRoleArgs defaults) {
            $ = new OrganizationRoleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleted The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
         * 
         * @return builder
         * 
         */
        public Builder deleted(@Nullable Output<Boolean> deleted) {
            $.deleted = deleted;
            return this;
        }

        /**
         * @param deleted The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
         * 
         * @return builder
         * 
         */
        public Builder deleted(Boolean deleted) {
            return deleted(Output.of(deleted));
        }

        /**
         * @param description Optional. A human-readable description for the role.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. A human-readable description for the role.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param etag Used to perform a consistent read-modify-write.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag Used to perform a consistent read-modify-write.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param includedPermissions The names of the permissions this role grants when bound in an IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder includedPermissions(@Nullable Output<List<String>> includedPermissions) {
            $.includedPermissions = includedPermissions;
            return this;
        }

        /**
         * @param includedPermissions The names of the permissions this role grants when bound in an IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder includedPermissions(List<String> includedPermissions) {
            return includedPermissions(Output.of(includedPermissions));
        }

        /**
         * @param includedPermissions The names of the permissions this role grants when bound in an IAM policy.
         * 
         * @return builder
         * 
         */
        public Builder includedPermissions(String... includedPermissions) {
            return includedPermissions(List.of(includedPermissions));
        }

        /**
         * @param name The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder organizationId(Output<String> organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder organizationId(String organizationId) {
            return organizationId(Output.of(organizationId));
        }

        /**
         * @param roleId The role ID to use for this role. A role ID may contain alphanumeric characters, underscores (`_`), and periods (`.`). It must contain a minimum of 3 characters and a maximum of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder roleId(@Nullable Output<String> roleId) {
            $.roleId = roleId;
            return this;
        }

        /**
         * @param roleId The role ID to use for this role. A role ID may contain alphanumeric characters, underscores (`_`), and periods (`.`). It must contain a minimum of 3 characters and a maximum of 64 characters.
         * 
         * @return builder
         * 
         */
        public Builder roleId(String roleId) {
            return roleId(Output.of(roleId));
        }

        /**
         * @param stage The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
         * 
         * @return builder
         * 
         */
        public Builder stage(@Nullable Output<OrganizationRoleStage> stage) {
            $.stage = stage;
            return this;
        }

        /**
         * @param stage The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
         * 
         * @return builder
         * 
         */
        public Builder stage(OrganizationRoleStage stage) {
            return stage(Output.of(stage));
        }

        /**
         * @param title Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public OrganizationRoleArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            return $;
        }
    }

}
