// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * BGP peer status details.
 * 
 */
public final class BgpPeerStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final BgpPeerStatusResponse Empty = new BgpPeerStatusResponse();

    /**
     * The autonomous system number of the remote BGP peer.
     * 
     */
    @InputImport(name="asn", required=true)
      private final Double asn;

    public Double getAsn() {
        return this.asn;
    }

    /**
     * For how long the peering has been up.
     * 
     */
    @InputImport(name="connectedDuration", required=true)
      private final String connectedDuration;

    public String getConnectedDuration() {
        return this.connectedDuration;
    }

    /**
     * The virtual network gateway's local address.
     * 
     */
    @InputImport(name="localAddress", required=true)
      private final String localAddress;

    public String getLocalAddress() {
        return this.localAddress;
    }

    /**
     * The number of BGP messages received.
     * 
     */
    @InputImport(name="messagesReceived", required=true)
      private final Double messagesReceived;

    public Double getMessagesReceived() {
        return this.messagesReceived;
    }

    /**
     * The number of BGP messages sent.
     * 
     */
    @InputImport(name="messagesSent", required=true)
      private final Double messagesSent;

    public Double getMessagesSent() {
        return this.messagesSent;
    }

    /**
     * The remote BGP peer.
     * 
     */
    @InputImport(name="neighbor", required=true)
      private final String neighbor;

    public String getNeighbor() {
        return this.neighbor;
    }

    /**
     * The number of routes learned from this peer.
     * 
     */
    @InputImport(name="routesReceived", required=true)
      private final Double routesReceived;

    public Double getRoutesReceived() {
        return this.routesReceived;
    }

    /**
     * The BGP peer state.
     * 
     */
    @InputImport(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public BgpPeerStatusResponse(
        Double asn,
        String connectedDuration,
        String localAddress,
        Double messagesReceived,
        Double messagesSent,
        String neighbor,
        Double routesReceived,
        String state) {
        this.asn = Objects.requireNonNull(asn, "expected parameter 'asn' to be non-null");
        this.connectedDuration = Objects.requireNonNull(connectedDuration, "expected parameter 'connectedDuration' to be non-null");
        this.localAddress = Objects.requireNonNull(localAddress, "expected parameter 'localAddress' to be non-null");
        this.messagesReceived = Objects.requireNonNull(messagesReceived, "expected parameter 'messagesReceived' to be non-null");
        this.messagesSent = Objects.requireNonNull(messagesSent, "expected parameter 'messagesSent' to be non-null");
        this.neighbor = Objects.requireNonNull(neighbor, "expected parameter 'neighbor' to be non-null");
        this.routesReceived = Objects.requireNonNull(routesReceived, "expected parameter 'routesReceived' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private BgpPeerStatusResponse() {
        this.asn = null;
        this.connectedDuration = null;
        this.localAddress = null;
        this.messagesReceived = null;
        this.messagesSent = null;
        this.neighbor = null;
        this.routesReceived = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BgpPeerStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double asn;
        private String connectedDuration;
        private String localAddress;
        private Double messagesReceived;
        private Double messagesSent;
        private String neighbor;
        private Double routesReceived;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(BgpPeerStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asn = defaults.asn;
    	      this.connectedDuration = defaults.connectedDuration;
    	      this.localAddress = defaults.localAddress;
    	      this.messagesReceived = defaults.messagesReceived;
    	      this.messagesSent = defaults.messagesSent;
    	      this.neighbor = defaults.neighbor;
    	      this.routesReceived = defaults.routesReceived;
    	      this.state = defaults.state;
        }

        public Builder asn(Double asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }

        public Builder connectedDuration(String connectedDuration) {
            this.connectedDuration = Objects.requireNonNull(connectedDuration);
            return this;
        }

        public Builder localAddress(String localAddress) {
            this.localAddress = Objects.requireNonNull(localAddress);
            return this;
        }

        public Builder messagesReceived(Double messagesReceived) {
            this.messagesReceived = Objects.requireNonNull(messagesReceived);
            return this;
        }

        public Builder messagesSent(Double messagesSent) {
            this.messagesSent = Objects.requireNonNull(messagesSent);
            return this;
        }

        public Builder neighbor(String neighbor) {
            this.neighbor = Objects.requireNonNull(neighbor);
            return this;
        }

        public Builder routesReceived(Double routesReceived) {
            this.routesReceived = Objects.requireNonNull(routesReceived);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public BgpPeerStatusResponse build() {
            return new BgpPeerStatusResponse(asn, connectedDuration, localAddress, messagesReceived, messagesSent, neighbor, routesReceived, state);
        }
    }
}
