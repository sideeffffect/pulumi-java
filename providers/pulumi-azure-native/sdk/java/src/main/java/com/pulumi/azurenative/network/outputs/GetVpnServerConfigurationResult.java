// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.AadAuthenticationParametersResponse;
import com.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import com.pulumi.azurenative.network.outputs.P2SVpnGatewayResponse;
import com.pulumi.azurenative.network.outputs.RadiusServerResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigRadiusClientRootCertificateResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigRadiusServerRootCertificateResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigVpnClientRevokedCertificateResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigVpnClientRootCertificateResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpnServerConfigurationResult {
    /**
     * @return The set of aad vpn authentication parameters.
     * 
     */
    private final @Nullable AadAuthenticationParametersResponse aadAuthenticationParameters;
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return List of references to P2SVpnGateways.
     * 
     */
    private final List<P2SVpnGatewayResponse> p2SVpnGateways;
    /**
     * @return The provisioning state of the VpnServerConfiguration resource. Possible values are: &#39;Updating&#39;, &#39;Deleting&#39;, and &#39;Failed&#39;.
     * 
     */
    private final String provisioningState;
    /**
     * @return Radius client root certificate of VpnServerConfiguration.
     * 
     */
    private final @Nullable List<VpnServerConfigRadiusClientRootCertificateResponse> radiusClientRootCertificates;
    /**
     * @return The radius server address property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    private final @Nullable String radiusServerAddress;
    /**
     * @return Radius Server root certificate of VpnServerConfiguration.
     * 
     */
    private final @Nullable List<VpnServerConfigRadiusServerRootCertificateResponse> radiusServerRootCertificates;
    /**
     * @return The radius secret property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    private final @Nullable String radiusServerSecret;
    /**
     * @return Multiple Radius Server configuration for VpnServerConfiguration.
     * 
     */
    private final @Nullable List<RadiusServerResponse> radiusServers;
    /**
     * @return Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type.
     * 
     */
    private final String type;
    /**
     * @return VPN authentication types for the VpnServerConfiguration.
     * 
     */
    private final @Nullable List<String> vpnAuthenticationTypes;
    /**
     * @return VpnClientIpsecPolicies for VpnServerConfiguration.
     * 
     */
    private final @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies;
    /**
     * @return VPN client revoked certificate of VpnServerConfiguration.
     * 
     */
    private final @Nullable List<VpnServerConfigVpnClientRevokedCertificateResponse> vpnClientRevokedCertificates;
    /**
     * @return VPN client root certificate of VpnServerConfiguration.
     * 
     */
    private final @Nullable List<VpnServerConfigVpnClientRootCertificateResponse> vpnClientRootCertificates;
    /**
     * @return VPN protocols for the VpnServerConfiguration.
     * 
     */
    private final @Nullable List<String> vpnProtocols;

    @CustomType.Constructor
    private GetVpnServerConfigurationResult(
        @CustomType.Parameter("aadAuthenticationParameters") @Nullable AadAuthenticationParametersResponse aadAuthenticationParameters,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("p2SVpnGateways") List<P2SVpnGatewayResponse> p2SVpnGateways,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("radiusClientRootCertificates") @Nullable List<VpnServerConfigRadiusClientRootCertificateResponse> radiusClientRootCertificates,
        @CustomType.Parameter("radiusServerAddress") @Nullable String radiusServerAddress,
        @CustomType.Parameter("radiusServerRootCertificates") @Nullable List<VpnServerConfigRadiusServerRootCertificateResponse> radiusServerRootCertificates,
        @CustomType.Parameter("radiusServerSecret") @Nullable String radiusServerSecret,
        @CustomType.Parameter("radiusServers") @Nullable List<RadiusServerResponse> radiusServers,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("vpnAuthenticationTypes") @Nullable List<String> vpnAuthenticationTypes,
        @CustomType.Parameter("vpnClientIpsecPolicies") @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies,
        @CustomType.Parameter("vpnClientRevokedCertificates") @Nullable List<VpnServerConfigVpnClientRevokedCertificateResponse> vpnClientRevokedCertificates,
        @CustomType.Parameter("vpnClientRootCertificates") @Nullable List<VpnServerConfigVpnClientRootCertificateResponse> vpnClientRootCertificates,
        @CustomType.Parameter("vpnProtocols") @Nullable List<String> vpnProtocols) {
        this.aadAuthenticationParameters = aadAuthenticationParameters;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.p2SVpnGateways = p2SVpnGateways;
        this.provisioningState = provisioningState;
        this.radiusClientRootCertificates = radiusClientRootCertificates;
        this.radiusServerAddress = radiusServerAddress;
        this.radiusServerRootCertificates = radiusServerRootCertificates;
        this.radiusServerSecret = radiusServerSecret;
        this.radiusServers = radiusServers;
        this.tags = tags;
        this.type = type;
        this.vpnAuthenticationTypes = vpnAuthenticationTypes;
        this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        this.vpnProtocols = vpnProtocols;
    }

    /**
     * @return The set of aad vpn authentication parameters.
     * 
     */
    public Optional<AadAuthenticationParametersResponse> aadAuthenticationParameters() {
        return Optional.ofNullable(this.aadAuthenticationParameters);
    }
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return List of references to P2SVpnGateways.
     * 
     */
    public List<P2SVpnGatewayResponse> p2SVpnGateways() {
        return this.p2SVpnGateways;
    }
    /**
     * @return The provisioning state of the VpnServerConfiguration resource. Possible values are: &#39;Updating&#39;, &#39;Deleting&#39;, and &#39;Failed&#39;.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Radius client root certificate of VpnServerConfiguration.
     * 
     */
    public List<VpnServerConfigRadiusClientRootCertificateResponse> radiusClientRootCertificates() {
        return this.radiusClientRootCertificates == null ? List.of() : this.radiusClientRootCertificates;
    }
    /**
     * @return The radius server address property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    public Optional<String> radiusServerAddress() {
        return Optional.ofNullable(this.radiusServerAddress);
    }
    /**
     * @return Radius Server root certificate of VpnServerConfiguration.
     * 
     */
    public List<VpnServerConfigRadiusServerRootCertificateResponse> radiusServerRootCertificates() {
        return this.radiusServerRootCertificates == null ? List.of() : this.radiusServerRootCertificates;
    }
    /**
     * @return The radius secret property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    public Optional<String> radiusServerSecret() {
        return Optional.ofNullable(this.radiusServerSecret);
    }
    /**
     * @return Multiple Radius Server configuration for VpnServerConfiguration.
     * 
     */
    public List<RadiusServerResponse> radiusServers() {
        return this.radiusServers == null ? List.of() : this.radiusServers;
    }
    /**
     * @return Resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return VPN authentication types for the VpnServerConfiguration.
     * 
     */
    public List<String> vpnAuthenticationTypes() {
        return this.vpnAuthenticationTypes == null ? List.of() : this.vpnAuthenticationTypes;
    }
    /**
     * @return VpnClientIpsecPolicies for VpnServerConfiguration.
     * 
     */
    public List<IpsecPolicyResponse> vpnClientIpsecPolicies() {
        return this.vpnClientIpsecPolicies == null ? List.of() : this.vpnClientIpsecPolicies;
    }
    /**
     * @return VPN client revoked certificate of VpnServerConfiguration.
     * 
     */
    public List<VpnServerConfigVpnClientRevokedCertificateResponse> vpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates == null ? List.of() : this.vpnClientRevokedCertificates;
    }
    /**
     * @return VPN client root certificate of VpnServerConfiguration.
     * 
     */
    public List<VpnServerConfigVpnClientRootCertificateResponse> vpnClientRootCertificates() {
        return this.vpnClientRootCertificates == null ? List.of() : this.vpnClientRootCertificates;
    }
    /**
     * @return VPN protocols for the VpnServerConfiguration.
     * 
     */
    public List<String> vpnProtocols() {
        return this.vpnProtocols == null ? List.of() : this.vpnProtocols;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpnServerConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AadAuthenticationParametersResponse aadAuthenticationParameters;
        private String etag;
        private @Nullable String id;
        private @Nullable String location;
        private String name;
        private List<P2SVpnGatewayResponse> p2SVpnGateways;
        private String provisioningState;
        private @Nullable List<VpnServerConfigRadiusClientRootCertificateResponse> radiusClientRootCertificates;
        private @Nullable String radiusServerAddress;
        private @Nullable List<VpnServerConfigRadiusServerRootCertificateResponse> radiusServerRootCertificates;
        private @Nullable String radiusServerSecret;
        private @Nullable List<RadiusServerResponse> radiusServers;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable List<String> vpnAuthenticationTypes;
        private @Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies;
        private @Nullable List<VpnServerConfigVpnClientRevokedCertificateResponse> vpnClientRevokedCertificates;
        private @Nullable List<VpnServerConfigVpnClientRootCertificateResponse> vpnClientRootCertificates;
        private @Nullable List<String> vpnProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpnServerConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadAuthenticationParameters = defaults.aadAuthenticationParameters;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.p2SVpnGateways = defaults.p2SVpnGateways;
    	      this.provisioningState = defaults.provisioningState;
    	      this.radiusClientRootCertificates = defaults.radiusClientRootCertificates;
    	      this.radiusServerAddress = defaults.radiusServerAddress;
    	      this.radiusServerRootCertificates = defaults.radiusServerRootCertificates;
    	      this.radiusServerSecret = defaults.radiusServerSecret;
    	      this.radiusServers = defaults.radiusServers;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vpnAuthenticationTypes = defaults.vpnAuthenticationTypes;
    	      this.vpnClientIpsecPolicies = defaults.vpnClientIpsecPolicies;
    	      this.vpnClientRevokedCertificates = defaults.vpnClientRevokedCertificates;
    	      this.vpnClientRootCertificates = defaults.vpnClientRootCertificates;
    	      this.vpnProtocols = defaults.vpnProtocols;
        }

        public Builder aadAuthenticationParameters(@Nullable AadAuthenticationParametersResponse aadAuthenticationParameters) {
            this.aadAuthenticationParameters = aadAuthenticationParameters;
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
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder p2SVpnGateways(List<P2SVpnGatewayResponse> p2SVpnGateways) {
            this.p2SVpnGateways = Objects.requireNonNull(p2SVpnGateways);
            return this;
        }
        public Builder p2SVpnGateways(P2SVpnGatewayResponse... p2SVpnGateways) {
            return p2SVpnGateways(List.of(p2SVpnGateways));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder radiusClientRootCertificates(@Nullable List<VpnServerConfigRadiusClientRootCertificateResponse> radiusClientRootCertificates) {
            this.radiusClientRootCertificates = radiusClientRootCertificates;
            return this;
        }
        public Builder radiusClientRootCertificates(VpnServerConfigRadiusClientRootCertificateResponse... radiusClientRootCertificates) {
            return radiusClientRootCertificates(List.of(radiusClientRootCertificates));
        }
        public Builder radiusServerAddress(@Nullable String radiusServerAddress) {
            this.radiusServerAddress = radiusServerAddress;
            return this;
        }
        public Builder radiusServerRootCertificates(@Nullable List<VpnServerConfigRadiusServerRootCertificateResponse> radiusServerRootCertificates) {
            this.radiusServerRootCertificates = radiusServerRootCertificates;
            return this;
        }
        public Builder radiusServerRootCertificates(VpnServerConfigRadiusServerRootCertificateResponse... radiusServerRootCertificates) {
            return radiusServerRootCertificates(List.of(radiusServerRootCertificates));
        }
        public Builder radiusServerSecret(@Nullable String radiusServerSecret) {
            this.radiusServerSecret = radiusServerSecret;
            return this;
        }
        public Builder radiusServers(@Nullable List<RadiusServerResponse> radiusServers) {
            this.radiusServers = radiusServers;
            return this;
        }
        public Builder radiusServers(RadiusServerResponse... radiusServers) {
            return radiusServers(List.of(radiusServers));
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder vpnAuthenticationTypes(@Nullable List<String> vpnAuthenticationTypes) {
            this.vpnAuthenticationTypes = vpnAuthenticationTypes;
            return this;
        }
        public Builder vpnAuthenticationTypes(String... vpnAuthenticationTypes) {
            return vpnAuthenticationTypes(List.of(vpnAuthenticationTypes));
        }
        public Builder vpnClientIpsecPolicies(@Nullable List<IpsecPolicyResponse> vpnClientIpsecPolicies) {
            this.vpnClientIpsecPolicies = vpnClientIpsecPolicies;
            return this;
        }
        public Builder vpnClientIpsecPolicies(IpsecPolicyResponse... vpnClientIpsecPolicies) {
            return vpnClientIpsecPolicies(List.of(vpnClientIpsecPolicies));
        }
        public Builder vpnClientRevokedCertificates(@Nullable List<VpnServerConfigVpnClientRevokedCertificateResponse> vpnClientRevokedCertificates) {
            this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
            return this;
        }
        public Builder vpnClientRevokedCertificates(VpnServerConfigVpnClientRevokedCertificateResponse... vpnClientRevokedCertificates) {
            return vpnClientRevokedCertificates(List.of(vpnClientRevokedCertificates));
        }
        public Builder vpnClientRootCertificates(@Nullable List<VpnServerConfigVpnClientRootCertificateResponse> vpnClientRootCertificates) {
            this.vpnClientRootCertificates = vpnClientRootCertificates;
            return this;
        }
        public Builder vpnClientRootCertificates(VpnServerConfigVpnClientRootCertificateResponse... vpnClientRootCertificates) {
            return vpnClientRootCertificates(List.of(vpnClientRootCertificates));
        }
        public Builder vpnProtocols(@Nullable List<String> vpnProtocols) {
            this.vpnProtocols = vpnProtocols;
            return this;
        }
        public Builder vpnProtocols(String... vpnProtocols) {
            return vpnProtocols(List.of(vpnProtocols));
        }        public GetVpnServerConfigurationResult build() {
            return new GetVpnServerConfigurationResult(aadAuthenticationParameters, etag, id, location, name, p2SVpnGateways, provisioningState, radiusClientRootCertificates, radiusServerAddress, radiusServerRootCertificates, radiusServerSecret, radiusServers, tags, type, vpnAuthenticationTypes, vpnClientIpsecPolicies, vpnClientRevokedCertificates, vpnClientRootCertificates, vpnProtocols);
        }
    }
}
