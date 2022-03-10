// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.blueprint.inputs.AssignmentLockSettingsArgs;
import io.pulumi.azurenative.blueprint.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.blueprint.inputs.ParameterValueArgs;
import io.pulumi.azurenative.blueprint.inputs.ResourceGroupValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssignmentArgs Empty = new AssignmentArgs();

    /**
     * Name of the blueprint assignment.
     * 
     */
    @InputImport(name="assignmentName")
      private final @Nullable Input<String> assignmentName;

    public Input<String> getAssignmentName() {
        return this.assignmentName == null ? Input.empty() : this.assignmentName;
    }

    /**
     * ID of the published version of a blueprint definition.
     * 
     */
    @InputImport(name="blueprintId")
      private final @Nullable Input<String> blueprintId;

    public Input<String> getBlueprintId() {
        return this.blueprintId == null ? Input.empty() : this.blueprintId;
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Managed identity for this blueprint assignment.
     * 
     */
    @InputImport(name="identity", required=true)
      private final Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity;
    }

    /**
     * The location of this blueprint assignment.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Defines how resources deployed by a blueprint assignment are locked.
     * 
     */
    @InputImport(name="locks")
      private final @Nullable Input<AssignmentLockSettingsArgs> locks;

    public Input<AssignmentLockSettingsArgs> getLocks() {
        return this.locks == null ? Input.empty() : this.locks;
    }

    /**
     * Blueprint assignment parameter values.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final Input<Map<String,ParameterValueArgs>> parameters;

    public Input<Map<String,ParameterValueArgs>> getParameters() {
        return this.parameters;
    }

    /**
     * Names and locations of resource group placeholders.
     * 
     */
    @InputImport(name="resourceGroups", required=true)
      private final Input<Map<String,ResourceGroupValueArgs>> resourceGroups;

    public Input<Map<String,ResourceGroupValueArgs>> getResourceGroups() {
        return this.resourceGroups;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @InputImport(name="resourceScope", required=true)
      private final Input<String> resourceScope;

    public Input<String> getResourceScope() {
        return this.resourceScope;
    }

    /**
     * The target subscription scope of the blueprint assignment (format: '/subscriptions/{subscriptionId}'). For management group level assignments, the property is required.
     * 
     */
    @InputImport(name="scope")
      private final @Nullable Input<String> scope;

    public Input<String> getScope() {
        return this.scope == null ? Input.empty() : this.scope;
    }

    public AssignmentArgs(
        @Nullable Input<String> assignmentName,
        @Nullable Input<String> blueprintId,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<AssignmentLockSettingsArgs> locks,
        Input<Map<String,ParameterValueArgs>> parameters,
        Input<Map<String,ResourceGroupValueArgs>> resourceGroups,
        Input<String> resourceScope,
        @Nullable Input<String> scope) {
        this.assignmentName = assignmentName;
        this.blueprintId = blueprintId;
        this.description = description;
        this.displayName = displayName;
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
        this.location = location;
        this.locks = locks;
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.resourceGroups = Objects.requireNonNull(resourceGroups, "expected parameter 'resourceGroups' to be non-null");
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
        this.scope = scope;
    }

    private AssignmentArgs() {
        this.assignmentName = Input.empty();
        this.blueprintId = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.locks = Input.empty();
        this.parameters = Input.empty();
        this.resourceGroups = Input.empty();
        this.resourceScope = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> assignmentName;
        private @Nullable Input<String> blueprintId;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<AssignmentLockSettingsArgs> locks;
        private Input<Map<String,ParameterValueArgs>> parameters;
        private Input<Map<String,ResourceGroupValueArgs>> resourceGroups;
        private Input<String> resourceScope;
        private @Nullable Input<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentName = defaults.assignmentName;
    	      this.blueprintId = defaults.blueprintId;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.locks = defaults.locks;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.resourceScope = defaults.resourceScope;
    	      this.scope = defaults.scope;
        }

        public Builder assignmentName(@Nullable Input<String> assignmentName) {
            this.assignmentName = assignmentName;
            return this;
        }

        public Builder assignmentName(@Nullable String assignmentName) {
            this.assignmentName = Input.ofNullable(assignmentName);
            return this;
        }

        public Builder blueprintId(@Nullable Input<String> blueprintId) {
            this.blueprintId = blueprintId;
            return this;
        }

        public Builder blueprintId(@Nullable String blueprintId) {
            this.blueprintId = Input.ofNullable(blueprintId);
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

        public Builder displayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder identity(Input<ManagedServiceIdentityArgs> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder identity(ManagedServiceIdentityArgs identity) {
            this.identity = Input.of(Objects.requireNonNull(identity));
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder locks(@Nullable Input<AssignmentLockSettingsArgs> locks) {
            this.locks = locks;
            return this;
        }

        public Builder locks(@Nullable AssignmentLockSettingsArgs locks) {
            this.locks = Input.ofNullable(locks);
            return this;
        }

        public Builder parameters(Input<Map<String,ParameterValueArgs>> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder parameters(Map<String,ParameterValueArgs> parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder resourceGroups(Input<Map<String,ResourceGroupValueArgs>> resourceGroups) {
            this.resourceGroups = Objects.requireNonNull(resourceGroups);
            return this;
        }

        public Builder resourceGroups(Map<String,ResourceGroupValueArgs> resourceGroups) {
            this.resourceGroups = Input.of(Objects.requireNonNull(resourceGroups));
            return this;
        }

        public Builder resourceScope(Input<String> resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }

        public Builder resourceScope(String resourceScope) {
            this.resourceScope = Input.of(Objects.requireNonNull(resourceScope));
            return this;
        }

        public Builder scope(@Nullable Input<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = Input.ofNullable(scope);
            return this;
        }
        public AssignmentArgs build() {
            return new AssignmentArgs(assignmentName, blueprintId, description, displayName, identity, location, locks, parameters, resourceGroups, resourceScope, scope);
        }
    }
}
