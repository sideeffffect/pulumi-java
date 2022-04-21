// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EdgeCacheOriginTimeoutGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EdgeCacheOriginTimeoutGetArgs Empty = new EdgeCacheOriginTimeoutGetArgs();

    /**
     * The maximum duration to wait for the origin connection to be established, including DNS lookup, TLS handshake and TCP/QUIC connection establishment.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 15s.
     * 
     */
    @Import(name="connectTimeout")
    private @Nullable Output<String> connectTimeout;

    public Optional<Output<String>> connectTimeout() {
        return Optional.ofNullable(this.connectTimeout);
    }

    /**
     * The maximum time across all connection attempts to the origin, including failover origins, before returning an error to the client. A HTTP 503 will be returned if the timeout is reached before a response is returned.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 15s.
     * 
     */
    @Import(name="maxAttemptsTimeout")
    private @Nullable Output<String> maxAttemptsTimeout;

    public Optional<Output<String>> maxAttemptsTimeout() {
        return Optional.ofNullable(this.maxAttemptsTimeout);
    }

    /**
     * The maximum duration to wait for data to arrive when reading from the HTTP connection/stream.
     * Defaults to 5 seconds. The timeout must be a value between 1s and 30s.
     * 
     */
    @Import(name="responseTimeout")
    private @Nullable Output<String> responseTimeout;

    public Optional<Output<String>> responseTimeout() {
        return Optional.ofNullable(this.responseTimeout);
    }

    private EdgeCacheOriginTimeoutGetArgs() {}

    private EdgeCacheOriginTimeoutGetArgs(EdgeCacheOriginTimeoutGetArgs $) {
        this.connectTimeout = $.connectTimeout;
        this.maxAttemptsTimeout = $.maxAttemptsTimeout;
        this.responseTimeout = $.responseTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeCacheOriginTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeCacheOriginTimeoutGetArgs $;

        public Builder() {
            $ = new EdgeCacheOriginTimeoutGetArgs();
        }

        public Builder(EdgeCacheOriginTimeoutGetArgs defaults) {
            $ = new EdgeCacheOriginTimeoutGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectTimeout(@Nullable Output<String> connectTimeout) {
            $.connectTimeout = connectTimeout;
            return this;
        }

        public Builder connectTimeout(String connectTimeout) {
            return connectTimeout(Output.of(connectTimeout));
        }

        public Builder maxAttemptsTimeout(@Nullable Output<String> maxAttemptsTimeout) {
            $.maxAttemptsTimeout = maxAttemptsTimeout;
            return this;
        }

        public Builder maxAttemptsTimeout(String maxAttemptsTimeout) {
            return maxAttemptsTimeout(Output.of(maxAttemptsTimeout));
        }

        public Builder responseTimeout(@Nullable Output<String> responseTimeout) {
            $.responseTimeout = responseTimeout;
            return this;
        }

        public Builder responseTimeout(String responseTimeout) {
            return responseTimeout(Output.of(responseTimeout));
        }

        public EdgeCacheOriginTimeoutGetArgs build() {
            return $;
        }
    }

}
