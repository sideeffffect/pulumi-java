// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LocationHdfsNameNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationHdfsNameNodeArgs Empty = new LocationHdfsNameNodeArgs();

    /**
     * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent that's installed on-premises uses this hostname to communicate with the NameNode in the network.
     * 
     */
    @InputImport(name="hostname", required=true)
      private final Input<String> hostname;

    public Input<String> getHostname() {
        return this.hostname;
    }

    /**
     * The port that the NameNode uses to listen to client requests.
     * 
     */
    @InputImport(name="port", required=true)
      private final Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port;
    }

    public LocationHdfsNameNodeArgs(
        Input<String> hostname,
        Input<Integer> port) {
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private LocationHdfsNameNodeArgs() {
        this.hostname = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHdfsNameNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> hostname;
        private Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHdfsNameNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.port = defaults.port;
        }

        public Builder hostname(Input<String> hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }

        public Builder hostname(String hostname) {
            this.hostname = Input.of(Objects.requireNonNull(hostname));
            return this;
        }

        public Builder port(Input<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Input.of(Objects.requireNonNull(port));
            return this;
        }
        public LocationHdfsNameNodeArgs build() {
            return new LocationHdfsNameNodeArgs(hostname, port);
        }
    }
}
