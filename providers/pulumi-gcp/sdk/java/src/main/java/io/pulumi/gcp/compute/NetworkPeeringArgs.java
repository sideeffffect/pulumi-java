// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkPeeringArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkPeeringArgs Empty = new NetworkPeeringArgs();

    /**
     * Whether to export the custom routes to the peer network. Defaults to `false`.
     * 
     */
    @InputImport(name="exportCustomRoutes")
      private final @Nullable Input<Boolean> exportCustomRoutes;

    public Input<Boolean> getExportCustomRoutes() {
        return this.exportCustomRoutes == null ? Input.empty() : this.exportCustomRoutes;
    }

    /**
     * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always exported to peers and are not controlled by this field.
     * 
     */
    @InputImport(name="exportSubnetRoutesWithPublicIp")
      private final @Nullable Input<Boolean> exportSubnetRoutesWithPublicIp;

    public Input<Boolean> getExportSubnetRoutesWithPublicIp() {
        return this.exportSubnetRoutesWithPublicIp == null ? Input.empty() : this.exportSubnetRoutesWithPublicIp;
    }

    /**
     * Whether to import the custom routes from the peer network. Defaults to `false`.
     * 
     */
    @InputImport(name="importCustomRoutes")
      private final @Nullable Input<Boolean> importCustomRoutes;

    public Input<Boolean> getImportCustomRoutes() {
        return this.importCustomRoutes == null ? Input.empty() : this.importCustomRoutes;
    }

    /**
     * Whether subnet routes with public IP range are imported. The default value is false. The IPv4 special-use ranges (https://en.wikipedia.org/wiki/IPv4#Special_addresses) are always imported from peers and are not controlled by this field.
     * 
     */
    @InputImport(name="importSubnetRoutesWithPublicIp")
      private final @Nullable Input<Boolean> importSubnetRoutesWithPublicIp;

    public Input<Boolean> getImportSubnetRoutesWithPublicIp() {
        return this.importSubnetRoutesWithPublicIp == null ? Input.empty() : this.importSubnetRoutesWithPublicIp;
    }

    /**
     * Name of the peering.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The primary network of the peering.
     * 
     */
    @InputImport(name="network", required=true)
      private final Input<String> network;

    public Input<String> getNetwork() {
        return this.network;
    }

    /**
     * The peer network in the peering. The peer network
     * may belong to a different project.
     * 
     */
    @InputImport(name="peerNetwork", required=true)
      private final Input<String> peerNetwork;

    public Input<String> getPeerNetwork() {
        return this.peerNetwork;
    }

    public NetworkPeeringArgs(
        @Nullable Input<Boolean> exportCustomRoutes,
        @Nullable Input<Boolean> exportSubnetRoutesWithPublicIp,
        @Nullable Input<Boolean> importCustomRoutes,
        @Nullable Input<Boolean> importSubnetRoutesWithPublicIp,
        @Nullable Input<String> name,
        Input<String> network,
        Input<String> peerNetwork) {
        this.exportCustomRoutes = exportCustomRoutes;
        this.exportSubnetRoutesWithPublicIp = exportSubnetRoutesWithPublicIp;
        this.importCustomRoutes = importCustomRoutes;
        this.importSubnetRoutesWithPublicIp = importSubnetRoutesWithPublicIp;
        this.name = name;
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.peerNetwork = Objects.requireNonNull(peerNetwork, "expected parameter 'peerNetwork' to be non-null");
    }

    private NetworkPeeringArgs() {
        this.exportCustomRoutes = Input.empty();
        this.exportSubnetRoutesWithPublicIp = Input.empty();
        this.importCustomRoutes = Input.empty();
        this.importSubnetRoutesWithPublicIp = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.peerNetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> exportCustomRoutes;
        private @Nullable Input<Boolean> exportSubnetRoutesWithPublicIp;
        private @Nullable Input<Boolean> importCustomRoutes;
        private @Nullable Input<Boolean> importSubnetRoutesWithPublicIp;
        private @Nullable Input<String> name;
        private Input<String> network;
        private Input<String> peerNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exportCustomRoutes = defaults.exportCustomRoutes;
    	      this.exportSubnetRoutesWithPublicIp = defaults.exportSubnetRoutesWithPublicIp;
    	      this.importCustomRoutes = defaults.importCustomRoutes;
    	      this.importSubnetRoutesWithPublicIp = defaults.importSubnetRoutesWithPublicIp;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.peerNetwork = defaults.peerNetwork;
        }

        public Builder exportCustomRoutes(@Nullable Input<Boolean> exportCustomRoutes) {
            this.exportCustomRoutes = exportCustomRoutes;
            return this;
        }

        public Builder exportCustomRoutes(@Nullable Boolean exportCustomRoutes) {
            this.exportCustomRoutes = Input.ofNullable(exportCustomRoutes);
            return this;
        }

        public Builder exportSubnetRoutesWithPublicIp(@Nullable Input<Boolean> exportSubnetRoutesWithPublicIp) {
            this.exportSubnetRoutesWithPublicIp = exportSubnetRoutesWithPublicIp;
            return this;
        }

        public Builder exportSubnetRoutesWithPublicIp(@Nullable Boolean exportSubnetRoutesWithPublicIp) {
            this.exportSubnetRoutesWithPublicIp = Input.ofNullable(exportSubnetRoutesWithPublicIp);
            return this;
        }

        public Builder importCustomRoutes(@Nullable Input<Boolean> importCustomRoutes) {
            this.importCustomRoutes = importCustomRoutes;
            return this;
        }

        public Builder importCustomRoutes(@Nullable Boolean importCustomRoutes) {
            this.importCustomRoutes = Input.ofNullable(importCustomRoutes);
            return this;
        }

        public Builder importSubnetRoutesWithPublicIp(@Nullable Input<Boolean> importSubnetRoutesWithPublicIp) {
            this.importSubnetRoutesWithPublicIp = importSubnetRoutesWithPublicIp;
            return this;
        }

        public Builder importSubnetRoutesWithPublicIp(@Nullable Boolean importSubnetRoutesWithPublicIp) {
            this.importSubnetRoutesWithPublicIp = Input.ofNullable(importSubnetRoutesWithPublicIp);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder network(Input<String> network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder network(String network) {
            this.network = Input.of(Objects.requireNonNull(network));
            return this;
        }

        public Builder peerNetwork(Input<String> peerNetwork) {
            this.peerNetwork = Objects.requireNonNull(peerNetwork);
            return this;
        }

        public Builder peerNetwork(String peerNetwork) {
            this.peerNetwork = Input.of(Objects.requireNonNull(peerNetwork));
            return this;
        }
        public NetworkPeeringArgs build() {
            return new NetworkPeeringArgs(exportCustomRoutes, exportSubnetRoutesWithPublicIp, importCustomRoutes, importSubnetRoutesWithPublicIp, name, network, peerNetwork);
        }
    }
}
