// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamedQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamedQueryArgs Empty = new NamedQueryArgs();

    /**
     * The database to which the query belongs.
     * 
     */
    @Import(name="database", required=true)
      private final Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    /**
     * A brief explanation of the query. Maximum length of 1024.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The plain language name for the query. Maximum length of 128.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The text of the query itself. In other words, all query statements. Maximum length of 262144.
     * 
     */
    @Import(name="query", required=true)
      private final Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    /**
     * The workgroup to which the query belongs. Defaults to `primary`
     * 
     */
    @Import(name="workgroup")
      private final @Nullable Output<String> workgroup;

    public Output<String> workgroup() {
        return this.workgroup == null ? Codegen.empty() : this.workgroup;
    }

    public NamedQueryArgs(
        Output<String> database,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> query,
        @Nullable Output<String> workgroup) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.description = description;
        this.name = name;
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.workgroup = workgroup;
    }

    private NamedQueryArgs() {
        this.database = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.query = Codegen.empty();
        this.workgroup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> database;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> query;
        private @Nullable Output<String> workgroup;

        public Builder() {
    	      // Empty
        }

        public Builder(NamedQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.query = defaults.query;
    	      this.workgroup = defaults.workgroup;
        }

        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
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
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder query(Output<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder query(String query) {
            this.query = Output.of(Objects.requireNonNull(query));
            return this;
        }
        public Builder workgroup(@Nullable Output<String> workgroup) {
            this.workgroup = workgroup;
            return this;
        }
        public Builder workgroup(@Nullable String workgroup) {
            this.workgroup = Codegen.ofNullable(workgroup);
            return this;
        }        public NamedQueryArgs build() {
            return new NamedQueryArgs(database, description, name, query, workgroup);
        }
    }
}
