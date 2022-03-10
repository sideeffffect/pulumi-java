// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TCPSocketActionResponse {
    /**
     * (Optional) Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    private final String host;
    /**
     * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. This field is currently limited to integer types only because of proto's inability to properly support the IntOrString golang type.
     * 
     */
    private final Integer port;

    @OutputCustomType.Constructor
    private TCPSocketActionResponse(
        @OutputCustomType.Parameter("host") String host,
        @OutputCustomType.Parameter("port") Integer port) {
        this.host = host;
        this.port = port;
    }

    /**
     * (Optional) Optional: Host name to connect to, defaults to the pod IP.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME. This field is currently limited to integer types only because of proto's inability to properly support the IntOrString golang type.
     * 
    */
    public Integer getPort() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TCPSocketActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(TCPSocketActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public TCPSocketActionResponse build() {
            return new TCPSocketActionResponse(host, port);
        }
    }
}
