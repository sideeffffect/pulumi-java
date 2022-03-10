// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * TCPSocketAction describes an action based on opening a socket
 * 
 */
public final class TCPSocketActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TCPSocketActionArgs Empty = new TCPSocketActionArgs();

    /**
     * Optional: Host name to connect to, defaults to the pod IP.
     * 
     */
    @InputImport(name="host")
      private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    /**
     * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
     * 
     */
    @InputImport(name="port", required=true)
      private final Input<Either<Integer,String>> port;

    public Input<Either<Integer,String>> getPort() {
        return this.port;
    }

    public TCPSocketActionArgs(
        @Nullable Input<String> host,
        Input<Either<Integer,String>> port) {
        this.host = host;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private TCPSocketActionArgs() {
        this.host = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TCPSocketActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> host;
        private Input<Either<Integer,String>> port;

        public Builder() {
    	      // Empty
        }

        public Builder(TCPSocketActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder host(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder host(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder port(Input<Either<Integer,String>> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Either<Integer,String> port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }
        public TCPSocketActionArgs build() {
            return new TCPSocketActionArgs(host, port);
        }
    }
}
