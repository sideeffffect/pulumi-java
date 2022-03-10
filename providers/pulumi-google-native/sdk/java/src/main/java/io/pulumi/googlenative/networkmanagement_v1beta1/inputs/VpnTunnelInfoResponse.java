// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Compute Engine VPN tunnel.
 * 
 */
public final class VpnTunnelInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpnTunnelInfoResponse Empty = new VpnTunnelInfoResponse();

    /**
     * Name of a VPN tunnel.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * URI of a Compute Engine network where the VPN tunnel is configured.
     * 
     */
    @InputImport(name="networkUri", required=true)
      private final String networkUri;

    public String getNetworkUri() {
        return this.networkUri;
    }

    /**
     * Name of a Google Cloud region where this VPN tunnel is configured.
     * 
     */
    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    /**
     * URI of a VPN gateway at remote end of the tunnel.
     * 
     */
    @InputImport(name="remoteGateway", required=true)
      private final String remoteGateway;

    public String getRemoteGateway() {
        return this.remoteGateway;
    }

    /**
     * Remote VPN gateway's IP address.
     * 
     */
    @InputImport(name="remoteGatewayIp", required=true)
      private final String remoteGatewayIp;

    public String getRemoteGatewayIp() {
        return this.remoteGatewayIp;
    }

    /**
     * Type of the routing policy.
     * 
     */
    @InputImport(name="routingType", required=true)
      private final String routingType;

    public String getRoutingType() {
        return this.routingType;
    }

    /**
     * URI of the VPN gateway at local end of the tunnel.
     * 
     */
    @InputImport(name="sourceGateway", required=true)
      private final String sourceGateway;

    public String getSourceGateway() {
        return this.sourceGateway;
    }

    /**
     * Local VPN gateway's IP address.
     * 
     */
    @InputImport(name="sourceGatewayIp", required=true)
      private final String sourceGatewayIp;

    public String getSourceGatewayIp() {
        return this.sourceGatewayIp;
    }

    /**
     * URI of a VPN tunnel.
     * 
     */
    @InputImport(name="uri", required=true)
      private final String uri;

    public String getUri() {
        return this.uri;
    }

    public VpnTunnelInfoResponse(
        String displayName,
        String networkUri,
        String region,
        String remoteGateway,
        String remoteGatewayIp,
        String routingType,
        String sourceGateway,
        String sourceGatewayIp,
        String uri) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.networkUri = Objects.requireNonNull(networkUri, "expected parameter 'networkUri' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.remoteGateway = Objects.requireNonNull(remoteGateway, "expected parameter 'remoteGateway' to be non-null");
        this.remoteGatewayIp = Objects.requireNonNull(remoteGatewayIp, "expected parameter 'remoteGatewayIp' to be non-null");
        this.routingType = Objects.requireNonNull(routingType, "expected parameter 'routingType' to be non-null");
        this.sourceGateway = Objects.requireNonNull(sourceGateway, "expected parameter 'sourceGateway' to be non-null");
        this.sourceGatewayIp = Objects.requireNonNull(sourceGatewayIp, "expected parameter 'sourceGatewayIp' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private VpnTunnelInfoResponse() {
        this.displayName = null;
        this.networkUri = null;
        this.region = null;
        this.remoteGateway = null;
        this.remoteGatewayIp = null;
        this.routingType = null;
        this.sourceGateway = null;
        this.sourceGatewayIp = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnTunnelInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String networkUri;
        private String region;
        private String remoteGateway;
        private String remoteGatewayIp;
        private String routingType;
        private String sourceGateway;
        private String sourceGatewayIp;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnTunnelInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.networkUri = defaults.networkUri;
    	      this.region = defaults.region;
    	      this.remoteGateway = defaults.remoteGateway;
    	      this.remoteGatewayIp = defaults.remoteGatewayIp;
    	      this.routingType = defaults.routingType;
    	      this.sourceGateway = defaults.sourceGateway;
    	      this.sourceGatewayIp = defaults.sourceGatewayIp;
    	      this.uri = defaults.uri;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
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

        public Builder remoteGateway(String remoteGateway) {
            this.remoteGateway = Objects.requireNonNull(remoteGateway);
            return this;
        }

        public Builder remoteGatewayIp(String remoteGatewayIp) {
            this.remoteGatewayIp = Objects.requireNonNull(remoteGatewayIp);
            return this;
        }

        public Builder routingType(String routingType) {
            this.routingType = Objects.requireNonNull(routingType);
            return this;
        }

        public Builder sourceGateway(String sourceGateway) {
            this.sourceGateway = Objects.requireNonNull(sourceGateway);
            return this;
        }

        public Builder sourceGatewayIp(String sourceGatewayIp) {
            this.sourceGatewayIp = Objects.requireNonNull(sourceGatewayIp);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public VpnTunnelInfoResponse build() {
            return new VpnTunnelInfoResponse(displayName, networkUri, region, remoteGateway, remoteGatewayIp, routingType, sourceGateway, sourceGatewayIp, uri);
        }
    }
}
