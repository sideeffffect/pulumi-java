// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EdgeCacheOriginTimeoutArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheOriginState extends ResourceArgs {

    public static final EdgeCacheOriginState Empty = new EdgeCacheOriginState();

    /**
     * A human-readable description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-readable description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Origin resource to try when the current origin cannot be reached.
     * After maxAttempts is reached, the configured failoverOrigin will be used to fulfil the request.
     * The value of timeout.maxAttemptsTimeout dictates the timeout across all origins.
     * A reference to a Topic resource.
     * 
     */
    @Import(name="failoverOrigin")
    private @Nullable Output<String> failoverOrigin;

    /**
     * @return The Origin resource to try when the current origin cannot be reached.
     * After maxAttempts is reached, the configured failoverOrigin will be used to fulfil the request.
     * The value of timeout.maxAttemptsTimeout dictates the timeout across all origins.
     * A reference to a Topic resource.
     * 
     */
    public Optional<Output<String>> failoverOrigin() {
        return Optional.ofNullable(this.failoverOrigin);
    }

    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the EdgeCache resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The maximum number of attempts to cache fill from this origin. Another attempt is made when a cache fill fails with one of the retryConditions.
     * Once maxAttempts to this origin have failed the failoverOrigin will be used, if one is specified. That failoverOrigin may specify its own maxAttempts,
     * retryConditions and failoverOrigin to control its own cache fill failures.
     * The total number of allowed attempts to cache fill across this and failover origins is limited to four.
     * The total time allowed for cache fill attempts across this and failover origins can be controlled with maxAttemptsTimeout.
     * The last valid response from an origin will be returned to the client.
     * If no origin returns a valid response, an HTTP 503 will be returned to the client.
     * Defaults to 1. Must be a value greater than 0 and less than 4.
     * 
     */
    @Import(name="maxAttempts")
    private @Nullable Output<Integer> maxAttempts;

    /**
     * @return The maximum number of attempts to cache fill from this origin. Another attempt is made when a cache fill fails with one of the retryConditions.
     * Once maxAttempts to this origin have failed the failoverOrigin will be used, if one is specified. That failoverOrigin may specify its own maxAttempts,
     * retryConditions and failoverOrigin to control its own cache fill failures.
     * The total number of allowed attempts to cache fill across this and failover origins is limited to four.
     * The total time allowed for cache fill attempts across this and failover origins can be controlled with maxAttemptsTimeout.
     * The last valid response from an origin will be returned to the client.
     * If no origin returns a valid response, an HTTP 503 will be returned to the client.
     * Defaults to 1. Must be a value greater than 0 and less than 4.
     * 
     */
    public Optional<Output<Integer>> maxAttempts() {
        return Optional.ofNullable(this.maxAttempts);
    }

    /**
     * Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A fully qualified domain name (FQDN) or IP address reachable over the public Internet, or the address of a Google Cloud Storage bucket.
     * This address will be used as the origin for cache requests - e.g. FQDN: media-backend.example.com IPv4:35.218.1.1 IPv6:[2607:f8b0:4012:809::200e] Cloud Storage: gs://bucketname
     * When providing an FQDN (hostname), it must be publicly resolvable (e.g. via Google public DNS) and IP addresses must be publicly routable.
     * If a Cloud Storage bucket is provided, it must be in the canonical &#34;gs://bucketname&#34; format. Other forms, such as &#34;storage.googleapis.com&#34;, will be rejected.
     * 
     */
    @Import(name="originAddress")
    private @Nullable Output<String> originAddress;

    /**
     * @return A fully qualified domain name (FQDN) or IP address reachable over the public Internet, or the address of a Google Cloud Storage bucket.
     * This address will be used as the origin for cache requests - e.g. FQDN: media-backend.example.com IPv4:35.218.1.1 IPv6:[2607:f8b0:4012:809::200e] Cloud Storage: gs://bucketname
     * When providing an FQDN (hostname), it must be publicly resolvable (e.g. via Google public DNS) and IP addresses must be publicly routable.
     * If a Cloud Storage bucket is provided, it must be in the canonical &#34;gs://bucketname&#34; format. Other forms, such as &#34;storage.googleapis.com&#34;, will be rejected.
     * 
     */
    public Optional<Output<String>> originAddress() {
        return Optional.ofNullable(this.originAddress);
    }

    /**
     * The port to connect to the origin on.
     * Defaults to port 443 for HTTP2 and HTTPS protocols, and port 80 for HTTP.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port to connect to the origin on.
     * Defaults to port 443 for HTTP2 and HTTPS protocols, and port 80 for HTTP.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The protocol to use to connect to the configured origin. Defaults to HTTP2, and it is strongly recommended that users use HTTP2 for both security &amp; performance.
     * When using HTTP2 or HTTPS as the protocol, a valid, publicly-signed, unexpired TLS (SSL) certificate must be presented by the origin server.
     * Possible values are `HTTP2`, `HTTPS`, and `HTTP`.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol to use to connect to the configured origin. Defaults to HTTP2, and it is strongly recommended that users use HTTP2 for both security &amp; performance.
     * When using HTTP2 or HTTPS as the protocol, a valid, publicly-signed, unexpired TLS (SSL) certificate must be presented by the origin server.
     * Possible values are `HTTP2`, `HTTPS`, and `HTTP`.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Specifies one or more retry conditions for the configured origin.
     * If the failure mode during a connection attempt to the origin matches the configured retryCondition(s),
     * the origin request will be retried up to maxAttempts times. The failoverOrigin, if configured, will then be used to satisfy the request.
     * The default retryCondition is &#34;CONNECT_FAILURE&#34;.
     * retryConditions apply to this origin, and not subsequent failoverOrigin(s),
     * which may specify their own retryConditions and maxAttempts.
     * Valid values are:
     * - CONNECT_FAILURE: Retry on failures connecting to origins, for example due to connection timeouts.
     * - HTTP_5XX: Retry if the origin responds with any 5xx response code, or if the origin does not respond at all, example: disconnects, reset, read timeout, connection failure, and refused streams.
     * - GATEWAY_ERROR: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * - RETRIABLE_4XX: Retry for retriable 4xx response codes, which include HTTP 409 (Conflict) and HTTP 429 (Too Many Requests)
     * - NOT_FOUND: Retry if the origin returns a HTTP 404 (Not Found). This can be useful when generating video content, and the segment is not available yet.
     *   Each value may be one of `CONNECT_FAILURE`, `HTTP_5XX`, `GATEWAY_ERROR`, `RETRIABLE_4XX`, and `NOT_FOUND`.
     * 
     */
    @Import(name="retryConditions")
    private @Nullable Output<List<String>> retryConditions;

    /**
     * @return Specifies one or more retry conditions for the configured origin.
     * If the failure mode during a connection attempt to the origin matches the configured retryCondition(s),
     * the origin request will be retried up to maxAttempts times. The failoverOrigin, if configured, will then be used to satisfy the request.
     * The default retryCondition is &#34;CONNECT_FAILURE&#34;.
     * retryConditions apply to this origin, and not subsequent failoverOrigin(s),
     * which may specify their own retryConditions and maxAttempts.
     * Valid values are:
     * - CONNECT_FAILURE: Retry on failures connecting to origins, for example due to connection timeouts.
     * - HTTP_5XX: Retry if the origin responds with any 5xx response code, or if the origin does not respond at all, example: disconnects, reset, read timeout, connection failure, and refused streams.
     * - GATEWAY_ERROR: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * - RETRIABLE_4XX: Retry for retriable 4xx response codes, which include HTTP 409 (Conflict) and HTTP 429 (Too Many Requests)
     * - NOT_FOUND: Retry if the origin returns a HTTP 404 (Not Found). This can be useful when generating video content, and the segment is not available yet.
     *   Each value may be one of `CONNECT_FAILURE`, `HTTP_5XX`, `GATEWAY_ERROR`, `RETRIABLE_4XX`, and `NOT_FOUND`.
     * 
     */
    public Optional<Output<List<String>>> retryConditions() {
        return Optional.ofNullable(this.retryConditions);
    }

    /**
     * The connection and HTTP timeout configuration for this origin.
     * Structure is documented below.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<EdgeCacheOriginTimeoutArgs> timeout;

    /**
     * @return The connection and HTTP timeout configuration for this origin.
     * Structure is documented below.
     * 
     */
    public Optional<Output<EdgeCacheOriginTimeoutArgs>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private EdgeCacheOriginState() {}

    private EdgeCacheOriginState(EdgeCacheOriginState $) {
        this.description = $.description;
        this.failoverOrigin = $.failoverOrigin;
        this.labels = $.labels;
        this.maxAttempts = $.maxAttempts;
        this.name = $.name;
        this.originAddress = $.originAddress;
        this.port = $.port;
        this.project = $.project;
        this.protocol = $.protocol;
        this.retryConditions = $.retryConditions;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheOriginState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheOriginState $;

        public Builder() {
            $ = new EdgeCacheOriginState();
        }

        public Builder(EdgeCacheOriginState defaults) {
            $ = new EdgeCacheOriginState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A human-readable description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param failoverOrigin The Origin resource to try when the current origin cannot be reached.
         * After maxAttempts is reached, the configured failoverOrigin will be used to fulfil the request.
         * The value of timeout.maxAttemptsTimeout dictates the timeout across all origins.
         * A reference to a Topic resource.
         * 
         * @return builder
         * 
         */
        public Builder failoverOrigin(@Nullable Output<String> failoverOrigin) {
            $.failoverOrigin = failoverOrigin;
            return this;
        }

        /**
         * @param failoverOrigin The Origin resource to try when the current origin cannot be reached.
         * After maxAttempts is reached, the configured failoverOrigin will be used to fulfil the request.
         * The value of timeout.maxAttemptsTimeout dictates the timeout across all origins.
         * A reference to a Topic resource.
         * 
         * @return builder
         * 
         */
        public Builder failoverOrigin(String failoverOrigin) {
            return failoverOrigin(Output.of(failoverOrigin));
        }

        /**
         * @param labels Set of label tags associated with the EdgeCache resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Set of label tags associated with the EdgeCache resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param maxAttempts The maximum number of attempts to cache fill from this origin. Another attempt is made when a cache fill fails with one of the retryConditions.
         * Once maxAttempts to this origin have failed the failoverOrigin will be used, if one is specified. That failoverOrigin may specify its own maxAttempts,
         * retryConditions and failoverOrigin to control its own cache fill failures.
         * The total number of allowed attempts to cache fill across this and failover origins is limited to four.
         * The total time allowed for cache fill attempts across this and failover origins can be controlled with maxAttemptsTimeout.
         * The last valid response from an origin will be returned to the client.
         * If no origin returns a valid response, an HTTP 503 will be returned to the client.
         * Defaults to 1. Must be a value greater than 0 and less than 4.
         * 
         * @return builder
         * 
         */
        public Builder maxAttempts(@Nullable Output<Integer> maxAttempts) {
            $.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * @param maxAttempts The maximum number of attempts to cache fill from this origin. Another attempt is made when a cache fill fails with one of the retryConditions.
         * Once maxAttempts to this origin have failed the failoverOrigin will be used, if one is specified. That failoverOrigin may specify its own maxAttempts,
         * retryConditions and failoverOrigin to control its own cache fill failures.
         * The total number of allowed attempts to cache fill across this and failover origins is limited to four.
         * The total time allowed for cache fill attempts across this and failover origins can be controlled with maxAttemptsTimeout.
         * The last valid response from an origin will be returned to the client.
         * If no origin returns a valid response, an HTTP 503 will be returned to the client.
         * Defaults to 1. Must be a value greater than 0 and less than 4.
         * 
         * @return builder
         * 
         */
        public Builder maxAttempts(Integer maxAttempts) {
            return maxAttempts(Output.of(maxAttempts));
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created.
         * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
         * and all following characters must be a dash, underscore, letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource; provided by the client when the resource is created.
         * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
         * and all following characters must be a dash, underscore, letter or digit.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param originAddress A fully qualified domain name (FQDN) or IP address reachable over the public Internet, or the address of a Google Cloud Storage bucket.
         * This address will be used as the origin for cache requests - e.g. FQDN: media-backend.example.com IPv4:35.218.1.1 IPv6:[2607:f8b0:4012:809::200e] Cloud Storage: gs://bucketname
         * When providing an FQDN (hostname), it must be publicly resolvable (e.g. via Google public DNS) and IP addresses must be publicly routable.
         * If a Cloud Storage bucket is provided, it must be in the canonical &#34;gs://bucketname&#34; format. Other forms, such as &#34;storage.googleapis.com&#34;, will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder originAddress(@Nullable Output<String> originAddress) {
            $.originAddress = originAddress;
            return this;
        }

        /**
         * @param originAddress A fully qualified domain name (FQDN) or IP address reachable over the public Internet, or the address of a Google Cloud Storage bucket.
         * This address will be used as the origin for cache requests - e.g. FQDN: media-backend.example.com IPv4:35.218.1.1 IPv6:[2607:f8b0:4012:809::200e] Cloud Storage: gs://bucketname
         * When providing an FQDN (hostname), it must be publicly resolvable (e.g. via Google public DNS) and IP addresses must be publicly routable.
         * If a Cloud Storage bucket is provided, it must be in the canonical &#34;gs://bucketname&#34; format. Other forms, such as &#34;storage.googleapis.com&#34;, will be rejected.
         * 
         * @return builder
         * 
         */
        public Builder originAddress(String originAddress) {
            return originAddress(Output.of(originAddress));
        }

        /**
         * @param port The port to connect to the origin on.
         * Defaults to port 443 for HTTP2 and HTTPS protocols, and port 80 for HTTP.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port to connect to the origin on.
         * Defaults to port 443 for HTTP2 and HTTPS protocols, and port 80 for HTTP.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param protocol The protocol to use to connect to the configured origin. Defaults to HTTP2, and it is strongly recommended that users use HTTP2 for both security &amp; performance.
         * When using HTTP2 or HTTPS as the protocol, a valid, publicly-signed, unexpired TLS (SSL) certificate must be presented by the origin server.
         * Possible values are `HTTP2`, `HTTPS`, and `HTTP`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol to use to connect to the configured origin. Defaults to HTTP2, and it is strongly recommended that users use HTTP2 for both security &amp; performance.
         * When using HTTP2 or HTTPS as the protocol, a valid, publicly-signed, unexpired TLS (SSL) certificate must be presented by the origin server.
         * Possible values are `HTTP2`, `HTTPS`, and `HTTP`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param retryConditions Specifies one or more retry conditions for the configured origin.
         * If the failure mode during a connection attempt to the origin matches the configured retryCondition(s),
         * the origin request will be retried up to maxAttempts times. The failoverOrigin, if configured, will then be used to satisfy the request.
         * The default retryCondition is &#34;CONNECT_FAILURE&#34;.
         * retryConditions apply to this origin, and not subsequent failoverOrigin(s),
         * which may specify their own retryConditions and maxAttempts.
         * Valid values are:
         * - CONNECT_FAILURE: Retry on failures connecting to origins, for example due to connection timeouts.
         * - HTTP_5XX: Retry if the origin responds with any 5xx response code, or if the origin does not respond at all, example: disconnects, reset, read timeout, connection failure, and refused streams.
         * - GATEWAY_ERROR: Similar to 5xx, but only applies to response codes 502, 503 or 504.
         * - RETRIABLE_4XX: Retry for retriable 4xx response codes, which include HTTP 409 (Conflict) and HTTP 429 (Too Many Requests)
         * - NOT_FOUND: Retry if the origin returns a HTTP 404 (Not Found). This can be useful when generating video content, and the segment is not available yet.
         *   Each value may be one of `CONNECT_FAILURE`, `HTTP_5XX`, `GATEWAY_ERROR`, `RETRIABLE_4XX`, and `NOT_FOUND`.
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(@Nullable Output<List<String>> retryConditions) {
            $.retryConditions = retryConditions;
            return this;
        }

        /**
         * @param retryConditions Specifies one or more retry conditions for the configured origin.
         * If the failure mode during a connection attempt to the origin matches the configured retryCondition(s),
         * the origin request will be retried up to maxAttempts times. The failoverOrigin, if configured, will then be used to satisfy the request.
         * The default retryCondition is &#34;CONNECT_FAILURE&#34;.
         * retryConditions apply to this origin, and not subsequent failoverOrigin(s),
         * which may specify their own retryConditions and maxAttempts.
         * Valid values are:
         * - CONNECT_FAILURE: Retry on failures connecting to origins, for example due to connection timeouts.
         * - HTTP_5XX: Retry if the origin responds with any 5xx response code, or if the origin does not respond at all, example: disconnects, reset, read timeout, connection failure, and refused streams.
         * - GATEWAY_ERROR: Similar to 5xx, but only applies to response codes 502, 503 or 504.
         * - RETRIABLE_4XX: Retry for retriable 4xx response codes, which include HTTP 409 (Conflict) and HTTP 429 (Too Many Requests)
         * - NOT_FOUND: Retry if the origin returns a HTTP 404 (Not Found). This can be useful when generating video content, and the segment is not available yet.
         *   Each value may be one of `CONNECT_FAILURE`, `HTTP_5XX`, `GATEWAY_ERROR`, `RETRIABLE_4XX`, and `NOT_FOUND`.
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(List<String> retryConditions) {
            return retryConditions(Output.of(retryConditions));
        }

        /**
         * @param retryConditions Specifies one or more retry conditions for the configured origin.
         * If the failure mode during a connection attempt to the origin matches the configured retryCondition(s),
         * the origin request will be retried up to maxAttempts times. The failoverOrigin, if configured, will then be used to satisfy the request.
         * The default retryCondition is &#34;CONNECT_FAILURE&#34;.
         * retryConditions apply to this origin, and not subsequent failoverOrigin(s),
         * which may specify their own retryConditions and maxAttempts.
         * Valid values are:
         * - CONNECT_FAILURE: Retry on failures connecting to origins, for example due to connection timeouts.
         * - HTTP_5XX: Retry if the origin responds with any 5xx response code, or if the origin does not respond at all, example: disconnects, reset, read timeout, connection failure, and refused streams.
         * - GATEWAY_ERROR: Similar to 5xx, but only applies to response codes 502, 503 or 504.
         * - RETRIABLE_4XX: Retry for retriable 4xx response codes, which include HTTP 409 (Conflict) and HTTP 429 (Too Many Requests)
         * - NOT_FOUND: Retry if the origin returns a HTTP 404 (Not Found). This can be useful when generating video content, and the segment is not available yet.
         *   Each value may be one of `CONNECT_FAILURE`, `HTTP_5XX`, `GATEWAY_ERROR`, `RETRIABLE_4XX`, and `NOT_FOUND`.
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }

        /**
         * @param timeout The connection and HTTP timeout configuration for this origin.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<EdgeCacheOriginTimeoutArgs> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The connection and HTTP timeout configuration for this origin.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeout(EdgeCacheOriginTimeoutArgs timeout) {
            return timeout(Output.of(timeout));
        }

        public EdgeCacheOriginState build() {
            return $;
        }
    }

}
