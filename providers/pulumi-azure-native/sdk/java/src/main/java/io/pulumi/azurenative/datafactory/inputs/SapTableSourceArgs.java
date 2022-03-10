// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SapTablePartitionSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity source for SAP Table source.
 * 
 */
public final class SapTableSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SapTableSourceArgs Empty = new SapTableSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
      private final @Nullable Input<Object> additionalColumns;

    public Input<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Input.empty() : this.additionalColumns;
    }

    /**
     * Specifies the maximum number of rows that will be retrieved at a time when retrieving data from SAP Table. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="batchSize")
      private final @Nullable Input<Object> batchSize;

    public Input<Object> getBatchSize() {
        return this.batchSize == null ? Input.empty() : this.batchSize;
    }

    /**
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="customRfcReadTableFunctionModule")
      private final @Nullable Input<Object> customRfcReadTableFunctionModule;

    public Input<Object> getCustomRfcReadTableFunctionModule() {
        return this.customRfcReadTableFunctionModule == null ? Input.empty() : this.customRfcReadTableFunctionModule;
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
      private final @Nullable Input<Object> disableMetricsCollection;

    public Input<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Input.empty() : this.disableMetricsCollection;
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
      private final @Nullable Input<Object> maxConcurrentConnections;

    public Input<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Input.empty() : this.maxConcurrentConnections;
    }

    /**
     * The partition mechanism that will be used for SAP table read in parallel. Possible values include: "None", "PartitionOnInt", "PartitionOnCalendarYear", "PartitionOnCalendarMonth", "PartitionOnCalendarDate", "PartitionOnTime".
     * 
     */
    @InputImport(name="partitionOption")
      private final @Nullable Input<Object> partitionOption;

    public Input<Object> getPartitionOption() {
        return this.partitionOption == null ? Input.empty() : this.partitionOption;
    }

    /**
     * The settings that will be leveraged for SAP table source partitioning.
     * 
     */
    @InputImport(name="partitionSettings")
      private final @Nullable Input<SapTablePartitionSettingsArgs> partitionSettings;

    public Input<SapTablePartitionSettingsArgs> getPartitionSettings() {
        return this.partitionSettings == null ? Input.empty() : this.partitionSettings;
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="queryTimeout")
      private final @Nullable Input<Object> queryTimeout;

    public Input<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Input.empty() : this.queryTimeout;
    }

    /**
     * The fields of the SAP table that will be retrieved. For example, column0, column1. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="rfcTableFields")
      private final @Nullable Input<Object> rfcTableFields;

    public Input<Object> getRfcTableFields() {
        return this.rfcTableFields == null ? Input.empty() : this.rfcTableFields;
    }

    /**
     * The options for the filtering of the SAP Table. For example, COLUMN0 EQ SOME VALUE. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="rfcTableOptions")
      private final @Nullable Input<Object> rfcTableOptions;

    public Input<Object> getRfcTableOptions() {
        return this.rfcTableOptions == null ? Input.empty() : this.rfcTableOptions;
    }

    /**
     * The number of rows to be retrieved. Type: integer(or Expression with resultType integer).
     * 
     */
    @InputImport(name="rowCount")
      private final @Nullable Input<Object> rowCount;

    public Input<Object> getRowCount() {
        return this.rowCount == null ? Input.empty() : this.rowCount;
    }

    /**
     * The number of rows that will be skipped. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="rowSkips")
      private final @Nullable Input<Object> rowSkips;

    public Input<Object> getRowSkips() {
        return this.rowSkips == null ? Input.empty() : this.rowSkips;
    }

    /**
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="sapDataColumnDelimiter")
      private final @Nullable Input<Object> sapDataColumnDelimiter;

    public Input<Object> getSapDataColumnDelimiter() {
        return this.sapDataColumnDelimiter == null ? Input.empty() : this.sapDataColumnDelimiter;
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
      private final @Nullable Input<Object> sourceRetryCount;

    public Input<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Input.empty() : this.sourceRetryCount;
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
      private final @Nullable Input<Object> sourceRetryWait;

    public Input<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Input.empty() : this.sourceRetryWait;
    }

    /**
     * Copy source type.
     * Expected value is 'SapTableSource'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public SapTableSourceArgs(
        @Nullable Input<Object> additionalColumns,
        @Nullable Input<Object> batchSize,
        @Nullable Input<Object> customRfcReadTableFunctionModule,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> partitionOption,
        @Nullable Input<SapTablePartitionSettingsArgs> partitionSettings,
        @Nullable Input<Object> queryTimeout,
        @Nullable Input<Object> rfcTableFields,
        @Nullable Input<Object> rfcTableOptions,
        @Nullable Input<Object> rowCount,
        @Nullable Input<Object> rowSkips,
        @Nullable Input<Object> sapDataColumnDelimiter,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        Input<String> type) {
        this.additionalColumns = additionalColumns;
        this.batchSize = batchSize;
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.queryTimeout = queryTimeout;
        this.rfcTableFields = rfcTableFields;
        this.rfcTableOptions = rfcTableOptions;
        this.rowCount = rowCount;
        this.rowSkips = rowSkips;
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapTableSourceArgs() {
        this.additionalColumns = Input.empty();
        this.batchSize = Input.empty();
        this.customRfcReadTableFunctionModule = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.partitionOption = Input.empty();
        this.partitionSettings = Input.empty();
        this.queryTimeout = Input.empty();
        this.rfcTableFields = Input.empty();
        this.rfcTableOptions = Input.empty();
        this.rowCount = Input.empty();
        this.rowSkips = Input.empty();
        this.sapDataColumnDelimiter = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapTableSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalColumns;
        private @Nullable Input<Object> batchSize;
        private @Nullable Input<Object> customRfcReadTableFunctionModule;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> partitionOption;
        private @Nullable Input<SapTablePartitionSettingsArgs> partitionSettings;
        private @Nullable Input<Object> queryTimeout;
        private @Nullable Input<Object> rfcTableFields;
        private @Nullable Input<Object> rfcTableOptions;
        private @Nullable Input<Object> rowCount;
        private @Nullable Input<Object> rowSkips;
        private @Nullable Input<Object> sapDataColumnDelimiter;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapTableSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.batchSize = defaults.batchSize;
    	      this.customRfcReadTableFunctionModule = defaults.customRfcReadTableFunctionModule;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.rfcTableFields = defaults.rfcTableFields;
    	      this.rfcTableOptions = defaults.rfcTableOptions;
    	      this.rowCount = defaults.rowCount;
    	      this.rowSkips = defaults.rowSkips;
    	      this.sapDataColumnDelimiter = defaults.sapDataColumnDelimiter;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
    	      this.type = defaults.type;
        }

        public Builder additionalColumns(@Nullable Input<Object> additionalColumns) {
            this.additionalColumns = additionalColumns;
            return this;
        }

        public Builder additionalColumns(@Nullable Object additionalColumns) {
            this.additionalColumns = Input.ofNullable(additionalColumns);
            return this;
        }

        public Builder batchSize(@Nullable Input<Object> batchSize) {
            this.batchSize = batchSize;
            return this;
        }

        public Builder batchSize(@Nullable Object batchSize) {
            this.batchSize = Input.ofNullable(batchSize);
            return this;
        }

        public Builder customRfcReadTableFunctionModule(@Nullable Input<Object> customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
            return this;
        }

        public Builder customRfcReadTableFunctionModule(@Nullable Object customRfcReadTableFunctionModule) {
            this.customRfcReadTableFunctionModule = Input.ofNullable(customRfcReadTableFunctionModule);
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Input<Object> disableMetricsCollection) {
            this.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            this.disableMetricsCollection = Input.ofNullable(disableMetricsCollection);
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Input<Object> maxConcurrentConnections) {
            this.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            this.maxConcurrentConnections = Input.ofNullable(maxConcurrentConnections);
            return this;
        }

        public Builder partitionOption(@Nullable Input<Object> partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }

        public Builder partitionOption(@Nullable Object partitionOption) {
            this.partitionOption = Input.ofNullable(partitionOption);
            return this;
        }

        public Builder partitionSettings(@Nullable Input<SapTablePartitionSettingsArgs> partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }

        public Builder partitionSettings(@Nullable SapTablePartitionSettingsArgs partitionSettings) {
            this.partitionSettings = Input.ofNullable(partitionSettings);
            return this;
        }

        public Builder queryTimeout(@Nullable Input<Object> queryTimeout) {
            this.queryTimeout = queryTimeout;
            return this;
        }

        public Builder queryTimeout(@Nullable Object queryTimeout) {
            this.queryTimeout = Input.ofNullable(queryTimeout);
            return this;
        }

        public Builder rfcTableFields(@Nullable Input<Object> rfcTableFields) {
            this.rfcTableFields = rfcTableFields;
            return this;
        }

        public Builder rfcTableFields(@Nullable Object rfcTableFields) {
            this.rfcTableFields = Input.ofNullable(rfcTableFields);
            return this;
        }

        public Builder rfcTableOptions(@Nullable Input<Object> rfcTableOptions) {
            this.rfcTableOptions = rfcTableOptions;
            return this;
        }

        public Builder rfcTableOptions(@Nullable Object rfcTableOptions) {
            this.rfcTableOptions = Input.ofNullable(rfcTableOptions);
            return this;
        }

        public Builder rowCount(@Nullable Input<Object> rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        public Builder rowCount(@Nullable Object rowCount) {
            this.rowCount = Input.ofNullable(rowCount);
            return this;
        }

        public Builder rowSkips(@Nullable Input<Object> rowSkips) {
            this.rowSkips = rowSkips;
            return this;
        }

        public Builder rowSkips(@Nullable Object rowSkips) {
            this.rowSkips = Input.ofNullable(rowSkips);
            return this;
        }

        public Builder sapDataColumnDelimiter(@Nullable Input<Object> sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = sapDataColumnDelimiter;
            return this;
        }

        public Builder sapDataColumnDelimiter(@Nullable Object sapDataColumnDelimiter) {
            this.sapDataColumnDelimiter = Input.ofNullable(sapDataColumnDelimiter);
            return this;
        }

        public Builder sourceRetryCount(@Nullable Input<Object> sourceRetryCount) {
            this.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            this.sourceRetryCount = Input.ofNullable(sourceRetryCount);
            return this;
        }

        public Builder sourceRetryWait(@Nullable Input<Object> sourceRetryWait) {
            this.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            this.sourceRetryWait = Input.ofNullable(sourceRetryWait);
            return this;
        }

        public Builder type(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public SapTableSourceArgs build() {
            return new SapTableSourceArgs(additionalColumns, batchSize, customRfcReadTableFunctionModule, disableMetricsCollection, maxConcurrentConnections, partitionOption, partitionSettings, queryTimeout, rfcTableFields, rfcTableOptions, rowCount, rowSkips, sapDataColumnDelimiter, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
