// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NetworkPeeringResponse {
    /**
     * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
     */
    private final Boolean autoCreateRoutes;
    /**
     * Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
     */
    private final Boolean exchangeSubnetRoutes;
    /**
     * Whether to export the custom routes to peer network. The default value is false.
     * 
     */
    private final Boolean exportCustomRoutes;
    /**
     * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. IPv4 special-use ranges are always exported to peers and are not controlled by this field.
     * 
     */
    private final Boolean exportSubnetRoutesWithPublicIp;
    /**
     * Whether to import the custom routes from peer network. The default value is false.
     * 
     */
    private final Boolean importCustomRoutes;
    /**
     * Whether subnet routes with public IP range are imported. The default value is false. IPv4 special-use ranges are always imported from peers and are not controlled by this field.
     * 
     */
    private final Boolean importSubnetRoutesWithPublicIp;
    /**
     * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed that the peer network is in the same project as the current network.
     * 
     */
    private final String network;
    /**
     * Maximum Transmission Unit in bytes.
     * 
     */
    private final Integer peerMtu;
    /**
     * State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE` when there's a matching configuration in the peer network.
     * 
     */
    private final String state;
    /**
     * Details about the current state of the peering.
     * 
     */
    private final String stateDetails;

    @CustomType.Constructor
    private NetworkPeeringResponse(
        @CustomType.Parameter("autoCreateRoutes") Boolean autoCreateRoutes,
        @CustomType.Parameter("exchangeSubnetRoutes") Boolean exchangeSubnetRoutes,
        @CustomType.Parameter("exportCustomRoutes") Boolean exportCustomRoutes,
        @CustomType.Parameter("exportSubnetRoutesWithPublicIp") Boolean exportSubnetRoutesWithPublicIp,
        @CustomType.Parameter("importCustomRoutes") Boolean importCustomRoutes,
        @CustomType.Parameter("importSubnetRoutesWithPublicIp") Boolean importSubnetRoutesWithPublicIp,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("peerMtu") Integer peerMtu,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("stateDetails") String stateDetails) {
        this.autoCreateRoutes = autoCreateRoutes;
        this.exchangeSubnetRoutes = exchangeSubnetRoutes;
        this.exportCustomRoutes = exportCustomRoutes;
        this.exportSubnetRoutesWithPublicIp = exportSubnetRoutesWithPublicIp;
        this.importCustomRoutes = importCustomRoutes;
        this.importSubnetRoutesWithPublicIp = importSubnetRoutesWithPublicIp;
        this.name = name;
        this.network = network;
        this.peerMtu = peerMtu;
        this.state = state;
        this.stateDetails = stateDetails;
    }

    /**
     * This field will be deprecated soon. Use the exchange_subnet_routes field instead. Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
    */
    public Boolean autoCreateRoutes() {
        return this.autoCreateRoutes;
    }
    /**
     * Indicates whether full mesh connectivity is created and managed automatically between peered networks. Currently this field should always be true since Google Compute Engine will automatically create and manage subnetwork routes between two networks when peering state is ACTIVE.
     * 
    */
    public Boolean exchangeSubnetRoutes() {
        return this.exchangeSubnetRoutes;
    }
    /**
     * Whether to export the custom routes to peer network. The default value is false.
     * 
    */
    public Boolean exportCustomRoutes() {
        return this.exportCustomRoutes;
    }
    /**
     * Whether subnet routes with public IP range are exported. The default value is true, all subnet routes are exported. IPv4 special-use ranges are always exported to peers and are not controlled by this field.
     * 
    */
    public Boolean exportSubnetRoutesWithPublicIp() {
        return this.exportSubnetRoutesWithPublicIp;
    }
    /**
     * Whether to import the custom routes from peer network. The default value is false.
     * 
    */
    public Boolean importCustomRoutes() {
        return this.importCustomRoutes;
    }
    /**
     * Whether subnet routes with public IP range are imported. The default value is false. IPv4 special-use ranges are always imported from peers and are not controlled by this field.
     * 
    */
    public Boolean importSubnetRoutesWithPublicIp() {
        return this.importSubnetRoutesWithPublicIp;
    }
    /**
     * Name of this peering. Provided by the client when the peering is created. The name must comply with RFC1035. Specifically, the name must be 1-63 characters long and match regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all the following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The URL of the peer network. It can be either full URL or partial URL. The peer network may belong to a different project. If the partial URL does not contain project, it is assumed that the peer network is in the same project as the current network.
     * 
    */
    public String network() {
        return this.network;
    }
    /**
     * Maximum Transmission Unit in bytes.
     * 
    */
    public Integer peerMtu() {
        return this.peerMtu;
    }
    /**
     * State for the peering, either `ACTIVE` or `INACTIVE`. The peering is `ACTIVE` when there's a matching configuration in the peer network.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Details about the current state of the peering.
     * 
    */
    public String stateDetails() {
        return this.stateDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkPeeringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoCreateRoutes;
        private Boolean exchangeSubnetRoutes;
        private Boolean exportCustomRoutes;
        private Boolean exportSubnetRoutesWithPublicIp;
        private Boolean importCustomRoutes;
        private Boolean importSubnetRoutesWithPublicIp;
        private String name;
        private String network;
        private Integer peerMtu;
        private String state;
        private String stateDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkPeeringResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateRoutes = defaults.autoCreateRoutes;
    	      this.exchangeSubnetRoutes = defaults.exchangeSubnetRoutes;
    	      this.exportCustomRoutes = defaults.exportCustomRoutes;
    	      this.exportSubnetRoutesWithPublicIp = defaults.exportSubnetRoutesWithPublicIp;
    	      this.importCustomRoutes = defaults.importCustomRoutes;
    	      this.importSubnetRoutesWithPublicIp = defaults.importSubnetRoutesWithPublicIp;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.peerMtu = defaults.peerMtu;
    	      this.state = defaults.state;
    	      this.stateDetails = defaults.stateDetails;
        }

        public Builder autoCreateRoutes(Boolean autoCreateRoutes) {
            this.autoCreateRoutes = Objects.requireNonNull(autoCreateRoutes);
            return this;
        }
        public Builder exchangeSubnetRoutes(Boolean exchangeSubnetRoutes) {
            this.exchangeSubnetRoutes = Objects.requireNonNull(exchangeSubnetRoutes);
            return this;
        }
        public Builder exportCustomRoutes(Boolean exportCustomRoutes) {
            this.exportCustomRoutes = Objects.requireNonNull(exportCustomRoutes);
            return this;
        }
        public Builder exportSubnetRoutesWithPublicIp(Boolean exportSubnetRoutesWithPublicIp) {
            this.exportSubnetRoutesWithPublicIp = Objects.requireNonNull(exportSubnetRoutesWithPublicIp);
            return this;
        }
        public Builder importCustomRoutes(Boolean importCustomRoutes) {
            this.importCustomRoutes = Objects.requireNonNull(importCustomRoutes);
            return this;
        }
        public Builder importSubnetRoutesWithPublicIp(Boolean importSubnetRoutesWithPublicIp) {
            this.importSubnetRoutesWithPublicIp = Objects.requireNonNull(importSubnetRoutesWithPublicIp);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder peerMtu(Integer peerMtu) {
            this.peerMtu = Objects.requireNonNull(peerMtu);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder stateDetails(String stateDetails) {
            this.stateDetails = Objects.requireNonNull(stateDetails);
            return this;
        }        public NetworkPeeringResponse build() {
            return new NetworkPeeringResponse(autoCreateRoutes, exchangeSubnetRoutes, exportCustomRoutes, exportSubnetRoutesWithPublicIp, importCustomRoutes, importSubnetRoutesWithPublicIp, name, network, peerMtu, state, stateDetails);
        }
    }
}
