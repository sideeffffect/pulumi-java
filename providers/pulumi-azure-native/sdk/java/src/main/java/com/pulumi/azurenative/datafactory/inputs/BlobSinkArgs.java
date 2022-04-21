// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.MetadataItemArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Azure Blob sink.
 * 
 */
public final class BlobSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final BlobSinkArgs Empty = new BlobSinkArgs();

    /**
     * Blob writer add header. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="blobWriterAddHeader")
    private @Nullable Output<Object> blobWriterAddHeader;

    public Optional<Output<Object>> blobWriterAddHeader() {
        return Optional.ofNullable(this.blobWriterAddHeader);
    }

    /**
     * Blob writer date time format. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="blobWriterDateTimeFormat")
    private @Nullable Output<Object> blobWriterDateTimeFormat;

    public Optional<Output<Object>> blobWriterDateTimeFormat() {
        return Optional.ofNullable(this.blobWriterDateTimeFormat);
    }

    /**
     * Blob writer overwrite files. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="blobWriterOverwriteFiles")
    private @Nullable Output<Object> blobWriterOverwriteFiles;

    public Optional<Output<Object>> blobWriterOverwriteFiles() {
        return Optional.ofNullable(this.blobWriterOverwriteFiles);
    }

    /**
     * The type of copy behavior for copy sink.
     * 
     */
    @Import(name="copyBehavior")
    private @Nullable Output<Object> copyBehavior;

    public Optional<Output<Object>> copyBehavior() {
        return Optional.ofNullable(this.copyBehavior);
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
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Specify the custom metadata to be added to sink data. Type: array of objects (or Expression with resultType array of objects).
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<List<MetadataItemArgs>> metadata;

    public Optional<Output<List<MetadataItemArgs>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
    private @Nullable Output<Object> sinkRetryCount;

    public Optional<Output<Object>> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
    private @Nullable Output<Object> sinkRetryWait;

    public Optional<Output<Object>> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;BlobSink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
    private @Nullable Output<Object> writeBatchSize;

    public Optional<Output<Object>> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
    private @Nullable Output<Object> writeBatchTimeout;

    public Optional<Output<Object>> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    private BlobSinkArgs() {}

    private BlobSinkArgs(BlobSinkArgs $) {
        this.blobWriterAddHeader = $.blobWriterAddHeader;
        this.blobWriterDateTimeFormat = $.blobWriterDateTimeFormat;
        this.blobWriterOverwriteFiles = $.blobWriterOverwriteFiles;
        this.copyBehavior = $.copyBehavior;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.metadata = $.metadata;
        this.sinkRetryCount = $.sinkRetryCount;
        this.sinkRetryWait = $.sinkRetryWait;
        this.type = $.type;
        this.writeBatchSize = $.writeBatchSize;
        this.writeBatchTimeout = $.writeBatchTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BlobSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BlobSinkArgs $;

        public Builder() {
            $ = new BlobSinkArgs();
        }

        public Builder(BlobSinkArgs defaults) {
            $ = new BlobSinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder blobWriterAddHeader(@Nullable Output<Object> blobWriterAddHeader) {
            $.blobWriterAddHeader = blobWriterAddHeader;
            return this;
        }

        public Builder blobWriterAddHeader(Object blobWriterAddHeader) {
            return blobWriterAddHeader(Output.of(blobWriterAddHeader));
        }

        public Builder blobWriterDateTimeFormat(@Nullable Output<Object> blobWriterDateTimeFormat) {
            $.blobWriterDateTimeFormat = blobWriterDateTimeFormat;
            return this;
        }

        public Builder blobWriterDateTimeFormat(Object blobWriterDateTimeFormat) {
            return blobWriterDateTimeFormat(Output.of(blobWriterDateTimeFormat));
        }

        public Builder blobWriterOverwriteFiles(@Nullable Output<Object> blobWriterOverwriteFiles) {
            $.blobWriterOverwriteFiles = blobWriterOverwriteFiles;
            return this;
        }

        public Builder blobWriterOverwriteFiles(Object blobWriterOverwriteFiles) {
            return blobWriterOverwriteFiles(Output.of(blobWriterOverwriteFiles));
        }

        public Builder copyBehavior(@Nullable Output<Object> copyBehavior) {
            $.copyBehavior = copyBehavior;
            return this;
        }

        public Builder copyBehavior(Object copyBehavior) {
            return copyBehavior(Output.of(copyBehavior));
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

        public Builder metadata(@Nullable Output<List<MetadataItemArgs>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(List<MetadataItemArgs> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder metadata(MetadataItemArgs... metadata) {
            return metadata(List.of(metadata));
        }

        public Builder sinkRetryCount(@Nullable Output<Object> sinkRetryCount) {
            $.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder sinkRetryCount(Object sinkRetryCount) {
            return sinkRetryCount(Output.of(sinkRetryCount));
        }

        public Builder sinkRetryWait(@Nullable Output<Object> sinkRetryWait) {
            $.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder sinkRetryWait(Object sinkRetryWait) {
            return sinkRetryWait(Output.of(sinkRetryWait));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder writeBatchSize(@Nullable Output<Object> writeBatchSize) {
            $.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder writeBatchSize(Object writeBatchSize) {
            return writeBatchSize(Output.of(writeBatchSize));
        }

        public Builder writeBatchTimeout(@Nullable Output<Object> writeBatchTimeout) {
            $.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder writeBatchTimeout(Object writeBatchTimeout) {
            return writeBatchTimeout(Output.of(writeBatchTimeout));
        }

        public BlobSinkArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
