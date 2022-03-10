// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.EntryGroupIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryGroupIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryGroupIamBindingArgs Empty = new EntryGroupIamBindingArgs();

    @InputImport(name="condition")
      private final @Nullable Input<EntryGroupIamBindingConditionArgs> condition;

    public Input<EntryGroupIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="entryGroup", required=true)
      private final Input<String> entryGroup;

    public Input<String> getEntryGroup() {
        return this.entryGroup;
    }

    @InputImport(name="members", required=true)
      private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.EntryGroupIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public EntryGroupIamBindingArgs(
        @Nullable Input<EntryGroupIamBindingConditionArgs> condition,
        Input<String> entryGroup,
        Input<List<String>> members,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        Input<String> role) {
        this.condition = condition;
        this.entryGroup = Objects.requireNonNull(entryGroup, "expected parameter 'entryGroup' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private EntryGroupIamBindingArgs() {
        this.condition = Input.empty();
        this.entryGroup = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGroupIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EntryGroupIamBindingConditionArgs> condition;
        private Input<String> entryGroup;
        private Input<List<String>> members;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGroupIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.entryGroup = defaults.entryGroup;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Input<EntryGroupIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable EntryGroupIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder entryGroup(Input<String> entryGroup) {
            this.entryGroup = Objects.requireNonNull(entryGroup);
            return this;
        }

        public Builder entryGroup(String entryGroup) {
            this.entryGroup = Input.of(Objects.requireNonNull(entryGroup));
            return this;
        }

        public Builder members(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder members(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder region(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder region(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder role(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder role(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public EntryGroupIamBindingArgs build() {
            return new EntryGroupIamBindingArgs(condition, entryGroup, members, project, region, role);
        }
    }
}
