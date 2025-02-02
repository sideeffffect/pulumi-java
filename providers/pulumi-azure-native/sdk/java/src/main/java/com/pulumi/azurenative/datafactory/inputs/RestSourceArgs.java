// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A copy activity Rest service source.
 * 
 */
public final class RestSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestSourceArgs Empty = new RestSourceArgs();

    /**
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    @Import(name="additionalColumns")
    private @Nullable Output<Object> additionalColumns;

    /**
     * @return Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     */
    public Optional<Output<Object>> additionalColumns() {
        return Optional.ofNullable(this.additionalColumns);
    }

    /**
     * The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="additionalHeaders")
    private @Nullable Output<Object> additionalHeaders;

    /**
     * @return The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> additionalHeaders() {
        return Optional.ofNullable(this.additionalHeaders);
    }

    /**
     * If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="disableMetricsCollection")
    private @Nullable Output<Object> disableMetricsCollection;

    /**
     * @return If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Output<Object>> disableMetricsCollection() {
        return Optional.ofNullable(this.disableMetricsCollection);
    }

    /**
     * The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="httpRequestTimeout")
    private @Nullable Output<Object> httpRequestTimeout;

    /**
     * @return The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> httpRequestTimeout() {
        return Optional.ofNullable(this.httpRequestTimeout);
    }

    /**
     * The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="maxConcurrentConnections")
    private @Nullable Output<Object> maxConcurrentConnections;

    /**
     * @return The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> maxConcurrentConnections() {
        return Optional.ofNullable(this.maxConcurrentConnections);
    }

    /**
     * The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="paginationRules")
    private @Nullable Output<Object> paginationRules;

    /**
     * @return The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> paginationRules() {
        return Optional.ofNullable(this.paginationRules);
    }

    /**
     * The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestBody")
    private @Nullable Output<Object> requestBody;

    /**
     * @return The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> requestBody() {
        return Optional.ofNullable(this.requestBody);
    }

    /**
     * The time to await before sending next page request.
     * 
     */
    @Import(name="requestInterval")
    private @Nullable Output<Object> requestInterval;

    /**
     * @return The time to await before sending next page request.
     * 
     */
    public Optional<Output<Object>> requestInterval() {
        return Optional.ofNullable(this.requestInterval);
    }

    /**
     * The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="requestMethod")
    private @Nullable Output<Object> requestMethod;

    /**
     * @return The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Output<Object>> requestMethod() {
        return Optional.ofNullable(this.requestMethod);
    }

    /**
     * Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    @Import(name="sourceRetryCount")
    private @Nullable Output<Object> sourceRetryCount;

    /**
     * @return Source retry count. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Output<Object>> sourceRetryCount() {
        return Optional.ofNullable(this.sourceRetryCount);
    }

    /**
     * Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="sourceRetryWait")
    private @Nullable Output<Object> sourceRetryWait;

    /**
     * @return Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    public Optional<Output<Object>> sourceRetryWait() {
        return Optional.ofNullable(this.sourceRetryWait);
    }

    /**
     * Copy source type.
     * Expected value is &#39;RestSource&#39;.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Copy source type.
     * Expected value is &#39;RestSource&#39;.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private RestSourceArgs() {}

    private RestSourceArgs(RestSourceArgs $) {
        this.additionalColumns = $.additionalColumns;
        this.additionalHeaders = $.additionalHeaders;
        this.disableMetricsCollection = $.disableMetricsCollection;
        this.httpRequestTimeout = $.httpRequestTimeout;
        this.maxConcurrentConnections = $.maxConcurrentConnections;
        this.paginationRules = $.paginationRules;
        this.requestBody = $.requestBody;
        this.requestInterval = $.requestInterval;
        this.requestMethod = $.requestMethod;
        this.sourceRetryCount = $.sourceRetryCount;
        this.sourceRetryWait = $.sourceRetryWait;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestSourceArgs $;

        public Builder() {
            $ = new RestSourceArgs();
        }

        public Builder(RestSourceArgs defaults) {
            $ = new RestSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(@Nullable Output<Object> additionalColumns) {
            $.additionalColumns = additionalColumns;
            return this;
        }

        /**
         * @param additionalColumns Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or Expression with resultType array of objects).
         * 
         * @return builder
         * 
         */
        public Builder additionalColumns(Object additionalColumns) {
            return additionalColumns(Output.of(additionalColumns));
        }

        /**
         * @param additionalHeaders The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder additionalHeaders(@Nullable Output<Object> additionalHeaders) {
            $.additionalHeaders = additionalHeaders;
            return this;
        }

        /**
         * @param additionalHeaders The additional HTTP headers in the request to the RESTful API. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder additionalHeaders(Object additionalHeaders) {
            return additionalHeaders(Output.of(additionalHeaders));
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(@Nullable Output<Object> disableMetricsCollection) {
            $.disableMetricsCollection = disableMetricsCollection;
            return this;
        }

        /**
         * @param disableMetricsCollection If true, disable data store metrics collection. Default is false. Type: boolean (or Expression with resultType boolean).
         * 
         * @return builder
         * 
         */
        public Builder disableMetricsCollection(Object disableMetricsCollection) {
            return disableMetricsCollection(Output.of(disableMetricsCollection));
        }

        /**
         * @param httpRequestTimeout The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder httpRequestTimeout(@Nullable Output<Object> httpRequestTimeout) {
            $.httpRequestTimeout = httpRequestTimeout;
            return this;
        }

        /**
         * @param httpRequestTimeout The timeout (TimeSpan) to get an HTTP response. It is the timeout to get a response, not the timeout to read response data. Default value: 00:01:40. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder httpRequestTimeout(Object httpRequestTimeout) {
            return httpRequestTimeout(Output.of(httpRequestTimeout));
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(@Nullable Output<Object> maxConcurrentConnections) {
            $.maxConcurrentConnections = maxConcurrentConnections;
            return this;
        }

        /**
         * @param maxConcurrentConnections The maximum concurrent connection count for the source data store. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrentConnections(Object maxConcurrentConnections) {
            return maxConcurrentConnections(Output.of(maxConcurrentConnections));
        }

        /**
         * @param paginationRules The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder paginationRules(@Nullable Output<Object> paginationRules) {
            $.paginationRules = paginationRules;
            return this;
        }

        /**
         * @param paginationRules The pagination rules to compose next page requests. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder paginationRules(Object paginationRules) {
            return paginationRules(Output.of(paginationRules));
        }

        /**
         * @param requestBody The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder requestBody(@Nullable Output<Object> requestBody) {
            $.requestBody = requestBody;
            return this;
        }

        /**
         * @param requestBody The HTTP request body to the RESTful API if requestMethod is POST. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder requestBody(Object requestBody) {
            return requestBody(Output.of(requestBody));
        }

        /**
         * @param requestInterval The time to await before sending next page request.
         * 
         * @return builder
         * 
         */
        public Builder requestInterval(@Nullable Output<Object> requestInterval) {
            $.requestInterval = requestInterval;
            return this;
        }

        /**
         * @param requestInterval The time to await before sending next page request.
         * 
         * @return builder
         * 
         */
        public Builder requestInterval(Object requestInterval) {
            return requestInterval(Output.of(requestInterval));
        }

        /**
         * @param requestMethod The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder requestMethod(@Nullable Output<Object> requestMethod) {
            $.requestMethod = requestMethod;
            return this;
        }

        /**
         * @param requestMethod The HTTP method used to call the RESTful API. The default is GET. Type: string (or Expression with resultType string).
         * 
         * @return builder
         * 
         */
        public Builder requestMethod(Object requestMethod) {
            return requestMethod(Output.of(requestMethod));
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(@Nullable Output<Object> sourceRetryCount) {
            $.sourceRetryCount = sourceRetryCount;
            return this;
        }

        /**
         * @param sourceRetryCount Source retry count. Type: integer (or Expression with resultType integer).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryCount(Object sourceRetryCount) {
            return sourceRetryCount(Output.of(sourceRetryCount));
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(@Nullable Output<Object> sourceRetryWait) {
            $.sourceRetryWait = sourceRetryWait;
            return this;
        }

        /**
         * @param sourceRetryWait Source retry wait. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
         * 
         * @return builder
         * 
         */
        public Builder sourceRetryWait(Object sourceRetryWait) {
            return sourceRetryWait(Output.of(sourceRetryWait));
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;RestSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Copy source type.
         * Expected value is &#39;RestSource&#39;.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RestSourceArgs build() {
            $.type = Codegen.stringProp("type").output().arg($.type).require();
            return $;
        }
    }

}
