// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ExpressRouteCircuitPeeringConfigResponse;
import io.pulumi.azurenative.network.outputs.Ipv6ExpressRouteCircuitPeeringConfigResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExpressRouteCrossConnectionPeeringResult {
    /**
     * The Azure ASN.
     * 
     */
    private final Integer azureASN;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * The GatewayManager Etag.
     * 
     */
    private final @Nullable String gatewayManagerEtag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * The IPv6 peering configuration.
     * 
     */
    private final @Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig;
    /**
     * Who was the last to modify the peering.
     * 
     */
    private final String lastModifiedBy;
    /**
     * The Microsoft peering configuration.
     * 
     */
    private final @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The peer ASN.
     * 
     */
    private final @Nullable Double peerASN;
    /**
     * The peering type.
     * 
     */
    private final @Nullable String peeringType;
    /**
     * The primary port.
     * 
     */
    private final String primaryAzurePort;
    /**
     * The primary address prefix.
     * 
     */
    private final @Nullable String primaryPeerAddressPrefix;
    /**
     * The provisioning state of the express route cross connection peering resource.
     * 
     */
    private final String provisioningState;
    /**
     * The secondary port.
     * 
     */
    private final String secondaryAzurePort;
    /**
     * The secondary address prefix.
     * 
     */
    private final @Nullable String secondaryPeerAddressPrefix;
    /**
     * The shared key.
     * 
     */
    private final @Nullable String sharedKey;
    /**
     * The peering state.
     * 
     */
    private final @Nullable String state;
    /**
     * The VLAN ID.
     * 
     */
    private final @Nullable Integer vlanId;

    @OutputCustomType.Constructor
    private GetExpressRouteCrossConnectionPeeringResult(
        @OutputCustomType.Parameter("azureASN") Integer azureASN,
        @OutputCustomType.Parameter("etag") String etag,
        @OutputCustomType.Parameter("gatewayManagerEtag") @Nullable String gatewayManagerEtag,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("ipv6PeeringConfig") @Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig,
        @OutputCustomType.Parameter("lastModifiedBy") String lastModifiedBy,
        @OutputCustomType.Parameter("microsoftPeeringConfig") @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig,
        @OutputCustomType.Parameter("name") @Nullable String name,
        @OutputCustomType.Parameter("peerASN") @Nullable Double peerASN,
        @OutputCustomType.Parameter("peeringType") @Nullable String peeringType,
        @OutputCustomType.Parameter("primaryAzurePort") String primaryAzurePort,
        @OutputCustomType.Parameter("primaryPeerAddressPrefix") @Nullable String primaryPeerAddressPrefix,
        @OutputCustomType.Parameter("provisioningState") String provisioningState,
        @OutputCustomType.Parameter("secondaryAzurePort") String secondaryAzurePort,
        @OutputCustomType.Parameter("secondaryPeerAddressPrefix") @Nullable String secondaryPeerAddressPrefix,
        @OutputCustomType.Parameter("sharedKey") @Nullable String sharedKey,
        @OutputCustomType.Parameter("state") @Nullable String state,
        @OutputCustomType.Parameter("vlanId") @Nullable Integer vlanId) {
        this.azureASN = azureASN;
        this.etag = etag;
        this.gatewayManagerEtag = gatewayManagerEtag;
        this.id = id;
        this.ipv6PeeringConfig = ipv6PeeringConfig;
        this.lastModifiedBy = lastModifiedBy;
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        this.name = name;
        this.peerASN = peerASN;
        this.peeringType = peeringType;
        this.primaryAzurePort = primaryAzurePort;
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        this.provisioningState = provisioningState;
        this.secondaryAzurePort = secondaryAzurePort;
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        this.sharedKey = sharedKey;
        this.state = state;
        this.vlanId = vlanId;
    }

    /**
     * The Azure ASN.
     * 
    */
    public Integer getAzureASN() {
        return this.azureASN;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The GatewayManager Etag.
     * 
    */
    public Optional<String> getGatewayManagerEtag() {
        return Optional.ofNullable(this.gatewayManagerEtag);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The IPv6 peering configuration.
     * 
    */
    public Optional<Ipv6ExpressRouteCircuitPeeringConfigResponse> getIpv6PeeringConfig() {
        return Optional.ofNullable(this.ipv6PeeringConfig);
    }
    /**
     * Who was the last to modify the peering.
     * 
    */
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * The Microsoft peering configuration.
     * 
    */
    public Optional<ExpressRouteCircuitPeeringConfigResponse> getMicrosoftPeeringConfig() {
        return Optional.ofNullable(this.microsoftPeeringConfig);
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The peer ASN.
     * 
    */
    public Optional<Double> getPeerASN() {
        return Optional.ofNullable(this.peerASN);
    }
    /**
     * The peering type.
     * 
    */
    public Optional<String> getPeeringType() {
        return Optional.ofNullable(this.peeringType);
    }
    /**
     * The primary port.
     * 
    */
    public String getPrimaryAzurePort() {
        return this.primaryAzurePort;
    }
    /**
     * The primary address prefix.
     * 
    */
    public Optional<String> getPrimaryPeerAddressPrefix() {
        return Optional.ofNullable(this.primaryPeerAddressPrefix);
    }
    /**
     * The provisioning state of the express route cross connection peering resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The secondary port.
     * 
    */
    public String getSecondaryAzurePort() {
        return this.secondaryAzurePort;
    }
    /**
     * The secondary address prefix.
     * 
    */
    public Optional<String> getSecondaryPeerAddressPrefix() {
        return Optional.ofNullable(this.secondaryPeerAddressPrefix);
    }
    /**
     * The shared key.
     * 
    */
    public Optional<String> getSharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }
    /**
     * The peering state.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The VLAN ID.
     * 
    */
    public Optional<Integer> getVlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExpressRouteCrossConnectionPeeringResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer azureASN;
        private String etag;
        private @Nullable String gatewayManagerEtag;
        private @Nullable String id;
        private @Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig;
        private String lastModifiedBy;
        private @Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig;
        private @Nullable String name;
        private @Nullable Double peerASN;
        private @Nullable String peeringType;
        private String primaryAzurePort;
        private @Nullable String primaryPeerAddressPrefix;
        private String provisioningState;
        private String secondaryAzurePort;
        private @Nullable String secondaryPeerAddressPrefix;
        private @Nullable String sharedKey;
        private @Nullable String state;
        private @Nullable Integer vlanId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExpressRouteCrossConnectionPeeringResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureASN = defaults.azureASN;
    	      this.etag = defaults.etag;
    	      this.gatewayManagerEtag = defaults.gatewayManagerEtag;
    	      this.id = defaults.id;
    	      this.ipv6PeeringConfig = defaults.ipv6PeeringConfig;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.microsoftPeeringConfig = defaults.microsoftPeeringConfig;
    	      this.name = defaults.name;
    	      this.peerASN = defaults.peerASN;
    	      this.peeringType = defaults.peeringType;
    	      this.primaryAzurePort = defaults.primaryAzurePort;
    	      this.primaryPeerAddressPrefix = defaults.primaryPeerAddressPrefix;
    	      this.provisioningState = defaults.provisioningState;
    	      this.secondaryAzurePort = defaults.secondaryAzurePort;
    	      this.secondaryPeerAddressPrefix = defaults.secondaryPeerAddressPrefix;
    	      this.sharedKey = defaults.sharedKey;
    	      this.state = defaults.state;
    	      this.vlanId = defaults.vlanId;
        }

        public Builder azureASN(Integer azureASN) {
            this.azureASN = Objects.requireNonNull(azureASN);
            return this;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder gatewayManagerEtag(@Nullable String gatewayManagerEtag) {
            this.gatewayManagerEtag = gatewayManagerEtag;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder ipv6PeeringConfig(@Nullable Ipv6ExpressRouteCircuitPeeringConfigResponse ipv6PeeringConfig) {
            this.ipv6PeeringConfig = ipv6PeeringConfig;
            return this;
        }

        public Builder lastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }

        public Builder microsoftPeeringConfig(@Nullable ExpressRouteCircuitPeeringConfigResponse microsoftPeeringConfig) {
            this.microsoftPeeringConfig = microsoftPeeringConfig;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder peerASN(@Nullable Double peerASN) {
            this.peerASN = peerASN;
            return this;
        }

        public Builder peeringType(@Nullable String peeringType) {
            this.peeringType = peeringType;
            return this;
        }

        public Builder primaryAzurePort(String primaryAzurePort) {
            this.primaryAzurePort = Objects.requireNonNull(primaryAzurePort);
            return this;
        }

        public Builder primaryPeerAddressPrefix(@Nullable String primaryPeerAddressPrefix) {
            this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder secondaryAzurePort(String secondaryAzurePort) {
            this.secondaryAzurePort = Objects.requireNonNull(secondaryAzurePort);
            return this;
        }

        public Builder secondaryPeerAddressPrefix(@Nullable String secondaryPeerAddressPrefix) {
            this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
            return this;
        }

        public Builder sharedKey(@Nullable String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder vlanId(@Nullable Integer vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public GetExpressRouteCrossConnectionPeeringResult build() {
            return new GetExpressRouteCrossConnectionPeeringResult(azureASN, etag, gatewayManagerEtag, id, ipv6PeeringConfig, lastModifiedBy, microsoftPeeringConfig, name, peerASN, peeringType, primaryAzurePort, primaryPeerAddressPrefix, provisioningState, secondaryAzurePort, secondaryPeerAddressPrefix, sharedKey, state, vlanId);
        }
    }
}
