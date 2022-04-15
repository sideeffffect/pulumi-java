// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetHealthCheckSslHealthCheck extends io.pulumi.resources.InvokeArgs {

    public static final GetHealthCheckSslHealthCheck Empty = new GetHealthCheckSslHealthCheck();

    @Import(name="port", required=true)
      private final Integer port;

    public Integer port() {
        return this.port;
    }

    @Import(name="portName", required=true)
      private final String portName;

    public String portName() {
        return this.portName;
    }

    @Import(name="portSpecification", required=true)
      private final String portSpecification;

    public String portSpecification() {
        return this.portSpecification;
    }

    @Import(name="proxyHeader", required=true)
      private final String proxyHeader;

    public String proxyHeader() {
        return this.proxyHeader;
    }

    @Import(name="request", required=true)
      private final String request;

    public String request() {
        return this.request;
    }

    @Import(name="response", required=true)
      private final String response;

    public String response() {
        return this.response;
    }

    public GetHealthCheckSslHealthCheck(
        Integer port,
        String portName,
        String portSpecification,
        String proxyHeader,
        String request,
        String response) {
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.portName = Objects.requireNonNull(portName, "expected parameter 'portName' to be non-null");
        this.portSpecification = Objects.requireNonNull(portSpecification, "expected parameter 'portSpecification' to be non-null");
        this.proxyHeader = Objects.requireNonNull(proxyHeader, "expected parameter 'proxyHeader' to be non-null");
        this.request = Objects.requireNonNull(request, "expected parameter 'request' to be non-null");
        this.response = Objects.requireNonNull(response, "expected parameter 'response' to be non-null");
    }

    private GetHealthCheckSslHealthCheck() {
        this.port = null;
        this.portName = null;
        this.portSpecification = null;
        this.proxyHeader = null;
        this.request = null;
        this.response = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckSslHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer port;
        private String portName;
        private String portSpecification;
        private String proxyHeader;
        private String request;
        private String response;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckSslHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.portName = defaults.portName;
    	      this.portSpecification = defaults.portSpecification;
    	      this.proxyHeader = defaults.proxyHeader;
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
        public Builder portSpecification(String portSpecification) {
            this.portSpecification = Objects.requireNonNull(portSpecification);
            return this;
        }
        public Builder proxyHeader(String proxyHeader) {
            this.proxyHeader = Objects.requireNonNull(proxyHeader);
            return this;
        }
        public Builder request(String request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }
        public Builder response(String response) {
            this.response = Objects.requireNonNull(response);
            return this;
        }        public GetHealthCheckSslHealthCheck build() {
            return new GetHealthCheckSslHealthCheck(port, portName, portSpecification, proxyHeader, request, response);
        }
    }
}
