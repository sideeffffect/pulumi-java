// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.HTTPHeaderResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the HTTP configuration.
 * 
 */
public final class ConnectionMonitorHttpConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorHttpConfigurationResponse Empty = new ConnectionMonitorHttpConfigurationResponse();

    /**
     * The HTTP method to use.
     * 
     */
    @InputImport(name="method")
      private final @Nullable String method;

    public Optional<String> getMethod() {
        return this.method == null ? Optional.empty() : Optional.ofNullable(this.method);
    }

    /**
     * The path component of the URI. For instance, "/dir1/dir2".
     * 
     */
    @InputImport(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * The port to connect to.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * Value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     * 
     */
    @InputImport(name="preferHTTPS")
      private final @Nullable Boolean preferHTTPS;

    public Optional<Boolean> getPreferHTTPS() {
        return this.preferHTTPS == null ? Optional.empty() : Optional.ofNullable(this.preferHTTPS);
    }

    /**
     * The HTTP headers to transmit with the request.
     * 
     */
    @InputImport(name="requestHeaders")
      private final @Nullable List<HTTPHeaderResponse> requestHeaders;

    public List<HTTPHeaderResponse> getRequestHeaders() {
        return this.requestHeaders == null ? List.of() : this.requestHeaders;
    }

    /**
     * HTTP status codes to consider successful. For instance, "2xx,301-304,418".
     * 
     */
    @InputImport(name="validStatusCodeRanges")
      private final @Nullable List<String> validStatusCodeRanges;

    public List<String> getValidStatusCodeRanges() {
        return this.validStatusCodeRanges == null ? List.of() : this.validStatusCodeRanges;
    }

    public ConnectionMonitorHttpConfigurationResponse(
        @Nullable String method,
        @Nullable String path,
        @Nullable Integer port,
        @Nullable Boolean preferHTTPS,
        @Nullable List<HTTPHeaderResponse> requestHeaders,
        @Nullable List<String> validStatusCodeRanges) {
        this.method = method;
        this.path = path;
        this.port = port;
        this.preferHTTPS = preferHTTPS;
        this.requestHeaders = requestHeaders;
        this.validStatusCodeRanges = validStatusCodeRanges;
    }

    private ConnectionMonitorHttpConfigurationResponse() {
        this.method = null;
        this.path = null;
        this.port = null;
        this.preferHTTPS = null;
        this.requestHeaders = List.of();
        this.validStatusCodeRanges = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorHttpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String method;
        private @Nullable String path;
        private @Nullable Integer port;
        private @Nullable Boolean preferHTTPS;
        private @Nullable List<HTTPHeaderResponse> requestHeaders;
        private @Nullable List<String> validStatusCodeRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorHttpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.preferHTTPS = defaults.preferHTTPS;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.validStatusCodeRanges = defaults.validStatusCodeRanges;
        }

        public Builder method(@Nullable String method) {
            this.method = method;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder preferHTTPS(@Nullable Boolean preferHTTPS) {
            this.preferHTTPS = preferHTTPS;
            return this;
        }

        public Builder requestHeaders(@Nullable List<HTTPHeaderResponse> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }

        public Builder validStatusCodeRanges(@Nullable List<String> validStatusCodeRanges) {
            this.validStatusCodeRanges = validStatusCodeRanges;
            return this;
        }
        public ConnectionMonitorHttpConfigurationResponse build() {
            return new ConnectionMonitorHttpConfigurationResponse(method, path, port, preferHTTPS, requestHeaders, validStatusCodeRanges);
        }
    }
}
