// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.bigtable.inputs.TableIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final TableIamMemberState Empty = new TableIamMemberState();

    @Import(name="condition")
      private final @Nullable Output<TableIamMemberConditionGetArgs> condition;

    public Output<TableIamMemberConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the tables's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The name or relative resource id of the instance that owns the table.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> instance() {
        return this.instance == null ? Codegen.empty() : this.instance;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> member() {
        return this.member == null ? Codegen.empty() : this.member;
    }

    /**
     * The project in which the table belongs. If it
     * is not provided, this provider will use the provider default.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.bigtable.TableIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`. Read more about roles [here](https://cloud.google.com/bigtable/docs/access-control#roles).
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    /**
     * The name or relative resource id of the table to manage IAM policies for.
     * 
     */
    @Import(name="table")
      private final @Nullable Output<String> table;

    public Output<String> table() {
        return this.table == null ? Codegen.empty() : this.table;
    }

    public TableIamMemberState(
        @Nullable Output<TableIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> instance,
        @Nullable Output<String> member,
        @Nullable Output<String> project,
        @Nullable Output<String> role,
        @Nullable Output<String> table) {
        this.condition = condition;
        this.etag = etag;
        this.instance = instance;
        this.member = member;
        this.project = project;
        this.role = role;
        this.table = table;
    }

    private TableIamMemberState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.instance = Codegen.empty();
        this.member = Codegen.empty();
        this.project = Codegen.empty();
        this.role = Codegen.empty();
        this.table = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TableIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> instance;
        private @Nullable Output<String> member;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;
        private @Nullable Output<String> table;

        public Builder() {
    	      // Empty
        }

        public Builder(TableIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.instance = defaults.instance;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
    	      this.table = defaults.table;
        }

        public Builder condition(@Nullable Output<TableIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable TableIamMemberConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Codegen.ofNullable(instance);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
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
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }
        public Builder table(@Nullable Output<String> table) {
            this.table = table;
            return this;
        }
        public Builder table(@Nullable String table) {
            this.table = Codegen.ofNullable(table);
            return this;
        }        public TableIamMemberState build() {
            return new TableIamMemberState(condition, etag, instance, member, project, role, table);
        }
    }
}
