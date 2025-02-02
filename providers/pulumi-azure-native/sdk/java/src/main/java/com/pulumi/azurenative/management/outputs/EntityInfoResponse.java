// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.management.outputs;

import com.pulumi.azurenative.management.outputs.EntityParentGroupInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntityInfoResponse {
    /**
     * @return The friendly name of the management group.
     * 
     */
    private final @Nullable String displayName;
    /**
     * @return The fully qualified ID for the entity.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    private final String id;
    /**
     * @return The users specific permissions to this item.
     * 
     */
    private final @Nullable String inheritedPermissions;
    /**
     * @return The name of the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    private final String name;
    /**
     * @return Number of children is the number of Groups that are exactly one level underneath the current Group.
     * 
     */
    private final @Nullable Integer numberOfChildGroups;
    /**
     * @return Number of children is the number of Groups and Subscriptions that are exactly one level underneath the current Group.
     * 
     */
    private final @Nullable Integer numberOfChildren;
    private final @Nullable Integer numberOfDescendants;
    /**
     * @return (Optional) The ID of the parent management group.
     * 
     */
    private final @Nullable EntityParentGroupInfoResponse parent;
    /**
     * @return The parent display name chain from the root group to the immediate parent
     * 
     */
    private final @Nullable List<String> parentDisplayNameChain;
    /**
     * @return The parent name chain from the root group to the immediate parent
     * 
     */
    private final @Nullable List<String> parentNameChain;
    /**
     * @return The users specific permissions to this item.
     * 
     */
    private final @Nullable String permissions;
    /**
     * @return The AAD Tenant ID associated with the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    private final @Nullable String tenantId;
    /**
     * @return The type of the resource. For example, Microsoft.Management/managementGroups
     * 
     */
    private final String type;

    @CustomType.Constructor
    private EntityInfoResponse(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inheritedPermissions") @Nullable String inheritedPermissions,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("numberOfChildGroups") @Nullable Integer numberOfChildGroups,
        @CustomType.Parameter("numberOfChildren") @Nullable Integer numberOfChildren,
        @CustomType.Parameter("numberOfDescendants") @Nullable Integer numberOfDescendants,
        @CustomType.Parameter("parent") @Nullable EntityParentGroupInfoResponse parent,
        @CustomType.Parameter("parentDisplayNameChain") @Nullable List<String> parentDisplayNameChain,
        @CustomType.Parameter("parentNameChain") @Nullable List<String> parentNameChain,
        @CustomType.Parameter("permissions") @Nullable String permissions,
        @CustomType.Parameter("tenantId") @Nullable String tenantId,
        @CustomType.Parameter("type") String type) {
        this.displayName = displayName;
        this.id = id;
        this.inheritedPermissions = inheritedPermissions;
        this.name = name;
        this.numberOfChildGroups = numberOfChildGroups;
        this.numberOfChildren = numberOfChildren;
        this.numberOfDescendants = numberOfDescendants;
        this.parent = parent;
        this.parentDisplayNameChain = parentDisplayNameChain;
        this.parentNameChain = parentNameChain;
        this.permissions = permissions;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The friendly name of the management group.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * @return The fully qualified ID for the entity.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The users specific permissions to this item.
     * 
     */
    public Optional<String> inheritedPermissions() {
        return Optional.ofNullable(this.inheritedPermissions);
    }
    /**
     * @return The name of the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Number of children is the number of Groups that are exactly one level underneath the current Group.
     * 
     */
    public Optional<Integer> numberOfChildGroups() {
        return Optional.ofNullable(this.numberOfChildGroups);
    }
    /**
     * @return Number of children is the number of Groups and Subscriptions that are exactly one level underneath the current Group.
     * 
     */
    public Optional<Integer> numberOfChildren() {
        return Optional.ofNullable(this.numberOfChildren);
    }
    public Optional<Integer> numberOfDescendants() {
        return Optional.ofNullable(this.numberOfDescendants);
    }
    /**
     * @return (Optional) The ID of the parent management group.
     * 
     */
    public Optional<EntityParentGroupInfoResponse> parent() {
        return Optional.ofNullable(this.parent);
    }
    /**
     * @return The parent display name chain from the root group to the immediate parent
     * 
     */
    public List<String> parentDisplayNameChain() {
        return this.parentDisplayNameChain == null ? List.of() : this.parentDisplayNameChain;
    }
    /**
     * @return The parent name chain from the root group to the immediate parent
     * 
     */
    public List<String> parentNameChain() {
        return this.parentNameChain == null ? List.of() : this.parentNameChain;
    }
    /**
     * @return The users specific permissions to this item.
     * 
     */
    public Optional<String> permissions() {
        return Optional.ofNullable(this.permissions);
    }
    /**
     * @return The AAD Tenant ID associated with the entity. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    public Optional<String> tenantId() {
        return Optional.ofNullable(this.tenantId);
    }
    /**
     * @return The type of the resource. For example, Microsoft.Management/managementGroups
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private @Nullable String inheritedPermissions;
        private String name;
        private @Nullable Integer numberOfChildGroups;
        private @Nullable Integer numberOfChildren;
        private @Nullable Integer numberOfDescendants;
        private @Nullable EntityParentGroupInfoResponse parent;
        private @Nullable List<String> parentDisplayNameChain;
        private @Nullable List<String> parentNameChain;
        private @Nullable String permissions;
        private @Nullable String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.inheritedPermissions = defaults.inheritedPermissions;
    	      this.name = defaults.name;
    	      this.numberOfChildGroups = defaults.numberOfChildGroups;
    	      this.numberOfChildren = defaults.numberOfChildren;
    	      this.numberOfDescendants = defaults.numberOfDescendants;
    	      this.parent = defaults.parent;
    	      this.parentDisplayNameChain = defaults.parentDisplayNameChain;
    	      this.parentNameChain = defaults.parentNameChain;
    	      this.permissions = defaults.permissions;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder inheritedPermissions(@Nullable String inheritedPermissions) {
            this.inheritedPermissions = inheritedPermissions;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder numberOfChildGroups(@Nullable Integer numberOfChildGroups) {
            this.numberOfChildGroups = numberOfChildGroups;
            return this;
        }
        public Builder numberOfChildren(@Nullable Integer numberOfChildren) {
            this.numberOfChildren = numberOfChildren;
            return this;
        }
        public Builder numberOfDescendants(@Nullable Integer numberOfDescendants) {
            this.numberOfDescendants = numberOfDescendants;
            return this;
        }
        public Builder parent(@Nullable EntityParentGroupInfoResponse parent) {
            this.parent = parent;
            return this;
        }
        public Builder parentDisplayNameChain(@Nullable List<String> parentDisplayNameChain) {
            this.parentDisplayNameChain = parentDisplayNameChain;
            return this;
        }
        public Builder parentDisplayNameChain(String... parentDisplayNameChain) {
            return parentDisplayNameChain(List.of(parentDisplayNameChain));
        }
        public Builder parentNameChain(@Nullable List<String> parentNameChain) {
            this.parentNameChain = parentNameChain;
            return this;
        }
        public Builder parentNameChain(String... parentNameChain) {
            return parentNameChain(List.of(parentNameChain));
        }
        public Builder permissions(@Nullable String permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public EntityInfoResponse build() {
            return new EntityInfoResponse(displayName, id, inheritedPermissions, name, numberOfChildGroups, numberOfChildren, numberOfDescendants, parent, parentDisplayNameChain, parentNameChain, permissions, tenantId, type);
        }
    }
}
