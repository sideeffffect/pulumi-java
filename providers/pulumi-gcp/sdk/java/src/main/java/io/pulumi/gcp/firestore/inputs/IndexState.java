// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firestore.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.firestore.inputs.IndexFieldGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexState extends io.pulumi.resources.ResourceArgs {

    public static final IndexState Empty = new IndexState();

    /**
     * The collection being indexed.
     * 
     */
    @InputImport(name="collection")
      private final @Nullable Input<String> collection;

    public Input<String> getCollection() {
        return this.collection == null ? Input.empty() : this.collection;
    }

    /**
     * The Firestore database id. Defaults to `"(default)"`.
     * 
     */
    @InputImport(name="database")
      private final @Nullable Input<String> database;

    public Input<String> getDatabase() {
        return this.database == null ? Input.empty() : this.database;
    }

    /**
     * The fields supported by this index. The last field entry is always for
     * the field path `__name__`. If, on creation, `__name__` was not
     * specified as the last field, it will be added automatically with the
     * same direction as that of the last field defined. If the final field
     * in a composite index is not directional, the `__name__` will be
     * ordered `"ASCENDING"` (unless explicitly specified otherwise).
     * Structure is documented below.
     * 
     */
    @InputImport(name="fields")
      private final @Nullable Input<List<IndexFieldGetArgs>> fields;

    public Input<List<IndexFieldGetArgs>> getFields() {
        return this.fields == null ? Input.empty() : this.fields;
    }

    /**
     * A server defined name for this index. Format:
     * 'projects/{{project}}/databases/{{database}}/collectionGroups/{{collection}}/indexes/{{server_generated_id}}'
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The scope at which a query is run.
     * Default value is `COLLECTION`.
     * Possible values are `COLLECTION` and `COLLECTION_GROUP`.
     * 
     */
    @InputImport(name="queryScope")
      private final @Nullable Input<String> queryScope;

    public Input<String> getQueryScope() {
        return this.queryScope == null ? Input.empty() : this.queryScope;
    }

    public IndexState(
        @Nullable Input<String> collection,
        @Nullable Input<String> database,
        @Nullable Input<List<IndexFieldGetArgs>> fields,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> queryScope) {
        this.collection = collection;
        this.database = database;
        this.fields = fields;
        this.name = name;
        this.project = project;
        this.queryScope = queryScope;
    }

    private IndexState() {
        this.collection = Input.empty();
        this.database = Input.empty();
        this.fields = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.queryScope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> collection;
        private @Nullable Input<String> database;
        private @Nullable Input<List<IndexFieldGetArgs>> fields;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> queryScope;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.collection = defaults.collection;
    	      this.database = defaults.database;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.queryScope = defaults.queryScope;
        }

        public Builder collection(@Nullable Input<String> collection) {
            this.collection = collection;
            return this;
        }

        public Builder collection(@Nullable String collection) {
            this.collection = Input.ofNullable(collection);
            return this;
        }

        public Builder database(@Nullable Input<String> database) {
            this.database = database;
            return this;
        }

        public Builder database(@Nullable String database) {
            this.database = Input.ofNullable(database);
            return this;
        }

        public Builder fields(@Nullable Input<List<IndexFieldGetArgs>> fields) {
            this.fields = fields;
            return this;
        }

        public Builder fields(@Nullable List<IndexFieldGetArgs> fields) {
            this.fields = Input.ofNullable(fields);
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

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder queryScope(@Nullable Input<String> queryScope) {
            this.queryScope = queryScope;
            return this;
        }

        public Builder queryScope(@Nullable String queryScope) {
            this.queryScope = Input.ofNullable(queryScope);
            return this;
        }
        public IndexState build() {
            return new IndexState(collection, database, fields, name, project, queryScope);
        }
    }
}
