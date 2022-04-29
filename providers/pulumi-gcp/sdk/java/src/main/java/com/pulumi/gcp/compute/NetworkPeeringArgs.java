// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkPeeringArgs extends ResourceArgs {

    public static final NetworkPeeringArgs Empty = new NetworkPeeringArgs();

    /**
     * Whether to export the custom routes to the peer network. Defaults to `false`.
     * 
     */
    @Import(name="exportCustomRoutes")
    private @Nullable Output<Boolean> exportCustomRoutes;

    /**
     * @return Whether to export the custom routes to the peer network. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> exportCustomRoutes() {
        return Optional.ofNullable(this.exportCustomRoutes);
    }

    /**
     * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
     * 
     */
    @Import(name="exportSubnetRoutesWithPublicIp")
    private @Nullable Output<Boolean> exportSubnetRoutesWithPublicIp;

    /**
     * @return Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
     * 
     */
    public Optional<Output<Boolean>> exportSubnetRoutesWithPublicIp() {
        return Optional.ofNullable(this.exportSubnetRoutesWithPublicIp);
    }

    /**
     * Whether to import the custom routes from the peer network. Defaults to `false`.
     * 
     */
    @Import(name="importCustomRoutes")
    private @Nullable Output<Boolean> importCustomRoutes;

    /**
     * @return Whether to import the custom routes from the peer network. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> importCustomRoutes() {
        return Optional.ofNullable(this.importCustomRoutes);
    }

    /**
     * Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported from peers and are not controlled by this field.
     * 
     */
    @Import(name="importSubnetRoutesWithPublicIp")
    private @Nullable Output<Boolean> importSubnetRoutesWithPublicIp;

    /**
     * @return Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported from peers and are not controlled by this field.
     * 
     */
    public Optional<Output<Boolean>> importSubnetRoutesWithPublicIp() {
        return Optional.ofNullable(this.importSubnetRoutesWithPublicIp);
    }

    /**
     * Name of the peering.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the peering.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The primary network of the peering.
     * 
     */
    @Import(name="network", required=true)
    private Output<String> network;

    /**
     * @return The primary network of the peering.
     * 
     */
    public Output<String> network() {
        return this.network;
    }

    /**
     * The peer network in the peering. The peer network
     * may belong to a different project.
     * 
     */
    @Import(name="peerNetwork", required=true)
    private Output<String> peerNetwork;

    /**
     * @return The peer network in the peering. The peer network
     * may belong to a different project.
     * 
     */
    public Output<String> peerNetwork() {
        return this.peerNetwork;
    }

    private NetworkPeeringArgs() {}

    private NetworkPeeringArgs(NetworkPeeringArgs $) {
        this.exportCustomRoutes = $.exportCustomRoutes;
        this.exportSubnetRoutesWithPublicIp = $.exportSubnetRoutesWithPublicIp;
        this.importCustomRoutes = $.importCustomRoutes;
        this.importSubnetRoutesWithPublicIp = $.importSubnetRoutesWithPublicIp;
        this.name = $.name;
        this.network = $.network;
        this.peerNetwork = $.peerNetwork;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkPeeringArgs $;

        public Builder() {
            $ = new NetworkPeeringArgs();
        }

        public Builder(NetworkPeeringArgs defaults) {
            $ = new NetworkPeeringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param exportCustomRoutes Whether to export the custom routes to the peer network. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder exportCustomRoutes(@Nullable Output<Boolean> exportCustomRoutes) {
            $.exportCustomRoutes = exportCustomRoutes;
            return this;
        }

        /**
         * @param exportCustomRoutes Whether to export the custom routes to the peer network. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder exportCustomRoutes(Boolean exportCustomRoutes) {
            return exportCustomRoutes(Output.of(exportCustomRoutes));
        }

        /**
         * @param exportSubnetRoutesWithPublicIp Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
         * 
         * @return builder
         * 
         */
        public Builder exportSubnetRoutesWithPublicIp(@Nullable Output<Boolean> exportSubnetRoutesWithPublicIp) {
            $.exportSubnetRoutesWithPublicIp = exportSubnetRoutesWithPublicIp;
            return this;
        }

        /**
         * @param exportSubnetRoutesWithPublicIp Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
         * 
         * @return builder
         * 
         */
        public Builder exportSubnetRoutesWithPublicIp(Boolean exportSubnetRoutesWithPublicIp) {
            return exportSubnetRoutesWithPublicIp(Output.of(exportSubnetRoutesWithPublicIp));
        }

        /**
         * @param importCustomRoutes Whether to import the custom routes from the peer network. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder importCustomRoutes(@Nullable Output<Boolean> importCustomRoutes) {
            $.importCustomRoutes = importCustomRoutes;
            return this;
        }

        /**
         * @param importCustomRoutes Whether to import the custom routes from the peer network. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder importCustomRoutes(Boolean importCustomRoutes) {
            return importCustomRoutes(Output.of(importCustomRoutes));
        }

        /**
         * @param importSubnetRoutesWithPublicIp Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported from peers and are not controlled by this field.
         * 
         * @return builder
         * 
         */
        public Builder importSubnetRoutesWithPublicIp(@Nullable Output<Boolean> importSubnetRoutesWithPublicIp) {
            $.importSubnetRoutesWithPublicIp = importSubnetRoutesWithPublicIp;
            return this;
        }

        /**
         * @param importSubnetRoutesWithPublicIp Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported from peers and are not controlled by this field.
         * 
         * @return builder
         * 
         */
        public Builder importSubnetRoutesWithPublicIp(Boolean importSubnetRoutesWithPublicIp) {
            return importSubnetRoutesWithPublicIp(Output.of(importSubnetRoutesWithPublicIp));
        }

        /**
         * @param name Name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the peering.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param network The primary network of the peering.
         * 
         * @return builder
         * 
         */
        public Builder network(Output<String> network) {
            $.network = network;
            return this;
        }

        /**
         * @param network The primary network of the peering.
         * 
         * @return builder
         * 
         */
        public Builder network(String network) {
            return network(Output.of(network));
        }

        /**
         * @param peerNetwork The peer network in the peering. The peer network
         * may belong to a different project.
         * 
         * @return builder
         * 
         */
        public Builder peerNetwork(Output<String> peerNetwork) {
            $.peerNetwork = peerNetwork;
            return this;
        }

        /**
         * @param peerNetwork The peer network in the peering. The peer network
         * may belong to a different project.
         * 
         * @return builder
         * 
         */
        public Builder peerNetwork(String peerNetwork) {
            return peerNetwork(Output.of(peerNetwork));
        }

        public NetworkPeeringArgs build() {
            $.network = Objects.requireNonNull($.network, "expected parameter 'network' to be non-null");
            $.peerNetwork = Objects.requireNonNull($.peerNetwork, "expected parameter 'peerNetwork' to be non-null");
            return $;
        }
    }

}
