// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a load balancing rule.
 * 
 */
public final class LoadBalancingRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final LoadBalancingRuleResponse Empty = new LoadBalancingRuleResponse();

    /**
     * The port used for internal connections on the endpoint. Acceptable values are between 1 and 65535.
     * 
     */
    @InputImport(name="backendPort", required=true)
      private final Integer backendPort;

    public Integer getBackendPort() {
        return this.backendPort;
    }

    /**
     * The port for the external endpoint. Port numbers for each rule must be unique within the Load Balancer. Acceptable values are between 1 and 65534.
     * 
     */
    @InputImport(name="frontendPort", required=true)
      private final Integer frontendPort;

    public Integer getFrontendPort() {
        return this.frontendPort;
    }

    /**
     * the reference to the load balancer probe used by the load balancing rule.
     * 
     */
    @InputImport(name="probeProtocol", required=true)
      private final String probeProtocol;

    public String getProbeProtocol() {
        return this.probeProtocol;
    }

    /**
     * The probe request path. Only supported for HTTP/HTTPS probes.
     * 
     */
    @InputImport(name="probeRequestPath")
      private final @Nullable String probeRequestPath;

    public Optional<String> getProbeRequestPath() {
        return this.probeRequestPath == null ? Optional.empty() : Optional.ofNullable(this.probeRequestPath);
    }

    /**
     * The reference to the transport protocol used by the load balancing rule.
     * 
     */
    @InputImport(name="protocol", required=true)
      private final String protocol;

    public String getProtocol() {
        return this.protocol;
    }

    public LoadBalancingRuleResponse(
        Integer backendPort,
        Integer frontendPort,
        String probeProtocol,
        @Nullable String probeRequestPath,
        String protocol) {
        this.backendPort = Objects.requireNonNull(backendPort, "expected parameter 'backendPort' to be non-null");
        this.frontendPort = Objects.requireNonNull(frontendPort, "expected parameter 'frontendPort' to be non-null");
        this.probeProtocol = Objects.requireNonNull(probeProtocol, "expected parameter 'probeProtocol' to be non-null");
        this.probeRequestPath = probeRequestPath;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
    }

    private LoadBalancingRuleResponse() {
        this.backendPort = null;
        this.frontendPort = null;
        this.probeProtocol = null;
        this.probeRequestPath = null;
        this.protocol = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancingRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer backendPort;
        private Integer frontendPort;
        private String probeProtocol;
        private @Nullable String probeRequestPath;
        private String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancingRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendPort = defaults.backendPort;
    	      this.frontendPort = defaults.frontendPort;
    	      this.probeProtocol = defaults.probeProtocol;
    	      this.probeRequestPath = defaults.probeRequestPath;
    	      this.protocol = defaults.protocol;
        }

        public Builder backendPort(Integer backendPort) {
            this.backendPort = Objects.requireNonNull(backendPort);
            return this;
        }

        public Builder frontendPort(Integer frontendPort) {
            this.frontendPort = Objects.requireNonNull(frontendPort);
            return this;
        }

        public Builder probeProtocol(String probeProtocol) {
            this.probeProtocol = Objects.requireNonNull(probeProtocol);
            return this;
        }

        public Builder probeRequestPath(@Nullable String probeRequestPath) {
            this.probeRequestPath = probeRequestPath;
            return this;
        }

        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public LoadBalancingRuleResponse build() {
            return new LoadBalancingRuleResponse(backendPort, frontendPort, probeProtocol, probeRequestPath, protocol);
        }
    }
}
