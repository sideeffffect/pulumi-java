// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryGroupIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryGroupIamMemberArgs Empty = new EntryGroupIamMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<EntryGroupIamMemberConditionArgs> condition;

    public Output<EntryGroupIamMemberConditionArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="entryGroup", required=true)
      private final Output<String> entryGroup;

    public Output<String> entryGroup() {
        return this.entryGroup;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.EntryGroupIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    public EntryGroupIamMemberArgs(
        @Nullable Output<EntryGroupIamMemberConditionArgs> condition,
        Output<String> entryGroup,
        Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<String> role) {
        this.condition = condition;
        this.entryGroup = Objects.requireNonNull(entryGroup, "expected parameter 'entryGroup' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.region = region;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private EntryGroupIamMemberArgs() {
        this.condition = Codegen.empty();
        this.entryGroup = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGroupIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EntryGroupIamMemberConditionArgs> condition;
        private Output<String> entryGroup;
        private Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGroupIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.entryGroup = defaults.entryGroup;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<EntryGroupIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable EntryGroupIamMemberConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder entryGroup(Output<String> entryGroup) {
            this.entryGroup = Objects.requireNonNull(entryGroup);
            return this;
        }
        public Builder entryGroup(String entryGroup) {
            this.entryGroup = Output.of(Objects.requireNonNull(entryGroup));
            return this;
        }
        public Builder member(Output<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }
        public Builder member(String member) {
            this.member = Output.of(Objects.requireNonNull(member));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public EntryGroupIamMemberArgs build() {
            return new EntryGroupIamMemberArgs(condition, entryGroup, member, project, region, role);
        }
    }
}
