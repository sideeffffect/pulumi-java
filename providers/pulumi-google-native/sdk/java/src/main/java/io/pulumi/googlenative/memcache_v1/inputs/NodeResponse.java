// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.memcache_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.memcache_v1.inputs.MemcacheParametersResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NodeResponse extends io.pulumi.resources.InvokeArgs {

    public static final NodeResponse Empty = new NodeResponse();

    /**
     * Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
     */
    @InputImport(name="host", required=true)
      private final String host;

    public String getHost() {
        return this.host;
    }

    /**
     * Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
     */
    @InputImport(name="nodeId", required=true)
      private final String nodeId;

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * User defined parameters currently applied to the node.
     * 
     */
    @InputImport(name="parameters", required=true)
      private final MemcacheParametersResponse parameters;

    public MemcacheParametersResponse getParameters() {
        return this.parameters;
    }

    /**
     * The port number of the Memcached server on this node.
     * 
     */
    @InputImport(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    /**
     * Current state of the Memcached node.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Location (GCP Zone) for the Memcached node.
     * 
     */
    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public NodeResponse(
        String host,
        String nodeId,
        MemcacheParametersResponse parameters,
        Integer port,
        String state,
        String zone) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.nodeId = Objects.requireNonNull(nodeId, "expected parameter 'nodeId' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private NodeResponse() {
        this.host = null;
        this.nodeId = null;
        this.parameters = null;
        this.port = null;
        this.state = null;
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private String nodeId;
        private MemcacheParametersResponse parameters;
        private Integer port;
        private String state;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.nodeId = defaults.nodeId;
    	      this.parameters = defaults.parameters;
    	      this.port = defaults.port;
    	      this.state = defaults.state;
    	      this.zone = defaults.zone;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder nodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }

        public Builder parameters(MemcacheParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public NodeResponse build() {
            return new NodeResponse(host, nodeId, parameters, port, state, zone);
        }
    }
}
