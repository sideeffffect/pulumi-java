// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CircuitResponse {
    /**
     * Identifier of the ExpressRoute Circuit (Microsoft Colo only)
     * 
     */
    private final String expressRouteID;
    /**
     * ExpressRoute Circuit private peering identifier
     * 
     */
    private final String expressRoutePrivatePeeringID;
    /**
     * CIDR of primary subnet
     * 
     */
    private final String primarySubnet;
    /**
     * CIDR of secondary subnet
     * 
     */
    private final String secondarySubnet;

    @CustomType.Constructor
    private CircuitResponse(
        @CustomType.Parameter("expressRouteID") String expressRouteID,
        @CustomType.Parameter("expressRoutePrivatePeeringID") String expressRoutePrivatePeeringID,
        @CustomType.Parameter("primarySubnet") String primarySubnet,
        @CustomType.Parameter("secondarySubnet") String secondarySubnet) {
        this.expressRouteID = expressRouteID;
        this.expressRoutePrivatePeeringID = expressRoutePrivatePeeringID;
        this.primarySubnet = primarySubnet;
        this.secondarySubnet = secondarySubnet;
    }

    /**
     * Identifier of the ExpressRoute Circuit (Microsoft Colo only)
     * 
    */
    public String expressRouteID() {
        return this.expressRouteID;
    }
    /**
     * ExpressRoute Circuit private peering identifier
     * 
    */
    public String expressRoutePrivatePeeringID() {
        return this.expressRoutePrivatePeeringID;
    }
    /**
     * CIDR of primary subnet
     * 
    */
    public String primarySubnet() {
        return this.primarySubnet;
    }
    /**
     * CIDR of secondary subnet
     * 
    */
    public String secondarySubnet() {
        return this.secondarySubnet;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CircuitResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expressRouteID;
        private String expressRoutePrivatePeeringID;
        private String primarySubnet;
        private String secondarySubnet;

        public Builder() {
    	      // Empty
        }

        public Builder(CircuitResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expressRouteID = defaults.expressRouteID;
    	      this.expressRoutePrivatePeeringID = defaults.expressRoutePrivatePeeringID;
    	      this.primarySubnet = defaults.primarySubnet;
    	      this.secondarySubnet = defaults.secondarySubnet;
        }

        public Builder expressRouteID(String expressRouteID) {
            this.expressRouteID = Objects.requireNonNull(expressRouteID);
            return this;
        }
        public Builder expressRoutePrivatePeeringID(String expressRoutePrivatePeeringID) {
            this.expressRoutePrivatePeeringID = Objects.requireNonNull(expressRoutePrivatePeeringID);
            return this;
        }
        public Builder primarySubnet(String primarySubnet) {
            this.primarySubnet = Objects.requireNonNull(primarySubnet);
            return this;
        }
        public Builder secondarySubnet(String secondarySubnet) {
            this.secondarySubnet = Objects.requireNonNull(secondarySubnet);
            return this;
        }        public CircuitResponse build() {
            return new CircuitResponse(expressRouteID, expressRoutePrivatePeeringID, primarySubnet, secondarySubnet);
        }
    }
}
