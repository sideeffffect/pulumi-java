// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of role definition
 * 
 */
public final class PolicyAssignmentPropertiesResponseRoleDefinition extends com.pulumi.resources.InvokeArgs {

    public static final PolicyAssignmentPropertiesResponseRoleDefinition Empty = new PolicyAssignmentPropertiesResponseRoleDefinition();

    /**
     * Display name of the role definition
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Id of the role definition
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Type of the role definition
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> type() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public PolicyAssignmentPropertiesResponseRoleDefinition(
        @Nullable String displayName,
        @Nullable String id,
        @Nullable String type) {
        this.displayName = displayName;
        this.id = id;
        this.type = type;
    }

    private PolicyAssignmentPropertiesResponseRoleDefinition() {
        this.displayName = null;
        this.id = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAssignmentPropertiesResponseRoleDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAssignmentPropertiesResponseRoleDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public PolicyAssignmentPropertiesResponseRoleDefinition build() {
            return new PolicyAssignmentPropertiesResponseRoleDefinition(displayName, id, type);
        }
    }
}
