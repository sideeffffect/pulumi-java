// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET.
 * 
 */
public final class VirtualNetworkBgpCommunitiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkBgpCommunitiesResponse Empty = new VirtualNetworkBgpCommunitiesResponse();

    /**
     * The BGP community associated with the region of the virtual network.
     * 
     */
    @Import(name="regionalCommunity", required=true)
      private final String regionalCommunity;

    public String regionalCommunity() {
        return this.regionalCommunity;
    }

    /**
     * The BGP community associated with the virtual network.
     * 
     */
    @Import(name="virtualNetworkCommunity", required=true)
      private final String virtualNetworkCommunity;

    public String virtualNetworkCommunity() {
        return this.virtualNetworkCommunity;
    }

    public VirtualNetworkBgpCommunitiesResponse(
        String regionalCommunity,
        String virtualNetworkCommunity) {
        this.regionalCommunity = Objects.requireNonNull(regionalCommunity, "expected parameter 'regionalCommunity' to be non-null");
        this.virtualNetworkCommunity = Objects.requireNonNull(virtualNetworkCommunity, "expected parameter 'virtualNetworkCommunity' to be non-null");
    }

    private VirtualNetworkBgpCommunitiesResponse() {
        this.regionalCommunity = null;
        this.virtualNetworkCommunity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkBgpCommunitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String regionalCommunity;
        private String virtualNetworkCommunity;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkBgpCommunitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regionalCommunity = defaults.regionalCommunity;
    	      this.virtualNetworkCommunity = defaults.virtualNetworkCommunity;
        }

        public Builder regionalCommunity(String regionalCommunity) {
            this.regionalCommunity = Objects.requireNonNull(regionalCommunity);
            return this;
        }
        public Builder virtualNetworkCommunity(String virtualNetworkCommunity) {
            this.virtualNetworkCommunity = Objects.requireNonNull(virtualNetworkCommunity);
            return this;
        }        public VirtualNetworkBgpCommunitiesResponse build() {
            return new VirtualNetworkBgpCommunitiesResponse(regionalCommunity, virtualNetworkCommunity);
        }
    }
}
