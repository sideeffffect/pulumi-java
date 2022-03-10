// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.RouterBgpPeerResponse;
import io.pulumi.googlenative.compute_v1.outputs.RouterBgpResponse;
import io.pulumi.googlenative.compute_v1.outputs.RouterInterfaceResponse;
import io.pulumi.googlenative.compute_v1.outputs.RouterNatResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetRouterResult {
    /**
     * BGP information specific to this router.
     * 
     */
    private final RouterBgpResponse bgp;
    /**
     * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
     * 
     */
    private final List<RouterBgpPeerResponse> bgpPeers;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments). Not currently available publicly.
     * 
     */
    private final Boolean encryptedInterconnectRouter;
    /**
     * Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
     * 
     */
    private final List<RouterInterfaceResponse> interfaces;
    /**
     * Type of resource. Always compute#router for routers.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * A list of NAT services created in this router.
     * 
     */
    private final List<RouterNatResponse> nats;
    /**
     * URI of the network to which this router belongs.
     * 
     */
    private final String network;
    /**
     * URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;

    @OutputCustomType.Constructor
    private GetRouterResult(
        @OutputCustomType.Parameter("bgp") RouterBgpResponse bgp,
        @OutputCustomType.Parameter("bgpPeers") List<RouterBgpPeerResponse> bgpPeers,
        @OutputCustomType.Parameter("creationTimestamp") String creationTimestamp,
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("encryptedInterconnectRouter") Boolean encryptedInterconnectRouter,
        @OutputCustomType.Parameter("interfaces") List<RouterInterfaceResponse> interfaces,
        @OutputCustomType.Parameter("kind") String kind,
        @OutputCustomType.Parameter("name") String name,
        @OutputCustomType.Parameter("nats") List<RouterNatResponse> nats,
        @OutputCustomType.Parameter("network") String network,
        @OutputCustomType.Parameter("region") String region,
        @OutputCustomType.Parameter("selfLink") String selfLink) {
        this.bgp = bgp;
        this.bgpPeers = bgpPeers;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.encryptedInterconnectRouter = encryptedInterconnectRouter;
        this.interfaces = interfaces;
        this.kind = kind;
        this.name = name;
        this.nats = nats;
        this.network = network;
        this.region = region;
        this.selfLink = selfLink;
    }

    /**
     * BGP information specific to this router.
     * 
    */
    public RouterBgpResponse getBgp() {
        return this.bgp;
    }
    /**
     * BGP information that must be configured into the routing stack to establish BGP peering. This information must specify the peer ASN and either the interface name, IP address, or peer IP address. Please refer to RFC4273.
     * 
    */
    public List<RouterBgpPeerResponse> getBgpPeers() {
        return this.bgpPeers;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Indicates if a router is dedicated for use with encrypted VLAN attachments (interconnectAttachments). Not currently available publicly.
     * 
    */
    public Boolean getEncryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter;
    }
    /**
     * Router interfaces. Each interface requires either one linked resource, (for example, linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.
     * 
    */
    public List<RouterInterfaceResponse> getInterfaces() {
        return this.interfaces;
    }
    /**
     * Type of resource. Always compute#router for routers.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * A list of NAT services created in this router.
     * 
    */
    public List<RouterNatResponse> getNats() {
        return this.nats;
    }
    /**
     * URI of the network to which this router belongs.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * URI of the region where the router resides. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterBgpResponse bgp;
        private List<RouterBgpPeerResponse> bgpPeers;
        private String creationTimestamp;
        private String description;
        private Boolean encryptedInterconnectRouter;
        private List<RouterInterfaceResponse> interfaces;
        private String kind;
        private String name;
        private List<RouterNatResponse> nats;
        private String network;
        private String region;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgp = defaults.bgp;
    	      this.bgpPeers = defaults.bgpPeers;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.encryptedInterconnectRouter = defaults.encryptedInterconnectRouter;
    	      this.interfaces = defaults.interfaces;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.nats = defaults.nats;
    	      this.network = defaults.network;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder bgp(RouterBgpResponse bgp) {
            this.bgp = Objects.requireNonNull(bgp);
            return this;
        }

        public Builder bgpPeers(List<RouterBgpPeerResponse> bgpPeers) {
            this.bgpPeers = Objects.requireNonNull(bgpPeers);
            return this;
        }

        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder encryptedInterconnectRouter(Boolean encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = Objects.requireNonNull(encryptedInterconnectRouter);
            return this;
        }

        public Builder interfaces(List<RouterInterfaceResponse> interfaces) {
            this.interfaces = Objects.requireNonNull(interfaces);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder nats(List<RouterNatResponse> nats) {
            this.nats = Objects.requireNonNull(nats);
            return this;
        }

        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public GetRouterResult build() {
            return new GetRouterResult(bgp, bgpPeers, creationTimestamp, description, encryptedInterconnectRouter, interfaces, kind, name, nats, network, region, selfLink);
        }
    }
}
