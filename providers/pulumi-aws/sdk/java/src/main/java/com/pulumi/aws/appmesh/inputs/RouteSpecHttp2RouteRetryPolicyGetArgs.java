// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttp2RouteRetryPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteRetryPolicyGetArgs Empty = new RouteSpecHttp2RouteRetryPolicyGetArgs();

    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    @Import(name="httpRetryEvents")
    private @Nullable Output<List<String>> httpRetryEvents;

    public Optional<Output<List<String>>> httpRetryEvents() {
        return Optional.ofNullable(this.httpRetryEvents);
    }

    /**
     * The maximum number of retries.
     * 
     */
    @Import(name="maxRetries", required=true)
    private Output<Integer> maxRetries;

    public Output<Integer> maxRetries() {
        return this.maxRetries;
    }

    /**
     * The per-retry timeout.
     * 
     */
    @Import(name="perRetryTimeout", required=true)
    private Output<RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout;

    public Output<RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout() {
        return this.perRetryTimeout;
    }

    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    @Import(name="tcpRetryEvents")
    private @Nullable Output<List<String>> tcpRetryEvents;

    public Optional<Output<List<String>>> tcpRetryEvents() {
        return Optional.ofNullable(this.tcpRetryEvents);
    }

    private RouteSpecHttp2RouteRetryPolicyGetArgs() {}

    private RouteSpecHttp2RouteRetryPolicyGetArgs(RouteSpecHttp2RouteRetryPolicyGetArgs $) {
        this.httpRetryEvents = $.httpRetryEvents;
        this.maxRetries = $.maxRetries;
        this.perRetryTimeout = $.perRetryTimeout;
        this.tcpRetryEvents = $.tcpRetryEvents;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttp2RouteRetryPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttp2RouteRetryPolicyGetArgs $;

        public Builder() {
            $ = new RouteSpecHttp2RouteRetryPolicyGetArgs();
        }

        public Builder(RouteSpecHttp2RouteRetryPolicyGetArgs defaults) {
            $ = new RouteSpecHttp2RouteRetryPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder httpRetryEvents(@Nullable Output<List<String>> httpRetryEvents) {
            $.httpRetryEvents = httpRetryEvents;
            return this;
        }

        public Builder httpRetryEvents(List<String> httpRetryEvents) {
            return httpRetryEvents(Output.of(httpRetryEvents));
        }

        public Builder httpRetryEvents(String... httpRetryEvents) {
            return httpRetryEvents(List.of(httpRetryEvents));
        }

        public Builder maxRetries(Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        public Builder perRetryTimeout(Output<RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs> perRetryTimeout) {
            $.perRetryTimeout = perRetryTimeout;
            return this;
        }

        public Builder perRetryTimeout(RouteSpecHttp2RouteRetryPolicyPerRetryTimeoutGetArgs perRetryTimeout) {
            return perRetryTimeout(Output.of(perRetryTimeout));
        }

        public Builder tcpRetryEvents(@Nullable Output<List<String>> tcpRetryEvents) {
            $.tcpRetryEvents = tcpRetryEvents;
            return this;
        }

        public Builder tcpRetryEvents(List<String> tcpRetryEvents) {
            return tcpRetryEvents(Output.of(tcpRetryEvents));
        }

        public Builder tcpRetryEvents(String... tcpRetryEvents) {
            return tcpRetryEvents(List.of(tcpRetryEvents));
        }

        public RouteSpecHttp2RouteRetryPolicyGetArgs build() {
            $.maxRetries = Objects.requireNonNull($.maxRetries, "expected parameter 'maxRetries' to be non-null");
            $.perRetryTimeout = Objects.requireNonNull($.perRetryTimeout, "expected parameter 'perRetryTimeout' to be non-null");
            return $;
        }
    }

}
