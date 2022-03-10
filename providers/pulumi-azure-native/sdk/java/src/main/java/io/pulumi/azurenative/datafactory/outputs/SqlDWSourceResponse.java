// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.SqlPartitionSettingsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlDWSourceResponse {
    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    private final @Nullable Object additionalColumns;
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object disableMetricsCollection;
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object maxConcurrentConnections;
    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
     */
    private final @Nullable Object partitionOption;
    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
     */
    private final @Nullable SqlPartitionSettingsResponse partitionSettings;
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object queryTimeout;
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object sourceRetryCount;
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object sourceRetryWait;
    /**
     * SQL Data Warehouse reader query. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sqlReaderQuery;
    /**
     * Name of the stored procedure for a SQL Data Warehouse source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object sqlReaderStoredProcedureName;
    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}". Type: object (or Expression with resultType object), itemType: StoredProcedureParameter.
     * 
     */
    private final @Nullable Object storedProcedureParameters;
    /**
     * Copy source type.
     * Expected value is 'SqlDWSource'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor
    private SqlDWSourceResponse(
        @OutputCustomType.Parameter("additionalColumns") @Nullable Object additionalColumns,
        @OutputCustomType.Parameter("disableMetricsCollection") @Nullable Object disableMetricsCollection,
        @OutputCustomType.Parameter("maxConcurrentConnections") @Nullable Object maxConcurrentConnections,
        @OutputCustomType.Parameter("partitionOption") @Nullable Object partitionOption,
        @OutputCustomType.Parameter("partitionSettings") @Nullable SqlPartitionSettingsResponse partitionSettings,
        @OutputCustomType.Parameter("queryTimeout") @Nullable Object queryTimeout,
        @OutputCustomType.Parameter("sourceRetryCount") @Nullable Object sourceRetryCount,
        @OutputCustomType.Parameter("sourceRetryWait") @Nullable Object sourceRetryWait,
        @OutputCustomType.Parameter("sqlReaderQuery") @Nullable Object sqlReaderQuery,
        @OutputCustomType.Parameter("sqlReaderStoredProcedureName") @Nullable Object sqlReaderStoredProcedureName,
        @OutputCustomType.Parameter("storedProcedureParameters") @Nullable Object storedProcedureParameters,
        @OutputCustomType.Parameter("type") String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.sqlReaderQuery = sqlReaderQuery;
        this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
        this.storedProcedureParameters = storedProcedureParameters;
        this.type = type;
    }

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
    */
    public Optional<Object> getAdditionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }
    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
    */
    public Optional<Object> getDisableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }
    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getMaxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }
    /**
     * The partition mechanism that will be used for Sql read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "DynamicRange".
     * 
    */
    public Optional<Object> getPartitionOption() {
        return Optional.ofNullable(this.partitionOption);
    }
    /**
     * The settings that will be leveraged for Sql source partitioning.
     * 
    */
    public Optional<SqlPartitionSettingsResponse> getPartitionSettings() {
        return Optional.ofNullable(this.partitionSettings);
    }
    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getQueryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }
    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
    */
    public Optional<Object> getSourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }
    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> getSourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }
    /**
     * SQL Data Warehouse reader query. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSqlReaderQuery() {
        return Optional.ofNullable(this.sqlReaderQuery);
    }
    /**
     * Name of the stored procedure for a SQL Data Warehouse source. This cannot be used at the same time as SqlReaderQuery. Type: string (or Expression with resultType string).
     * 
    */
    public Optional<Object> getSqlReaderStoredProcedureName() {
        return Optional.ofNullable(this.sqlReaderStoredProcedureName);
    }
    /**
     * Value and type setting for stored procedure parameters. Example: "{Parameter1: {value: "1", type: "int"}}". Type: object (or Expression with resultType object), itemType: StoredProcedureParameter.
     * 
    */
    public Optional<Object> getStoredProcedureParameters() {
        return Optional.ofNullable(this.storedProcedureParameters);
    }
    /**
     * Copy source type.
     * Expected value is 'SqlDWSource'.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlDWSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object partitionOption;
        private @Nullable SqlPartitionSettingsResponse partitionSettings;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private @Nullable Object sqlReaderQuery;
        private @Nullable Object sqlReaderStoredProcedureName;
        private @Nullable Object storedProcedureParameters;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlDWSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.sqlReaderQuery = defaults.sqlReaderQuery;
    	      this.sqlReaderStoredProcedureName = defaults.sqlReaderStoredProcedureName;
    	      this.storedProcedureParameters = defaults.storedProcedureParameters;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder partitionOption(@Nullable Object partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }

        public Builder partitionSettings(@Nullable SqlPartitionSettingsResponse partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }

        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder sqlReaderQuery(@Nullable Object sqlReaderQuery) {
            this.sqlReaderQuery = sqlReaderQuery;
            return this;
        }

        public Builder sqlReaderStoredProcedureName(@Nullable Object sqlReaderStoredProcedureName) {
            this.sqlReaderStoredProcedureName = sqlReaderStoredProcedureName;
            return this;
        }

        public Builder storedProcedureParameters(@Nullable Object storedProcedureParameters) {
            this.storedProcedureParameters = storedProcedureParameters;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SqlDWSourceResponse build() {
            return new SqlDWSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, queryTimeout, sourceRetryCount, sourceRetryWait, sqlReaderQuery, sqlReaderStoredProcedureName, storedProcedureParameters, type);
        }
    }
}
