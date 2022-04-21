// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.enums.DynamicsSinkWriteBehavior;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Dynamics sink.
 * 
 */
public final class DynamicsSinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final DynamicsSinkArgs Empty = new DynamicsSinkArgs();

    /**
     * The logical name of the alternate key which will be used when upserting records. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="alternateKeyName")
    private @Nullable Output<Object> alternateKeyName;

    public Optional<Output<Object>> alternateKeyName() {
        return Optional.ofNullable(this.alternateKeyName);
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
     * The flag indicating whether ignore null values from input dataset (except key fields) during write operation. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="ignoreNullValues")
    private @Nullable Output<Object> ignoreNullValues;

    public Optional<Output<Object>> ignoreNullValues() {
        return Optional.ofNullable(this.ignoreNullValues);
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
     * Expected value is &#39;DynamicsSink&#39;.
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

    /**
     * The write behavior for the operation.
     * 
     */
    @Import(name="writeBehavior", required=true)
    private Output<Either<String,DynamicsSinkWriteBehavior>> writeBehavior;

    public Output<Either<String,DynamicsSinkWriteBehavior>> writeBehavior() {
        return this.writeBehavior;
    }

    private DynamicsSinkArgs() {}

    private DynamicsSinkArgs(DynamicsSinkArgs $) {
        this.alternateKeyName = $.alternateKeyName;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.ignoreNullValues = $.ignoreNullValues;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.sinkRetryCount = $.sinkRetryCount;
        this.sinkRetryWait = $.sinkRetryWait;
        this.type = $.type;
        this.writeBatchSize = $.writeBatchSize;
        this.writeBatchTimeout = $.writeBatchTimeout;
        this.writeBehavior = $.writeBehavior;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicsSinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicsSinkArgs $;

        public Builder() {
            $ = new DynamicsSinkArgs();
        }

        public Builder(DynamicsSinkArgs defaults) {
            $ = new DynamicsSinkArgs(Objects.requireNonNull(defaults));
        }

        public Builder alternateKeyName(@Nullable Output<Object> alternateKeyName) {
            $.alternateKeyName = alternateKeyName;
            return this;
        }

        public Builder alternateKeyName(Object alternateKeyName) {
            return alternateKeyName(Output.of(alternateKeyName));
        }

        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        public Builder ignoreNullValues(@Nullable Output<Object> ignoreNullValues) {
            $.ignoreNullValues = ignoreNullValues;
            return this;
        }

        public Builder ignoreNullValues(Object ignoreNullValues) {
            return ignoreNullValues(Output.of(ignoreNullValues));
        }

        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
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

        public Builder writeBehavior(Output<Either<String,DynamicsSinkWriteBehavior>> writeBehavior) {
            $.writeBehavior = writeBehavior;
            return this;
        }

        public Builder writeBehavior(Either<String,DynamicsSinkWriteBehavior> writeBehavior) {
            return writeBehavior(Output.of(writeBehavior));
        }

        public DynamicsSinkArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            $.writeBehavior = Objects.requireNonNull($.writeBehavior, "expected parameter 'writeBehavior' to be non-null");
            return $;
        }
    }

}
