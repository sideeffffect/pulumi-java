// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A routing configuration attached to a network resource. The message includes the list of routers associated with the network, and a flag indicating the type of routing behavior to enforce network-wide.
 * 
 */
public final class NetworkRoutingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkRoutingConfigResponse Empty = new NetworkRoutingConfigResponse();

    /**
     * The network-wide routing mode to use. If set to REGIONAL, this network's Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network's Cloud Routers will advertise routes with all subnets of this network, across regions.
     * 
     */
    @Import(name="routingMode", required=true)
      private final String routingMode;

    public String routingMode() {
        return this.routingMode;
    }

    public NetworkRoutingConfigResponse(String routingMode) {
        this.routingMode = Objects.requireNonNull(routingMode, "expected parameter 'routingMode' to be non-null");
    }

    private NetworkRoutingConfigResponse() {
        this.routingMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRoutingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String routingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRoutingConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.routingMode = defaults.routingMode;
        }

        public Builder routingMode(String routingMode) {
            this.routingMode = Objects.requireNonNull(routingMode);
            return this;
        }        public NetworkRoutingConfigResponse build() {
            return new NetworkRoutingConfigResponse(routingMode);
        }
    }
}
