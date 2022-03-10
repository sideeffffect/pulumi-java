// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SapHanaPartitionSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity source for SAP HANA source.
 * 
 */
public final class SapHanaSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SapHanaSourceResponse Empty = new SapHanaSourceResponse();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @InputImport(name="additionalColumns")
      private final @Nullable Object additionalColumns;

    public Optional<Object> getAdditionalColumns() {
        return this.additionalColumns == null ? Optional.empty() : Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="disableMetricsCollection")
      private final @Nullable Object disableMetricsCollection;

    public Optional<Object> getDisableMetricsCollection() {
        return this.disableMetricsCollection == null ? Optional.empty() : Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="maxConcurrentConnections")
      private final @Nullable Object maxConcurrentConnections;

    public Optional<Object> getMaxConcurrentConnections() {
        return this.maxConcurrentConnections == null ? Optional.empty() : Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The packet size of data read from SAP HANA. Type: integer(or Expression with resultType integer).
     * 
     */
    @InputImport(name="packetSize")
      private final @Nullable Object packetSize;

    public Optional<Object> getPacketSize() {
        return this.packetSize == null ? Optional.empty() : Optional.ofNullable(this.packetSize);
    }

    /**
     * The partition mechanism that will be used for SAP HANA read in parallel. Possible values include: "None", "PhysicalPartitionsOfTable", "SapHanaDynamicRange".
     * 
     */
    @InputImport(name="partitionOption")
      private final @Nullable Object partitionOption;

    public Optional<Object> getPartitionOption() {
        return this.partitionOption == null ? Optional.empty() : Optional.ofNullable(this.partitionOption);
    }

    /**
     * The settings that will be leveraged for SAP HANA source partitioning.
     * 
     */
    @InputImport(name="partitionSettings")
      private final @Nullable SapHanaPartitionSettingsResponse partitionSettings;

    public Optional<SapHanaPartitionSettingsResponse> getPartitionSettings() {
        return this.partitionSettings == null ? Optional.empty() : Optional.ofNullable(this.partitionSettings);
    }

    /**
     * SAP HANA Sql query. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="query")
      private final @Nullable Object query;

    public Optional<Object> getQuery() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
    }

    /**
     * Query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="queryTimeout")
      private final @Nullable Object queryTimeout;

    public Optional<Object> getQueryTimeout() {
        return this.queryTimeout == null ? Optional.empty() : Optional.ofNullable(this.queryTimeout);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="sourceRetryCount")
      private final @Nullable Object sourceRetryCount;

    public Optional<Object> getSourceRetryCount() {
        return this.sourceRetryCount == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @InputImport(name="sourceRetryWait")
      private final @Nullable Object sourceRetryWait;

    public Optional<Object> getSourceRetryWait() {
        return this.sourceRetryWait == null ? Optional.empty() : Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is 'SapHanaSource'.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public SapHanaSourceResponse(
        @Nullable Object additionalColumns,
        @Nullable Object disableMetricsCollection,
        @Nullable Object maxConcurrentConnections,
        @Nullable Object packetSize,
        @Nullable Object partitionOption,
        @Nullable SapHanaPartitionSettingsResponse partitionSettings,
        @Nullable Object query,
        @Nullable Object queryTimeout,
        @Nullable Object sourceRetryCount,
        @Nullable Object sourceRetryWait,
        String type) {
        this.additionalColumns = additionalColumns;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.packetSize = packetSize;
        this.partitionOption = partitionOption;
        this.partitionSettings = partitionSettings;
        this.query = query;
        this.queryTimeout = queryTimeout;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SapHanaSourceResponse() {
        this.additionalColumns = null;
        this.disableMetricsCollection = null;
        this.maxConcurrentConnections = null;
        this.packetSize = null;
        this.partitionOption = null;
        this.partitionSettings = null;
        this.query = null;
        this.queryTimeout = null;
        this.sourceRetryCount = null;
        this.sourceRetryWait = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SapHanaSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object additionalColumns;
        private @Nullable Object disableMetricsCollection;
        private @Nullable Object maxConcurrentConnections;
        private @Nullable Object packetSize;
        private @Nullable Object partitionOption;
        private @Nullable SapHanaPartitionSettingsResponse partitionSettings;
        private @Nullable Object query;
        private @Nullable Object queryTimeout;
        private @Nullable Object sourceRetryCount;
        private @Nullable Object sourceRetryWait;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SapHanaSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.packetSize = defaults.packetSize;
    	      this.partitionOption = defaults.partitionOption;
    	      this.partitionSettings = defaults.partitionSettings;
    	      this.query = defaults.query;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.sourceRetryCount = defaults.sourceRetryCount;
    	      this.sourceRetryWait = defaults.sourceRetryWait;
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

        public Builder packetSize(@Nullable Object packetSize) {
            this.packetSize = packetSize;
            return this;
        }

        public Builder partitionOption(@Nullable Object partitionOption) {
            this.partitionOption = partitionOption;
            return this;
        }

        public Builder partitionSettings(@Nullable SapHanaPartitionSettingsResponse partitionSettings) {
            this.partitionSettings = partitionSettings;
            return this;
        }

        public Builder query(@Nullable Object query) {
            this.query = query;
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

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public SapHanaSourceResponse build() {
            return new SapHanaSourceResponse(additionalColumns, disableMetricsCollection, maxConcurrentConnections, packetSize, partitionOption, partitionSettings, query, queryTimeout, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
