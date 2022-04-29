// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HealthCheckHttpHealthCheckArgs extends ResourceArgs {

    public static final HealthCheckHttpHealthCheckArgs Empty = new HealthCheckHttpHealthCheckArgs();

    /**
     * The value of the host header in the HTTP2 health check request.
     * If left empty (default value), the public IP on behalf of which this health
     * check is performed will be used.
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The value of the host header in the HTTP2 health check request.
     * If left empty (default value), the public IP on behalf of which this health
     * check is performed will be used.
     * 
     */
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

    /**
     * @return The port number for the health check request.
     * Must be specified if portName and portSpecification are not set
     * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
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

    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and
     * port_name are defined, port takes precedence.
     * 
     */
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

    /**
     * @return Specifies how port is selected for health checking, can be one of the
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

    /**
     * @return Specifies the type of proxy header to append before sending data to the
     * backend.
     * Default value is `NONE`.
     * Possible values are `NONE` and `PROXY_V1`.
     * 
     */
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

    /**
     * @return The request path of the HTTP2 health check request.
     * The default value is /.
     * 
     */
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

    /**
     * @return The bytes to match against the beginning of the response data. If left empty
     * (the default value), any response will indicate health. The response data
     * can only be ASCII.
     * 
     */
    public Optional<Output<String>> response() {
        return Optional.ofNullable(this.response);
    }

    private HealthCheckHttpHealthCheckArgs() {}

    private HealthCheckHttpHealthCheckArgs(HealthCheckHttpHealthCheckArgs $) {
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
    public static Builder builder(HealthCheckHttpHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HealthCheckHttpHealthCheckArgs $;

        public Builder() {
            $ = new HealthCheckHttpHealthCheckArgs();
        }

        public Builder(HealthCheckHttpHealthCheckArgs defaults) {
            $ = new HealthCheckHttpHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param host The value of the host header in the HTTP2 health check request.
         * If left empty (default value), the public IP on behalf of which this health
         * check is performed will be used.
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The value of the host header in the HTTP2 health check request.
         * If left empty (default value), the public IP on behalf of which this health
         * check is performed will be used.
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param port The port number for the health check request.
         * Must be specified if portName and portSpecification are not set
         * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number for the health check request.
         * Must be specified if portName and portSpecification are not set
         * or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and
         * port_name are defined, port takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder portName(@Nullable Output<String> portName) {
            $.portName = portName;
            return this;
        }

        /**
         * @param portName Port name as defined in InstanceGroup#NamedPort#name. If both port and
         * port_name are defined, port takes precedence.
         * 
         * @return builder
         * 
         */
        public Builder portName(String portName) {
            return portName(Output.of(portName));
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of the
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
         * @return builder
         * 
         */
        public Builder portSpecification(@Nullable Output<String> portSpecification) {
            $.portSpecification = portSpecification;
            return this;
        }

        /**
         * @param portSpecification Specifies how port is selected for health checking, can be one of the
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
         * @return builder
         * 
         */
        public Builder portSpecification(String portSpecification) {
            return portSpecification(Output.of(portSpecification));
        }

        /**
         * @param proxyHeader Specifies the type of proxy header to append before sending data to the
         * backend.
         * Default value is `NONE`.
         * Possible values are `NONE` and `PROXY_V1`.
         * 
         * @return builder
         * 
         */
        public Builder proxyHeader(@Nullable Output<String> proxyHeader) {
            $.proxyHeader = proxyHeader;
            return this;
        }

        /**
         * @param proxyHeader Specifies the type of proxy header to append before sending data to the
         * backend.
         * Default value is `NONE`.
         * Possible values are `NONE` and `PROXY_V1`.
         * 
         * @return builder
         * 
         */
        public Builder proxyHeader(String proxyHeader) {
            return proxyHeader(Output.of(proxyHeader));
        }

        /**
         * @param requestPath The request path of the HTTP2 health check request.
         * The default value is /.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(@Nullable Output<String> requestPath) {
            $.requestPath = requestPath;
            return this;
        }

        /**
         * @param requestPath The request path of the HTTP2 health check request.
         * The default value is /.
         * 
         * @return builder
         * 
         */
        public Builder requestPath(String requestPath) {
            return requestPath(Output.of(requestPath));
        }

        /**
         * @param response The bytes to match against the beginning of the response data. If left empty
         * (the default value), any response will indicate health. The response data
         * can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder response(@Nullable Output<String> response) {
            $.response = response;
            return this;
        }

        /**
         * @param response The bytes to match against the beginning of the response data. If left empty
         * (the default value), any response will indicate health. The response data
         * can only be ASCII.
         * 
         * @return builder
         * 
         */
        public Builder response(String response) {
            return response(Output.of(response));
        }

        public HealthCheckHttpHealthCheckArgs build() {
            return $;
        }
    }

}
