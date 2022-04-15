// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.secretmanager.inputs.SecretIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretIamBindingArgs Empty = new SecretIamBindingArgs();

    @Import(name="condition")
      private final @Nullable Output<SecretIamBindingConditionArgs> condition;

    public Output<SecretIamBindingConditionArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="members", required=true)
      private final Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
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

    /**
     * The role that should be applied. Only one
     * `gcp.secretmanager.SecretIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    @Import(name="secretId", required=true)
      private final Output<String> secretId;

    public Output<String> secretId() {
        return this.secretId;
    }

    public SecretIamBindingArgs(
        @Nullable Output<SecretIamBindingConditionArgs> condition,
        Output<List<String>> members,
        @Nullable Output<String> project,
        Output<String> role,
        Output<String> secretId) {
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
    }

    private SecretIamBindingArgs() {
        this.condition = Codegen.empty();
        this.members = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
        this.secretId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecretIamBindingConditionArgs> condition;
        private Output<List<String>> members;
        private @Nullable Output<String> project;
        private Output<String> role;
        private Output<String> secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.secretId = defaults.secretId;
        }

        public Builder condition(@Nullable Output<SecretIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable SecretIamBindingConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder members(Output<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(List<String> members) {
            this.members = Output.of(Objects.requireNonNull(members));
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }
        public Builder secretId(Output<String> secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        public Builder secretId(String secretId) {
            this.secretId = Output.of(Objects.requireNonNull(secretId));
            return this;
        }        public SecretIamBindingArgs build() {
            return new SecretIamBindingArgs(condition, members, project, role, secretId);
        }
    }
}
