// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blueprint;

import io.pulumi.azurenative.blueprint.enums.BlueprintTargetScope;
import io.pulumi.azurenative.blueprint.inputs.ParameterDefinitionArgs;
import io.pulumi.azurenative.blueprint.inputs.ResourceGroupDefinitionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BlueprintArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlueprintArgs Empty = new BlueprintArgs();

    /**
     * Name of the blueprint definition.
     * 
     */
    @InputImport(name="blueprintName")
      private final @Nullable Input<String> blueprintName;

    public Input<String> getBlueprintName() {
        return this.blueprintName == null ? Input.empty() : this.blueprintName;
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
     * Parameters required by this blueprint definition.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Input<Map<String,ParameterDefinitionArgs>> parameters;

    public Input<Map<String,ParameterDefinitionArgs>> getParameters() {
        return this.parameters == null ? Input.empty() : this.parameters;
    }

    /**
     * Resource group placeholders defined by this blueprint definition.
     * 
     */
    @InputImport(name="resourceGroups")
      private final @Nullable Input<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;

    public Input<Map<String,ResourceGroupDefinitionArgs>> getResourceGroups() {
        return this.resourceGroups == null ? Input.empty() : this.resourceGroups;
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
     * The scope where this blueprint definition can be assigned.
     * 
     */
    @InputImport(name="targetScope", required=true)
      private final Input<Either<String,BlueprintTargetScope>> targetScope;

    public Input<Either<String,BlueprintTargetScope>> getTargetScope() {
        return this.targetScope;
    }

    /**
     * Published versions of this blueprint definition.
     * 
     */
    @InputImport(name="versions")
      private final @Nullable Input<Object> versions;

    public Input<Object> getVersions() {
        return this.versions == null ? Input.empty() : this.versions;
    }

    public BlueprintArgs(
        @Nullable Input<String> blueprintName,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<Map<String,ParameterDefinitionArgs>> parameters,
        @Nullable Input<Map<String,ResourceGroupDefinitionArgs>> resourceGroups,
        Input<String> resourceScope,
        Input<Either<String,BlueprintTargetScope>> targetScope,
        @Nullable Input<Object> versions) {
        this.blueprintName = blueprintName;
        this.description = description;
        this.displayName = displayName;
        this.parameters = parameters;
        this.resourceGroups = resourceGroups;
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
        this.targetScope = Objects.requireNonNull(targetScope, "expected parameter 'targetScope' to be non-null");
        this.versions = versions;
    }

    private BlueprintArgs() {
        this.blueprintName = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.parameters = Input.empty();
        this.resourceGroups = Input.empty();
        this.resourceScope = Input.empty();
        this.targetScope = Input.empty();
        this.versions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlueprintArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> blueprintName;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Map<String,ParameterDefinitionArgs>> parameters;
        private @Nullable Input<Map<String,ResourceGroupDefinitionArgs>> resourceGroups;
        private Input<String> resourceScope;
        private Input<Either<String,BlueprintTargetScope>> targetScope;
        private @Nullable Input<Object> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(BlueprintArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueprintName = defaults.blueprintName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroups = defaults.resourceGroups;
    	      this.resourceScope = defaults.resourceScope;
    	      this.targetScope = defaults.targetScope;
    	      this.versions = defaults.versions;
        }

        public Builder blueprintName(@Nullable Input<String> blueprintName) {
            this.blueprintName = blueprintName;
            return this;
        }

        public Builder blueprintName(@Nullable String blueprintName) {
            this.blueprintName = Input.ofNullable(blueprintName);
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

        public Builder parameters(@Nullable Input<Map<String,ParameterDefinitionArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable Map<String,ParameterDefinitionArgs> parameters) {
            this.parameters = Input.ofNullable(parameters);
            return this;
        }

        public Builder resourceGroups(@Nullable Input<Map<String,ResourceGroupDefinitionArgs>> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        public Builder resourceGroups(@Nullable Map<String,ResourceGroupDefinitionArgs> resourceGroups) {
            this.resourceGroups = Input.ofNullable(resourceGroups);
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

        public Builder targetScope(Input<Either<String,BlueprintTargetScope>> targetScope) {
            this.targetScope = Objects.requireNonNull(targetScope);
            return this;
        }

        public Builder targetScope(Either<String,BlueprintTargetScope> targetScope) {
            this.targetScope = Input.of(Objects.requireNonNull(targetScope));
            return this;
        }

        public Builder versions(@Nullable Input<Object> versions) {
            this.versions = versions;
            return this;
        }

        public Builder versions(@Nullable Object versions) {
            this.versions = Input.ofNullable(versions);
            return this;
        }
        public BlueprintArgs build() {
            return new BlueprintArgs(blueprintName, description, displayName, parameters, resourceGroups, resourceScope, targetScope, versions);
        }
    }
}
