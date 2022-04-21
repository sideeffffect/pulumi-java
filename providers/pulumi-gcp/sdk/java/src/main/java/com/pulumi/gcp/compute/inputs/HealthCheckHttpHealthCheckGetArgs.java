// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthCheckHttpHealthCheckGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final HealthCheckHttpHealthCheckGetArgs Empty = new HealthCheckHttpHealthCheckGetArgs();

    /**
     * The value of the host header in the HTTP2 health check request.
     * If left empty (default value), the public IP on behalf of which this health
     * check is performed will be used.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
    @Import(name="portName")
    private @Nullable Output<String> portName;

    public Optional<Output<String>> portName() {
        return Optional.ofNullable(this.portName);
    }

    /**
     * Specifies how port is selected for health checking, can be one of the
     * following values:
     * * `USE_FIXED_PORT`: The port number in `port` is used for health checking.
     * * `USE_NAMED_PORT`: The `portName` is used for health checking.
     * * `USE_SERVING_PORT`: For NetworkEndpointGroup, the port specified for each
     *   network endpoint is used for health checking. For other backends, the
     *   port or named port specified in the Backend Service is used for health
     *   checking.
     *   If not specified, gRPC health check follows behavior specified in `port` and
     *   `portName` fields.
     *   Possible values are `USE_FIXED_PORT`, `USE_NAMED_PORT`, and `USE_SERVING_PORT`.
     * 
     */
    @Import(name="portSpecification")
    private @Nullable Output<String> portSpecification;

    public Optional<Output<String>> portSpecification() {
        return Optional.ofNullable(this.portSpecification);
    }

    /**
     * Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
    @Import(name="proxyHeader")
    private @Nullable Output<String> proxyHeader;

    public Optional<Output<String>> proxyHeader() {
        return Optional.ofNullable(this.proxyHeader);
    }

    /**
     * The request path of the HTTP2 health check request.
     * The default value is /.
     * 
     */
    @Import(name="requestPath")
    private @Nullable Output<String> requestPath;

    public Optional<Output<String>> requestPath() {
        return Optional.ofNullable(this.requestPath);
    }

    /**
     * The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    @Import(name="response")
    private @Nullable Output<String> response;

    public Optional<Output<String>> response() {
        return Optional.ofNullable(this.response);
    }

    private HealthCheckHttpHealthCheckGetArgs() {}

    private HealthCheckHttpHealthCheckGetArgs(HealthCheckHttpHealthCheckGetArgs $) {
        this.host = $.host;
        this.port = $.port;
        this.portName = $.portName;
        this.portSpecification = $.portSpecification;
        this.proxyHeader = $.proxyHeader;
        this.requestPath = $.requestPath;
        this.response = $.response;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HealthCheckHttpHealthCheckGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckHttpHealthCheckGetArgs $;

        public Builder() {
            $ = new HealthCheckHttpHealthCheckGetArgs();
        }

        public Builder(HealthCheckHttpHealthCheckGetArgs defaults) {
            $ = new HealthCheckHttpHealthCheckGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder portName(@Nullable Output<String> portName) {
            $.portName = portName;
            return this;
        }

        public Builder portName(String portName) {
            return portName(Output.of(portName));
        }

        public Builder portSpecification(@Nullable Output<String> portSpecification) {
            $.portSpecification = portSpecification;
            return this;
        }

        public Builder portSpecification(String portSpecification) {
            return portSpecification(Output.of(portSpecification));
        }

        public Builder proxyHeader(@Nullable Output<String> proxyHeader) {
            $.proxyHeader = proxyHeader;
            return this;
        }

        public Builder proxyHeader(String proxyHeader) {
            return proxyHeader(Output.of(proxyHeader));
        }

        public Builder requestPath(@Nullable Output<String> requestPath) {
            $.requestPath = requestPath;
            return this;
        }

        public Builder requestPath(String requestPath) {
            return requestPath(Output.of(requestPath));
        }

        public Builder response(@Nullable Output<String> response) {
            $.response = response;
            return this;
        }

        public Builder response(String response) {
            return response(Output.of(response));
        }

        public HealthCheckHttpHealthCheckGetArgs build() {
            return $;
        }
    }

}
