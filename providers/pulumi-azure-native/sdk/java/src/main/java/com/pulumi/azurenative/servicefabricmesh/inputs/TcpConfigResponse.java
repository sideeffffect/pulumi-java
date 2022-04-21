// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.azurenative.servicefabricmesh.inputs.GatewayDestinationResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the tcp configuration for external connectivity for this network.
 * 
 */
public final class TcpConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final TcpConfigResponse Empty = new TcpConfigResponse();

    /**
     * Describes destination endpoint for routing traffic.
     * 
     */
    @Import(name="destination", required=true)
    private GatewayDestinationResponse destination;

    public GatewayDestinationResponse destination() {
        return this.destination;
    }

    /**
     * tcp gateway config name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Specifies the port at which the service endpoint below needs to be exposed.
     * 
     */
    @Import(name="port", required=true)
    private Integer port;

    public Integer port() {
        return this.port;
    }

    private TcpConfigResponse() {}

    private TcpConfigResponse(TcpConfigResponse $) {
        this.destination = $.destination;
        this.name = $.name;
        this.port = $.port;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TcpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TcpConfigResponse $;

        public Builder() {
            $ = new TcpConfigResponse();
        }

        public Builder(TcpConfigResponse defaults) {
            $ = new TcpConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder destination(GatewayDestinationResponse destination) {
            $.destination = destination;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder port(Integer port) {
            $.port = port;
            return this;
        }

        public TcpConfigResponse build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.port = Objects.requireNonNull($.port, "expected parameter 'port' to be non-null");
            return $;
        }
    }

}
