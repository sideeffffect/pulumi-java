// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.TableEncryptionConfigurationArgs;
import com.pulumi.gcp.bigquery.inputs.TableExternalDataConfigurationArgs;
import com.pulumi.gcp.bigquery.inputs.TableMaterializedViewArgs;
import com.pulumi.gcp.bigquery.inputs.TableRangePartitioningArgs;
import com.pulumi.gcp.bigquery.inputs.TableTimePartitioningArgs;
import com.pulumi.gcp.bigquery.inputs.TableViewArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableArgs extends ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * Specifies column names to use for data clustering.
     * Up to four top-level columns are allowed, and should be specified in
     * descending priority order.
     * 
     */
    @Import(name="clusterings")
    private @Nullable Output<List<String>> clusterings;

    /**
     * @return Specifies column names to use for data clustering.
     * Up to four top-level columns are allowed, and should be specified in
     * descending priority order.
     * 
     */
    public Optional<Output<List<String>>> clusterings() {
        return Optional.ofNullable(this.clusterings);
    }

    /**
     * The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    /**
     * @return The dataset ID to create the table in.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }

    /**
     * Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `=destroy` or `=update` that would delete the instance will fail.
     * 
     */
    @Import(name="deletionProtection")
    private @Nullable Output<Boolean> deletionProtection;

    /**
     * @return Whether or not to allow the provider to destroy the instance. Unless this field is set to false
     * in state, a `=destroy` or `=update` that would delete the instance will fail.
     * 
     */
    public Optional<Output<Boolean>> deletionProtection() {
        return Optional.ofNullable(this.deletionProtection);
    }

    /**
     * The field description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The field description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * 
     */
    @Import(name="encryptionConfiguration")
    private @Nullable Output<TableEncryptionConfigurationArgs> encryptionConfiguration;

    /**
     * @return Specifies how the table should be encrypted.
     * If left blank, the table will be encrypted with a Google-managed key; that process
     * is transparent to the user.  Structure is documented below.
     * 
     */
    public Optional<Output<TableEncryptionConfigurationArgs>> encryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }

    /**
     * The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     * 
     */
    @Import(name="expirationTime")
    private @Nullable Output<Integer> expirationTime;

    /**
     * @return The time when this table expires, in
     * milliseconds since the epoch. If not present, the table will persist
     * indefinitely. Expired tables will be deleted and their storage
     * reclaimed.
     * 
     */
    public Optional<Output<Integer>> expirationTime() {
        return Optional.ofNullable(this.expirationTime);
    }

    /**
     * Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * 
     */
    @Import(name="externalDataConfiguration")
    private @Nullable Output<TableExternalDataConfigurationArgs> externalDataConfiguration;

    /**
     * @return Describes the data format,
     * location, and other properties of a table stored outside of BigQuery.
     * By defining these properties, the data source can then be queried as
     * if it were a standard BigQuery table. Structure is documented below.
     * 
     */
    public Optional<Output<TableExternalDataConfigurationArgs>> externalDataConfiguration() {
        return Optional.ofNullable(this.externalDataConfiguration);
    }

    /**
     * A descriptive name for the table.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable Output<String> friendlyName;

    /**
     * @return A descriptive name for the table.
     * 
     */
    public Optional<Output<String>> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * A mapping of labels to assign to the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return A mapping of labels to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * If specified, configures this table as a materialized view.
     * Structure is documented below.
     * 
     */
    @Import(name="materializedView")
    private @Nullable Output<TableMaterializedViewArgs> materializedView;

    /**
     * @return If specified, configures this table as a materialized view.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TableMaterializedViewArgs>> materializedView() {
        return Optional.ofNullable(this.materializedView);
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @Import(name="rangePartitioning")
    private @Nullable Output<TableRangePartitioningArgs> rangePartitioning;

    /**
     * @return If specified, configures range-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    public Optional<Output<TableRangePartitioningArgs>> rangePartitioning() {
        return Optional.ofNullable(this.rangePartitioning);
    }

    /**
     * A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~&gt;**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn&#39;t changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return A JSON schema for the external table. Schema is required
     * for CSV and JSON formats if autodetect is not on. Schema is disallowed
     * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
     * ~&gt;**NOTE:** Because this field expects a JSON string, any changes to the
     * string will create a diff, even if the JSON itself hasn&#39;t changed.
     * Furthermore drift for this field cannot not be detected because BigQuery
     * only uses this schema to compute the effective schema for the table, therefore
     * any changes on the configured value will force the table to be recreated.
     * This schema is effectively only applied when creating a table from an external
     * datasource, after creation the computed schema will be stored in
     * `google_bigquery_table.schema`
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * A unique ID for the resource.
     * Changing this forces a new resource to be created.
     * 
     */
    @Import(name="tableId", required=true)
    private Output<String> tableId;

    /**
     * @return A unique ID for the resource.
     * Changing this forces a new resource to be created.
     * 
     */
    public Output<String> tableId() {
        return this.tableId;
    }

    /**
     * If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    @Import(name="timePartitioning")
    private @Nullable Output<TableTimePartitioningArgs> timePartitioning;

    /**
     * @return If specified, configures time-based
     * partitioning for this table. Structure is documented below.
     * 
     */
    public Optional<Output<TableTimePartitioningArgs>> timePartitioning() {
        return Optional.ofNullable(this.timePartitioning);
    }

    /**
     * If specified, configures this table as a view.
     * Structure is documented below.
     * 
     */
    @Import(name="view")
    private @Nullable Output<TableViewArgs> view;

    /**
     * @return If specified, configures this table as a view.
     * Structure is documented below.
     * 
     */
    public Optional<Output<TableViewArgs>> view() {
        return Optional.ofNullable(this.view);
    }

    private TableArgs() {}

    private TableArgs(TableArgs $) {
        this.clusterings = $.clusterings;
        this.datasetId = $.datasetId;
        this.deletionProtection = $.deletionProtection;
        this.description = $.description;
        this.encryptionConfiguration = $.encryptionConfiguration;
        this.expirationTime = $.expirationTime;
        this.externalDataConfiguration = $.externalDataConfiguration;
        this.friendlyName = $.friendlyName;
        this.labels = $.labels;
        this.materializedView = $.materializedView;
        this.project = $.project;
        this.rangePartitioning = $.rangePartitioning;
        this.schema = $.schema;
        this.tableId = $.tableId;
        this.timePartitioning = $.timePartitioning;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableArgs $;

        public Builder() {
            $ = new TableArgs();
        }

        public Builder(TableArgs defaults) {
            $ = new TableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterings Specifies column names to use for data clustering.
         * Up to four top-level columns are allowed, and should be specified in
         * descending priority order.
         * 
         * @return builder
         * 
         */
        public Builder clusterings(@Nullable Output<List<String>> clusterings) {
            $.clusterings = clusterings;
            return this;
        }

        /**
         * @param clusterings Specifies column names to use for data clustering.
         * Up to four top-level columns are allowed, and should be specified in
         * descending priority order.
         * 
         * @return builder
         * 
         */
        public Builder clusterings(List<String> clusterings) {
            return clusterings(Output.of(clusterings));
        }

        /**
         * @param clusterings Specifies column names to use for data clustering.
         * Up to four top-level columns are allowed, and should be specified in
         * descending priority order.
         * 
         * @return builder
         * 
         */
        public Builder clusterings(String... clusterings) {
            return clusterings(List.of(clusterings));
        }

        /**
         * @param datasetId The dataset ID to create the table in.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        /**
         * @param datasetId The dataset ID to create the table in.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        /**
         * @param deletionProtection Whether or not to allow the provider to destroy the instance. Unless this field is set to false
         * in state, a `=destroy` or `=update` that would delete the instance will fail.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(@Nullable Output<Boolean> deletionProtection) {
            $.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * @param deletionProtection Whether or not to allow the provider to destroy the instance. Unless this field is set to false
         * in state, a `=destroy` or `=update` that would delete the instance will fail.
         * 
         * @return builder
         * 
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            return deletionProtection(Output.of(deletionProtection));
        }

        /**
         * @param description The field description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The field description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param encryptionConfiguration Specifies how the table should be encrypted.
         * If left blank, the table will be encrypted with a Google-managed key; that process
         * is transparent to the user.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfiguration(@Nullable Output<TableEncryptionConfigurationArgs> encryptionConfiguration) {
            $.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        /**
         * @param encryptionConfiguration Specifies how the table should be encrypted.
         * If left blank, the table will be encrypted with a Google-managed key; that process
         * is transparent to the user.  Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfiguration(TableEncryptionConfigurationArgs encryptionConfiguration) {
            return encryptionConfiguration(Output.of(encryptionConfiguration));
        }

        /**
         * @param expirationTime The time when this table expires, in
         * milliseconds since the epoch. If not present, the table will persist
         * indefinitely. Expired tables will be deleted and their storage
         * reclaimed.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(@Nullable Output<Integer> expirationTime) {
            $.expirationTime = expirationTime;
            return this;
        }

        /**
         * @param expirationTime The time when this table expires, in
         * milliseconds since the epoch. If not present, the table will persist
         * indefinitely. Expired tables will be deleted and their storage
         * reclaimed.
         * 
         * @return builder
         * 
         */
        public Builder expirationTime(Integer expirationTime) {
            return expirationTime(Output.of(expirationTime));
        }

        /**
         * @param externalDataConfiguration Describes the data format,
         * location, and other properties of a table stored outside of BigQuery.
         * By defining these properties, the data source can then be queried as
         * if it were a standard BigQuery table. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalDataConfiguration(@Nullable Output<TableExternalDataConfigurationArgs> externalDataConfiguration) {
            $.externalDataConfiguration = externalDataConfiguration;
            return this;
        }

        /**
         * @param externalDataConfiguration Describes the data format,
         * location, and other properties of a table stored outside of BigQuery.
         * By defining these properties, the data source can then be queried as
         * if it were a standard BigQuery table. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder externalDataConfiguration(TableExternalDataConfigurationArgs externalDataConfiguration) {
            return externalDataConfiguration(Output.of(externalDataConfiguration));
        }

        /**
         * @param friendlyName A descriptive name for the table.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param friendlyName A descriptive name for the table.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(String friendlyName) {
            return friendlyName(Output.of(friendlyName));
        }

        /**
         * @param labels A mapping of labels to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A mapping of labels to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param materializedView If specified, configures this table as a materialized view.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder materializedView(@Nullable Output<TableMaterializedViewArgs> materializedView) {
            $.materializedView = materializedView;
            return this;
        }

        /**
         * @param materializedView If specified, configures this table as a materialized view.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder materializedView(TableMaterializedViewArgs materializedView) {
            return materializedView(Output.of(materializedView));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rangePartitioning If specified, configures range-based
         * partitioning for this table. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rangePartitioning(@Nullable Output<TableRangePartitioningArgs> rangePartitioning) {
            $.rangePartitioning = rangePartitioning;
            return this;
        }

        /**
         * @param rangePartitioning If specified, configures range-based
         * partitioning for this table. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rangePartitioning(TableRangePartitioningArgs rangePartitioning) {
            return rangePartitioning(Output.of(rangePartitioning));
        }

        /**
         * @param schema A JSON schema for the external table. Schema is required
         * for CSV and JSON formats if autodetect is not on. Schema is disallowed
         * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
         * ~&gt;**NOTE:** Because this field expects a JSON string, any changes to the
         * string will create a diff, even if the JSON itself hasn&#39;t changed.
         * Furthermore drift for this field cannot not be detected because BigQuery
         * only uses this schema to compute the effective schema for the table, therefore
         * any changes on the configured value will force the table to be recreated.
         * This schema is effectively only applied when creating a table from an external
         * datasource, after creation the computed schema will be stored in
         * `google_bigquery_table.schema`
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema A JSON schema for the external table. Schema is required
         * for CSV and JSON formats if autodetect is not on. Schema is disallowed
         * for Google Cloud Bigtable, Cloud Datastore backups, Avro, ORC and Parquet formats.
         * ~&gt;**NOTE:** Because this field expects a JSON string, any changes to the
         * string will create a diff, even if the JSON itself hasn&#39;t changed.
         * Furthermore drift for this field cannot not be detected because BigQuery
         * only uses this schema to compute the effective schema for the table, therefore
         * any changes on the configured value will force the table to be recreated.
         * This schema is effectively only applied when creating a table from an external
         * datasource, after creation the computed schema will be stored in
         * `google_bigquery_table.schema`
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param tableId A unique ID for the resource.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tableId(Output<String> tableId) {
            $.tableId = tableId;
            return this;
        }

        /**
         * @param tableId A unique ID for the resource.
         * Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder tableId(String tableId) {
            return tableId(Output.of(tableId));
        }

        /**
         * @param timePartitioning If specified, configures time-based
         * partitioning for this table. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timePartitioning(@Nullable Output<TableTimePartitioningArgs> timePartitioning) {
            $.timePartitioning = timePartitioning;
            return this;
        }

        /**
         * @param timePartitioning If specified, configures time-based
         * partitioning for this table. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timePartitioning(TableTimePartitioningArgs timePartitioning) {
            return timePartitioning(Output.of(timePartitioning));
        }

        /**
         * @param view If specified, configures this table as a view.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder view(@Nullable Output<TableViewArgs> view) {
            $.view = view;
            return this;
        }

        /**
         * @param view If specified, configures this table as a view.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder view(TableViewArgs view) {
            return view(Output.of(view));
        }

        public TableArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
