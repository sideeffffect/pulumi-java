// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A copy activity Azure CosmosDB (SQL API) Collection source.
 * 
 */
public final class CosmosDbSqlApiSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final CosmosDbSqlApiSourceArgs Empty = new CosmosDbSqlApiSourceArgs();

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
     * Whether detect primitive values as datetime values. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @InputImport(name="detectDatetime")
      private final @Nullable Input<Object> detectDatetime;

    public Input<Object> getDetectDatetime() {
        return this.detectDatetime == null ? Input.empty() : this.detectDatetime;
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
     * Page size of the result. Type: integer (or Expression with resultType integer).
     * 
     */
    @InputImport(name="pageSize")
      private final @Nullable Input<Object> pageSize;

    public Input<Object> getPageSize() {
        return this.pageSize == null ? Input.empty() : this.pageSize;
    }

    /**
     * Preferred regions. Type: array of strings (or Expression with resultType array of strings).
     * 
     */
    @InputImport(name="preferredRegions")
      private final @Nullable Input<Object> preferredRegions;

    public Input<Object> getPreferredRegions() {
        return this.preferredRegions == null ? Input.empty() : this.preferredRegions;
    }

    /**
     * SQL API query. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="query")
      private final @Nullable Input<Object> query;

    public Input<Object> getQuery() {
        return this.query == null ? Input.empty() : this.query;
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
     * Expected value is 'CosmosDbSqlApiSource'.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public CosmosDbSqlApiSourceArgs(
        @Nullable Input<Object> additionalColumns,
        @Nullable Input<Object> detectDatetime,
        @Nullable Input<Object> disableMetricsCollection,
        @Nullable Input<Object> maxConcurrentConnections,
        @Nullable Input<Object> pageSize,
        @Nullable Input<Object> preferredRegions,
        @Nullable Input<Object> query,
        @Nullable Input<Object> sourceRetryCount,
        @Nullable Input<Object> sourceRetryWait,
        Input<String> type) {
        this.additionalColumns = additionalColumns;
        this.detectDatetime = detectDatetime;
        this.disableMetricsCollection = disableMetricsCollection;
        this.maxConcurrentConnections = maxConcurrentConnections;
        this.pageSize = pageSize;
        this.preferredRegions = preferredRegions;
        this.query = query;
        this.sourceRetryCount = sourceRetryCount;
        this.sourceRetryWait = sourceRetryWait;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CosmosDbSqlApiSourceArgs() {
        this.additionalColumns = Input.empty();
        this.detectDatetime = Input.empty();
        this.disableMetricsCollection = Input.empty();
        this.maxConcurrentConnections = Input.empty();
        this.pageSize = Input.empty();
        this.preferredRegions = Input.empty();
        this.query = Input.empty();
        this.sourceRetryCount = Input.empty();
        this.sourceRetryWait = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CosmosDbSqlApiSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> additionalColumns;
        private @Nullable Input<Object> detectDatetime;
        private @Nullable Input<Object> disableMetricsCollection;
        private @Nullable Input<Object> maxConcurrentConnections;
        private @Nullable Input<Object> pageSize;
        private @Nullable Input<Object> preferredRegions;
        private @Nullable Input<Object> query;
        private @Nullable Input<Object> sourceRetryCount;
        private @Nullable Input<Object> sourceRetryWait;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CosmosDbSqlApiSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalColumns = defaults.additionalColumns;
    	      this.detectDatetime = defaults.detectDatetime;
    	      this.disableMetricsCollection = defaults.disableMetricsCollection;
    	      this.maxConcurrentConnections = defaults.maxConcurrentConnections;
    	      this.pageSize = defaults.pageSize;
    	      this.preferredRegions = defaults.preferredRegions;
    	      this.query = defaults.query;
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

        public Builder detectDatetime(@Nullable Input<Object> detectDatetime) {
            this.detectDatetime = detectDatetime;
            return this;
        }

        public Builder detectDatetime(@Nullable Object detectDatetime) {
            this.detectDatetime = Input.ofNullable(detectDatetime);
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

        public Builder pageSize(@Nullable Input<Object> pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(@Nullable Object pageSize) {
            this.pageSize = Input.ofNullable(pageSize);
            return this;
        }

        public Builder preferredRegions(@Nullable Input<Object> preferredRegions) {
            this.preferredRegions = preferredRegions;
            return this;
        }

        public Builder preferredRegions(@Nullable Object preferredRegions) {
            this.preferredRegions = Input.ofNullable(preferredRegions);
            return this;
        }

        public Builder query(@Nullable Input<Object> query) {
            this.query = query;
            return this;
        }

        public Builder query(@Nullable Object query) {
            this.query = Input.ofNullable(query);
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
        public CosmosDbSqlApiSourceArgs build() {
            return new CosmosDbSqlApiSourceArgs(additionalColumns, detectDatetime, disableMetricsCollection, maxConcurrentConnections, pageSize, preferredRegions, query, sourceRetryCount, sourceRetryWait, type);
        }
    }
}
