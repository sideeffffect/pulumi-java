// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AmazonS3CompatibleReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AmazonS3ReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobFSReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureBlobStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureDataLakeStoreReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureFileStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.FileServerReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.FtpReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.GoogleCloudStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.HdfsReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.HttpReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.OracleCloudStorageReadSettingsArgs;
import com.pulumi.azurenative.datafactory.inputs.SftpReadSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Parquet source.
 * 
 */
public final class ParquetSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ParquetSourceArgs Empty = new ParquetSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Output<Object> additionalColumns;

    public Optional<Output<Object>> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Output<Object> sourceRetryCount;

    public Optional<Output<Object>> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Output<Object> sourceRetryWait;

    public Optional<Output<Object>> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Parquet store settings.
     * 
     */
    @Import(name="storeSettings")
    private @Nullable Output<Object> storeSettings;

    public Optional<Output<Object>> storeSettings() {
        return Optional.ofNullable(this.storeSettings);
    }

    /**
     * Copy source type.
     * Expected value is &#39;ParquetSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private ParquetSourceArgs() {}

    private ParquetSourceArgs(ParquetSourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.storeSettings = $.storeSettings;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ParquetSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ParquetSourceArgs $;

        public Builder() {
            $ = new ParquetSourceArgs();
        }

        public Builder(ParquetSourceArgs defaults) {
            $ = new ParquetSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        public Builder additionalColumns(Object additionalColumns) {
            return additionalColumns(Output.of(additionalColumns));
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        public Builder sourceRetryCount(Object sourceRetryCount) {
            return sourceRetryCount(Output.of(sourceRetryCount));
        }

        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        public Builder sourceRetryWait(Object sourceRetryWait) {
            return sourceRetryWait(Output.of(sourceRetryWait));
        }

        public Builder storeSettings(@Nullable Output<Object> storeSettings) {
            $.storeSettings = storeSettings;
            return this;
        }

        public Builder storeSettings(Object storeSettings) {
            return storeSettings(Output.of(storeSettings));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ParquetSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
