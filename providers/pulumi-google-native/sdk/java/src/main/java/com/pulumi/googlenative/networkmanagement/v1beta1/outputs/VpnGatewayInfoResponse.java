// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class VpnGatewayInfoResponse {
    /**
     * @return Name of a VPN gateway.
     * 
     */
    private final String displayName;
    /**
     * @return IP address of the VPN gateway.
     * 
     */
    private final String ipAddress;
    /**
     * @return URI of a Compute Engine network where the VPN gateway is configured.
     * 
     */
    private final String networkUri;
    /**
     * @return Name of a Google Cloud region where this VPN gateway is configured.
     * 
     */
    private final String region;
    /**
     * @return URI of a VPN gateway.
     * 
     */
    private final String uri;
    /**
     * @return A VPN tunnel that is associated with this VPN gateway. There may be multiple VPN tunnels configured on a VPN gateway, and only the one relevant to the test is displayed.
     * 
     */
    private final String vpnTunnelUri;

    @CustomType.Constructor
    private VpnGatewayInfoResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("networkUri") String networkUri,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("uri") String uri,
        @CustomType.Parameter("vpnTunnelUri") String vpnTunnelUri) {
        this.displayName = displayName;
        this.ipAddress = ipAddress;
        this.networkUri = networkUri;
        this.region = region;
        this.uri = uri;
        this.vpnTunnelUri = vpnTunnelUri;
    }

    /**
     * @return Name of a VPN gateway.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return IP address of the VPN gateway.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return URI of a Compute Engine network where the VPN gateway is configured.
     * 
     */
    public String networkUri() {
        return this.networkUri;
    }
    /**
     * @return Name of a Google Cloud region where this VPN gateway is configured.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return URI of a VPN gateway.
     * 
     */
    public String uri() {
        return this.uri;
    }
    /**
     * @return A VPN tunnel that is associated with this VPN gateway. There may be multiple VPN tunnels configured on a VPN gateway, and only the one relevant to the test is displayed.
     * 
     */
    public String vpnTunnelUri() {
        return this.vpnTunnelUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String ipAddress;
        private String networkUri;
        private String region;
        private String uri;
        private String vpnTunnelUri;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.networkUri = defaults.networkUri;
    	      this.region = defaults.region;
    	      this.uri = defaults.uri;
    	      this.vpnTunnelUri = defaults.vpnTunnelUri;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder vpnTunnelUri(String vpnTunnelUri) {
            this.vpnTunnelUri = Objects.requireNonNull(vpnTunnelUri);
            return this;
        }        public VpnGatewayInfoResponse build() {
            return new VpnGatewayInfoResponse(displayName, ipAddress, networkUri, region, uri, vpnTunnelUri);
        }
    }
}
