// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AzureDatabricksDeltaLakeExportCommandResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Databricks Delta Lake source.
 * 
 */
public final class AzureDatabricksDeltaLakeSourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureDatabricksDeltaLakeSourceResponse Empty = new AzureDatabricksDeltaLakeSourceResponse();

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Object disableMetricsCollection;

    public Optional<Object> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * Azure Databricks Delta Lake export settings.
     * 
     */
    @Import(name="exportSettings")
    private @Nullable AzureDatabricksDeltaLakeExportCommandResponse exportSettings;

    public Optional<AzureDatabricksDeltaLakeExportCommandResponse> exportSettings() {
        return Optional.ofNullable(this.exportSettings);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="query")
    private @Nullable Object query;

    public Optional<Object> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Object sourceRetryCount;

    public Optional<Object> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Object sourceRetryWait;

    public Optional<Object> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is &#39;AzureDatabricksDeltaLakeSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private AzureDatabricksDeltaLakeSourceResponse() {}

    private AzureDatabricksDeltaLakeSourceResponse(AzureDatabricksDeltaLakeSourceResponse $) {
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.exportSettings = $.exportSettings;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.query = $.query;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureDatabricksDeltaLakeSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureDatabricksDeltaLakeSourceResponse $;

        public Builder() {
            $ = new AzureDatabricksDeltaLakeSourceResponse();
        }

        public Builder(AzureDatabricksDeltaLakeSourceResponse defaults) {
            $ = new AzureDatabricksDeltaLakeSourceResponse(Objects.requireNonNull(defaults));
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder exportSettings(@Nullable AzureDatabricksDeltaLakeExportCommandResponse exportSettings) {
            $.exportSettings = exportSettings;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder query(@Nullable Object query) {
            $.query = query;
            return this;
        }

        public Builder sourceRetryCount(@Nullable Object sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryWait(@Nullable Object sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public AzureDatabricksDeltaLakeSourceResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
