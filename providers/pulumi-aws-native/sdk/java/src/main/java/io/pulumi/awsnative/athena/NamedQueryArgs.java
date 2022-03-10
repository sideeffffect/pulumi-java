// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamedQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamedQueryArgs Empty = new NamedQueryArgs();

    /**
     * The database to which the query belongs.
     * 
     */
    @InputImport(name="database", required=true)
      private final Input<String> database;

    public Input<String> getDatabase() {
        return this.database;
    }

    /**
     * The query description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The query name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The contents of the query with all query statements.
     * 
     */
    @InputImport(name="queryString", required=true)
      private final Input<String> queryString;

    public Input<String> getQueryString() {
        return this.queryString;
    }

    /**
     * The name of the workgroup that contains the named query.
     * 
     */
    @InputImport(name="workGroup")
      private final @Nullable Input<String> workGroup;

    public Input<String> getWorkGroup() {
        return this.workGroup == null ? Input.empty() : this.workGroup;
    }

    public NamedQueryArgs(
        Input<String> database,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        Input<String> queryString,
        @Nullable Input<String> workGroup) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.description = description;
        this.name = name;
        this.queryString = Objects.requireNonNull(queryString, "expected parameter 'queryString' to be non-null");
        this.workGroup = workGroup;
    }

    private NamedQueryArgs() {
        this.database = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.queryString = Input.empty();
        this.workGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamedQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> database;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private Input<String> queryString;
        private @Nullable Input<String> workGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(NamedQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.queryString = defaults.queryString;
    	      this.workGroup = defaults.workGroup;
        }

        public Builder database(Input<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder database(String database) {
            this.database = Input.of(Objects.requireNonNull(database));
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

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder queryString(Input<String> queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }

        public Builder queryString(String queryString) {
            this.queryString = Input.of(Objects.requireNonNull(queryString));
            return this;
        }

        public Builder workGroup(@Nullable Input<String> workGroup) {
            this.workGroup = workGroup;
            return this;
        }

        public Builder workGroup(@Nullable String workGroup) {
            this.workGroup = Input.ofNullable(workGroup);
            return this;
        }
        public NamedQueryArgs build() {
            return new NamedQueryArgs(database, description, name, queryString, workGroup);
        }
    }
}
