// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.beyondcorp.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DestinationRouteResponse {
    /**
     * @return The network address of the subnet for which the packet is routed to the ClientGateway.
     * 
     */
    private final String address;
    /**
     * @return The network mask of the subnet for which the packet is routed to the ClientGateway.
     * 
     */
    private final String netmask;

    @CustomType.Constructor
    private DestinationRouteResponse(
        @CustomType.Parameter("address") String address,
        @CustomType.Parameter("netmask") String netmask) {
        this.address = address;
        this.netmask = netmask;
    }

    /**
     * @return The network address of the subnet for which the packet is routed to the ClientGateway.
     * 
     */
    public String address() {
        return this.address;
    }
    /**
     * @return The network mask of the subnet for which the packet is routed to the ClientGateway.
     * 
     */
    public String netmask() {
        return this.netmask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String netmask;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.netmask = defaults.netmask;
        }

        public Builder address(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }
        public Builder netmask(String netmask) {
            this.netmask = Objects.requireNonNull(netmask);
            return this;
        }        public DestinationRouteResponse build() {
            return new DestinationRouteResponse(address, netmask);
        }
    }
}
