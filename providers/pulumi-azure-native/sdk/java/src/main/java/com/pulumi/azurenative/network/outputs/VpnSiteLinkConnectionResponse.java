// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnSiteLinkConnectionResponse {
    /**
     * Expected bandwidth in MBPS.
     * 
     */
    private final @Nullable Integer connectionBandwidth;
    /**
     * The connection status.
     * 
     */
    private final String connectionStatus;
    /**
     * Egress bytes transferred.
     * 
     */
    private final Double egressBytesTransferred;
    /**
     * List of egress NatRules.
     * 
     */
    private final @Nullable List<SubResourceResponse> egressNatRules;
    /**
     * EnableBgp flag.
     * 
     */
    private final @Nullable Boolean enableBgp;
    /**
     * EnableBgp flag.
     * 
     */
    private final @Nullable Boolean enableRateLimiting;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Ingress bytes transferred.
     * 
     */
    private final Double ingressBytesTransferred;
    /**
     * List of ingress NatRules.
     * 
     */
    private final @Nullable List<SubResourceResponse> ingressNatRules;
    /**
     * The IPSec Policies to be considered by this connection.
     * 
     */
    private final @Nullable List<IpsecPolicyResponse> ipsecPolicies;
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * The provisioning state of the VPN site link connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * Routing weight for vpn connection.
     * 
     */
    private final @Nullable Integer routingWeight;
    /**
     * SharedKey for the vpn connection.
     * 
     */
    private final @Nullable String sharedKey;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Use local azure ip to initiate connection.
     * 
     */
    private final @Nullable Boolean useLocalAzureIpAddress;
    /**
     * Enable policy-based traffic selectors.
     * 
     */
    private final @Nullable Boolean usePolicyBasedTrafficSelectors;
    /**
     * Connection protocol used for this connection.
     * 
     */
    private final @Nullable String vpnConnectionProtocolType;
    /**
     * Vpn link connection mode.
     * 
     */
    private final @Nullable String vpnLinkConnectionMode;
    /**
     * Id of the connected vpn site link.
     * 
     */
    private final @Nullable SubResourceResponse vpnSiteLink;

    @CustomType.Constructor
    private VpnSiteLinkConnectionResponse(
        @CustomType.Parameter("connectionBandwidth") @Nullable Integer connectionBandwidth,
        @CustomType.Parameter("connectionStatus") String connectionStatus,
        @CustomType.Parameter("egressBytesTransferred") Double egressBytesTransferred,
        @CustomType.Parameter("egressNatRules") @Nullable List<SubResourceResponse> egressNatRules,
        @CustomType.Parameter("enableBgp") @Nullable Boolean enableBgp,
        @CustomType.Parameter("enableRateLimiting") @Nullable Boolean enableRateLimiting,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ingressBytesTransferred") Double ingressBytesTransferred,
        @CustomType.Parameter("ingressNatRules") @Nullable List<SubResourceResponse> ingressNatRules,
        @CustomType.Parameter("ipsecPolicies") @Nullable List<IpsecPolicyResponse> ipsecPolicies,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("routingWeight") @Nullable Integer routingWeight,
        @CustomType.Parameter("sharedKey") @Nullable String sharedKey,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("useLocalAzureIpAddress") @Nullable Boolean useLocalAzureIpAddress,
        @CustomType.Parameter("usePolicyBasedTrafficSelectors") @Nullable Boolean usePolicyBasedTrafficSelectors,
        @CustomType.Parameter("vpnConnectionProtocolType") @Nullable String vpnConnectionProtocolType,
        @CustomType.Parameter("vpnLinkConnectionMode") @Nullable String vpnLinkConnectionMode,
        @CustomType.Parameter("vpnSiteLink") @Nullable SubResourceResponse vpnSiteLink) {
        this.connectionBandwidth = connectionBandwidth;
        this.connectionStatus = connectionStatus;
        this.egressBytesTransferred = egressBytesTransferred;
        this.egressNatRules = egressNatRules;
        this.enableBgp = enableBgp;
        this.enableRateLimiting = enableRateLimiting;
        this.etag = etag;
        this.id = id;
        this.ingressBytesTransferred = ingressBytesTransferred;
        this.ingressNatRules = ingressNatRules;
        this.ipsecPolicies = ipsecPolicies;
        this.name = name;
        this.provisioningState = provisioningState;
        this.routingWeight = routingWeight;
        this.sharedKey = sharedKey;
        this.type = type;
        this.useLocalAzureIpAddress = useLocalAzureIpAddress;
        this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
        this.vpnConnectionProtocolType = vpnConnectionProtocolType;
        this.vpnLinkConnectionMode = vpnLinkConnectionMode;
        this.vpnSiteLink = vpnSiteLink;
    }

    /**
     * Expected bandwidth in MBPS.
     * 
    */
    public Optional<Integer> connectionBandwidth() {
        return Optional.ofNullable(this.connectionBandwidth);
    }
    /**
     * The connection status.
     * 
    */
    public String connectionStatus() {
        return this.connectionStatus;
    }
    /**
     * Egress bytes transferred.
     * 
    */
    public Double egressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * List of egress NatRules.
     * 
    */
    public List<SubResourceResponse> egressNatRules() {
        return this.egressNatRules == null ? List.of() : this.egressNatRules;
    }
    /**
     * EnableBgp flag.
     * 
    */
    public Optional<Boolean> enableBgp() {
        return Optional.ofNullable(this.enableBgp);
    }
    /**
     * EnableBgp flag.
     * 
    */
    public Optional<Boolean> enableRateLimiting() {
        return Optional.ofNullable(this.enableRateLimiting);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Ingress bytes transferred.
     * 
    */
    public Double ingressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * List of ingress NatRules.
     * 
    */
    public List<SubResourceResponse> ingressNatRules() {
        return this.ingressNatRules == null ? List.of() : this.ingressNatRules;
    }
    /**
     * The IPSec Policies to be considered by this connection.
     * 
    */
    public List<IpsecPolicyResponse> ipsecPolicies() {
        return this.ipsecPolicies == null ? List.of() : this.ipsecPolicies;
    }
    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The provisioning state of the VPN site link connection resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Routing weight for vpn connection.
     * 
    */
    public Optional<Integer> routingWeight() {
        return Optional.ofNullable(this.routingWeight);
    }
    /**
     * SharedKey for the vpn connection.
     * 
    */
    public Optional<String> sharedKey() {
        return Optional.ofNullable(this.sharedKey);
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Use local azure ip to initiate connection.
     * 
    */
    public Optional<Boolean> useLocalAzureIpAddress() {
        return Optional.ofNullable(this.useLocalAzureIpAddress);
    }
    /**
     * Enable policy-based traffic selectors.
     * 
    */
    public Optional<Boolean> usePolicyBasedTrafficSelectors() {
        return Optional.ofNullable(this.usePolicyBasedTrafficSelectors);
    }
    /**
     * Connection protocol used for this connection.
     * 
    */
    public Optional<String> vpnConnectionProtocolType() {
        return Optional.ofNullable(this.vpnConnectionProtocolType);
    }
    /**
     * Vpn link connection mode.
     * 
    */
    public Optional<String> vpnLinkConnectionMode() {
        return Optional.ofNullable(this.vpnLinkConnectionMode);
    }
    /**
     * Id of the connected vpn site link.
     * 
    */
    public Optional<SubResourceResponse> vpnSiteLink() {
        return Optional.ofNullable(this.vpnSiteLink);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnSiteLinkConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer connectionBandwidth;
        private String connectionStatus;
        private Double egressBytesTransferred;
        private @Nullable List<SubResourceResponse> egressNatRules;
        private @Nullable Boolean enableBgp;
        private @Nullable Boolean enableRateLimiting;
        private String etag;
        private @Nullable String id;
        private Double ingressBytesTransferred;
        private @Nullable List<SubResourceResponse> ingressNatRules;
        private @Nullable List<IpsecPolicyResponse> ipsecPolicies;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable Integer routingWeight;
        private @Nullable String sharedKey;
        private String type;
        private @Nullable Boolean useLocalAzureIpAddress;
        private @Nullable Boolean usePolicyBasedTrafficSelectors;
        private @Nullable String vpnConnectionProtocolType;
        private @Nullable String vpnLinkConnectionMode;
        private @Nullable SubResourceResponse vpnSiteLink;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnSiteLinkConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionBandwidth = defaults.connectionBandwidth;
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.egressNatRules = defaults.egressNatRules;
    	      this.enableBgp = defaults.enableBgp;
    	      this.enableRateLimiting = defaults.enableRateLimiting;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ingressNatRules = defaults.ingressNatRules;
    	      this.ipsecPolicies = defaults.ipsecPolicies;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.routingWeight = defaults.routingWeight;
    	      this.sharedKey = defaults.sharedKey;
    	      this.type = defaults.type;
    	      this.useLocalAzureIpAddress = defaults.useLocalAzureIpAddress;
    	      this.usePolicyBasedTrafficSelectors = defaults.usePolicyBasedTrafficSelectors;
    	      this.vpnConnectionProtocolType = defaults.vpnConnectionProtocolType;
    	      this.vpnLinkConnectionMode = defaults.vpnLinkConnectionMode;
    	      this.vpnSiteLink = defaults.vpnSiteLink;
        }

        public Builder connectionBandwidth(@Nullable Integer connectionBandwidth) {
            this.connectionBandwidth = connectionBandwidth;
            return this;
        }
        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }
        public Builder egressBytesTransferred(Double egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }
        public Builder egressNatRules(@Nullable List<SubResourceResponse> egressNatRules) {
            this.egressNatRules = egressNatRules;
            return this;
        }
        public Builder egressNatRules(SubResourceResponse... egressNatRules) {
            return egressNatRules(List.of(egressNatRules));
        }
        public Builder enableBgp(@Nullable Boolean enableBgp) {
            this.enableBgp = enableBgp;
            return this;
        }
        public Builder enableRateLimiting(@Nullable Boolean enableRateLimiting) {
            this.enableRateLimiting = enableRateLimiting;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ingressBytesTransferred(Double ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }
        public Builder ingressNatRules(@Nullable List<SubResourceResponse> ingressNatRules) {
            this.ingressNatRules = ingressNatRules;
            return this;
        }
        public Builder ingressNatRules(SubResourceResponse... ingressNatRules) {
            return ingressNatRules(List.of(ingressNatRules));
        }
        public Builder ipsecPolicies(@Nullable List<IpsecPolicyResponse> ipsecPolicies) {
            this.ipsecPolicies = ipsecPolicies;
            return this;
        }
        public Builder ipsecPolicies(IpsecPolicyResponse... ipsecPolicies) {
            return ipsecPolicies(List.of(ipsecPolicies));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder routingWeight(@Nullable Integer routingWeight) {
            this.routingWeight = routingWeight;
            return this;
        }
        public Builder sharedKey(@Nullable String sharedKey) {
            this.sharedKey = sharedKey;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useLocalAzureIpAddress(@Nullable Boolean useLocalAzureIpAddress) {
            this.useLocalAzureIpAddress = useLocalAzureIpAddress;
            return this;
        }
        public Builder usePolicyBasedTrafficSelectors(@Nullable Boolean usePolicyBasedTrafficSelectors) {
            this.usePolicyBasedTrafficSelectors = usePolicyBasedTrafficSelectors;
            return this;
        }
        public Builder vpnConnectionProtocolType(@Nullable String vpnConnectionProtocolType) {
            this.vpnConnectionProtocolType = vpnConnectionProtocolType;
            return this;
        }
        public Builder vpnLinkConnectionMode(@Nullable String vpnLinkConnectionMode) {
            this.vpnLinkConnectionMode = vpnLinkConnectionMode;
            return this;
        }
        public Builder vpnSiteLink(@Nullable SubResourceResponse vpnSiteLink) {
            this.vpnSiteLink = vpnSiteLink;
            return this;
        }        public VpnSiteLinkConnectionResponse build() {
            return new VpnSiteLinkConnectionResponse(connectionBandwidth, connectionStatus, egressBytesTransferred, egressNatRules, enableBgp, enableRateLimiting, etag, id, ingressBytesTransferred, ingressNatRules, ipsecPolicies, name, provisioningState, routingWeight, sharedKey, type, useLocalAzureIpAddress, usePolicyBasedTrafficSelectors, vpnConnectionProtocolType, vpnLinkConnectionMode, vpnSiteLink);
        }
    }
}
