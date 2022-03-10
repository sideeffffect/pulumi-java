// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MLTransformInputRecordTableGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MLTransformInputRecordTableGetArgs Empty = new MLTransformInputRecordTableGetArgs();

    /**
     * A unique identifier for the AWS Glue Data Catalog.
     * 
     */
    @InputImport(name="catalogId")
      private final @Nullable Input<String> catalogId;

    public Input<String> getCatalogId() {
        return this.catalogId == null ? Input.empty() : this.catalogId;
    }

    /**
     * The name of the connection to the AWS Glue Data Catalog.
     * 
     */
    @InputImport(name="connectionName")
      private final @Nullable Input<String> connectionName;

    public Input<String> getConnectionName() {
        return this.connectionName == null ? Input.empty() : this.connectionName;
    }

    /**
     * A database name in the AWS Glue Data Catalog.
     * 
     */
    @InputImport(name="databaseName", required=true)
      private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * A table name in the AWS Glue Data Catalog.
     * 
     */
    @InputImport(name="tableName", required=true)
      private final Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName;
    }

    public MLTransformInputRecordTableGetArgs(
        @Nullable Input<String> catalogId,
        @Nullable Input<String> connectionName,
        Input<String> databaseName,
        Input<String> tableName) {
        this.catalogId = catalogId;
        this.connectionName = connectionName;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private MLTransformInputRecordTableGetArgs() {
        this.catalogId = Input.empty();
        this.connectionName = Input.empty();
        this.databaseName = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MLTransformInputRecordTableGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> catalogId;
        private @Nullable Input<String> connectionName;
        private Input<String> databaseName;
        private Input<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(MLTransformInputRecordTableGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.connectionName = defaults.connectionName;
    	      this.databaseName = defaults.databaseName;
    	      this.tableName = defaults.tableName;
        }

        public Builder catalogId(@Nullable Input<String> catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(@Nullable String catalogId) {
            this.catalogId = Input.ofNullable(catalogId);
            return this;
        }

        public Builder connectionName(@Nullable Input<String> connectionName) {
            this.connectionName = connectionName;
            return this;
        }

        public Builder connectionName(@Nullable String connectionName) {
            this.connectionName = Input.ofNullable(connectionName);
            return this;
        }

        public Builder databaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder tableName(Input<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Input.of(Objects.requireNonNull(tableName));
            return this;
        }
        public MLTransformInputRecordTableGetArgs build() {
            return new MLTransformInputRecordTableGetArgs(catalogId, connectionName, databaseName, tableName);
        }
    }
}
