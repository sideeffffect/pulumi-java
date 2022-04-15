// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigtable.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.bigtable.inputs.GCPolicyMaxAgeGetArgs;
import io.pulumi.gcp.bigtable.inputs.GCPolicyMaxVersionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GCPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final GCPolicyState Empty = new GCPolicyState();

    /**
     * The name of the column family.
     * 
     */
    @Import(name="columnFamily")
      private final @Nullable Output<String> columnFamily;

    public Output<String> columnFamily() {
        return this.columnFamily == null ? Codegen.empty() : this.columnFamily;
    }

    /**
     * The name of the Bigtable instance.
     * 
     */
    @Import(name="instanceName")
      private final @Nullable Output<String> instanceName;

    public Output<String> instanceName() {
        return this.instanceName == null ? Codegen.empty() : this.instanceName;
    }

    /**
     * GC policy that applies to all cells older than the given age.
     * 
     */
    @Import(name="maxAge")
      private final @Nullable Output<GCPolicyMaxAgeGetArgs> maxAge;

    public Output<GCPolicyMaxAgeGetArgs> maxAge() {
        return this.maxAge == null ? Codegen.empty() : this.maxAge;
    }

    /**
     * GC policy that applies to all versions of a cell except for the most recent.
     * 
     */
    @Import(name="maxVersions")
      private final @Nullable Output<List<GCPolicyMaxVersionGetArgs>> maxVersions;

    public Output<List<GCPolicyMaxVersionGetArgs>> maxVersions() {
        return this.maxVersions == null ? Codegen.empty() : this.maxVersions;
    }

    /**
     * If multiple policies are set, you should choose between `UNION` OR `INTERSECTION`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> mode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="table")
      private final @Nullable Output<String> table;

    public Output<String> table() {
        return this.table == null ? Codegen.empty() : this.table;
    }

    public GCPolicyState(
        @Nullable Output<String> columnFamily,
        @Nullable Output<String> instanceName,
        @Nullable Output<GCPolicyMaxAgeGetArgs> maxAge,
        @Nullable Output<List<GCPolicyMaxVersionGetArgs>> maxVersions,
        @Nullable Output<String> mode,
        @Nullable Output<String> project,
        @Nullable Output<String> table) {
        this.columnFamily = columnFamily;
        this.instanceName = instanceName;
        this.maxAge = maxAge;
        this.maxVersions = maxVersions;
        this.mode = mode;
        this.project = project;
        this.table = table;
    }

    private GCPolicyState() {
        this.columnFamily = Codegen.empty();
        this.instanceName = Codegen.empty();
        this.maxAge = Codegen.empty();
        this.maxVersions = Codegen.empty();
        this.mode = Codegen.empty();
        this.project = Codegen.empty();
        this.table = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GCPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> columnFamily;
        private @Nullable Output<String> instanceName;
        private @Nullable Output<GCPolicyMaxAgeGetArgs> maxAge;
        private @Nullable Output<List<GCPolicyMaxVersionGetArgs>> maxVersions;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> project;
        private @Nullable Output<String> table;

        public Builder() {
    	      // Empty
        }

        public Builder(GCPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFamily = defaults.columnFamily;
    	      this.instanceName = defaults.instanceName;
    	      this.maxAge = defaults.maxAge;
    	      this.maxVersions = defaults.maxVersions;
    	      this.mode = defaults.mode;
    	      this.project = defaults.project;
    	      this.table = defaults.table;
        }

        public Builder columnFamily(@Nullable Output<String> columnFamily) {
            this.columnFamily = columnFamily;
            return this;
        }
        public Builder columnFamily(@Nullable String columnFamily) {
            this.columnFamily = Codegen.ofNullable(columnFamily);
            return this;
        }
        public Builder instanceName(@Nullable Output<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public Builder instanceName(@Nullable String instanceName) {
            this.instanceName = Codegen.ofNullable(instanceName);
            return this;
        }
        public Builder maxAge(@Nullable Output<GCPolicyMaxAgeGetArgs> maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public Builder maxAge(@Nullable GCPolicyMaxAgeGetArgs maxAge) {
            this.maxAge = Codegen.ofNullable(maxAge);
            return this;
        }
        public Builder maxVersions(@Nullable Output<List<GCPolicyMaxVersionGetArgs>> maxVersions) {
            this.maxVersions = maxVersions;
            return this;
        }
        public Builder maxVersions(@Nullable List<GCPolicyMaxVersionGetArgs> maxVersions) {
            this.maxVersions = Codegen.ofNullable(maxVersions);
            return this;
        }
        public Builder maxVersions(GCPolicyMaxVersionGetArgs... maxVersions) {
            return maxVersions(List.of(maxVersions));
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
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
        public Builder table(@Nullable Output<String> table) {
            this.table = table;
            return this;
        }
        public Builder table(@Nullable String table) {
            this.table = Codegen.ofNullable(table);
            return this;
        }        public GCPolicyState build() {
            return new GCPolicyState(columnFamily, instanceName, maxAge, maxVersions, mode, project, table);
        }
    }
}
