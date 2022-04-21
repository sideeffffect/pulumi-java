// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitConnectionResponse;
import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitPeeringConfigResponse;
import com.pulumi.azurenative.network.inputs.ExpressRouteCircuitStatsResponse;
import com.pulumi.azurenative.network.inputs.ExpressRouteConnectionIdResponse;
import com.pulumi.azurenative.network.inputs.Ipv6ExpressRouteCircuitPeeringConfigResponse;
import com.pulumi.azurenative.network.inputs.PeerExpressRouteCircuitConnectionResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Peering in an ExpressRouteCircuit resource.
 * 
 */
public final class ExpressRouteCircuitPeeringResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExpressRouteCircuitPeeringResponse Empty = new ExpressRouteCircuitPeeringResponse();

    /**
     * The Azure ASN.
     * 
     */
    @Import(name="azureASN")
    private @Nullable Integer azureASN;

    public Optional<Integer> azureASN() {
        return Optional.ofNullable(this.azureASN);
    }

    /**
     * The list of circuit connections associated with Azure Private Peering for this circuit.
     * 
     */
    @Import(name="connections")
    private @Nullable List<ExpressRouteCircuitConnectionResponse> connections;

    public Optional<List<ExpressRouteCircuitConnectionResponse>> connections() {
        return Optional.ofNullable(this.connections);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * The ExpressRoute connection.
     * 
     */
    @Import(name="expressRouteConnection")
    private @Nullable ExpressRouteConnectionIdResponse expressRouteConnection;

    public Optional<ExpressRouteConnectionIdResponse> expressRouteConnection() {
        return Optional.ofNullable(this.expressRouteConnection);
    }

    /**
     * The GatewayManager Etag.
     * 
     */
    @Import(name="gatewayManagerEtag")
    private @Nullable String gatewayManagerEtag;

    public Optional<String> gatewayManagerEtag() {
        return Optional.ofNullable(this.gatewayManagerEtag);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The IPv6 peering configuration.
     * 
     */
    @Import(name="ipv6PeeringConfig")
    private @Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig;

    public Optional<Ipv6ExpressRouteCircuitPeeringConfigResponse> ipv6PeeringConfig() {
        return Optional.ofNullable(this.ipv6PeeringConfig);
    }

    /**
     * Who was the last to modify the peering.
     * 
     */
    @Import(name="lastModifiedBy", required=true)
    private String lastModifiedBy;

    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * The Microsoft peering configuration.
     * 
     */
    @Import(name="microsoftPeeringConfig")
    private @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;

    public Optional<ExpressRouteCircuitPeeringConfigResponse> microsoftPeeringConfig() {
        return Optional.ofNullable(this.microsoftPeeringConfig);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The peer ASN.
     * 
     */
    @Import(name="peerASN")
    private @Nullable Double peerASN;

    public Optional<Double> peerASN() {
        return Optional.ofNullable(this.peerASN);
    }

    /**
     * The list of peered circuit connections associated with Azure Private Peering for this circuit.
     * 
     */
    @Import(name="peeredConnections", required=true)
    private List<PeerExpressRouteCircuitConnectionResponse> peeredConnections;

    public List<PeerExpressRouteCircuitConnectionResponse> peeredConnections() {
        return this.peeredConnections;
    }

    /**
     * The peering type.
     * 
     */
    @Import(name="peeringType")
    private @Nullable String peeringType;

    public Optional<String> peeringType() {
        return Optional.ofNullable(this.peeringType);
    }

    /**
     * The primary port.
     * 
     */
    @Import(name="primaryAzurePort")
    private @Nullable String primaryAzurePort;

    public Optional<String> primaryAzurePort() {
        return Optional.ofNullable(this.primaryAzurePort);
    }

    /**
     * The primary address prefix.
     * 
     */
    @Import(name="primaryPeerAddressPrefix")
    private @Nullable String primaryPeerAddressPrefix;

    public Optional<String> primaryPeerAddressPrefix() {
        return Optional.ofNullable(this.primaryPeerAddressPrefix);
    }

    /**
     * The provisioning state of the express route circuit peering resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The reference to the RouteFilter resource.
     * 
     */
    @Import(name="routeFilter")
    private @Nullable SubResourceResponse routeFilter;

    public Optional<SubResourceResponse> routeFilter() {
        return Optional.ofNullable(this.routeFilter);
    }

    /**
     * The secondary port.
     * 
     */
    @Import(name="secondaryAzurePort")
    private @Nullable String secondaryAzurePort;

    public Optional<String> secondaryAzurePort() {
        return Optional.ofNullable(this.secondaryAzurePort);
    }

    /**
     * The secondary address prefix.
     * 
     */
    @Import(name="secondaryPeerAddressPrefix")
    private @Nullable String secondaryPeerAddressPrefix;

    public Optional<String> secondaryPeerAddressPrefix() {
        return Optional.ofNullable(this.secondaryPeerAddressPrefix);
    }

    /**
     * The shared key.
     * 
     */
    @Import(name="sharedKey")
    private @Nullable String sharedKey;

    public Optional<String> sharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }

    /**
     * The peering state.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The peering stats of express route circuit.
     * 
     */
    @Import(name="stats")
    private @Nullable ExpressRouteCircuitStatsResponse stats;

    public Optional<ExpressRouteCircuitStatsResponse> stats() {
        return Optional.ofNullable(this.stats);
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * The VLAN ID.
     * 
     */
    @Import(name="vlanId")
    private @Nullable Integer vlanId;

    public Optional<Integer> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    private ExpressRouteCircuitPeeringResponse() {}

    private ExpressRouteCircuitPeeringResponse(ExpressRouteCircuitPeeringResponse $) {
        this.azureASN = $.azureASN;
        this.connections = $.connections;
        this.etag = $.etag;
        this.expressRouteConnection = $.expressRouteConnection;
        this.gatewayManagerEtag = $.gatewayManagerEtag;
        this.id = $.id;
        this.ipv6PeeringConfig = $.ipv6PeeringConfig;
        this.lastModifiedBy = $.lastModifiedBy;
        this.microsoftPeeringConfig = $.microsoftPeeringConfig;
        this.name = $.name;
        this.peerASN = $.peerASN;
        this.peeredConnections = $.peeredConnections;
        this.peeringType = $.peeringType;
        this.primaryAzurePort = $.primaryAzurePort;
        this.primaryPeerAddressPrefix = $.primaryPeerAddressPrefix;
        this.provisioningState = $.provisioningState;
        this.routeFilter = $.routeFilter;
        this.secondaryAzurePort = $.secondaryAzurePort;
        this.secondaryPeerAddressPrefix = $.secondaryPeerAddressPrefix;
        this.sharedKey = $.sharedKey;
        this.state = $.state;
        this.stats = $.stats;
        this.type = $.type;
        this.vlanId = $.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExpressRouteCircuitPeeringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExpressRouteCircuitPeeringResponse $;

        public Builder() {
            $ = new ExpressRouteCircuitPeeringResponse();
        }

        public Builder(ExpressRouteCircuitPeeringResponse defaults) {
            $ = new ExpressRouteCircuitPeeringResponse(Objects.requireNonNull(defaults));
        }

        public Builder azureASN(@Nullable Integer azureASN) {
            $.azureASN = azureASN;
            return this;
        }

        public Builder connections(@Nullable List<ExpressRouteCircuitConnectionResponse> connections) {
            $.connections = connections;
            return this;
        }

        public Builder connections(ExpressRouteCircuitConnectionResponse... connections) {
            return connections(List.of(connections));
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder expressRouteConnection(@Nullable ExpressRouteConnectionIdResponse expressRouteConnection) {
            $.expressRouteConnection = expressRouteConnection;
            return this;
        }

        public Builder gatewayManagerEtag(@Nullable String gatewayManagerEtag) {
            $.gatewayManagerEtag = gatewayManagerEtag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder ipv6PeeringConfig(@Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig) {
            $.ipv6PeeringConfig = ipv6PeeringConfig;
            return this;
        }

        public Builder lastModifiedBy(String lastModifiedBy) {
            $.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder microsoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig) {
            $.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder peerASN(@Nullable Double peerASN) {
            $.peerASN = peerASN;
            return this;
        }

        public Builder peeredConnections(List<PeerExpressRouteCircuitConnectionResponse> peeredConnections) {
            $.peeredConnections = peeredConnections;
            return this;
        }

        public Builder peeredConnections(PeerExpressRouteCircuitConnectionResponse... peeredConnections) {
            return peeredConnections(List.of(peeredConnections));
        }

        public Builder peeringType(@Nullable String peeringType) {
            $.peeringType = peeringType;
            return this;
        }

        public Builder primaryAzurePort(@Nullable String primaryAzurePort) {
            $.primaryAzurePort = primaryAzurePort;
            return this;
        }

        public Builder primaryPeerAddressPrefix(@Nullable String primaryPeerAddressPrefix) {
            $.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder routeFilter(@Nullable SubResourceResponse routeFilter) {
            $.routeFilter = routeFilter;
            return this;
        }

        public Builder secondaryAzurePort(@Nullable String secondaryAzurePort) {
            $.secondaryAzurePort = secondaryAzurePort;
            return this;
        }

        public Builder secondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            $.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }

        public Builder sharedKey(@Nullable String sharedKey) {
            $.sharedKey = sharedKey;
            return this;
        }

        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public Builder stats(@Nullable ExpressRouteCircuitStatsResponse stats) {
            $.stats = stats;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder vlanId(@Nullable Integer vlanId) {
            $.vlanId = vlanId;
            return this;
        }

        public ExpressRouteCircuitPeeringResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.lastModifiedBy = Objects.requireNonNull($.lastModifiedBy, "expected parameter 'lastModifiedBy' to be non-null");
            $.peeredConnections = Objects.requireNonNull($.peeredConnections, "expected parameter 'peeredConnections' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
