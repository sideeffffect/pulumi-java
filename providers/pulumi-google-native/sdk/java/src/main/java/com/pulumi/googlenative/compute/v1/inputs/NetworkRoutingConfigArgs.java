// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute.v1.enums.NetworkRoutingConfigRoutingMode;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A routing configuration attached to a network resource. The message includes the list of routers associated with the network, and a flag indicating the type of routing behavior to enforce network-wide.
 * 
 */
public final class NetworkRoutingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkRoutingConfigArgs Empty = new NetworkRoutingConfigArgs();

    /**
     * The network-wide routing mode to use. If set to REGIONAL, this network&#39;s Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network&#39;s Cloud Routers will advertise routes with all subnets of this network, across regions.
     * 
     */
    @Import(name="routingMode")
    private @Nullable Output<NetworkRoutingConfigRoutingMode> routingMode;

    /**
     * @return The network-wide routing mode to use. If set to REGIONAL, this network&#39;s Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network&#39;s Cloud Routers will advertise routes with all subnets of this network, across regions.
     * 
     */
    public Optional<Output<NetworkRoutingConfigRoutingMode>> routingMode() {
        return Optional.ofNullable(this.routingMode);
    }

    private NetworkRoutingConfigArgs() {}

    private NetworkRoutingConfigArgs(NetworkRoutingConfigArgs $) {
        this.routingMode = $.routingMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkRoutingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkRoutingConfigArgs $;

        public Builder() {
            $ = new NetworkRoutingConfigArgs();
        }

        public Builder(NetworkRoutingConfigArgs defaults) {
            $ = new NetworkRoutingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param routingMode The network-wide routing mode to use. If set to REGIONAL, this network&#39;s Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network&#39;s Cloud Routers will advertise routes with all subnets of this network, across regions.
         * 
         * @return builder
         * 
         */
        public Builder routingMode(@Nullable Output<NetworkRoutingConfigRoutingMode> routingMode) {
            $.routingMode = routingMode;
            return this;
        }

        /**
         * @param routingMode The network-wide routing mode to use. If set to REGIONAL, this network&#39;s Cloud Routers will only advertise routes with subnets of this network in the same region as the router. If set to GLOBAL, this network&#39;s Cloud Routers will advertise routes with all subnets of this network, across regions.
         * 
         * @return builder
         * 
         */
        public Builder routingMode(NetworkRoutingConfigRoutingMode routingMode) {
            return routingMode(Output.of(routingMode));
        }

        public NetworkRoutingConfigArgs build() {
            return $;
        }
    }

}
