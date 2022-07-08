// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UDPHealthCheckResponse {
    /**
     * @return The UDP port number for the health check request. Valid values are 1 through 65535.
     * 
     */
    private final Integer port;
    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    private final String portName;
    /**
     * @return Raw data of request to send in payload of UDP packet. It is an error if this is empty. The request data can only be ASCII.
     * 
     */
    private final String request;
    /**
     * @return The bytes to match against the beginning of the response data. It is an error if this is empty. The response data can only be ASCII.
     * 
     */
    private final String response;

    @CustomType.Constructor
    private UDPHealthCheckResponse(
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("portName") String portName,
        @CustomType.Parameter("request") String request,
        @CustomType.Parameter("response") String response) {
        this.port = port;
        this.portName = portName;
        this.request = request;
        this.response = response;
    }

    /**
     * @return The UDP port number for the health check request. Valid values are 1 through 65535.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence.
     * 
     */
    public String portName() {
        return this.portName;
    }
    /**
     * @return Raw data of request to send in payload of UDP packet. It is an error if this is empty. The request data can only be ASCII.
     * 
     */
    public String request() {
        return this.request;
    }
    /**
     * @return The bytes to match against the beginning of the response data. It is an error if this is empty. The response data can only be ASCII.
     * 
     */
    public String response() {
        return this.response;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UDPHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String portName;
        private String request;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(UDPHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder portName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }
        public Builder request(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }
        public Builder response(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }        public UDPHealthCheckResponse build() {
            return new UDPHealthCheckResponse(port, portName, request, response);
        }
    }
}
