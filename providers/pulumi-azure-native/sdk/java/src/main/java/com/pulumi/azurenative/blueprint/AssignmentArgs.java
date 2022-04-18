// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint;

import com.pulumi.azurenative.blueprint.inputs.AssignmentLockSettingsArgs;
import com.pulumi.azurenative.blueprint.inputs.ManagedServiceIdentityArgs;
import com.pulumi.azurenative.blueprint.inputs.ParameterValueArgs;
import com.pulumi.azurenative.blueprint.inputs.ResourceGroupValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssignmentArgs Empty = new AssignmentArgs();

    /**
     * Name of the blueprint assignment.
     * 
     */
    @Import(name="assignmentName")
      private final @Nullable Output<String> assignmentName;

    public Output<String> assignmentName() {
        return this.assignmentName == null ? Codegen.empty() : this.assignmentName;
    }

    /**
     * ID of the published version of a blueprint definition.
     * 
     */
    @Import(name="blueprintId")
      private final @Nullable Output<String> blueprintId;

    public Output<String> blueprintId() {
        return this.blueprintId == null ? Codegen.empty() : this.blueprintId;
    }

    /**
     * Multi-line explain this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * One-liner string explain this resource.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Managed identity for this blueprint assignment.
     * 
     */
    @Import(name="identity", required=true)
      private final Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> identity() {
        return this.identity;
    }

    /**
     * The location of this blueprint assignment.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Defines how resources deployed by a blueprint assignment are locked.
     * 
     */
    @Import(name="locks")
      private final @Nullable Output<AssignmentLockSettingsArgs> locks;

    public Output<AssignmentLockSettingsArgs> locks() {
        return this.locks == null ? Codegen.empty() : this.locks;
    }

    /**
     * Blueprint assignment parameter values.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<Map<String,ParameterValueArgs>> parameters;

    public Output<Map<String,ParameterValueArgs>> parameters() {
        return this.parameters;
    }

    /**
     * Names and locations of resource group placeholders.
     * 
     */
    @Import(name="resourceGroups", required=true)
      private final Output<Map<String,ResourceGroupValueArgs>> resourceGroups;

    public Output<Map<String,ResourceGroupValueArgs>> resourceGroups() {
        return this.resourceGroups;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: '/providers/Microsoft.Management/managementGroups/{managementGroup}'), subscription (format: '/subscriptions/{subscriptionId}').
     * 
     */
    @Import(name="resourceScope", required=true)
      private final Output<String> resourceScope;

    public Output<String> resourceScope() {
        return this.resourceScope;
    }

    /**
     * The target subscription scope of the blueprint assignment (format: '/subscriptions/{subscriptionId}'). For management group level assignments, the property is required.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    public AssignmentArgs(
        @Nullable Output<String> assignmentName,
        @Nullable Output<String> blueprintId,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        Output<ManagedServiceIdentityArgs> identity,
        @Nullable Output<String> location,
        @Nullable Output<AssignmentLockSettingsArgs> locks,
        Output<Map<String,ParameterValueArgs>> parameters,
        Output<Map<String,ResourceGroupValueArgs>> resourceGroups,
        Output<String> resourceScope,
        @Nullable Output<String> scope) {
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
        this.assignmentName = Codegen.empty();
        this.blueprintId = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.identity = Codegen.empty();
        this.location = Codegen.empty();
        this.locks = Codegen.empty();
        this.parameters = Codegen.empty();
        this.resourceGroups = Codegen.empty();
        this.resourceScope = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> assignmentName;
        private @Nullable Output<String> blueprintId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private Output<ManagedServiceIdentityArgs> identity;
        private @Nullable Output<String> location;
        private @Nullable Output<AssignmentLockSettingsArgs> locks;
        private Output<Map<String,ParameterValueArgs>> parameters;
        private Output<Map<String,ResourceGroupValueArgs>> resourceGroups;
        private Output<String> resourceScope;
        private @Nullable Output<String> scope;

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

        public Builder assignmentName(@Nullable Output<String> assignmentName) {
            this.assignmentName = assignmentName;
            return this;
        }
        public Builder assignmentName(@Nullable String assignmentName) {
            this.assignmentName = Codegen.ofNullable(assignmentName);
            return this;
        }
        public Builder blueprintId(@Nullable Output<String> blueprintId) {
            this.blueprintId = blueprintId;
            return this;
        }
        public Builder blueprintId(@Nullable String blueprintId) {
            this.blueprintId = Codegen.ofNullable(blueprintId);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder identity(Output<ManagedServiceIdentityArgs> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder identity(ManagedServiceIdentityArgs identity) {
            this.identity = Output.of(Objects.requireNonNull(identity));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder locks(@Nullable Output<AssignmentLockSettingsArgs> locks) {
            this.locks = locks;
            return this;
        }
        public Builder locks(@Nullable AssignmentLockSettingsArgs locks) {
            this.locks = Codegen.ofNullable(locks);
            return this;
        }
        public Builder parameters(Output<Map<String,ParameterValueArgs>> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(Map<String,ParameterValueArgs> parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }
        public Builder resourceGroups(Output<Map<String,ResourceGroupValueArgs>> resourceGroups) {
            this.resourceGroups = Objects.requireNonNull(resourceGroups);
            return this;
        }
        public Builder resourceGroups(Map<String,ResourceGroupValueArgs> resourceGroups) {
            this.resourceGroups = Output.of(Objects.requireNonNull(resourceGroups));
            return this;
        }
        public Builder resourceScope(Output<String> resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }
        public Builder resourceScope(String resourceScope) {
            this.resourceScope = Output.of(Objects.requireNonNull(resourceScope));
            return this;
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }        public AssignmentArgs build() {
            return new AssignmentArgs(assignmentName, blueprintId, description, displayName, identity, location, locks, parameters, resourceGroups, resourceScope, scope);
        }
    }
}
