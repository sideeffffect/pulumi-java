// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.enums.GRPCHealthCheckPortSpecification;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GRPCHealthCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final GRPCHealthCheckArgs Empty = new GRPCHealthCheckArgs();

    /**
     * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
     * 
     */
    @Import(name="grpcServiceName")
    private @Nullable Output<String> grpcServiceName;

    public Optional<Output<String>> grpcServiceName() {
        return Optional.ofNullable(this.grpcServiceName);
    }

    /**
     * The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
     * 
     */
    @Import(name="portName")
    private @Nullable Output<String> portName;

    public Optional<Output<String>> portName() {
        return Optional.ofNullable(this.portName);
    }

    /**
     * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
     * 
     */
    @Import(name="portSpecification")
    private @Nullable Output<GRPCHealthCheckPortSpecification> portSpecification;

    public Optional<Output<GRPCHealthCheckPortSpecification>> portSpecification() {
        return Optional.ofNullable(this.portSpecification);
    }

    private GRPCHealthCheckArgs() {}

    private GRPCHealthCheckArgs(GRPCHealthCheckArgs $) {
        this.grpcServiceName = $.grpcServiceName;
        this.port = $.port;
        this.portName = $.portName;
        this.portSpecification = $.portSpecification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GRPCHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GRPCHealthCheckArgs $;

        public Builder() {
            $ = new GRPCHealthCheckArgs();
        }

        public Builder(GRPCHealthCheckArgs defaults) {
            $ = new GRPCHealthCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder grpcServiceName(@Nullable Output<String> grpcServiceName) {
            $.grpcServiceName = grpcServiceName;
            return this;
        }

        public Builder grpcServiceName(String grpcServiceName) {
            return grpcServiceName(Output.of(grpcServiceName));
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

        public Builder portSpecification(@Nullable Output<GRPCHealthCheckPortSpecification> portSpecification) {
            $.portSpecification = portSpecification;
            return this;
        }

        public Builder portSpecification(GRPCHealthCheckPortSpecification portSpecification) {
            return portSpecification(Output.of(portSpecification));
        }

        public GRPCHealthCheckArgs build() {
            return $;
        }
    }

}
