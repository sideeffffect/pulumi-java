// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GatewayRouteResponse {
    /**
     * The route's AS path sequence.
     * 
     */
    private final String asPath;
    /**
     * The gateway's local address.
     * 
     */
    private final String localAddress;
    /**
     * The route's network prefix.
     * 
     */
    private final String network;
    /**
     * The route's next hop.
     * 
     */
    private final String nextHop;
    /**
     * The source this route was learned from.
     * 
     */
    private final String origin;
    /**
     * The peer this route was learned from.
     * 
     */
    private final String sourcePeer;
    /**
     * The route's weight.
     * 
     */
    private final Integer weight;

    @OutputCustomType.Constructor({"asPath","localAddress","network","nextHop","origin","sourcePeer","weight"})
    private GatewayRouteResponse(
        String asPath,
        String localAddress,
        String network,
        String nextHop,
        String origin,
        String sourcePeer,
        Integer weight) {
        this.asPath = asPath;
        this.localAddress = localAddress;
        this.network = network;
        this.nextHop = nextHop;
        this.origin = origin;
        this.sourcePeer = sourcePeer;
        this.weight = weight;
    }

    /**
     * The route's AS path sequence.
     * 
    */
    public String getAsPath() {
        return this.asPath;
    }
    /**
     * The gateway's local address.
     * 
    */
    public String getLocalAddress() {
        return this.localAddress;
    }
    /**
     * The route's network prefix.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * The route's next hop.
     * 
    */
    public String getNextHop() {
        return this.nextHop;
    }
    /**
     * The source this route was learned from.
     * 
    */
    public String getOrigin() {
        return this.origin;
    }
    /**
     * The peer this route was learned from.
     * 
    */
    public String getSourcePeer() {
        return this.sourcePeer;
    }
    /**
     * The route's weight.
     * 
    */
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String asPath;
        private String localAddress;
        private String network;
        private String nextHop;
        private String origin;
        private String sourcePeer;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asPath = defaults.asPath;
    	      this.localAddress = defaults.localAddress;
    	      this.network = defaults.network;
    	      this.nextHop = defaults.nextHop;
    	      this.origin = defaults.origin;
    	      this.sourcePeer = defaults.sourcePeer;
    	      this.weight = defaults.weight;
        }

        public Builder setAsPath(String asPath) {
            this.asPath = Objects.requireNonNull(asPath);
            return this;
        }

        public Builder setLocalAddress(String localAddress) {
            this.localAddress = Objects.requireNonNull(localAddress);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNextHop(String nextHop) {
            this.nextHop = Objects.requireNonNull(nextHop);
            return this;
        }

        public Builder setOrigin(String origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }

        public Builder setSourcePeer(String sourcePeer) {
            this.sourcePeer = Objects.requireNonNull(sourcePeer);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public GatewayRouteResponse build() {
            return new GatewayRouteResponse(asPath, localAddress, network, nextHop, origin, sourcePeer, weight);
        }
    }
}
