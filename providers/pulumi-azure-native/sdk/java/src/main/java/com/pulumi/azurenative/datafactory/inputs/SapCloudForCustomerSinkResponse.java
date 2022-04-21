// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity SAP Cloud for Customer sink.
 * 
 */
public final class SapCloudForCustomerSinkResponse extends com.pulumi.resources.InvokeArgs {

    public static final SapCloudForCustomerSinkResponse Empty = new SapCloudForCustomerSinkResponse();

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
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:05:00. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="httpRequestTimeout")
    private @Nullable Object httpRequestTimeout;

    public Optional<Object> httpRequestTimeout() {
        return Optional.ofNullable(this.httpRequestTimeout);
    }

    /**
     * The maximum concurrent connection count for the sink data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Object maxConcurrentConnections;

    public Optional<Object> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * Sink retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sinkRetryCount")
    private @Nullable Object sinkRetryCount;

    public Optional<Object> sinkRetryCount() {
        return Optional.ofNullable(this.sinkRetryCount);
    }

    /**
     * Sink retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sinkRetryWait")
    private @Nullable Object sinkRetryWait;

    public Optional<Object> sinkRetryWait() {
        return Optional.ofNullable(this.sinkRetryWait);
    }

    /**
     * Copy sink type.
     * Expected value is &#39;SapCloudForCustomerSink&#39;.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * Write batch size. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @Import(name="writeBatchSize")
    private @Nullable Object writeBatchSize;

    public Optional<Object> writeBatchSize() {
        return Optional.ofNullable(this.writeBatchSize);
    }

    /**
     * Write batch timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="writeBatchTimeout")
    private @Nullable Object writeBatchTimeout;

    public Optional<Object> writeBatchTimeout() {
        return Optional.ofNullable(this.writeBatchTimeout);
    }

    /**
     * The write behavior for the operation. Default is &#39;Insert&#39;.
     * 
     */
    @Import(name="writeBehavior")
    private @Nullable String writeBehavior;

    public Optional<String> writeBehavior() {
        return Optional.ofNullable(this.writeBehavior);
    }

    private SapCloudForCustomerSinkResponse() {}

    private SapCloudForCustomerSinkResponse(SapCloudForCustomerSinkResponse $) {
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.httpRequestTimeout = $.httpRequestTimeout;
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
    public static Builder builder(SapCloudForCustomerSinkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SapCloudForCustomerSinkResponse $;

        public Builder() {
            $ = new SapCloudForCustomerSinkResponse();
        }

        public Builder(SapCloudForCustomerSinkResponse defaults) {
            $ = new SapCloudForCustomerSinkResponse(Objects.requireNonNull(defaults));
        }

        public Builder disableMetricsCollection(@Nullable Object disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        public Builder httpRequestTimeout(@Nullable Object httpRequestTimeout) {
            $.httpRequestTimeout = httpRequestTimeout;
            return this;
        }

        public Builder maxConcurrentConnections(@Nullable Object maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        public Builder sinkRetryCount(@Nullable Object sinkRetryCount) {
            $.sinkRetryCount = sinkRetryCount;
            return this;
        }

        public Builder sinkRetryWait(@Nullable Object sinkRetryWait) {
            $.sinkRetryWait = sinkRetryWait;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder writeBatchSize(@Nullable Object writeBatchSize) {
            $.writeBatchSize = writeBatchSize;
            return this;
        }

        public Builder writeBatchTimeout(@Nullable Object writeBatchTimeout) {
            $.writeBatchTimeout = writeBatchTimeout;
            return this;
        }

        public Builder writeBehavior(@Nullable String writeBehavior) {
            $.writeBehavior = writeBehavior;
            return this;
        }

        public SapCloudForCustomerSinkResponse build() {
            $.type = Codegen.stringProp("type").arg($.type).require();
            return $;
        }
    }

}
