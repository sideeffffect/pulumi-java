// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.bigquery.inputs.DatasetIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetIamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetIamMemberArgs Empty = new DatasetIamMemberArgs();

    @Import(name="condition")
      private final @Nullable Output<DatasetIamMemberConditionArgs> condition;

    public Output<DatasetIamMemberConditionArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * The dataset ID.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="member", required=true)
      private final Output<String> member;

    public Output<String> member() {
        return this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigquery.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> role() {
        return this.role;
    }

    public DatasetIamMemberArgs(
        @Nullable Output<DatasetIamMemberConditionArgs> condition,
        Output<String> datasetId,
        Output<String> member,
        @Nullable Output<String> project,
        Output<String> role) {
        this.condition = condition;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private DatasetIamMemberArgs() {
        this.condition = Codegen.empty();
        this.datasetId = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatasetIamMemberConditionArgs> condition;
        private Output<String> datasetId;
        private Output<String> member;
        private @Nullable Output<String> project;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.datasetId = defaults.datasetId;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<DatasetIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable DatasetIamMemberConditionArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
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
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder role(String role) {
            this.role = Output.of(Objects.requireNonNull(role));
            return this;
        }        public DatasetIamMemberArgs build() {
            return new DatasetIamMemberArgs(condition, datasetId, member, project, role);
        }
    }
}
